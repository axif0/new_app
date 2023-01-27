package p374m.p375g0.p377f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import p374m.C6240k;
import p374m.p375g0.C6128a;

/* renamed from: m.g0.f.b */
public final class C6149b {

    /* renamed from: a */
    private final List<C6240k> f17277a;

    /* renamed from: b */
    private int f17278b = 0;

    /* renamed from: c */
    private boolean f17279c;

    /* renamed from: d */
    private boolean f17280d;

    public C6149b(List<C6240k> list) {
        this.f17277a = list;
    }

    /* renamed from: c */
    private boolean m25121c(SSLSocket sSLSocket) {
        for (int i = this.f17278b; i < this.f17277a.size(); i++) {
            if (this.f17277a.get(i).mo17623c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C6240k mo17386a(SSLSocket sSLSocket) throws IOException {
        C6240k kVar;
        int i = this.f17278b;
        int size = this.f17277a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.f17277a.get(i);
            i++;
            if (kVar.mo17623c(sSLSocket)) {
                this.f17278b = i;
                break;
            }
        }
        if (kVar != null) {
            this.f17279c = m25121c(sSLSocket);
            C6128a.f17195a.mo17341c(kVar, sSLSocket, this.f17280d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f17280d + ", modes=" + this.f17277a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean mo17387b(IOException iOException) {
        this.f17280d = true;
        if (!this.f17279c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
        }
        return false;
    }
}
