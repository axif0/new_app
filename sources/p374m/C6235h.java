package p374m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: m.h */
public final class C6235h {

    /* renamed from: b */
    static final Comparator<String> f17574b = new C6236a();

    /* renamed from: c */
    private static final Map<String, C6235h> f17575c = new LinkedHashMap();

    /* renamed from: d */
    public static final C6235h f17576d = m25543c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C6235h f17577e = m25543c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C6235h f17578f = m25543c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C6235h f17579g = m25543c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C6235h f17580h = m25543c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C6235h f17581i = m25543c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C6235h f17582j = m25543c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C6235h f17583k = m25543c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C6235h f17584l = m25543c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C6235h f17585m = m25543c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C6235h f17586n = m25543c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C6235h f17587o = m25543c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C6235h f17588p = m25543c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C6235h f17589q = m25543c("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C6235h f17590r = m25543c("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C6235h f17591s = m25543c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: t */
    public static final C6235h f17592t = m25543c("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: u */
    public static final C6235h f17593u = m25543c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: a */
    final String f17594a;

    /* renamed from: m.h$a */
    class C6236a implements Comparator<String> {
        C6236a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        m25543c("SSL_RSA_WITH_NULL_MD5", 1);
        m25543c("SSL_RSA_WITH_NULL_SHA", 2);
        m25543c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m25543c("SSL_RSA_WITH_RC4_128_MD5", 4);
        m25543c("SSL_RSA_WITH_RC4_128_SHA", 5);
        m25543c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m25543c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m25543c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m25543c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m25543c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m25543c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m25543c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m25543c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m25543c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m25543c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m25543c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m25543c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m25543c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m25543c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m25543c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m25543c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m25543c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m25543c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m25543c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m25543c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m25543c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m25543c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m25543c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m25543c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m25543c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m25543c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m25543c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m25543c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m25543c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m25543c("TLS_RSA_WITH_NULL_SHA256", 59);
        m25543c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m25543c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m25543c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m25543c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m25543c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m25543c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m25543c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m25543c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m25543c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m25543c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m25543c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m25543c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m25543c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m25543c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m25543c("TLS_PSK_WITH_RC4_128_SHA", 138);
        m25543c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m25543c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m25543c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m25543c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m25543c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m25543c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m25543c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m25543c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m25543c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m25543c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m25543c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m25543c("TLS_FALLBACK_SCSV", 22016);
        m25543c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m25543c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m25543c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m25543c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m25543c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m25543c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m25543c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m25543c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m25543c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m25543c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m25543c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m25543c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m25543c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m25543c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m25543c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m25543c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m25543c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m25543c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m25543c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m25543c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m25543c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m25543c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m25543c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m25543c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m25543c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m25543c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m25543c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m25543c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m25543c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m25543c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m25543c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m25543c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m25543c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m25543c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m25543c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m25543c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m25543c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m25543c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m25543c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    }

    private C6235h(String str) {
        if (str != null) {
            this.f17594a = str;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static synchronized C6235h m25541a(String str) {
        C6235h hVar;
        synchronized (C6235h.class) {
            hVar = f17575c.get(str);
            if (hVar == null) {
                hVar = f17575c.get(m25544e(str));
                if (hVar == null) {
                    hVar = new C6235h(str);
                }
                f17575c.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: b */
    static List<C6235h> m25542b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m25541a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static C6235h m25543c(String str, int i) {
        C6235h hVar = new C6235h(str);
        f17575c.put(str, hVar);
        return hVar;
    }

    /* renamed from: e */
    private static String m25544e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    /* renamed from: d */
    public String mo17611d() {
        return this.f17594a;
    }

    public String toString() {
        return this.f17594a;
    }
}
