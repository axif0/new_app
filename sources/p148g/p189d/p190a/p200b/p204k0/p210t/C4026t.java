package p148g.p189d.p190a.p200b.p204k0.p210t;

import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p219o0.p220m.C4176f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.t */
final class C4026t {

    /* renamed from: a */
    private final List<C4109n> f12684a;

    /* renamed from: b */
    private final C3927n[] f12685b;

    public C4026t(List<C4109n> list) {
        this.f12684a = list;
        this.f12685b = new C3927n[list.size()];
    }

    /* renamed from: a */
    public void mo12884a(long j, C4274m mVar) {
        C4176f.m17704a(j, mVar, this.f12685b);
    }

    /* renamed from: b */
    public void mo12885b(C3917g gVar, C4031w.C4035d dVar) {
        for (int i = 0; i < this.f12685b.length; i++) {
            dVar.mo12886a();
            C3927n m = gVar.mo12745m(dVar.mo12888c(), 3);
            C4109n nVar = this.f12684a.get(i);
            String str = nVar.f12949k;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C4260a.m18070b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = nVar.f12944f;
            if (str2 == null) {
                str2 = dVar.mo12887b();
            }
            m.mo12737d(C4109n.m17344n(str2, str, (String) null, -1, nVar.f12940C, nVar.f12941D, nVar.f12942E, (C3900a) null));
            this.f12685b[i] = m;
        }
    }
}
