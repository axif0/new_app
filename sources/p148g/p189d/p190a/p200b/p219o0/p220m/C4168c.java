package p148g.p189d.p190a.p200b.p219o0.p220m;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p219o0.C4160i;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.m.c */
public final class C4168c extends C4171d {

    /* renamed from: g */
    private final C4274m f13242g = new C4274m();

    /* renamed from: h */
    private final C4273l f13243h = new C4273l();

    /* renamed from: i */
    private final int f13244i;

    /* renamed from: j */
    private final C4169a[] f13245j;

    /* renamed from: k */
    private C4169a f13246k;

    /* renamed from: l */
    private List<C4152b> f13247l;

    /* renamed from: m */
    private List<C4152b> f13248m;

    /* renamed from: n */
    private C4170b f13249n;

    /* renamed from: o */
    private int f13250o;

    /* renamed from: g.d.a.b.o0.m.c$a */
    private static final class C4169a {

        /* renamed from: A */
        private static final int[] f13251A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B */
        private static final int[] f13252B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C */
        private static final boolean[] f13253C = {false, false, false, true, true, true, false};

        /* renamed from: D */
        private static final int[] f13254D;

        /* renamed from: E */
        private static final int[] f13255E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F */
        private static final int[] f13256F = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: G */
        private static final int[] f13257G;

        /* renamed from: w */
        public static final int f13258w = m17668h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f13259x = m17668h(0, 0, 0, 0);

        /* renamed from: y */
        public static final int f13260y;

        /* renamed from: z */
        private static final int[] f13261z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a */
        private final List<SpannableString> f13262a = new LinkedList();

        /* renamed from: b */
        private final SpannableStringBuilder f13263b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f13264c;

        /* renamed from: d */
        private boolean f13265d;

        /* renamed from: e */
        private int f13266e;

        /* renamed from: f */
        private boolean f13267f;

        /* renamed from: g */
        private int f13268g;

        /* renamed from: h */
        private int f13269h;

        /* renamed from: i */
        private int f13270i;

        /* renamed from: j */
        private int f13271j;

        /* renamed from: k */
        private boolean f13272k;

        /* renamed from: l */
        private int f13273l;

        /* renamed from: m */
        private int f13274m;

        /* renamed from: n */
        private int f13275n;

        /* renamed from: o */
        private int f13276o;

        /* renamed from: p */
        private int f13277p;

        /* renamed from: q */
        private int f13278q;

        /* renamed from: r */
        private int f13279r;

        /* renamed from: s */
        private int f13280s;

        /* renamed from: t */
        private int f13281t;

        /* renamed from: u */
        private int f13282u;

        /* renamed from: v */
        private int f13283v;

        static {
            int h = m17668h(0, 0, 0, 3);
            f13260y = h;
            int i = f13259x;
            f13254D = new int[]{i, h, i, i, h, i, i};
            f13257G = new int[]{i, i, i, i, i, h, h};
        }

        public C4169a() {
            mo13232l();
        }

