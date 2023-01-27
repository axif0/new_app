package p374m.p375g0.p377f;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p374m.C6098a;
import p374m.C6099a0;
import p374m.C6103b0;
import p374m.C6113c0;
import p374m.C6120e;
import p374m.C6122e0;
import p374m.C6237i;
import p374m.C6238j;
import p374m.C6248p;
import p374m.C6254r;
import p374m.C6257t;
import p374m.C6259u;
import p374m.C6265x;
import p374m.C6268y;
import p374m.p375g0.C6128a;
import p374m.p375g0.C6130c;
import p374m.p375g0.C6133d;
import p374m.p375g0.p378g.C6160c;
import p374m.p375g0.p378g.C6163e;
import p374m.p375g0.p379h.C6170a;
import p374m.p375g0.p380i.C6179b;
import p374m.p375g0.p380i.C6186f;
import p374m.p375g0.p380i.C6188g;
import p374m.p375g0.p380i.C6206i;
import p374m.p375g0.p382k.C6228f;
import p374m.p375g0.p384m.C6233d;
import p385n.C6280d;
import p385n.C6281e;
import p385n.C6288l;
import p385n.C6300s;

/* renamed from: m.g0.f.c */
public final class C6150c extends C6188g.C6196h implements C6237i {

    /* renamed from: b */
    private final C6238j f17281b;

    /* renamed from: c */
    private final C6122e0 f17282c;

    /* renamed from: d */
    private Socket f17283d;

    /* renamed from: e */
    private Socket f17284e;

    /* renamed from: f */
    private C6254r f17285f;

    /* renamed from: g */
    private C6268y f17286g;

    /* renamed from: h */
    private C6188g f17287h;

    /* renamed from: i */
    private C6281e f17288i;

    /* renamed from: j */
    private C6280d f17289j;

    /* renamed from: k */
    public boolean f17290k;

    /* renamed from: l */
    public int f17291l;

    /* renamed from: m */
    public int f17292m = 1;

    /* renamed from: n */
    public final List<Reference<C6155g>> f17293n = new ArrayList();

    /* renamed from: o */
    public long f17294o = Long.MAX_VALUE;

    public C6150c(C6238j jVar, C6122e0 e0Var) {
        this.f17281b = jVar;
        this.f17282c = e0Var;
    }

