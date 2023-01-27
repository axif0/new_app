package p340io.realm.internal;

import java.util.Collection;

/* renamed from: io.realm.internal.OsSchemaInfo */
public class OsSchemaInfo implements C5712i {

    /* renamed from: h */
    private static final long f16460h = nativeGetFinalizerPtr();

    /* renamed from: f */
    private long f16461f;

    /* renamed from: g */
    private final OsSharedRealm f16462g;

    OsSchemaInfo(long j, OsSharedRealm osSharedRealm) {
        this.f16461f = j;
        this.f16462g = osSharedRealm;
    }

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.f16461f = nativeCreateFromList(m23706a(collection));
        C5711h.f16512c.mo16628a(this);
    }

    /* renamed from: a */
    private static long[] m23706a(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (OsObjectSchemaInfo nativePtr : collection) {
            jArr[i] = nativePtr.getNativePtr();
            i++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j, String str);

    /* renamed from: b */
    public OsObjectSchemaInfo mo16474b(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f16461f, str));
    }

    public long getNativeFinalizerPtr() {
        return f16460h;
    }

    public long getNativePtr() {
        return this.f16461f;
    }
}
