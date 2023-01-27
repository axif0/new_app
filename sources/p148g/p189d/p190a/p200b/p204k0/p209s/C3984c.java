package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.IOException;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.s.c */
public class C3984c implements C3915e {

    /* renamed from: a */
    private C3917g f12400a;

    /* renamed from: b */
    private C3989h f12401b;

    /* renamed from: c */
    private boolean f12402c;

    /* renamed from: e */
    private static C4274m m16781e(C4274m mVar) {
        mVar.mo13454J(0);
        return mVar;
    }

    /* renamed from: f */
    private boolean m16782f(C3916f fVar) throws IOException, InterruptedException {
        C3989h gVar;
        C3986e eVar = new C3986e();
        if (eVar.mo12834a(fVar, true) && (eVar.f12410b & 2) == 2) {
            int min = Math.min(eVar.f12414f, 8);
            C4274m mVar = new C4274m(min);
            fVar.mo12727i(mVar.f13643a, 0, min);
            m16781e(mVar);
            if (C3982b.m16769o(mVar)) {
                gVar = new C3982b();
            } else {
                m16781e(mVar);
                if (C3994j.m16827p(mVar)) {
                    gVar = new C3994j();
                } else {
                    m16781e(mVar);
                    if (C3988g.m16801n(mVar)) {
                        gVar = new C3988g();
                    }
                }
            }
            this.f12401b = gVar;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12400a = gVar;
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        C3989h hVar = this.f12401b;
        if (hVar != null) {
            hVar.mo12841k(j, j2);
        }
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        try {
            return m16782f(fVar);
        } catch (C4313u unused) {
            return false;
        }
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        if (this.f12401b == null) {
            if (m16782f(fVar)) {
                fVar.mo12723e();
            } else {
                throw new C4313u("Failed to determine bitstream type");
            }
        }
        if (!this.f12402c) {
            C3927n m = this.f12400a.mo12745m(0, 1);
            this.f12400a.mo12744c();
            this.f12401b.mo12838c(this.f12400a, m);
            this.f12402c = true;
        }
        return this.f12401b.mo12840f(fVar, kVar);
    }
}
