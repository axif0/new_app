package p340io.realm.internal;

import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p340io.realm.C5672i0;
import p340io.realm.internal.OsRealmConfig;
import p340io.realm.internal.OsResults;
import p340io.realm.internal.android.AndroidRealmNotifier;
import p340io.realm.internal.android.C5699a;

@Keep
/* renamed from: io.realm.internal.OsSharedRealm */
public final class OsSharedRealm implements Closeable, C5712i {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final C5698a capabilities;
    public final C5711h context;
    final List<WeakReference<OsResults.C5691a>> iterators = new ArrayList();
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<C5717l>> pendingRows = new CopyOnWriteArrayList();
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback = new ArrayList();

    @Keep
    /* renamed from: io.realm.internal.OsSharedRealm$InitializationCallback */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    /* renamed from: io.realm.internal.OsSharedRealm$MigrationCallback */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2);
    }

    @Keep
    /* renamed from: io.realm.internal.OsSharedRealm$SchemaChangedCallback */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    /* renamed from: io.realm.internal.OsSharedRealm$a */
    public static class C5694a implements Comparable<C5694a> {

        /* renamed from: f */
        public final long f16463f;

        /* renamed from: g */
        public final long f16464g;

        C5694a(long j, long j2) {
            this.f16463f = j;
            this.f16464g = j2;
        }

        /* renamed from: e */
        public int compareTo(C5694a aVar) {
            if (aVar != null) {
                long j = this.f16463f;
                long j2 = aVar.f16463f;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5694a.class != obj.getClass()) {
                return false;
            }
            C5694a aVar = (C5694a) obj;
            return this.f16463f == aVar.f16463f && this.f16464g == aVar.f16464g;
        }

        public int hashCode() {
            long j = this.f16463f;
            long j2 = this.f16464g;
            return (((super.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "VersionID{version=" + this.f16463f + ", index=" + this.f16464g + '}';
        }
    }

    private OsSharedRealm(long j, OsRealmConfig osRealmConfig2) {
        this.nativePtr = j;
        this.osRealmConfig = osRealmConfig2;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(this.nativePtr), this);
        C5711h a = osRealmConfig2.mo16436a();
        this.context = a;
        a.mo16628a(this);
        this.capabilities = new C5699a();
        this.realmNotifier = null;
        boolean z = false;
        nativeSetAutoRefresh(this.nativePtr, false);
        Iterator<OsSharedRealm> it = sharedRealmsUnderConstruction.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OsSharedRealm next = it.next();
            if (next.context == osRealmConfig2.mo16436a()) {
                z = true;
                next.tempSharedRealmsForCallback.add(this);
                break;
            }
        }
        if (!z) {
            throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig2) {
        C5699a aVar = new C5699a();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, aVar);
        this.context = osRealmConfig2.mo16436a();
        sharedRealmsUnderConstruction.add(this);
        try {
            this.nativePtr = nativeGetSharedRealm(osRealmConfig2.getNativePtr(), androidRealmNotifier);
            this.tempSharedRealmsForCallback.clear();
            sharedRealmsUnderConstruction.remove(this);
            this.osRealmConfig = osRealmConfig2;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(this.nativePtr), this);
            this.context.mo16628a(this);
            this.capabilities = aVar;
            this.realmNotifier = androidRealmNotifier;
            nativeSetAutoRefresh(this.nativePtr, aVar.mo16608a());
        } catch (Throwable th) {
            this.tempSharedRealmsForCallback.clear();
            sharedRealmsUnderConstruction.remove(this);
            throw th;
        }
    }

    private void detachIterators() {
        for (WeakReference<OsResults.C5691a> weakReference : this.iterators) {
            OsResults.C5691a aVar = (OsResults.C5691a) weakReference.get();
            if (aVar != null) {
                aVar.mo16462d();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for (WeakReference<C5717l> weakReference : this.pendingRows) {
            C5717l lVar = (C5717l) weakReference.get();
            if (lVar != null) {
                lVar.mo16638b();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(C5672i0 i0Var) {
        return getInstance(new OsRealmConfig.C5687b(i0Var));
    }

    public static OsSharedRealm getInstance(OsRealmConfig.C5687b bVar) {
        OsRealmConfig b = bVar.mo16440b();
        C5713j.getSyncFacadeIfPossible().wrapObjectStoreSessionIfRequired(b);
        return new OsSharedRealm(b);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory == null) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() || file.mkdirs() || file.isDirectory()) {
                if (!absolutePath.endsWith("/")) {
                    absolutePath = absolutePath + "/";
                }
                nativeInit(absolutePath);
                temporaryDirectory = file;
                return;
            }
            throw new C5709f("failed to create temporary directory: " + absolutePath);
        }
    }

    private static native void nativeBeginTransaction(long j);

    private static native void nativeCancelTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    private static native void nativeCommitTransaction(long j);

    private static native boolean nativeCompact(long j);

    private static native long nativeCreateTable(long j, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j, String str, String str2, boolean z, boolean z2);

    private static native int nativeGetClassPrivileges(long j, String str);

    private static native long nativeGetFinalizerPtr();

    private static native int nativeGetObjectPrivileges(long j, long j2);

    private static native int nativeGetRealmPrivileges(long j);

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, RealmNotifier realmNotifier2);

    private static native long nativeGetTable(long j, String str);

    private static native String nativeGetTableName(long j, int i);

    private static native long[] nativeGetVersionID(long j);

    private static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j);

    private static native boolean nativeIsClosed(long j);

    private static native boolean nativeIsEmpty(long j);

    private static native boolean nativeIsInTransaction(long j);

    private static native boolean nativeIsPartial(long j);

    private static native void nativeRefresh(long j);

    private static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j, String str, String str2);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private static native long nativeSize(long j);

    private static native void nativeStopWaitForChange(long j);

    private static native boolean nativeWaitForChange(long j);

    private static native void nativeWriteCopy(long j, String str, byte[] bArr);

    private static void runInitializationCallback(long j, OsRealmConfig osRealmConfig2, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j, osRealmConfig2));
    }

    private static void runMigrationCallback(long j, OsRealmConfig osRealmConfig2, MigrationCallback migrationCallback, long j2) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j, osRealmConfig2), j2, osRealmConfig2.mo16437b().mo16319o());
    }

    /* access modifiers changed from: package-private */
    public void addIterator(OsResults.C5691a aVar) {
        this.iterators.add(new WeakReference(aVar));
    }

    /* access modifiers changed from: package-private */
    public void addPendingRow(C5717l lVar) {
        this.pendingRows.add(new WeakReference(lVar));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    public void close() {
        RealmNotifier realmNotifier2 = this.realmNotifier;
        if (realmNotifier2 != null) {
            realmNotifier2.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, boolean z, boolean z2) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, z, z2));
    }

    public int getClassPrivileges(String str) {
        return nativeGetClassPrivileges(this.nativePtr, str);
    }

    public C5672i0 getConfiguration() {
        return this.osRealmConfig.mo16437b();
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public int getObjectPrivileges(UncheckedRow uncheckedRow) {
        return nativeGetObjectPrivileges(this.nativePtr, uncheckedRow.getNativePtr());
    }

    public String getPath() {
        return this.osRealmConfig.mo16437b().mo16315k();
    }

    public int getPrivileges() {
        return nativeGetRealmPrivileges(this.nativePtr);
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTable(this.nativePtr, str));
    }

    public String getTableName(int i) {
        return nativeGetTableName(this.nativePtr, i);
    }

    public C5694a getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        return new C5694a(nativeGetVersionID[0], nativeGetVersionID[1]);
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    /* access modifiers changed from: package-private */
    public void invalidateIterators() {
        for (WeakReference<OsResults.C5691a> weakReference : this.iterators) {
            OsResults.C5691a aVar = (OsResults.C5691a) weakReference.get();
            if (aVar != null) {
                aVar.mo16464f();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isPartial() {
        return nativeIsPartial(this.nativePtr);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.mo16438c() != null;
    }

    public void refresh() {
        nativeRefresh(this.nativePtr);
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    /* access modifiers changed from: package-private */
    public void removePendingRow(C5717l lVar) {
        for (WeakReference next : this.pendingRows) {
            C5717l lVar2 = (C5717l) next.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.pendingRows.remove(next);
            }
        }
    }

    public void renameTable(String str, String str2) {
        nativeRenameTable(this.nativePtr, str, str2);
    }

    public void setAutoRefresh(boolean z) {
        this.capabilities.mo16609b((String) null);
        nativeSetAutoRefresh(this.nativePtr, z);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, byte[] bArr) {
        if (!file.isFile() || !file.exists()) {
            nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
            return;
        }
        throw new IllegalArgumentException("The destination file must not exist");
    }
}
