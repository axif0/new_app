package p340io.realm.internal.core;

import p340io.realm.internal.C5712i;

/* renamed from: io.realm.internal.core.DescriptorOrdering */
public class DescriptorOrdering implements C5712i {

    /* renamed from: g */
    private static final long f16504g = nativeGetFinalizerMethodPtr();

    /* renamed from: f */
    private final long f16505f = nativeCreate();

    private static native long nativeCreate();

    private static native long nativeGetFinalizerMethodPtr();

    private static native boolean nativeIsEmpty(long j);

    /* renamed from: a */
    public boolean mo16624a() {
        return nativeIsEmpty(this.f16505f);
    }

    public long getNativeFinalizerPtr() {
        return f16504g;
    }

    public long getNativePtr() {
        return this.f16505f;
    }
}
