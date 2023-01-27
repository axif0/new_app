package p148g.p189d.p190a.p271e.p272a.p276c;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.d.a.e.a.c.z */
final class C5140z {

    /* renamed from: a */
    private final ConcurrentHashMap<C5138y, List<Throwable>> f15164a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f15165b = new ReferenceQueue<>();

    C5140z() {
    }

    /* renamed from: a */
    public final List<Throwable> mo15239a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f15165b.poll();
            if (poll == null) {
                break;
            }
            this.f15164a.remove(poll);
        }
        List<Throwable> list = this.f15164a.get(new C5138y(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f15164a.putIfAbsent(new C5138y(th, this.f15165b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
