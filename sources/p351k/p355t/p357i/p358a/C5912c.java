package p351k.p355t.p357i.p358a;

import p351k.p355t.C5895d;
import p351k.p355t.C5896e;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.i.a.c */
public abstract class C5912c extends C5910a {

    /* renamed from: g */
    private transient C5895d<Object> f16904g;

    /* renamed from: h */
    private final C5899f f16905h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5912c(C5895d<Object> dVar) {
        this(dVar, dVar != null ? dVar.mo16969c() : null);
    }

    public C5912c(C5895d<Object> dVar, C5899f fVar) {
        super(dVar);
        this.f16905h = fVar;
    }

    /* renamed from: c */
    public C5899f mo16969c() {
        C5899f fVar = this.f16905h;
        C5956g.m24498c(fVar);
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16978g() {
        C5895d<Object> dVar = this.f16904g;
        if (!(dVar == null || dVar == this)) {
            C5899f.C5902b bVar = mo16969c().get(C5896e.f16896c);
            C5956g.m24498c(bVar);
            ((C5896e) bVar).mo16970a(dVar);
        }
        this.f16904g = C5911b.f16903f;
    }

    /* renamed from: h */
    public final C5895d<Object> mo16981h() {
        C5895d<Object> dVar = this.f16904g;
        if (dVar == null) {
            C5896e eVar = (C5896e) mo16969c().get(C5896e.f16896c);
            if (eVar == null || (dVar = eVar.mo16971b(this)) == null) {
                dVar = this;
            }
            this.f16904g = dVar;
        }
        return dVar;
    }
}
