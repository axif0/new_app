package p351k.p352a0;

import p351k.p361v.p363d.C5956g;
import p351k.p365x.C5968a;
import p351k.p365x.C5971c;

/* renamed from: k.a0.m */
class C5839m extends C5838l {
    /* renamed from: e */
    public static final C5971c m24339e(CharSequence charSequence) {
        C5956g.m24500e(charSequence, "$this$indices");
        return new C5971c(0, charSequence.length() - 1);
    }

    /* renamed from: f */
    public static final int m24340f(CharSequence charSequence) {
        C5956g.m24500e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: g */
    public static final int m24341g(CharSequence charSequence, char c, int i, boolean z) {
        C5956g.m24500e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m24344j(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: h */
    private static final int m24342h(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C5968a cVar = !z2 ? new C5971c(C5974f.m24542a(i, 0), C5974f.m24544c(i2, charSequence.length())) : C5974f.m24546e(C5974f.m24544c(i, m24340f(charSequence)), C5974f.m24542a(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int c = cVar.mo17019c();
            int d = cVar.mo17020d();
            int f = cVar.mo17022f();
            if (f >= 0) {
                if (c > d) {
                    return -1;
                }
            } else if (c < d) {
                return -1;
            }
            while (true) {
                if (m24350p(charSequence2, 0, charSequence, c, charSequence2.length(), z)) {
                    return c;
                }
                if (c == d) {
                    return -1;
                }
                c += f;
            }
        } else {
            int c2 = cVar.mo17019c();
            int d2 = cVar.mo17020d();
            int f2 = cVar.mo17022f();
            if (f2 >= 0) {
                if (c2 > d2) {
                    return -1;
                }
            } else if (c2 < d2) {
                return -1;
            }
            while (true) {
                if (C5838l.m24336b((String) charSequence2, 0, (String) charSequence, c2, charSequence2.length(), z)) {
                    return c2;
                }
                if (c2 == d2) {
                    return -1;
                }
                c2 += f2;
            }
        }
    }

    /* renamed from: i */
    public static /* synthetic */ int m24343i(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24341g(charSequence, c, i, z);
    }

    /* renamed from: j */
    public static final int m24344j(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C5956g.m24500e(charSequence, "$this$indexOfAny");
        C5956g.m24500e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C5974f.m24542a(i, 0);
            int f = m24340f(charSequence);
            if (a > f) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (C5828b.m24328b(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == f) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C5865e.m24379e(cArr), i);
        }
    }

    /* renamed from: k */
    public static final int m24345k(CharSequence charSequence, char c, int i, boolean z) {
        C5956g.m24500e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m24349o(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: l */
    public static final int m24346l(CharSequence charSequence, String str, int i, boolean z) {
        C5956g.m24500e(charSequence, "$this$lastIndexOf");
        C5956g.m24500e(str, "string");
        return (z || !(charSequence instanceof String)) ? m24342h(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: m */
    public static /* synthetic */ int m24347m(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24340f(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24345k(charSequence, c, i, z);
    }

    /* renamed from: n */
    public static /* synthetic */ int m24348n(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24340f(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24346l(charSequence, str, i, z);
    }

    /* renamed from: o */
    public static final int m24349o(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C5956g.m24500e(charSequence, "$this$lastIndexOfAny");
        C5956g.m24500e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c = C5974f.m24544c(i, m24340f(charSequence)); c >= 0; c--) {
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C5828b.m24328b(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return c;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C5865e.m24379e(cArr), i);
    }

    /* renamed from: p */
    public static final boolean m24350p(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C5956g.m24500e(charSequence, "$this$regionMatchesImpl");
        C5956g.m24500e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C5828b.m24328b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static final String m24351q(String str, char c, String str2) {
        C5956g.m24500e(str, "$this$substringAfterLast");
        C5956g.m24500e(str2, "missingDelimiterValue");
        int m = m24347m(str, c, 0, false, 6, (Object) null);
        if (m == -1) {
            return str2;
        }
        String substring = str.substring(m + 1, str.length());
        C5956g.m24499d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: r */
    public static /* synthetic */ String m24352r(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m24351q(str, c, str2);
    }

    /* renamed from: s */
    public static CharSequence m24353s(CharSequence charSequence) {
        C5956g.m24500e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C5827a.m24327a(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
