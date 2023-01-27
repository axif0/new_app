package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0588a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p086f.p110g.C3260a;
import p086f.p110g.C3261b;
import p086f.p110g.C3262c;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p121l.C3344c;
import p086f.p111h.p121l.C3346e;
import p086f.p111h.p121l.C3348g;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3395l;
import p086f.p111h.p122m.C3396m;
import p086f.p111h.p122m.C3398o;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;
import p086f.p126j.p127a.C3430a;

public class CoordinatorLayout extends ViewGroup implements C3395l, C3396m {

    /* renamed from: A */
    static final Class<?>[] f2271A = {Context.class, AttributeSet.class};

    /* renamed from: B */
    static final ThreadLocal<Map<String, Constructor<C0548c>>> f2272B = new ThreadLocal<>();

    /* renamed from: C */
    static final Comparator<View> f2273C;

    /* renamed from: D */
    private static final C3346e<Rect> f2274D = new C3348g(12);

    /* renamed from: z */
    static final String f2275z;

    /* renamed from: f */
    private final List<View> f2276f;

    /* renamed from: g */
    private final C0556a<View> f2277g;

    /* renamed from: h */
    private final List<View> f2278h;

    /* renamed from: i */
    private final List<View> f2279i;

    /* renamed from: j */
    private Paint f2280j;

    /* renamed from: k */
    private final int[] f2281k;

    /* renamed from: l */
    private final int[] f2282l;

    /* renamed from: m */
    private boolean f2283m;

    /* renamed from: n */
    private boolean f2284n;

    /* renamed from: o */
    private int[] f2285o;

    /* renamed from: p */
    private View f2286p;

    /* renamed from: q */
    private View f2287q;

    /* renamed from: r */
    private C0552g f2288r;

    /* renamed from: s */
    private boolean f2289s;

    /* renamed from: t */
    private C3356b0 f2290t;

    /* renamed from: u */
    private boolean f2291u;

    /* renamed from: v */
    private Drawable f2292v;

    /* renamed from: w */
    ViewGroup.OnHierarchyChangeListener f2293w;

    /* renamed from: x */
    private C3399p f2294x;

