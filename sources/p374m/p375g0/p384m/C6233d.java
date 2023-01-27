package p374m.p375g0.p384m;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p374m.p375g0.C6130c;

/* renamed from: m.g0.m.d */
public final class C6233d implements HostnameVerifier {

    /* renamed from: a */
    public static final C6233d f17573a = new C6233d();

    private C6233d() {
    }

    /* renamed from: a */
    public static List<String> m25534a(X509Certificate x509Certificate) {
        List<String> b = m25535b(x509Certificate, 7);
        List<String> b2 = m25535b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b.size() + b2.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m25535b(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: e */
    private boolean m25536e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String d : m25535b(x509Certificate, 2)) {
            if (mo17609d(lowerCase, d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m25537f(String str, X509Certificate x509Certificate) {
        List<String> b = m25535b(x509Certificate, 7);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo17608c(String str, X509Certificate x509Certificate) {
        return C6130c.m25037J(str) ? m25537f(str, x509Certificate) : m25536e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean mo17609d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo17608c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
