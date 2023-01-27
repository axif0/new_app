package p148g.p189d.p190a.p232c.p241f.p247f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.d.a.c.f.f.d5 */
final class C4504d5 {

    /* renamed from: a */
    private final ConcurrentHashMap<C4579h5, List<Throwable>> f14029a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f14030b = new ReferenceQueue<>();

    C4504d5() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14037a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f14030b.poll();
            if (poll == null) {
                break;
            }
            this.f14029a.remove(poll);
        }
        List<Throwable> list = this.f14029a.get(new C4579h5(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f14029a.putIfAbsent(new C4579h5(th, this.f14030b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
