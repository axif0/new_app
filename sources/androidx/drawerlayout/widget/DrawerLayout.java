package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.drawable.C0588a;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p126j.p127a.C3430a;
import p086f.p126j.p128b.C3441c;

public class DrawerLayout extends ViewGroup {

    /* renamed from: P */
    private static final int[] f2535P = {16843828};

    /* renamed from: Q */
    static final int[] f2536Q = {16842931};

    /* renamed from: R */
    static final boolean f2537R = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: S */
    private static final boolean f2538S;

    /* renamed from: A */
    private float f2539A;

    /* renamed from: B */
    private Drawable f2540B;

    /* renamed from: C */
    private Drawable f2541C;

    /* renamed from: D */
    private Drawable f2542D;

    /* renamed from: E */
    private CharSequence f2543E;

    /* renamed from: F */
    private CharSequence f2544F;

    /* renamed from: G */
    private Object f2545G;

    /* renamed from: H */
    private boolean f2546H;

    /* renamed from: I */
    private Drawable f2547I;

    /* renamed from: J */
    private Drawable f2548J;

    /* renamed from: K */
    private Drawable f2549K;

    /* renamed from: L */
    private Drawable f2550L;

    /* renamed from: M */
    private final ArrayList<View> f2551M;

    /* renamed from: N */
    private Rect f2552N;

    /* renamed from: O */
    private Matrix f2553O;

    /* renamed from: f */
    private final C0615c f2554f;

    /* renamed from: g */
    private float f2555g;

    /* renamed from: h */
    private int f2556h;

    /* renamed from: i */
    private int f2557i;

    /* renamed from: j */
    private float f2558j;

    /* renamed from: k */
    private Paint f2559k;

    /* renamed from: l */
    private final C3441c f2560l;

    /* renamed from: m */
    private final C3441c f2561m;

    /* renamed from: n */
    private final C0620g f2562n;

    /* renamed from: o */
    private final C0620g f2563o;

    /* renamed from: p */
    private int f2564p;

    /* renamed from: q */
    private boolean f2565q;

    /* renamed from: r */
    private boolean f2566r;

    /* renamed from: s */
    private int f2567s;

    /* renamed from: t */
    private int f2568t;

    /* renamed from: u */
    private int f2569u;

    /* renamed from: v */
    private int f2570v;

    /* renamed from: w */
    private boolean f2571w;

    /* renamed from: x */
    private C0616d f2572x;

    /* renamed from: y */
    private List<C0616d> f2573y;

