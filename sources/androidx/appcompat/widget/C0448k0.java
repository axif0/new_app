package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.C0588a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p086f.p087a.p090l.p091a.C3135a;
import p086f.p087a.p092m.C3151a;
import p086f.p102e.C3195d;
import p086f.p102e.C3196e;
import p086f.p102e.C3203g;
import p086f.p102e.C3204h;
import p086f.p111h.p112e.C3267a;
import p086f.p145t.p146a.p147a.C3561c;
import p086f.p145t.p146a.p147a.C3571i;

/* renamed from: androidx.appcompat.widget.k0 */
public final class C0448k0 {

    /* renamed from: h */
    private static final PorterDuff.Mode f1763h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0448k0 f1764i;

    /* renamed from: j */
    private static final C0451c f1765j = new C0451c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C3204h<ColorStateList>> f1766a;

    /* renamed from: b */
    private C3203g<String, C0452d> f1767b;

    /* renamed from: c */
    private C3204h<String> f1768c;

    /* renamed from: d */
    private final WeakHashMap<Context, C3195d<WeakReference<Drawable.ConstantState>>> f1769d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1770e;

    /* renamed from: f */
    private boolean f1771f;

    /* renamed from: g */
    private C0453e f1772g;

    /* renamed from: androidx.appcompat.widget.k0$a */
    static class C0449a implements C0452d {
        C0449a() {
        }

        /* renamed from: a */
        public Drawable mo2194a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3135a.m13392m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$b */
    private static class C0450b implements C0452d {
        C0450b() {
        }