    /* renamed from: y */
    private final C3398o f2295y;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0546a implements C3399p {
        C0546a() {
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            CoordinatorLayout.this.mo2687W(b0Var);
            return b0Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0547b {
        C0548c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0548c<V extends View> {
        public C0548c() {
        }

        public C0548c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo2732A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2761z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo2733B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo2734C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2733B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2735D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2736a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2739d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2737b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo2738c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo2739d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2740e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C3356b0 mo2741f(CoordinatorLayout coordinatorLayout, V v, C3356b0 b0Var) {
            return b0Var;
        }

        /* renamed from: g */
        public void mo2742g(C0551f fVar) {
        }

        /* renamed from: h */
        public boolean mo2743h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo2744i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo2745j() {
        }

        /* renamed from: k */
        public boolean mo2746k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2747l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2748m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo2749n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2750o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo2751p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2752q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2751p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo2753r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo2754s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2753r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo2755t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2754s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo2756u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo2757v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2756u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo2758w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo2759x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2760y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo2761z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0549d {
        Class<? extends C0548c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0550e implements ViewGroup.OnHierarchyChangeListener {
        C0550e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2293w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2682H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2293w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0551f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0548c f2298a;

        /* renamed from: b */
        boolean f2299b = false;

        /* renamed from: c */
        public int f2300c = 0;

        /* renamed from: d */
        public int f2301d = 0;

        /* renamed from: e */
        public int f2302e = -1;

        /* renamed from: f */
        int f2303f = -1;

        /* renamed from: g */
        public int f2304g = 0;

        /* renamed from: h */
        public int f2305h = 0;

        /* renamed from: i */
        int f2306i;

        /* renamed from: j */
        int f2307j;

        /* renamed from: k */
        View f2308k;

        /* renamed from: l */
        View f2309l;

        /* renamed from: m */
        private boolean f2310m;

        /* renamed from: n */
        private boolean f2311n;

        /* renamed from: o */
        private boolean f2312o;

        /* renamed from: p */
        private boolean f2313p;

        /* renamed from: q */
        final Rect f2314q = new Rect();

        public C0551f(int i, int i2) {
            super(i, i2);
        }

        C0551f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3262c.CoordinatorLayout_Layout);
            this.f2300c = obtainStyledAttributes.getInteger(C3262c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2303f = obtainStyledAttributes.getResourceId(C3262c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2301d = obtainStyledAttributes.getInteger(C3262c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2302e = obtainStyledAttributes.getInteger(C3262c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2304g = obtainStyledAttributes.getInt(C3262c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2305h = obtainStyledAttributes.getInt(C3262c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C3262c.CoordinatorLayout_Layout_layout_behavior);
            this.f2299b = hasValue;
            if (hasValue) {
                this.f2298a = CoordinatorLayout.m2519K(context, attributeSet, obtainStyledAttributes.getString(C3262c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0548c cVar = this.f2298a;
            if (cVar != null) {
                cVar.mo2742g(this);
            }
        }

        public C0551f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0551f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0551f(C0551f fVar) {
            super(fVar);
        }

        /* renamed from: n */
        private void m2595n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2303f);
            this.f2308k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2309l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2303f) + " to anchor view " + view);
            }
            this.f2309l = null;
            this.f2308k = null;
        }

        /* renamed from: s */
        private boolean m2596s(View view, int i) {
            int b = C3386d.m14544b(((C0551f) view.getLayoutParams()).f2304g, i);
            return b != 0 && (C3386d.m14544b(this.f2305h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m2597t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2308k.getId() != this.f2303f) {
                return false;
            }
            View view2 = this.f2308k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2309l = null;
                    this.f2308k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2309l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2765a() {
            return this.f2308k == null && this.f2303f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f2298a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2766b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f2309l
                if (r4 == r0) goto L_0x001b
                int r0 = p086f.p111h.p122m.C3403t.m14674y(r2)
                boolean r0 = r1.m2596s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2298a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo2740e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0551f.mo2766b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2767c() {
            if (this.f2298a == null) {
                this.f2310m = false;
            }
            return this.f2310m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo2768d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2303f == -1) {
                this.f2309l = null;
                this.f2308k = null;
                return null;
            }
            if (this.f2308k == null || !m2597t(view, coordinatorLayout)) {
                m2595n(view, coordinatorLayout);
            }
            return this.f2308k;
        }

        /* renamed from: e */
        public int mo2769e() {
            return this.f2303f;
        }

        /* renamed from: f */
        public C0548c mo2770f() {
            return this.f2298a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo2771g() {
            return this.f2313p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo2772h() {
            return this.f2314q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo2773i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2310m;
            if (z) {
                return true;
            }
            C0548c cVar = this.f2298a;
            boolean a = (cVar != null ? cVar.mo2736a(coordinatorLayout, view) : false) | z;
            this.f2310m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo2774j(int i) {
            if (i == 0) {
                return this.f2311n;
            }
            if (i != 1) {
                return false;
            }
            return this.f2312o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo2775k() {
            this.f2313p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2776l(int i) {
            mo2781r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo2777m() {
            this.f2310m = false;
        }

        /* renamed from: o */
        public void mo2778o(C0548c cVar) {
            C0548c cVar2 = this.f2298a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2745j();
                }
                this.f2298a = cVar;
                this.f2299b = true;
                if (cVar != null) {
                    cVar.mo2742g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo2779p(boolean z) {
            this.f2313p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2780q(Rect rect) {
            this.f2314q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2781r(int i, boolean z) {
            if (i == 0) {
                this.f2311n = z;
            } else if (i == 1) {
                this.f2312o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0552g implements ViewTreeObserver.OnPreDrawListener {
        C0552g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2682H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0553h extends C3430a {
        public static final Parcelable.Creator<C0553h> CREATOR = new C0554a();

        /* renamed from: h */
        SparseArray<Parcelable> f2316h;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0554a implements Parcelable.ClassLoaderCreator<C0553h> {
            C0554a() {
            }

            /* renamed from: a */
            public C0553h createFromParcel(Parcel parcel) {
                return new C0553h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0553h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0553h(parcel, classLoader);
            }

            /* renamed from: c */
            public C0553h[] newArray(int i) {
                return new C0553h[i];
            }
        }

        public C0553h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2316h = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2316h.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0553h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2316h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2316h.keyAt(i2);
                parcelableArr[i2] = this.f2316h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0555i implements Comparator<View> {
        C0555i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float I = C3403t.m14608I(view);
            float I2 = C3403t.m14608I(view2);
            if (I > I2) {
                return -1;
            }
            return I < I2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f2275z = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f2273C = r0
            goto L_0x0021
        L_0x001f:
            f2273C = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f2271A = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f2272B = r0
            f.h.l.g r0 = new f.h.l.g
            r1 = 12
            r0.<init>(r1)
            f2274D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3260a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2276f = new ArrayList();
        this.f2277g = new C0556a<>();
        this.f2278h = new ArrayList();
        this.f2279i = new ArrayList();
        this.f2281k = new int[2];
        this.f2282l = new int[2];
        this.f2295y = new C3398o(this);
        int[] iArr = C3262c.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C3261b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C3262c.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C3261b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C3262c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2285o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2285o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f2285o;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f2292v = obtainStyledAttributes.getDrawable(C3262c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m2529X();
        super.setOnHierarchyChangeListener(new C0550e());
        if (C3403t.m14670w(this) == 0) {
            C3403t.m14663s0(this, 1);
        }
    }

    /* renamed from: A */
    private boolean m2514A(View view) {
        return this.f2277g.mo2798j(view);
    }

    /* renamed from: C */
    private void m2515C(View view, int i) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        Rect a = m2530a();
        a.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f2290t != null && C3403t.m14668v(this) && !C3403t.m14668v(view)) {
            a.left += this.f2290t.mo11563f();
            a.top += this.f2290t.mo11565h();
            a.right -= this.f2290t.mo11564g();
            a.bottom -= this.f2290t.mo11561e();
        }
        Rect a2 = m2530a();
        C3386d.m14543a(m2525S(fVar.f2300c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m2522O(a);
        m2522O(a2);
    }

    /* renamed from: D */
    private void m2516D(View view, View view2, int i) {
        Rect a = m2530a();
        Rect a2 = m2530a();
        try {
            mo2726t(view2, a);
            mo2727u(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m2522O(a);
            m2522O(a2);
        }
    }

    /* renamed from: E */
    private void m2517E(View view, int i, int i2) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        int b = C3386d.m14544b(m2526T(fVar.f2300c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int w = m2535w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            w += measuredWidth / 2;
        } else if (i3 == 5) {
            w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    private void m2518F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C3403t.m14614O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0551f fVar = (C0551f) view.getLayoutParams();
            C0548c f = fVar.mo2770f();
            Rect a = m2530a();
            Rect a2 = m2530a();
            a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo2737b(this, view, a)) {
                a.set(a2);
            } else if (!a2.contains(a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a.toShortString() + " | Bounds:" + a2.toShortString());
            }
            m2522O(a2);
            if (a.isEmpty()) {
                m2522O(a);
                return;
            }
            int b = C3386d.m14544b(fVar.f2305h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (a.top - fVar.topMargin) - fVar.f2307j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m2528V(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - a.bottom) - fVar.bottomMargin) + fVar.f2307j) < (i5 = rect.bottom)) {
                m2528V(view, height - i5);
                z = true;
            }
            if (!z) {
                m2528V(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (a.left - fVar.leftMargin) - fVar.f2306i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m2527U(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - a.right) - fVar.rightMargin) + fVar.f2306i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m2527U(view, width - i2);
            }
            if (!z3) {
                m2527U(view, 0);
            }
            m2522O(a);
        }
    }

    /* renamed from: K */
    static C0548c m2519K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f2275z)) {
            str = f2275z + '.' + str;
        }
        try {
            Map map = f2272B.get();
            if (map == null) {
                map = new HashMap();
                f2272B.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2271A);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0548c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: L */
    private boolean m2520L(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2278h;
        m2536z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0551f fVar = (C0551f) view.getLayoutParams();
            C0548c f = fVar.mo2770f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo2746k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo2735D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f2286p = view;
                    }
                }
                boolean c = fVar.mo2767c();
                boolean i4 = fVar.mo2773i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo2746k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo2735D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m2521M() {
        this.f2276f.clear();
        this.f2277g.mo2793c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0551f y = mo2730y(childAt);
            y.mo2768d(this, childAt);
            this.f2277g.mo2792b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (y.mo2766b(this, childAt, childAt2)) {
                        if (!this.f2277g.mo2794d(childAt2)) {
                            this.f2277g.mo2792b(childAt2);
                        }
                        this.f2277g.mo2791a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2276f.addAll(this.f2277g.mo2797i());
        Collections.reverse(this.f2276f);
    }

    /* renamed from: O */
    private static void m2522O(Rect rect) {
        rect.setEmpty();
        f2274D.mo5908a(rect);
    }

    /* renamed from: Q */
    private void m2523Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0548c f = ((C0551f) childAt.getLayoutParams()).mo2770f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo2746k(this, childAt, obtain);
                } else {
                    f.mo2735D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0551f) getChildAt(i2).getLayoutParams()).mo2777m();
        }
        this.f2286p = null;
        this.f2283m = false;
    }

    /* renamed from: R */
    private static int m2524R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m2525S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m2526T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m2527U(View view, int i) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        int i2 = fVar.f2306i;
        if (i2 != i) {
            C3403t.m14619T(view, i - i2);
            fVar.f2306i = i;
        }
    }

    /* renamed from: V */
    private void m2528V(View view, int i) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        int i2 = fVar.f2307j;
        if (i2 != i) {
            C3403t.m14620U(view, i - i2);
            fVar.f2307j = i;
        }
    }

    /* renamed from: X */
    private void m2529X() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C3403t.m14668v(this)) {
                if (this.f2294x == null) {
                    this.f2294x = new C0546a();
                }
                C3403t.m14667u0(this, this.f2294x);
                setSystemUiVisibility(1280);
                return;
            }
            C3403t.m14667u0(this, (C3399p) null);
        }
    }

    /* renamed from: a */
    private static Rect m2530a() {
        Rect b = f2274D.mo5909b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: d */
    private static int m2531d(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: e */
    private void m2532e(C0551f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: f */
    private C3356b0 m2533f(C3356b0 b0Var) {
        C0548c f;
        if (b0Var.mo11570m()) {
            return b0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C3403t.m14668v(childAt) && (f = ((C0551f) childAt.getLayoutParams()).mo2770f()) != null) {
                f.mo2741f(this, childAt, b0Var);
                if (b0Var.mo11570m()) {
                    break;
                }
            }
        }
        return b0Var;
    }

    /* renamed from: v */
    private void m2534v(View view, int i, Rect rect, Rect rect2, C0551f fVar, int i2, int i3) {
        int b = C3386d.m14544b(m2524R(fVar.f2300c), i);
        int b2 = C3386d.m14544b(m2525S(fVar.f2301d), i);
        int i4 = b & 7;
        int i5 = b & 112;
        int i6 = b2 & 7;
        int i7 = b2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: w */
    private int m2535w(int i) {
        StringBuilder sb;
        int[] iArr = this.f2285o;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: z */
    private void m2536z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f2273C;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean mo2680B(View view, int i, int i2) {
        Rect a = m2530a();
        mo2726t(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m2522O(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo2681G(View view, int i) {
        C0548c f;
        View view2 = view;
        C0551f fVar = (C0551f) view.getLayoutParams();
        if (fVar.f2308k != null) {
            Rect a = m2530a();
            Rect a2 = m2530a();
            Rect a3 = m2530a();
            mo2726t(fVar.f2308k, a);
            boolean z = false;
            mo2715q(view2, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2534v(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m2532e(fVar, a3, measuredWidth, i2);
            int i3 = a3.left - a2.left;
            int i4 = a3.top - a2.top;
            if (i3 != 0) {
                C3403t.m14619T(view2, i3);
            }
            if (i4 != 0) {
                C3403t.m14620U(view2, i4);
            }
            if (z && (f = fVar.mo2770f()) != null) {
                f.mo2743h(this, view2, fVar.f2308k);
            }
            m2522O(a);
            m2522O(a2);
            m2522O(a3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo2682H(int i) {
        boolean z;
        int i2 = i;
        int y = C3403t.m14674y(this);
        int size = this.f2276f.size();
        Rect a = m2530a();
        Rect a2 = m2530a();
        Rect a3 = m2530a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f2276f.get(i3);
            C0551f fVar = (C0551f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f2309l == this.f2276f.get(i4)) {
                        mo2681G(view, y);
                    }
                }
                mo2715q(view, true, a2);
                if (fVar.f2304g != 0 && !a2.isEmpty()) {
                    int b = C3386d.m14544b(fVar.f2304g, y);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i5 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i6 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f2305h != 0 && view.getVisibility() == 0) {
                    m2518F(view, a, y);
                }
                if (i2 != 2) {
                    mo2729x(view, a3);
                    if (!a3.equals(a2)) {
                        mo2685N(view, a2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f2276f.get(i7);
                    C0551f fVar2 = (C0551f) view2.getLayoutParams();
                    C0548c f = fVar2.mo2770f();
                    if (f != null && f.mo2740e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2771g()) {
                            if (i2 != 2) {
                                z = f.mo2743h(this, view2, view);
                            } else {
                                f.mo2744i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2779p(z);
                            }
                        } else {
                            fVar2.mo2775k();
                        }
                    }
                }
            }
        }
        m2522O(a);
        m2522O(a2);
        m2522O(a3);
    }

    /* renamed from: I */
    public void mo2683I(View view, int i) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        if (!fVar.mo2765a()) {
            View view2 = fVar.f2308k;
            if (view2 != null) {
                m2516D(view, view2, i);
                return;
            }
            int i2 = fVar.f2302e;
            if (i2 >= 0) {
                m2517E(view, i2, i);
            } else {
                m2515C(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: J */
    public void mo2684J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo2685N(View view, Rect rect) {
        ((C0551f) view.getLayoutParams()).mo2780q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo2686P() {
        if (this.f2284n && this.f2288r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2288r);
        }
        this.f2289s = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final C3356b0 mo2687W(C3356b0 b0Var) {
        if (!C3344c.m14350a(this.f2290t, b0Var)) {
            this.f2290t = b0Var;
            boolean z = true;
            boolean z2 = b0Var != null && b0Var.mo11565h() > 0;
            this.f2291u = z2;
            if (z2 || getBackground() != null) {
                z = false;
            }
            setWillNotDraw(z);
            m2533f(b0Var);
            requestLayout();
        }
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2688b() {
        if (this.f2284n) {
            if (this.f2288r == null) {
                this.f2288r = new C0552g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2288r);
        }
        this.f2289s = true;
    }

    /* renamed from: c */
    public void mo1511c(View view, View view2, int i, int i2) {
        C0548c f;
        this.f2295y.mo11701c(view, view2, i, i2);
        this.f2287q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0551f fVar = (C0551f) childAt.getLayoutParams();
            if (fVar.mo2774j(i2) && (f = fVar.mo2770f()) != null) {
                f.mo2757v(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0551f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        C0548c cVar = fVar.f2298a;
        if (cVar != null) {
            float d = cVar.mo2739d(this, view);
            if (d > 0.0f) {
                if (this.f2280j == null) {
                    this.f2280j = new Paint();
                }
                this.f2280j.setColor(fVar.f2298a.mo2738c(this, view));
                this.f2280j.setAlpha(m2531d(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2280j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2292v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: g */
    public void mo2692g(View view) {
        List g = this.f2277g.mo2795g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C0548c f = ((C0551f) view2.getLayoutParams()).mo2770f();
                if (f != null) {
                    f.mo2743h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m2521M();
        return Collections.unmodifiableList(this.f2276f);
    }

    public final C3356b0 getLastWindowInsets() {
        return this.f2290t;
    }

    public int getNestedScrollAxes() {
        return this.f2295y.mo11699a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2292v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2702h() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m2514A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2289s) {
            return;
        }
        if (z) {
            mo2688b();
        } else {
            mo2686P();
        }
    }

    /* renamed from: i */
    public void mo1526i(View view, int i) {
        this.f2295y.mo11702d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0551f fVar = (C0551f) childAt.getLayoutParams();
            if (fVar.mo2774j(i)) {
                C0548c f = fVar.mo2770f();
                if (f != null) {
                    f.mo2734C(this, childAt, view, i);
                }
                fVar.mo2776l(i);
                fVar.mo2775k();
            }
        }
        this.f2287q = null;
    }

    /* renamed from: j */
    public void mo1527j(View view, int i, int i2, int[] iArr, int i3) {
        C0548c f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0551f fVar = (C0551f) childAt.getLayoutParams();
                if (fVar.mo2774j(i3) && (f = fVar.mo2770f()) != null) {
                    int[] iArr2 = this.f2281k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2752q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2281k;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f2281k;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo2682H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0551f generateDefaultLayoutParams() {
        return new C0551f(-2, -2);
    }

    /* renamed from: l */
    public C0551f generateLayoutParams(AttributeSet attributeSet) {
        return new C0551f(getContext(), attributeSet);
    }

    /* renamed from: m */
    public void mo1530m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0548c f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0551f fVar = (C0551f) childAt.getLayoutParams();
                if (fVar.mo2774j(i5) && (f = fVar.mo2770f()) != null) {
                    int[] iArr2 = this.f2281k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2755t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2281k;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f2281k[1]) : Math.min(i7, this.f2281k[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo2682H(1);
        }
    }

    /* renamed from: n */
    public void mo1531n(View view, int i, int i2, int i3, int i4, int i5) {
        mo1530m(view, i, i2, i3, i4, 0, this.f2282l);
    }

    /* renamed from: o */
    public boolean mo1532o(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0551f fVar = (C0551f) childAt.getLayoutParams();
                C0548c f = fVar.mo2770f();
                if (f != null) {
                    boolean A = f.mo2732A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo2781r(i3, A);
                } else {
                    fVar.mo2781r(i3, false);
                }
            }
            i4++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2523Q(false);
        if (this.f2289s) {
            if (this.f2288r == null) {
                this.f2288r = new C0552g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2288r);
        }
        if (this.f2290t == null && C3403t.m14668v(this)) {
            C3403t.m14637f0(this);
        }
        this.f2284n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2523Q(false);
        if (this.f2289s && this.f2288r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2288r);
        }
        View view = this.f2287q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2284n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2291u && this.f2292v != null) {
            C3356b0 b0Var = this.f2290t;
            int h = b0Var != null ? b0Var.mo11565h() : 0;
            if (h > 0) {
                this.f2292v.setBounds(0, 0, getWidth(), h);
                this.f2292v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2523Q(true);
        }
        boolean L = m2520L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2523Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0548c f;
        int y = C3403t.m14674y(this);
        int size = this.f2276f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2276f.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0551f) view.getLayoutParams()).mo2770f()) == null || !f.mo2747l(this, view, y))) {
                mo2683I(view, y);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2748m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m2521M()
            r30.mo2702h()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p086f.p111h.p122m.C3403t.m14674y(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            f.h.m.b0 r3 = r7.f2290t
            if (r3 == 0) goto L_0x004b
            boolean r3 = p086f.p111h.p122m.C3403t.m14668v(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2276f
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f2276f
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0551f) r1
            int r0 = r1.f2302e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m2535w(r0)
            int r11 = r1.f2300c
            int r11 = m2526T(r11)
            int r11 = p086f.p111h.p122m.C3386d.m14544b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p086f.p111h.p122m.C3403t.m14668v(r20)
            if (r0 != 0) goto L_0x00f1
            f.h.m.b0 r0 = r7.f2290t
            int r0 = r0.mo11563f()
            f.h.m.b0 r2 = r7.f2290t
            int r2 = r2.mo11564g()
            int r0 = r0 + r2
            f.h.m.b0 r2 = r7.f2290t
            int r2 = r2.mo11565h()
            f.h.m.b0 r11 = r7.f2290t
            int r11 = r11.mo11561e()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2770f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2748m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2684J(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0548c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0551f fVar = (C0551f) childAt.getLayoutParams();
                if (fVar.mo2774j(0) && (f3 = fVar.mo2770f()) != null) {
                    z2 |= f3.mo2749n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2682H(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0548c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0551f fVar = (C0551f) childAt.getLayoutParams();
                if (fVar.mo2774j(0) && (f3 = fVar.mo2770f()) != null) {
                    z |= f3.mo2750o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1527j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1531n(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1511c(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0553h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0553h hVar = (C0553h) parcelable;
        super.onRestoreInstanceState(hVar.mo11760a());
        SparseArray<Parcelable> sparseArray = hVar.f2316h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0548c f = mo2730y(childAt).mo2770f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo2759x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        C0553h hVar = new C0553h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0548c f = ((C0551f) childAt.getLayoutParams()).mo2770f();
            if (!(id == -1 || f == null || (y = f.mo2760y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        hVar.f2316h = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1532o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1526i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2286p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m2520L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2286p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0551f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2770f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2286p
            boolean r6 = r6.mo2735D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2286p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m2523Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0551f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0551f ? new C0551f((C0551f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0551f((ViewGroup.MarginLayoutParams) layoutParams) : new C0551f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2715q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2726t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> mo2716r(View view) {
        List<View> h = this.f2277g.mo2796h(view);
        this.f2279i.clear();
        if (h != null) {
            this.f2279i.addAll(h);
        }
        return this.f2279i;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0548c f = ((C0551f) view.getLayoutParams()).mo2770f();
        if (f == null || !f.mo2758w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2283m) {
            m2523Q(false);
            this.f2283m = true;
        }
    }

    /* renamed from: s */
    public List<View> mo2719s(View view) {
        List g = this.f2277g.mo2795g(view);
        this.f2279i.clear();
        if (g != null) {
            this.f2279i.addAll(g);
        }
        return this.f2279i;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2529X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2293w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2292v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2292v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2292v.setState(getDrawableState());
                }
                C0588a.m2770m(this.f2292v, C3403t.m14674y(this));
                this.f2292v.setVisible(getVisibility() == 0, false);
                this.f2292v.setCallback(this);
            }
            C3403t.m14625Z(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C3267a.m14076f(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2292v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2292v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2726t(View view, Rect rect) {
        C0557b.m2630a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2727u(View view, int i, Rect rect, Rect rect2) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2534v(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m2532e(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2292v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2729x(View view, Rect rect) {
        rect.set(((C0551f) view.getLayoutParams()).mo2772h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C0551f mo2730y(View view) {
        C0551f fVar = (C0551f) view.getLayoutParams();
        if (!fVar.f2299b) {
            if (view instanceof C0547b) {
                C0548c behavior = ((C0547b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo2778o(behavior);
            } else {
                C0549d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0549d) cls.getAnnotation(C0549d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2778o((C0548c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f2299b = true;
        }
        return fVar;
    }
}
