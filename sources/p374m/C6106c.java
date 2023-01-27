package p374m;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jsoup.helper.HttpConnection;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6255s;
import p374m.p375g0.C6130c;
import p374m.p375g0.p376e.C6136b;
import p374m.p375g0.p376e.C6137c;
import p374m.p375g0.p376e.C6139d;
import p374m.p375g0.p376e.C6147f;
import p374m.p375g0.p378g.C6163e;
import p374m.p375g0.p378g.C6164f;
import p374m.p375g0.p378g.C6169k;
import p374m.p375g0.p381j.C6217a;
import p374m.p375g0.p382k.C6228f;
import p385n.C6277c;
import p385n.C6280d;
import p385n.C6281e;
import p385n.C6282f;
import p385n.C6283g;
import p385n.C6284h;
import p385n.C6288l;
import p385n.C6299r;
import p385n.C6300s;

/* renamed from: m.c */
public final class C6106c implements Closeable, Flushable {

    /* renamed from: f */
    final C6147f f17088f;

    /* renamed from: g */
    final C6139d f17089g;

    /* renamed from: h */
    int f17090h;

    /* renamed from: i */
    int f17091i;

    /* renamed from: j */
    private int f17092j;

    /* renamed from: k */
    private int f17093k;

    /* renamed from: l */
    private int f17094l;

    /* renamed from: m.c$a */
    class C6107a implements C6147f {
        C6107a() {
        }

        /* renamed from: a */
        public C6113c0 mo17244a(C6099a0 a0Var) throws IOException {
            return C6106c.this.mo17238h(a0Var);
        }

        /* renamed from: b */
        public void mo17245b() {
            C6106c.this.mo17241r();
        }

        /* renamed from: c */
        public void mo17246c(C6137c cVar) {
            C6106c.this.mo17242t(cVar);
        }

        /* renamed from: d */
        public void mo17247d(C6113c0 c0Var, C6113c0 c0Var2) {
            C6106c.this.mo17243u(c0Var, c0Var2);
        }

        /* renamed from: e */
        public void mo17248e(C6099a0 a0Var) throws IOException {
            C6106c.this.mo17240q(a0Var);
        }

        /* renamed from: f */
        public C6136b mo17249f(C6113c0 c0Var) throws IOException {
            return C6106c.this.mo17239m(c0Var);
        }
    }

    /* renamed from: m.c$b */
    private final class C6108b implements C6136b {

        /* renamed from: a */
        private final C6139d.C6142c f17096a;

        /* renamed from: b */
        private C6299r f17097b;

        /* renamed from: c */
        private C6299r f17098c;

        /* renamed from: d */
        boolean f17099d;

        /* renamed from: m.c$b$a */
        class C6109a extends C6283g {

            /* renamed from: g */
            final /* synthetic */ C6106c f17101g;

            /* renamed from: h */
            final /* synthetic */ C6139d.C6142c f17102h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6109a(C6299r rVar, C6106c cVar, C6139d.C6142c cVar2) {
                super(rVar);
                this.f17101g = cVar;
                this.f17102h = cVar2;
            }

            public void close() throws IOException {
                synchronized (C6106c.this) {
                    if (!C6108b.this.f17099d) {
                        C6108b.this.f17099d = true;
                        C6106c.this.f17090h++;
                        super.close();
                        this.f17102h.mo17375b();
                    }
                }
            }
        }

        C6108b(C6139d.C6142c cVar) {
            this.f17096a = cVar;
            C6299r d = cVar.mo17377d(1);
            this.f17097b = d;
            this.f17098c = new C6109a(d, C6106c.this, cVar);
        }