        /* renamed from: g */
        public static int m17667g(int i, int i2, int i3) {
            return m17668h(i, i2, i3, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m17668h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p148g.p189d.p190a.p200b.p230r0.C4260a.m18071c(r4, r0, r1)
                p148g.p189d.p190a.p200b.p230r0.C4260a.m18071c(r5, r0, r1)
                p148g.p189d.p190a.p200b.p230r0.C4260a.m18071c(r6, r0, r1)
                p148g.p189d.p190a.p200b.p230r0.C4260a.m18071c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p220m.C4168c.C4169a.m17668h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void mo13223a(char c) {
            if (c == 10) {
                this.f13262a.add(mo13226d());
                this.f13263b.clear();
                if (this.f13277p != -1) {
                    this.f13277p = 0;
                }
                if (this.f13278q != -1) {
                    this.f13278q = 0;
                }
                if (this.f13279r != -1) {
                    this.f13279r = 0;
                }
                if (this.f13281t != -1) {
                    this.f13281t = 0;
                }
                while (true) {
                    if ((this.f13272k && this.f13262a.size() >= this.f13271j) || this.f13262a.size() >= 15) {
                        this.f13262a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f13263b.append(c);
            }
        }

        /* renamed from: b */
        public void mo13224b() {
            int length = this.f13263b.length();
            if (length > 0) {
                this.f13263b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p148g.p189d.p190a.p200b.p219o0.p220m.C4167b mo13225c() {
            /*
                r15 = this;
                boolean r0 = r15.mo13230j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f13262a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f13262a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo13226d()
                r2.append(r1)
                int r1 = r15.f13273l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f13273l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f13267f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f13269h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f13268g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f13269h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f13268g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f13270i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x0099
            L_0x0093:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x0098
                r8 = 1
                goto L_0x0099
            L_0x0098:
                r8 = 2
            L_0x0099:
                int r1 = r15.f13270i
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x00a1
                r9 = 0
                goto L_0x00a7
            L_0x00a1:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a6
                r9 = 1
                goto L_0x00a7
            L_0x00a6:
                r9 = 2
            L_0x00a7:
                int r1 = r15.f13276o
                int r3 = f13259x
                if (r1 == r3) goto L_0x00ae
                r0 = 1
            L_0x00ae:
                g.d.a.b.o0.m.b r13 = new g.d.a.b.o0.m.b
                r5 = 0
                r11 = 1
                int r12 = r15.f13276o
                int r14 = r15.f13266e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p220m.C4168c.C4169a.mo13225c():g.d.a.b.o0.m.b");
        }

        /* renamed from: d */
        public SpannableString mo13226d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13263b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f13277p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f13277p, length, 33);
                }
                if (this.f13278q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13278q, length, 33);
                }
                if (this.f13279r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13280s), this.f13279r, length, 33);
                }
                if (this.f13281t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13282u), this.f13281t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void mo13227e() {
            this.f13262a.clear();
            this.f13263b.clear();
            this.f13277p = -1;
            this.f13278q = -1;
            this.f13279r = -1;
            this.f13281t = -1;
            this.f13283v = 0;
        }

        /* renamed from: f */
        public void mo13228f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f13264c = true;
            this.f13265d = z;
            this.f13272k = z5;
            this.f13266e = i;
            this.f13267f = z4;
            this.f13268g = i2;
            this.f13269h = i3;
            this.f13270i = i6;
            int i11 = i4 + 1;
            if (this.f13271j != i11) {
                this.f13271j = i11;
                while (true) {
                    if ((!z5 || this.f13262a.size() < this.f13271j) && this.f13262a.size() < 15) {
                        break;
                    }
                    this.f13262a.remove(0);
                }
            }
            if (!(i9 == 0 || this.f13274m == i9)) {
                this.f13274m = i9;
                int i12 = i9 - 1;
                mo13237q(f13254D[i12], f13260y, f13253C[i12], 0, f13251A[i12], f13252B[i12], f13261z[i12]);
            }
            if (i10 != 0 && this.f13275n != i10) {
                this.f13275n = i10;
                int i13 = i10 - 1;
                mo13233m(0, 1, 1, false, false, f13256F[i13], f13255E[i13]);
                mo13234n(f13258w, f13257G[i13], f13259x);
            }
        }

        /* renamed from: i */
        public boolean mo13229i() {
            return this.f13264c;
        }

        /* renamed from: j */
        public boolean mo13230j() {
            return !mo13229i() || (this.f13262a.isEmpty() && this.f13263b.length() == 0);
        }

        /* renamed from: k */
        public boolean mo13231k() {
            return this.f13265d;
        }

        /* renamed from: l */
        public void mo13232l() {
            mo13227e();
            this.f13264c = false;
            this.f13265d = false;
            this.f13266e = 4;
            this.f13267f = false;
            this.f13268g = 0;
            this.f13269h = 0;
            this.f13270i = 0;
            this.f13271j = 15;
            this.f13272k = true;
            this.f13273l = 0;
            this.f13274m = 0;
            this.f13275n = 0;
            int i = f13259x;
            this.f13276o = i;
            this.f13280s = f13258w;
            this.f13282u = i;
        }

        /* renamed from: m */
        public void mo13233m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f13277p != -1) {
                if (!z) {
                    this.f13263b.setSpan(new StyleSpan(2), this.f13277p, this.f13263b.length(), 33);
                    this.f13277p = -1;
                }
            } else if (z) {
                this.f13277p = this.f13263b.length();
            }
            if (this.f13278q != -1) {
                if (!z2) {
                    this.f13263b.setSpan(new UnderlineSpan(), this.f13278q, this.f13263b.length(), 33);
                    this.f13278q = -1;
                }
            } else if (z2) {
                this.f13278q = this.f13263b.length();
            }
        }

