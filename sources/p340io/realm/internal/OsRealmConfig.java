package p340io.realm.internal;

import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import p340io.realm.C5672i0;
import p340io.realm.CompactOnLaunchCallback;
import p340io.realm.internal.OsSharedRealm;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.internal.OsRealmConfig */
public class OsRealmConfig implements C5712i {

    /* renamed from: k */
    private static final long f16415k = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final C5672i0 f16416f;

    /* renamed from: g */
    private final URI f16417g;

    /* renamed from: h */
    private final long f16418h;

    /* renamed from: i */
    private final C5711h f16419i;

    /* renamed from: j */
    private final CompactOnLaunchCallback f16420j;

    /* renamed from: io.realm.internal.OsRealmConfig$a */
    static /* synthetic */ class C5686a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16421a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f16421a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$b */
    public static class C5687b {

        /* renamed from: a */
        private C5672i0 f16422a;

        /* renamed from: b */
        private OsSchemaInfo f16423b = null;

        /* renamed from: c */
        private OsSharedRealm.MigrationCallback f16424c = null;

        /* renamed from: d */
        private OsSharedRealm.InitializationCallback f16425d = null;

        /* renamed from: e */
        private boolean f16426e = false;

        /* renamed from: f */
        private String f16427f = BuildConfig.FLAVOR;

        public C5687b(C5672i0 i0Var) {
            this.f16422a = i0Var;
        }

        /* renamed from: a */
        public C5687b mo16439a(boolean z) {
            this.f16426e = z;
            return this;
        }

        /* renamed from: b */
        public OsRealmConfig mo16440b() {
            return new OsRealmConfig(this.f16422a, this.f16427f, this.f16426e, this.f16423b, this.f16424c, this.f16425d, (C5686a) null);
        }

        /* renamed from: c */
        public C5687b mo16441c(File file) {
            this.f16427f = file.getAbsolutePath();
            return this;
        }

        /* renamed from: d */
        public C5687b mo16442d(OsSharedRealm.InitializationCallback initializationCallback) {
            this.f16425d = initializationCallback;
            return this;
        }

        /* renamed from: e */
        public C5687b mo16443e(OsSharedRealm.MigrationCallback migrationCallback) {
            this.f16424c = migrationCallback;
            return this;
        }

