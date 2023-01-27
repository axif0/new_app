package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.r4 */
final class C4755r4 extends C4448a4<Map.Entry<K, V>> {

    /* renamed from: h */
    private final /* synthetic */ C4772s4 f14443h;

    C4755r4(C4772s4 s4Var) {
        this.f14443h = s4Var;
    }

    public final /* synthetic */ Object get(int i) {
        C4447a3.m18700a(i, this.f14443h.f14472j);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f14443h.f14471i[i2], this.f14443h.f14471i[i2 + 1]);
    }

    /* renamed from: m */
    public final boolean mo13844m() {
        return true;
    }

    public final int size() {
        return this.f14443h.f14472j;
    }
}
