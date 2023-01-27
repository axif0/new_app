package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.v3 */
final class C4821v3 extends AbstractSet<K> {

    /* renamed from: f */
    private final /* synthetic */ C4722p3 f14582f;

    C4821v3(C4722p3 p3Var) {
        this.f14582f = p3Var;
    }

    public final void clear() {
        this.f14582f.clear();
    }

    public final boolean contains(Object obj) {
        return this.f14582f.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return this.f14582f.mo14527s();
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map m = this.f14582f.mo14522m();
        return m != null ? m.keySet().remove(obj) : this.f14582f.m20089l(obj) != C4722p3.f14366o;
    }

    public final int size() {
        return this.f14582f.size();
    }
}
