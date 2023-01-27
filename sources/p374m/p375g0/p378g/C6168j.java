package p374m.p375g0.p378g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.helper.HttpConnection;
import p374m.C6098a;
import p374m.C6099a0;
import p374m.C6103b0;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6120e;
import p374m.C6122e0;
import p374m.C6125g;
import p374m.C6248p;
import p374m.C6257t;
import p374m.C6259u;
import p374m.C6265x;
import p374m.p375g0.C6130c;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6152e;
import p374m.p375g0.p377f.C6155g;
import p374m.p375g0.p380i.C6178a;

/* renamed from: m.g0.g.j */
public final class C6168j implements C6259u {

    /* renamed from: a */
    private final C6265x f17344a;

    /* renamed from: b */
    private volatile C6155g f17345b;

    /* renamed from: c */
    private Object f17346c;

    /* renamed from: d */
    private volatile boolean f17347d;

    public C6168j(C6265x xVar, boolean z) {
        this.f17344a = xVar;
    }

    /* renamed from: c */
    private C6098a m25227c(C6257t tVar) {
        C6125g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (tVar.mo17710n()) {
            SSLSocketFactory J = this.f17344a.mo17747J();
            hostnameVerifier = this.f17344a.mo17762t();
            sSLSocketFactory = J;
            gVar = this.f17344a.mo17752f();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C6098a(tVar.mo17709m(), tVar.mo17715y(), this.f17344a.mo17758p(), this.f17344a.mo17746I(), sSLSocketFactory, hostnameVerifier, gVar, this.f17344a.mo17742D(), this.f17344a.mo17741C(), this.f17344a.mo17740B(), this.f17344a.mo17755k(), this.f17344a.mo17743E());
    }

    /* renamed from: d */
    private C6099a0 m25228d(C6113c0 c0Var, C6122e0 e0Var) throws IOException {
        String q;
        C6257t C;
        if (c0Var != null) {
            int m = c0Var.mo17270m();
            String g = c0Var.mo17264S().mo17218g();
            C6103b0 b0Var = null;
            if (m == 307 || m == 308) {
                if (!g.equals("GET") && !g.equals("HEAD")) {
                    return null;
                }
            } else if (m == 401) {
                return this.f17344a.mo17749c().mo17232a(e0Var, c0Var);
            } else {
                if (m != 503) {
                    if (m == 407) {
                        if ((e0Var != null ? e0Var.mo17320b() : this.f17344a.mo17741C()).type() == Proxy.Type.HTTP) {
                            return this.f17344a.mo17742D().mo17232a(e0Var, c0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (m != 408) {
                        switch (m) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f17344a.mo17745G()) {
                        return null;
                    } else {
                        c0Var.mo17264S().mo17212a();
                        if ((c0Var.mo17261H() == null || c0Var.mo17261H().mo17270m() != 408) && m25231h(c0Var, 0) <= 0) {
                            return c0Var.mo17264S();
                        }
                        return null;
                    }
                } else if ((c0Var.mo17261H() == null || c0Var.mo17261H().mo17270m() != 503) && m25231h(c0Var, Integer.MAX_VALUE) == 0) {
                    return c0Var.mo17264S();
                } else {
                    return null;
                }
            }
            if (!this.f17344a.mo17760r() || (q = c0Var.mo17272q("Location")) == null || (C = c0Var.mo17264S().mo17221j().mo17698C(q)) == null) {
                return null;
            }
            if (!C.mo17699D().equals(c0Var.mo17264S().mo17221j().mo17699D()) && !this.f17344a.mo17761s()) {
                return null;
            }
            C6099a0.C6100a h = c0Var.mo17264S().mo17219h();
            if (C6164f.m25207b(g)) {
                boolean d = C6164f.m25209d(g);
                if (C6164f.m25208c(g)) {
                    h.mo17227e("GET", (C6103b0) null);
                } else {
                    if (d) {
                        b0Var = c0Var.mo17264S().mo17212a();
                    }
                    h.mo17227e(g, b0Var);
                }
                if (!d) {
                    h.mo17228f("Transfer-Encoding");
                    h.mo17228f("Content-Length");
                    h.mo17228f(HttpConnection.CONTENT_TYPE);
                }
            }
            if (!m25232i(c0Var, C)) {
                h.mo17228f("Authorization");
            }
            h.mo17231i(C);
            return h.mo17223a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    private boolean m25229f(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    /* renamed from: g */
    private boolean m25230g(IOException iOException, C6155g gVar, boolean z, C6099a0 a0Var) {
        gVar.mo17423q(iOException);
        if (!this.f17344a.mo17745G()) {
            return false;
        }
        if (z) {
            a0Var.mo17212a();
        }
        return m25229f(iOException, z) && gVar.mo17417h();
    }

    /* renamed from: h */
    private int m25231h(C6113c0 c0Var, int i) {
        String q = c0Var.mo17272q("Retry-After");
        if (q == null) {
            return i;
        }
        if (q.matches("\\d+")) {
            return Integer.valueOf(q).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: i */
    private boolean m25232i(C6113c0 c0Var, C6257t tVar) {
        C6257t j = c0Var.mo17264S().mo17221j();
        return j.mo17709m().equals(tVar.mo17709m()) && j.mo17715y() == tVar.mo17715y() && j.mo17699D().equals(tVar.mo17699D());
    }

    /* renamed from: a */
    public C6113c0 mo16688a(C6259u.C6260a aVar) throws IOException {
        C6099a0 request = aVar.request();
        C6165g gVar = (C6165g) aVar;
        C6120e e = gVar.mo17439e();
        C6248p g = gVar.mo17441g();
        C6155g gVar2 = new C6155g(this.f17344a.mo17754i(), m25227c(request.mo17221j()), e, g, this.f17346c);
        this.f17345b = gVar2;
        C6113c0 c0Var = null;
        int i = 0;
        while (!this.f17347d) {
            try {
                C6113c0 i2 = gVar.mo17443i(request, gVar2, (C6160c) null, (C6150c) null);
                if (c0Var != null) {
                    C6113c0.C6114a D = i2.mo17260D();
                    C6113c0.C6114a D2 = c0Var.mo17260D();
                    D2.mo17280b((C6117d0) null);
                    D.mo17289m(D2.mo17281c());
                    i2 = D.mo17281c();
                }
                try {
                    C6099a0 d = m25228d(i2, gVar2.mo17422o());
                    if (d == null) {
                        gVar2.mo17420k();
                        return i2;
                    }
                    C6130c.m25044g(i2.mo17266a());
                    int i3 = i + 1;
                    if (i3 <= 20) {
                        d.mo17212a();
                        if (!m25232i(i2, d.mo17221j())) {
                            gVar2.mo17420k();
                            gVar2 = new C6155g(this.f17344a.mo17754i(), m25227c(d.mo17221j()), e, g, this.f17346c);
                            this.f17345b = gVar2;
                        } else if (gVar2.mo17415c() != null) {
                            throw new IllegalStateException("Closing the body of " + i2 + " didn't close its backing stream. Bad interceptor?");
                        }
                        c0Var = i2;
                        request = d;
                        i = i3;
                    } else {
                        gVar2.mo17420k();
                        throw new ProtocolException("Too many follow-up requests: " + i3);
                    }
                } catch (IOException e2) {
                    gVar2.mo17420k();
                    throw e2;
                }
            } catch (C6152e e3) {
                if (!m25230g(e3.mo17406c(), gVar2, false, request)) {
                    throw e3.mo17405b();
                }
            } catch (IOException e4) {
                if (!m25230g(e4, gVar2, !(e4 instanceof C6178a), request)) {
                    throw e4;
                }
            } catch (Throwable th) {
                gVar2.mo17423q((IOException) null);
                gVar2.mo17420k();
                throw th;
            }
        }
        gVar2.mo17420k();
        throw new IOException("Canceled");
    }

    /* renamed from: b */
    public void mo17446b() {
        this.f17347d = true;
        C6155g gVar = this.f17345b;
        if (gVar != null) {
            gVar.mo17414b();
        }
    }

    /* renamed from: e */
    public boolean mo17447e() {
        return this.f17347d;
    }

    /* renamed from: j */
    public void mo17448j(Object obj) {
        this.f17346c = obj;
    }
}
