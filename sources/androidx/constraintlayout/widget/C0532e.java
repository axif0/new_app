package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0538f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p103f.p104a.p105a.C3205a;
import p086f.p103f.p104a.p106b.C3206a;

/* renamed from: androidx.constraintlayout.widget.e */
public class C0532e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f2149d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f2150e;

    /* renamed from: a */
    private HashMap<String, C0525b> f2151a = new HashMap<>();

    /* renamed from: b */
    private boolean f2152b = true;

    /* renamed from: c */
    private HashMap<Integer, C0533a> f2153c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.e$a */
    public static class C0533a {

        /* renamed from: a */
        int f2154a;

        /* renamed from: b */
        public final C0536d f2155b = new C0536d();

        /* renamed from: c */
        public final C0535c f2156c = new C0535c();

        /* renamed from: d */
        public final C0534b f2157d = new C0534b();

        /* renamed from: e */
        public final C0537e f2158e = new C0537e();

        /* renamed from: f */
        public HashMap<String, C0525b> f2159f = new HashMap<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m2495f(int i, ConstraintLayout.C0521b bVar) {
            this.f2154a = i;
            C0534b bVar2 = this.f2157d;
            bVar2.f2201h = bVar.f2067d;
            bVar2.f2203i = bVar.f2069e;
            bVar2.f2205j = bVar.f2071f;
            bVar2.f2207k = bVar.f2073g;
            bVar2.f2208l = bVar.f2075h;
            bVar2.f2209m = bVar.f2077i;
            bVar2.f2210n = bVar.f2079j;
            bVar2.f2211o = bVar.f2081k;
            bVar2.f2212p = bVar.f2083l;
            bVar2.f2213q = bVar.f2090p;
            bVar2.f2214r = bVar.f2091q;
            bVar2.f2215s = bVar.f2092r;
            bVar2.f2216t = bVar.f2093s;
            bVar2.f2217u = bVar.f2100z;
            bVar2.f2218v = bVar.f2035A;
            bVar2.f2219w = bVar.f2036B;
            bVar2.f2220x = bVar.f2085m;
            bVar2.f2221y = bVar.f2087n;
            bVar2.f2222z = bVar.f2089o;
            bVar2.f2161A = bVar.f2050P;
            bVar2.f2162B = bVar.f2051Q;
            bVar2.f2163C = bVar.f2052R;
            bVar2.f2199g = bVar.f2065c;
            bVar2.f2195e = bVar.f2061a;
            bVar2.f2197f = bVar.f2063b;
            bVar2.f2191c = bVar.width;
            bVar2.f2193d = bVar.height;
            bVar2.f2164D = bVar.leftMargin;
            bVar2.f2165E = bVar.rightMargin;
            bVar2.f2166F = bVar.topMargin;
            bVar2.f2167G = bVar.bottomMargin;
            bVar2.f2176P = bVar.f2039E;
            bVar2.f2177Q = bVar.f2038D;
            bVar2.f2179S = bVar.f2041G;
            bVar2.f2178R = bVar.f2040F;
            bVar2.f2202h0 = bVar.f2053S;
            bVar2.f2204i0 = bVar.f2054T;
            bVar2.f2180T = bVar.f2042H;
            bVar2.f2181U = bVar.f2043I;
            bVar2.f2182V = bVar.f2046L;
            bVar2.f2183W = bVar.f2047M;
            bVar2.f2184X = bVar.f2044J;
            bVar2.f2185Y = bVar.f2045K;
            bVar2.f2186Z = bVar.f2048N;
            bVar2.f2188a0 = bVar.f2049O;
            bVar2.f2200g0 = bVar.f2055U;
            bVar2.f2171K = bVar.f2095u;
            bVar2.f2173M = bVar.f2097w;
            bVar2.f2170J = bVar.f2094t;
            bVar2.f2172L = bVar.f2096v;
            bVar2.f2175O = bVar.f2098x;
            bVar2.f2174N = bVar.f2099y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.f2168H = bVar.getMarginEnd();
                this.f2157d.f2169I = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m2496g(int i, C0538f.C0539a aVar) {
            m2495f(i, aVar);
            this.f2155b.f2234d = aVar.f2252o0;
            C0537e eVar = this.f2158e;
            eVar.f2238b = aVar.f2255r0;
            eVar.f2239c = aVar.f2256s0;
            eVar.f2240d = aVar.f2257t0;
            eVar.f2241e = aVar.f2258u0;
            eVar.f2242f = aVar.f2259v0;
            eVar.f2243g = aVar.f2260w0;
            eVar.f2244h = aVar.f2261x0;
            eVar.f2245i = aVar.f2262y0;
            eVar.f2246j = aVar.f2263z0;
            eVar.f2247k = aVar.f2251A0;
            eVar.f2249m = aVar.f2254q0;
            eVar.f2248l = aVar.f2253p0;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m2497h(C0528c cVar, int i, C0538f.C0539a aVar) {
            m2496g(i, aVar);
            if (cVar instanceof C0524a) {
                C0534b bVar = this.f2157d;
                bVar.f2194d0 = 1;
                C0524a aVar2 = (C0524a) cVar;
                bVar.f2190b0 = aVar2.getType();
                this.f2157d.f2196e0 = aVar2.getReferencedIds();
                this.f2157d.f2192c0 = aVar2.getMargin();
            }
        }

        /* renamed from: d */
        public void mo2647d(ConstraintLayout.C0521b bVar) {
            C0534b bVar2 = this.f2157d;
            bVar.f2067d = bVar2.f2201h;
            bVar.f2069e = bVar2.f2203i;
            bVar.f2071f = bVar2.f2205j;
            bVar.f2073g = bVar2.f2207k;
            bVar.f2075h = bVar2.f2208l;
            bVar.f2077i = bVar2.f2209m;
            bVar.f2079j = bVar2.f2210n;
            bVar.f2081k = bVar2.f2211o;
            bVar.f2083l = bVar2.f2212p;
            bVar.f2090p = bVar2.f2213q;
            bVar.f2091q = bVar2.f2214r;
            bVar.f2092r = bVar2.f2215s;
            bVar.f2093s = bVar2.f2216t;
            bVar.leftMargin = bVar2.f2164D;
            bVar.rightMargin = bVar2.f2165E;
            bVar.topMargin = bVar2.f2166F;
            bVar.bottomMargin = bVar2.f2167G;
            bVar.f2098x = bVar2.f2175O;
            bVar.f2099y = bVar2.f2174N;
            bVar.f2095u = bVar2.f2171K;
            bVar.f2097w = bVar2.f2173M;
            bVar.f2100z = bVar2.f2217u;
            bVar.f2035A = bVar2.f2218v;
            bVar.f2085m = bVar2.f2220x;
            bVar.f2087n = bVar2.f2221y;
            bVar.f2089o = bVar2.f2222z;
            bVar.f2036B = bVar2.f2219w;
            bVar.f2050P = bVar2.f2161A;
            bVar.f2051Q = bVar2.f2162B;
            bVar.f2039E = bVar2.f2176P;
            bVar.f2038D = bVar2.f2177Q;
            bVar.f2041G = bVar2.f2179S;
            bVar.f2040F = bVar2.f2178R;
            bVar.f2053S = bVar2.f2202h0;
            bVar.f2054T = bVar2.f2204i0;
            bVar.f2042H = bVar2.f2180T;
            bVar.f2043I = bVar2.f2181U;
            bVar.f2046L = bVar2.f2182V;
            bVar.f2047M = bVar2.f2183W;
            bVar.f2044J = bVar2.f2184X;
            bVar.f2045K = bVar2.f2185Y;
            bVar.f2048N = bVar2.f2186Z;
            bVar.f2049O = bVar2.f2188a0;
            bVar.f2052R = bVar2.f2163C;
            bVar.f2065c = bVar2.f2199g;
            bVar.f2061a = bVar2.f2195e;
            bVar.f2063b = bVar2.f2197f;
            bVar.width = bVar2.f2191c;
            bVar.height = bVar2.f2193d;
            String str = bVar2.f2200g0;
            if (str != null) {
                bVar.f2055U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f2157d.f2169I);
                bVar.setMarginEnd(this.f2157d.f2168H);
            }
            bVar.mo2610a();
        }

        /* renamed from: e */
        public C0533a clone() {
            C0533a aVar = new C0533a();
            aVar.f2157d.mo2649a(this.f2157d);
            aVar.f2156c.mo2651a(this.f2156c);
            aVar.f2155b.mo2653a(this.f2155b);
            aVar.f2158e.mo2655a(this.f2158e);
            aVar.f2154a = this.f2154a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$b */
    public static class C0534b {

        /* renamed from: k0 */
        private static SparseIntArray f2160k0;

        /* renamed from: A */
        public int f2161A = -1;

        /* renamed from: B */
        public int f2162B = -1;

        /* renamed from: C */
        public int f2163C = -1;

        /* renamed from: D */
        public int f2164D = -1;

        /* renamed from: E */
        public int f2165E = -1;

        /* renamed from: F */
        public int f2166F = -1;

        /* renamed from: G */
        public int f2167G = -1;

        /* renamed from: H */
        public int f2168H = -1;

        /* renamed from: I */
        public int f2169I = -1;

        /* renamed from: J */
        public int f2170J = -1;

        /* renamed from: K */
        public int f2171K = -1;

        /* renamed from: L */
        public int f2172L = -1;

        /* renamed from: M */
        public int f2173M = -1;

        /* renamed from: N */
        public int f2174N = -1;

        /* renamed from: O */
        public int f2175O = -1;

        /* renamed from: P */
        public float f2176P = -1.0f;

        /* renamed from: Q */
        public float f2177Q = -1.0f;

        /* renamed from: R */
        public int f2178R = 0;

        /* renamed from: S */
        public int f2179S = 0;

        /* renamed from: T */
        public int f2180T = 0;

        /* renamed from: U */
        public int f2181U = 0;

        /* renamed from: V */
        public int f2182V = -1;

        /* renamed from: W */
        public int f2183W = -1;

        /* renamed from: X */
        public int f2184X = -1;

        /* renamed from: Y */
        public int f2185Y = -1;

        /* renamed from: Z */
        public float f2186Z = 1.0f;

        /* renamed from: a */
        public boolean f2187a = false;

        /* renamed from: a0 */
        public float f2188a0 = 1.0f;

        /* renamed from: b */
        public boolean f2189b = false;

        /* renamed from: b0 */
        public int f2190b0 = -1;

        /* renamed from: c */
        public int f2191c;

        /* renamed from: c0 */
        public int f2192c0 = 0;

        /* renamed from: d */
        public int f2193d;

        /* renamed from: d0 */
        public int f2194d0 = -1;

        /* renamed from: e */
        public int f2195e = -1;

        /* renamed from: e0 */
        public int[] f2196e0;

        /* renamed from: f */
        public int f2197f = -1;

        /* renamed from: f0 */
        public String f2198f0;

        /* renamed from: g */
        public float f2199g = -1.0f;

        /* renamed from: g0 */
        public String f2200g0;

        /* renamed from: h */
        public int f2201h = -1;

        /* renamed from: h0 */
        public boolean f2202h0 = false;

        /* renamed from: i */
        public int f2203i = -1;

        /* renamed from: i0 */
        public boolean f2204i0 = false;

        /* renamed from: j */
        public int f2205j = -1;

        /* renamed from: j0 */
        public boolean f2206j0 = true;

        /* renamed from: k */
        public int f2207k = -1;

        /* renamed from: l */
        public int f2208l = -1;

        /* renamed from: m */
        public int f2209m = -1;

        /* renamed from: n */
        public int f2210n = -1;

        /* renamed from: o */
        public int f2211o = -1;

        /* renamed from: p */
        public int f2212p = -1;

        /* renamed from: q */
        public int f2213q = -1;

        /* renamed from: r */
        public int f2214r = -1;

        /* renamed from: s */
        public int f2215s = -1;

        /* renamed from: t */
        public int f2216t = -1;

        /* renamed from: u */
        public float f2217u = 0.5f;

        /* renamed from: v */
        public float f2218v = 0.5f;

        /* renamed from: w */
        public String f2219w = null;

        /* renamed from: x */
        public int f2220x = -1;

        /* renamed from: y */
        public int f2221y = 0;

        /* renamed from: z */
        public float f2222z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2160k0 = sparseIntArray;
            sparseIntArray.append(C0544k.Layout_layout_constraintLeft_toLeftOf, 24);
            f2160k0.append(C0544k.Layout_layout_constraintLeft_toRightOf, 25);
            f2160k0.append(C0544k.Layout_layout_constraintRight_toLeftOf, 28);
            f2160k0.append(C0544k.Layout_layout_constraintRight_toRightOf, 29);
            f2160k0.append(C0544k.Layout_layout_constraintTop_toTopOf, 35);
            f2160k0.append(C0544k.Layout_layout_constraintTop_toBottomOf, 34);
            f2160k0.append(C0544k.Layout_layout_constraintBottom_toTopOf, 4);
            f2160k0.append(C0544k.Layout_layout_constraintBottom_toBottomOf, 3);
            f2160k0.append(C0544k.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2160k0.append(C0544k.Layout_layout_editor_absoluteX, 6);
            f2160k0.append(C0544k.Layout_layout_editor_absoluteY, 7);
            f2160k0.append(C0544k.Layout_layout_constraintGuide_begin, 17);
            f2160k0.append(C0544k.Layout_layout_constraintGuide_end, 18);
            f2160k0.append(C0544k.Layout_layout_constraintGuide_percent, 19);
            f2160k0.append(C0544k.Layout_android_orientation, 26);
            f2160k0.append(C0544k.Layout_layout_constraintStart_toEndOf, 31);
            f2160k0.append(C0544k.Layout_layout_constraintStart_toStartOf, 32);
            f2160k0.append(C0544k.Layout_layout_constraintEnd_toStartOf, 10);
            f2160k0.append(C0544k.Layout_layout_constraintEnd_toEndOf, 9);
            f2160k0.append(C0544k.Layout_layout_goneMarginLeft, 13);
            f2160k0.append(C0544k.Layout_layout_goneMarginTop, 16);
            f2160k0.append(C0544k.Layout_layout_goneMarginRight, 14);
            f2160k0.append(C0544k.Layout_layout_goneMarginBottom, 11);
            f2160k0.append(C0544k.Layout_layout_goneMarginStart, 15);
            f2160k0.append(C0544k.Layout_layout_goneMarginEnd, 12);
            f2160k0.append(C0544k.Layout_layout_constraintVertical_weight, 38);
            f2160k0.append(C0544k.Layout_layout_constraintHorizontal_weight, 37);
            f2160k0.append(C0544k.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2160k0.append(C0544k.Layout_layout_constraintVertical_chainStyle, 40);
            f2160k0.append(C0544k.Layout_layout_constraintHorizontal_bias, 20);
            f2160k0.append(C0544k.Layout_layout_constraintVertical_bias, 36);
            f2160k0.append(C0544k.Layout_layout_constraintDimensionRatio, 5);
            f2160k0.append(C0544k.Layout_layout_constraintLeft_creator, 76);
            f2160k0.append(C0544k.Layout_layout_constraintTop_creator, 76);
            f2160k0.append(C0544k.Layout_layout_constraintRight_creator, 76);
            f2160k0.append(C0544k.Layout_layout_constraintBottom_creator, 76);
            f2160k0.append(C0544k.Layout_layout_constraintBaseline_creator, 76);
            f2160k0.append(C0544k.Layout_android_layout_marginLeft, 23);
            f2160k0.append(C0544k.Layout_android_layout_marginRight, 27);
            f2160k0.append(C0544k.Layout_android_layout_marginStart, 30);
            f2160k0.append(C0544k.Layout_android_layout_marginEnd, 8);
            f2160k0.append(C0544k.Layout_android_layout_marginTop, 33);
            f2160k0.append(C0544k.Layout_android_layout_marginBottom, 2);
            f2160k0.append(C0544k.Layout_android_layout_width, 22);
            f2160k0.append(C0544k.Layout_android_layout_height, 21);
            f2160k0.append(C0544k.Layout_layout_constraintCircle, 61);
            f2160k0.append(C0544k.Layout_layout_constraintCircleRadius, 62);
            f2160k0.append(C0544k.Layout_layout_constraintCircleAngle, 63);
            f2160k0.append(C0544k.Layout_layout_constraintWidth_percent, 69);
            f2160k0.append(C0544k.Layout_layout_constraintHeight_percent, 70);
            f2160k0.append(C0544k.Layout_chainUseRtl, 71);
            f2160k0.append(C0544k.Layout_barrierDirection, 72);
            f2160k0.append(C0544k.Layout_barrierMargin, 73);
            f2160k0.append(C0544k.Layout_constraint_referenced_ids, 74);
            f2160k0.append(C0544k.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo2649a(C0534b bVar) {
            this.f2187a = bVar.f2187a;
            this.f2191c = bVar.f2191c;
            this.f2189b = bVar.f2189b;
            this.f2193d = bVar.f2193d;
            this.f2195e = bVar.f2195e;
            this.f2197f = bVar.f2197f;
            this.f2199g = bVar.f2199g;
            this.f2201h = bVar.f2201h;
            this.f2203i = bVar.f2203i;
            this.f2205j = bVar.f2205j;
            this.f2207k = bVar.f2207k;
            this.f2208l = bVar.f2208l;
            this.f2209m = bVar.f2209m;
            this.f2210n = bVar.f2210n;
            this.f2211o = bVar.f2211o;
            this.f2212p = bVar.f2212p;
            this.f2213q = bVar.f2213q;
            this.f2214r = bVar.f2214r;
            this.f2215s = bVar.f2215s;
            this.f2216t = bVar.f2216t;
            this.f2217u = bVar.f2217u;
            this.f2218v = bVar.f2218v;
            this.f2219w = bVar.f2219w;
            this.f2220x = bVar.f2220x;
            this.f2221y = bVar.f2221y;
            this.f2222z = bVar.f2222z;
            this.f2161A = bVar.f2161A;
            this.f2162B = bVar.f2162B;
            this.f2163C = bVar.f2163C;
            this.f2164D = bVar.f2164D;
            this.f2165E = bVar.f2165E;
            this.f2166F = bVar.f2166F;
            this.f2167G = bVar.f2167G;
            this.f2168H = bVar.f2168H;
            this.f2169I = bVar.f2169I;
            this.f2170J = bVar.f2170J;
            this.f2171K = bVar.f2171K;
            this.f2172L = bVar.f2172L;
            this.f2173M = bVar.f2173M;
            this.f2174N = bVar.f2174N;
            this.f2175O = bVar.f2175O;
            this.f2176P = bVar.f2176P;
            this.f2177Q = bVar.f2177Q;
            this.f2178R = bVar.f2178R;
            this.f2179S = bVar.f2179S;
            this.f2180T = bVar.f2180T;
            this.f2181U = bVar.f2181U;
            this.f2182V = bVar.f2182V;
            this.f2183W = bVar.f2183W;
            this.f2184X = bVar.f2184X;
            this.f2185Y = bVar.f2185Y;
            this.f2186Z = bVar.f2186Z;
            this.f2188a0 = bVar.f2188a0;
            this.f2190b0 = bVar.f2190b0;
            this.f2192c0 = bVar.f2192c0;
            this.f2194d0 = bVar.f2194d0;
            this.f2200g0 = bVar.f2200g0;
            int[] iArr = bVar.f2196e0;
            if (iArr != null) {
                this.f2196e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2196e0 = null;
            }
            this.f2198f0 = bVar.f2198f0;
            this.f2202h0 = bVar.f2202h0;
            this.f2204i0 = bVar.f2204i0;
            this.f2206j0 = bVar.f2206j0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2650b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0544k.Layout);
            this.f2189b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2160k0.get(index);
                if (i2 == 80) {
                    this.f2202h0 = obtainStyledAttributes.getBoolean(index, this.f2202h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f2212p = C0532e.m2484k(obtainStyledAttributes, index, this.f2212p);
                            break;
                        case 2:
                            this.f2167G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2167G);
                            break;
                        case 3:
                            this.f2211o = C0532e.m2484k(obtainStyledAttributes, index, this.f2211o);
                            break;
                        case 4:
                            this.f2210n = C0532e.m2484k(obtainStyledAttributes, index, this.f2210n);
                            break;
                        case 5:
                            this.f2219w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f2161A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2161A);
                            break;
                        case 7:
                            this.f2162B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2162B);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f2168H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2168H);
                                break;
                            }
                        case 9:
                            this.f2216t = C0532e.m2484k(obtainStyledAttributes, index, this.f2216t);
                            break;
                        case 10:
                            this.f2215s = C0532e.m2484k(obtainStyledAttributes, index, this.f2215s);
                            break;
                        case 11:
                            this.f2173M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2173M);
                            break;
                        case 12:
                            this.f2174N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2174N);
                            break;
                        case 13:
                            this.f2170J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2170J);
                            break;
                        case 14:
                            this.f2172L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2172L);
                            break;
                        case 15:
                            this.f2175O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2175O);
                            break;
                        case 16:
                            this.f2171K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2171K);
                            break;
                        case 17:
                            this.f2195e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2195e);
                            break;
                        case 18:
                            this.f2197f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2197f);
                            break;
                        case 19:
                            this.f2199g = obtainStyledAttributes.getFloat(index, this.f2199g);
                            break;
                        case 20:
                            this.f2217u = obtainStyledAttributes.getFloat(index, this.f2217u);
                            break;
                        case 21:
                            this.f2193d = obtainStyledAttributes.getLayoutDimension(index, this.f2193d);
                            break;
                        case 22:
                            this.f2191c = obtainStyledAttributes.getLayoutDimension(index, this.f2191c);
                            break;
                        case 23:
                            this.f2164D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2164D);
                            break;
                        case 24:
                            this.f2201h = C0532e.m2484k(obtainStyledAttributes, index, this.f2201h);
                            break;
                        case 25:
                            this.f2203i = C0532e.m2484k(obtainStyledAttributes, index, this.f2203i);
                            break;
                        case 26:
                            this.f2163C = obtainStyledAttributes.getInt(index, this.f2163C);
                            break;
                        case 27:
                            this.f2165E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2165E);
                            break;
                        case 28:
                            this.f2205j = C0532e.m2484k(obtainStyledAttributes, index, this.f2205j);
                            break;
                        case 29:
                            this.f2207k = C0532e.m2484k(obtainStyledAttributes, index, this.f2207k);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f2169I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2169I);
                                break;
                            }
                        case 31:
                            this.f2213q = C0532e.m2484k(obtainStyledAttributes, index, this.f2213q);
                            break;
                        case 32:
                            this.f2214r = C0532e.m2484k(obtainStyledAttributes, index, this.f2214r);
                            break;
                        case 33:
                            this.f2166F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2166F);
                            break;
                        case 34:
                            this.f2209m = C0532e.m2484k(obtainStyledAttributes, index, this.f2209m);
                            break;
                        case 35:
                            this.f2208l = C0532e.m2484k(obtainStyledAttributes, index, this.f2208l);
                            break;
                        case 36:
                            this.f2218v = obtainStyledAttributes.getFloat(index, this.f2218v);
                            break;
                        case 37:
                            this.f2177Q = obtainStyledAttributes.getFloat(index, this.f2177Q);
                            break;
                        case 38:
                            this.f2176P = obtainStyledAttributes.getFloat(index, this.f2176P);
                            break;
                        case 39:
                            this.f2178R = obtainStyledAttributes.getInt(index, this.f2178R);
                            break;
                        case 40:
                            this.f2179S = obtainStyledAttributes.getInt(index, this.f2179S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f2180T = obtainStyledAttributes.getInt(index, this.f2180T);
                                    break;
                                case 55:
                                    this.f2181U = obtainStyledAttributes.getInt(index, this.f2181U);
                                    break;
                                case 56:
                                    this.f2182V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2182V);
                                    break;
                                case 57:
                                    this.f2183W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2183W);
                                    break;
                                case 58:
                                    this.f2184X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2184X);
                                    break;
                                case 59:
                                    this.f2185Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2185Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2220x = C0532e.m2484k(obtainStyledAttributes, index, this.f2220x);
                                            break;
                                        case 62:
                                            this.f2221y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2221y);
                                            break;
                                        case 63:
                                            this.f2222z = obtainStyledAttributes.getFloat(index, this.f2222z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f2186Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2188a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f2190b0 = obtainStyledAttributes.getInt(index, this.f2190b0);
                                                    continue;
                                                case 73:
                                                    this.f2192c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2192c0);
                                                    continue;
                                                case 74:
                                                    this.f2198f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2206j0 = obtainStyledAttributes.getBoolean(index, this.f2206j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f2200g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f2160k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f2204i0 = obtainStyledAttributes.getBoolean(index, this.f2204i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$c */
    public static class C0535c {

        /* renamed from: h */
        private static SparseIntArray f2223h;

        /* renamed from: a */
        public boolean f2224a = false;

        /* renamed from: b */
        public int f2225b = -1;

        /* renamed from: c */
        public String f2226c = null;

        /* renamed from: d */
        public int f2227d = -1;

        /* renamed from: e */
        public int f2228e = 0;

        /* renamed from: f */
        public float f2229f = Float.NaN;

        /* renamed from: g */
        public float f2230g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2223h = sparseIntArray;
            sparseIntArray.append(C0544k.Motion_motionPathRotate, 1);
            f2223h.append(C0544k.Motion_pathMotionArc, 2);
            f2223h.append(C0544k.Motion_transitionEasing, 3);
            f2223h.append(C0544k.Motion_drawPath, 4);
            f2223h.append(C0544k.Motion_animate_relativeTo, 5);
            f2223h.append(C0544k.Motion_motionStagger, 6);
        }

        /* renamed from: a */
        public void mo2651a(C0535c cVar) {
            this.f2224a = cVar.f2224a;
            this.f2225b = cVar.f2225b;
            this.f2226c = cVar.f2226c;
            this.f2227d = cVar.f2227d;
            this.f2228e = cVar.f2228e;
            this.f2230g = cVar.f2230g;
            this.f2229f = cVar.f2229f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2652b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0544k.Motion);
            this.f2224a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2223h.get(index)) {
                    case 1:
                        this.f2230g = obtainStyledAttributes.getFloat(index, this.f2230g);
                        break;
                    case 2:
                        this.f2227d = obtainStyledAttributes.getInt(index, this.f2227d);
                        break;
                    case 3:
                        this.f2226c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C3205a.f10180a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f2228e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2225b = C0532e.m2484k(obtainStyledAttributes, index, this.f2225b);
                        break;
                    case 6:
                        this.f2229f = obtainStyledAttributes.getFloat(index, this.f2229f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$d */
    public static class C0536d {

        /* renamed from: a */
        public boolean f2231a = false;

        /* renamed from: b */
        public int f2232b = 0;

        /* renamed from: c */
        public int f2233c = 0;

        /* renamed from: d */
        public float f2234d = 1.0f;

        /* renamed from: e */
        public float f2235e = Float.NaN;

        /* renamed from: a */
        public void mo2653a(C0536d dVar) {
            this.f2231a = dVar.f2231a;
            this.f2232b = dVar.f2232b;
            this.f2234d = dVar.f2234d;
            this.f2235e = dVar.f2235e;
            this.f2233c = dVar.f2233c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2654b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0544k.PropertySet);
            this.f2231a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.PropertySet_android_alpha) {
                    this.f2234d = obtainStyledAttributes.getFloat(index, this.f2234d);
                } else if (index == C0544k.PropertySet_android_visibility) {
                    this.f2232b = obtainStyledAttributes.getInt(index, this.f2232b);
                    this.f2232b = C0532e.f2149d[this.f2232b];
                } else if (index == C0544k.PropertySet_visibilityMode) {
                    this.f2233c = obtainStyledAttributes.getInt(index, this.f2233c);
                } else if (index == C0544k.PropertySet_motionProgress) {
                    this.f2235e = obtainStyledAttributes.getFloat(index, this.f2235e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e */
    public static class C0537e {

        /* renamed from: n */
        private static SparseIntArray f2236n;

        /* renamed from: a */
        public boolean f2237a = false;

        /* renamed from: b */
        public float f2238b = 0.0f;

        /* renamed from: c */
        public float f2239c = 0.0f;

        /* renamed from: d */
        public float f2240d = 0.0f;

        /* renamed from: e */
        public float f2241e = 1.0f;

        /* renamed from: f */
        public float f2242f = 1.0f;

        /* renamed from: g */
        public float f2243g = Float.NaN;

        /* renamed from: h */
        public float f2244h = Float.NaN;

        /* renamed from: i */
        public float f2245i = 0.0f;

        /* renamed from: j */
        public float f2246j = 0.0f;

        /* renamed from: k */
        public float f2247k = 0.0f;

        /* renamed from: l */
        public boolean f2248l = false;

        /* renamed from: m */
        public float f2249m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2236n = sparseIntArray;
            sparseIntArray.append(C0544k.Transform_android_rotation, 1);
            f2236n.append(C0544k.Transform_android_rotationX, 2);
            f2236n.append(C0544k.Transform_android_rotationY, 3);
            f2236n.append(C0544k.Transform_android_scaleX, 4);
            f2236n.append(C0544k.Transform_android_scaleY, 5);
            f2236n.append(C0544k.Transform_android_transformPivotX, 6);
            f2236n.append(C0544k.Transform_android_transformPivotY, 7);
            f2236n.append(C0544k.Transform_android_translationX, 8);
            f2236n.append(C0544k.Transform_android_translationY, 9);
            f2236n.append(C0544k.Transform_android_translationZ, 10);
            f2236n.append(C0544k.Transform_android_elevation, 11);
        }

        /* renamed from: a */
        public void mo2655a(C0537e eVar) {
            this.f2237a = eVar.f2237a;
            this.f2238b = eVar.f2238b;
            this.f2239c = eVar.f2239c;
            this.f2240d = eVar.f2240d;
            this.f2241e = eVar.f2241e;
            this.f2242f = eVar.f2242f;
            this.f2243g = eVar.f2243g;
            this.f2244h = eVar.f2244h;
            this.f2245i = eVar.f2245i;
            this.f2246j = eVar.f2246j;
            this.f2247k = eVar.f2247k;
            this.f2248l = eVar.f2248l;
            this.f2249m = eVar.f2249m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2656b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0544k.Transform);
            this.f2237a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2236n.get(index)) {
                    case 1:
                        this.f2238b = obtainStyledAttributes.getFloat(index, this.f2238b);
                        break;
                    case 2:
                        this.f2239c = obtainStyledAttributes.getFloat(index, this.f2239c);
                        break;
                    case 3:
                        this.f2240d = obtainStyledAttributes.getFloat(index, this.f2240d);
                        break;
                    case 4:
                        this.f2241e = obtainStyledAttributes.getFloat(index, this.f2241e);
                        break;
                    case 5:
                        this.f2242f = obtainStyledAttributes.getFloat(index, this.f2242f);
                        break;
                    case 6:
                        this.f2243g = obtainStyledAttributes.getDimension(index, this.f2243g);
                        break;
                    case 7:
                        this.f2244h = obtainStyledAttributes.getDimension(index, this.f2244h);
                        break;
                    case 8:
                        this.f2245i = obtainStyledAttributes.getDimension(index, this.f2245i);
                        break;
                    case 9:
                        this.f2246j = obtainStyledAttributes.getDimension(index, this.f2246j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2247k = obtainStyledAttributes.getDimension(index, this.f2247k);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2248l = true;
                            this.f2249m = obtainStyledAttributes.getDimension(index, this.f2249m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2150e = sparseIntArray;
        sparseIntArray.append(C0544k.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2150e.append(C0544k.Constraint_layout_constraintLeft_toRightOf, 26);
        f2150e.append(C0544k.Constraint_layout_constraintRight_toLeftOf, 29);
        f2150e.append(C0544k.Constraint_layout_constraintRight_toRightOf, 30);
        f2150e.append(C0544k.Constraint_layout_constraintTop_toTopOf, 36);
        f2150e.append(C0544k.Constraint_layout_constraintTop_toBottomOf, 35);
        f2150e.append(C0544k.Constraint_layout_constraintBottom_toTopOf, 4);
        f2150e.append(C0544k.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2150e.append(C0544k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2150e.append(C0544k.Constraint_layout_editor_absoluteX, 6);
        f2150e.append(C0544k.Constraint_layout_editor_absoluteY, 7);
        f2150e.append(C0544k.Constraint_layout_constraintGuide_begin, 17);
        f2150e.append(C0544k.Constraint_layout_constraintGuide_end, 18);
        f2150e.append(C0544k.Constraint_layout_constraintGuide_percent, 19);
        f2150e.append(C0544k.Constraint_android_orientation, 27);
        f2150e.append(C0544k.Constraint_layout_constraintStart_toEndOf, 32);
        f2150e.append(C0544k.Constraint_layout_constraintStart_toStartOf, 33);
        f2150e.append(C0544k.Constraint_layout_constraintEnd_toStartOf, 10);
        f2150e.append(C0544k.Constraint_layout_constraintEnd_toEndOf, 9);
        f2150e.append(C0544k.Constraint_layout_goneMarginLeft, 13);
        f2150e.append(C0544k.Constraint_layout_goneMarginTop, 16);
        f2150e.append(C0544k.Constraint_layout_goneMarginRight, 14);
        f2150e.append(C0544k.Constraint_layout_goneMarginBottom, 11);
        f2150e.append(C0544k.Constraint_layout_goneMarginStart, 15);
        f2150e.append(C0544k.Constraint_layout_goneMarginEnd, 12);
        f2150e.append(C0544k.Constraint_layout_constraintVertical_weight, 40);
        f2150e.append(C0544k.Constraint_layout_constraintHorizontal_weight, 39);
        f2150e.append(C0544k.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2150e.append(C0544k.Constraint_layout_constraintVertical_chainStyle, 42);
        f2150e.append(C0544k.Constraint_layout_constraintHorizontal_bias, 20);
        f2150e.append(C0544k.Constraint_layout_constraintVertical_bias, 37);
        f2150e.append(C0544k.Constraint_layout_constraintDimensionRatio, 5);
        f2150e.append(C0544k.Constraint_layout_constraintLeft_creator, 82);
        f2150e.append(C0544k.Constraint_layout_constraintTop_creator, 82);
        f2150e.append(C0544k.Constraint_layout_constraintRight_creator, 82);
        f2150e.append(C0544k.Constraint_layout_constraintBottom_creator, 82);
        f2150e.append(C0544k.Constraint_layout_constraintBaseline_creator, 82);
        f2150e.append(C0544k.Constraint_android_layout_marginLeft, 24);
        f2150e.append(C0544k.Constraint_android_layout_marginRight, 28);
        f2150e.append(C0544k.Constraint_android_layout_marginStart, 31);
        f2150e.append(C0544k.Constraint_android_layout_marginEnd, 8);
        f2150e.append(C0544k.Constraint_android_layout_marginTop, 34);
        f2150e.append(C0544k.Constraint_android_layout_marginBottom, 2);
        f2150e.append(C0544k.Constraint_android_layout_width, 23);
        f2150e.append(C0544k.Constraint_android_layout_height, 21);
        f2150e.append(C0544k.Constraint_android_visibility, 22);
        f2150e.append(C0544k.Constraint_android_alpha, 43);
        f2150e.append(C0544k.Constraint_android_elevation, 44);
        f2150e.append(C0544k.Constraint_android_rotationX, 45);
        f2150e.append(C0544k.Constraint_android_rotationY, 46);
        f2150e.append(C0544k.Constraint_android_rotation, 60);
        f2150e.append(C0544k.Constraint_android_scaleX, 47);
        f2150e.append(C0544k.Constraint_android_scaleY, 48);
        f2150e.append(C0544k.Constraint_android_transformPivotX, 49);
        f2150e.append(C0544k.Constraint_android_transformPivotY, 50);
        f2150e.append(C0544k.Constraint_android_translationX, 51);
        f2150e.append(C0544k.Constraint_android_translationY, 52);
        f2150e.append(C0544k.Constraint_android_translationZ, 53);
        f2150e.append(C0544k.Constraint_layout_constraintWidth_default, 54);
        f2150e.append(C0544k.Constraint_layout_constraintHeight_default, 55);
        f2150e.append(C0544k.Constraint_layout_constraintWidth_max, 56);
        f2150e.append(C0544k.Constraint_layout_constraintHeight_max, 57);
        f2150e.append(C0544k.Constraint_layout_constraintWidth_min, 58);
        f2150e.append(C0544k.Constraint_layout_constraintHeight_min, 59);
        f2150e.append(C0544k.Constraint_layout_constraintCircle, 61);
        f2150e.append(C0544k.Constraint_layout_constraintCircleRadius, 62);
        f2150e.append(C0544k.Constraint_layout_constraintCircleAngle, 63);
        f2150e.append(C0544k.Constraint_animate_relativeTo, 64);
        f2150e.append(C0544k.Constraint_transitionEasing, 65);
        f2150e.append(C0544k.Constraint_drawPath, 66);
        f2150e.append(C0544k.Constraint_transitionPathRotate, 67);
        f2150e.append(C0544k.Constraint_motionStagger, 79);
        f2150e.append(C0544k.Constraint_android_id, 38);
        f2150e.append(C0544k.Constraint_motionProgress, 68);
        f2150e.append(C0544k.Constraint_layout_constraintWidth_percent, 69);
        f2150e.append(C0544k.Constraint_layout_constraintHeight_percent, 70);
        f2150e.append(C0544k.Constraint_chainUseRtl, 71);
        f2150e.append(C0544k.Constraint_barrierDirection, 72);
        f2150e.append(C0544k.Constraint_barrierMargin, 73);
        f2150e.append(C0544k.Constraint_constraint_referenced_ids, 74);
        f2150e.append(C0544k.Constraint_barrierAllowsGoneWidgets, 75);
        f2150e.append(C0544k.Constraint_pathMotionArc, 76);
        f2150e.append(C0544k.Constraint_layout_constraintTag, 77);
        f2150e.append(C0544k.Constraint_visibilityMode, 78);
        f2150e.append(C0544k.Constraint_layout_constrainedWidth, 80);
        f2150e.append(C0544k.Constraint_layout_constrainedHeight, 81);
    }

    /* renamed from: g */
    private int[] m2482g(View view, String str) {
        int i;
        Object e;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0543j.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (e = ((ConstraintLayout) view.getParent()).mo2577e(0, trim)) != null && (e instanceof Integer)) {
                i = ((Integer) e).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: h */
    private C0533a m2483h(Context context, AttributeSet attributeSet) {
        C0533a aVar = new C0533a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0544k.Constraint);
        m2485l(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static int m2484k(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: l */
    private void m2485l(Context context, C0533a aVar, TypedArray typedArray) {
        C0535c cVar;
        String str;
        String str2;
        StringBuilder sb;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0544k.Constraint_android_id || C0544k.Constraint_android_layout_marginStart == index || C0544k.Constraint_android_layout_marginEnd == index)) {
                aVar.f2156c.f2224a = true;
                aVar.f2157d.f2189b = true;
                aVar.f2155b.f2231a = true;
                aVar.f2158e.f2237a = true;
            }
            switch (f2150e.get(index)) {
                case 1:
                    C0534b bVar = aVar.f2157d;
                    bVar.f2212p = m2484k(typedArray, index, bVar.f2212p);
                    continue;
                case 2:
                    C0534b bVar2 = aVar.f2157d;
                    bVar2.f2167G = typedArray.getDimensionPixelSize(index, bVar2.f2167G);
                    continue;
                case 3:
                    C0534b bVar3 = aVar.f2157d;
                    bVar3.f2211o = m2484k(typedArray, index, bVar3.f2211o);
                    continue;
                case 4:
                    C0534b bVar4 = aVar.f2157d;
                    bVar4.f2210n = m2484k(typedArray, index, bVar4.f2210n);
                    continue;
                case 5:
                    aVar.f2157d.f2219w = typedArray.getString(index);
                    continue;
                case 6:
                    C0534b bVar5 = aVar.f2157d;
                    bVar5.f2161A = typedArray.getDimensionPixelOffset(index, bVar5.f2161A);
                    continue;
                case 7:
                    C0534b bVar6 = aVar.f2157d;
                    bVar6.f2162B = typedArray.getDimensionPixelOffset(index, bVar6.f2162B);
                    continue;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0534b bVar7 = aVar.f2157d;
                        bVar7.f2168H = typedArray.getDimensionPixelSize(index, bVar7.f2168H);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    C0534b bVar8 = aVar.f2157d;
                    bVar8.f2216t = m2484k(typedArray, index, bVar8.f2216t);
                    continue;
                case 10:
                    C0534b bVar9 = aVar.f2157d;
                    bVar9.f2215s = m2484k(typedArray, index, bVar9.f2215s);
                    continue;
                case 11:
                    C0534b bVar10 = aVar.f2157d;
                    bVar10.f2173M = typedArray.getDimensionPixelSize(index, bVar10.f2173M);
                    continue;
                case 12:
                    C0534b bVar11 = aVar.f2157d;
                    bVar11.f2174N = typedArray.getDimensionPixelSize(index, bVar11.f2174N);
                    continue;
                case 13:
                    C0534b bVar12 = aVar.f2157d;
                    bVar12.f2170J = typedArray.getDimensionPixelSize(index, bVar12.f2170J);
                    continue;
                case 14:
                    C0534b bVar13 = aVar.f2157d;
                    bVar13.f2172L = typedArray.getDimensionPixelSize(index, bVar13.f2172L);
                    continue;
                case 15:
                    C0534b bVar14 = aVar.f2157d;
                    bVar14.f2175O = typedArray.getDimensionPixelSize(index, bVar14.f2175O);
                    continue;
                case 16:
                    C0534b bVar15 = aVar.f2157d;
                    bVar15.f2171K = typedArray.getDimensionPixelSize(index, bVar15.f2171K);
                    continue;
                case 17:
                    C0534b bVar16 = aVar.f2157d;
                    bVar16.f2195e = typedArray.getDimensionPixelOffset(index, bVar16.f2195e);
                    continue;
                case 18:
                    C0534b bVar17 = aVar.f2157d;
                    bVar17.f2197f = typedArray.getDimensionPixelOffset(index, bVar17.f2197f);
                    continue;
                case 19:
                    C0534b bVar18 = aVar.f2157d;
                    bVar18.f2199g = typedArray.getFloat(index, bVar18.f2199g);
                    continue;
                case 20:
                    C0534b bVar19 = aVar.f2157d;
                    bVar19.f2217u = typedArray.getFloat(index, bVar19.f2217u);
                    continue;
                case 21:
                    C0534b bVar20 = aVar.f2157d;
                    bVar20.f2193d = typedArray.getLayoutDimension(index, bVar20.f2193d);
                    continue;
                case 22:
                    C0536d dVar = aVar.f2155b;
                    dVar.f2232b = typedArray.getInt(index, dVar.f2232b);
                    C0536d dVar2 = aVar.f2155b;
                    dVar2.f2232b = f2149d[dVar2.f2232b];
                    continue;
                case 23:
                    C0534b bVar21 = aVar.f2157d;
                    bVar21.f2191c = typedArray.getLayoutDimension(index, bVar21.f2191c);
                    continue;
                case 24:
                    C0534b bVar22 = aVar.f2157d;
                    bVar22.f2164D = typedArray.getDimensionPixelSize(index, bVar22.f2164D);
                    continue;
                case 25:
                    C0534b bVar23 = aVar.f2157d;
                    bVar23.f2201h = m2484k(typedArray, index, bVar23.f2201h);
                    continue;
                case 26:
                    C0534b bVar24 = aVar.f2157d;
                    bVar24.f2203i = m2484k(typedArray, index, bVar24.f2203i);
                    continue;
                case 27:
                    C0534b bVar25 = aVar.f2157d;
                    bVar25.f2163C = typedArray.getInt(index, bVar25.f2163C);
                    continue;
                case 28:
                    C0534b bVar26 = aVar.f2157d;
                    bVar26.f2165E = typedArray.getDimensionPixelSize(index, bVar26.f2165E);
                    continue;
                case 29:
                    C0534b bVar27 = aVar.f2157d;
                    bVar27.f2205j = m2484k(typedArray, index, bVar27.f2205j);
                    continue;
                case 30:
                    C0534b bVar28 = aVar.f2157d;
                    bVar28.f2207k = m2484k(typedArray, index, bVar28.f2207k);
                    continue;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0534b bVar29 = aVar.f2157d;
                        bVar29.f2169I = typedArray.getDimensionPixelSize(index, bVar29.f2169I);
                        break;
                    } else {
                        continue;
                    }
                case 32:
                    C0534b bVar30 = aVar.f2157d;
                    bVar30.f2213q = m2484k(typedArray, index, bVar30.f2213q);
                    continue;
                case 33:
                    C0534b bVar31 = aVar.f2157d;
                    bVar31.f2214r = m2484k(typedArray, index, bVar31.f2214r);
                    continue;
                case 34:
                    C0534b bVar32 = aVar.f2157d;
                    bVar32.f2166F = typedArray.getDimensionPixelSize(index, bVar32.f2166F);
                    continue;
                case 35:
                    C0534b bVar33 = aVar.f2157d;
                    bVar33.f2209m = m2484k(typedArray, index, bVar33.f2209m);
                    continue;
                case 36:
                    C0534b bVar34 = aVar.f2157d;
                    bVar34.f2208l = m2484k(typedArray, index, bVar34.f2208l);
                    continue;
                case 37:
                    C0534b bVar35 = aVar.f2157d;
                    bVar35.f2218v = typedArray.getFloat(index, bVar35.f2218v);
                    continue;
                case 38:
                    aVar.f2154a = typedArray.getResourceId(index, aVar.f2154a);
                    continue;
                case 39:
                    C0534b bVar36 = aVar.f2157d;
                    bVar36.f2177Q = typedArray.getFloat(index, bVar36.f2177Q);
                    continue;
                case 40:
                    C0534b bVar37 = aVar.f2157d;
                    bVar37.f2176P = typedArray.getFloat(index, bVar37.f2176P);
                    continue;
                case 41:
                    C0534b bVar38 = aVar.f2157d;
                    bVar38.f2178R = typedArray.getInt(index, bVar38.f2178R);
                    continue;
                case 42:
                    C0534b bVar39 = aVar.f2157d;
                    bVar39.f2179S = typedArray.getInt(index, bVar39.f2179S);
                    continue;
                case 43:
                    C0536d dVar3 = aVar.f2155b;
                    dVar3.f2234d = typedArray.getFloat(index, dVar3.f2234d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0537e eVar = aVar.f2158e;
                        eVar.f2248l = true;
                        eVar.f2249m = typedArray.getDimension(index, eVar.f2249m);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    C0537e eVar2 = aVar.f2158e;
                    eVar2.f2239c = typedArray.getFloat(index, eVar2.f2239c);
                    continue;
                case 46:
                    C0537e eVar3 = aVar.f2158e;
                    eVar3.f2240d = typedArray.getFloat(index, eVar3.f2240d);
                    continue;
                case 47:
                    C0537e eVar4 = aVar.f2158e;
                    eVar4.f2241e = typedArray.getFloat(index, eVar4.f2241e);
                    continue;
                case 48:
                    C0537e eVar5 = aVar.f2158e;
                    eVar5.f2242f = typedArray.getFloat(index, eVar5.f2242f);
                    continue;
                case 49:
                    C0537e eVar6 = aVar.f2158e;
                    eVar6.f2243g = typedArray.getDimension(index, eVar6.f2243g);
                    continue;
                case 50:
                    C0537e eVar7 = aVar.f2158e;
                    eVar7.f2244h = typedArray.getDimension(index, eVar7.f2244h);
                    continue;
                case 51:
                    C0537e eVar8 = aVar.f2158e;
                    eVar8.f2245i = typedArray.getDimension(index, eVar8.f2245i);
                    continue;
                case 52:
                    C0537e eVar9 = aVar.f2158e;
                    eVar9.f2246j = typedArray.getDimension(index, eVar9.f2246j);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0537e eVar10 = aVar.f2158e;
                        eVar10.f2247k = typedArray.getDimension(index, eVar10.f2247k);
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    C0534b bVar40 = aVar.f2157d;
                    bVar40.f2180T = typedArray.getInt(index, bVar40.f2180T);
                    continue;
                case 55:
                    C0534b bVar41 = aVar.f2157d;
                    bVar41.f2181U = typedArray.getInt(index, bVar41.f2181U);
                    continue;
                case 56:
                    C0534b bVar42 = aVar.f2157d;
                    bVar42.f2182V = typedArray.getDimensionPixelSize(index, bVar42.f2182V);
                    continue;
                case 57:
                    C0534b bVar43 = aVar.f2157d;
                    bVar43.f2183W = typedArray.getDimensionPixelSize(index, bVar43.f2183W);
                    continue;
                case 58:
                    C0534b bVar44 = aVar.f2157d;
                    bVar44.f2184X = typedArray.getDimensionPixelSize(index, bVar44.f2184X);
                    continue;
                case 59:
                    C0534b bVar45 = aVar.f2157d;
                    bVar45.f2185Y = typedArray.getDimensionPixelSize(index, bVar45.f2185Y);
                    continue;
                case 60:
                    C0537e eVar11 = aVar.f2158e;
                    eVar11.f2238b = typedArray.getFloat(index, eVar11.f2238b);
                    continue;
                case 61:
                    C0534b bVar46 = aVar.f2157d;
                    bVar46.f2220x = m2484k(typedArray, index, bVar46.f2220x);
                    continue;
                case 62:
                    C0534b bVar47 = aVar.f2157d;
                    bVar47.f2221y = typedArray.getDimensionPixelSize(index, bVar47.f2221y);
                    continue;
                case 63:
                    C0534b bVar48 = aVar.f2157d;
                    bVar48.f2222z = typedArray.getFloat(index, bVar48.f2222z);
                    continue;
                case 64:
                    C0535c cVar2 = aVar.f2156c;
                    cVar2.f2225b = m2484k(typedArray, index, cVar2.f2225b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f2156c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f2156c;
                        str = C3205a.f10180a[typedArray.getInteger(index, 0)];
                    }
                    cVar.f2226c = str;
                    continue;
                case 66:
                    aVar.f2156c.f2228e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0535c cVar3 = aVar.f2156c;
                    cVar3.f2230g = typedArray.getFloat(index, cVar3.f2230g);
                    continue;
                case 68:
                    C0536d dVar4 = aVar.f2155b;
                    dVar4.f2235e = typedArray.getFloat(index, dVar4.f2235e);
                    continue;
                case 69:
                    aVar.f2157d.f2186Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f2157d.f2188a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C0534b bVar49 = aVar.f2157d;
                    bVar49.f2190b0 = typedArray.getInt(index, bVar49.f2190b0);
                    continue;
                case 73:
                    C0534b bVar50 = aVar.f2157d;
                    bVar50.f2192c0 = typedArray.getDimensionPixelSize(index, bVar50.f2192c0);
                    continue;
                case 74:
                    aVar.f2157d.f2198f0 = typedArray.getString(index);
                    continue;
                case 75:
                    C0534b bVar51 = aVar.f2157d;
                    bVar51.f2206j0 = typedArray.getBoolean(index, bVar51.f2206j0);
                    continue;
                case 76:
                    C0535c cVar4 = aVar.f2156c;
                    cVar4.f2227d = typedArray.getInt(index, cVar4.f2227d);
                    continue;
                case 77:
                    aVar.f2157d.f2200g0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0536d dVar5 = aVar.f2155b;
                    dVar5.f2233c = typedArray.getInt(index, dVar5.f2233c);
                    continue;
                case 79:
                    C0535c cVar5 = aVar.f2156c;
                    cVar5.f2229f = typedArray.getFloat(index, cVar5.f2229f);
                    continue;
                case 80:
                    C0534b bVar52 = aVar.f2157d;
                    bVar52.f2202h0 = typedArray.getBoolean(index, bVar52.f2202h0);
                    continue;
                case 81:
                    C0534b bVar53 = aVar.f2157d;
                    bVar53.f2204i0 = typedArray.getBoolean(index, bVar53.f2204i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f2150e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2640c(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2153c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2153c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C3206a.m13699a(childAt));
            } else if (this.f2152b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2153c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0533a aVar = this.f2153c.get(Integer.valueOf(id));
                    if (childAt instanceof C0524a) {
                        aVar.f2157d.f2194d0 = 1;
                    }
                    int i2 = aVar.f2157d.f2194d0;
                    if (i2 != -1 && i2 == 1) {
                        C0524a aVar2 = (C0524a) childAt;
                        aVar2.setId(id);
                        aVar2.setType(aVar.f2157d.f2190b0);
                        aVar2.setMargin(aVar.f2157d.f2192c0);
                        aVar2.setAllowsGoneWidget(aVar.f2157d.f2206j0);
                        C0534b bVar = aVar.f2157d;
                        int[] iArr = bVar.f2196e0;
                        if (iArr != null) {
                            aVar2.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f2198f0;
                            if (str != null) {
                                bVar.f2196e0 = m2482g(aVar2, str);
                                aVar2.setReferencedIds(aVar.f2157d.f2196e0);
                            }
                        }
                    }
                    ConstraintLayout.C0521b bVar2 = (ConstraintLayout.C0521b) childAt.getLayoutParams();
                    bVar2.mo2610a();
                    aVar.mo2647d(bVar2);
                    if (z) {
                        C0525b.m2461c(childAt, aVar.f2159f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0536d dVar = aVar.f2155b;
                    if (dVar.f2233c == 0) {
                        childAt.setVisibility(dVar.f2232b);
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f2155b.f2234d);
                        childAt.setRotation(aVar.f2158e.f2238b);
                        childAt.setRotationX(aVar.f2158e.f2239c);
                        childAt.setRotationY(aVar.f2158e.f2240d);
                        childAt.setScaleX(aVar.f2158e.f2241e);
                        childAt.setScaleY(aVar.f2158e.f2242f);
                        if (!Float.isNaN(aVar.f2158e.f2243g)) {
                            childAt.setPivotX(aVar.f2158e.f2243g);
                        }
                        if (!Float.isNaN(aVar.f2158e.f2244h)) {
                            childAt.setPivotY(aVar.f2158e.f2244h);
                        }
                        childAt.setTranslationX(aVar.f2158e.f2245i);
                        childAt.setTranslationY(aVar.f2158e.f2246j);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f2158e.f2247k);
                            C0537e eVar = aVar.f2158e;
                            if (eVar.f2248l) {
                                childAt.setElevation(eVar.f2249m);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0533a aVar3 = this.f2153c.get(num);
            int i3 = aVar3.f2157d.f2194d0;
            if (i3 != -1 && i3 == 1) {
                C0524a aVar4 = new C0524a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                C0534b bVar3 = aVar3.f2157d;
                int[] iArr2 = bVar3.f2196e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f2198f0;
                    if (str2 != null) {
                        bVar3.f2196e0 = m2482g(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f2157d.f2196e0);
                    }
                }
                aVar4.setType(aVar3.f2157d.f2190b0);
                aVar4.setMargin(aVar3.f2157d.f2192c0);
                ConstraintLayout.C0521b c = constraintLayout.generateDefaultLayoutParams();
                aVar4.mo2632m();
                aVar3.mo2647d(c);
                constraintLayout.addView(aVar4, c);
            }
            if (aVar3.f2157d.f2187a) {
                C0541h hVar = new C0541h(constraintLayout.getContext());
                hVar.setId(num.intValue());
                ConstraintLayout.C0521b c2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.mo2647d(c2);
                constraintLayout.addView(hVar, c2);
            }
        }
    }

    /* renamed from: d */
    public void mo2641d(Context context, int i) {
        mo2642e((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: e */
    public void mo2642e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2153c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0521b bVar = (ConstraintLayout.C0521b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2152b || id != -1) {
                if (!this.f2153c.containsKey(Integer.valueOf(id))) {
                    this.f2153c.put(Integer.valueOf(id), new C0533a());
                }
                C0533a aVar = this.f2153c.get(Integer.valueOf(id));
                aVar.f2159f = C0525b.m2459a(this.f2151a, childAt);
                aVar.m2495f(id, bVar);
                aVar.f2155b.f2232b = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    aVar.f2155b.f2234d = childAt.getAlpha();
                    aVar.f2158e.f2238b = childAt.getRotation();
                    aVar.f2158e.f2239c = childAt.getRotationX();
                    aVar.f2158e.f2240d = childAt.getRotationY();
                    aVar.f2158e.f2241e = childAt.getScaleX();
                    aVar.f2158e.f2242f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0537e eVar = aVar.f2158e;
                        eVar.f2243g = pivotX;
                        eVar.f2244h = pivotY;
                    }
                    aVar.f2158e.f2245i = childAt.getTranslationX();
                    aVar.f2158e.f2246j = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.f2158e.f2247k = childAt.getTranslationZ();
                        C0537e eVar2 = aVar.f2158e;
                        if (eVar2.f2248l) {
                            eVar2.f2249m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof C0524a) {
                    C0524a aVar2 = (C0524a) childAt;
                    aVar.f2157d.f2206j0 = aVar2.mo2619n();
                    aVar.f2157d.f2196e0 = aVar2.getReferencedIds();
                    aVar.f2157d.f2190b0 = aVar2.getType();
                    aVar.f2157d.f2192c0 = aVar2.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: f */
    public void mo2643f(C0538f fVar) {
        int childCount = fVar.getChildCount();
        this.f2153c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = fVar.getChildAt(i);
            C0538f.C0539a aVar = (C0538f.C0539a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2152b || id != -1) {
                if (!this.f2153c.containsKey(Integer.valueOf(id))) {
                    this.f2153c.put(Integer.valueOf(id), new C0533a());
                }
                C0533a aVar2 = this.f2153c.get(Integer.valueOf(id));
                if (childAt instanceof C0528c) {
                    aVar2.m2497h((C0528c) childAt, id, aVar);
                }
                aVar2.m2496g(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: i */
    public void mo2644i(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0533a h = m2483h(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        h.f2157d.f2187a = true;
                    }
                    this.f2153c.put(Integer.valueOf(h.f2154a), h);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        continue;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2645j(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x0178
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x017b
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x017b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.e$a> r0 = r9.f2153c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r3 = r2.f2154a     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2 = r1
            goto L_0x017b
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016e;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x017b
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.b> r0 = r2.f2159f     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.C0525b.m2460b(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.e$c r0 = r2.f2156c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2652b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.e$b r0 = r2.f2157d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2650b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.e$e r0 = r2.f2158e     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2656b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.e$d r0 = r2.f2155b     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2654b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2483h(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.e$b r2 = r0.f2157d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f2194d0 = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2483h(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.e$b r2 = r0.f2157d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f2187a = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.e$b r2 = r0.f2157d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f2189b = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x016e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2483h(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0176:
            r2 = r0
            goto L_0x017b
        L_0x0178:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x017b:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0006
        L_0x0181:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x018a
        L_0x0186:
            r10 = move-exception
            r10.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0532e.mo2645j(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
