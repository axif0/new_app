package p340io.realm.internal;

import p340io.realm.C5763l0;
import p340io.realm.C5774o0;
import p340io.realm.C5795u;
import p340io.realm.RealmFieldType;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5714k;

@Keep
/* renamed from: io.realm.internal.OsObject */
public class OsObject implements C5712i {
    private static final String OBJECT_ID_COLUMN_NAME = nativeGetObjectIdColumName();
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private C5714k<C5682b> observerPairs = new C5714k<>();

    /* renamed from: io.realm.internal.OsObject$a */
    private static class C5681a implements C5714k.C5715a<C5682b> {

        /* renamed from: a */
        private final String[] f16407a;

        C5681a(String[] strArr) {
            this.f16407a = strArr;
        }

        /* renamed from: b */
        private C5795u m23656b() {
            boolean z = this.f16407a == null;
            return new C5683c(z ? new String[0] : this.f16407a, z);
        }

        /* renamed from: c */
        public void mo16266a(C5682b bVar, Object obj) {
            bVar.mo16428a((C5763l0) obj, m23656b());
        }
    }

    /* renamed from: io.realm.internal.OsObject$b */
    public static class C5682b<T extends C5763l0> extends C5714k.C5716b<T, C5774o0<T>> {
        public C5682b(T t, C5774o0<T> o0Var) {
            super(t, o0Var);
        }

        /* renamed from: a */
        public void mo16428a(T t, C5795u uVar) {
            ((C5774o0) this.f16516b).mo16753a(t, uVar);
        }
    }

    /* renamed from: io.realm.internal.OsObject$c */
    private static class C5683c implements C5795u {
        C5683c(String[] strArr, boolean z) {
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.mo16628a(this);
    }

    public static UncheckedRow create(Table table) {
        OsSharedRealm n = table.mo16556n();
        return new UncheckedRow(n.context, table, nativeCreateNewObject(n.getNativePtr(), table.getNativePtr()));
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.mo16556n().getNativePtr(), table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j, Object obj) {
        Object obj2 = obj;
        RealmFieldType k = table.mo16553k(j);
        OsSharedRealm n = table.mo16556n();
        if (k == RealmFieldType.STRING) {
            if (obj2 == null || (obj2 instanceof String)) {
                return nativeCreateRowWithStringPrimaryKey(n.getNativePtr(), table.getNativePtr(), j, (String) obj2);
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj2);
        } else if (k == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(n.getNativePtr(), table.getNativePtr(), j, obj2 == null ? 0 : Long.parseLong(obj.toString()), obj2 == null);
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + k);
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType k = table.mo16553k(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm n = table.mo16556n();
        if (k == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return new UncheckedRow(n.context, table, nativeCreateNewObjectWithStringPrimaryKey(n.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        } else if (k == RealmFieldType.INTEGER) {
            return new UncheckedRow(n.context, table, nativeCreateNewObjectWithLongPrimaryKey(n.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0 : Long.parseLong(obj.toString()), obj == null));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + k);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String b = OsObjectStore.m23670b(table.mo16556n(), table.mo16549f());
        if (b != null) {
            return table.mo16551i(b);
        }
        throw new IllegalStateException(table.mo16555m() + " has no primary key defined.");
    }

    public static boolean isObjectIdColumn(String str) {
        return OBJECT_ID_COLUMN_NAME.equals(str);
    }

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateNewObject(long j, long j2);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRow(long j, long j2);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetObjectIdColumName();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.mo16631c(new C5681a(strArr));
    }

    public <T extends C5763l0> void addListener(T t, C5774o0<T> o0Var) {
        if (this.observerPairs.mo16632d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.mo16629a(new C5682b(t, o0Var));
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends C5763l0> void removeListener(T t) {
        this.observerPairs.mo16634f(t);
        if (this.observerPairs.mo16632d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T extends C5763l0> void removeListener(T t, C5774o0<T> o0Var) {
        this.observerPairs.mo16633e(t, o0Var);
        if (this.observerPairs.mo16632d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(C5714k<C5682b> kVar) {
        if (this.observerPairs.mo16632d()) {
            this.observerPairs = kVar;
            if (!kVar.mo16632d()) {
                nativeStartListening(this.nativePtr);
                return;
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }
}
