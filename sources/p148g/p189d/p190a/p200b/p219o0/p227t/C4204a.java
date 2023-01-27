package p148g.p189d.p190a.p200b.p219o0.p227t;

import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p230r0.C4263d;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.t.a */
final class C4204a {

    /* renamed from: c */
    private static final Pattern f13430c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    private final C4274m f13431a = new C4274m();

    /* renamed from: b */
    private final StringBuilder f13432b = new StringBuilder();

    /* renamed from: a */
    private void m17835a(C4207d dVar, String str) {
        if (!BuildConfig.FLAVOR.equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f13430c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.mo13307v(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] split = str.split("\\.");
            String str2 = split[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.mo13306u(str2.substring(0, indexOf2));
                dVar.mo13305t(str2.substring(indexOf2 + 1));
            } else {
                dVar.mo13306u(str2);
            }
            if (split.length > 1) {
                dVar.mo13304s((String[]) Arrays.copyOfRange(split, 1, split.length));
            }
        }
    }

    /* renamed from: b */
    private static boolean m17836b(C4274m mVar) {
        int c = mVar.mo13458c();
        int d = mVar.mo13459d();
        byte[] bArr = mVar.f13643a;
        if (c + 2 > d) {
            return false;
        }
        int i = c + 1;
        if (bArr[c] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= d) {
                mVar.mo13455K(d - mVar.mo13458c());
                return true;
            } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    private static boolean m17837c(C4274m mVar) {
        char j = m17843j(mVar, mVar.mo13458c());
        if (j != 9 && j != 10 && j != 12 && j != 13 && j != ' ') {
            return false;
        }
        mVar.mo13455K(1);
        return true;
    }

    /* renamed from: e */
    private static String m17838e(C4274m mVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c = mVar.mo13458c();
        int d = mVar.mo13459d();
        while (c < d && !z) {
            char c2 = (char) mVar.f13643a[c];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                c++;
                sb.append(c2);
            }
        }
        mVar.mo13455K(c - mVar.mo13458c());
        return sb.toString();
    }

    /* renamed from: f */
    static String m17839f(C4274m mVar, StringBuilder sb) {
        m17846m(mVar);
        if (mVar.mo13456a() == 0) {
            return null;
        }
        String e = m17838e(mVar, sb);
        if (!BuildConfig.FLAVOR.equals(e)) {
            return e;
        }
        return BuildConfig.FLAVOR + ((char) mVar.mo13479x());
    }

    /* renamed from: g */
    private static String m17840g(C4274m mVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c = mVar.mo13458c();
            String f = m17839f(mVar, sb);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || ";".equals(f)) {
                mVar.mo13454J(c);
                z = true;
            } else {
                sb2.append(f);
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    private static String m17841h(C4274m mVar, StringBuilder sb) {
        m17846m(mVar);
        if (mVar.mo13456a() < 5 || !"::cue".equals(mVar.mo13476u(5))) {
            return null;
        }
        int c = mVar.mo13458c();
        String f = m17839f(mVar, sb);
        if (f == null) {
            return null;
        }
        if ("{".equals(f)) {
            mVar.mo13454J(c);
            return BuildConfig.FLAVOR;
        }
        String k = "(".equals(f) ? m17844k(mVar) : null;
        String f2 = m17839f(mVar, sb);
        if (!")".equals(f2) || f2 == null) {
            return null;
        }
        return k;
    }

    /* renamed from: i */
    private static void m17842i(C4274m mVar, C4207d dVar, StringBuilder sb) {
        m17846m(mVar);
        String e = m17838e(mVar, sb);
        if (!BuildConfig.FLAVOR.equals(e) && ":".equals(m17839f(mVar, sb))) {
            m17846m(mVar);
            String g = m17840g(mVar, sb);
            if (g != null && !BuildConfig.FLAVOR.equals(g)) {
                int c = mVar.mo13458c();
                String f = m17839f(mVar, sb);
                if (!";".equals(f)) {
                    if ("}".equals(f)) {
                        mVar.mo13454J(c);
                    } else {
                        return;
                    }
                }
                if ("color".equals(e)) {
                    dVar.mo13301p(C4263d.m18088c(g));
                } else if ("background-color".equals(e)) {
                    dVar.mo13299n(C4263d.m18088c(g));
                } else if ("text-decoration".equals(e)) {
                    if ("underline".equals(g)) {
                        dVar.mo13308w(true);
                    }
                } else if ("font-family".equals(e)) {
                    dVar.mo13302q(g);
                } else if ("font-weight".equals(e)) {
                    if ("bold".equals(g)) {
                        dVar.mo13300o(true);
                    }
                } else if ("font-style".equals(e) && "italic".equals(g)) {
                    dVar.mo13303r(true);
                }
            }
        }
    }

    /* renamed from: j */
    private static char m17843j(C4274m mVar, int i) {
        return (char) mVar.f13643a[i];
    }

    /* renamed from: k */
    private static String m17844k(C4274m mVar) {
        int c = mVar.mo13458c();
        int d = mVar.mo13459d();
        boolean z = false;
        while (c < d && !z) {
            int i = c + 1;
            z = ((char) mVar.f13643a[c]) == ')';
            c = i;
        }
        return mVar.mo13476u((c - 1) - mVar.mo13458c()).trim();
    }

    /* renamed from: l */
    static void m17845l(C4274m mVar) {
        do {
        } while (!TextUtils.isEmpty(mVar.mo13466k()));
    }

    /* renamed from: m */
    static void m17846m(C4274m mVar) {
        while (true) {
            boolean z = true;
            while (mVar.mo13456a() > 0 && z) {
                if (!m17837c(mVar) && !m17836b(mVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public C4207d mo13284d(C4274m mVar) {
        this.f13432b.setLength(0);
        int c = mVar.mo13458c();
        m17845l(mVar);
        this.f13431a.mo13452H(mVar.f13643a, mVar.mo13458c());
        this.f13431a.mo13454J(c);
        String h = m17841h(this.f13431a, this.f13432b);
        if (h == null || !"{".equals(m17839f(this.f13431a, this.f13432b))) {
            return null;
        }
        C4207d dVar = new C4207d();
        m17835a(dVar, h);
        String str = null;
        boolean z = false;
        while (!z) {
            int c2 = this.f13431a.mo13458c();
            str = m17839f(this.f13431a, this.f13432b);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.f13431a.mo13454J(c2);
                m17842i(this.f13431a, dVar, this.f13432b);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return dVar;
        }
        return null;
    }
}
