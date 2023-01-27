package p374m.p375g0.p379h;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.jsoup.helper.HttpConnection;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6255s;
import p374m.C6257t;
import p374m.C6265x;
import p374m.p375g0.C6128a;
import p374m.p375g0.C6130c;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6155g;
import p374m.p375g0.p378g.C6160c;
import p374m.p375g0.p378g.C6163e;
import p374m.p375g0.p378g.C6166h;
import p374m.p375g0.p378g.C6167i;
import p374m.p375g0.p378g.C6169k;
import p385n.C6277c;
import p385n.C6280d;
import p385n.C6281e;
import p385n.C6285i;
import p385n.C6288l;
import p385n.C6299r;
import p385n.C6300s;
import p385n.C6301t;

/* renamed from: m.g0.h.a */
public final class C6170a implements C6160c {

    /* renamed from: a */
    final C6265x f17351a;

    /* renamed from: b */
    final C6155g f17352b;

    /* renamed from: c */
    final C6281e f17353c;

    /* renamed from: d */
    final C6280d f17354d;

    /* renamed from: e */
    int f17355e = 0;

    /* renamed from: f */
    private long f17356f = 262144;

    /* renamed from: m.g0.h.a$b */
    private abstract class C6172b implements C6300s {

        /* renamed from: f */
        protected final C6285i f17357f;

        /* renamed from: g */
        protected boolean f17358g;

        /* renamed from: h */
        protected long f17359h;

