package p340io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: io.realm.internal.NativeObjectReference */
final class NativeObjectReference extends PhantomReference<C5712i> {

    /* renamed from: f */
    private static C5677b f16388f = new C5677b();

    /* renamed from: a */
    private final long f16389a;

    /* renamed from: b */
    private final long f16390b;

    /* renamed from: c */
    private final C5711h f16391c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public NativeObjectReference f16392d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public NativeObjectReference f16393e;

    /* renamed from: io.realm.internal.NativeObjectReference$b */
    private static class C5677b {

        /* renamed from: a */
        NativeObjectReference f16394a;

        private C5677b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo16370a(NativeObjectReference nativeObjectReference) {
            NativeObjectReference unused = nativeObjectReference.f16392d = null;
            NativeObjectReference unused2 = nativeObjectReference.f16393e = this.f16394a;
            if (this.f16394a != null) {
                NativeObjectReference unused3 = this.f16394a.f16392d = nativeObjectReference;
            }
            this.f16394a = nativeObjectReference;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo16371b(NativeObjectReference nativeObjectReference) {
            NativeObjectReference c = nativeObjectReference.f16393e;
            NativeObjectReference a = nativeObjectReference.f16392d;
            NativeObjectReference unused = nativeObjectReference.f16393e = null;
            NativeObjectReference unused2 = nativeObjectReference.f16392d = null;
            if (a != null) {
                NativeObjectReference unused3 = a.f16393e = c;
            } else {
                this.f16394a = c;
            }
            if (c != null) {
                NativeObjectReference unused4 = c.f16392d = a;
            }
        }
    }

    NativeObjectReference(C5711h hVar, C5712i iVar, ReferenceQueue<? super C5712i> referenceQueue) {
        super(iVar, referenceQueue);
        this.f16389a = iVar.getNativePtr();
        this.f16390b = iVar.getNativeFinalizerPtr();
        this.f16391c = hVar;
        f16388f.mo16370a(this);
    }

    private static native void nativeCleanUp(long j, long j2);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16369e() {
        synchronized (this.f16391c) {
            nativeCleanUp(this.f16390b, this.f16389a);
        }
        f16388f.mo16371b(this);
    }
}
