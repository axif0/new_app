package p374m;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p374m.p375g0.C6130c;

/* renamed from: m.r */
public final class C6254r {

    /* renamed from: a */
    private final C6124f0 f17645a;

    /* renamed from: b */
    private final C6235h f17646b;

    /* renamed from: c */
    private final List<Certificate> f17647c;

    /* renamed from: d */
    private final List<Certificate> f17648d;

    private C6254r(C6124f0 f0Var, C6235h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f17645a = f0Var;
        this.f17646b = hVar;
        this.f17647c = list;
        this.f17648d = list2;
    }

    /* renamed from: b */
    public static C6254r m25622b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C6235h a = C6235h.m25541a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C6124f0 e = C6124f0.m25005e(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List u = certificateArr != null ? C6130c.m25058u(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new C6254r(e, a, u, localCertificates != null ? C6130c.m25058u(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: c */
    public static C6254r m25623c(C6124f0 f0Var, C6235h hVar, List<Certificate> list, List<Certificate> list2) {
        if (f0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (hVar != null) {
            return new C6254r(f0Var, hVar, C6130c.m25057t(list), C6130c.m25057t(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public C6235h mo17675a() {
        return this.f17646b;
    }

    /* renamed from: d */
    public List<Certificate> mo17676d() {
        return this.f17648d;
    }

    /* renamed from: e */
    public List<Certificate> mo17677e() {
        return this.f17647c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6254r)) {
            return false;
        }
        C6254r rVar = (C6254r) obj;
        return this.f17645a.equals(rVar.f17645a) && this.f17646b.equals(rVar.f17646b) && this.f17647c.equals(rVar.f17647c) && this.f17648d.equals(rVar.f17648d);
    }

    /* renamed from: f */
    public C6124f0 mo17679f() {
        return this.f17645a;
    }

    public int hashCode() {
        return ((((((527 + this.f17645a.hashCode()) * 31) + this.f17646b.hashCode()) * 31) + this.f17647c.hashCode()) * 31) + this.f17648d.hashCode();
    }
}
