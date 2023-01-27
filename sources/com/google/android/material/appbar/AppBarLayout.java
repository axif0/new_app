package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0588a;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import java.lang.ref.WeakReference;
import java.util.List;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p117h.C3306a;
import p086f.p111h.p121l.C3344c;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3393j;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3377f;
import p086f.p126j.p127a.C3430a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5001g;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p256m.C5007a;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0547b {

    /* renamed from: w */
    private static final int f6576w = C5005k.Widget_Design_AppBarLayout;

    /* renamed from: f */
    private int f6577f;

    /* renamed from: g */
    private int f6578g;

    /* renamed from: h */
    private int f6579h;

    /* renamed from: i */
    private int f6580i;

    /* renamed from: j */
    private boolean f6581j;

    /* renamed from: k */
    private int f6582k;

    /* renamed from: l */
    private C3356b0 f6583l;

    /* renamed from: m */
    private List<C2036c> f6584m;

    /* renamed from: n */
    private boolean f6585n;

    /* renamed from: o */
    private boolean f6586o;

    /* renamed from: p */
    private boolean f6587p;

    /* renamed from: q */
    private boolean f6588q;

    /* renamed from: r */
    private int f6589r;

    /* renamed from: s */
    private WeakReference<View> f6590s;

    /* renamed from: t */
    private ValueAnimator f6591t;

    /* renamed from: u */
    private int[] f6592u;

    /* renamed from: v */
    private Drawable f6593v;

    protected static class BaseBehavior<T extends AppBarLayout> extends C2038a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f6594k;

        /* renamed from: l */
        private int f6595l;

        /* renamed from: m */
        private ValueAnimator f6596m;

        /* renamed from: n */
        private int f6597n = -1;

        /* renamed from: o */
        private boolean f6598o;

        /* renamed from: p */
        private float f6599p;

        /* renamed from: q */
        private WeakReference<View> f6600q;

        /* renamed from: r */
        private C2031d f6601r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C2028a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f6602a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f6603b;

            C2028a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f6602a = coordinatorLayout;
                this.f6603b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo7571P(this.f6602a, this.f6603b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C2029b implements C3377f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f6605a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f6606b;

            /* renamed from: c */
            final /* synthetic */ View f6607c;

            /* renamed from: d */
            final /* synthetic */ int f6608d;

            C2029b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f6605a = coordinatorLayout;
                this.f6606b = appBarLayout;
                this.f6607c = view;
                this.f6608d = i;
            }

            /* renamed from: a */
            public boolean mo7550a(View view, C3377f.C3378a aVar) {
                BaseBehavior.this.mo2752q(this.f6605a, this.f6606b, this.f6607c, 0, this.f6608d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C2030c implements C3377f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f6610a;

            /* renamed from: b */
            final /* synthetic */ boolean f6611b;

            C2030c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.f6610a = appBarLayout;
                this.f6611b = z;
            }

            /* renamed from: a */
            public boolean mo7550a(View view, C3377f.C3378a aVar) {
                this.f6610a.setExpanded(this.f6611b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class C2031d<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo7551a(T t);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        protected static class C2032e extends C3430a {
            public static final Parcelable.Creator<C2032e> CREATOR = new C2033a();

            /* renamed from: h */
            int f6612h;

            /* renamed from: i */
            float f6613i;

            /* renamed from: j */
            boolean f6614j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e$a */
            static class C2033a implements Parcelable.ClassLoaderCreator<C2032e> {
                C2033a() {
                }

                /* renamed from: a */
                public C2032e createFromParcel(Parcel parcel) {
                    return new C2032e(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public C2032e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C2032e(parcel, classLoader);
                }

                /* renamed from: c */
                public C2032e[] newArray(int i) {
                    return new C2032e[i];
                }
            }

            public C2032e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f6612h = parcel.readInt();
                this.f6613i = parcel.readFloat();
                this.f6614j = parcel.readByte() != 0;
            }

            public C2032e(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f6612h);
                parcel.writeFloat(this.f6613i);
                parcel.writeByte(this.f6614j ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: S */
        private void m9225S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo7533M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m9226T(coordinatorLayout, t, C3369c.C3370a.f10674h, false);
            }
            if (mo7533M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C3403t.m14635e0(coordinatorLayout, C3369c.C3370a.f10675i, (CharSequence) null, new C2029b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            m9226T(coordinatorLayout, t, C3369c.C3370a.f10675i, true);
        }

        /* renamed from: T */
        private void m9226T(CoordinatorLayout coordinatorLayout, T t, C3369c.C3370a aVar, boolean z) {
            C3403t.m14635e0(coordinatorLayout, aVar, (CharSequence) null, new C2030c(this, t, z));
        }

        /* renamed from: U */
        private void m9227U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo7533M() - i);
            float abs2 = Math.abs(f);
            m9228V(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: V */
        private void m9228V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo7533M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f6596m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6596m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f6596m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6596m = valueAnimator3;
                valueAnimator3.setInterpolator(C5007a.f14951e);
                this.f6596m.addUpdateListener(new C2028a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f6596m.setDuration((long) Math.min(i2, 600));
            this.f6596m.setIntValues(new int[]{M, i});
            this.f6596m.start();
        }

        /* renamed from: X */
        private boolean m9229X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo7506h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m9230Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: Z */
        private View m9231Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C3393j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m9232a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m9233b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2037d dVar = (C2037d) childAt.getLayoutParams();
                if (m9230Y(dVar.mo7564a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m9234e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C2037d dVar = (C2037d) childAt.getLayoutParams();
                Interpolator b = dVar.mo7565b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = dVar.mo7564a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C3403t.m14676z(childAt);
                        }
                    }
                    if (C3403t.m14668v(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: p0 */
        private boolean m9235p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> s = coordinatorLayout.mo2719s(t);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.C0548c f = ((CoordinatorLayout.C0551f) s.get(i).getLayoutParams()).mo2770f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).mo7575K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m9236q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo7533M();
            int b0 = m9233b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                C2037d dVar = (C2037d) childAt.getLayoutParams();
                int a = dVar.mo7564a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m9230Y(a, 2)) {
                        i2 += C3403t.m14676z(childAt);
                    } else if (m9230Y(a, 5)) {
                        int z = C3403t.m14676z(childAt) + i2;
                        if (M < z) {
                            i = z;
                        } else {
                            i2 = z;
                        }
                    }
                    if (m9230Y(a, 32)) {
                        i += dVar.topMargin;
                        i2 -= dVar.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m9227U(coordinatorLayout, t, C3306a.m14255b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m9237r0(CoordinatorLayout coordinatorLayout, T t) {
            C3403t.m14631c0(coordinatorLayout, C3369c.C3370a.f10674h.mo11665b());
            C3403t.m14631c0(coordinatorLayout, C3369c.C3370a.f10675i.mo11665b());
            View Z = m9231Z(coordinatorLayout);
            if (Z != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0551f) Z.getLayoutParams()).mo2770f() instanceof ScrollingViewBehavior)) {
                m9225S(coordinatorLayout, t, Z);
            }
        }

        /* renamed from: s0 */
        private void m9238s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = m9232a0(t, i);
            if (a0 != null) {
                int a = ((C2037d) a0.getLayoutParams()).mo7564a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int z3 = C3403t.m14676z(a0);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (a0.getBottom() - z3) - t.getTopInset()) : (-i) >= (a0.getBottom() - z3) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo7507j()) {
                    z2 = t.mo7518s(m9231Z(coordinatorLayout));
                }
                boolean q = t.mo7517q(z2);
                if (z || (q && m9235p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public int mo7533M() {
            return mo7579E() + this.f6594k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public boolean mo7530H(T t) {
            C2031d dVar = this.f6601r;
            if (dVar != null) {
                return dVar.mo7551a(t);
            }
            WeakReference<View> weakReference = this.f6600q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int mo7531K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public int mo7532L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f0 */
        public void mo7534N(CoordinatorLayout coordinatorLayout, T t) {
            m9236q0(coordinatorLayout, t);
            if (t.mo7507j()) {
                t.mo7517q(t.mo7518s(m9231Z(coordinatorLayout)));
            }
        }

        /* renamed from: g0 */
        public boolean mo2747l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean l = super.mo2747l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f6597n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                mo7571P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f6598o ? C3403t.m14676z(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f6599p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m9227U(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        mo7571P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m9227U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo7571P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo7510m();
            this.f6597n = -1;
            mo7580G(C3306a.m14255b(mo7579E(), -t.getTotalScrollRange(), 0));
            m9238s0(coordinatorLayout, t, mo7579E(), 0, true);
            t.mo7508k(mo7579E());
            m9237r0(coordinatorLayout, t);
            return l;
        }

        /* renamed from: h0 */
        public boolean mo2748m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0551f) t.getLayoutParams()).height != -2) {
                return super.mo2748m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2684J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: i0 */
        public void mo2752q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo7570O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo7507j()) {
                t.mo7517q(t.mo7518s(view));
            }
        }

        /* renamed from: j0 */
        public void mo2755t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo7570O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m9237r0(coordinatorLayout, t);
            }
        }

        /* renamed from: k0 */
        public void mo2759x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C2032e) {
                C2032e eVar = (C2032e) parcelable;
                super.mo2759x(coordinatorLayout, t, eVar.mo11760a());
                this.f6597n = eVar.f6612h;
                this.f6599p = eVar.f6613i;
                this.f6598o = eVar.f6614j;
                return;
            }
            super.mo2759x(coordinatorLayout, t, parcelable);
            this.f6597n = -1;
        }

        /* renamed from: l0 */
        public Parcelable mo2760y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo2760y(coordinatorLayout, t);
            int E = mo7579E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    C2032e eVar = new C2032e(y);
                    eVar.f6612h = i;
                    if (bottom == C3403t.m14676z(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    eVar.f6614j = z;
                    eVar.f6613i = ((float) bottom) / ((float) childAt.getHeight());
                    return eVar;
                }
            }
            return y;
        }

        /* renamed from: m0 */
        public boolean mo2732A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo7507j() || m9229X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f6596m) != null) {
                valueAnimator.cancel();
            }
            this.f6600q = null;
            this.f6595l = i2;
            return z;
        }

        /* renamed from: n0 */
        public void mo2734C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f6595l == 0 || i == 1) {
                m9236q0(coordinatorLayout, t);
                if (t.mo7507j()) {
                    t.mo7517q(t.mo7518s(view));
                }
            }
            this.f6600q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public int mo7535Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo7533M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f6594k = 0;
            } else {
                int b = C3306a.m14255b(i, i2, i3);
                if (M != b) {
                    int e0 = t.mo7492f() ? m9234e0(t, b) : b;
                    boolean G = mo7580G(e0);
                    i4 = M - b;
                    this.f6594k = b - e0;
                    if (!G && t.mo7492f()) {
                        coordinatorLayout.mo2692g(t);
                    }
                    t.mo7508k(mo7579E());
                    m9238s0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            m9237r0(coordinatorLayout, t);
            return i4;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C2040b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.ScrollingViewBehavior_Layout);
            mo7577O(obtainStyledAttributes.getDimensionPixelSize(C5006l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: R */
        private static int m9272R(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0548c f = ((CoordinatorLayout.C0551f) appBarLayout.getLayoutParams()).mo2770f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo7533M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m9273S(View view, View view2) {
            CoordinatorLayout.C0548c f = ((CoordinatorLayout.C0551f) view2.getLayoutParams()).mo2770f();
            if (f instanceof BaseBehavior) {
                C3403t.m14620U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f6594k) + mo7576M()) - mo7574I(view2));
            }
        }

        /* renamed from: T */
        private void m9274T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo7507j()) {
                    appBarLayout.mo7517q(appBarLayout.mo7518s(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public float mo7559J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m9272R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public int mo7560L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo7560L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo7558H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2740e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo2743h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m9273S(view, view2);
            m9274T(view, view2);
            return false;
        }

        /* renamed from: i */
        public void mo2744i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C3403t.m14631c0(coordinatorLayout, C3369c.C3370a.f10674h.mo11665b());
                C3403t.m14631c0(coordinatorLayout, C3369c.C3370a.f10675i.mo11665b());
            }
        }

        /* renamed from: w */
        public boolean mo2758w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo7558H(coordinatorLayout.mo2716r(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f6631d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo7511n(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C2034a implements C3399p {
        C2034a() {
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            AppBarLayout.this.mo7509l(b0Var);
            return b0Var;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C2035b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C4972g f6616a;

        C2035b(C4972g gVar) {
            this.f6616a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6616a.mo14925W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C2036c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo7563a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C2037d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f6618a = 1;

        /* renamed from: b */
        Interpolator f6619b;

        public C2037d(int i, int i2) {
            super(i, i2);
        }

        public C2037d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.AppBarLayout_Layout);
            this.f6618a = obtainStyledAttributes.getInt(C5006l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C5006l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f6619b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C5006l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C2037d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2037d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2037d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo7564a() {
            return this.f6618a;
        }

        /* renamed from: b */
        public Interpolator mo7565b() {
            return this.f6619b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo7566c() {
            int i = this.f6618a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f6576w), attributeSet, i);
        this.f6578g = -1;
        this.f6579h = -1;
        this.f6580i = -1;
        this.f6582k = 0;
        Context context2 = getContext();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C2043e.m9321a(this);
            C2043e.m9323c(this, attributeSet, i, f6576w);
        }
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.AppBarLayout, i, f6576w, new int[0]);
        C3403t.m14649l0(this, h.getDrawable(C5006l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            C4972g gVar = new C4972g();
            gVar.mo14926X(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.mo14920N(context2);
            C3403t.m14649l0(this, gVar);
        }
        if (h.hasValue(C5006l.AppBarLayout_expanded)) {
            m9206o(h.getBoolean(C5006l.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && h.hasValue(C5006l.AppBarLayout_elevation)) {
            C2043e.m9322b(this, (float) h.getDimensionPixelSize(C5006l.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (h.hasValue(C5006l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(h.getBoolean(C5006l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (h.hasValue(C5006l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(h.getBoolean(C5006l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f6588q = h.getBoolean(C5006l.AppBarLayout_liftOnScroll, false);
        this.f6589r = h.getResourceId(C5006l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(h.getDrawable(C5006l.AppBarLayout_statusBarForeground));
        h.recycle();
        C3403t.m14667u0(this, new C2034a());
    }

    /* renamed from: a */
    private void m9202a() {
        WeakReference<View> weakReference = this.f6590s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6590s = null;
    }

    /* renamed from: b */
    private View m9203b(View view) {
        int i;
        if (this.f6590s == null && (i = this.f6589r) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f6589r);
            }
            if (findViewById != null) {
                this.f6590s = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f6590s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m9204g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C2037d) getChildAt(i).getLayoutParams()).mo7566c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m9205i() {
        this.f6578g = -1;
        this.f6579h = -1;
        this.f6580i = -1;
    }

    /* renamed from: o */
    private void m9206o(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f6582k = i2 | i;
        requestLayout();
    }

    /* renamed from: p */
    private boolean m9207p(boolean z) {
        if (this.f6586o == z) {
            return false;
        }
        this.f6586o = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: r */
    private boolean m9208r() {
        return this.f6593v != null && getTopInset() > 0;
    }

    /* renamed from: t */
    private boolean m9209t() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C3403t.m14668v(childAt);
    }

    /* renamed from: u */
    private void m9210u(C4972g gVar, boolean z) {
        float dimension = getResources().getDimension(C4998d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f6591t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f6591t = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C5001g.app_bar_elevation_anim_duration));
        this.f6591t.setInterpolator(C5007a.f14947a);
        this.f6591t.addUpdateListener(new C2035b(gVar));
        this.f6591t.start();
    }

    /* renamed from: v */
    private void m9211v() {
        setWillNotDraw(!m9208r());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2037d generateDefaultLayoutParams() {
        return new C2037d(-1, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2037d;
    }

    /* renamed from: d */
    public C2037d generateLayoutParams(AttributeSet attributeSet) {
        return new C2037d(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m9208r()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f6577f));
            this.f6593v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6593v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2037d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2037d((ViewGroup.MarginLayoutParams) layoutParams) : new C2037d(layoutParams) : new C2037d((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7492f() {
        return this.f6581j;
    }

    public CoordinatorLayout.C0548c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int z;
        int i2 = this.f6579h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C2037d dVar = (C2037d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f6618a;
            if ((i4 & 5) == 5) {
                int i5 = dVar.topMargin + dVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    z = C3403t.m14676z(childAt);
                } else if ((i4 & 2) != 0) {
                    z = measuredHeight - C3403t.m14676z(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C3403t.m14668v(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + z;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f6579h = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f6580i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C2037d dVar = (C2037d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f6618a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C3403t.m14676z(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f6580i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6589r;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int z = C3403t.m14676z(this);
        if (z == 0) {
            int childCount = getChildCount();
            z = childCount >= 1 ? C3403t.m14676z(getChildAt(childCount - 1)) : 0;
            if (z == 0) {
                return getHeight() / 3;
            }
        }
        return (z * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f6582k;
    }

    public Drawable getStatusBarForeground() {
        return this.f6593v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C3356b0 b0Var = this.f6583l;
        if (b0Var != null) {
            return b0Var.mo11565h();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f6578g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C2037d dVar = (C2037d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f6618a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i2 == 0 && C3403t.m14668v(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C3403t.m14676z(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f6578g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo7506h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean mo7507j() {
        return this.f6588q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7508k(int i) {
        this.f6577f = i;
        if (!willNotDraw()) {
            C3403t.m14625Z(this);
        }
        List<C2036c> list = this.f6584m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2036c cVar = this.f6584m.get(i2);
                if (cVar != null) {
                    cVar.mo7563a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C3356b0 mo7509l(C3356b0 b0Var) {
        C3356b0 b0Var2 = C3403t.m14668v(this) ? b0Var : null;
        if (!C3344c.m14350a(this.f6583l, b0Var2)) {
            this.f6583l = b0Var2;
            m9211v();
            requestLayout();
        }
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7510m() {
        this.f6582k = 0;
    }

    /* renamed from: n */
    public void mo7511n(boolean z, boolean z2) {
        m9206o(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21068e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f6592u == null) {
            this.f6592u = new int[4];
        }
        int[] iArr = this.f6592u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f6586o ? C4965b.state_liftable : -C4965b.state_liftable;
        iArr[1] = (!this.f6586o || !this.f6587p) ? -C4965b.state_lifted : C4965b.state_lifted;
        iArr[2] = this.f6586o ? C4965b.state_collapsible : -C4965b.state_collapsible;
        iArr[3] = (!this.f6586o || !this.f6587p) ? -C4965b.state_collapsed : C4965b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9202a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C3403t.m14668v(this) && m9209t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C3403t.m14620U(getChildAt(childCount), topInset);
            }
        }
        m9205i();
        this.f6581j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C2037d) getChildAt(i5).getLayoutParams()).mo7565b() != null) {
                this.f6581j = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f6593v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f6585n) {
            if (!this.f6588q && !m9204g()) {
                z2 = false;
            }
            m9207p(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C3403t.m14668v(this) && m9209t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C3306a.m14255b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m9205i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo7517q(boolean z) {
        if (this.f6587p == z) {
            return false;
        }
        this.f6587p = z;
        refreshDrawableState();
        if (!this.f6588q || !(getBackground() instanceof C4972g)) {
            return true;
        }
        m9210u((C4972g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo7518s(View view) {
        View b = m9203b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4976h.m21067d(this, f);
    }

    public void setExpanded(boolean z) {
        mo7511n(z, C3403t.m14614O(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f6588q = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f6589r = i;
        m9202a();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f6593v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6593v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f6593v.setState(getDrawableState());
                }
                C0588a.m2770m(this.f6593v, C3403t.m14674y(this));
                this.f6593v.setVisible(getVisibility() == 0, false);
                this.f6593v.setCallback(this);
            }
            m9211v();
            C3403t.m14625Z(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C3133a.m13388d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2043e.m9322b(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f6593v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6593v;
    }
}
