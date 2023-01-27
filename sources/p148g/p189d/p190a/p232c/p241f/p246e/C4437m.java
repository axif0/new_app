package p148g.p189d.p190a.p232c.p241f.p246e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.d.a.c.f.e.m */
final class C4437m {

    /* renamed from: a */
    private final ConcurrentHashMap<C4440p, List<Throwable>> f13960a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f13961b = new ReferenceQueue<>();

    C4437m() {
    }

    /* renamed from: a */
    public final List<Throwable> mo13763a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f13961b.poll();
            if (poll == null) {
                break;
            }
            this.f13960a.remove(poll);
        }
        List<Throwable> list = this.f13960a.get(new C4440p(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f13960a.putIfAbsent(new C4440p(th, this.f13961b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
