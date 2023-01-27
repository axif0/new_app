package p374m.p375g0.p378g;

import java.io.IOException;
import java.net.ProtocolException;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6259u;
import p374m.p375g0.C6130c;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6155g;
import p385n.C6277c;
import p385n.C6280d;
import p385n.C6283g;
import p385n.C6288l;
import p385n.C6299r;

/* renamed from: m.g0.g.b */
public final class C6158b implements C6259u {

    /* renamed from: a */
    private final boolean f17324a;

    /* renamed from: m.g0.g.b$a */
    static final class C6159a extends C6283g {

        /* renamed from: g */
        long f17325g;

        C6159a(C6299r rVar) {
            super(rVar);
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            super.mo17384f(cVar, j);
            this.f17325g += j;
        }
    }

    public C6158b(boolean z) {
        this.f17324a = z;
    }

    /* renamed from: a */
    public C6113c0 mo16688a(C6259u.C6260a aVar) throws IOException {
        C6113c0.C6114a aVar2;
        C6117d0 d0Var;
        C6165g gVar = (C6165g) aVar;
        C6160c h = gVar.mo17442h();
        C6155g j = gVar.mo17444j();
        C6150c cVar = (C6150c) gVar.mo17440f();
        C6099a0 request = gVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.mo17441g().mo17664o(gVar.mo17439e());
        h.mo17427b(request);
        gVar.mo17441g().mo17663n(gVar.mo17439e(), request);
        C6113c0.C6114a aVar3 = null;
        if (C6164f.m25207b(request.mo17218g()) && request.mo17212a() != null) {
            if ("100-continue".equalsIgnoreCase(request.mo17214c("Expect"))) {
                h.mo17430d();
                gVar.mo17441g().mo17668s(gVar.mo17439e());
                aVar3 = h.mo17432f(true);
            }
            if (aVar3 == null) {
                gVar.mo17441g().mo17662m(gVar.mo17439e());
                C6159a aVar4 = new C6159a(h.mo17431e(request, request.mo17212a().mo17233a()));
                C6280d c = C6288l.m25932c(aVar4);
                request.mo17212a().mo17235f(c);
                c.close();
                gVar.mo17441g().mo17661l(gVar.mo17439e(), aVar4.f17325g);
            } else if (!cVar.mo17395n()) {
                j.mo17419j();
            }
        }
        h.mo17426a();
        if (aVar3 == null) {
            gVar.mo17441g().mo17668s(gVar.mo17439e());
            aVar3 = h.mo17432f(false);
        }
        aVar3.mo17292p(request);
        aVar3.mo17284h(j.mo17416d().mo17392k());
        aVar3.mo17293q(currentTimeMillis);
        aVar3.mo17291o(System.currentTimeMillis());
        C6113c0 c2 = aVar3.mo17281c();
        int m = c2.mo17270m();
        if (m == 100) {
            C6113c0.C6114a f = h.mo17432f(false);
            f.mo17292p(request);
            f.mo17284h(j.mo17416d().mo17392k());
            f.mo17293q(currentTimeMillis);
            f.mo17291o(System.currentTimeMillis());
            c2 = f.mo17281c();
            m = c2.mo17270m();
        }
        gVar.mo17441g().mo17667r(gVar.mo17439e(), c2);
        if (!this.f17324a || m != 101) {
            aVar2 = c2.mo17260D();
            d0Var = h.mo17428c(c2);
        } else {
            aVar2 = c2.mo17260D();
            d0Var = C6130c.f17199c;
        }
        aVar2.mo17280b(d0Var);
        C6113c0 c3 = aVar2.mo17281c();
        if ("close".equalsIgnoreCase(c3.mo17264S().mo17214c("Connection")) || "close".equalsIgnoreCase(c3.mo17272q("Connection"))) {
            j.mo17419j();
        }
        if ((m != 204 && m != 205) || c3.mo17266a().mo17253j() <= 0) {
            return c3;
        }
        throw new ProtocolException("HTTP " + m + " had non-zero Content-Length: " + c3.mo17266a().mo17253j());
    }
}