        /* renamed from: n */
        public void mo13234n(int i, int i2, int i3) {
            if (!(this.f13279r == -1 || this.f13280s == i)) {
                this.f13263b.setSpan(new ForegroundColorSpan(this.f13280s), this.f13279r, this.f13263b.length(), 33);
            }
            if (i != f13258w) {
                this.f13279r = this.f13263b.length();
                this.f13280s = i;
            }
            if (!(this.f13281t == -1 || this.f13282u == i2)) {
                this.f13263b.setSpan(new BackgroundColorSpan(this.f13282u), this.f13281t, this.f13263b.length(), 33);
            }
            if (i2 != f13259x) {
                this.f13281t = this.f13263b.length();
                this.f13282u = i2;
            }
        }

        /* renamed from: o */
        public void mo13235o(int i, int i2) {
            if (this.f13283v != i) {
                mo13223a(10);
            }
            this.f13283v = i;
        }

        /* renamed from: p */
        public void mo13236p(boolean z) {
            this.f13265d = z;
        }

        /* renamed from: q */
        public void mo13237q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f13276o = i;
            this.f13273l = i6;
        }
    }

    /* renamed from: g.d.a.b.o0.m.c$b */
    private static final class C4170b {

        /* renamed from: a */
        public final int f13284a;

        /* renamed from: b */
        public final int f13285b;

        /* renamed from: c */
        public final byte[] f13286c;

        /* renamed from: d */
        int f13287d = 0;

        public C4170b(int i, int i2) {
            this.f13284a = i;
            this.f13285b = i2;
            this.f13286c = new byte[((i2 * 2) - 1)];
        }
    }

    public C4168c(int i) {
        this.f13244i = i == -1 ? 1 : i;
        this.f13245j = new C4169a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f13245j[i2] = new C4169a();
        }
        this.f13246k = this.f13245j[0];
        m17650D();
    }

    /* renamed from: A */
    private void m17647A() {
        this.f13243h.mo13443o(4);
        int h = this.f13243h.mo13436h(4);
        this.f13243h.mo13443o(2);
        this.f13246k.mo13235o(h, this.f13243h.mo13436h(6));
    }

    /* renamed from: B */
    private void m17648B() {
        int h = C4169a.m17668h(this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2));
        int h2 = this.f13243h.mo13436h(2);
        int g = C4169a.m17667g(this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2));
        if (this.f13243h.mo13435g()) {
            h2 |= 4;
        }
        boolean g2 = this.f13243h.mo13435g();
        int h3 = this.f13243h.mo13436h(2);
        int h4 = this.f13243h.mo13436h(2);
        int h5 = this.f13243h.mo13436h(2);
        this.f13243h.mo13443o(8);
        this.f13246k.mo13237q(h, g, g2, h2, h3, h4, h5);
    }

    /* renamed from: C */
    private void m17649C() {
        String str;
        StringBuilder sb;
        C4170b bVar = this.f13249n;
        int i = bVar.f13287d;
        if (i != (bVar.f13285b * 2) - 1) {
            Log.w("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f13249n.f13285b * 2) - 1) + ", but current index is " + this.f13249n.f13287d + " (sequence number " + this.f13249n.f13284a + "); ignoring packet");
            return;
        }
        this.f13243h.mo13440l(bVar.f13286c, i);
        int h = this.f13243h.mo13436h(3);
        int h2 = this.f13243h.mo13436h(5);
        if (h == 7) {
            this.f13243h.mo13443o(2);
            h += this.f13243h.mo13436h(6);
        }
        if (h2 == 0) {
            if (h != 0) {
                Log.w("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
            }
        } else if (h == this.f13244i) {
            boolean z = false;
            while (this.f13243h.mo13430b() > 0) {
                int h3 = this.f13243h.mo13436h(8);
                if (h3 == 16) {
                    h3 = this.f13243h.mo13436h(8);
                    if (h3 <= 31) {
                        m17655r(h3);
                    } else if (h3 <= 127) {
                        m17660w(h3);
                    } else if (h3 <= 159) {
                        m17656s(h3);
                    } else if (h3 <= 255) {
                        m17661x(h3);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(h3);
                        Log.w("Cea708Decoder", sb.toString());
                    }
                } else if (h3 <= 31) {
                    m17653p(h3);
                } else if (h3 <= 127) {
                    m17658u(h3);
                } else if (h3 <= 159) {
                    m17654q(h3);
                } else if (h3 <= 255) {
                    m17659v(h3);
                } else {
                    sb = new StringBuilder();
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(h3);
                    Log.w("Cea708Decoder", sb.toString());
                }
                z = true;
            }
            if (z) {
                this.f13247l = m17652o();
            }
        }
    }

    /* renamed from: D */
    private void m17650D() {
        for (int i = 0; i < 8; i++) {
            this.f13245j[i].mo13232l();
        }
    }

    /* renamed from: n */
    private void m17651n() {
        if (this.f13249n != null) {
            m17649C();
            this.f13249n = null;
        }
    }

    /* renamed from: o */
    private List<C4152b> m17652o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f13245j[i].mo13230j() && this.f13245j[i].mo13231k()) {
                arrayList.add(this.f13245j[i].mo13225c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    private void m17653p(int i) {
        C4273l lVar;
        if (i == 0) {
            return;
        }
        if (i != 3) {
            int i2 = 8;
            if (i != 8) {
                switch (i) {
                    case 12:
                        m17650D();
                        return;
                    case 13:
                        this.f13246k.mo13223a(10);
                        return;
                    case 14:
                        return;
                    default:
                        if (i >= 17 && i <= 23) {
                            Log.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                            lVar = this.f13243h;
                        } else if (i < 24 || i > 31) {
                            Log.w("Cea708Decoder", "Invalid C0 command: " + i);
                            return;
                        } else {
                            Log.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                            lVar = this.f13243h;
                            i2 = 16;
                        }
                        lVar.mo13443o(i2);
                        return;
                }
            } else {
                this.f13246k.mo13224b();
            }
        } else {
            this.f13247l = m17652o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r5 = r4.f13243h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r5.mo13443o(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r4.f13243h.mo13435g() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r4.f13245j[8 - r2].mo13232l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r4.f13243h.mo13435g() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r4.f13245j[8 - r2].mo13236p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r4.f13243h.mo13435g() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r4.f13245j[8 - r2].mo13227e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r4.f13246k = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17654q(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00f9;
                case 129: goto L_0x00f9;
                case 130: goto L_0x00f9;
                case 131: goto L_0x00f9;
                case 132: goto L_0x00f9;
                case 133: goto L_0x00f9;
                case 134: goto L_0x00f9;
                case 135: goto L_0x00f9;
                case 136: goto L_0x00e3;
                case 137: goto L_0x00cc;
                case 138: goto L_0x00b5;
                case 139: goto L_0x0099;
                case 140: goto L_0x0083;
                case 141: goto L_0x007c;
                case 142: goto L_0x0107;
                case 143: goto L_0x0077;
                case 144: goto L_0x0063;
                case 145: goto L_0x0051;
                case 146: goto L_0x0043;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0031;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            android.util.Log.w(r0, r5)
            goto L_0x0107
        L_0x0020:
            int r5 = r5 + -152
            r4.m17657t(r5)
            int r0 = r4.f13250o
            if (r0 == r5) goto L_0x0107
            r4.f13250o = r5
            g.d.a.b.o0.m.c$a[] r0 = r4.f13245j
            r5 = r0[r5]
            goto L_0x0105
        L_0x0031:
            g.d.a.b.o0.m.c$a r5 = r4.f13246k
            boolean r5 = r5.mo13229i()
            if (r5 != 0) goto L_0x003e
            g.d.a.b.r0.l r5 = r4.f13243h
            r0 = 32
            goto L_0x006d
        L_0x003e:
            r4.m17648B()
            goto L_0x0107
        L_0x0043:
            g.d.a.b.o0.m.c$a r5 = r4.f13246k
            boolean r5 = r5.mo13229i()
            if (r5 != 0) goto L_0x004c
            goto L_0x006b
        L_0x004c:
            r4.m17647A()
            goto L_0x0107
        L_0x0051:
            g.d.a.b.o0.m.c$a r5 = r4.f13246k
            boolean r5 = r5.mo13229i()
            if (r5 != 0) goto L_0x005e
            g.d.a.b.r0.l r5 = r4.f13243h
            r0 = 24
            goto L_0x006d
        L_0x005e:
            r4.m17663z()
            goto L_0x0107
        L_0x0063:
            g.d.a.b.o0.m.c$a r5 = r4.f13246k
            boolean r5 = r5.mo13229i()
            if (r5 != 0) goto L_0x0072
        L_0x006b:
            g.d.a.b.r0.l r5 = r4.f13243h
        L_0x006d:
            r5.mo13443o(r0)
            goto L_0x0107
        L_0x0072:
            r4.m17662y()
            goto L_0x0107
        L_0x0077:
            r4.m17650D()
            goto L_0x0107
        L_0x007c:
            g.d.a.b.r0.l r5 = r4.f13243h
            r5.mo13443o(r1)
            goto L_0x0107
        L_0x0083:
            if (r2 > r1) goto L_0x0107
            g.d.a.b.r0.l r5 = r4.f13243h
            boolean r5 = r5.mo13435g()
            if (r5 == 0) goto L_0x0096
            g.d.a.b.o0.m.c$a[] r5 = r4.f13245j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo13232l()
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r5 > r1) goto L_0x0107
            g.d.a.b.r0.l r0 = r4.f13243h
            boolean r0 = r0.mo13435g()
            if (r0 == 0) goto L_0x00b2
            g.d.a.b.o0.m.c$a[] r0 = r4.f13245j
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo13231k()
            r3 = r3 ^ r2
            r0.mo13236p(r3)
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00b5:
            if (r2 > r1) goto L_0x0107
            g.d.a.b.r0.l r5 = r4.f13243h
            boolean r5 = r5.mo13435g()
            if (r5 == 0) goto L_0x00c9
            g.d.a.b.o0.m.c$a[] r5 = r4.f13245j
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo13236p(r0)
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00cc:
            r5 = 1
        L_0x00cd:
            if (r5 > r1) goto L_0x0107
            g.d.a.b.r0.l r0 = r4.f13243h
            boolean r0 = r0.mo13435g()
            if (r0 == 0) goto L_0x00e0
            g.d.a.b.o0.m.c$a[] r0 = r4.f13245j
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo13236p(r2)
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00e3:
            if (r2 > r1) goto L_0x0107
            g.d.a.b.r0.l r5 = r4.f13243h
            boolean r5 = r5.mo13435g()
            if (r5 == 0) goto L_0x00f6
            g.d.a.b.o0.m.c$a[] r5 = r4.f13245j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo13227e()
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x00f9:
            int r5 = r5 + -128
            int r0 = r4.f13250o
            if (r0 == r5) goto L_0x0107
            r4.f13250o = r5
            g.d.a.b.o0.m.c$a[] r0 = r4.f13245j
            r5 = r0[r5]
        L_0x0105:
            r4.f13246k = r5
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p220m.C4168c.m17654q(int):void");
    }

    /* renamed from: r */
    private void m17655r(int i) {
        C4273l lVar;
        int i2;
        if (i > 7) {
            if (i <= 15) {
                lVar = this.f13243h;
                i2 = 8;
            } else if (i <= 23) {
                lVar = this.f13243h;
                i2 = 16;
            } else if (i <= 31) {
                lVar = this.f13243h;
                i2 = 24;
            } else {
                return;
            }
            lVar.mo13443o(i2);
        }
    }

    /* renamed from: s */
    private void m17656s(int i) {
        C4273l lVar;
        int i2;
        if (i <= 135) {
            lVar = this.f13243h;
            i2 = 32;
        } else if (i <= 143) {
            lVar = this.f13243h;
            i2 = 40;
        } else if (i <= 159) {
            this.f13243h.mo13443o(2);
            this.f13243h.mo13443o(this.f13243h.mo13436h(6) * 8);
            return;
        } else {
            return;
        }
        lVar.mo13443o(i2);
    }

    /* renamed from: t */
    private void m17657t(int i) {
        C4169a aVar = this.f13245j[i];
        this.f13243h.mo13443o(2);
        boolean g = this.f13243h.mo13435g();
        boolean g2 = this.f13243h.mo13435g();
        boolean g3 = this.f13243h.mo13435g();
        int h = this.f13243h.mo13436h(3);
        boolean g4 = this.f13243h.mo13435g();
        int h2 = this.f13243h.mo13436h(7);
        int h3 = this.f13243h.mo13436h(8);
        int h4 = this.f13243h.mo13436h(4);
        int h5 = this.f13243h.mo13436h(4);
        this.f13243h.mo13443o(2);
        int h6 = this.f13243h.mo13436h(6);
        this.f13243h.mo13443o(2);
        aVar.mo13228f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f13243h.mo13436h(3), this.f13243h.mo13436h(3));
    }

    /* renamed from: u */
    private void m17658u(int i) {
        if (i == 127) {
            this.f13246k.mo13223a(9835);
        } else {
            this.f13246k.mo13223a((char) (i & 255));
        }
    }

    /* renamed from: v */
    private void m17659v(int i) {
        this.f13246k.mo13223a((char) (i & 255));
    }

    /* renamed from: w */
    private void m17660w(int i) {
        C4169a aVar;
        char c = ' ';
        if (i == 32) {
            aVar = this.f13246k;
        } else if (i == 33) {
            aVar = this.f13246k;
            c = 160;
        } else if (i == 37) {
            aVar = this.f13246k;
            c = 8230;
        } else if (i == 42) {
            aVar = this.f13246k;
            c = 352;
        } else if (i == 44) {
            aVar = this.f13246k;
            c = 338;
        } else if (i == 63) {
            aVar = this.f13246k;
            c = 376;
        } else if (i == 57) {
            aVar = this.f13246k;
            c = 8482;
        } else if (i == 58) {
            aVar = this.f13246k;
            c = 353;
        } else if (i == 60) {
            aVar = this.f13246k;
            c = 339;
        } else if (i != 61) {
            switch (i) {
                case 48:
                    aVar = this.f13246k;
                    c = 9608;
                    break;
                case 49:
                    aVar = this.f13246k;
                    c = 8216;
                    break;
                case 50:
                    aVar = this.f13246k;
                    c = 8217;
                    break;
                case 51:
                    aVar = this.f13246k;
                    c = 8220;
                    break;
                case 52:
                    aVar = this.f13246k;
                    c = 8221;
                    break;
                case 53:
                    aVar = this.f13246k;
                    c = 8226;
                    break;
                default:
                    switch (i) {
                        case 118:
                            aVar = this.f13246k;
                            c = 8539;
                            break;
                        case 119:
                            aVar = this.f13246k;
                            c = 8540;
                            break;
                        case 120:
                            aVar = this.f13246k;
                            c = 8541;
                            break;
                        case 121:
                            aVar = this.f13246k;
                            c = 8542;
                            break;
                        case 122:
                            aVar = this.f13246k;
                            c = 9474;
                            break;
                        case 123:
                            aVar = this.f13246k;
                            c = 9488;
                            break;
                        case 124:
                            aVar = this.f13246k;
                            c = 9492;
                            break;
                        case 125:
                            aVar = this.f13246k;
                            c = 9472;
                            break;
                        case 126:
                            aVar = this.f13246k;
                            c = 9496;
                            break;
                        case 127:
                            aVar = this.f13246k;
                            c = 9484;
                            break;
                        default:
                            Log.w("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            aVar = this.f13246k;
            c = 8480;
        }
        aVar.mo13223a(c);
    }

    /* renamed from: x */
    private void m17661x(int i) {
        C4169a aVar;
        char c;
        if (i == 160) {
            aVar = this.f13246k;
            c = 13252;
        } else {
            Log.w("Cea708Decoder", "Invalid G3 character: " + i);
            aVar = this.f13246k;
            c = '_';
        }
        aVar.mo13223a(c);
    }

    /* renamed from: y */
    private void m17662y() {
        this.f13246k.mo13233m(this.f13243h.mo13436h(4), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13435g(), this.f13243h.mo13435g(), this.f13243h.mo13436h(3), this.f13243h.mo13436h(3));
    }

    /* renamed from: z */
    private void m17663z() {
        int h = C4169a.m17668h(this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2));
        int h2 = C4169a.m17668h(this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2));
        this.f13243h.mo13443o(2);
        this.f13246k.mo13234n(h, h2, C4169a.m17667g(this.f13243h.mo13436h(2), this.f13243h.mo13436h(2), this.f13243h.mo13436h(2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4155e mo13202f() {
        List<C4152b> list = this.f13247l;
        this.f13248m = list;
        return new C4175e(list);
    }

    public void flush() {
        super.flush();
        this.f13247l = null;
        this.f13248m = null;
        this.f13250o = 0;
        this.f13246k = this.f13245j[0];
        m17650D();
        this.f13249n = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo13203g(C4160i iVar) {
        this.f13242g.mo13452H(iVar.f11822h.array(), iVar.f11822h.limit());
        while (this.f13242g.mo13456a() >= 3) {
            int x = this.f13242g.mo13479x() & 7;
            int i = x & 3;
            boolean z = false;
            boolean z2 = (x & 4) == 4;
            byte x2 = (byte) this.f13242g.mo13479x();
            byte x3 = (byte) this.f13242g.mo13479x();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    m17651n();
                    int i2 = (x2 & 192) >> 6;
                    byte b = x2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    C4170b bVar = new C4170b(i2, b);
                    this.f13249n = bVar;
                    byte[] bArr = bVar.f13286c;
                    int i3 = bVar.f13287d;
                    bVar.f13287d = i3 + 1;
                    bArr[i3] = x3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    C4260a.m18069a(z);
                    C4170b bVar2 = this.f13249n;
                    if (bVar2 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.f13286c;
                        int i4 = bVar2.f13287d;
                        int i5 = i4 + 1;
                        bVar2.f13287d = i5;
                        bArr2[i4] = x2;
                        bVar2.f13287d = i5 + 1;
                        bArr2[i5] = x3;
                    }
                }
                C4170b bVar3 = this.f13249n;
                if (bVar3.f13287d == (bVar3.f13285b * 2) - 1) {
                    m17651n();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo13204j() {
        return this.f13247l != this.f13248m;
    }
}
