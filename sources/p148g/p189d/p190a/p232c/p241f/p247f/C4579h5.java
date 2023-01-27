package p148g.p189d.p190a.p232c.p241f.p247f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: g.d.a.c.f.f.h5 */
final class C4579h5 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f14164a;

    public C4579h5(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f14164a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4579h5.class) {
            if (this == obj) {
                return true;
            }
            C4579h5 h5Var = (C4579h5) obj;
            return this.f14164a == h5Var.f14164a && get() == h5Var.get();
        }
    }

    public final int hashCode() {
        return this.f14164a;
    }
}
