package p374m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p374m.C6257t;
import p374m.p375g0.C6130c;

/* renamed from: m.a */
public final class C6098a {

    /* renamed from: a */
    final C6257t f17059a;

    /* renamed from: b */
    final C6246o f17060b;

    /* renamed from: c */
    final SocketFactory f17061c;

    /* renamed from: d */
    final C6101b f17062d;

    /* renamed from: e */
    final List<C6268y> f17063e;

    /* renamed from: f */
    final List<C6240k> f17064f;

    /* renamed from: g */
    final ProxySelector f17065g;

    /* renamed from: h */
    final Proxy f17066h;

    /* renamed from: i */
    final SSLSocketFactory f17067i;

    /* renamed from: j */
    final HostnameVerifier f17068j;

    /* renamed from: k */
    final C6125g f17069k;

    public C6098a(String str, int i, C6246o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6125g gVar, C6101b bVar, Proxy proxy, List<C6268y> list, List<C6240k> list2, ProxySelector proxySelector) {
        C6257t.C6258a aVar = new C6257t.C6258a();
        aVar.mo17727s(sSLSocketFactory != null ? "https" : "http");
        aVar.mo17722g(str);
        aVar.mo17725n(i);
        this.f17059a = aVar.mo17719c();
        if (oVar != null) {
            this.f17060b = oVar;
            if (socketFactory != null) {
                this.f17061c = socketFactory;
                if (bVar != null) {
                    this.f17062d = bVar;
                    if (list != null) {
                        this.f17063e = C6130c.m25057t(list);
                        if (list2 != null) {
                            this.f17064f = C6130c.m25057t(list2);
                            if (proxySelector != null) {
                                this.f17065g = proxySelector;
                                this.f17066h = proxy;
                                this.f17067i = sSLSocketFactory;
                                this.f17068j = hostnameVerifier;
                                this.f17069k = gVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    /* renamed from: a */
    public C6125g mo17197a() {
        return this.f17069k;
    }

    /* renamed from: b */
    public List<C6240k> mo17198b() {
        return this.f17064f;
    }

    /* renamed from: c */
    public C6246o mo17199c() {
        return this.f17060b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo17200d(C6098a aVar) {
        return this.f17060b.equals(aVar.f17060b) && this.f17062d.equals(aVar.f17062d) && this.f17063e.equals(aVar.f17063e) && this.f17064f.equals(aVar.f17064f) && this.f17065g.equals(aVar.f17065g) && C6130c.m25054q(this.f17066h, aVar.f17066h) && C6130c.m25054q(this.f17067i, aVar.f17067i) && C6130c.m25054q(this.f17068j, aVar.f17068j) && C6130c.m25054q(this.f17069k, aVar.f17069k) && mo17210l().mo17715y() == aVar.mo17210l().mo17715y();
    }

    /* renamed from: e */
    public HostnameVerifier mo17201e() {
        return this.f17068j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6098a) {
            C6098a aVar = (C6098a) obj;
            return this.f17059a.equals(aVar.f17059a) && mo17200d(aVar);
        }
    }

    /* renamed from: f */
    public List<C6268y> mo17203f() {
        return this.f17063e;
    }

    /* renamed from: g */
    public Proxy mo17204g() {
        return this.f17066h;
    }

    /* renamed from: h */
    public C6101b mo17205h() {
        return this.f17062d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f17059a.hashCode()) * 31) + this.f17060b.hashCode()) * 31) + this.f17062d.hashCode()) * 31) + this.f17063e.hashCode()) * 31) + this.f17064f.hashCode()) * 31) + this.f17065g.hashCode()) * 31;
        Proxy proxy = this.f17066h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f17067i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f17068j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C6125g gVar = this.f17069k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public ProxySelector mo17207i() {
        return this.f17065g;
    }

    /* renamed from: j */
    public SocketFactory mo17208j() {
        return this.f17061c;
    }

    /* renamed from: k */
    public SSLSocketFactory mo17209k() {
        return this.f17067i;
    }

    /* renamed from: l */
    public C6257t mo17210l() {
        return this.f17059a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f17059a.mo17709m());
        sb.append(":");
        sb.append(this.f17059a.mo17715y());
        if (this.f17066h != null) {
            sb.append(", proxy=");
            obj = this.f17066h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f17065g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
