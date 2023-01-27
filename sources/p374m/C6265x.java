package p374m;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p374m.C6113c0;
import p374m.C6120e;
import p374m.C6248p;
import p374m.C6255s;
import p374m.p375g0.C6128a;
import p374m.p375g0.C6130c;
import p374m.p375g0.p376e.C6147f;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6151d;
import p374m.p375g0.p377f.C6155g;
import p374m.p375g0.p382k.C6228f;
import p374m.p375g0.p383l.C6229a;
import p374m.p375g0.p384m.C6232c;
import p374m.p375g0.p384m.C6233d;

/* renamed from: m.x */
public class C6265x implements Cloneable, C6120e.C6121a {

    /* renamed from: H */
    static final List<C6268y> f17688H = C6130c.m25058u(C6268y.HTTP_2, C6268y.HTTP_1_1);

    /* renamed from: I */
    static final List<C6240k> f17689I = C6130c.m25058u(C6240k.f17605g, C6240k.f17606h);

    /* renamed from: A */
    final boolean f17690A;

    /* renamed from: B */
    final boolean f17691B;

    /* renamed from: C */
    final int f17692C;

    /* renamed from: D */
    final int f17693D;

    /* renamed from: E */
    final int f17694E;

    /* renamed from: F */
    final int f17695F;

    /* renamed from: G */
    final int f17696G;

    /* renamed from: f */
    final C6245n f17697f;

    /* renamed from: g */
    final Proxy f17698g;

    /* renamed from: h */
    final List<C6268y> f17699h;

    /* renamed from: i */
    final List<C6240k> f17700i;

    /* renamed from: j */
    final List<C6259u> f17701j;

    /* renamed from: k */
    final List<C6259u> f17702k;

    /* renamed from: l */
    final C6248p.C6251c f17703l;

    /* renamed from: m */
    final ProxySelector f17704m;

    /* renamed from: n */
    final C6243m f17705n;

    /* renamed from: o */
    final C6106c f17706o;

    /* renamed from: p */
    final C6147f f17707p;

    /* renamed from: q */
    final SocketFactory f17708q;

    /* renamed from: r */
    final SSLSocketFactory f17709r;

    /* renamed from: s */
    final C6232c f17710s;

    /* renamed from: t */
    final HostnameVerifier f17711t;

    /* renamed from: u */
    final C6125g f17712u;

    /* renamed from: v */
    final C6101b f17713v;

    /* renamed from: w */
    final C6101b f17714w;

    /* renamed from: x */
    final C6238j f17715x;

    /* renamed from: y */
    final C6246o f17716y;

    /* renamed from: z */
    final boolean f17717z;

    /* renamed from: m.x$a */
    class C6266a extends C6128a {
        C6266a() {
        }

        /* renamed from: a */
        public void mo17339a(C6255s.C6256a aVar, String str) {
            aVar.mo17691b(str);
        }

        /* renamed from: b */
        public void mo17340b(C6255s.C6256a aVar, String str, String str2) {
            aVar.mo17692c(str, str2);
        }

        /* renamed from: c */
        public void mo17341c(C6240k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.mo17621a(sSLSocket, z);
        }

        /* renamed from: d */
        public int mo17342d(C6113c0.C6114a aVar) {
            return aVar.f17137c;
        }

        /* renamed from: e */
        public boolean mo17343e(C6238j jVar, C6150c cVar) {
            return jVar.mo17616b(cVar);
        }

        /* renamed from: f */
        public Socket mo17344f(C6238j jVar, C6098a aVar, C6155g gVar) {
            return jVar.mo17617c(aVar, gVar);
        }

        /* renamed from: g */
        public boolean mo17345g(C6098a aVar, C6098a aVar2) {
            return aVar.mo17200d(aVar2);
        }

        /* renamed from: h */
        public C6150c mo17346h(C6238j jVar, C6098a aVar, C6155g gVar, C6122e0 e0Var) {
            return jVar.mo17618d(aVar, gVar, e0Var);
        }

        /* renamed from: i */
        public void mo17347i(C6238j jVar, C6150c cVar) {
            jVar.mo17619f(cVar);
        }

        /* renamed from: j */
        public C6151d mo17348j(C6238j jVar) {
            return jVar.f17600e;
        }

        /* renamed from: k */
        public IOException mo17349k(C6120e eVar, IOException iOException) {
            return ((C6269z) eVar).mo17780i(iOException);
        }
    }

    /* renamed from: m.x$b */
    public static final class C6267b {

        /* renamed from: A */
        int f17718A;

        /* renamed from: B */
        int f17719B;

        /* renamed from: a */
        C6245n f17720a;

        /* renamed from: b */
        Proxy f17721b;

        /* renamed from: c */
        List<C6268y> f17722c;

        /* renamed from: d */
        List<C6240k> f17723d;

        /* renamed from: e */
        final List<C6259u> f17724e;

        /* renamed from: f */
        final List<C6259u> f17725f;

