package p374m.p375g0.p376e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jsoup.helper.HttpConnection;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6255s;
import p374m.C6259u;
import p374m.C6268y;
import p374m.p375g0.C6128a;
import p374m.p375g0.C6130c;
import p374m.p375g0.p376e.C6137c;
import p374m.p375g0.p378g.C6163e;
import p374m.p375g0.p378g.C6164f;
import p374m.p375g0.p378g.C6166h;
import p385n.C6277c;
import p385n.C6280d;
import p385n.C6281e;
import p385n.C6288l;
import p385n.C6299r;
import p385n.C6300s;
import p385n.C6301t;

/* renamed from: m.g0.e.a */
public final class C6134a implements C6259u {

    /* renamed from: a */
    final C6147f f17216a;

    /* renamed from: m.g0.e.a$a */
    class C6135a implements C6300s {

        /* renamed from: f */
        boolean f17217f;

        /* renamed from: g */
        final /* synthetic */ C6281e f17218g;

        /* renamed from: h */
        final /* synthetic */ C6136b f17219h;

        /* renamed from: i */
        final /* synthetic */ C6280d f17220i;

        C6135a(C6134a aVar, C6281e eVar, C6136b bVar, C6280d dVar) {
            this.f17218g = eVar;
            this.f17219h = bVar;
            this.f17220i = dVar;
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            try {
                long O = this.f17218g.mo17355O(cVar, j);
                if (O == -1) {
                    if (!this.f17217f) {
                        this.f17217f = true;
                        this.f17220i.close();
                    }
                    return -1;
                }
                cVar.mo17854u(this.f17220i.mo17813b(), cVar.mo17834l0() - O, O);
                this.f17220i.mo17804L();
                return O;
            } catch (IOException e) {
                if (!this.f17217f) {
                    this.f17217f = true;
                    this.f17219h.mo17250a();
                }
                throw e;
            }
        }

        public void close() throws IOException {
            if (!this.f17217f && !C6130c.m25053p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17217f = true;
                this.f17219h.mo17250a();
            }
            this.f17218g.close();
        }

        public C6301t timeout() {
            return this.f17218g.timeout();
        }
    }

    public C6134a(C6147f fVar) {
        this.f17216a = fVar;
    }

    /* renamed from: b */
    private C6113c0 m25066b(C6136b bVar, C6113c0 c0Var) throws IOException {
        C6299r body;
        if (bVar == null || (body = bVar.body()) == null) {
            return c0Var;
        }
        C6135a aVar = new C6135a(this, c0Var.mo17266a().mo17255r(), bVar, C6288l.m25932c(body));
        String q = c0Var.mo17272q(HttpConnection.CONTENT_TYPE);
        long j = c0Var.mo17266a().mo17253j();
        C6113c0.C6114a D = c0Var.mo17260D();
        D.mo17280b(new C6166h(q, j, C6288l.m25933d(aVar)));
        return D.mo17281c();
    }

    /* renamed from: c */
    private static C6255s m25067c(C6255s sVar, C6255s sVar2) {
        C6255s.C6256a aVar = new C6255s.C6256a();
        int h = sVar.mo17685h();
        for (int i = 0; i < h; i++) {
            String e = sVar.mo17682e(i);
            String i2 = sVar.mo17687i(i);
            if ((!"Warning".equalsIgnoreCase(e) || !i2.startsWith("1")) && (m25068d(e) || !m25069e(e) || sVar2.mo17681c(e) == null)) {
                C6128a.f17195a.mo17340b(aVar, e, i2);
            }
        }
        int h2 = sVar2.mo17685h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e2 = sVar2.mo17682e(i3);
            if (!m25068d(e2) && m25069e(e2)) {
                C6128a.f17195a.mo17340b(aVar, e2, sVar2.mo17687i(i3));
            }
        }
        return aVar.mo17693d();
    }

    /* renamed from: d */
    static boolean m25068d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(str) || HttpConnection.CONTENT_TYPE.equalsIgnoreCase(str);
    }

    /* renamed from: e */
    static boolean m25069e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: f */
    private static C6113c0 m25070f(C6113c0 c0Var) {
        if (c0Var == null || c0Var.mo17266a() == null) {
            return c0Var;
        }
        C6113c0.C6114a D = c0Var.mo17260D();
        D.mo17280b((C6117d0) null);
        return D.mo17281c();
    }

    /* renamed from: a */
    public C6113c0 mo16688a(C6259u.C6260a aVar) throws IOException {
        C6147f fVar = this.f17216a;
        C6113c0 a = fVar != null ? fVar.mo17244a(aVar.request()) : null;
        C6137c c = new C6137c.C6138a(System.currentTimeMillis(), aVar.request(), a).mo17357c();
        C6099a0 a0Var = c.f17221a;
        C6113c0 c0Var = c.f17222b;
        C6147f fVar2 = this.f17216a;
        if (fVar2 != null) {
            fVar2.mo17246c(c);
        }
        if (a != null && c0Var == null) {
            C6130c.m25044g(a.mo17266a());
        }
        if (a0Var == null && c0Var == null) {
            C6113c0.C6114a aVar2 = new C6113c0.C6114a();
            aVar2.mo17292p(aVar.request());
            aVar2.mo17290n(C6268y.HTTP_1_1);
            aVar2.mo17283g(504);
            aVar2.mo17287k("Unsatisfiable Request (only-if-cached)");
            aVar2.mo17280b(C6130c.f17199c);
            aVar2.mo17293q(-1);
            aVar2.mo17291o(System.currentTimeMillis());
            return aVar2.mo17281c();
        } else if (a0Var == null) {
            C6113c0.C6114a D = c0Var.mo17260D();
            D.mo17282d(m25070f(c0Var));
            return D.mo17281c();
        } else {
            try {
                C6113c0 d = aVar.mo17438d(a0Var);
                if (d == null && a != null) {
                }
                if (c0Var != null) {
                    if (d.mo17270m() == 304) {
                        C6113c0.C6114a D2 = c0Var.mo17260D();
                        D2.mo17286j(m25067c(c0Var.mo17274t(), d.mo17274t()));
                        D2.mo17293q(d.mo17265V());
                        D2.mo17291o(d.mo17263Q());
                        D2.mo17282d(m25070f(c0Var));
                        D2.mo17288l(m25070f(d));
                        C6113c0 c2 = D2.mo17281c();
                        d.mo17266a().close();
                        this.f17216a.mo17245b();
                        this.f17216a.mo17247d(c0Var, c2);
                        return c2;
                    }
                    C6130c.m25044g(c0Var.mo17266a());
                }
                C6113c0.C6114a D3 = d.mo17260D();
                D3.mo17282d(m25070f(c0Var));
                D3.mo17288l(m25070f(d));
                C6113c0 c3 = D3.mo17281c();
                if (this.f17216a != null) {
                    if (C6163e.m25193c(c3) && C6137c.m25074a(c3, a0Var)) {
                        return m25066b(this.f17216a.mo17249f(c3), c3);
                    }
                    if (C6164f.m25206a(a0Var.mo17218g())) {
                        try {
                            this.f17216a.mo17248e(a0Var);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c3;
            } finally {
                if (a != null) {
                    C6130c.m25044g(a.mo17266a());
                }
            }
        }
    }
}
