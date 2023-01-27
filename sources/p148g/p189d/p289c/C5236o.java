package p148g.p189d.p289c;

import java.util.Map;
import java.util.Set;
import p148g.p189d.p289c.p291y.C5278h;

/* renamed from: g.d.c.o */
public final class C5236o extends C5233l {

    /* renamed from: a */
    private final C5278h<String, C5233l> f15304a = new C5278h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5236o) && ((C5236o) obj).f15304a.equals(this.f15304a));
    }

    public int hashCode() {
        return this.f15304a.hashCode();
    }

    /* renamed from: o */
    public void mo15387o(String str, C5233l lVar) {
        if (lVar == null) {
            lVar = C5235n.f15303a;
        }
        this.f15304a.put(str, lVar);
    }

    /* renamed from: p */
    public Set<Map.Entry<String, C5233l>> mo15388p() {
        return this.f15304a.entrySet();
    }
}
