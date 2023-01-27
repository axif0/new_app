package p374m.p375g0.p384m;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: m.g0.m.b */
public final class C6231b implements C6234e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f17572a = new LinkedHashMap();

    public C6231b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f17572a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f17572a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo17587a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f17572a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6231b) && ((C6231b) obj).f17572a.equals(this.f17572a);
    }

    public int hashCode() {
        return this.f17572a.hashCode();
    }
}
