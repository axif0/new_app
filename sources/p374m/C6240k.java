package p374m;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p374m.p375g0.C6130c;

/* renamed from: m.k */
public final class C6240k {

    /* renamed from: e */
    private static final C6235h[] f17603e = {C6235h.f17589q, C6235h.f17590r, C6235h.f17591s, C6235h.f17592t, C6235h.f17593u, C6235h.f17583k, C6235h.f17585m, C6235h.f17584l, C6235h.f17586n, C6235h.f17588p, C6235h.f17587o};

    /* renamed from: f */
    private static final C6235h[] f17604f = {C6235h.f17589q, C6235h.f17590r, C6235h.f17591s, C6235h.f17592t, C6235h.f17593u, C6235h.f17583k, C6235h.f17585m, C6235h.f17584l, C6235h.f17586n, C6235h.f17588p, C6235h.f17587o, C6235h.f17581i, C6235h.f17582j, C6235h.f17579g, C6235h.f17580h, C6235h.f17577e, C6235h.f17578f, C6235h.f17576d};

    /* renamed from: g */
    public static final C6240k f17605g;

    /* renamed from: h */
    public static final C6240k f17606h = new C6241a(false).mo17630a();

    /* renamed from: a */
    final boolean f17607a;

    /* renamed from: b */
    final boolean f17608b;

    /* renamed from: c */
    final String[] f17609c;

    /* renamed from: d */
    final String[] f17610d;

    /* renamed from: m.k$a */
    public static final class C6241a {

        /* renamed from: a */
        boolean f17611a;

        /* renamed from: b */
        String[] f17612b;

        /* renamed from: c */
        String[] f17613c;

        /* renamed from: d */
        boolean f17614d;

        public C6241a(C6240k kVar) {
            this.f17611a = kVar.f17607a;
            this.f17612b = kVar.f17609c;
            this.f17613c = kVar.f17610d;
            this.f17614d = kVar.f17608b;
        }

        C6241a(boolean z) {
            this.f17611a = z;
        }

        /* renamed from: a */
        public C6240k mo17630a() {
            return new C6240k(this);
        }

        /* renamed from: b */
        public C6241a mo17631b(String... strArr) {
            if (!this.f17611a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f17612b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public C6241a mo17632c(C6235h... hVarArr) {
            if (this.f17611a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f17594a;
                }
                mo17631b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public C6241a mo17633d(boolean z) {
            if (this.f17611a) {
                this.f17614d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public C6241a mo17634e(String... strArr) {
            if (!this.f17611a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f17613c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: f */
        public C6241a mo17635f(C6124f0... f0VarArr) {
            if (this.f17611a) {
                String[] strArr = new String[f0VarArr.length];
                for (int i = 0; i < f0VarArr.length; i++) {
                    strArr[i] = f0VarArr[i].f17186f;
                }
                mo17634e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        C6241a aVar = new C6241a(true);
        aVar.mo17632c(f17603e);
        aVar.mo17635f(C6124f0.TLS_1_3, C6124f0.TLS_1_2);
        aVar.mo17633d(true);
        aVar.mo17630a();
        C6241a aVar2 = new C6241a(true);
        aVar2.mo17632c(f17604f);
        aVar2.mo17635f(C6124f0.TLS_1_3, C6124f0.TLS_1_2, C6124f0.TLS_1_1, C6124f0.TLS_1_0);
        aVar2.mo17633d(true);
        f17605g = aVar2.mo17630a();
        C6241a aVar3 = new C6241a(true);
        aVar3.mo17632c(f17604f);
        aVar3.mo17635f(C6124f0.TLS_1_0);
        aVar3.mo17633d(true);
        aVar3.mo17630a();
    }

    C6240k(C6241a aVar) {
        this.f17607a = aVar.f17611a;
        this.f17609c = aVar.f17612b;
        this.f17610d = aVar.f17613c;
        this.f17608b = aVar.f17614d;
    }

    /* renamed from: e */
    private C6240k m25553e(SSLSocket sSLSocket, boolean z) {
        String[] z2 = this.f17609c != null ? C6130c.m25063z(C6235h.f17574b, sSLSocket.getEnabledCipherSuites(), this.f17609c) : sSLSocket.getEnabledCipherSuites();
        String[] z3 = this.f17610d != null ? C6130c.m25063z(C6130c.f17211o, sSLSocket.getEnabledProtocols(), this.f17610d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int w = C6130c.m25060w(C6235h.f17574b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && w != -1) {
            z2 = C6130c.m25046i(z2, supportedCipherSuites[w]);
        }
        C6241a aVar = new C6241a(this);
        aVar.mo17631b(z2);
        aVar.mo17634e(z3);
        return aVar.mo17630a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17621a(SSLSocket sSLSocket, boolean z) {
        C6240k e = m25553e(sSLSocket, z);
        String[] strArr = e.f17610d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e.f17609c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    public List<C6235h> mo17622b() {
        String[] strArr = this.f17609c;
        if (strArr != null) {
            return C6235h.m25542b(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo17623c(SSLSocket sSLSocket) {
        if (!this.f17607a) {
            return false;
        }
        String[] strArr = this.f17610d;
        if (strArr != null && !C6130c.m25029B(C6130c.f17211o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f17609c;
        return strArr2 == null || C6130c.m25029B(C6235h.f17574b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: d */
    public boolean mo17624d() {
        return this.f17607a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6240k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6240k kVar = (C6240k) obj;
        boolean z = this.f17607a;
        if (z != kVar.f17607a) {
            return false;
        }
        return !z || (Arrays.equals(this.f17609c, kVar.f17609c) && Arrays.equals(this.f17610d, kVar.f17610d) && this.f17608b == kVar.f17608b);
    }

    /* renamed from: f */
    public boolean mo17626f() {
        return this.f17608b;
    }

    /* renamed from: g */
    public List<C6124f0> mo17627g() {
        String[] strArr = this.f17610d;
        if (strArr != null) {
            return C6124f0.m25006g(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f17607a) {
            return ((((527 + Arrays.hashCode(this.f17609c)) * 31) + Arrays.hashCode(this.f17610d)) * 31) + (this.f17608b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f17607a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f17609c != null ? mo17622b().toString() : str;
        if (this.f17610d != null) {
            str = mo17627g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f17608b + ")";
    }
}
