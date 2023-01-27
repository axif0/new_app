package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3232f;
import p086f.p103f.p107b.p108k.C3233g;
import p086f.p103f.p107b.p108k.p109m.C3241b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: f */
    SparseArray<View> f2017f = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<C0528c> f2018g = new ArrayList<>(4);

    /* renamed from: h */
    protected C3232f f2019h = new C3232f();

    /* renamed from: i */
    private int f2020i = 0;

    /* renamed from: j */
    private int f2021j = 0;

    /* renamed from: k */
    private int f2022k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f2023l = Integer.MAX_VALUE;

    /* renamed from: m */
    protected boolean f2024m = true;

    /* renamed from: n */
    private int f2025n = 263;

    /* renamed from: o */
    private C0532e f2026o = null;

    /* renamed from: p */
    protected C0529d f2027p = null;

    /* renamed from: q */
    private int f2028q = -1;

    /* renamed from: r */
    private HashMap<String, Integer> f2029r = new HashMap<>();

    /* renamed from: s */
    private int f2030s = -1;

    /* renamed from: t */
    private int f2031t = -1;

    /* renamed from: u */
    private SparseArray<C3229e> f2032u = new SparseArray<>();

    /* renamed from: v */
    C0523c f2033v = new C0523c(this);

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0520a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2034a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                f.f.b.k.e$b[] r0 = p086f.p103f.p107b.p108k.C3229e.C3231b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2034a = r0
                f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0520a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0521b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2035A = 0.5f;

        /* renamed from: B */
        public String f2036B = null;

        /* renamed from: C */
        int f2037C = 1;

        /* renamed from: D */
        public float f2038D = -1.0f;

        /* renamed from: E */
        public float f2039E = -1.0f;

        /* renamed from: F */
        public int f2040F = 0;

        /* renamed from: G */
        public int f2041G = 0;

        /* renamed from: H */
        public int f2042H = 0;

        /* renamed from: I */
        public int f2043I = 0;

        /* renamed from: J */
        public int f2044J = 0;

        /* renamed from: K */
        public int f2045K = 0;

        /* renamed from: L */
        public int f2046L = 0;

        /* renamed from: M */
        public int f2047M = 0;

        /* renamed from: N */
        public float f2048N = 1.0f;

        /* renamed from: O */
        public float f2049O = 1.0f;

        /* renamed from: P */
        public int f2050P = -1;

        /* renamed from: Q */
        public int f2051Q = -1;

        /* renamed from: R */
        public int f2052R = -1;

        /* renamed from: S */
        public boolean f2053S = false;

        /* renamed from: T */
        public boolean f2054T = false;

        /* renamed from: U */
        public String f2055U = null;

        /* renamed from: V */
        boolean f2056V = true;

        /* renamed from: W */
        boolean f2057W = true;

        /* renamed from: X */
        boolean f2058X = false;

        /* renamed from: Y */
        boolean f2059Y = false;

        /* renamed from: Z */
        boolean f2060Z = false;

        /* renamed from: a */
        public int f2061a = -1;

        /* renamed from: a0 */
        boolean f2062a0 = false;

        /* renamed from: b */
        public int f2063b = -1;

        /* renamed from: b0 */
        boolean f2064b0 = false;

        /* renamed from: c */
        public float f2065c = -1.0f;

        /* renamed from: c0 */
        int f2066c0 = -1;

        /* renamed from: d */
        public int f2067d = -1;

        /* renamed from: d0 */
        int f2068d0 = -1;

        /* renamed from: e */
        public int f2069e = -1;

        /* renamed from: e0 */
        int f2070e0 = -1;

        /* renamed from: f */
        public int f2071f = -1;

        /* renamed from: f0 */
        int f2072f0 = -1;

        /* renamed from: g */
        public int f2073g = -1;

        /* renamed from: g0 */
        int f2074g0 = -1;

        /* renamed from: h */
        public int f2075h = -1;

        /* renamed from: h0 */
        int f2076h0 = -1;

        /* renamed from: i */
        public int f2077i = -1;

        /* renamed from: i0 */
        float f2078i0 = 0.5f;

        /* renamed from: j */
        public int f2079j = -1;

        /* renamed from: j0 */
        int f2080j0;

        /* renamed from: k */
        public int f2081k = -1;

        /* renamed from: k0 */
        int f2082k0;

        /* renamed from: l */
        public int f2083l = -1;

        /* renamed from: l0 */
        float f2084l0;

        /* renamed from: m */
        public int f2085m = -1;

        /* renamed from: m0 */
        C3229e f2086m0 = new C3229e();

        /* renamed from: n */
        public int f2087n = 0;

        /* renamed from: n0 */
        public boolean f2088n0;

        /* renamed from: o */
        public float f2089o = 0.0f;

        /* renamed from: p */
        public int f2090p = -1;

        /* renamed from: q */
        public int f2091q = -1;

        /* renamed from: r */
        public int f2092r = -1;

        /* renamed from: s */
        public int f2093s = -1;

        /* renamed from: t */
        public int f2094t = -1;

        /* renamed from: u */
        public int f2095u = -1;

        /* renamed from: v */
        public int f2096v = -1;

        /* renamed from: w */
        public int f2097w = -1;

        /* renamed from: x */
        public int f2098x = -1;

        /* renamed from: y */
        public int f2099y = -1;

        /* renamed from: z */
        public float f2100z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0522a {

            /* renamed from: a */
            public static final SparseIntArray f2101a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2101a = sparseIntArray;
                sparseIntArray.append(C0544k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f2101a.append(C0544k.ConstraintLayout_Layout_android_orientation, 1);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f2101a.append(C0544k.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public C0521b(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0217, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0521b(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f2061a = r0
                r10.f2063b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f2065c = r1
                r10.f2067d = r0
                r10.f2069e = r0
                r10.f2071f = r0
                r10.f2073g = r0
                r10.f2075h = r0
                r10.f2077i = r0
                r10.f2079j = r0
                r10.f2081k = r0
                r10.f2083l = r0
                r10.f2085m = r0
                r2 = 0
                r10.f2087n = r2
                r3 = 0
                r10.f2089o = r3
                r10.f2090p = r0
                r10.f2091q = r0
                r10.f2092r = r0
                r10.f2093s = r0
                r10.f2094t = r0
                r10.f2095u = r0
                r10.f2096v = r0
                r10.f2097w = r0
                r10.f2098x = r0
                r10.f2099y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.f2100z = r4
                r10.f2035A = r4
                r5 = 0
                r10.f2036B = r5
                r6 = 1
                r10.f2037C = r6
                r10.f2038D = r1
                r10.f2039E = r1
                r10.f2040F = r2
                r10.f2041G = r2
                r10.f2042H = r2
                r10.f2043I = r2
                r10.f2044J = r2
                r10.f2045K = r2
                r10.f2046L = r2
                r10.f2047M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.f2048N = r1
                r10.f2049O = r1
                r10.f2050P = r0
                r10.f2051Q = r0
                r10.f2052R = r0
                r10.f2053S = r2
                r10.f2054T = r2
                r10.f2055U = r5
                r10.f2056V = r6
                r10.f2057W = r6
                r10.f2058X = r2
                r10.f2059Y = r2
                r10.f2060Z = r2
                r10.f2062a0 = r2
                r10.f2064b0 = r2
                r10.f2066c0 = r0
                r10.f2068d0 = r0
                r10.f2070e0 = r0
                r10.f2072f0 = r0
                r10.f2074g0 = r0
                r10.f2076h0 = r0
                r10.f2078i0 = r4
                f.f.b.k.e r1 = new f.f.b.k.e
                r1.<init>()
                r10.f2086m0 = r1
                int[] r1 = androidx.constraintlayout.widget.C0544k.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = 0
            L_0x009a:
                if (r1 >= r12) goto L_0x03be
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.C0521b.C0522a.f2101a
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L_0x03b2;
                    case 2: goto L_0x03a1;
                    case 3: goto L_0x0398;
                    case 4: goto L_0x0383;
                    case 5: goto L_0x037a;
                    case 6: goto L_0x0371;
                    case 7: goto L_0x0368;
                    case 8: goto L_0x0357;
                    case 9: goto L_0x0346;
                    case 10: goto L_0x0334;
                    case 11: goto L_0x0322;
                    case 12: goto L_0x0310;
                    case 13: goto L_0x02fe;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02da;
                    case 16: goto L_0x02c8;
                    case 17: goto L_0x02b6;
                    case 18: goto L_0x02a4;
                    case 19: goto L_0x0292;
                    case 20: goto L_0x0280;
                    case 21: goto L_0x0276;
                    case 22: goto L_0x026c;
                    case 23: goto L_0x0262;
                    case 24: goto L_0x0258;
                    case 25: goto L_0x024e;
                    case 26: goto L_0x0244;
                    case 27: goto L_0x023a;
                    case 28: goto L_0x0230;
                    case 29: goto L_0x0226;
                    case 30: goto L_0x021c;
                    case 31: goto L_0x020d;
                    case 32: goto L_0x0202;
                    case 33: goto L_0x01eb;
                    case 34: goto L_0x01d4;
                    case 35: goto L_0x01c4;
                    case 36: goto L_0x01ad;
                    case 37: goto L_0x0196;
                    case 38: goto L_0x0186;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                switch(r5) {
                    case 44: goto L_0x00f2;
                    case 45: goto L_0x00e8;
                    case 46: goto L_0x00de;
                    case 47: goto L_0x00d6;
                    case 48: goto L_0x00ce;
                    case 49: goto L_0x00c4;
                    case 50: goto L_0x00ba;
                    case 51: goto L_0x00b2;
                    default: goto L_0x00b0;
                }
            L_0x00b0:
                goto L_0x03ba
            L_0x00b2:
                java.lang.String r4 = r11.getString(r4)
                r10.f2055U = r4
                goto L_0x03ba
            L_0x00ba:
                int r5 = r10.f2051Q
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f2051Q = r4
                goto L_0x03ba
            L_0x00c4:
                int r5 = r10.f2050P
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f2050P = r4
                goto L_0x03ba
            L_0x00ce:
                int r4 = r11.getInt(r4, r2)
                r10.f2041G = r4
                goto L_0x03ba
            L_0x00d6:
                int r4 = r11.getInt(r4, r2)
                r10.f2040F = r4
                goto L_0x03ba
            L_0x00de:
                float r5 = r10.f2039E
                float r4 = r11.getFloat(r4, r5)
                r10.f2039E = r4
                goto L_0x03ba
            L_0x00e8:
                float r5 = r10.f2038D
                float r4 = r11.getFloat(r4, r5)
                r10.f2038D = r4
                goto L_0x03ba
            L_0x00f2:
                java.lang.String r4 = r11.getString(r4)
                r10.f2036B = r4
                r10.f2037C = r0
                if (r4 == 0) goto L_0x03ba
                int r4 = r4.length()
                java.lang.String r5 = r10.f2036B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L_0x012c
                int r7 = r4 + -1
                if (r5 >= r7) goto L_0x012c
                java.lang.String r7 = r10.f2036B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x011f
                r10.f2037C = r2
                goto L_0x0129
            L_0x011f:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0129
                r10.f2037C = r6
            L_0x0129:
                int r5 = r5 + 1
                goto L_0x012d
            L_0x012c:
                r5 = 0
            L_0x012d:
                java.lang.String r7 = r10.f2036B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0175
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0175
                java.lang.String r4 = r10.f2036B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.f2036B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03ba
                int r7 = r5.length()
                if (r7 <= 0) goto L_0x03ba
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = r10.f2037C     // Catch:{ NumberFormatException -> 0x03ba }
                if (r7 != r6) goto L_0x016f
                float r5 = r5 / r4
                java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x016f:
                float r4 = r4 / r5
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x0175:
                java.lang.String r4 = r10.f2036B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x03ba
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x0186:
                float r5 = r10.f2049O
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f2049O = r4
                r10.f2043I = r8
                goto L_0x03ba
            L_0x0196:
                int r5 = r10.f2047M     // Catch:{ Exception -> 0x01a0 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01a0 }
                r10.f2047M = r5     // Catch:{ Exception -> 0x01a0 }
                goto L_0x03ba
            L_0x01a0:
                int r5 = r10.f2047M
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f2047M = r9
                goto L_0x03ba
            L_0x01ad:
                int r5 = r10.f2045K     // Catch:{ Exception -> 0x01b7 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01b7 }
                r10.f2045K = r5     // Catch:{ Exception -> 0x01b7 }
                goto L_0x03ba
            L_0x01b7:
                int r5 = r10.f2045K
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f2045K = r9
                goto L_0x03ba
            L_0x01c4:
                float r5 = r10.f2048N
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f2048N = r4
                r10.f2042H = r8
                goto L_0x03ba
            L_0x01d4:
                int r5 = r10.f2046L     // Catch:{ Exception -> 0x01de }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01de }
                r10.f2046L = r5     // Catch:{ Exception -> 0x01de }
                goto L_0x03ba
            L_0x01de:
                int r5 = r10.f2046L
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f2046L = r9
                goto L_0x03ba
            L_0x01eb:
                int r5 = r10.f2044J     // Catch:{ Exception -> 0x01f5 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01f5 }
                r10.f2044J = r5     // Catch:{ Exception -> 0x01f5 }
                goto L_0x03ba
            L_0x01f5:
                int r5 = r10.f2044J
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f2044J = r9
                goto L_0x03ba
            L_0x0202:
                int r4 = r11.getInt(r4, r2)
                r10.f2043I = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0217
            L_0x020d:
                int r4 = r11.getInt(r4, r2)
                r10.f2042H = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0217:
                android.util.Log.e(r7, r4)
                goto L_0x03ba
            L_0x021c:
                float r5 = r10.f2035A
                float r4 = r11.getFloat(r4, r5)
                r10.f2035A = r4
                goto L_0x03ba
            L_0x0226:
                float r5 = r10.f2100z
                float r4 = r11.getFloat(r4, r5)
                r10.f2100z = r4
                goto L_0x03ba
            L_0x0230:
                boolean r5 = r10.f2054T
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f2054T = r4
                goto L_0x03ba
            L_0x023a:
                boolean r5 = r10.f2053S
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f2053S = r4
                goto L_0x03ba
            L_0x0244:
                int r5 = r10.f2099y
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2099y = r4
                goto L_0x03ba
            L_0x024e:
                int r5 = r10.f2098x
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2098x = r4
                goto L_0x03ba
            L_0x0258:
                int r5 = r10.f2097w
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2097w = r4
                goto L_0x03ba
            L_0x0262:
                int r5 = r10.f2096v
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2096v = r4
                goto L_0x03ba
            L_0x026c:
                int r5 = r10.f2095u
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2095u = r4
                goto L_0x03ba
            L_0x0276:
                int r5 = r10.f2094t
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2094t = r4
                goto L_0x03ba
            L_0x0280:
                int r5 = r10.f2093s
                int r5 = r11.getResourceId(r4, r5)
                r10.f2093s = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2093s = r4
                goto L_0x03ba
            L_0x0292:
                int r5 = r10.f2092r
                int r5 = r11.getResourceId(r4, r5)
                r10.f2092r = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2092r = r4
                goto L_0x03ba
            L_0x02a4:
                int r5 = r10.f2091q
                int r5 = r11.getResourceId(r4, r5)
                r10.f2091q = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2091q = r4
                goto L_0x03ba
            L_0x02b6:
                int r5 = r10.f2090p
                int r5 = r11.getResourceId(r4, r5)
                r10.f2090p = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2090p = r4
                goto L_0x03ba
            L_0x02c8:
                int r5 = r10.f2083l
                int r5 = r11.getResourceId(r4, r5)
                r10.f2083l = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2083l = r4
                goto L_0x03ba
            L_0x02da:
                int r5 = r10.f2081k
                int r5 = r11.getResourceId(r4, r5)
                r10.f2081k = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2081k = r4
                goto L_0x03ba
            L_0x02ec:
                int r5 = r10.f2079j
                int r5 = r11.getResourceId(r4, r5)
                r10.f2079j = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2079j = r4
                goto L_0x03ba
            L_0x02fe:
                int r5 = r10.f2077i
                int r5 = r11.getResourceId(r4, r5)
                r10.f2077i = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2077i = r4
                goto L_0x03ba
            L_0x0310:
                int r5 = r10.f2075h
                int r5 = r11.getResourceId(r4, r5)
                r10.f2075h = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2075h = r4
                goto L_0x03ba
            L_0x0322:
                int r5 = r10.f2073g
                int r5 = r11.getResourceId(r4, r5)
                r10.f2073g = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2073g = r4
                goto L_0x03ba
            L_0x0334:
                int r5 = r10.f2071f
                int r5 = r11.getResourceId(r4, r5)
                r10.f2071f = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2071f = r4
                goto L_0x03ba
            L_0x0346:
                int r5 = r10.f2069e
                int r5 = r11.getResourceId(r4, r5)
                r10.f2069e = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2069e = r4
                goto L_0x03ba
            L_0x0357:
                int r5 = r10.f2067d
                int r5 = r11.getResourceId(r4, r5)
                r10.f2067d = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2067d = r4
                goto L_0x03ba
            L_0x0368:
                float r5 = r10.f2065c
                float r4 = r11.getFloat(r4, r5)
                r10.f2065c = r4
                goto L_0x03ba
            L_0x0371:
                int r5 = r10.f2063b
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f2063b = r4
                goto L_0x03ba
            L_0x037a:
                int r5 = r10.f2061a
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f2061a = r4
                goto L_0x03ba
            L_0x0383:
                float r5 = r10.f2089o
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.f2089o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03ba
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.f2089o = r4
                goto L_0x03ba
            L_0x0398:
                int r5 = r10.f2087n
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f2087n = r4
                goto L_0x03ba
            L_0x03a1:
                int r5 = r10.f2085m
                int r5 = r11.getResourceId(r4, r5)
                r10.f2085m = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f2085m = r4
                goto L_0x03ba
            L_0x03b2:
                int r5 = r10.f2052R
                int r4 = r11.getInt(r4, r5)
                r10.f2052R = r4
            L_0x03ba:
                int r1 = r1 + 1
                goto L_0x009a
            L_0x03be:
                r11.recycle()
                r10.mo2610a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0521b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0521b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo2610a() {
            this.f2059Y = false;
            this.f2056V = true;
            this.f2057W = true;
            if (this.width == -2 && this.f2053S) {
                this.f2056V = false;
                if (this.f2042H == 0) {
                    this.f2042H = 1;
                }
            }
            if (this.height == -2 && this.f2054T) {
                this.f2057W = false;
                if (this.f2043I == 0) {
                    this.f2043I = 1;
                }
            }
            int i = this.width;
            if (i == 0 || i == -1) {
                this.f2056V = false;
                if (this.width == 0 && this.f2042H == 1) {
                    this.width = -2;
                    this.f2053S = true;
                }
            }
            int i2 = this.height;
            if (i2 == 0 || i2 == -1) {
                this.f2057W = false;
                if (this.height == 0 && this.f2043I == 1) {
                    this.height = -2;
                    this.f2054T = true;
                }
            }
            if (this.f2065c != -1.0f || this.f2061a != -1 || this.f2063b != -1) {
                this.f2059Y = true;
                this.f2056V = true;
                this.f2057W = true;
                if (!(this.f2086m0 instanceof C3233g)) {
                    this.f2086m0 = new C3233g();
                }
                ((C3233g) this.f2086m0).mo11377O0(this.f2052R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dc, code lost:
            if (r1 > 0) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
            if (r1 > 0) goto L_0x00de;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r7)
                int r7 = r6.getLayoutDirection()
                if (r4 != r7) goto L_0x0017
                r7 = 1
                goto L_0x0018
            L_0x0017:
                r7 = 0
            L_0x0018:
                r2 = -1
                r6.f2070e0 = r2
                r6.f2072f0 = r2
                r6.f2066c0 = r2
                r6.f2068d0 = r2
                r6.f2074g0 = r2
                r6.f2076h0 = r2
                int r5 = r6.f2094t
                r6.f2074g0 = r5
                int r5 = r6.f2096v
                r6.f2076h0 = r5
                float r5 = r6.f2100z
                r6.f2078i0 = r5
                int r5 = r6.f2061a
                r6.f2080j0 = r5
                int r5 = r6.f2063b
                r6.f2082k0 = r5
                float r5 = r6.f2065c
                r6.f2084l0 = r5
                if (r7 == 0) goto L_0x009e
                int r7 = r6.f2090p
                if (r7 == r2) goto L_0x0047
                r6.f2070e0 = r7
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r7 = r6.f2091q
                if (r7 == r2) goto L_0x004e
                r6.f2072f0 = r7
                goto L_0x0045
            L_0x004e:
                int r7 = r6.f2092r
                if (r7 == r2) goto L_0x0055
                r6.f2068d0 = r7
                r3 = 1
            L_0x0055:
                int r7 = r6.f2093s
                if (r7 == r2) goto L_0x005c
                r6.f2066c0 = r7
                r3 = 1
            L_0x005c:
                int r7 = r6.f2098x
                if (r7 == r2) goto L_0x0062
                r6.f2076h0 = r7
            L_0x0062:
                int r7 = r6.f2099y
                if (r7 == r2) goto L_0x0068
                r6.f2074g0 = r7
            L_0x0068:
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.f2100z
                float r3 = r7 - r3
                r6.f2078i0 = r3
            L_0x0072:
                boolean r3 = r6.f2059Y
                if (r3 == 0) goto L_0x00c2
                int r3 = r6.f2052R
                if (r3 != r4) goto L_0x00c2
                float r3 = r6.f2065c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r7 = r7 - r3
                r6.f2084l0 = r7
                r6.f2080j0 = r2
                r6.f2082k0 = r2
                goto L_0x00c2
            L_0x008a:
                int r7 = r6.f2061a
                if (r7 == r2) goto L_0x0095
                r6.f2082k0 = r7
                r6.f2080j0 = r2
            L_0x0092:
                r6.f2084l0 = r4
                goto L_0x00c2
            L_0x0095:
                int r7 = r6.f2063b
                if (r7 == r2) goto L_0x00c2
                r6.f2080j0 = r7
                r6.f2082k0 = r2
                goto L_0x0092
            L_0x009e:
                int r7 = r6.f2090p
                if (r7 == r2) goto L_0x00a4
                r6.f2068d0 = r7
            L_0x00a4:
                int r7 = r6.f2091q
                if (r7 == r2) goto L_0x00aa
                r6.f2066c0 = r7
            L_0x00aa:
                int r7 = r6.f2092r
                if (r7 == r2) goto L_0x00b0
                r6.f2070e0 = r7
            L_0x00b0:
                int r7 = r6.f2093s
                if (r7 == r2) goto L_0x00b6
                r6.f2072f0 = r7
            L_0x00b6:
                int r7 = r6.f2098x
                if (r7 == r2) goto L_0x00bc
                r6.f2074g0 = r7
            L_0x00bc:
                int r7 = r6.f2099y
                if (r7 == r2) goto L_0x00c2
                r6.f2076h0 = r7
            L_0x00c2:
                int r7 = r6.f2092r
                if (r7 != r2) goto L_0x010a
                int r7 = r6.f2093s
                if (r7 != r2) goto L_0x010a
                int r7 = r6.f2091q
                if (r7 != r2) goto L_0x010a
                int r7 = r6.f2090p
                if (r7 != r2) goto L_0x010a
                int r7 = r6.f2071f
                if (r7 == r2) goto L_0x00e1
                r6.f2070e0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00ee
                if (r1 <= 0) goto L_0x00ee
            L_0x00de:
                r6.rightMargin = r1
                goto L_0x00ee
            L_0x00e1:
                int r7 = r6.f2073g
                if (r7 == r2) goto L_0x00ee
                r6.f2072f0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00ee
                if (r1 <= 0) goto L_0x00ee
                goto L_0x00de
            L_0x00ee:
                int r7 = r6.f2067d
                if (r7 == r2) goto L_0x00fd
                r6.f2066c0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010a
                if (r0 <= 0) goto L_0x010a
            L_0x00fa:
                r6.leftMargin = r0
                goto L_0x010a
            L_0x00fd:
                int r7 = r6.f2069e
                if (r7 == r2) goto L_0x010a
                r6.f2068d0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010a
                if (r0 <= 0) goto L_0x010a
                goto L_0x00fa
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0521b.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0523c implements C3241b.C3243b {

        /* renamed from: a */
        ConstraintLayout f2102a;

        /* renamed from: b */
        int f2103b;

        /* renamed from: c */
        int f2104c;

        /* renamed from: d */
        int f2105d;

        /* renamed from: e */
        int f2106e;

        /* renamed from: f */
        int f2107f;

        /* renamed from: g */
        int f2108g;

        public C0523c(ConstraintLayout constraintLayout) {
            this.f2102a = constraintLayout;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x016f A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a7  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01c8  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01e7  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01ec  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01f9 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0211 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x0222  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x0239  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x0245  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x024e  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0157  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0162  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0164  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2612a(p086f.p103f.p107b.p108k.C3229e r20, p086f.p103f.p107b.p108k.p109m.C3241b.C3242a r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r20.mo11292M()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r20.mo11299U()
                if (r3 != 0) goto L_0x001f
                r2.f10430e = r5
                r2.f10431f = r5
                r2.f10432g = r5
                return
            L_0x001f:
                f.f.b.k.e$b r3 = r2.f10426a
                f.f.b.k.e$b r4 = r2.f10427b
                int r6 = r2.f10428c
                int r7 = r2.f10429d
                int r8 = r0.f2103b
                int r9 = r0.f2104c
                int r8 = r8 + r9
                int r9 = r0.f2105d
                java.lang.Object r10 = r20.mo11326o()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0520a.f2034a
                int r12 = r3.ordinal()
                r11 = r11[r12]
                r12 = 4
                r14 = -2
                r13 = 3
                r15 = 2
                r5 = 1
                if (r11 == r5) goto L_0x00a4
                if (r11 == r15) goto L_0x0098
                if (r11 == r13) goto L_0x0087
                if (r11 == r12) goto L_0x004c
                r6 = 0
            L_0x004a:
                r9 = 0
                goto L_0x00b0
            L_0x004c:
                int r6 = r0.f2107f
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                int r9 = r1.f10373j
                if (r9 != r5) goto L_0x0058
                r9 = 1
                goto L_0x0059
            L_0x0058:
                r9 = 0
            L_0x0059:
                int[] r11 = r1.f10370g
                r16 = 0
                r11[r15] = r16
                boolean r12 = r2.f10435j
                if (r12 == 0) goto L_0x00a2
                if (r9 == 0) goto L_0x0071
                r12 = r11[r13]
                if (r12 == 0) goto L_0x0071
                r11 = r11[r16]
                int r12 = r20.mo11293N()
                if (r11 != r12) goto L_0x0075
            L_0x0071:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.C0542i
                if (r11 == 0) goto L_0x0077
            L_0x0075:
                r11 = 1
                goto L_0x0078
            L_0x0077:
                r11 = 0
            L_0x0078:
                if (r9 == 0) goto L_0x007c
                if (r11 == 0) goto L_0x00a2
            L_0x007c:
                int r6 = r20.mo11293N()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x004a
            L_0x0087:
                int r6 = r0.f2107f
                int r11 = r20.mo11344x()
                int r9 = r9 + r11
                r11 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                int[] r9 = r1.f10370g
                r9[r15] = r11
                goto L_0x004a
            L_0x0098:
                int r6 = r0.f2107f
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                int[] r9 = r1.f10370g
                r9[r15] = r14
            L_0x00a2:
                r9 = 1
                goto L_0x00b0
            L_0x00a4:
                r9 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                int[] r9 = r1.f10370g
                r9[r15] = r6
                r6 = r11
                goto L_0x004a
            L_0x00b0:
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0520a.f2034a
                int r12 = r4.ordinal()
                r11 = r11[r12]
                if (r11 == r5) goto L_0x011d
                if (r11 == r15) goto L_0x0110
                if (r11 == r13) goto L_0x00fe
                r7 = 4
                if (r11 == r7) goto L_0x00c4
                r7 = 0
                r11 = 0
                goto L_0x0128
            L_0x00c4:
                int r7 = r0.f2108g
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r14)
                int r8 = r1.f10374k
                if (r8 != r5) goto L_0x00d0
                r8 = 1
                goto L_0x00d1
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                int[] r11 = r1.f10370g
                r12 = 0
                r11[r13] = r12
                boolean r12 = r2.f10435j
                if (r12 == 0) goto L_0x011a
                if (r8 == 0) goto L_0x00e8
                r12 = r11[r15]
                if (r12 == 0) goto L_0x00e8
                r11 = r11[r5]
                int r12 = r20.mo11336t()
                if (r11 != r12) goto L_0x00ec
            L_0x00e8:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.C0542i
                if (r11 == 0) goto L_0x00ee
            L_0x00ec:
                r11 = 1
                goto L_0x00ef
            L_0x00ee:
                r11 = 0
            L_0x00ef:
                if (r8 == 0) goto L_0x00f3
                if (r11 == 0) goto L_0x011a
            L_0x00f3:
                int r7 = r20.mo11336t()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x010e
            L_0x00fe:
                int r7 = r0.f2108g
                int r11 = r20.mo11291L()
                int r8 = r8 + r11
                r11 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f10370g
                r8[r13] = r11
            L_0x010e:
                r11 = r7
                goto L_0x0127
            L_0x0110:
                int r7 = r0.f2108g
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r14)
                int[] r8 = r1.f10370g
                r8[r13] = r14
            L_0x011a:
                r11 = r7
                r7 = 1
                goto L_0x0128
            L_0x011d:
                r8 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                int[] r8 = r1.f10370g
                r8[r13] = r7
            L_0x0127:
                r7 = 0
            L_0x0128:
                f.f.b.k.e$b r8 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x012e
                r8 = 1
                goto L_0x012f
            L_0x012e:
                r8 = 0
            L_0x012f:
                f.f.b.k.e$b r12 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
                if (r4 != r12) goto L_0x0135
                r12 = 1
                goto L_0x0136
            L_0x0135:
                r12 = 0
            L_0x0136:
                f.f.b.k.e$b r14 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
                if (r4 == r14) goto L_0x0141
                f.f.b.k.e$b r14 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
                if (r4 != r14) goto L_0x013f
                goto L_0x0141
            L_0x013f:
                r4 = 0
                goto L_0x0142
            L_0x0141:
                r4 = 1
            L_0x0142:
                f.f.b.k.e$b r14 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
                if (r3 == r14) goto L_0x014d
                f.f.b.k.e$b r14 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
                if (r3 != r14) goto L_0x014b
                goto L_0x014d
            L_0x014b:
                r3 = 0
                goto L_0x014e
            L_0x014d:
                r3 = 1
            L_0x014e:
                r14 = 0
                if (r8 == 0) goto L_0x0159
                float r13 = r1.f10346N
                int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r13 <= 0) goto L_0x0159
                r13 = 1
                goto L_0x015a
            L_0x0159:
                r13 = 0
            L_0x015a:
                if (r12 == 0) goto L_0x0164
                float r5 = r1.f10346N
                int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r5 <= 0) goto L_0x0164
                r5 = 1
                goto L_0x0165
            L_0x0164:
                r5 = 0
            L_0x0165:
                android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$b r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0521b) r14
                boolean r15 = r2.f10435j
                if (r15 != 0) goto L_0x0184
                if (r8 == 0) goto L_0x0184
                int r8 = r1.f10373j
                if (r8 != 0) goto L_0x0184
                if (r12 == 0) goto L_0x0184
                int r8 = r1.f10374k
                if (r8 == 0) goto L_0x017c
                goto L_0x0184
            L_0x017c:
                r0 = 0
                r3 = 0
                r4 = -1
                r15 = 0
                r16 = 0
                goto L_0x0237
            L_0x0184:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.C0545l
                if (r8 == 0) goto L_0x0196
                boolean r8 = r1 instanceof p086f.p103f.p107b.p108k.C3238k
                if (r8 == 0) goto L_0x0196
                r8 = r1
                f.f.b.k.k r8 = (p086f.p103f.p107b.p108k.C3238k) r8
                r12 = r10
                androidx.constraintlayout.widget.l r12 = (androidx.constraintlayout.widget.C0545l) r12
                r12.mo2677n(r8, r6, r11)
                goto L_0x0199
            L_0x0196:
                r10.measure(r6, r11)
            L_0x0199:
                int r8 = r10.getMeasuredWidth()
                int r12 = r10.getMeasuredHeight()
                int r15 = r10.getBaseline()
                if (r9 == 0) goto L_0x01b2
                int[] r9 = r1.f10370g
                r16 = 0
                r9[r16] = r8
                r18 = 2
                r9[r18] = r12
                goto L_0x01bc
            L_0x01b2:
                r16 = 0
                r18 = 2
                int[] r9 = r1.f10370g
                r9[r16] = r16
                r9[r18] = r16
            L_0x01bc:
                if (r7 == 0) goto L_0x01c8
                int[] r7 = r1.f10370g
                r9 = 1
                r7[r9] = r12
                r17 = 3
                r7[r17] = r8
                goto L_0x01d1
            L_0x01c8:
                r9 = 1
                r17 = 3
                int[] r7 = r1.f10370g
                r7[r9] = r16
                r7[r17] = r16
            L_0x01d1:
                int r7 = r1.f10376m
                if (r7 <= 0) goto L_0x01da
                int r7 = java.lang.Math.max(r7, r8)
                goto L_0x01db
            L_0x01da:
                r7 = r8
            L_0x01db:
                int r9 = r1.f10377n
                if (r9 <= 0) goto L_0x01e3
                int r7 = java.lang.Math.min(r9, r7)
            L_0x01e3:
                int r9 = r1.f10379p
                if (r9 <= 0) goto L_0x01ec
                int r9 = java.lang.Math.max(r9, r12)
                goto L_0x01ed
            L_0x01ec:
                r9 = r12
            L_0x01ed:
                int r0 = r1.f10380q
                if (r0 <= 0) goto L_0x01f5
                int r9 = java.lang.Math.min(r0, r9)
            L_0x01f5:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r13 == 0) goto L_0x0204
                if (r4 == 0) goto L_0x0204
                float r3 = r1.f10346N
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r7 = r0
                goto L_0x020f
            L_0x0204:
                if (r5 == 0) goto L_0x020f
                if (r3 == 0) goto L_0x020f
                float r3 = r1.f10346N
                float r4 = (float) r7
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r9 = r0
            L_0x020f:
                if (r8 != r7) goto L_0x0218
                if (r12 == r9) goto L_0x0214
                goto L_0x0218
            L_0x0214:
                r0 = r7
                r3 = r9
            L_0x0216:
                r4 = -1
                goto L_0x0237
            L_0x0218:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r7) goto L_0x0220
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            L_0x0220:
                if (r12 == r9) goto L_0x0226
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x0226:
                r10.measure(r6, r11)
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r15 = r4
                goto L_0x0216
            L_0x0237:
                if (r15 == r4) goto L_0x023b
                r4 = 1
                goto L_0x023c
            L_0x023b:
                r4 = 0
            L_0x023c:
                int r5 = r2.f10428c
                if (r0 != r5) goto L_0x0247
                int r5 = r2.f10429d
                if (r3 == r5) goto L_0x0245
                goto L_0x0247
            L_0x0245:
                r5 = 0
                goto L_0x0248
            L_0x0247:
                r5 = 1
            L_0x0248:
                r2.f10434i = r5
                boolean r5 = r14.f2058X
                if (r5 == 0) goto L_0x0250
                r9 = 1
                goto L_0x0251
            L_0x0250:
                r9 = r4
            L_0x0251:
                if (r9 == 0) goto L_0x025f
                r4 = -1
                if (r15 == r4) goto L_0x025f
                int r1 = r20.mo11320l()
                if (r1 == r15) goto L_0x025f
                r1 = 1
                r2.f10434i = r1
            L_0x025f:
                r2.f10430e = r0
                r2.f10431f = r3
                r2.f10433h = r9
                r2.f10432g = r15
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0523c.mo2612a(f.f.b.k.e, f.f.b.k.m.b$a):void");
        }

        /* renamed from: b */
        public final void mo2613b() {
            int childCount = this.f2102a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2102a.getChildAt(i);
                if (childAt instanceof C0542i) {
                    ((C0542i) childAt).mo2670a(this.f2102a);
                }
            }
            int size = this.f2102a.f2018g.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0528c) this.f2102a.f2018g.get(i2)).mo2629j(this.f2102a);
                }
            }
        }

        /* renamed from: c */
        public void mo2614c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2103b = i3;
            this.f2104c = i4;
            this.f2105d = i5;
            this.f2106e = i6;
            this.f2107f = i;
            this.f2108g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2435i(attributeSet, 0, 0);
    }

    /* renamed from: f */
    private final C3229e m2434f(int i) {
        if (i == 0) {
            return this.f2019h;
        }
        View view = this.f2017f.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2019h;
        }
        if (view == null) {
            return null;
        }
        return ((C0521b) view.getLayoutParams()).f2086m0;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    /* renamed from: i */
    private void m2435i(AttributeSet attributeSet, int i, int i2) {
        this.f2019h.mo11304Z(this);
        this.f2019h.mo11365b1(this.f2033v);
        this.f2017f.put(getId(), this);
        this.f2026o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0544k.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0544k.ConstraintLayout_Layout_android_minWidth) {
                    this.f2020i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2020i);
                } else if (index == C0544k.ConstraintLayout_Layout_android_minHeight) {
                    this.f2021j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2021j);
                } else if (index == C0544k.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2022k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2022k);
                } else if (index == C0544k.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2023l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2023l);
                } else if (index == C0544k.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2025n = obtainStyledAttributes.getInt(index, this.f2025n);
                } else if (index == C0544k.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2590l(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2027p = null;
                        }
                    }
                } else if (index == C0544k.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0532e eVar = new C0532e();
                        this.f2026o = eVar;
                        eVar.mo2644i(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2026o = null;
                    }
                    this.f2028q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2019h.mo11366c1(this.f2025n);
    }

    /* renamed from: k */
    private void m2436k() {
        this.f2024m = true;
        this.f2030s = -1;
        this.f2031t = -1;
    }

    /* renamed from: o */
    private void m2437o() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3229e h = mo2588h(getChildAt(i));
            if (h != null) {
                h.mo11301W();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2597p(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m2434f(childAt.getId()).mo11305a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2028q != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f2028q && (childAt2 instanceof C0538f)) {
                    this.f2026o = ((C0538f) childAt2).getConstraintSet();
                }
            }
        }
        C0532e eVar = this.f2026o;
        if (eVar != null) {
            eVar.mo2640c(this, true);
        }
        this.f2019h.mo11384J0();
        int size = this.f2018g.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f2018g.get(i4).mo2631l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0542i) {
                ((C0542i) childAt3).mo2671b(this);
            }
        }
        this.f2032u.clear();
        this.f2032u.put(0, this.f2019h);
        this.f2032u.put(getId(), this.f2019h);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f2032u.put(childAt4.getId(), mo2588h(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C3229e h2 = mo2588h(childAt5);
            if (h2 != null) {
                this.f2019h.mo11385a(h2);
                mo2572b(isInEditMode, childAt5, h2, (C0521b) childAt5.getLayoutParams(), this.f2032u);
            }
        }
    }

    /* renamed from: r */
    private boolean m2438r() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m2437o();
        }
        return z;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2572b(boolean r20, android.view.View r21, p086f.p103f.p107b.p108k.C3229e r22, androidx.constraintlayout.widget.ConstraintLayout.C0521b r23, android.util.SparseArray<p086f.p103f.p107b.p108k.C3229e> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.mo2610a()
            r10 = 0
            r8.f2088n0 = r10
            int r2 = r21.getVisibility()
            r7.mo11274A0(r2)
            boolean r2 = r8.f2062a0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo11323m0(r11)
            r2 = 8
            r7.mo11274A0(r2)
        L_0x0024:
            r7.mo11304Z(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.C0528c
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.c r1 = (androidx.constraintlayout.widget.C0528c) r1
            f.f.b.k.f r2 = r0.f2019h
            boolean r2 = r2.mo11361W0()
            r1.mo2618h(r7, r2)
        L_0x0036:
            boolean r1 = r8.f2059Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0069
            r1 = r7
            f.f.b.k.g r1 = (p086f.p103f.p107b.p108k.C3233g) r1
            int r3 = r8.f2080j0
            int r4 = r8.f2082k0
            float r5 = r8.f2084l0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x0050
            int r3 = r8.f2061a
            int r4 = r8.f2063b
            float r5 = r8.f2065c
        L_0x0050:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005b
            r1.mo11376N0(r5)
            goto L_0x02be
        L_0x005b:
            if (r3 == r12) goto L_0x0062
            r1.mo11374L0(r3)
            goto L_0x02be
        L_0x0062:
            if (r4 == r12) goto L_0x02be
            r1.mo11375M0(r4)
            goto L_0x02be
        L_0x0069:
            int r1 = r8.f2066c0
            int r3 = r8.f2068d0
            int r4 = r8.f2070e0
            int r5 = r8.f2072f0
            int r6 = r8.f2074g0
            int r13 = r8.f2076h0
            float r14 = r8.f2078i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00b1
            int r1 = r8.f2067d
            int r2 = r8.f2069e
            int r4 = r8.f2071f
            int r5 = r8.f2073g
            int r3 = r8.f2094t
            int r6 = r8.f2096v
            float r14 = r8.f2100z
            if (r1 != r12) goto L_0x0098
            if (r2 != r12) goto L_0x0098
            int r13 = r8.f2091q
            if (r13 == r12) goto L_0x0093
            r1 = r13
            goto L_0x0098
        L_0x0093:
            int r13 = r8.f2090p
            if (r13 == r12) goto L_0x0098
            r2 = r13
        L_0x0098:
            if (r4 != r12) goto L_0x00ac
            if (r5 != r12) goto L_0x00ac
            int r13 = r8.f2092r
            if (r13 == r12) goto L_0x00a1
            goto L_0x00ad
        L_0x00a1:
            int r13 = r8.f2093s
            if (r13 == r12) goto L_0x00ac
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto L_0x00b8
        L_0x00ac:
            r13 = r4
        L_0x00ad:
            r15 = r6
            r6 = r3
            r3 = r2
            goto L_0x00b3
        L_0x00b1:
            r15 = r13
            r13 = r4
        L_0x00b3:
            r18 = r14
            r14 = r5
            r5 = r18
        L_0x00b8:
            int r2 = r8.f2085m
            if (r2 == r12) goto L_0x00cd
            java.lang.Object r1 = r9.get(r2)
            f.f.b.k.e r1 = (p086f.p103f.p107b.p108k.C3229e) r1
            if (r1 == 0) goto L_0x01f3
            float r2 = r8.f2089o
            int r3 = r8.f2087n
            r7.mo11314i(r1, r2, r3)
            goto L_0x01f3
        L_0x00cd:
            if (r1 == r12) goto L_0x00e9
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x00e6
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto L_0x00fe
        L_0x00e6:
            r17 = r5
            goto L_0x0101
        L_0x00e9:
            r17 = r5
            if (r3 == r12) goto L_0x0101
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x0101
            f.f.b.k.d$b r2 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
        L_0x00fe:
            r1.mo11297R(r2, r3, r4, r5, r6)
        L_0x0101:
            if (r13 == r12) goto L_0x0115
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x012b
            f.f.b.k.d$b r2 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            goto L_0x0127
        L_0x0115:
            if (r14 == r12) goto L_0x012b
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x012b
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
        L_0x0127:
            r6 = r15
            r1.mo11297R(r2, r3, r4, r5, r6)
        L_0x012b:
            int r1 = r8.f2075h
            if (r1 == r12) goto L_0x0142
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x015c
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f2095u
            r1 = r22
            r2 = r4
            goto L_0x0159
        L_0x0142:
            int r1 = r8.f2077i
            if (r1 == r12) goto L_0x015c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x015c
            f.f.b.k.d$b r2 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f2095u
            r1 = r22
        L_0x0159:
            r1.mo11297R(r2, r3, r4, r5, r6)
        L_0x015c:
            int r1 = r8.f2079j
            if (r1 == r12) goto L_0x0174
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x018d
            f.f.b.k.d$b r2 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f2097w
            r1 = r22
            goto L_0x018a
        L_0x0174:
            int r1 = r8.f2081k
            if (r1 == r12) goto L_0x018d
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.k.e r3 = (p086f.p103f.p107b.p108k.C3229e) r3
            if (r3 == 0) goto L_0x018d
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f2097w
            r1 = r22
            r2 = r4
        L_0x018a:
            r1.mo11297R(r2, r3, r4, r5, r6)
        L_0x018d:
            int r1 = r8.f2083l
            if (r1 == r12) goto L_0x01e0
            android.util.SparseArray<android.view.View> r2 = r0.f2017f
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f2083l
            java.lang.Object r2 = r9.get(r2)
            f.f.b.k.e r2 = (p086f.p103f.p107b.p108k.C3229e) r2
            if (r2 == 0) goto L_0x01e0
            if (r1 == 0) goto L_0x01e0
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0521b
            if (r3 == 0) goto L_0x01e0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0521b) r1
            r8.f2058X = r11
            r1.f2058X = r11
            f.f.b.k.d$b r3 = p086f.p103f.p107b.p108k.C3226d.C3228b.BASELINE
            f.f.b.k.d r3 = r7.mo11318k(r3)
            f.f.b.k.d$b r4 = p086f.p103f.p107b.p108k.C3226d.C3228b.BASELINE
            f.f.b.k.d r2 = r2.mo11318k(r4)
            r3.mo11260a(r2, r10, r12, r11)
            r7.mo11308d0(r11)
            f.f.b.k.e r1 = r1.f2086m0
            r1.mo11308d0(r11)
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP
            f.f.b.k.d r1 = r7.mo11318k(r1)
            r1.mo11270k()
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM
            f.f.b.k.d r1 = r7.mo11318k(r1)
            r1.mo11270k()
        L_0x01e0:
            r1 = 0
            r14 = r17
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x01ea
            r7.mo11311f0(r14)
        L_0x01ea:
            float r2 = r8.f2035A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01f3
            r7.mo11339u0(r2)
        L_0x01f3:
            if (r20 == 0) goto L_0x0204
            int r1 = r8.f2050P
            if (r1 != r12) goto L_0x01fd
            int r1 = r8.f2051Q
            if (r1 == r12) goto L_0x0204
        L_0x01fd:
            int r1 = r8.f2050P
            int r2 = r8.f2051Q
            r7.mo11335s0(r1, r2)
        L_0x0204:
            boolean r1 = r8.f2056V
            r2 = -2
            if (r1 != 0) goto L_0x0237
            int r1 = r8.width
            if (r1 != r12) goto L_0x022e
            boolean r1 = r8.f2053S
            if (r1 == 0) goto L_0x0214
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            goto L_0x0216
        L_0x0214:
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
        L_0x0216:
            r7.mo11315i0(r1)
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT
            f.f.b.k.d r1 = r7.mo11318k(r1)
            int r3 = r8.leftMargin
            r1.f10318e = r3
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT
            f.f.b.k.d r1 = r7.mo11318k(r1)
            int r3 = r8.rightMargin
            r1.f10318e = r3
            goto L_0x024a
        L_0x022e:
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            r7.mo11315i0(r1)
            r7.mo11276B0(r10)
            goto L_0x024a
        L_0x0237:
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r7.mo11315i0(r1)
            int r1 = r8.width
            r7.mo11276B0(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x024a
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            r7.mo11315i0(r1)
        L_0x024a:
            boolean r1 = r8.f2057W
            if (r1 != 0) goto L_0x027c
            int r1 = r8.height
            if (r1 != r12) goto L_0x0273
            boolean r1 = r8.f2054T
            if (r1 == 0) goto L_0x0259
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            goto L_0x025b
        L_0x0259:
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
        L_0x025b:
            r7.mo11345x0(r1)
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP
            f.f.b.k.d r1 = r7.mo11318k(r1)
            int r2 = r8.topMargin
            r1.f10318e = r2
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM
            f.f.b.k.d r1 = r7.mo11318k(r1)
            int r2 = r8.bottomMargin
            r1.f10318e = r2
            goto L_0x028f
        L_0x0273:
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            r7.mo11345x0(r1)
            r7.mo11310e0(r10)
            goto L_0x028f
        L_0x027c:
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r7.mo11345x0(r1)
            int r1 = r8.height
            r7.mo11310e0(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x028f
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            r7.mo11345x0(r1)
        L_0x028f:
            java.lang.String r1 = r8.f2036B
            r7.mo11306b0(r1)
            float r1 = r8.f2038D
            r7.mo11319k0(r1)
            float r1 = r8.f2039E
            r7.mo11349z0(r1)
            int r1 = r8.f2040F
            r7.mo11312g0(r1)
            int r1 = r8.f2041G
            r7.mo11341v0(r1)
            int r1 = r8.f2042H
            int r2 = r8.f2044J
            int r3 = r8.f2046L
            float r4 = r8.f2048N
            r7.mo11317j0(r1, r2, r3, r4)
            int r1 = r8.f2043I
            int r2 = r8.f2045K
            int r3 = r8.f2047M
            float r4 = r8.f2049O
            r7.mo11347y0(r1, r2, r3, r4)
        L_0x02be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2572b(boolean, android.view.View, f.f.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0521b generateDefaultLayoutParams() {
        return new C0521b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0521b;
    }

    /* renamed from: d */
    public C0521b generateLayoutParams(AttributeSet attributeSet) {
        return new C0521b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C0528c> arrayList = this.f2018g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f2018g.get(i).mo2630k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public Object mo2577e(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2029r;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2029r.get(str);
    }

    public void forceLayout() {
        m2436k();
        super.forceLayout();
    }

    /* renamed from: g */
    public View mo2579g(int i) {
        return this.f2017f.get(i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0521b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f2023l;
    }

    public int getMaxWidth() {
        return this.f2022k;
    }

    public int getMinHeight() {
        return this.f2021j;
    }

    public int getMinWidth() {
        return this.f2020i;
    }

    public int getOptimizationLevel() {
        return this.f2019h.mo11357S0();
    }

    /* renamed from: h */
    public final C3229e mo2588h(View view) {
        if (view == this) {
            return this.f2019h;
        }
        if (view == null) {
            return null;
        }
        return ((C0521b) view.getLayoutParams()).f2086m0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo2589j() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo2590l(int i) {
        this.f2027p = new C0529d(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2591m(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0523c cVar = this.f2033v;
        int i5 = cVar.f2106e;
        int i6 = i3 + cVar.f2105d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.f2022k, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.f2023l, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f2030s = min;
            this.f2031t = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.f2030s = i6;
        this.f2031t = i7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo2592n(C3232f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2033v.mo2614c(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (mo2589j()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo2598q(fVar, mode, i6, mode2, i7);
        fVar.mo11363Y0(i, mode, i6, mode2, i7, this.f2030s, this.f2031t, i4, max);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0521b bVar = (C0521b) childAt.getLayoutParams();
            C3229e eVar = bVar.f2086m0;
            if ((childAt.getVisibility() != 8 || bVar.f2059Y || bVar.f2060Z || bVar.f2064b0 || isInEditMode) && !bVar.f2062a0) {
                int O = eVar.mo11294O();
                int P = eVar.mo11295P();
                int N = eVar.mo11293N() + O;
                int t = eVar.mo11336t() + P;
                childAt.layout(O, P, N, t);
                if ((childAt instanceof C0542i) && (content = ((C0542i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(O, P, N, t);
                }
            }
        }
        int size = this.f2018g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2018g.get(i6).mo2628i(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f2019h.mo11367d1(mo2589j());
        if (this.f2024m) {
            this.f2024m = false;
            if (m2438r()) {
                this.f2019h.mo11369f1();
            }
        }
        mo2592n(this.f2019h, this.f2025n, i, i2);
        mo2591m(i, i2, this.f2019h.mo11293N(), this.f2019h.mo11336t(), this.f2019h.mo11362X0(), this.f2019h.mo11360V0());
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C3229e h = mo2588h(view);
        if ((view instanceof C0541h) && !(h instanceof C3233g)) {
            C0521b bVar = (C0521b) view.getLayoutParams();
            C3233g gVar = new C3233g();
            bVar.f2086m0 = gVar;
            bVar.f2059Y = true;
            gVar.mo11377O0(bVar.f2052R);
        }
        if (view instanceof C0528c) {
            C0528c cVar = (C0528c) view;
            cVar.mo2632m();
            ((C0521b) view.getLayoutParams()).f2060Z = true;
            if (!this.f2018g.contains(cVar)) {
                this.f2018g.add(cVar);
            }
        }
        this.f2017f.put(view.getId(), view);
        this.f2024m = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2017f.remove(view.getId());
        this.f2019h.mo11383I0(mo2588h(view));
        this.f2018g.remove(view);
        this.f2024m = true;
    }

    /* renamed from: p */
    public void mo2597p(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2029r == null) {
                this.f2029r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2029r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2598q(p086f.p103f.p107b.p108k.C3232f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f2033v
            int r1 = r0.f2106e
            int r0 = r0.f2105d
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = 0
            goto L_0x0032
        L_0x001a:
            int r9 = r7.f2022k
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            f.f.b.k.e$b r9 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            f.f.b.k.e$b r9 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.f2020i
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = 0
            goto L_0x0051
        L_0x003a:
            int r11 = r7.f2023l
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.f2021j
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.mo11293N()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.mo11336t()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.mo11359U0()
        L_0x0060:
            r8.mo11278C0(r6)
            r8.mo11280D0(r6)
            int r11 = r7.f2022k
            int r11 = r11 - r0
            r8.mo11329p0(r11)
            int r11 = r7.f2023l
            int r11 = r11 - r1
            r8.mo11327o0(r11)
            r8.mo11333r0(r6)
            r8.mo11331q0(r6)
            r8.mo11315i0(r9)
            r8.mo11276B0(r10)
            r8.mo11345x0(r2)
            r8.mo11310e0(r12)
            int r9 = r7.f2020i
            int r9 = r9 - r0
            r8.mo11333r0(r9)
            int r9 = r7.f2021j
            int r9 = r9 - r1
            r8.mo11331q0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2598q(f.f.b.k.f, int, int, int, int):void");
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        m2436k();
        super.requestLayout();
    }

    public void setConstraintSet(C0532e eVar) {
        this.f2026o = eVar;
    }

    public void setId(int i) {
        this.f2017f.remove(getId());
        super.setId(i);
        this.f2017f.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2023l) {
            this.f2023l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2022k) {
            this.f2022k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2021j) {
            this.f2021j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2020i) {
            this.f2020i = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0540g gVar) {
        C0529d dVar = this.f2027p;
        if (dVar != null) {
            dVar.mo2638c(gVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2025n = i;
        this.f2019h.mo11366c1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
