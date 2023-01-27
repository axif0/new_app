package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.h9 */
final class C4583h9 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f14165f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f14166g;

    /* renamed from: h */
    private final /* synthetic */ C4545f9 f14167h;

    private C4583h9(C4545f9 f9Var) {
        this.f14167h = f9Var;
        this.f14165f = this.f14167h.f14098g.size();
    }

    /* synthetic */ C4583h9(C4545f9 f9Var, C4508d9 d9Var) {
        this(f9Var);
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m19592b() {
        if (this.f14166g == null) {
            this.f14166g = this.f14167h.f14102k.entrySet().iterator();
        }
        return this.f14166g;
    }

    public final boolean hasNext() {
        int i = this.f14165f;
        return (i > 0 && i <= this.f14167h.f14098g.size()) || m19592b().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m19592b().hasNext()) {
            obj = m19592b().next();
        } else {
            List g = this.f14167h.f14098g;
            int i = this.f14165f - 1;
            this.f14165f = i;
            obj = g.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
