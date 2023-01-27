package p351k.p355t;

import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.a */
public abstract class C5891a implements C5899f.C5902b {
    private final C5899f.C5904c<?> key;

    public C5891a(C5899f.C5904c<?> cVar) {
        C5956g.m24500e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
        C5956g.m24500e(pVar, "operation");
        return C5899f.C5902b.C5903a.m24440a(this, r, pVar);
    }

    public <E extends C5899f.C5902b> E get(C5899f.C5904c<E> cVar) {
        C5956g.m24500e(cVar, "key");
        return C5899f.C5902b.C5903a.m24441b(this, cVar);
    }

    public C5899f.C5904c<?> getKey() {
        return this.key;
    }

    public C5899f minusKey(C5899f.C5904c<?> cVar) {
        C5956g.m24500e(cVar, "key");
        return C5899f.C5902b.C5903a.m24442c(this, cVar);
    }

    public C5899f plus(C5899f fVar) {
        C5956g.m24500e(fVar, "context");
        return C5899f.C5902b.C5903a.m24443d(this, fVar);
    }
}