        /* renamed from: a */
        public void mo17250a() {
            synchronized (C6106c.this) {
                if (!this.f17099d) {
                    this.f17099d = true;
                    C6106c.this.f17091i++;
                    C6130c.m25044g(this.f17097b);
                    try {
                        this.f17096a.mo17374a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public C6299r body() {
            return this.f17098c;
        }
    }

    /* renamed from: m.c$c */
    private static class C6110c extends C6117d0 {

        /* renamed from: g */
        final C6139d.C6145e f17104g;

        /* renamed from: h */
        private final C6281e f17105h;

        /* renamed from: i */
        private final String f17106i;

        /* renamed from: j */
        private final String f17107j;

        /* renamed from: m.c$c$a */
        class C6111a extends C6284h {

            /* renamed from: g */
            final /* synthetic */ C6139d.C6145e f17108g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6111a(C6300s sVar, C6139d.C6145e eVar) {
                super(sVar);
                this.f17108g = eVar;
            }

            public void close() throws IOException {
                this.f17108g.close();
                super.close();
            }
        }

        C6110c(C6139d.C6145e eVar, String str, String str2) {
            this.f17104g = eVar;
            this.f17106i = str;
            this.f17107j = str2;
            this.f17105h = C6288l.m25933d(new C6111a(eVar.mo17383h(1), eVar));
        }

        /* renamed from: j */
        public long mo17253j() {
            try {
                if (this.f17107j != null) {
                    return Long.parseLong(this.f17107j);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: m */
        public C6261v mo17254m() {
            String str = this.f17106i;
            if (str != null) {
                return C6261v.m25704c(str);
            }
            return null;
        }

        /* renamed from: r */
        public C6281e mo17255r() {
            return this.f17105h;
        }
    }

    /* renamed from: m.c$d */
    private static final class C6112d {

        /* renamed from: k */
        private static final String f17110k = (C6228f.m25514j().mo17600k() + "-Sent-Millis");

        /* renamed from: l */
        private static final String f17111l = (C6228f.m25514j().mo17600k() + "-Received-Millis");

        /* renamed from: a */
        private final String f17112a;

        /* renamed from: b */
        private final C6255s f17113b;

        /* renamed from: c */
        private final String f17114c;

        /* renamed from: d */
        private final C6268y f17115d;

        /* renamed from: e */
        private final int f17116e;

        /* renamed from: f */
        private final String f17117f;

        /* renamed from: g */
        private final C6255s f17118g;

        /* renamed from: h */
        private final C6254r f17119h;

        /* renamed from: i */
        private final long f17120i;

        /* renamed from: j */
        private final long f17121j;

        C6112d(C6113c0 c0Var) {
            this.f17112a = c0Var.mo17264S().mo17221j().toString();
            this.f17113b = C6163e.m25204n(c0Var);
            this.f17114c = c0Var.mo17264S().mo17218g();
            this.f17115d = c0Var.mo17262J();
            this.f17116e = c0Var.mo17270m();
            this.f17117f = c0Var.mo17277w();
            this.f17118g = c0Var.mo17274t();
            this.f17119h = c0Var.mo17271o();
            this.f17120i = c0Var.mo17265V();
            this.f17121j = c0Var.mo17263Q();
        }

        C6112d(C6300s sVar) throws IOException {
            try {
                C6281e d = C6288l.m25933d(sVar);
                this.f17112a = d.mo17849s();
                this.f17114c = d.mo17849s();
                C6255s.C6256a aVar = new C6255s.C6256a();
                int o = C6106c.m24913o(d);
                for (int i = 0; i < o; i++) {
                    aVar.mo17691b(d.mo17849s());
                }
                this.f17113b = aVar.mo17693d();
                C6169k a = C6169k.m25237a(d.mo17849s());
                this.f17115d = a.f17348a;
                this.f17116e = a.f17349b;
                this.f17117f = a.f17350c;
                C6255s.C6256a aVar2 = new C6255s.C6256a();
                int o2 = C6106c.m24913o(d);
                for (int i2 = 0; i2 < o2; i2++) {
                    aVar2.mo17691b(d.mo17849s());
                }
                String e = aVar2.mo17694e(f17110k);
                String e2 = aVar2.mo17694e(f17111l);
                aVar2.mo17695f(f17110k);
                aVar2.mo17695f(f17111l);
                long j = 0;
                this.f17120i = e != null ? Long.parseLong(e) : 0;
                this.f17121j = e2 != null ? Long.parseLong(e2) : j;
                this.f17118g = aVar2.mo17693d();
                if (m24930a()) {
                    String s = d.mo17849s();
                    if (s.length() <= 0) {
                        this.f17119h = C6254r.m25623c(!d.mo17794A() ? C6124f0.m25005e(d.mo17849s()) : C6124f0.SSL_3_0, C6235h.m25541a(d.mo17849s()), m24931c(d), m24931c(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + s + "\"");
                    }
                } else {
                    this.f17119h = null;
                }
            } finally {
                sVar.close();
            }
        }

        /* renamed from: a */
        private boolean m24930a() {
            return this.f17112a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m24931c(C6281e eVar) throws IOException {
            int o = C6106c.m24913o(eVar);
            if (o == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(o);
                for (int i = 0; i < o; i++) {
                    String s = eVar.mo17849s();
                    C6277c cVar = new C6277c();
                    cVar.mo17839p0(C6282f.m25887j(s));
                    arrayList.add(instance.generateCertificate(cVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: e */
        private void m24932e(C6280d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.mo17811Z((long) list.size()).mo17796B(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo17810Y(C6282f.m25892s(list.get(i).getEncoded()).mo17880e()).mo17796B(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean mo17257b(C6099a0 a0Var, C6113c0 c0Var) {
            return this.f17112a.equals(a0Var.mo17221j().toString()) && this.f17114c.equals(a0Var.mo17218g()) && C6163e.m25205o(c0Var, this.f17113b, a0Var);
        }

        /* renamed from: d */
        public C6113c0 mo17258d(C6139d.C6145e eVar) {
            String c = this.f17118g.mo17681c(HttpConnection.CONTENT_TYPE);
            String c2 = this.f17118g.mo17681c("Content-Length");
            C6099a0.C6100a aVar = new C6099a0.C6100a();
            aVar.mo17230h(this.f17112a);
            aVar.mo17227e(this.f17114c, (C6103b0) null);
            aVar.mo17226d(this.f17113b);
            C6099a0 a = aVar.mo17223a();
            C6113c0.C6114a aVar2 = new C6113c0.C6114a();
            aVar2.mo17292p(a);
            aVar2.mo17290n(this.f17115d);
            aVar2.mo17283g(this.f17116e);
            aVar2.mo17287k(this.f17117f);
            aVar2.mo17286j(this.f17118g);
            aVar2.mo17280b(new C6110c(eVar, c, c2));
            aVar2.mo17284h(this.f17119h);
            aVar2.mo17293q(this.f17120i);
            aVar2.mo17291o(this.f17121j);
            return aVar2.mo17281c();
        }

        /* renamed from: f */
        public void mo17259f(C6139d.C6142c cVar) throws IOException {
            C6280d c = C6288l.m25932c(cVar.mo17377d(0));
            c.mo17810Y(this.f17112a).mo17796B(10);
            c.mo17810Y(this.f17114c).mo17796B(10);
            c.mo17811Z((long) this.f17113b.mo17685h()).mo17796B(10);
            int h = this.f17113b.mo17685h();
            for (int i = 0; i < h; i++) {
                c.mo17810Y(this.f17113b.mo17682e(i)).mo17810Y(": ").mo17810Y(this.f17113b.mo17687i(i)).mo17796B(10);
            }
            c.mo17810Y(new C6169k(this.f17115d, this.f17116e, this.f17117f).toString()).mo17796B(10);
            c.mo17811Z((long) (this.f17118g.mo17685h() + 2)).mo17796B(10);
            int h2 = this.f17118g.mo17685h();
            for (int i2 = 0; i2 < h2; i2++) {
                c.mo17810Y(this.f17118g.mo17682e(i2)).mo17810Y(": ").mo17810Y(this.f17118g.mo17687i(i2)).mo17796B(10);
            }
            c.mo17810Y(f17110k).mo17810Y(": ").mo17811Z(this.f17120i).mo17796B(10);
            c.mo17810Y(f17111l).mo17810Y(": ").mo17811Z(this.f17121j).mo17796B(10);
            if (m24930a()) {
                c.mo17796B(10);
                c.mo17810Y(this.f17119h.mo17675a().mo17611d()).mo17796B(10);
                m24932e(c, this.f17119h.mo17677e());
                m24932e(c, this.f17119h.mo17676d());
                c.mo17810Y(this.f17119h.mo17679f().mo17328h()).mo17796B(10);
            }
            c.close();
        }
    }

    public C6106c(File file, long j) {
        this(file, j, C6217a.f17543a);
    }

    C6106c(File file, long j, C6217a aVar) {
        this.f17088f = new C6107a();
        this.f17089g = C6139d.m25086j(aVar, file, 201105, 2, j);
    }

    /* renamed from: a */
    private void m24911a(C6139d.C6142c cVar) {
        if (cVar != null) {
            try {
                cVar.mo17374a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: j */
    public static String m24912j(C6257t tVar) {
        return C6282f.m25891n(tVar.toString()).mo17886r().mo17885q();
    }

    /* renamed from: o */
    static int m24913o(C6281e eVar) throws IOException {
        try {
            long M = eVar.mo17805M();
            String s = eVar.mo17849s();
            if (M >= 0 && M <= 2147483647L && s.isEmpty()) {
                return (int) M;
            }
            throw new IOException("expected an int but was \"" + M + s + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void close() throws IOException {
        this.f17089g.close();
    }

    public void flush() throws IOException {
        this.f17089g.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C6113c0 mo17238h(C6099a0 a0Var) {
        try {
            C6139d.C6145e r = this.f17089g.mo17368r(m24912j(a0Var.mo17221j()));
            if (r == null) {
                return null;
            }
            try {
                C6112d dVar = new C6112d(r.mo17383h(0));
                C6113c0 d = dVar.mo17258d(r);
                if (dVar.mo17257b(a0Var, d)) {
                    return d;
                }
                C6130c.m25044g(d.mo17266a());
                return null;
            } catch (IOException unused) {
                C6130c.m25044g(r);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C6136b mo17239m(C6113c0 c0Var) {
        C6139d.C6142c cVar;
        String g = c0Var.mo17264S().mo17218g();
        if (C6164f.m25206a(c0Var.mo17264S().mo17218g())) {
            try {
                mo17240q(c0Var.mo17264S());
            } catch (IOException unused) {
            }
            return null;
        } else if (!g.equals("GET") || C6163e.m25195e(c0Var)) {
            return null;
        } else {
            C6112d dVar = new C6112d(c0Var);
            try {
                cVar = this.f17089g.mo17366o(m24912j(c0Var.mo17264S().mo17221j()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.mo17259f(cVar);
                    return new C6108b(cVar);
                } catch (IOException unused2) {
                    m24911a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                m24911a(cVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo17240q(C6099a0 a0Var) throws IOException {
        this.f17089g.mo17359S(m24912j(a0Var.mo17221j()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo17241r() {
        this.f17093k++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized void mo17242t(C6137c cVar) {
        this.f17094l++;
        if (cVar.f17221a != null) {
            this.f17092j++;
        } else if (cVar.f17222b != null) {
            this.f17093k++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo17243u(C6113c0 c0Var, C6113c0 c0Var2) {
        C6139d.C6142c cVar;
        C6112d dVar = new C6112d(c0Var2);
        try {
            cVar = ((C6110c) c0Var.mo17266a()).f17104g.mo17381a();
            if (cVar != null) {
                try {
                    dVar.mo17259f(cVar);
                    cVar.mo17375b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            m24911a(cVar);
        }
    }
}
