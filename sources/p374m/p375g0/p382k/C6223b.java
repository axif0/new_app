package p374m.p375g0.p382k;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import p374m.C6268y;

/* renamed from: m.g0.k.b */
public class C6223b extends C6228f {
    private C6223b() {
    }

    /* renamed from: s */
    public static C6223b m25491s() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C6223b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    private Provider m25492t() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: f */
    public void mo17592f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: g */
    public void mo17576g(SSLSocket sSLSocket, String str, List<C6268y> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C6228f.m25511b(list).toArray(new String[0]));
            return;
        }
        super.mo17576g(sSLSocket, str, list);
    }

    /* renamed from: l */
    public SSLContext mo17578l() {
        try {
            return SSLContext.getInstance("TLSv1.3", m25492t());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m25492t());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: m */
    public String mo17579m(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo17579m(sSLSocket);
    }
}
