package p374m;

import com.karumi.dexter.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p374m.p375g0.C6130c;
import p385n.C6277c;

/* renamed from: m.t */
public final class C6257t {

    /* renamed from: j */
    private static final char[] f17651j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f17652a;

    /* renamed from: b */
    private final String f17653b;

    /* renamed from: c */
    private final String f17654c;

    /* renamed from: d */
    final String f17655d;

    /* renamed from: e */
    final int f17656e;

    /* renamed from: f */
    private final List<String> f17657f;

    /* renamed from: g */
    private final List<String> f17658g;

    /* renamed from: h */
    private final String f17659h;

    /* renamed from: i */
    private final String f17660i;

    /* renamed from: m.t$a */
    public static final class C6258a {

        /* renamed from: a */
        String f17661a;

        /* renamed from: b */
        String f17662b = BuildConfig.FLAVOR;

        /* renamed from: c */
        String f17663c = BuildConfig.FLAVOR;

        /* renamed from: d */
        String f17664d;

        /* renamed from: e */
        int f17665e = -1;

        /* renamed from: f */
        final List<String> f17666f;

        /* renamed from: g */
        List<String> f17667g;

        /* renamed from: h */
        String f17668h;

        public C6258a() {
            ArrayList arrayList = new ArrayList();
            this.f17666f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        /* renamed from: d */
        private static String m25676d(String str, int i, int i2) {
            return C6130c.m25041d(C6257t.m25654t(str, i, i2, false));
        }

        /* renamed from: h */
        private boolean m25677h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: i */
        private boolean m25678i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: k */
        private static int m25679k(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C6257t.m25646a(str, i, i2, BuildConfig.FLAVOR, false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: m */
        private void m25680m() {
            List<String> list = this.f17666f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f17666f.isEmpty()) {
                this.f17666f.add(BuildConfig.FLAVOR);
                return;
            }
            List<String> list2 = this.f17666f;
            list2.set(list2.size() - 1, BuildConfig.FLAVOR);
        }

        /* renamed from: o */
        private static int m25681o(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: p */
        private void m25682p(String str, int i, int i2, boolean z, boolean z2) {
            String a = C6257t.m25646a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m25677h(a)) {
                if (m25678i(a)) {
                    m25680m();
                    return;
                }
                List<String> list = this.f17666f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f17666f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f17666f.add(a);
                }
                if (z) {
                    this.f17666f.add(BuildConfig.FLAVOR);
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: r */
        private void m25683r(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f17666f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f17666f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f17666f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p374m.p375g0.C6130c.m25052o(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m25682p(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.C6257t.C6258a.m25683r(java.lang.String, int, int):void");
        }

        /* renamed from: t */
        private static int m25684t(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: u */
        private static int m25685u(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C6258a mo17717a(String str, String str2) {
            if (str != null) {
                if (this.f17667g == null) {
                    this.f17667g = new ArrayList();
                }
                this.f17667g.add(C6257t.m25647b(str, " \"'<>#&=", true, false, true, true));
                this.f17667g.add(str2 != null ? C6257t.m25647b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C6258a mo17718b(String str, String str2) {
            if (str != null) {
                if (this.f17667g == null) {
                    this.f17667g = new ArrayList();
                }
                this.f17667g.add(C6257t.m25647b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.f17667g.add(str2 != null ? C6257t.m25647b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: c */
        public C6257t mo17719c() {
            if (this.f17661a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f17664d != null) {
                return new C6257t(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo17720e() {
            int i = this.f17665e;
            return i != -1 ? i : C6257t.m25650e(this.f17661a);
        }

        /* renamed from: f */
        public C6258a mo17721f(String str) {
            this.f17667g = str != null ? C6257t.m25645A(C6257t.m25647b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: g */
        public C6258a mo17722g(String str) {
            if (str != null) {
                String d = m25676d(str, 0, str.length());
                if (d != null) {
                    this.f17664d = d;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C6258a mo17723j(C6257t tVar, String str) {
            int o;
            int i;
            C6257t tVar2 = tVar;
            String str2 = str;
            int E = C6130c.m25032E(str2, 0, str.length());
            int F = C6130c.m25033F(str2, E, str.length());
            int t = m25684t(str2, E, F);
            if (t != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.f17661a = "https";
                    E += 6;
                } else if (str.regionMatches(true, E, "http:", 0, 5)) {
                    this.f17661a = "http";
                    E += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, t) + "'");
                }
            } else if (tVar2 != null) {
                this.f17661a = tVar2.f17652a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int u = m25685u(str2, E, F);
            char c = '?';
            char c2 = '#';
            if (u >= 2 || tVar2 == null || !tVar2.f17652a.equals(this.f17661a)) {
                int i2 = E + u;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    o = C6130c.m25052o(str2, i2, F, "@/\\?#");
                    char charAt = o != F ? str2.charAt(o) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = o;
                        int o2 = m25681o(str2, i2, i3);
                        int i4 = o2 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int n = C6130c.m25051n(str2, i2, o, ':');
                                int i5 = n;
                                String str3 = "%40";
                                i = o;
                                String a = C6257t.m25646a(str, i2, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a = this.f17662b + str3 + a;
                                }
                                this.f17662b = a;
                                if (i5 != i) {
                                    this.f17663c = C6257t.m25646a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = o;
                                this.f17663c += "%40" + C6257t.m25646a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = o;
                int o22 = m25681o(str2, i2, i32);
                int i42 = o22 + 1;
                if (i42 < i32) {
                    this.f17664d = m25676d(str2, i2, o22);
                    int k = m25679k(str2, i42, i32);
                    this.f17665e = k;
                    if (k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.f17664d = m25676d(str2, i2, o22);
                    this.f17665e = C6257t.m25650e(this.f17661a);
                }
                if (this.f17664d != null) {
                    E = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, o22) + '\"');
                }
            } else {
                this.f17662b = tVar.mo17708k();
                this.f17663c = tVar.mo17703g();
                this.f17664d = tVar2.f17655d;
                this.f17665e = tVar2.f17656e;
                this.f17666f.clear();
                this.f17666f.addAll(tVar.mo17706i());
                if (E == F || str2.charAt(E) == '#') {
                    mo17721f(tVar.mo17707j());
                }
            }
            int o3 = C6130c.m25052o(str2, E, F, "?#");
            m25683r(str2, E, o3);
            if (o3 < F && str2.charAt(o3) == '?') {
                int n2 = C6130c.m25051n(str2, o3, F, '#');
                this.f17667g = C6257t.m25645A(C6257t.m25646a(str, o3 + 1, n2, " \"'<>#", true, false, true, true, (Charset) null));
                o3 = n2;
            }
            if (o3 < F && str2.charAt(o3) == '#') {
                this.f17668h = C6257t.m25646a(str, 1 + o3, F, BuildConfig.FLAVOR, true, false, false, false, (Charset) null);
            }
            return this;
        }

        /* renamed from: l */
        public C6258a mo17724l(String str) {
            if (str != null) {
                this.f17663c = C6257t.m25647b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: n */
        public C6258a mo17725n(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f17665e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C6258a mo17726q() {
            int size = this.f17666f.size();
            for (int i = 0; i < size; i++) {
                this.f17666f.set(i, C6257t.m25647b(this.f17666f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f17667g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f17667g.get(i2);
                    if (str != null) {
                        this.f17667g.set(i2, C6257t.m25647b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f17668h;
            if (str2 != null) {
                this.f17668h = C6257t.m25647b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: s */
        public C6258a mo17727s(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.f17661a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f17661a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f17662b.isEmpty() || !this.f17663c.isEmpty()) {
                sb.append(this.f17662b);
                if (!this.f17663c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f17663c);
                }
                sb.append('@');
            }
            String str3 = this.f17664d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f17664d);
                    sb.append(']');
                } else {
                    sb.append(this.f17664d);
                }
            }
            if (!(this.f17665e == -1 && this.f17661a == null)) {
                int e = mo17720e();
                String str4 = this.f17661a;
                if (str4 == null || e != C6257t.m25650e(str4)) {
                    sb.append(':');
                    sb.append(e);
                }
            }
            C6257t.m25653s(sb, this.f17666f);
            if (this.f17667g != null) {
                sb.append('?');
                C6257t.m25652o(sb, this.f17667g);
            }
            if (this.f17668h != null) {
                sb.append('#');
                sb.append(this.f17668h);
            }
            return sb.toString();
        }

        /* renamed from: v */
        public C6258a mo17729v(String str) {
            if (str != null) {
                this.f17662b = C6257t.m25647b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
    }

    C6257t(C6258a aVar) {
        this.f17652a = aVar.f17661a;
        this.f17653b = m25655u(aVar.f17662b, false);
        this.f17654c = m25655u(aVar.f17663c, false);
        this.f17655d = aVar.f17664d;
        this.f17656e = aVar.mo17720e();
        this.f17657f = m25656v(aVar.f17666f, false);
        List<String> list = aVar.f17667g;
        String str = null;
        this.f17658g = list != null ? m25656v(list, true) : null;
        String str2 = aVar.f17668h;
        this.f17659h = str2 != null ? m25655u(str2, false) : str;
        this.f17660i = aVar.toString();
    }

    /* renamed from: A */
    static List<String> m25645A(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m25646a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m25658x(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C6277c cVar = new C6277c();
            int i5 = i;
            cVar.mo17795A0(str, i, i4);
            m25649d(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.mo17827i0();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    static String m25647b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m25646a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: c */
    static String m25648c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m25646a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: d */
    static void m25649d(C6277c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C6277c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.mo17864z0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m25658x(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C6277c();
                    }
                    if (charset == null || charset.equals(C6130c.f17205i)) {
                        cVar2.mo17797B0(codePointAt);
                    } else {
                        cVar2.mo17863y0(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.mo17794A()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo17852t0(37);
                        cVar.mo17852t0(f17651j[(readByte >> 4) & 15]);
                        cVar.mo17852t0(f17651j[readByte & 15]);
                    }
                } else {
                    cVar.mo17797B0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: e */
    public static int m25650e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: l */
    public static C6257t m25651l(String str) {
        C6258a aVar = new C6258a();
        aVar.mo17723j((C6257t) null, str);
        return aVar.mo17719c();
    }

    /* renamed from: o */
    static void m25652o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: s */
    static void m25653s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: t */
    static String m25654t(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C6277c cVar = new C6277c();
                cVar.mo17795A0(str, i, i3);
                m25657w(cVar, str, i3, i2, z);
                return cVar.mo17827i0();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: u */
    static String m25655u(String str, boolean z) {
        return m25654t(str, 0, str.length(), z);
    }

    /* renamed from: v */
    private List<String> m25656v(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m25655u(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: w */
    static void m25657w(C6277c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int k = C6130c.m25048k(str.charAt(i + 1));
                int k2 = C6130c.m25048k(str.charAt(i3));
                if (!(k == -1 || k2 == -1)) {
                    cVar.mo17852t0((k << 4) + k2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.mo17852t0(32);
                i += Character.charCount(codePointAt);
            }
            cVar.mo17797B0(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: x */
    static boolean m25658x(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C6130c.m25048k(str.charAt(i + 1)) != -1 && C6130c.m25048k(str.charAt(i3)) != -1;
    }

    /* renamed from: B */
    public String mo17697B() {
        C6258a q = mo17712q("/...");
        q.mo17729v(BuildConfig.FLAVOR);
        q.mo17724l(BuildConfig.FLAVOR);
        return q.mo17719c().toString();
    }

    /* renamed from: C */
    public C6257t mo17698C(String str) {
        C6258a q = mo17712q(str);
        if (q != null) {
            return q.mo17719c();
        }
        return null;
    }

    /* renamed from: D */
    public String mo17699D() {
        return this.f17652a;
    }

    /* renamed from: E */
    public URI mo17700E() {
        C6258a p = mo17711p();
        p.mo17726q();
        String aVar = p.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6257t) && ((C6257t) obj).f17660i.equals(this.f17660i);
    }

    /* renamed from: f */
    public String mo17702f() {
        if (this.f17659h == null) {
            return null;
        }
        return this.f17660i.substring(this.f17660i.indexOf(35) + 1);
    }

    /* renamed from: g */
    public String mo17703g() {
        if (this.f17654c.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int indexOf = this.f17660i.indexOf(64);
        return this.f17660i.substring(this.f17660i.indexOf(58, this.f17652a.length() + 3) + 1, indexOf);
    }

    /* renamed from: h */
    public String mo17704h() {
        int indexOf = this.f17660i.indexOf(47, this.f17652a.length() + 3);
        String str = this.f17660i;
        return this.f17660i.substring(indexOf, C6130c.m25052o(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f17660i.hashCode();
    }

    /* renamed from: i */
    public List<String> mo17706i() {
        int indexOf = this.f17660i.indexOf(47, this.f17652a.length() + 3);
        String str = this.f17660i;
        int o = C6130c.m25052o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < o) {
            int i = indexOf + 1;
            int n = C6130c.m25051n(this.f17660i, i, o, '/');
            arrayList.add(this.f17660i.substring(i, n));
            indexOf = n;
        }
        return arrayList;
    }

    /* renamed from: j */
    public String mo17707j() {
        if (this.f17658g == null) {
            return null;
        }
        int indexOf = this.f17660i.indexOf(63) + 1;
        String str = this.f17660i;
        return this.f17660i.substring(indexOf, C6130c.m25051n(str, indexOf, str.length(), '#'));
    }

    /* renamed from: k */
    public String mo17708k() {
        if (this.f17653b.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f17652a.length() + 3;
        String str = this.f17660i;
        return this.f17660i.substring(length, C6130c.m25052o(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public String mo17709m() {
        return this.f17655d;
    }

    /* renamed from: n */
    public boolean mo17710n() {
        return this.f17652a.equals("https");
    }

    /* renamed from: p */
    public C6258a mo17711p() {
        C6258a aVar = new C6258a();
        aVar.f17661a = this.f17652a;
        aVar.f17662b = mo17708k();
        aVar.f17663c = mo17703g();
        aVar.f17664d = this.f17655d;
        aVar.f17665e = this.f17656e != m25650e(this.f17652a) ? this.f17656e : -1;
        aVar.f17666f.clear();
        aVar.f17666f.addAll(mo17706i());
        aVar.mo17721f(mo17707j());
        aVar.f17668h = mo17702f();
        return aVar;
    }

    /* renamed from: q */
    public C6258a mo17712q(String str) {
        try {
            C6258a aVar = new C6258a();
            aVar.mo17723j(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public List<String> mo17713r() {
        return this.f17657f;
    }

    public String toString() {
        return this.f17660i;
    }

    /* renamed from: y */
    public int mo17715y() {
        return this.f17656e;
    }

    /* renamed from: z */
    public String mo17716z() {
        if (this.f17658g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m25652o(sb, this.f17658g);
        return sb.toString();
    }
}