        private C6172b() {
            this.f17357f = new C6285i(C6170a.this.f17353c.timeout());
            this.f17359h = 0;
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            try {
                long O = C6170a.this.f17353c.mo17355O(cVar, j);
                if (O > 0) {
                    this.f17359h += O;
                }
                return O;
            } catch (IOException e) {
                mo17458a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17458a(boolean z, IOException iOException) throws IOException {
            C6170a aVar = C6170a.this;
            int i = aVar.f17355e;
            if (i != 6) {
                if (i == 5) {
                    aVar.mo17450g(this.f17357f);
                    C6170a aVar2 = C6170a.this;
                    aVar2.f17355e = 6;
                    C6155g gVar = aVar2.f17352b;
                    if (gVar != null) {
                        gVar.mo17424r(!z, aVar2, this.f17359h, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + C6170a.this.f17355e);
            }
        }

        public C6301t timeout() {
            return this.f17357f;
        }
    }

    /* renamed from: m.g0.h.a$c */
    private final class C6173c implements C6299r {

        /* renamed from: f */
        private final C6285i f17361f = new C6285i(C6170a.this.f17354d.timeout());

        /* renamed from: g */
        private boolean f17362g;

        C6173c() {
        }

        public synchronized void close() throws IOException {
            if (!this.f17362g) {
                this.f17362g = true;
                C6170a.this.f17354d.mo17810Y("0\r\n\r\n");
                C6170a.this.mo17450g(this.f17361f);
                C6170a.this.f17355e = 3;
            }
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            if (this.f17362g) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C6170a.this.f17354d.mo17826i(j);
                C6170a.this.f17354d.mo17810Y("\r\n");
                C6170a.this.f17354d.mo17384f(cVar, j);
                C6170a.this.f17354d.mo17810Y("\r\n");
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f17362g) {
                C6170a.this.f17354d.flush();
            }
        }

        public C6301t timeout() {
            return this.f17361f;
        }
    }

    /* renamed from: m.g0.h.a$d */
    private class C6174d extends C6172b {

        /* renamed from: j */
        private final C6257t f17364j;

        /* renamed from: k */
        private long f17365k = -1;

        /* renamed from: l */
        private boolean f17366l = true;

        C6174d(C6257t tVar) {
            super();
            this.f17364j = tVar;
        }

        /* renamed from: h */
        private void m25256h() throws IOException {
            if (this.f17365k != -1) {
                C6170a.this.f17353c.mo17849s();
            }
            try {
                this.f17365k = C6170a.this.f17353c.mo17819d0();
                String trim = C6170a.this.f17353c.mo17849s().trim();
                if (this.f17365k < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f17365k + trim + "\"");
                } else if (this.f17365k == 0) {
                    this.f17366l = false;
                    C6163e.m25197g(C6170a.this.f17351a.mo17756l(), this.f17364j, C6170a.this.mo17456n());
                    mo17458a(true, (IOException) null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f17358g) {
                throw new IllegalStateException("closed");
            } else if (!this.f17366l) {
                return -1;
            } else {
                long j2 = this.f17365k;
                if (j2 == 0 || j2 == -1) {
                    m25256h();
                    if (!this.f17366l) {
                        return -1;
                    }
                }
                long O = super.mo17355O(cVar, Math.min(j, this.f17365k));
                if (O != -1) {
                    this.f17365k -= O;
                    return O;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo17458a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.f17358g) {
                if (this.f17366l && !C6130c.m25053p(this, 100, TimeUnit.MILLISECONDS)) {
                    mo17458a(false, (IOException) null);
                }
                this.f17358g = true;
            }
        }
    }

    /* renamed from: m.g0.h.a$e */
    private final class C6175e implements C6299r {

        /* renamed from: f */
        private final C6285i f17368f = new C6285i(C6170a.this.f17354d.timeout());

        /* renamed from: g */
        private boolean f17369g;

        /* renamed from: h */
        private long f17370h;

        C6175e(long j) {
            this.f17370h = j;
        }

        public void close() throws IOException {
            if (!this.f17369g) {
                this.f17369g = true;
                if (this.f17370h <= 0) {
                    C6170a.this.mo17450g(this.f17368f);
                    C6170a.this.f17355e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            if (!this.f17369g) {
                C6130c.m25043f(cVar.mo17834l0(), 0, j);
                if (j <= this.f17370h) {
                    C6170a.this.f17354d.mo17384f(cVar, j);
                    this.f17370h -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f17370h + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }

        public void flush() throws IOException {
            if (!this.f17369g) {
                C6170a.this.f17354d.flush();
            }
        }

        public C6301t timeout() {
            return this.f17368f;
        }
    }

    /* renamed from: m.g0.h.a$f */
    private class C6176f extends C6172b {

        /* renamed from: j */
        private long f17372j;

        C6176f(C6170a aVar, long j) throws IOException {
            super();
            this.f17372j = j;
            if (j == 0) {
                mo17458a(true, (IOException) null);
            }
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f17358g) {
                long j2 = this.f17372j;
                if (j2 == 0) {
                    return -1;
                }
                long O = super.mo17355O(cVar, Math.min(j2, j));
                if (O != -1) {
                    long j3 = this.f17372j - O;
                    this.f17372j = j3;
                    if (j3 == 0) {
                        mo17458a(true, (IOException) null);
                    }
                    return O;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo17458a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f17358g) {
                if (this.f17372j != 0 && !C6130c.m25053p(this, 100, TimeUnit.MILLISECONDS)) {
                    mo17458a(false, (IOException) null);
                }
                this.f17358g = true;
            }
        }
    }

    /* renamed from: m.g0.h.a$g */
    private class C6177g extends C6172b {

        /* renamed from: j */
        private boolean f17373j;

        C6177g(C6170a aVar) {
            super();
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f17358g) {
                throw new IllegalStateException("closed");
            } else if (this.f17373j) {
                return -1;
            } else {
                long O = super.mo17355O(cVar, j);
                if (O != -1) {
                    return O;
                }
                this.f17373j = true;
                mo17458a(true, (IOException) null);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.f17358g) {
                if (!this.f17373j) {
                    mo17458a(false, (IOException) null);
                }
                this.f17358g = true;
            }
        }
    }

    public C6170a(C6265x xVar, C6155g gVar, C6281e eVar, C6280d dVar) {
        this.f17351a = xVar;
        this.f17352b = gVar;
        this.f17353c = eVar;
        this.f17354d = dVar;
    }

    /* renamed from: m */
    private String m25238m() throws IOException {
        String P = this.f17353c.mo17806P(this.f17356f);
        this.f17356f -= (long) P.length();
        return P;
    }

    /* renamed from: a */
    public void mo17426a() throws IOException {
        this.f17354d.flush();
    }

    /* renamed from: b */
    public void mo17427b(C6099a0 a0Var) throws IOException {
        mo17457o(a0Var.mo17216e(), C6167i.m25224a(a0Var, this.f17352b.mo17416d().mo17397p().mo17320b().type()));
    }

    /* renamed from: c */
    public C6117d0 mo17428c(C6113c0 c0Var) throws IOException {
        C6155g gVar = this.f17352b;
        gVar.f17313f.mo17666q(gVar.f17312e);
        String q = c0Var.mo17272q(HttpConnection.CONTENT_TYPE);
        if (!C6163e.m25193c(c0Var)) {
            return new C6166h(q, 0, C6288l.m25933d(mo17454k(0)));
        }
        if ("chunked".equalsIgnoreCase(c0Var.mo17272q("Transfer-Encoding"))) {
            return new C6166h(q, -1, C6288l.m25933d(mo17452i(c0Var.mo17264S().mo17221j())));
        }
        long b = C6163e.m25192b(c0Var);
        return b != -1 ? new C6166h(q, b, C6288l.m25933d(mo17454k(b))) : new C6166h(q, -1, C6288l.m25933d(mo17455l()));
    }

    public void cancel() {
        C6150c d = this.f17352b.mo17416d();
        if (d != null) {
            d.mo17390c();
        }
    }

    /* renamed from: d */
    public void mo17430d() throws IOException {
        this.f17354d.flush();
    }

    /* renamed from: e */
    public C6299r mo17431e(C6099a0 a0Var, long j) {
        if ("chunked".equalsIgnoreCase(a0Var.mo17214c("Transfer-Encoding"))) {
            return mo17451h();
        }
        if (j != -1) {
            return mo17453j(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: f */
    public C6113c0.C6114a mo17432f(boolean z) throws IOException {
        int i = this.f17355e;
        if (i == 1 || i == 3) {
            try {
                C6169k a = C6169k.m25237a(m25238m());
                C6113c0.C6114a aVar = new C6113c0.C6114a();
                aVar.mo17290n(a.f17348a);
                aVar.mo17283g(a.f17349b);
                aVar.mo17287k(a.f17350c);
                aVar.mo17286j(mo17456n());
                if (z && a.f17349b == 100) {
                    return null;
                }
                if (a.f17349b == 100) {
                    this.f17355e = 3;
                    return aVar;
                }
                this.f17355e = 4;
                return aVar;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f17352b);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f17355e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17450g(C6285i iVar) {
        C6301t i = iVar.mo17906i();
        iVar.mo17907j(C6301t.f17821d);
        i.mo17898a();
        i.mo17899b();
    }

    /* renamed from: h */
    public C6299r mo17451h() {
        if (this.f17355e == 1) {
            this.f17355e = 2;
            return new C6173c();
        }
        throw new IllegalStateException("state: " + this.f17355e);
    }

    /* renamed from: i */
    public C6300s mo17452i(C6257t tVar) throws IOException {
        if (this.f17355e == 4) {
            this.f17355e = 5;
            return new C6174d(tVar);
        }
        throw new IllegalStateException("state: " + this.f17355e);
    }

    /* renamed from: j */
    public C6299r mo17453j(long j) {
        if (this.f17355e == 1) {
            this.f17355e = 2;
            return new C6175e(j);
        }
        throw new IllegalStateException("state: " + this.f17355e);
    }

    /* renamed from: k */
    public C6300s mo17454k(long j) throws IOException {
        if (this.f17355e == 4) {
            this.f17355e = 5;
            return new C6176f(this, j);
        }
        throw new IllegalStateException("state: " + this.f17355e);
    }

    /* renamed from: l */
    public C6300s mo17455l() throws IOException {
        if (this.f17355e == 4) {
            C6155g gVar = this.f17352b;
            if (gVar != null) {
                this.f17355e = 5;
                gVar.mo17419j();
                return new C6177g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f17355e);
    }

    /* renamed from: n */
    public C6255s mo17456n() throws IOException {
        C6255s.C6256a aVar = new C6255s.C6256a();
        while (true) {
            String m = m25238m();
            if (m.length() == 0) {
                return aVar.mo17693d();
            }
            C6128a.f17195a.mo17339a(aVar, m);
        }
    }

    /* renamed from: o */
    public void mo17457o(C6255s sVar, String str) throws IOException {
        if (this.f17355e == 0) {
            this.f17354d.mo17810Y(str).mo17810Y("\r\n");
            int h = sVar.mo17685h();
            for (int i = 0; i < h; i++) {
                this.f17354d.mo17810Y(sVar.mo17682e(i)).mo17810Y(": ").mo17810Y(sVar.mo17687i(i)).mo17810Y("\r\n");
            }
            this.f17354d.mo17810Y("\r\n");
            this.f17355e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f17355e);
    }
}
