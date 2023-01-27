package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3393j;
import p086f.p111h.p122m.C3394k;
import p086f.p111h.p122m.C3396m;
import p086f.p111h.p122m.C3398o;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3376e;

public class NestedScrollView extends FrameLayout implements C3396m, C3393j {

    /* renamed from: F */
    private static final C0594a f2458F = new C0594a();

    /* renamed from: G */
    private static final int[] f2459G = {16843130};

    /* renamed from: A */
    private C0596c f2460A;

    /* renamed from: B */
    private final C3398o f2461B;

    /* renamed from: C */
    private final C3394k f2462C;

    /* renamed from: D */
    private float f2463D;

    /* renamed from: E */
    private C0595b f2464E;

    /* renamed from: f */
    private long f2465f;

    /* renamed from: g */
    private final Rect f2466g;

    /* renamed from: h */
    private OverScroller f2467h;

    /* renamed from: i */
    private EdgeEffect f2468i;

    /* renamed from: j */
    private EdgeEffect f2469j;

    /* renamed from: k */
    private int f2470k;

    /* renamed from: l */
    private boolean f2471l;

    /* renamed from: m */
    private boolean f2472m;

    /* renamed from: n */
    private View f2473n;

    /* renamed from: o */
    private boolean f2474o;

    /* renamed from: p */
    private VelocityTracker f2475p;

    /* renamed from: q */
    private boolean f2476q;

    /* renamed from: r */
    private boolean f2477r;

    /* renamed from: s */
    private int f2478s;

    /* renamed from: t */
    private int f2479t;

    /* renamed from: u */
    private int f2480u;

    /* renamed from: v */
    private int f2481v;

    /* renamed from: w */
    private final int[] f2482w;

    /* renamed from: x */
    private final int[] f2483x;

    /* renamed from: y */
    private int f2484y;

