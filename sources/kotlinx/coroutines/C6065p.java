package kotlinx.coroutines;

import p351k.p355t.C5891a;
import p351k.p355t.C5895d;
import p351k.p355t.C5896e;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.p */
public abstract class C6065p extends C5891a implements C5896e {
    public C6065p() {
        super(C5896e.f16896c);
    }

    /* renamed from: a */
    public void mo16970a(C5895d<?> dVar) {
        C5956g.m24501f(dVar, "continuation");
        C5896e.C5897a.m24436c(this, dVar);
    }

    /* renamed from: b */
    public final <T> C5895d<T> mo16971b(C5895d<? super T> dVar) {
        C5956g.m24501f(dVar, "continuation");
        return new C6087y(this, dVar);
    }

    public <E extends C5899f.C5902b> E get(C5899f.C5904c<E> cVar) {
        C5956g.m24501f(cVar, "key");
        return C5896e.C5897a.m24434a(this, cVar);
    }

    /* renamed from: h */
    public abstract void mo17115h(C5899f fVar, Runnable runnable);

    /* renamed from: i */
    public void mo17150i(C5899f fVar, Runnable runnable) {
        C5956g.m24501f(fVar, "context");
        C5956g.m24501f(runnable, "block");
        mo17115h(fVar, runnable);
    }

    /* renamed from: j */
    public boolean mo17151j(C5899f fVar) {
        C5956g.m24501f(fVar, "context");
        return true;
    }

    public C5899f minusKey(C5899f.C5904c<?> cVar) {
        C5956g.m24501f(cVar, "key");
        return C5896e.C5897a.m24435b(this, cVar);
    }

    public String toString() {
        return C6082w.m24816a(this) + '@' + C6082w.m24817b(this);
    }
}
