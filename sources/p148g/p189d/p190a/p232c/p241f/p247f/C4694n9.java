package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.n9 */
final class C4694n9 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f14316f;

    /* renamed from: g */
    private boolean f14317g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f14318h;

    /* renamed from: i */
    private final /* synthetic */ C4545f9 f14319i;

    private C4694n9(C4545f9 f9Var) {
        this.f14319i = f9Var;
        this.f14316f = -1;
    }

    /* synthetic */ C4694n9(C4545f9 f9Var, C4508d9 d9Var) {
        this(f9Var);
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m20004b() {
        if (this.f14318h == null) {
            this.f14318h = this.f14319i.f14099h.entrySet().iterator();
        }
        return this.f14318h;
    }

    public final boolean hasNext() {
        return this.f14316f + 1 < this.f14319i.f14098g.size() || (!this.f14319i.f14099h.isEmpty() && m20004b().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f14317g = true;
        int i = this.f14316f + 1;
        this.f14316f = i;
        return (Map.Entry) (i < this.f14319i.f14098g.size() ? this.f14319i.f14098g.get(this.f14316f) : m20004b().next());
    }

    public final void remove() {
        if (this.f14317g) {
            this.f14317g = false;
            this.f14319i.m19421p();
            if (this.f14316f < this.f14319i.f14098g.size()) {
                C4545f9 f9Var = this.f14319i;
                int i = this.f14316f;
                this.f14316f = i - 1;
                Object unused = f9Var.m19418k(i);
                return;
            }
            m20004b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
