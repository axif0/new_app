package p340io.realm.internal;

import p340io.realm.RealmFieldType;

/* renamed from: io.realm.internal.OsObjectSchemaInfo */
public class OsObjectSchemaInfo implements C5712i {

    /* renamed from: g */
    private static final long f16408g = nativeGetFinalizerPtr();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f16409f;

    /* renamed from: io.realm.internal.OsObjectSchemaInfo$b */
    public static class C5685b {

        /* renamed from: a */
        private final String f16410a;

        /* renamed from: b */
        private final long[] f16411b;

        /* renamed from: c */
        private int f16412c = 0;

        /* renamed from: d */
        private final long[] f16413d;

        /* renamed from: e */
        private int f16414e = 0;

        public C5685b(String str, int i, int i2) {
            this.f16410a = str;
            this.f16411b = new long[i];
            this.f16413d = new long[i2];
        }

        /* renamed from: a */
        public C5685b mo16432a(String str, String str2, String str3) {
            long nativeCreateComputedLinkProperty = Property.nativeCreateComputedLinkProperty(str, str2, str3);
            long[] jArr = this.f16413d;
            int i = this.f16414e;
            jArr[i] = nativeCreateComputedLinkProperty;
            this.f16414e = i + 1;
            return this;
        }

        /* renamed from: b */
        public C5685b mo16433b(String str, RealmFieldType realmFieldType, String str2) {
            long nativeCreatePersistedLinkProperty = Property.nativeCreatePersistedLinkProperty(str, Property.m23709a(realmFieldType, false), str2);
            long[] jArr = this.f16411b;
            int i = this.f16412c;
            jArr[i] = nativeCreatePersistedLinkProperty;
            this.f16412c = i + 1;
            return this;
        }

        /* renamed from: c */
        public C5685b mo16434c(String str, RealmFieldType realmFieldType, boolean z, boolean z2, boolean z3) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str, Property.m23709a(realmFieldType, z3), z, z2);
            long[] jArr = this.f16411b;
            int i = this.f16412c;
            jArr[i] = nativeCreatePersistedProperty;
            this.f16412c = i + 1;
            return this;
        }

        /* renamed from: d */
        public OsObjectSchemaInfo mo16435d() {
            if (this.f16412c == -1 || this.f16414e == -1) {
                throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
            }
            OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.f16410a);
            OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f16409f, this.f16411b, this.f16413d);
            this.f16412c = -1;
            this.f16414e = -1;
            return osObjectSchemaInfo;
        }
    }

    OsObjectSchemaInfo(long j) {
        this.f16409f = j;
        C5711h.f16512c.mo16628a(this);
    }

    private OsObjectSchemaInfo(String str) {
        this(nativeCreateRealmObjectSchema(str));
    }

    /* access modifiers changed from: private */
    public static native void nativeAddProperties(long j, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetMaxColumnIndex(long j);

    private static native long nativeGetPrimaryKeyProperty(long j);

    private static native long nativeGetProperty(long j, String str);

    /* renamed from: c */
    public long mo16429c() {
        return nativeGetMaxColumnIndex(this.f16409f);
    }

    /* renamed from: d */
    public Property mo16430d() {
        if (nativeGetPrimaryKeyProperty(this.f16409f) == 0) {
            return null;
        }
        return new Property(nativeGetPrimaryKeyProperty(this.f16409f));
    }

    /* renamed from: e */
    public Property mo16431e(String str) {
        return new Property(nativeGetProperty(this.f16409f, str));
    }

    public long getNativeFinalizerPtr() {
        return f16408g;
    }

    public long getNativePtr() {
        return this.f16409f;
    }
}