    /* renamed from: z */
    private float f2574z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C0613a implements View.OnApplyWindowInsetsListener {
        C0613a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).mo3049S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class C0614b extends C3350a {

        /* renamed from: d */
        private final Rect f2576d = new Rect();

        C0614b() {
        }

        /* renamed from: n */
        private void m2961n(C3369c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2912A(childAt)) {
                    cVar.mo11622c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m2962o(C3369c cVar, C3369c cVar2) {
            Rect rect = this.f2576d;
            cVar2.mo11639m(rect);
            cVar.mo11615X(rect);
            cVar2.mo11641n(rect);
            cVar.mo11616Y(rect);
            cVar.mo11597B0(cVar2.mo11610N());
            cVar.mo11646p0(cVar2.mo11656v());
            cVar.mo11621b0(cVar2.mo11645p());
            cVar.mo11629f0(cVar2.mo11650s());
            cVar.mo11631h0(cVar2.mo11602F());
            cVar.mo11623c0(cVar2.mo11601E());
            cVar.mo11635j0(cVar2.mo11603G());
            cVar.mo11637k0(cVar2.mo11604H());
            cVar.mo11614V(cVar2.mo11596B());
            cVar.mo11658w0(cVar2.mo11608L());
            cVar.mo11642n0(cVar2.mo11605I());
            cVar.mo11618a(cVar2.mo11636k());
        }

        /* renamed from: a */
        public boolean mo3106a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo3106a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View p = DrawerLayout.this.mo3090p();
            if (p == null || (s = DrawerLayout.this.mo3095s(DrawerLayout.this.mo3103t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        /* renamed from: f */
        public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2996f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            if (DrawerLayout.f2537R) {
                super.mo2997g(view, cVar);
            } else {
                C3369c Q = C3369c.m14443Q(cVar);
                super.mo2997g(view, Q);
                cVar.mo11662y0(view);
                ViewParent E = C3403t.m14604E(view);
                if (E instanceof View) {
                    cVar.mo11649r0((View) E);
                }
                m2962o(cVar, Q);
                Q.mo11612S();
                m2961n(cVar, (ViewGroup) view);
            }
            cVar.mo11621b0(DrawerLayout.class.getName());
            cVar.mo11635j0(false);
            cVar.mo11637k0(false);
            cVar.mo11613T(C3369c.C3370a.f10671e);
            cVar.mo11613T(C3369c.C3370a.f10672f);
        }

        /* renamed from: i */
        public boolean mo3107i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f2537R || DrawerLayout.m2912A(view)) {
                return super.mo3107i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C0615c extends C3350a {
        C0615c() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            if (!DrawerLayout.m2912A(view)) {
                cVar.mo11649r0((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface C0616d {
        /* renamed from: a */
        void mo312a(int i);

        /* renamed from: b */
        void mo313b(View view, float f);

        /* renamed from: c */
        void mo314c(View view);

        /* renamed from: d */
        void mo315d(View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C0617e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2578a = 0;

        /* renamed from: b */
        float f2579b;

        /* renamed from: c */
        boolean f2580c;

        /* renamed from: d */
        int f2581d;

        public C0617e(int i, int i2) {
            super(i, i2);
        }

        public C0617e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2536Q);
            this.f2578a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0617e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0617e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0617e(C0617e eVar) {
            super(eVar);
            this.f2578a = eVar.f2578a;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    protected static class C0618f extends C3430a {
        public static final Parcelable.Creator<C0618f> CREATOR = new C0619a();

        /* renamed from: h */
        int f2582h = 0;

        /* renamed from: i */
        int f2583i;

        /* renamed from: j */
        int f2584j;

        /* renamed from: k */
        int f2585k;

        /* renamed from: l */
        int f2586l;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        static class C0619a implements Parcelable.ClassLoaderCreator<C0618f> {
            C0619a() {
            }

            /* renamed from: a */
            public C0618f createFromParcel(Parcel parcel) {
                return new C0618f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0618f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0618f(parcel, classLoader);
            }

            /* renamed from: c */
            public C0618f[] newArray(int i) {
                return new C0618f[i];
            }
        }

        public C0618f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2582h = parcel.readInt();
            this.f2583i = parcel.readInt();
            this.f2584j = parcel.readInt();
            this.f2585k = parcel.readInt();
            this.f2586l = parcel.readInt();
        }

        public C0618f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2582h);
            parcel.writeInt(this.f2583i);
            parcel.writeInt(this.f2584j);
            parcel.writeInt(this.f2585k);
            parcel.writeInt(this.f2586l);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    private class C0620g extends C3441c.C3444c {

        /* renamed from: a */
        private final int f2587a;

        /* renamed from: b */
        private C3441c f2588b;

        /* renamed from: c */
        private final Runnable f2589c = new C0621a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        class C0621a implements Runnable {
            C0621a() {
            }

            public void run() {
                C0620g.this.mo3125o();
            }
        }

        C0620g(int i) {
            this.f2587a = i;
        }

        /* renamed from: n */
        private void m2975n() {
            int i = 3;
            if (this.f2587a == 3) {
                i = 5;
            }
            View n = DrawerLayout.this.mo3076n(i);
            if (n != null) {
                DrawerLayout.this.mo3064f(n);
            }
        }

        /* renamed from: a */
        public int mo3114a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.mo3057c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* renamed from: b */
        public int mo3115b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3116d(View view) {
            if (DrawerLayout.this.mo3040E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo3117f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View n = drawerLayout.mo3076n(i3);
            if (n != null && DrawerLayout.this.mo3092r(n) == 0) {
                this.f2588b.mo11799b(n, i2);
            }
        }

        /* renamed from: g */
        public boolean mo3118g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo3119h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f2589c, 160);
        }

        /* renamed from: i */
        public void mo3120i(View view, int i) {
            ((C0617e) view.getLayoutParams()).f2580c = false;
            m2975n();
        }

        /* renamed from: j */
        public void mo3121j(int i) {
            DrawerLayout.this.mo3052W(this.f2587a, i, this.f2588b.mo11804v());
        }

        /* renamed from: k */
        public void mo3122k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo3057c(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo3051U(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo3123l(View view, float f, float f2) {
            int i;
            float u = DrawerLayout.this.mo3104u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo3057c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f2588b.mo11794M(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo3124m(View view, int i) {
            return DrawerLayout.this.mo3040E(view) && DrawerLayout.this.mo3057c(view, this.f2587a) && DrawerLayout.this.mo3092r(view) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo3125o() {
            View view;
            int i;
            int w = this.f2588b.mo11805w();
            int i2 = 0;
            boolean z = this.f2587a == 3;
            if (z) {
                view = DrawerLayout.this.mo3076n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + w;
            } else {
                view = DrawerLayout.this.mo3076n(5);
                i = DrawerLayout.this.getWidth() - w;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo3092r(view) == 0) {
                this.f2588b.mo11796O(view, i, view.getTop());
                ((C0617e) view.getLayoutParams()).f2580c = true;
                DrawerLayout.this.invalidate();
                m2975n();
                DrawerLayout.this.mo3056b();
            }
        }

        /* renamed from: p */
        public void mo3126p() {
            DrawerLayout.this.removeCallbacks(this.f2589c);
        }

        /* renamed from: q */
        public void mo3127q(C3441c cVar) {
            this.f2588b = cVar;
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f2538S = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2554f = new C0615c();
        this.f2557i = -1728053248;
        this.f2559k = new Paint();
        this.f2566r = true;
        this.f2567s = 3;
        this.f2568t = 3;
        this.f2569u = 3;
        this.f2570v = 3;
        this.f2547I = null;
        this.f2548J = null;
        this.f2549K = null;
        this.f2550L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2556h = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f2562n = new C0620g(3);
        this.f2563o = new C0620g(5);
        C3441c n = C3441c.m14847n(this, 1.0f, this.f2562n);
        this.f2560l = n;
        n.mo11792K(1);
        this.f2560l.mo11793L(f2);
        this.f2562n.mo3127q(this.f2560l);
        C3441c n2 = C3441c.m14847n(this, 1.0f, this.f2563o);
        this.f2561m = n2;
        n2.mo11792K(2);
        this.f2561m.mo11793L(f2);
        this.f2563o.mo3127q(this.f2561m);
        setFocusableInTouchMode(true);
        C3403t.m14663s0(this, 1);
        C3403t.m14643i0(this, new C0614b());
        setMotionEventSplittingEnabled(false);
        if (C3403t.m14668v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C0613a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2535P);
                try {
                    this.f2540B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2540B = null;
            }
        }
        this.f2555g = f * 10.0f;
        this.f2551M = new ArrayList<>();
    }

    /* renamed from: A */
    static boolean m2912A(View view) {
        return (C3403t.m14670w(view) == 4 || C3403t.m14670w(view) == 2) ? false : true;
    }

    /* renamed from: H */
    private boolean m2913H(float f, float f2, View view) {
        if (this.f2552N == null) {
            this.f2552N = new Rect();
        }
        view.getHitRect(this.f2552N);
        return this.f2552N.contains((int) f, (int) f2);
    }

    /* renamed from: I */
    private boolean m2914I(Drawable drawable, int i) {
        if (drawable == null || !C0588a.m2765h(drawable)) {
            return false;
        }
        C0588a.m2770m(drawable, i);
        return true;
    }

    /* renamed from: P */
    private Drawable m2915P() {
        int y = C3403t.m14674y(this);
        if (y == 0) {
            Drawable drawable = this.f2547I;
            if (drawable != null) {
                m2914I(drawable, y);
                return this.f2547I;
            }
        } else {
            Drawable drawable2 = this.f2548J;
            if (drawable2 != null) {
                m2914I(drawable2, y);
                return this.f2548J;
            }
        }
        return this.f2549K;
    }

    /* renamed from: Q */
    private Drawable m2916Q() {
        int y = C3403t.m14674y(this);
        if (y == 0) {
            Drawable drawable = this.f2548J;
            if (drawable != null) {
                m2914I(drawable, y);
                return this.f2548J;
            }
        } else {
            Drawable drawable2 = this.f2547I;
            if (drawable2 != null) {
                m2914I(drawable2, y);
                return this.f2547I;
            }
        }
        return this.f2550L;
    }

    /* renamed from: R */
    private void m2917R() {
        if (!f2538S) {
            this.f2541C = m2915P();
            this.f2542D = m2916Q();
        }
    }

    /* renamed from: V */
    private void m2918V(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C3403t.m14663s0(childAt, ((z || mo3040E(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: m */
    private boolean m2919m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v = m2920v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v);
            v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: v */
    private MotionEvent m2920v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f2553O == null) {
                this.f2553O = new Matrix();
            }
            matrix.invert(this.f2553O);
            obtain.transform(this.f2553O);
        }
        return obtain;
    }

    /* renamed from: w */
    static String m2921w(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: x */
    private static boolean m2922x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: y */
    private boolean m2923y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0617e) getChildAt(i).getLayoutParams()).f2580c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private boolean m2924z() {
        return mo3090p() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3037B(View view) {
        return ((C0617e) view.getLayoutParams()).f2578a == 0;
    }

    /* renamed from: C */
    public boolean mo3038C(int i) {
        View n = mo3076n(i);
        if (n != null) {
            return mo3039D(n);
        }
        return false;
    }

    /* renamed from: D */
    public boolean mo3039D(View view) {
        if (mo3040E(view)) {
            return (((C0617e) view.getLayoutParams()).f2581d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3040E(View view) {
        int b = C3386d.m14544b(((C0617e) view.getLayoutParams()).f2578a, C3403t.m14674y(view));
        return ((b & 3) == 0 && (b & 5) == 0) ? false : true;
    }

    /* renamed from: F */
    public boolean mo3041F(int i) {
        View n = mo3076n(i);
        if (n != null) {
            return mo3042G(n);
        }
        return false;
    }

    /* renamed from: G */
    public boolean mo3042G(View view) {
        if (mo3040E(view)) {
            return ((C0617e) view.getLayoutParams()).f2579b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3043J(View view, float f) {
        float u = mo3104u(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (u * width));
        if (!mo3057c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo3051U(view, f);
    }

    /* renamed from: K */
    public void mo3044K(int i) {
        mo3045L(i, true);
    }

    /* renamed from: L */
    public void mo3045L(int i, boolean z) {
        View n = mo3076n(i);
        if (n != null) {
            mo3047N(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2921w(i));
    }

    /* renamed from: M */
    public void mo3046M(View view) {
        mo3047N(view, true);
    }

    /* renamed from: N */
    public void mo3047N(View view, boolean z) {
        if (mo3040E(view)) {
            C0617e eVar = (C0617e) view.getLayoutParams();
            if (this.f2566r) {
                eVar.f2579b = 1.0f;
                eVar.f2581d = 1;
                m2918V(view, true);
            } else if (z) {
                eVar.f2581d |= 2;
                if (mo3057c(view, 3)) {
                    this.f2560l.mo11796O(view, 0, view.getTop());
                } else {
                    this.f2561m.mo11796O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo3043J(view, 1.0f);
                mo3052W(eVar.f2578a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: O */
    public void mo3048O(C0616d dVar) {
        List<C0616d> list;
        if (dVar != null && (list = this.f2573y) != null) {
            list.remove(dVar);
        }
    }

    /* renamed from: S */
    public void mo3049S(Object obj, boolean z) {
        this.f2545G = obj;
        this.f2546H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: T */
    public void mo3050T(int i, int i2) {
        View n;
        int b = C3386d.m14544b(i2, C3403t.m14674y(this));
        if (i2 == 3) {
            this.f2567s = i;
        } else if (i2 == 5) {
            this.f2568t = i;
        } else if (i2 == 8388611) {
            this.f2569u = i;
        } else if (i2 == 8388613) {
            this.f2570v = i;
        }
        if (i != 0) {
            (b == 3 ? this.f2560l : this.f2561m).mo11798a();
        }
        if (i == 1) {
            View n2 = mo3076n(b);
            if (n2 != null) {
                mo3064f(n2);
            }
        } else if (i == 2 && (n = mo3076n(b)) != null) {
            mo3046M(n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3051U(View view, float f) {
        C0617e eVar = (C0617e) view.getLayoutParams();
        if (f != eVar.f2579b) {
            eVar.f2579b = f;
            mo3075l(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo3052W(int i, int i2, View view) {
        int z = this.f2560l.mo11807z();
        int z2 = this.f2561m.mo11807z();
        int i3 = 2;
        if (z == 1 || z2 == 1) {
            i3 = 1;
        } else if (!(z == 2 || z2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C0617e) view.getLayoutParams()).f2579b;
            if (f == 0.0f) {
                mo3073j(view);
            } else if (f == 1.0f) {
                mo3074k(view);
            }
        }
        if (i3 != this.f2564p) {
            this.f2564p = i3;
            List<C0616d> list = this.f2573y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2573y.get(size).mo312a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3053a(C0616d dVar) {
        if (dVar != null) {
            if (this.f2573y == null) {
                this.f2573y = new ArrayList();
            }
            this.f2573y.add(dVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo3040E(childAt)) {
                    this.f2551M.add(childAt);
                } else if (mo3039D(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f2551M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f2551M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f2551M.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C3403t.m14663s0(view, (mo3077o() != null || mo3040E(view)) ? 4 : 1);
        if (!f2537R) {
            C3403t.m14643i0(view, this.f2554f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3056b() {
        if (!this.f2571w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f2571w = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3057c(View view, int i) {
        return (mo3103t(view) & i) == i;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0617e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0617e) getChildAt(i).getLayoutParams()).f2579b);
        }
        this.f2558j = f;
        boolean m = this.f2560l.mo11802m(true);
        boolean m2 = this.f2561m.mo11802m(true);
        if (m || m2) {
            C3403t.m14625Z(this);
        }
    }

    /* renamed from: d */
    public void mo3060d(int i) {
        mo3063e(i, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2558j <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m2913H(x, y, childAt) && !mo3037B(childAt) && m2919m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B = mo3037B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (B) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m2922x(childAt) && mo3040E(childAt) && childAt.getHeight() >= height) {
                    if (mo3057c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f2558j;
        if (f <= 0.0f || !B) {
            if (this.f2541C != null && mo3057c(view2, 3)) {
                int intrinsicWidth = this.f2541C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f2560l.mo11805w()), 1.0f));
                this.f2541C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f2541C.setAlpha((int) (max * 255.0f));
                drawable = this.f2541C;
            } else if (this.f2542D != null && mo3057c(view2, 5)) {
                int intrinsicWidth2 = this.f2542D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f2561m.mo11805w()), 1.0f));
                this.f2542D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f2542D.setAlpha((int) (max2 * 255.0f));
                drawable = this.f2542D;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.f2557i;
            this.f2559k.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f2559k);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo3063e(int i, boolean z) {
        View n = mo3076n(i);
        if (n != null) {
            mo3065g(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2921w(i));
    }

    /* renamed from: f */
    public void mo3064f(View view) {
        mo3065g(view, true);
    }

    /* renamed from: g */
    public void mo3065g(View view, boolean z) {
        C3441c cVar;
        int i;
        if (mo3040E(view)) {
            C0617e eVar = (C0617e) view.getLayoutParams();
            if (this.f2566r) {
                eVar.f2579b = 0.0f;
                eVar.f2581d = 0;
            } else if (z) {
                eVar.f2581d |= 4;
                if (mo3057c(view, 3)) {
                    cVar = this.f2560l;
                    i = -view.getWidth();
                } else {
                    cVar = this.f2561m;
                    i = getWidth();
                }
                cVar.mo11796O(view, i, view.getTop());
            } else {
                mo3043J(view, 0.0f);
                mo3052W(eVar.f2578a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0617e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0617e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0617e ? new C0617e((C0617e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0617e((ViewGroup.MarginLayoutParams) layoutParams) : new C0617e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f2538S) {
            return this.f2555g;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2540B;
    }

    /* renamed from: h */
    public void mo3071h() {
        mo3072i(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3072i(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0617e eVar = (C0617e) childAt.getLayoutParams();
            if (mo3040E(childAt) && (!z || eVar.f2580c)) {
                z2 |= mo3057c(childAt, 3) ? this.f2560l.mo11796O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2561m.mo11796O(childAt, getWidth(), childAt.getTop());
                eVar.f2580c = false;
            }
        }
        this.f2562n.mo3126p();
        this.f2563o.mo3126p();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3073j(View view) {
        View rootView;
        C0617e eVar = (C0617e) view.getLayoutParams();
        if ((eVar.f2581d & 1) == 1) {
            eVar.f2581d = 0;
            List<C0616d> list = this.f2573y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2573y.get(size).mo315d(view);
                }
            }
            m2918V(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3074k(View view) {
        C0617e eVar = (C0617e) view.getLayoutParams();
        if ((eVar.f2581d & 1) == 0) {
            eVar.f2581d = 1;
            List<C0616d> list = this.f2573y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2573y.get(size).mo314c(view);
                }
            }
            m2918V(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3075l(View view, float f) {
        List<C0616d> list = this.f2573y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2573y.get(size).mo313b(view, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public View mo3076n(int i) {
        int b = C3386d.m14544b(i, C3403t.m14674y(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo3103t(childAt) & 7) == b) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public View mo3077o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0617e) childAt.getLayoutParams()).f2581d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2566r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2566r = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f2545G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f2546H
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f2540B
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f2545G
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f2540B
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f2540B
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.f2560l.mo11803t((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            f.j.b.c r1 = r6.f2560l
            boolean r1 = r1.mo11795N(r7)
            f.j.b.c r2 = r6.f2561m
            boolean r2 = r2.mo11795N(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            f.j.b.c r7 = r6.f2560l
            boolean r7 = r7.mo11800d(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2562n
            r7.mo3126p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2563o
            r7.mo3126p()
            goto L_0x0036
        L_0x0031:
            r6.mo3072i(r2)
            r6.f2571w = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2574z = r0
            r6.f2539A = r7
            float r4 = r6.f2558j
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            f.j.b.c r4 = r6.f2560l
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo11803t(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.mo3037B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.f2571w = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.m2923y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f2571w
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2924z()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View p = mo3090p();
        if (p != null && mo3092r(p) == 0) {
            mo3071h();
        }
        return p != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f2565q = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0617e eVar = (C0617e) childAt.getLayoutParams();
                if (mo3037B(childAt)) {
                    int i10 = eVar.leftMargin;
                    childAt.layout(i10, eVar.topMargin, childAt.getMeasuredWidth() + i10, eVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (mo3057c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.f2579b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i8 - ((int) (eVar.f2579b * f3));
                        f = ((float) (i8 - i11)) / f3;
                        i5 = i11;
                    }
                    boolean z2 = f != eVar.f2579b;
                    int i12 = eVar.f2578a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = eVar.topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - eVar.bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - eVar.bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = eVar.topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = eVar.bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        mo3051U(childAt, f);
                    }
                    int i19 = eVar.f2579b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f2565q = false;
        this.f2566r = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f2545G != null && C3403t.m14668v(this);
        int y = C3403t.m14674y(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0617e eVar = (C0617e) childAt.getLayoutParams();
                if (z) {
                    int b = C3386d.m14544b(eVar.f2578a, y);
                    boolean v = C3403t.m14668v(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (v) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f2545G;
                            if (b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f2545G;
                        if (b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        eVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        eVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        eVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        eVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo3037B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - eVar.leftMargin) - eVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - eVar.topMargin) - eVar.bottomMargin, 1073741824));
                } else if (mo3040E(childAt)) {
                    if (f2538S) {
                        float t = C3403t.m14664t(childAt);
                        float f = this.f2555g;
                        if (t != f) {
                            C3403t.m14657p0(childAt, f);
                        }
                    }
                    int t2 = mo3103t(childAt) & 7;
                    boolean z4 = t2 == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f2556h + eVar.leftMargin + eVar.rightMargin, eVar.width), ViewGroup.getChildMeasureSpec(i2, eVar.topMargin + eVar.bottomMargin, eVar.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m2921w(t2) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i6 = i;
            int i7 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof C0618f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0618f fVar = (C0618f) parcelable;
        super.onRestoreInstanceState(fVar.mo11760a());
        int i = fVar.f2582h;
        if (!(i == 0 || (n = mo3076n(i)) == null)) {
            mo3046M(n);
        }
        int i2 = fVar.f2583i;
        if (i2 != 3) {
            mo3050T(i2, 3);
        }
        int i3 = fVar.f2584j;
        if (i3 != 3) {
            mo3050T(i3, 5);
        }
        int i4 = fVar.f2585k;
        if (i4 != 3) {
            mo3050T(i4, 8388611);
        }
        int i5 = fVar.f2586l;
        if (i5 != 3) {
            mo3050T(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m2917R();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0618f fVar = new C0618f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0617e eVar = (C0617e) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = eVar.f2581d == 1;
            if (eVar.f2581d != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f2582h = eVar.f2578a;
            } else {
                i++;
            }
        }
        fVar.f2583i = this.f2567s;
        fVar.f2584j = this.f2568t;
        fVar.f2585k = this.f2569u;
        fVar.f2586l = this.f2570v;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (mo3092r(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            f.j.b.c r0 = r6.f2560l
            r0.mo11790E(r7)
            f.j.b.c r0 = r6.f2561m
            r0.mo11790E(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.mo3072i(r2)
            goto L_0x006c
        L_0x001e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            f.j.b.c r3 = r6.f2560l
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo11803t(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.mo3037B(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f2574z
            float r0 = r0 - r3
            float r3 = r6.f2539A
            float r7 = r7 - r3
            f.j.b.c r3 = r6.f2560l
            int r3 = r3.mo11806y()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.mo3077o()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.mo3092r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.mo3072i(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2574z = r0
            r6.f2539A = r7
        L_0x006c:
            r6.f2571w = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public View mo3090p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo3040E(childAt) && mo3042G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int mo3091q(int i) {
        int y = C3403t.m14674y(this);
        if (i == 3) {
            int i2 = this.f2567s;
            if (i2 != 3) {
                return i2;
            }
            int i3 = y == 0 ? this.f2569u : this.f2570v;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f2568t;
            if (i4 != 3) {
                return i4;
            }
            int i5 = y == 0 ? this.f2570v : this.f2569u;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f2569u;
            if (i6 != 3) {
                return i6;
            }
            int i7 = y == 0 ? this.f2567s : this.f2568t;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f2570v;
            if (i8 != 3) {
                return i8;
            }
            int i9 = y == 0 ? this.f2568t : this.f2567s;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* renamed from: r */
    public int mo3092r(View view) {
        if (mo3040E(view)) {
            return mo3091q(((C0617e) view.getLayoutParams()).f2578a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo3072i(true);
        }
    }

    public void requestLayout() {
        if (!this.f2565q) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public CharSequence mo3095s(int i) {
        int b = C3386d.m14544b(i, C3403t.m14674y(this));
        if (b == 3) {
            return this.f2543E;
        }
        if (b == 5) {
            return this.f2544F;
        }
        return null;
    }

    public void setDrawerElevation(float f) {
        this.f2555g = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo3040E(childAt)) {
                C3403t.m14657p0(childAt, this.f2555g);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0616d dVar) {
        C0616d dVar2 = this.f2572x;
        if (dVar2 != null) {
            mo3048O(dVar2);
        }
        if (dVar != null) {
            mo3053a(dVar);
        }
        this.f2572x = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo3050T(i, 3);
        mo3050T(i, 5);
    }

    public void setScrimColor(int i) {
        this.f2557i = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f2540B = i != 0 ? C3267a.m14076f(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2540B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2540B = new ColorDrawable(i);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo3103t(View view) {
        return C3386d.m14544b(((C0617e) view.getLayoutParams()).f2578a, C3403t.m14674y(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo3104u(View view) {
        return ((C0617e) view.getLayoutParams()).f2579b;
    }
}
