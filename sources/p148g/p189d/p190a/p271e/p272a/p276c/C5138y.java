package p148g.p189d.p190a.p271e.p272a.p276c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: g.d.a.e.a.c.y */
final class C5138y extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f15163a;

    public C5138y(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f15163a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C5138y.class) {
            if (this == obj) {
                return true;
            }
            C5138y yVar = (C5138y) obj;
            return this.f15163a == yVar.f15163a && get() == yVar.get();
        }
    }

    public final int hashCode() {
        return this.f15163a;
    }
}
