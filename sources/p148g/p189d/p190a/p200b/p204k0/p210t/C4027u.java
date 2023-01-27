package p148g.p189d.p190a.p200b.p204k0.p210t;

import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.k0.t.u */
public final class C4027u implements C4024r {

    /* renamed from: a */
    private C4282u f12686a;

    /* renamed from: b */
    private C3927n f12687b;

    /* renamed from: c */
    private boolean f12688c;

    /* renamed from: b */
    public void mo12882b(C4282u uVar, C3917g gVar, C4031w.C4035d dVar) {
        this.f12686a = uVar;
        dVar.mo12886a();
        C3927n m = gVar.mo12745m(dVar.mo12888c(), 4);
        this.f12687b = m;
        m.mo12737d(C4109n.m17341k(dVar.mo12887b(), "application/x-scte35", (String) null, -1, (C3900a) null));
    }

    /* renamed from: c */
    public void mo12883c(C4274m mVar) {
        if (!this.f12688c) {
            if (this.f12686a.mo13501e() != -9223372036854775807L) {
                this.f12687b.mo12737d(C4109n.m17340j((String) null, "application/x-scte35", this.f12686a.mo13501e()));
                this.f12688c = true;
            } else {
                return;
            }
        }
        int a = mVar.mo13456a();
        this.f12687b.mo12734a(mVar, a);
        this.f12687b.mo12736c(this.f12686a.mo13500d(), 1, a, 0, (C3927n.C3928a) null);
    }
}