    /* renamed from: e */
    private void m25124e(int i, int i2, C6120e eVar, C6248p pVar) throws IOException {
        Proxy b = this.f17282c.mo17320b();
        this.f17283d = (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) ? this.f17282c.mo17319a().mo17208j().createSocket() : new Socket(b);
        pVar.mo17656f(eVar, this.f17282c.mo17322d(), b);
        this.f17283d.setSoTimeout(i2);
        try {
            C6228f.m25514j().mo17577h(this.f17283d, this.f17282c.mo17322d(), i);
            try {
                this.f17288i = C6288l.m25933d(C6288l.m25942m(this.f17283d));
                this.f17289j = C6288l.m25932c(C6288l.m25938i(this.f17283d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f17282c.mo17322d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010f A[Catch:{ all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115 A[Catch:{ all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25125f(p374m.p375g0.p377f.C6149b r8) throws java.io.IOException {
        /*
            r7 = this;
            m.e0 r0 = r7.f17282c
            m.a r0 = r0.mo17319a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo17209k()
            r2 = 0
            java.net.Socket r3 = r7.f17283d     // Catch:{ AssertionError -> 0x0108 }
            m.t r4 = r0.mo17210l()     // Catch:{ AssertionError -> 0x0108 }
            java.lang.String r4 = r4.mo17709m()     // Catch:{ AssertionError -> 0x0108 }
            m.t r5 = r0.mo17210l()     // Catch:{ AssertionError -> 0x0108 }
            int r5 = r5.mo17715y()     // Catch:{ AssertionError -> 0x0108 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0108 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0108 }
            m.k r8 = r8.mo17386a(r1)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            boolean r3 = r8.mo17626f()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r3 == 0) goto L_0x0041
            m.g0.k.f r3 = p374m.p375g0.p382k.C6228f.m25514j()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            m.t r4 = r0.mo17210l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r4 = r4.mo17709m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.util.List r5 = r0.mo17203f()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.mo17576g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            m.r r4 = p374m.C6254r.m25622b(r3)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo17201e()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            m.t r6 = r0.mo17210l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r6 = r6.mo17709m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r3 == 0) goto L_0x00ae
            m.g r3 = r0.mo17197a()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            m.t r0 = r0.mo17210l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = r0.mo17709m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.util.List r5 = r4.mo17677e()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.mo17329a(r0, r5)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            boolean r8 = r8.mo17626f()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r8 == 0) goto L_0x007f
            m.g0.k.f r8 = p374m.p375g0.p382k.C6228f.m25514j()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r2 = r8.mo17579m(r1)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x007f:
            r7.f17284e = r1     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            n.s r8 = p385n.C6288l.m25942m(r1)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            n.e r8 = p385n.C6288l.m25933d(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r7.f17288i = r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.net.Socket r8 = r7.f17284e     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            n.r r8 = p385n.C6288l.m25938i(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            n.d r8 = p385n.C6288l.m25932c(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r7.f17289j = r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r7.f17285f = r4     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r2 == 0) goto L_0x00a0
            m.y r8 = p374m.C6268y.m25765e(r2)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            goto L_0x00a2
        L_0x00a0:
            m.y r8 = p374m.C6268y.HTTP_1_1     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x00a2:
            r7.f17286g = r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r1 == 0) goto L_0x00ad
            m.g0.k.f r8 = p374m.p375g0.p382k.C6228f.m25514j()
            r8.mo17593a(r1)
        L_0x00ad:
            return
        L_0x00ae:
            java.util.List r8 = r4.mo17677e()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.<init>()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r4 = "Hostname "
            r3.append(r4)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            m.t r0 = r0.mo17210l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = r0.mo17709m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = p374m.C6125g.m25008c(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.util.List r8 = p374m.p375g0.p384m.C6233d.m25534a(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            throw r2     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x0100:
            r8 = move-exception
            r2 = r1
            goto L_0x0116
        L_0x0103:
            r8 = move-exception
            r2 = r1
            goto L_0x0109
        L_0x0106:
            r8 = move-exception
            goto L_0x0116
        L_0x0108:
            r8 = move-exception
        L_0x0109:
            boolean r0 = p374m.p375g0.C6130c.m25028A(r8)     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0115
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0106 }
            r0.<init>(r8)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0115:
            throw r8     // Catch:{ all -> 0x0106 }
        L_0x0116:
            if (r2 == 0) goto L_0x011f
            m.g0.k.f r0 = p374m.p375g0.p382k.C6228f.m25514j()
            r0.mo17593a(r2)
        L_0x011f:
            p374m.p375g0.C6130c.m25045h(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p377f.C6150c.m25125f(m.g0.f.b):void");
    }

    /* renamed from: g */
    private void m25126g(int i, int i2, int i3, C6120e eVar, C6248p pVar) throws IOException {
        C6099a0 i4 = m25128i();
        C6257t j = i4.mo17221j();
        int i5 = 0;
        while (i5 < 21) {
            m25124e(i, i2, eVar, pVar);
            i4 = m25127h(i2, i3, i4, j);
            if (i4 != null) {
                C6130c.m25045h(this.f17283d);
                this.f17283d = null;
                this.f17289j = null;
                this.f17288i = null;
                pVar.mo17654d(eVar, this.f17282c.mo17322d(), this.f17282c.mo17320b(), (C6268y) null);
                i5++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private C6099a0 m25127h(int i, int i2, C6099a0 a0Var, C6257t tVar) throws IOException {
        String str = "CONNECT " + C6130c.m25056s(tVar, true) + " HTTP/1.1";
        while (true) {
            C6170a aVar = new C6170a((C6265x) null, (C6155g) null, this.f17288i, this.f17289j);
            this.f17288i.timeout().mo17904g((long) i, TimeUnit.MILLISECONDS);
            this.f17289j.timeout().mo17904g((long) i2, TimeUnit.MILLISECONDS);
            aVar.mo17457o(a0Var.mo17216e(), str);
            aVar.mo17426a();
            C6113c0.C6114a f = aVar.mo17432f(false);
            f.mo17292p(a0Var);
            C6113c0 c = f.mo17281c();
            long b = C6163e.m25192b(c);
            if (b == -1) {
                b = 0;
            }
            C6300s k = aVar.mo17454k(b);
            C6130c.m25031D(k, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            k.close();
            int m = c.mo17270m();
            if (m != 200) {
                if (m == 407) {
                    C6099a0 a = this.f17282c.mo17319a().mo17205h().mo17232a(this.f17282c, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c.mo17272q("Connection"))) {
                        return a;
                    } else {
                        a0Var = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.mo17270m());
                }
            } else if (this.f17288i.mo17813b().mo17794A() && this.f17289j.mo17813b().mo17794A()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: i */
    private C6099a0 m25128i() throws IOException {
        C6099a0.C6100a aVar = new C6099a0.C6100a();
        aVar.mo17231i(this.f17282c.mo17319a().mo17210l());
        aVar.mo17227e("CONNECT", (C6103b0) null);
        aVar.mo17225c("Host", C6130c.m25056s(this.f17282c.mo17319a().mo17210l(), true));
        aVar.mo17225c("Proxy-Connection", "Keep-Alive");
        aVar.mo17225c("User-Agent", C6133d.m25065a());
        C6099a0 a = aVar.mo17223a();
        C6113c0.C6114a aVar2 = new C6113c0.C6114a();
        aVar2.mo17292p(a);
        aVar2.mo17290n(C6268y.HTTP_1_1);
        aVar2.mo17283g(407);
        aVar2.mo17287k("Preemptive Authenticate");
        aVar2.mo17280b(C6130c.f17199c);
        aVar2.mo17293q(-1);
        aVar2.mo17291o(-1);
        aVar2.mo17285i("Proxy-Authenticate", "OkHttp-Preemptive");
        C6099a0 a2 = this.f17282c.mo17319a().mo17205h().mo17232a(this.f17282c, aVar2.mo17281c());
        return a2 != null ? a2 : a;
    }

    /* renamed from: j */
    private void m25129j(C6149b bVar, int i, C6120e eVar, C6248p pVar) throws IOException {
        if (this.f17282c.mo17319a().mo17209k() != null) {
            pVar.mo17670u(eVar);
            m25125f(bVar);
            pVar.mo17669t(eVar, this.f17285f);
            if (this.f17286g == C6268y.HTTP_2) {
                m25130r(i);
            }
        } else if (this.f17282c.mo17319a().mo17203f().contains(C6268y.H2_PRIOR_KNOWLEDGE)) {
            this.f17284e = this.f17283d;
            this.f17286g = C6268y.H2_PRIOR_KNOWLEDGE;
            m25130r(i);
        } else {
            this.f17284e = this.f17283d;
            this.f17286g = C6268y.HTTP_1_1;
        }
    }

    /* renamed from: r */
    private void m25130r(int i) throws IOException {
        this.f17284e.setSoTimeout(0);
        C6188g.C6195g gVar = new C6188g.C6195g(true);
        gVar.mo17497d(this.f17284e, this.f17282c.mo17319a().mo17210l().mo17709m(), this.f17288i, this.f17289j);
        gVar.mo17495b(this);
        gVar.mo17496c(i);
        C6188g a = gVar.mo17494a();
        this.f17287h = a;
        a.mo17480e0();
    }

    /* renamed from: a */
    public void mo17388a(C6188g gVar) {
        synchronized (this.f17281b) {
            this.f17292m = gVar.mo17492u();
        }
    }

    /* renamed from: b */
    public void mo17389b(C6206i iVar) throws IOException {
        iVar.mo17514f(C6179b.REFUSED_STREAM);
    }

    /* renamed from: c */
    public void mo17390c() {
        C6130c.m25045h(this.f17283d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17391d(int r17, int r18, int r19, int r20, boolean r21, p374m.C6120e r22, p374m.C6248p r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            m.y r0 = r7.f17286g
            if (r0 != 0) goto L_0x0150
            m.e0 r0 = r7.f17282c
            m.a r0 = r0.mo17319a()
            java.util.List r0 = r0.mo17198b()
            m.g0.f.b r10 = new m.g0.f.b
            r10.<init>(r0)
            m.e0 r1 = r7.f17282c
            m.a r1 = r1.mo17319a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo17209k()
            if (r1 != 0) goto L_0x0074
            m.k r1 = p374m.C6240k.f17606h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            m.e0 r0 = r7.f17282c
            m.a r0 = r0.mo17319a()
            m.t r0 = r0.mo17210l()
            java.lang.String r0 = r0.mo17709m()
            m.g0.k.f r1 = p374m.p375g0.p382k.C6228f.m25514j()
            boolean r1 = r1.mo17581o(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            m.g0.f.e r1 = new m.g0.f.e
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            m.g0.f.e r0 = new m.g0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            m.e0 r0 = r7.f17282c
            m.a r0 = r0.mo17319a()
            java.util.List r0 = r0.mo17203f()
            m.y r1 = p374m.C6268y.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            m.e0 r0 = r7.f17282c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo17321c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m25126g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f17283d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m25124e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m25129j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            m.e0 r0 = r7.f17282c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo17322d()     // Catch:{ IOException -> 0x00f5 }
            m.e0 r1 = r7.f17282c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo17320b()     // Catch:{ IOException -> 0x00f5 }
            m.y r2 = r7.f17286g     // Catch:{ IOException -> 0x00f5 }
            r9.mo17654d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            m.e0 r0 = r7.f17282c
            boolean r0 = r0.mo17321c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f17283d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            m.g0.f.e r1 = new m.g0.f.e
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            m.g0.i.g r0 = r7.f17287h
            if (r0 == 0) goto L_0x00f4
            m.j r1 = r7.f17281b
            monitor-enter(r1)
            m.g0.i.g r0 = r7.f17287h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo17492u()     // Catch:{ all -> 0x00f1 }
            r7.f17292m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f17284e
            p374m.p375g0.C6130c.m25045h(r1)
            java.net.Socket r1 = r7.f17283d
            p374m.p375g0.C6130c.m25045h(r1)
            r7.f17284e = r11
            r7.f17283d = r11
            r7.f17288i = r11
            r7.f17289j = r11
            r7.f17285f = r11
            r7.f17286g = r11
            r7.f17287h = r11
            m.e0 r1 = r7.f17282c
            java.net.InetSocketAddress r3 = r1.mo17322d()
            m.e0 r1 = r7.f17282c
            java.net.Proxy r4 = r1.mo17320b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo17655e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            m.g0.f.e r12 = new m.g0.f.e
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.mo17404a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.mo17387b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            m.g0.f.e r0 = new m.g0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x0159
        L_0x0158:
            throw r0
        L_0x0159:
            goto L_0x0158
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p377f.C6150c.mo17391d(int, int, int, int, boolean, m.e, m.p):void");
    }

    /* renamed from: k */
    public C6254r mo17392k() {
        return this.f17285f;
    }

    /* renamed from: l */
    public boolean mo17393l(C6098a aVar, C6122e0 e0Var) {
        if (this.f17293n.size() >= this.f17292m || this.f17290k || !C6128a.f17195a.mo17345g(this.f17282c.mo17319a(), aVar)) {
            return false;
        }
        if (aVar.mo17210l().mo17709m().equals(mo17397p().mo17319a().mo17210l().mo17709m())) {
            return true;
        }
        if (this.f17287h == null || e0Var == null || e0Var.mo17320b().type() != Proxy.Type.DIRECT || this.f17282c.mo17320b().type() != Proxy.Type.DIRECT || !this.f17282c.mo17322d().equals(e0Var.mo17322d()) || e0Var.mo17319a().mo17201e() != C6233d.f17573a || !mo17399s(aVar.mo17210l())) {
            return false;
        }
        try {
            aVar.mo17197a().mo17329a(aVar.mo17210l().mo17709m(), mo17392k().mo17677e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo17394m(boolean z) {
        int soTimeout;
        if (this.f17284e.isClosed() || this.f17284e.isInputShutdown() || this.f17284e.isOutputShutdown()) {
            return false;
        }
        C6188g gVar = this.f17287h;
        if (gVar != null) {
            return !gVar.mo17491t();
        }
        if (z) {
            try {
                soTimeout = this.f17284e.getSoTimeout();
                this.f17284e.setSoTimeout(1);
                if (this.f17288i.mo17794A()) {
                    this.f17284e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f17284e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f17284e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo17395n() {
        return this.f17287h != null;
    }

    /* renamed from: o */
    public C6160c mo17396o(C6265x xVar, C6259u.C6260a aVar, C6155g gVar) throws SocketException {
        if (this.f17287h != null) {
            return new C6186f(xVar, aVar, gVar, this.f17287h);
        }
        this.f17284e.setSoTimeout(aVar.mo17436b());
        this.f17288i.timeout().mo17904g((long) aVar.mo17436b(), TimeUnit.MILLISECONDS);
        this.f17289j.timeout().mo17904g((long) aVar.mo17437c(), TimeUnit.MILLISECONDS);
        return new C6170a(xVar, gVar, this.f17288i, this.f17289j);
    }

    /* renamed from: p */
    public C6122e0 mo17397p() {
        return this.f17282c;
    }

    /* renamed from: q */
    public Socket mo17398q() {
        return this.f17284e;
    }

    /* renamed from: s */
    public boolean mo17399s(C6257t tVar) {
        if (tVar.mo17715y() != this.f17282c.mo17319a().mo17210l().mo17715y()) {
            return false;
        }
        if (!tVar.mo17709m().equals(this.f17282c.mo17319a().mo17210l().mo17709m())) {
            return this.f17285f != null && C6233d.f17573a.mo17608c(tVar.mo17709m(), (X509Certificate) this.f17285f.mo17677e().get(0));
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f17282c.mo17319a().mo17210l().mo17709m());
        sb.append(":");
        sb.append(this.f17282c.mo17319a().mo17210l().mo17715y());
        sb.append(", proxy=");
        sb.append(this.f17282c.mo17320b());
        sb.append(" hostAddress=");
        sb.append(this.f17282c.mo17322d());
        sb.append(" cipherSuite=");
        C6254r rVar = this.f17285f;
        sb.append(rVar != null ? rVar.mo17675a() : "none");
        sb.append(" protocol=");
        sb.append(this.f17286g);
        sb.append('}');
        return sb.toString();
    }
}
