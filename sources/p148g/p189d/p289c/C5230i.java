package p148g.p189d.p289c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: g.d.c.i */
public final class C5230i extends C5233l implements Iterable<C5233l> {

    /* renamed from: f */
    private final List<C5233l> f15302f = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5230i) && ((C5230i) obj).f15302f.equals(this.f15302f));
    }

    public int hashCode() {
        return this.f15302f.hashCode();
    }

    public Iterator<C5233l> iterator() {
        return this.f15302f.iterator();
    }

    /* renamed from: o */
    public void mo15373o(C5233l lVar) {
        if (lVar == null) {
            lVar = C5235n.f15303a;
        }
        this.f15302f.add(lVar);
    }
}