        /* renamed from: f */
        public C5687b mo16444f(OsSchemaInfo osSchemaInfo) {
            this.f16423b = osSchemaInfo;
            return this;
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$c */
    public enum C5688c {
        FULL(0),
        MEM_ONLY(1);

        private C5688c(int i) {
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$d */
    public enum C5689d {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE((byte) 4),
        SCHEMA_MODE_MANUAL((byte) 5);
        

        /* renamed from: f */
        final byte f16438f;

        private C5689d(byte b) {
            this.f16438f = b;
        }

        /* renamed from: e */
        public byte mo16445e() {
            return this.f16438f;
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$e */
    public enum C5690e {
        IMMEDIATELY((byte) 0),
        LIVE_INDEFINITELY((byte) 1),
        AFTER_CHANGES_UPLOADED((byte) 2);
        

        /* renamed from: f */
        final byte f16443f;

        private C5690e(byte b) {
            this.f16443f = b;
        }
    }

    private OsRealmConfig(C5672i0 i0Var, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback) {
        URI uri;
        OsSharedRealm.InitializationCallback initializationCallback2 = initializationCallback;
        this.f16419i = new C5711h();
        this.f16416f = i0Var;
        this.f16418h = nativeCreate(i0Var.mo16315k(), str, false, true);
        C5711h.f16512c.mo16628a(this);
        Object[] syncConfigurationOptions = C5713j.getSyncFacadeIfPossible().getSyncConfigurationOptions(this.f16416f);
        String str2 = (String) syncConfigurationOptions[0];
        String str3 = (String) syncConfigurationOptions[1];
        String str4 = (String) syncConfigurationOptions[2];
        String str5 = (String) syncConfigurationOptions[3];
        boolean equals = Boolean.TRUE.equals(syncConfigurationOptions[4]);
        String str6 = (String) syncConfigurationOptions[5];
        Byte b = (Byte) syncConfigurationOptions[6];
        boolean equals2 = Boolean.TRUE.equals(syncConfigurationOptions[7]);
        String str7 = (String) syncConfigurationOptions[8];
        String str8 = (String) syncConfigurationOptions[9];
        Byte b2 = (Byte) syncConfigurationOptions[11];
        Map map = (Map) syncConfigurationOptions[10];
        String[] strArr = new String[(map != null ? map.size() * 2 : 0)];
        if (map != null) {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i] = (String) entry.getKey();
                strArr[i + 1] = (String) entry.getValue();
                i += 2;
            }
        }
        byte[] g = i0Var.mo16311g();
        if (g != null) {
            nativeSetEncryptionKey(this.f16418h, g);
        }
        nativeSetInMemory(this.f16418h, i0Var.mo16310f() == C5688c.MEM_ONLY);
        nativeEnableChangeNotification(this.f16418h, z);
        C5689d dVar = C5689d.SCHEMA_MODE_MANUAL;
        if (i0Var.mo16322r()) {
            dVar = C5689d.SCHEMA_MODE_IMMUTABLE;
        } else if (i0Var.mo16321q()) {
            dVar = C5689d.SCHEMA_MODE_READONLY;
        } else if (str3 != null) {
            dVar = C5689d.SCHEMA_MODE_ADDITIVE;
        } else if (i0Var.mo16326v()) {
            dVar = C5689d.SCHEMA_MODE_RESET_FILE;
        }
        String[] strArr2 = strArr;
        String str9 = str6;
        nativeSetSchemaConfig(this.f16418h, dVar.mo16445e(), i0Var.mo16319o(), osSchemaInfo == null ? 0 : osSchemaInfo.getNativePtr(), migrationCallback);
        CompactOnLaunchCallback e = i0Var.mo16308e();
        this.f16420j = e;
        if (e != null) {
            nativeSetCompactOnLaunchCallback(this.f16418h, e);
        }
        if (initializationCallback2 != null) {
            nativeSetInitializationCallback(this.f16418h, initializationCallback2);
        }
        URI uri2 = null;
        if (str3 != null) {
            boolean z2 = equals;
            String nativeCreateAndSetSyncConfig = nativeCreateAndSetSyncConfig(this.f16418h, str3, str4, str2, str5, equals2, b.byteValue(), str7, str8, strArr2, b2.byteValue());
            try {
                uri = new URI(nativeCreateAndSetSyncConfig);
            } catch (URISyntaxException e2) {
                RealmLog.m24079e(e2, "Cannot create a URI from the Realm URL address", new Object[0]);
                uri = null;
            }
            nativeSetSyncConfigSslSettings(this.f16418h, z2, str9);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (!(uri == null || proxySelector == null)) {
                try {
                    uri2 = new URI(nativeCreateAndSetSyncConfig.replaceFirst("realm", "http"));
                } catch (URISyntaxException e3) {
                    RealmLog.m24079e(e3, "Cannot create a URI from the Realm URL address", new Object[0]);
                }
                List<Proxy> select = proxySelector.select(uri2);
                if (select != null && !select.isEmpty()) {
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b3 = C5686a.f16421a[proxy.type().ordinal()] == 1 ? (byte) 0 : -1;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                nativeSetSyncConfigProxySettings(this.f16418h, b3, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                            } else {
                                RealmLog.m24077c("Unsupported proxy socket address type: " + address.getClass().getName(), new Object[0]);
                            }
                        } else {
                            RealmLog.m24077c("SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
            uri2 = uri;
        }
        this.f16417g = uri2;
    }

    /* synthetic */ OsRealmConfig(C5672i0 i0Var, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, C5686a aVar) {
        this(i0Var, str, z, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private static native long nativeCreate(String str, String str2, boolean z, boolean z2);

    private static native String nativeCreateAndSetSyncConfig(long j, String str, String str2, String str3, String str4, boolean z, byte b, String str5, String str6, String[] strArr, byte b2);

    private static native void nativeEnableChangeNotification(long j, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j, byte[] bArr);

    private static native void nativeSetInMemory(long j, boolean z);

    private native void nativeSetInitializationCallback(long j, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j, byte b, long j2, long j3, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j, byte b, String str, int i);

    private static native void nativeSetSyncConfigSslSettings(long j, boolean z, String str);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5711h mo16436a() {
        return this.f16419i;
    }

    /* renamed from: b */
    public C5672i0 mo16437b() {
        return this.f16416f;
    }

    /* renamed from: c */
    public URI mo16438c() {
        return this.f16417g;
    }

    public long getNativeFinalizerPtr() {
        return f16415k;
    }

    public long getNativePtr() {
        return this.f16418h;
    }
}
