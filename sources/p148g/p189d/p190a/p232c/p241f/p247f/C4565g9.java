package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.g9 */
final class C4565g9 extends C4677m9 {

    /* renamed from: g */
    private final /* synthetic */ C4545f9 f14152g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C4565g9(C4545f9 f9Var) {
        super(f9Var, (C4508d9) null);
        this.f14152g = f9Var;
    }

    /* synthetic */ C4565g9(C4545f9 f9Var, C4508d9 d9Var) {
        this(f9Var);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C4583h9(this.f14152g, (C4508d9) null);
    }
}
