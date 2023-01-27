package p148g.p189d.p190a.p232c.p241f.p246e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: g.d.a.c.f.e.p */
final class C4440p extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f13963a;

    public C4440p(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f13963a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4440p.class) {
            if (this == obj) {
                return true;
            }
            C4440p pVar = (C4440p) obj;
            return this.f13963a == pVar.f13963a && get() == pVar.get();
        }
    }

    public final int hashCode() {
        return this.f13963a;
    }
}