        /* renamed from: g */
        C6248p.C6251c f17726g;

        /* renamed from: h */
        ProxySelector f17727h;

        /* renamed from: i */
        C6243m f17728i;

        /* renamed from: j */
        C6106c f17729j;

        /* renamed from: k */
        C6147f f17730k;

        /* renamed from: l */
        SocketFactory f17731l;

        /* renamed from: m */
        SSLSocketFactory f17732m;

        /* renamed from: n */
        C6232c f17733n;

        /* renamed from: o */
        HostnameVerifier f17734o;

        /* renamed from: p */
        C6125g f17735p;

        /* renamed from: q */
        C6101b f17736q;

        /* renamed from: r */
        C6101b f17737r;

        /* renamed from: s */
        C6238j f17738s;

        /* renamed from: t */
        C6246o f17739t;

        /* renamed from: u */
        boolean f17740u;

        /* renamed from: v */
        boolean f17741v;

        /* renamed from: w */
        boolean f17742w;

        /* renamed from: x */
        int f17743x;

        /* renamed from: y */
        int f17744y;

        /* renamed from: z */
        int f17745z;

        public C6267b() {
            this.f17724e = new ArrayList();
            this.f17725f = new ArrayList();
            this.f17720a = new C6245n();
            this.f17722c = C6265x.f17688H;
            this.f17723d = C6265x.f17689I;
            this.f17726g = C6248p.m25592k(C6248p.f17637a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f17727h = proxySelector;
            if (proxySelector == null) {
                this.f17727h = new C6229a();
            }
            this.f17728i = C6243m.f17628a;
            this.f17731l = SocketFactory.getDefault();
            this.f17734o = C6233d.f17573a;
            this.f17735p = C6125g.f17187c;
            C6101b bVar = C6101b.f17081a;
            this.f17736q = bVar;
            this.f17737r = bVar;
            this.f17738s = new C6238j();
            this.f17739t = C6246o.f17636a;
            this.f17740u = true;
            this.f17741v = true;
            this.f17742w = true;
            this.f17743x = 0;
            this.f17744y = 10000;
            this.f17745z = 10000;
            this.f17718A = 10000;
            this.f17719B = 0;
        }

        C6267b(C6265x xVar) {
            this.f17724e = new ArrayList();
            this.f17725f = new ArrayList();
            this.f17720a = xVar.f17697f;
            this.f17721b = xVar.f17698g;
            this.f17722c = xVar.f17699h;
            this.f17723d = xVar.f17700i;
            this.f17724e.addAll(xVar.f17701j);
            this.f17725f.addAll(xVar.f17702k);
            this.f17726g = xVar.f17703l;
            this.f17727h = xVar.f17704m;
            this.f17728i = xVar.f17705n;
            this.f17730k = xVar.f17707p;
            this.f17729j = xVar.f17706o;
            this.f17731l = xVar.f17708q;
            this.f17732m = xVar.f17709r;
            this.f17733n = xVar.f17710s;
            this.f17734o = xVar.f17711t;
            this.f17735p = xVar.f17712u;
            this.f17736q = xVar.f17713v;
            this.f17737r = xVar.f17714w;
            this.f17738s = xVar.f17715x;
            this.f17739t = xVar.f17716y;
            this.f17740u = xVar.f17717z;
            this.f17741v = xVar.f17690A;
            this.f17742w = xVar.f17691B;
            this.f17743x = xVar.f17692C;
            this.f17744y = xVar.f17693D;
            this.f17745z = xVar.f17694E;
            this.f17718A = xVar.f17695F;
            this.f17719B = xVar.f17696G;
        }

        /* renamed from: a */
        public C6267b mo17767a(C6259u uVar) {
            if (uVar != null) {
                this.f17724e.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public C6265x mo17768b() {
            return new C6265x(this);
        }

        /* renamed from: c */
        public C6267b mo17769c(C6106c cVar) {
            this.f17729j = cVar;
            this.f17730k = null;
            return this;
        }

        /* renamed from: d */
        public C6267b mo17770d(long j, TimeUnit timeUnit) {
            this.f17744y = C6130c.m25042e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public C6267b mo17771e(C6238j jVar) {
            if (jVar != null) {
                this.f17738s = jVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        /* renamed from: f */
        public C6267b mo17772f(boolean z) {
            this.f17741v = z;
            return this;
        }

        /* renamed from: g */
        public C6267b mo17773g(long j, TimeUnit timeUnit) {
            this.f17745z = C6130c.m25042e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: h */
        public C6267b mo17774h(long j, TimeUnit timeUnit) {
            this.f17718A = C6130c.m25042e("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        C6128a.f17195a = new C6266a();
    }

    public C6265x() {
        this(new C6267b());
    }

    C6265x(C6267b bVar) {
        boolean z;
        C6232c cVar;
        this.f17697f = bVar.f17720a;
        this.f17698g = bVar.f17721b;
        this.f17699h = bVar.f17722c;
        this.f17700i = bVar.f17723d;
        this.f17701j = C6130c.m25057t(bVar.f17724e);
        this.f17702k = C6130c.m25057t(bVar.f17725f);
        this.f17703l = bVar.f17726g;
        this.f17704m = bVar.f17727h;
        this.f17705n = bVar.f17728i;
        this.f17706o = bVar.f17729j;
        this.f17707p = bVar.f17730k;
        this.f17708q = bVar.f17731l;
        Iterator<C6240k> it = this.f17700i.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C6240k next = it.next();
                if (z || next.mo17624d()) {
                    z = true;
                }
            }
        }
        if (bVar.f17732m != null || !z) {
            this.f17709r = bVar.f17732m;
            cVar = bVar.f17733n;
        } else {
            X509TrustManager C = C6130c.m25030C();
            this.f17709r = m25716z(C);
            cVar = C6232c.m25532b(C);
        }
        this.f17710s = cVar;
        if (this.f17709r != null) {
            C6228f.m25514j().mo17592f(this.f17709r);
        }
        this.f17711t = bVar.f17734o;
        this.f17712u = bVar.f17735p.mo17332f(this.f17710s);
        this.f17713v = bVar.f17736q;
        this.f17714w = bVar.f17737r;
        this.f17715x = bVar.f17738s;
        this.f17716y = bVar.f17739t;
        this.f17717z = bVar.f17740u;
        this.f17690A = bVar.f17741v;
        this.f17691B = bVar.f17742w;
        this.f17692C = bVar.f17743x;
        this.f17693D = bVar.f17744y;
        this.f17694E = bVar.f17745z;
        this.f17695F = bVar.f17718A;
        this.f17696G = bVar.f17719B;
        if (this.f17701j.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f17701j);
        } else if (this.f17702k.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f17702k);
        }
    }

    /* renamed from: z */
    private static SSLSocketFactory m25716z(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = C6228f.m25514j().mo17578l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return l.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C6130c.m25039b("No System TLS", e);
        }
    }

    /* renamed from: A */
    public int mo17739A() {
        return this.f17696G;
    }

    /* renamed from: B */
    public List<C6268y> mo17740B() {
        return this.f17699h;
    }

    /* renamed from: C */
    public Proxy mo17741C() {
        return this.f17698g;
    }

    /* renamed from: D */
    public C6101b mo17742D() {
        return this.f17713v;
    }

    /* renamed from: E */
    public ProxySelector mo17743E() {
        return this.f17704m;
    }

    /* renamed from: F */
    public int mo17744F() {
        return this.f17694E;
    }

    /* renamed from: G */
    public boolean mo17745G() {
        return this.f17691B;
    }

    /* renamed from: I */
    public SocketFactory mo17746I() {
        return this.f17708q;
    }

    /* renamed from: J */
    public SSLSocketFactory mo17747J() {
        return this.f17709r;
    }

    /* renamed from: K */
    public int mo17748K() {
        return this.f17695F;
    }

    /* renamed from: b */
    public C6120e mo17318b(C6099a0 a0Var) {
        return C6269z.m25768f(this, a0Var, false);
    }

    /* renamed from: c */
    public C6101b mo17749c() {
        return this.f17714w;
    }

    /* renamed from: d */
    public C6106c mo17750d() {
        return this.f17706o;
    }

    /* renamed from: e */
    public int mo17751e() {
        return this.f17692C;
    }

    /* renamed from: f */
    public C6125g mo17752f() {
        return this.f17712u;
    }

    /* renamed from: g */
    public int mo17753g() {
        return this.f17693D;
    }

    /* renamed from: i */
    public C6238j mo17754i() {
        return this.f17715x;
    }

    /* renamed from: k */
    public List<C6240k> mo17755k() {
        return this.f17700i;
    }

    /* renamed from: l */
    public C6243m mo17756l() {
        return this.f17705n;
    }

    /* renamed from: n */
    public C6245n mo17757n() {
        return this.f17697f;
    }

    /* renamed from: p */
    public C6246o mo17758p() {
        return this.f17716y;
    }

    /* renamed from: q */
    public C6248p.C6251c mo17759q() {
        return this.f17703l;
    }

    /* renamed from: r */
    public boolean mo17760r() {
        return this.f17690A;
    }

    /* renamed from: s */
    public boolean mo17761s() {
        return this.f17717z;
    }

    /* renamed from: t */
    public HostnameVerifier mo17762t() {
        return this.f17711t;
    }

    /* renamed from: u */
    public List<C6259u> mo17763u() {
        return this.f17701j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C6147f mo17764v() {
        C6106c cVar = this.f17706o;
        return cVar != null ? cVar.f17088f : this.f17707p;
    }

    /* renamed from: x */
    public List<C6259u> mo17765x() {
        return this.f17702k;
    }

    /* renamed from: y */
    public C6267b mo17766y() {
        return new C6267b(this);
    }
}
