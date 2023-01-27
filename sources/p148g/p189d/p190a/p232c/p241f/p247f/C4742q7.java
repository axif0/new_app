package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.q7 */
final class C4742q7<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f */
    private Iterator<Map.Entry<K, Object>> f14417f;

    public C4742q7(Iterator<Map.Entry<K, Object>> it) {
        this.f14417f = it;
    }

    public final boolean hasNext() {
        return this.f14417f.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f14417f.next();
        return next.getValue() instanceof C4654l7 ? new C4692n7(next) : next;
    }

    public final void remove() {
        this.f14417f.remove();
    }
}