        /* renamed from: a */
        public Drawable mo2194a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3561c.m15270a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$c */
    private static class C0451c extends C3196e<Integer, PorterDuffColorFilter> {
        public C0451c(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m2065h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public PorterDuffColorFilter mo2195i(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo11062c(Integer.valueOf(m2065h(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public PorterDuffColorFilter mo2196j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo11063d(Integer.valueOf(m2065h(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$d */
    private interface C0452d {
        /* renamed from: a */
        Drawable mo2194a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.k0$e */
    interface C0453e {
        /* renamed from: a */
        boolean mo2166a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo2167b(int i);

        /* renamed from: c */
        Drawable mo2168c(C0448k0 k0Var, Context context, int i);

        /* renamed from: d */
        ColorStateList mo2169d(Context context, int i);

        /* renamed from: e */
        boolean mo2170e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.k0$f */
    private static class C0454f implements C0452d {
        C0454f() {
        }

        /* renamed from: a */
        public Drawable mo2194a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3571i.m15303c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m2039a(String str, C0452d dVar) {
        if (this.f1767b == null) {
            this.f1767b = new C3203g<>();
        }
        this.f1767b.put(str, dVar);
    }

    /* renamed from: b */
    private synchronized boolean m2040b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C3195d dVar = this.f1769d.get(context);
            if (dVar == null) {
                dVar = new C3195d();
                this.f1769d.put(context, dVar);
            }
            dVar.mo11054l(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m2041c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1766a == null) {
            this.f1766a = new WeakHashMap<>();
        }
        C3204h hVar = this.f1766a.get(context);
        if (hVar == null) {
            hVar = new C3204h();
            this.f1766a.put(context, hVar);
        }
        hVar.mo11149b(i, colorStateList);
    }

    /* renamed from: d */
    private void m2042d(Context context) {
        if (!this.f1771f) {
            this.f1771f = true;
            Drawable j = mo2186j(context, C3151a.abc_vector_test);
            if (j == null || !m2051q(j)) {
                this.f1771f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m2043e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m2044f(Context context, int i) {
        if (this.f1770e == null) {
            this.f1770e = new TypedValue();
        }
        TypedValue typedValue = this.f1770e;
        context.getResources().getValue(i, typedValue, true);
        long e = m2043e(typedValue);
        Drawable i2 = m2047i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0453e eVar = this.f1772g;
        Drawable c = eVar == null ? null : eVar.mo2168c(this, context, i);
        if (c != null) {
            c.setChangingConfigurations(typedValue.changingConfigurations);
            m2040b(context, e, c);
        }
        return c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m2045g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2048l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0448k0 m2046h() {
        C0448k0 k0Var;
        synchronized (C0448k0.class) {
            if (f1764i == null) {
                C0448k0 k0Var2 = new C0448k0();
                f1764i = k0Var2;
                m2050p(k0Var2);
            }
            k0Var = f1764i;
        }
        return k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m2047i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, f.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1769d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            f.e.d r0 = (p086f.p102e.C3195d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo11050f(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo11055n(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0448k0.m2047i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m2048l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter i2;
        synchronized (C0448k0.class) {
            i2 = f1765j.mo2195i(i, mode);
            if (i2 == null) {
                i2 = new PorterDuffColorFilter(i, mode);
                f1765j.mo2196j(i, mode, i2);
            }
        }
        return i2;
    }

    /* renamed from: n */
    private ColorStateList m2049n(Context context, int i) {
        C3204h hVar;
        WeakHashMap<Context, C3204h<ColorStateList>> weakHashMap = this.f1766a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo11153f(i);
    }

    /* renamed from: p */
    private static void m2050p(C0448k0 k0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            k0Var.m2039a("vector", new C0454f());
            k0Var.m2039a("animated-vector", new C0450b());
            k0Var.m2039a("animated-selector", new C0449a());
        }
    }

    /* renamed from: q */
    private static boolean m2051q(Drawable drawable) {
        return (drawable instanceof C3571i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2052r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            f.e.g<java.lang.String, androidx.appcompat.widget.k0$d> r0 = r10.f1767b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            f.e.h<java.lang.String> r0 = r10.f1768c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo11153f(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            f.e.g<java.lang.String, androidx.appcompat.widget.k0$d> r3 = r10.f1767b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            f.e.h r0 = new f.e.h
            r0.<init>()
            r10.f1768c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1770e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1770e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1770e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m2043e(r0)
            android.graphics.drawable.Drawable r6 = r10.m2047i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            f.e.h<java.lang.String> r8 = r10.f1768c     // Catch:{ Exception -> 0x00a2 }
            r8.mo11149b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            f.e.g<java.lang.String, androidx.appcompat.widget.k0$d> r8 = r10.f1767b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.k0$d r3 = (androidx.appcompat.widget.C0448k0.C0452d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2194a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m2040b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            f.e.h<java.lang.String> r11 = r10.f1768c
            r11.mo11149b(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0448k0.m2052r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m2053v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo2188m(context, i);
        if (m != null) {
            if (C0418c0.m1901a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C0588a.m2775r(drawable);
            C0588a.m2772o(r, m);
            PorterDuff.Mode o = mo2189o(i);
            if (o == null) {
                return r;
            }
            C0588a.m2773p(r, o);
            return r;
        }
        C0453e eVar = this.f1772g;
        if ((eVar == null || !eVar.mo2170e(context, i, drawable)) && !mo2193x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m2054w(Drawable drawable, C0475s0 s0Var, int[] iArr) {
        if (!C0418c0.m1901a(drawable) || drawable.mutate() == drawable) {
            if (s0Var.f1854d || s0Var.f1853c) {
                drawable.setColorFilter(m2045g(s0Var.f1854d ? s0Var.f1851a : null, s0Var.f1853c ? s0Var.f1852b : f1763h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable mo2186j(Context context, int i) {
        return mo2187k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo2187k(Context context, int i, boolean z) {
        Drawable r;
        m2042d(context);
        r = m2052r(context, i);
        if (r == null) {
            r = m2044f(context, i);
        }
        if (r == null) {
            r = C3267a.m14076f(context, i);
        }
        if (r != null) {
            r = m2053v(context, i, z, r);
        }
        if (r != null) {
            C0418c0.m1902b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo2188m(Context context, int i) {
        ColorStateList n;
        n = m2049n(context, i);
        if (n == null) {
            n = this.f1772g == null ? null : this.f1772g.mo2169d(context, i);
            if (n != null) {
                m2041c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo2189o(int i) {
        C0453e eVar = this.f1772g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo2167b(i);
    }

    /* renamed from: s */
    public synchronized void mo2190s(Context context) {
        C3195d dVar = this.f1769d.get(context);
        if (dVar != null) {
            dVar.mo11047c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo2191t(Context context, C0508z0 z0Var, int i) {
        Drawable r = m2052r(context, i);
        if (r == null) {
            r = z0Var.mo2486d(i);
        }
        if (r == null) {
            return null;
        }
        return m2053v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo2192u(C0453e eVar) {
        this.f1772g = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2193x(Context context, int i, Drawable drawable) {
        C0453e eVar = this.f1772g;
        return eVar != null && eVar.mo2166a(context, i, drawable);
    }
}
