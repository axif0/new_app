package p351k.p355t;

import p351k.p355t.C5899f;
import p351k.p355t.C5899f.C5902b;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.b */
public abstract class C5892b<B extends C5899f.C5902b, E extends B> implements C5899f.C5904c<E> {

    /* renamed from: a */
    private final C5899f.C5904c<?> f16891a;

    /* renamed from: b */
    private final C5937l<C5899f.C5902b, E> f16892b;

    /* renamed from: a */
    public final boolean mo16961a(C5899f.C5904c<?> cVar) {
        C5956g.m24500e(cVar, "key");
        return cVar == this || this.f16891a == cVar;
    }

    /* renamed from: b */
    public final E mo16962b(C5899f.C5902b bVar) {
        C5956g.m24500e(bVar, "element");
        return (C5899f.C5902b) this.f16892b.mo16990c(bVar);
    }
}
