package p374m.p375g0.p384m;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p374m.p375g0.p382k.C6228f;

/* renamed from: m.g0.m.c */
public abstract class C6232c {
    /* renamed from: b */
    public static C6232c m25532b(X509TrustManager x509TrustManager) {
        return C6228f.m25514j().mo17574c(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo17584a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
