package p340io.realm.internal;

import p340io.realm.C5672i0;

/* renamed from: io.realm.internal.OsObjectStore */
public class OsObjectStore {
    /* renamed from: a */
    public static boolean m23669a(C5672i0 i0Var, Runnable runnable) {
        return nativeCallWithLock(i0Var.mo16315k(), runnable);
    }

    /* renamed from: b */
    public static String m23670b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), str);
    }

    /* renamed from: c */
    public static long m23671c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    /* renamed from: d */
    public static void m23672d(OsSharedRealm osSharedRealm, long j) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native String nativeGetPrimaryKeyForObject(long j, String str);

    private static native long nativeGetSchemaVersion(long j);

    private static native void nativeSetSchemaVersion(long j, long j2);
}
