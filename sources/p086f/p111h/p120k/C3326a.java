package p086f.p111h.p120k;

import android.text.SpannableStringBuilder;
import com.karumi.dexter.BuildConfig;
import java.util.Locale;

/* renamed from: f.h.k.a */
public final class C3326a {

    /* renamed from: d */
    static final C3333d f10595d = C3334e.f10627c;

    /* renamed from: e */
    private static final String f10596e = Character.toString(8206);

    /* renamed from: f */
    private static final String f10597f = Character.toString(8207);

    /* renamed from: g */
    static final C3326a f10598g = new C3326a(false, 2, f10595d);

    /* renamed from: h */
    static final C3326a f10599h = new C3326a(true, 2, f10595d);

    /* renamed from: a */
    private final boolean f10600a;

    /* renamed from: b */
    private final int f10601b;

    /* renamed from: c */
    private final C3333d f10602c;

    /* renamed from: f.h.k.a$a */
    public static final class C3327a {

        /* renamed from: a */
        private boolean f10603a;

        /* renamed from: b */
        private int f10604b;

        /* renamed from: c */
        private C3333d f10605c;

        public C3327a() {
            m14310c(C3326a.m14301e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C3326a m14309b(boolean z) {
            return z ? C3326a.f10599h : C3326a.f10598g;
        }

        /* renamed from: c */
        private void m14310c(boolean z) {
            this.f10603a = z;
            this.f10605c = C3326a.f10595d;
            this.f10604b = 2;
        }

        /* renamed from: a */
        public C3326a mo11506a() {
            return (this.f10604b == 2 && this.f10605c == C3326a.f10595d) ? m14309b(this.f10603a) : new C3326a(this.f10603a, this.f10604b, this.f10605c);
        }
    }

    /* renamed from: f.h.k.a$b */
    private static class C3328b {

        /* renamed from: f */
        private static final byte[] f10606f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f10607a;

        /* renamed from: b */
        private final boolean f10608b;

        /* renamed from: c */
        private final int f10609c;

        /* renamed from: d */
        private int f10610d;

        /* renamed from: e */
        private char f10611e;

        static {
            for (int i = 0; i < 1792; i++) {
                f10606f[i] = Character.getDirectionality(i);
            }
        }

        C3328b(CharSequence charSequence, boolean z) {
            this.f10607a = charSequence;
            this.f10608b = z;
            this.f10609c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m14312c(char c) {
            return c < 1792 ? f10606f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m14313f() {
            char charAt;
            int i = this.f10610d;
            do {
                int i2 = this.f10610d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f10607a;
                int i3 = i2 - 1;
                this.f10610d = i3;
                charAt = charSequence.charAt(i3);
                this.f10611e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f10610d = i;
            this.f10611e = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m14314g() {
            char charAt;
            do {
                int i = this.f10610d;
                if (i >= this.f10609c) {
                    return 12;
                }
                CharSequence charSequence = this.f10607a;
                this.f10610d = i + 1;
                charAt = charSequence.charAt(i);
                this.f10611e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m14315h() {
            char charAt;
            int i = this.f10610d;
            while (true) {
                int i2 = this.f10610d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f10607a;
                int i3 = i2 - 1;
                this.f10610d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f10611e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f10611e;
                    do {
                        int i4 = this.f10610d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f10607a;
                        int i5 = i4 - 1;
                        this.f10610d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f10611e = charAt;
                    } while (charAt != c);
                }
            }
            this.f10610d = i;
            this.f10611e = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m14316i() {
            char charAt;
            int i = this.f10610d;
            while (true) {
                int i2 = this.f10610d;
                if (i2 < this.f10609c) {
                    CharSequence charSequence = this.f10607a;
                    this.f10610d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f10611e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.f10611e;
                        do {
                            int i3 = this.f10610d;
                            if (i3 >= this.f10609c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f10607a;
                            this.f10610d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f10611e = charAt;
                        } while (charAt != c);
                    }
                } else {
                    this.f10610d = i;
                    this.f10611e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo11507a() {
            char charAt = this.f10607a.charAt(this.f10610d - 1);
            this.f10611e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f10607a, this.f10610d);
                this.f10610d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f10610d--;
            byte c = m14312c(this.f10611e);
            if (!this.f10608b) {
                return c;
            }
            char c2 = this.f10611e;
            return c2 == '>' ? m14315h() : c2 == ';' ? m14313f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo11508b() {
            char charAt = this.f10607a.charAt(this.f10610d);
            this.f10611e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f10607a, this.f10610d);
                this.f10610d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f10610d++;
            byte c = m14312c(this.f10611e);
            if (!this.f10608b) {
                return c;
            }
            char c2 = this.f10611e;
            return c2 == '<' ? m14316i() : c2 == '&' ? m14314g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo11509d() {
            this.f10610d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f10610d < this.f10609c && i == 0) {
                byte b = mo11508b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f10610d > 0) {
                switch (mo11507a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo11510e() {
            /*
                r7 = this;
                int r0 = r7.f10609c
                r7.f10610d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f10610d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo11507a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p120k.C3326a.C3328b.mo11510e():int");
        }
    }

    C3326a(boolean z, int i, C3333d dVar) {
        this.f10600a = z;
        this.f10601b = i;
        this.f10602c = dVar;
    }

    /* renamed from: a */
    private static int m14298a(CharSequence charSequence) {
        return new C3328b(charSequence, false).mo11509d();
    }

    /* renamed from: b */
    private static int m14299b(CharSequence charSequence) {
        return new C3328b(charSequence, false).mo11510e();
    }

    /* renamed from: c */
    public static C3326a m14300c() {
        return new C3327a().mo11506a();
    }

    /* renamed from: e */
    static boolean m14301e(Locale locale) {
        return C3341f.m14347b(locale) == 1;
    }

    /* renamed from: f */
    private String m14302f(CharSequence charSequence, C3333d dVar) {
        boolean a = dVar.mo11536a(charSequence, 0, charSequence.length());
        return (this.f10600a || (!a && m14299b(charSequence) != 1)) ? this.f10600a ? (!a || m14299b(charSequence) == -1) ? f10597f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f10596e;
    }

    /* renamed from: g */
    private String m14303g(CharSequence charSequence, C3333d dVar) {
        boolean a = dVar.mo11536a(charSequence, 0, charSequence.length());
        return (this.f10600a || (!a && m14298a(charSequence) != 1)) ? this.f10600a ? (!a || m14298a(charSequence) == -1) ? f10597f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f10596e;
    }

    /* renamed from: d */
    public boolean mo11501d() {
        return (this.f10601b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo11502h(CharSequence charSequence) {
        return mo11503i(charSequence, this.f10602c, true);
    }

    /* renamed from: i */
    public CharSequence mo11503i(CharSequence charSequence, C3333d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo11536a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo11501d() && z) {
            spannableStringBuilder.append(m14303g(charSequence, a ? C3334e.f10626b : C3334e.f10625a));
        }
        if (a != this.f10600a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m14302f(charSequence, a ? C3334e.f10626b : C3334e.f10625a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo11504j(String str) {
        return mo11505k(str, this.f10602c, true);
    }

    /* renamed from: k */
    public String mo11505k(String str, C3333d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo11503i(str, dVar, z).toString();
    }
}
