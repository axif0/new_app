package p374m;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p374m.p375g0.C6130c;
import p374m.p375g0.p384m.C6232c;
import p385n.C6282f;

/* renamed from: m.g */
public final class C6125g {

    /* renamed from: c */
    public static final C6125g f17187c = new C6126a().mo17334a();

    /* renamed from: a */
    private final Set<C6127b> f17188a;

    /* renamed from: b */
    private final C6232c f17189b;

    /* renamed from: m.g$a */
    public static final class C6126a {

        /* renamed from: a */
        private final List<C6127b> f17190a = new ArrayList();

        /* renamed from: a */
        public C6125g mo17334a() {
            return new C6125g(new LinkedHashSet(this.f17190a), (C6232c) null);
        }
    }

    /* renamed from: m.g$b */
    static final class C6127b {

        /* renamed from: a */
        final String f17191a;

        /* renamed from: b */
        final String f17192b;

        /* renamed from: c */
        final String f17193c;

        /* renamed from: d */
        final C6282f f17194d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17335a(String str) {
            if (!this.f17191a.startsWith("*.")) {
                return str.equals(this.f17192b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f17192b.length()) {
                String str2 = this.f17192b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6127b) {
                C6127b bVar = (C6127b) obj;
                return this.f17191a.equals(bVar.f17191a) && this.f17193c.equals(bVar.f17193c) && this.f17194d.equals(bVar.f17194d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f17191a.hashCode()) * 31) + this.f17193c.hashCode()) * 31) + this.f17194d.hashCode();
        }

        public String toString() {
            return this.f17193c + this.f17194d.mo17880e();
        }
    }

    C6125g(Set<C6127b> set, C6232c cVar) {
        this.f17188a = set;
        this.f17189b = cVar;
    }

    /* renamed from: c */
    public static String m25008c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m25010e((X509Certificate) certificate).mo17880e();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static C6282f m25009d(X509Certificate x509Certificate) {
        return C6282f.m25892s(x509Certificate.getPublicKey().getEncoded()).mo17890v();
    }

    /* renamed from: e */
    static C6282f m25010e(X509Certificate x509Certificate) {
        return C6282f.m25892s(x509Certificate.getPublicKey().getEncoded()).mo17891w();
    }

    /* renamed from: a */
    public void mo17329a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C6127b> b = mo17330b(str);
        if (!b.isEmpty()) {
            C6232c cVar = this.f17189b;
            if (cVar != null) {
                list = cVar.mo17584a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b.size();
                C6282f fVar = null;
                C6282f fVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C6127b bVar = b.get(i2);
                    if (bVar.f17193c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = m25010e(x509Certificate);
                        }
                        if (bVar.f17194d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f17193c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = m25009d(x509Certificate);
                        }
                        if (bVar.f17194d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f17193c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(m25008c(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = b.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(b.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C6127b> mo17330b(String str) {
        List<C6127b> emptyList = Collections.emptyList();
        for (C6127b next : this.f17188a) {
            if (next.mo17335a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6125g) {
            C6125g gVar = (C6125g) obj;
            return C6130c.m25054q(this.f17189b, gVar.f17189b) && this.f17188a.equals(gVar.f17188a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6125g mo17332f(C6232c cVar) {
        return C6130c.m25054q(this.f17189b, cVar) ? this : new C6125g(this.f17188a, cVar);
    }

    public int hashCode() {
        C6232c cVar = this.f17189b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f17188a.hashCode();
    }
}
