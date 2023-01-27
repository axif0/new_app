package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.t3 */
final class C4788t3 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: f */
    private final /* synthetic */ C4722p3 f14491f;

    C4788t3(C4722p3 p3Var) {
        this.f14491f = p3Var;
    }

    public final void clear() {
        this.f14491f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map m = this.f14491f.mo14522m();
        if (m != null) {
            return m.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int k = this.f14491f.m20084d(entry.getKey());
            return k != -1 && C4870y2.m20620a(this.f14491f.f14370i[k], entry.getValue());
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.f14491f.mo14529t();
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map m = this.f14491f.mo14522m();
        if (m != null) {
            return m.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f14491f.mo14518g()) {
            return false;
        }
        int j = this.f14491f.m20094w();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object o = this.f14491f.f14367f;
        C4722p3 p3Var = this.f14491f;
        int c = C4837w3.m20524c(key, value, j, o, p3Var.f14368g, p3Var.f14369h, p3Var.f14370i);
        if (c == -1) {
            return false;
        }
        this.f14491f.mo14517f(c, j);
        C4722p3.m20092r(this.f14491f);
        this.f14491f.mo14523p();
        return true;
    }

    public final int size() {
        return this.f14491f.size();
    }
}
