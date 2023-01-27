package p374m.p375g0.p382k;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p374m.C6265x;
import p374m.C6268y;
import p374m.p375g0.p384m.C6230a;
import p374m.p375g0.p384m.C6231b;
import p374m.p375g0.p384m.C6232c;
import p374m.p375g0.p384m.C6234e;
import p385n.C6277c;

/* renamed from: m.g0.k.f */
public class C6228f {

    /* renamed from: a */
    private static final C6228f f17569a = m25513i();

    /* renamed from: b */
    private static final Logger f17570b = Logger.getLogger(C6265x.class.getName());

    /* renamed from: b */
    public static List<String> m25511b(List<C6268y> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6268y yVar = list.get(i);
            if (yVar != C6268y.HTTP_1_0) {
                arrayList.add(yVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static byte[] m25512e(List<C6268y> list) {
        C6277c cVar = new C6277c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6268y yVar = list.get(i);
            if (yVar != C6268y.HTTP_1_0) {
                cVar.mo17852t0(yVar.toString().length());
                cVar.mo17864z0(yVar.toString());
            }
        }
        return cVar.mo17856v();
    }

    /* renamed from: i */
    private static C6228f m25513i() {
        C6223b s;
        C6228f u = C6219a.m25474u();
        if (u != null) {
            return u;
        }
        if (m25515p() && (s = C6223b.m25491s()) != null) {
            return s;
        }
        C6224c s2 = C6224c.m25497s();
        if (s2 != null) {
            return s2;
        }
        C6228f s3 = C6225d.m25500s();
        return s3 != null ? s3 : new C6228f();
    }

    /* renamed from: j */
    public static C6228f m25514j() {
        return f17569a;
    }

    /* renamed from: p */
    public static boolean m25515p() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo17593a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public C6232c mo17574c(X509TrustManager x509TrustManager) {
        return new C6230a(mo17575d(x509TrustManager));
    }

    /* renamed from: d */
    public C6234e mo17575d(X509TrustManager x509TrustManager) {
        return new C6231b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo17592f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo17576g(SSLSocket sSLSocket, String str, List<C6268y> list) {
    }

    /* renamed from: h */
    public void mo17577h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: k */
    public String mo17600k() {
        return "OkHttp";
    }

    /* renamed from: l */
    public SSLContext mo17578l() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: m */
    public String mo17579m(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: n */
    public Object mo17580n(String str) {
        if (f17570b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo17581o(String str) {
        return true;
    }

    /* renamed from: q */
    public void mo17582q(int i, String str, Throwable th) {
        f17570b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: r */
    public void mo17583r(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo17582q(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