    /* renamed from: z */
    private int f2485z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0594a extends C3350a {
        C0594a() {
        }

        /* renamed from: f */
        public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2996f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3376e.m14538a(accessibilityEvent, nestedScrollView.getScrollX());
            C3376e.m14539b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            int scrollRange;
            super.mo2997g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo11621b0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo11657v0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo11620b(C3369c.C3370a.f10675i);
                    cVar.mo11620b(C3369c.C3370a.f10679m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo11620b(C3369c.C3370a.f10674h);
                    cVar.mo11620b(C3369c.C3370a.f10680n);
                }
            }
        }

        /* renamed from: j */
        public boolean mo2998j(View view, int i, Bundle bundle) {
            if (super.mo2998j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2935O(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2935O(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0595b {
        /* renamed from: a */
        void mo755a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C0596c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0596c> CREATOR = new C0597a();

        /* renamed from: f */
        public int f2486f;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        class C0597a implements Parcelable.Creator<C0596c> {
            C0597a() {
            }

            /* renamed from: a */
            public C0596c createFromParcel(Parcel parcel) {
                return new C0596c(parcel);
            }

            /* renamed from: b */
            public C0596c[] newArray(int i) {
                return new C0596c[i];
            }
        }

        C0596c(Parcel parcel) {
            super(parcel);
            this.f2486f = parcel.readInt();
        }

        C0596c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2486f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2486f);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2466g = new Rect();
        this.f2471l = true;
        this.f2472m = false;
        this.f2473n = null;
        this.f2474o = false;
        this.f2477r = true;
        this.f2481v = -1;
        this.f2482w = new int[2];
        this.f2483x = new int[2];
        m2806x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2459G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2461B = new C3398o(this);
        this.f2462C = new C3394k(this);
        setNestedScrollingEnabled(true);
        C3403t.m14643i0(this, f2458F);
    }

    /* renamed from: A */
    private static boolean m2787A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m2787A((View) parent, view2);
    }

    /* renamed from: B */
    private boolean m2788B(View view, int i, int i2) {
        view.getDrawingRect(this.f2466g);
        offsetDescendantRectToMyCoords(view, this.f2466g);
        return this.f2466g.bottom + i >= getScrollY() && this.f2466g.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m2789C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2462C.mo11689e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: D */
    private void m2790D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2481v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2470k = (int) motionEvent.getY(i);
            this.f2481v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2475p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m2791G() {
        VelocityTracker velocityTracker = this.f2475p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2475p = null;
        }
    }

    /* renamed from: H */
    private void m2792H(boolean z) {
        if (z) {
            mo2936P(2, 1);
        } else {
            mo2937Q(1);
        }
        this.f2485z = getScrollY();
        C3403t.m14625Z(this);
    }

    /* renamed from: I */
    private boolean m2793I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View r = m2803r(z2, i2, i3);
        if (r == null) {
            r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2800k(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m2794J(View view) {
        view.getDrawingRect(this.f2466g);
        offsetDescendantRectToMyCoords(view, this.f2466g);
        int f = mo2956f(this.f2466g);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    /* renamed from: K */
    private boolean m2795K(Rect rect, boolean z) {
        int f = mo2956f(rect);
        boolean z2 = f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                mo2933L(0, f);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m2796M(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2465f > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2467h;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m2792H(z);
            } else {
                if (!this.f2467h.isFinished()) {
                    m2797a();
                }
                scrollBy(i, i2);
            }
            this.f2465f = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m2797a() {
        this.f2467h.abortAnimation();
        mo2937Q(1);
    }

    /* renamed from: d */
    private boolean m2798d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: e */
    private static int m2799e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2463D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2463D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2463D;
    }

    /* renamed from: k */
    private void m2800k(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2477r) {
            mo2933L(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: l */
    private void m2801l() {
        this.f2474o = false;
        m2791G();
        mo2937Q(0);
        EdgeEffect edgeEffect = this.f2468i;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2469j.onRelease();
        }
    }

    /* renamed from: p */
    private void m2802p() {
        if (getOverScrollMode() == 2) {
            this.f2468i = null;
            this.f2469j = null;
        } else if (this.f2468i == null) {
            Context context = getContext();
            this.f2468i = new EdgeEffect(context);
            this.f2469j = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m2803r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m2804v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: w */
    private void m2805w() {
        VelocityTracker velocityTracker = this.f2475p;
        if (velocityTracker == null) {
            this.f2475p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m2806x() {
        this.f2467h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2478s = viewConfiguration.getScaledTouchSlop();
        this.f2479t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2480u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m2807y() {
        if (this.f2475p == null) {
            this.f2475p = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m2808z(View view) {
        return !m2788B(view, 0, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2931E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo2995u(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f2467h
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2931E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean mo2932F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2466g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2466g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2466g.top = getScrollY() - height;
            Rect rect2 = this.f2466g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2466g;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m2793I(i, i2, i3);
    }

    /* renamed from: L */
    public final void mo2933L(int i, int i2) {
        m2796M(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo2934N(int i, int i2, int i3, boolean z) {
        m2796M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo2935O(int i, int i2, boolean z) {
        mo2934N(i, i2, 250, z);
    }

    /* renamed from: P */
    public boolean mo2936P(int i, int i2) {
        return this.f2462C.mo11696p(i, i2);
    }

    /* renamed from: Q */
    public void mo2937Q(int i) {
        this.f2462C.mo11698r(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo2942b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2788B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2800k(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2466g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2466g);
            m2800k(mo2956f(this.f2466g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2808z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: c */
    public void mo1511c(View view, View view2, int i, int i2) {
        this.f2461B.mo11701c(view, view2, i, i2);
        mo2936P(2, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f2467h.isFinished()) {
            this.f2467h.computeScrollOffset();
            int currY = this.f2467h.getCurrY();
            int i = currY - this.f2485z;
            this.f2485z = currY;
            int[] iArr = this.f2483x;
            boolean z = false;
            iArr[1] = 0;
            mo2957g(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f2483x[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2931E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2483x;
                iArr2[1] = 0;
                mo2963h(0, scrollY2, 0, i3, this.f2482w, 1, iArr2);
                i2 = i3 - this.f2483x[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m2802p();
                    if (i2 < 0) {
                        if (this.f2468i.isFinished()) {
                            edgeEffect = this.f2468i;
                        }
                    } else if (this.f2469j.isFinished()) {
                        edgeEffect = this.f2469j;
                    }
                    edgeEffect.onAbsorb((int) this.f2467h.getCurrVelocity());
                }
                m2797a();
            }
            if (!this.f2467h.isFinished()) {
                C3403t.m14625Z(this);
            } else {
                mo2937Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2980q(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2462C.mo11685a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2462C.mo11686b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2957g(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2462C.mo11690f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2468i != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2468i.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2468i.setSize(width, height);
                if (this.f2468i.draw(canvas)) {
                    C3403t.m14625Z(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2469j.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2469j.setSize(width2, height2);
                if (this.f2469j.draw(canvas)) {
                    C3403t.m14625Z(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo2956f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: g */
    public boolean mo2957g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2462C.mo11688d(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2461B.mo11699a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo2963h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2462C.mo11689e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean hasNestedScrollingParent() {
        return mo2995u(0);
    }

    /* renamed from: i */
    public void mo1526i(View view, int i) {
        this.f2461B.mo11702d(view, i);
        mo2937Q(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2462C.mo11693l();
    }

    /* renamed from: j */
    public void mo1527j(View view, int i, int i2, int[] iArr, int i3) {
        mo2957g(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: m */
    public void mo1530m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m2789C(i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo1531n(View view, int i, int i2, int i3, int i4, int i5) {
        m2789C(i4, i5, (int[]) null);
    }

    /* renamed from: o */
    public boolean mo1532o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2472m = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2474o) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2474o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2481v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2470k) > this.f2478s && (2 & getNestedScrollAxes()) == 0) {
                                this.f2474o = true;
                                this.f2470k = y;
                                m2807y();
                                this.f2475p.addMovement(motionEvent);
                                this.f2484y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m2790D(motionEvent);
                    }
                }
            }
            this.f2474o = false;
            this.f2481v = -1;
            m2791G();
            if (this.f2467h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C3403t.m14625Z(this);
            }
            mo2937Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m2804v((int) motionEvent.getX(), y2)) {
                this.f2474o = false;
                m2791G();
            } else {
                this.f2470k = y2;
                this.f2481v = motionEvent.getPointerId(0);
                m2805w();
                this.f2475p.addMovement(motionEvent);
                this.f2467h.computeScrollOffset();
                this.f2474o = !this.f2467h.isFinished();
                mo2936P(2, 0);
            }
        }
        return this.f2474o;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2471l = false;
        View view = this.f2473n;
        if (view != null && m2787A(view, this)) {
            m2794J(this.f2473n);
        }
        this.f2473n = null;
        if (!this.f2472m) {
            if (this.f2460A != null) {
                scrollTo(getScrollX(), this.f2460A.f2486f);
                this.f2460A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = m2799e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2472m = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2476q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2985s((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1527j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m2789C(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1511c(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m2808z(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0596c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0596c cVar = (C0596c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f2460A = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0596c cVar = new C0596c(super.onSaveInstanceState());
        cVar.f2486f = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0595b bVar = this.f2464E;
        if (bVar != null) {
            bVar.mo755a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2788B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2466g);
            offsetDescendantRectToMyCoords(findFocus, this.f2466g);
            m2800k(mo2956f(this.f2466g));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1532o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1526i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f2467h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0210, code lost:
        if (r10.f2467h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m2807y()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f2484y = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f2484y
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0214
            r3 = -1
            if (r0 == r14) goto L_0x01cf
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x024a
        L_0x002f:
            r23.m2790D(r24)
            int r0 = r10.f2481v
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f2470k = r0
            goto L_0x024a
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f2470k = r1
            int r0 = r11.getPointerId(r0)
            r10.f2481v = r0
            goto L_0x024a
        L_0x0054:
            boolean r0 = r10.f2474o
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f2467h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            p086f.p111h.p122m.C3403t.m14625Z(r23)
        L_0x007b:
            r10.f2481v = r3
            r23.m2801l()
            goto L_0x024a
        L_0x0082:
            int r0 = r10.f2481v
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f2481v
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x024a
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f2470k
            int r0 = r0 - r6
            boolean r1 = r10.f2474o
            if (r1 != 0) goto L_0x00cf
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f2478s
            if (r1 <= r2) goto L_0x00cf
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00c6
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00c6:
            r10.f2474o = r14
            int r1 = r10.f2478s
            if (r0 <= 0) goto L_0x00ce
            int r0 = r0 - r1
            goto L_0x00cf
        L_0x00ce:
            int r0 = r0 + r1
        L_0x00cf:
            r7 = r0
            boolean r0 = r10.f2474o
            if (r0 == 0) goto L_0x024a
            r1 = 0
            int[] r3 = r10.f2483x
            int[] r4 = r10.f2482w
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo2957g(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f1
            int[] r0 = r10.f2483x
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f2484y
            int[] r1 = r10.f2482w
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2484y = r0
        L_0x00f1:
            r16 = r7
            int[] r0 = r10.f2482w
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f2470k = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0110
            if (r0 != r14) goto L_0x010d
            if (r9 <= 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            r18 = 0
            goto L_0x0112
        L_0x0110:
            r18 = 1
        L_0x0112:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo2931E(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0137
            boolean r0 = r10.mo2995u(r12)
            if (r0 != 0) goto L_0x0137
            android.view.VelocityTracker r0 = r10.f2475p
            r0.clear()
        L_0x0137:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f2483x
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2482w
            r6 = 0
            r0 = r23
            r0.mo2963h(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f2470k
            int[] r1 = r10.f2482w
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f2470k = r0
            int r0 = r10.f2484y
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2484y = r0
            if (r18 == 0) goto L_0x024a
            int[] r0 = r10.f2483x
            r0 = r0[r14]
            int r0 = r16 - r0
            r23.m2802p()
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0190
            android.widget.EdgeEffect r1 = r10.f2468i
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0603d.m2875a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2469j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f2469j
        L_0x018c:
            r0.onRelease()
            goto L_0x01b8
        L_0x0190:
            r2 = r22
            if (r1 <= r2) goto L_0x01b8
            android.widget.EdgeEffect r1 = r10.f2469j
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C0603d.m2875a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2468i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f2468i
            goto L_0x018c
        L_0x01b8:
            android.widget.EdgeEffect r0 = r10.f2468i
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01ca
            android.widget.EdgeEffect r0 = r10.f2469j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024a
        L_0x01ca:
            p086f.p111h.p122m.C3403t.m14625Z(r23)
            goto L_0x024a
        L_0x01cf:
            android.view.VelocityTracker r0 = r10.f2475p
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f2480u
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f2481v
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f2479t
            if (r1 < r4) goto L_0x01f8
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo2985s(r0)
            goto L_0x007b
        L_0x01f8:
            android.widget.OverScroller r15 = r10.f2467h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0214:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x021b
            return r12
        L_0x021b:
            android.widget.OverScroller r0 = r10.f2467h
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r14
            r10.f2474o = r0
            if (r0 == 0) goto L_0x022f
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x022f
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x022f:
            android.widget.OverScroller r0 = r10.f2467h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
            r23.m2797a()
        L_0x023a:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f2470k = r0
            int r0 = r11.getPointerId(r12)
            r10.f2481v = r0
            r10.mo2936P(r1, r12)
        L_0x024a:
            android.view.VelocityTracker r0 = r10.f2475p
            if (r0 == 0) goto L_0x0251
            r0.addMovement(r13)
        L_0x0251:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean mo2980q(KeyEvent keyEvent) {
        this.f2466g.setEmpty();
        int i = 130;
        if (!m2798d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo2942b(33) : mo2994t(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo2942b(130) : mo2994t(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo2932F(i);
            return false;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2471l) {
            m2794J(view2);
        } else {
            this.f2473n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2795K(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2791G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2471l = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void mo2985s(int i) {
        if (getChildCount() > 0) {
            this.f2467h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2792H(true);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = m2799e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = m2799e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e != getScrollX() || e2 != getScrollY()) {
                super.scrollTo(e, e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2476q) {
            this.f2476q = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2462C.mo11694m(z);
    }

    public void setOnScrollChangeListener(C0595b bVar) {
        this.f2464E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2477r = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2936P(i, 0);
    }

    public void stopNestedScroll() {
        mo2937Q(0);
    }

    /* renamed from: t */
    public boolean mo2994t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2466g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2466g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2466g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2466g;
        return m2793I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean mo2995u(int i) {
        return this.f2462C.mo11692k(i);
    }
}
