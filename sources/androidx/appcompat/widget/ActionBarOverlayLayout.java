package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0350m;
import p086f.p087a.C3123a;
import p086f.p087a.C3128f;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3395l;
import p086f.p111h.p122m.C3396m;
import p086f.p111h.p122m.C3397n;
import p086f.p111h.p122m.C3398o;
import p086f.p111h.p122m.C3403t;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0403a0, C3397n, C3395l, C3396m {

    /* renamed from: K */
    static final int[] f1349K = {C3123a.actionBarSize, 16842841};

    /* renamed from: A */
    private C3356b0 f1350A;

    /* renamed from: B */
    private C3356b0 f1351B;

    /* renamed from: C */
    private C3356b0 f1352C;

    /* renamed from: D */
    private C0365d f1353D;

    /* renamed from: E */
    private OverScroller f1354E;

    /* renamed from: F */
    ViewPropertyAnimator f1355F;

    /* renamed from: G */
    final AnimatorListenerAdapter f1356G;

    /* renamed from: H */
    private final Runnable f1357H;

    /* renamed from: I */
    private final Runnable f1358I;

    /* renamed from: J */
    private final C3398o f1359J;

    /* renamed from: f */
    private int f1360f;

    /* renamed from: g */
    private int f1361g = 0;

    /* renamed from: h */
    private ContentFrameLayout f1362h;

    /* renamed from: i */
    ActionBarContainer f1363i;

    /* renamed from: j */
    private C0406b0 f1364j;

    /* renamed from: k */
    private Drawable f1365k;

    /* renamed from: l */
    private boolean f1366l;

    /* renamed from: m */
    private boolean f1367m;

    /* renamed from: n */
    private boolean f1368n;

    /* renamed from: o */
    private boolean f1369o;

    /* renamed from: p */
    boolean f1370p;

    /* renamed from: q */
    private int f1371q;

    /* renamed from: r */
    private int f1372r;

    /* renamed from: s */
    private final Rect f1373s = new Rect();

    /* renamed from: t */
    private final Rect f1374t = new Rect();

    /* renamed from: u */
    private final Rect f1375u = new Rect();

    /* renamed from: v */
    private final Rect f1376v = new Rect();

    /* renamed from: w */
    private final Rect f1377w = new Rect();

    /* renamed from: x */
    private final Rect f1378x = new Rect();

    /* renamed from: y */
    private final Rect f1379y = new Rect();

    /* renamed from: z */
    private C3356b0 f1380z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0362a extends AnimatorListenerAdapter {
        C0362a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1355F = null;
            actionBarOverlayLayout.f1370p = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1355F = null;
            actionBarOverlayLayout.f1370p = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0363b implements Runnable {
        C0363b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1562u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1355F = actionBarOverlayLayout.f1363i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1356G);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0364c implements Runnable {
        C0364c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1562u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1355F = actionBarOverlayLayout.f1363i.animate().translationY((float) (-ActionBarOverlayLayout.this.f1363i.getHeight())).setListener(ActionBarOverlayLayout.this.f1356G);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0365d {
        /* renamed from: a */
        void mo1008a();

        /* renamed from: b */
        void mo1009b();

        /* renamed from: c */
        void mo1010c(int i);

        /* renamed from: d */
        void mo1011d();

        /* renamed from: e */
        void mo1012e(boolean z);

        /* renamed from: f */
        void mo1013f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0366e extends ViewGroup.MarginLayoutParams {
        public C0366e(int i, int i2) {
            super(i, i2);
        }

        public C0366e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0366e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3356b0 b0Var = C3356b0.f10648b;
        this.f1380z = b0Var;
        this.f1350A = b0Var;
        this.f1351B = b0Var;
        this.f1352C = b0Var;
        this.f1356G = new C0362a();
        this.f1357H = new C0363b();
        this.f1358I = new C0364c();
        m1619v(context);
        this.f1359J = new C3398o(this);
    }

    /* renamed from: A */
    private void m1614A() {
        mo1562u();
        this.f1357H.run();
    }

    /* renamed from: B */
    private boolean m1615B(float f) {
        this.f1354E.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1354E.getFinalY() > this.f1363i.getHeight();
    }

    /* renamed from: p */
    private void m1616p() {
        mo1562u();
        this.f1358I.run();
    }

    /* renamed from: q */
    private boolean m1617q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0366e eVar = (C0366e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private C0406b0 m1618t(View view) {
        if (view instanceof C0406b0) {
            return (C0406b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m1619v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1349K);
        boolean z = false;
        this.f1360f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1365k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1366l = z;
        this.f1354E = new OverScroller(context);
    }

    /* renamed from: x */
    private void m1620x() {
        mo1562u();
        postDelayed(this.f1358I, 600);
    }

    /* renamed from: y */
    private void m1621y() {
        mo1562u();
        postDelayed(this.f1357H, 600);
    }

    /* renamed from: a */
    public void mo1509a(Menu menu, C0350m.C0351a aVar) {
        mo1564z();
        this.f1364j.mo1951a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo1510b() {
        mo1564z();
        return this.f1364j.mo1952b();
    }

    /* renamed from: c */
    public void mo1511c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0366e;
    }

    /* renamed from: d */
    public void mo1513d() {
        mo1564z();
        this.f1364j.mo1955d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1365k != null && !this.f1366l) {
            int bottom = this.f1363i.getVisibility() == 0 ? (int) (((float) this.f1363i.getBottom()) + this.f1363i.getTranslationY() + 0.5f) : 0;
            this.f1365k.setBounds(0, bottom, getWidth(), this.f1365k.getIntrinsicHeight() + bottom);
            this.f1365k.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1515e() {
        mo1564z();
        return this.f1364j.mo1956e();
    }

    /* renamed from: f */
    public boolean mo1516f() {
        mo1564z();
        return this.f1364j.mo1957f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1564z();
        boolean q = m1617q(this.f1363i, rect, true, true, false, true);
        this.f1376v.set(rect);
        C0404a1.m1827a(this, this.f1376v, this.f1373s);
        if (!this.f1377w.equals(this.f1376v)) {
            this.f1377w.set(this.f1376v);
            q = true;
        }
        if (!this.f1374t.equals(this.f1373s)) {
            this.f1374t.set(this.f1373s);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1518g() {
        mo1564z();
        return this.f1364j.mo1958g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0366e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1363i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1359J.mo11699a();
    }

    public CharSequence getTitle() {
        mo1564z();
        return this.f1364j.getTitle();
    }

    /* renamed from: h */
    public boolean mo1525h() {
        mo1564z();
        return this.f1364j.mo1960h();
    }

    /* renamed from: i */
    public void mo1526i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public void mo1527j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: k */
    public void mo1528k(int i) {
        mo1564z();
        if (i == 2) {
            this.f1364j.mo1979w();
        } else if (i == 5) {
            this.f1364j.mo1980x();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo1529l() {
        mo1564z();
        this.f1364j.mo1961i();
    }

    /* renamed from: m */
    public void mo1530m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1531n(view, i, i2, i3, i4, i5);
    }

    /* renamed from: n */
    public void mo1531n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public boolean mo1532o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1564z();
        C3356b0 p = C3356b0.m14388p(windowInsets);
        boolean q = m1617q(this.f1363i, new Rect(p.mo11563f(), p.mo11565h(), p.mo11564g(), p.mo11561e()), true, true, false, true);
        C3403t.m14636f(this, p, this.f1373s);
        Rect rect = this.f1373s;
        C3356b0 k = p.mo11569k(rect.left, rect.top, rect.right, rect.bottom);
        this.f1380z = k;
        boolean z = true;
        if (!this.f1350A.equals(k)) {
            this.f1350A = this.f1380z;
            q = true;
        }
        if (!this.f1374t.equals(this.f1373s)) {
            this.f1374t.set(this.f1373s);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return p.mo11557a().mo11559c().mo11558b().mo11572o();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1619v(getContext());
        C3403t.m14637f0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1562u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0366e eVar = (C0366e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r11.mo1564z()
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f1363i
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f1363i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0366e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f1363i
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r7 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f1363i
            int r1 = r1.getMeasuredHeight()
            int r3 = r0.topMargin
            int r1 = r1 + r3
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f1363i
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r2, r0)
            int r0 = p086f.p111h.p122m.C3403t.m14607H(r11)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x005f
            int r1 = r11.f1360f
            boolean r3 = r11.f1368n
            if (r3 == 0) goto L_0x0071
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f1363i
            android.view.View r3 = r3.getTabContainer()
            if (r3 == 0) goto L_0x0071
            int r3 = r11.f1360f
            int r1 = r1 + r3
            goto L_0x0071
        L_0x005f:
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f1363i
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x0070
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f1363i
            int r1 = r1.getMeasuredHeight()
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            android.graphics.Rect r3 = r11.f1375u
            android.graphics.Rect r4 = r11.f1373s
            r3.set(r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r10 = 21
            if (r3 < r10) goto L_0x0083
            f.h.m.b0 r3 = r11.f1380z
            r11.f1351B = r3
            goto L_0x008a
        L_0x0083:
            android.graphics.Rect r3 = r11.f1378x
            android.graphics.Rect r4 = r11.f1376v
            r3.set(r4)
        L_0x008a:
            boolean r3 = r11.f1367m
            if (r3 != 0) goto L_0x00a7
            if (r0 != 0) goto L_0x00a7
            android.graphics.Rect r0 = r11.f1375u
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r3 = r0.bottom
            int r3 = r3 + r2
            r0.bottom = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x00e6
            f.h.m.b0 r0 = r11.f1351B
            f.h.m.b0 r0 = r0.mo11569k(r2, r1, r2, r2)
            goto L_0x00d7
        L_0x00a7:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x00da
            f.h.m.b0 r0 = r11.f1351B
            int r0 = r0.mo11563f()
            f.h.m.b0 r3 = r11.f1351B
            int r3 = r3.mo11565h()
            int r3 = r3 + r1
            f.h.m.b0 r1 = r11.f1351B
            int r1 = r1.mo11564g()
            f.h.m.b0 r4 = r11.f1351B
            int r4 = r4.mo11561e()
            int r4 = r4 + r2
            f.h.f.b r0 = p086f.p111h.p114f.C3288b.m14163a(r0, r3, r1, r4)
            f.h.m.b0$a r1 = new f.h.m.b0$a
            f.h.m.b0 r2 = r11.f1351B
            r1.<init>(r2)
            r1.mo11575c(r0)
            f.h.m.b0 r0 = r1.mo11573a()
        L_0x00d7:
            r11.f1351B = r0
            goto L_0x00e6
        L_0x00da:
            android.graphics.Rect r0 = r11.f1378x
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r1 = r0.bottom
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x00e6:
            androidx.appcompat.widget.ContentFrameLayout r1 = r11.f1362h
            android.graphics.Rect r2 = r11.f1375u
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r0 = r11
            r0.m1617q(r1, r2, r3, r4, r5, r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x010a
            f.h.m.b0 r0 = r11.f1352C
            f.h.m.b0 r1 = r11.f1351B
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010a
            f.h.m.b0 r0 = r11.f1351B
            r11.f1352C = r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r11.f1362h
            p086f.p111h.p122m.C3403t.m14638g(r1, r0)
            goto L_0x0126
        L_0x010a:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r10) goto L_0x0126
            android.graphics.Rect r0 = r11.f1379y
            android.graphics.Rect r1 = r11.f1378x
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0126
            android.graphics.Rect r0 = r11.f1379y
            android.graphics.Rect r1 = r11.f1378x
            r0.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.f1362h
            android.graphics.Rect r1 = r11.f1378x
            r0.mo1662a(r1)
        L_0x0126:
            androidx.appcompat.widget.ContentFrameLayout r1 = r11.f1362h
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.f1362h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0366e) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r11.f1362h
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.f1362h
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r8, r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.f1362h
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r11.getPaddingTop()
            int r4 = r11.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = android.view.View.resolveSizeAndState(r1, r12, r2)
            int r2 = r2 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r13, r2)
            r11.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1369o || !z) {
            return false;
        }
        if (m1615B(f2)) {
            m1616p();
        } else {
            m1614A();
        }
        this.f1370p = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1371q + i2;
        this.f1371q = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1359J.mo11700b(view, view2, i);
        this.f1371q = getActionBarHideOffset();
        mo1562u();
        C0365d dVar = this.f1353D;
        if (dVar != null) {
            dVar.mo1009b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1363i.getVisibility() != 0) {
            return false;
        }
        return this.f1369o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1369o && !this.f1370p) {
            if (this.f1371q <= this.f1363i.getHeight()) {
                m1621y();
            } else {
                m1620x();
            }
        }
        C0365d dVar = this.f1353D;
        if (dVar != null) {
            dVar.mo1011d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1564z();
        int i2 = this.f1372r ^ i;
        this.f1372r = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0365d dVar = this.f1353D;
        if (dVar != null) {
            dVar.mo1012e(!z);
            if (z2 || !z) {
                this.f1353D.mo1008a();
            } else {
                this.f1353D.mo1013f();
            }
        }
        if ((i2 & 256) != 0 && this.f1353D != null) {
            C3403t.m14637f0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1361g = i;
        C0365d dVar = this.f1353D;
        if (dVar != null) {
            dVar.mo1010c(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0366e generateDefaultLayoutParams() {
        return new C0366e(-1, -1);
    }

    /* renamed from: s */
    public C0366e generateLayoutParams(AttributeSet attributeSet) {
        return new C0366e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo1562u();
        this.f1363i.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1363i.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0365d dVar) {
        this.f1353D = dVar;
        if (getWindowToken() != null) {
            this.f1353D.mo1010c(this.f1361g);
            int i = this.f1372r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C3403t.m14637f0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1368n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1369o) {
            this.f1369o = z;
            if (!z) {
                mo1562u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1564z();
        this.f1364j.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo1564z();
        this.f1364j.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo1564z();
        this.f1364j.mo1971s(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1367m = z;
        this.f1366l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1564z();
        this.f1364j.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1564z();
        this.f1364j.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1562u() {
        removeCallbacks(this.f1357H);
        removeCallbacks(this.f1358I);
        ViewPropertyAnimator viewPropertyAnimator = this.f1355F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo1563w() {
        return this.f1367m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1564z() {
        if (this.f1362h == null) {
            this.f1362h = (ContentFrameLayout) findViewById(C3128f.action_bar_activity_content);
            this.f1363i = (ActionBarContainer) findViewById(C3128f.action_bar_container);
            this.f1364j = m1618t(findViewById(C3128f.action_bar));
        }
    }
}
