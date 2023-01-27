package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.u3 */
final class C4805u3 extends C4650l3<K, V> {
    @NullableDecl

    /* renamed from: f */
    private final K f14558f;

    /* renamed from: g */
    private int f14559g;

    /* renamed from: h */
    private final /* synthetic */ C4722p3 f14560h;

    C4805u3(C4722p3 p3Var, int i) {
        this.f14560h = p3Var;
        this.f14558f = p3Var.f14369h[i];
        this.f14559g = i;
    }

    /* renamed from: a */
    private final void m20449a() {
        int i = this.f14559g;
        if (i == -1 || i >= this.f14560h.size() || !C4870y2.m20620a(this.f14558f, this.f14560h.f14369h[this.f14559g])) {
            this.f14559g = this.f14560h.m20084d(this.f14558f);
        }
    }

    @NullableDecl
    public final K getKey() {
        return this.f14558f;
    }

    @NullableDecl
    public final V getValue() {
        Map m = this.f14560h.mo14522m();
        if (m != null) {
            return m.get(this.f14558f);
        }
        m20449a();
        int i = this.f14559g;
        if (i == -1) {
            return null;
        }
        return this.f14560h.f14370i[i];
    }

    public final V setValue(V v) {
        Map m = this.f14560h.mo14522m();
        if (m != null) {
            return m.put(this.f14558f, v);
        }
        m20449a();
        int i = this.f14559g;
        if (i == -1) {
            this.f14560h.put(this.f14558f, v);
            return null;
        }
        V[] vArr = this.f14560h.f14370i;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }
}
