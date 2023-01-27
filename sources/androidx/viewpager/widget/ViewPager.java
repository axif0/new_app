package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p126j.p127a.C3430a;

public class ViewPager extends ViewGroup {

    /* renamed from: k0 */
    static final int[] f3720k0 = {16842931};

    /* renamed from: l0 */
    private static final Comparator<C0944f> f3721l0 = new C0939a();

    /* renamed from: m0 */
    private static final Interpolator f3722m0 = new C0940b();

    /* renamed from: n0 */
    private static final C0953n f3723n0 = new C0953n();

    /* renamed from: A */
    private boolean f3724A;

    /* renamed from: B */
    private int f3725B = 1;

    /* renamed from: C */
    private boolean f3726C;

    /* renamed from: D */
    private boolean f3727D;

    /* renamed from: E */
    private int f3728E;

    /* renamed from: F */
    private int f3729F;

    /* renamed from: G */
    private int f3730G;

    /* renamed from: H */
    private float f3731H;

    /* renamed from: I */
    private float f3732I;

    /* renamed from: J */
    private float f3733J;

    /* renamed from: K */
    private float f3734K;

    /* renamed from: L */
    private int f3735L = -1;

    /* renamed from: M */
    private VelocityTracker f3736M;

    /* renamed from: N */
    private int f3737N;

    /* renamed from: O */
    private int f3738O;

    /* renamed from: P */
    private int f3739P;

    /* renamed from: Q */
    private int f3740Q;

    /* renamed from: R */
    private boolean f3741R;

    /* renamed from: S */
    private EdgeEffect f3742S;

    /* renamed from: T */
    private EdgeEffect f3743T;

    /* renamed from: U */
    private boolean f3744U = true;

    /* renamed from: V */
    private boolean f3745V;

    /* renamed from: W */
    private int f3746W;

    /* renamed from: a0 */
    private List<C0948j> f3747a0;

    /* renamed from: b0 */
    private C0948j f3748b0;

    /* renamed from: c0 */
    private C0948j f3749c0;

    /* renamed from: d0 */
    private List<C0947i> f3750d0;

    /* renamed from: e0 */
    private C0949k f3751e0;

    /* renamed from: f */
    private int f3752f;

    /* renamed from: f0 */
    private int f3753f0;

    /* renamed from: g */
    private final ArrayList<C0944f> f3754g = new ArrayList<>();

    /* renamed from: g0 */
    private int f3755g0;

    /* renamed from: h */
    private final C0944f f3756h = new C0944f();

    /* renamed from: h0 */
    private ArrayList<View> f3757h0;

    /* renamed from: i */
    private final Rect f3758i = new Rect();

    /* renamed from: i0 */
    private final Runnable f3759i0 = new C0941c();

    /* renamed from: j */
    C0954a f3760j;

    /* renamed from: j0 */
    private int f3761j0 = 0;

    /* renamed from: k */
    int f3762k;

    /* renamed from: l */
    private int f3763l = -1;

    /* renamed from: m */
    private Parcelable f3764m = null;

    /* renamed from: n */
    private ClassLoader f3765n = null;

    /* renamed from: o */
    private Scroller f3766o;

    /* renamed from: p */
    private boolean f3767p;

    /* renamed from: q */
    private C0950l f3768q;

    /* renamed from: r */
    private int f3769r;

    /* renamed from: s */
    private Drawable f3770s;

    /* renamed from: t */
    private int f3771t;

    /* renamed from: u */
    private int f3772u;

    /* renamed from: v */
    private float f3773v = -3.4028235E38f;

    /* renamed from: w */
    private float f3774w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f3775x;

    /* renamed from: y */
    private boolean f3776y;

    /* renamed from: z */
    private boolean f3777z;

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C0939a implements Comparator<C0944f> {
        C0939a() {
        }

        /* renamed from: a */
        public int compare(C0944f fVar, C0944f fVar2) {
            return fVar.f3782b - fVar2.f3782b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C0940b implements Interpolator {
        C0940b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C0941c implements Runnable {
        C0941c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo4928E();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C0942d implements C3399p {

        /* renamed from: a */
        private final Rect f3779a = new Rect();

        C0942d() {
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            C3356b0 V = C3403t.m14621V(view, b0Var);
            if (V.mo11570m()) {
                return V;
            }
            Rect rect = this.f3779a;
            rect.left = V.mo11563f();
            rect.top = V.mo11565h();
            rect.right = V.mo11564g();
            rect.bottom = V.mo11561e();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C3356b0 g = C3403t.m14638g(ViewPager.this.getChildAt(i), V);
                rect.left = Math.min(g.mo11563f(), rect.left);
                rect.top = Math.min(g.mo11565h(), rect.top);
                rect.right = Math.min(g.mo11564g(), rect.right);
                rect.bottom = Math.min(g.mo11561e(), rect.bottom);
            }
            return V.mo11571n(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C0943e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C0944f {

        /* renamed from: a */
        Object f3781a;

        /* renamed from: b */
        int f3782b;

        /* renamed from: c */
        boolean f3783c;

        /* renamed from: d */
        float f3784d;

        /* renamed from: e */
        float f3785e;

        C0944f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0945g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3786a;

        /* renamed from: b */
        public int f3787b;

        /* renamed from: c */
        float f3788c = 0.0f;

        /* renamed from: d */
        boolean f3789d;

        /* renamed from: e */
        int f3790e;

        /* renamed from: f */
        int f3791f;

        public C0945g() {
            super(-1, -1);
        }

        public C0945g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3720k0);
            this.f3787b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    class C0946h extends C3350a {
        C0946h() {
        }

        /* renamed from: n */
        private boolean m5338n() {
            C0954a aVar = ViewPager.this.f3760j;
            return aVar != null && aVar.mo510d() > 1;
        }

        /* renamed from: f */
        public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
            C0954a aVar;
            super.mo2996f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m5338n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f3760j) != null) {
                accessibilityEvent.setItemCount(aVar.mo510d());
                accessibilityEvent.setFromIndex(ViewPager.this.f3762k);
                accessibilityEvent.setToIndex(ViewPager.this.f3762k);
            }
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11621b0(ViewPager.class.getName());
            cVar.mo11657v0(m5338n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo11618a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo11618a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo2998j(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo2998j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f3762k - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f3762k + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C0947i {
        /* renamed from: a */
        void mo4992a(ViewPager viewPager, C0954a aVar, C0954a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C0948j {
        /* renamed from: a */
        void mo506a(int i, float f, int i2);

        /* renamed from: b */
        void mo507b(int i);

        /* renamed from: c */
        void mo508c(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface C0949k {
        /* renamed from: a */
        void mo4993a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    private class C0950l extends DataSetObserver {
        C0950l() {
        }

        public void onChanged() {
            ViewPager.this.mo4959h();
        }

        public void onInvalidated() {
            ViewPager.this.mo4959h();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C0951m extends C3430a {
        public static final Parcelable.Creator<C0951m> CREATOR = new C0952a();

        /* renamed from: h */
        int f3794h;

        /* renamed from: i */
        Parcelable f3795i;

        /* renamed from: j */
        ClassLoader f3796j;

        /* renamed from: androidx.viewpager.widget.ViewPager$m$a */
        static class C0952a implements Parcelable.ClassLoaderCreator<C0951m> {
            C0952a() {
            }

            /* renamed from: a */
            public C0951m createFromParcel(Parcel parcel) {
                return new C0951m(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0951m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0951m(parcel, classLoader);
            }

            /* renamed from: c */
            public C0951m[] newArray(int i) {
                return new C0951m[i];
            }
        }

        C0951m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? C0951m.class.getClassLoader() : classLoader;
            this.f3794h = parcel.readInt();
            this.f3795i = parcel.readParcelable(classLoader);
            this.f3796j = classLoader;
        }

        public C0951m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3794h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3794h);
            parcel.writeParcelable(this.f3795i, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    static class C0953n implements Comparator<View> {
        C0953n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0945g gVar = (C0945g) view.getLayoutParams();
            C0945g gVar2 = (C0945g) view2.getLayoutParams();
            boolean z = gVar.f3786a;
            return z != gVar2.f3786a ? z ? 1 : -1 : gVar.f3790e - gVar2.f3790e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4985v();
    }

    /* renamed from: C */
    private boolean m5292C(int i) {
        if (this.f3754g.size() != 0) {
            C0944f t = m5309t();
            int clientWidth = getClientWidth();
            int i2 = this.f3769r;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = t.f3782b;
            float f2 = ((((float) i) / f) - t.f3785e) / (t.f3784d + (((float) i2) / f));
            this.f3745V = false;
            mo4987y(i4, f2, (int) (((float) i3) * f2));
            if (this.f3745V) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f3744U) {
            return false;
        } else {
            this.f3745V = false;
            mo4987y(0, 0.0f, 0);
            if (this.f3745V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: D */
    private boolean m5293D(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f3731H - f;
        this.f3731H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f3773v * clientWidth;
        float f4 = this.f3774w * clientWidth;
        boolean z3 = false;
        C0944f fVar = this.f3754g.get(0);
        ArrayList<C0944f> arrayList = this.f3754g;
        C0944f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f3782b != 0) {
            f3 = fVar.f3785e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f3782b != this.f3760j.mo510d() - 1) {
            f4 = fVar2.f3785e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f3742S.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f3743T.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f3731H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m5292C(i);
        return z3;
    }

    /* renamed from: G */
    private void m5294G(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f3754g.isEmpty()) {
            C0944f u = mo4984u(this.f3762k);
            min = (int) ((u != null ? Math.min(u.f3785e, this.f3774w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m5301g(false);
            } else {
                return;
            }
        } else if (!this.f3766o.isFinished()) {
            this.f3766o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: H */
    private void m5295H() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0945g) getChildAt(i).getLayoutParams()).f3786a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: K */
    private void m5296K(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: L */
    private boolean m5297L() {
        this.f3735L = -1;
        m5307o();
        this.f3742S.onRelease();
        this.f3743T.onRelease();
        return this.f3742S.isFinished() || this.f3743T.isFinished();
    }

    /* renamed from: M */
    private void m5298M(int i, boolean z, int i2, boolean z2) {
        C0944f u = mo4984u(i);
        int clientWidth = u != null ? (int) (((float) getClientWidth()) * Math.max(this.f3773v, Math.min(u.f3785e, this.f3774w))) : 0;
        if (z) {
            mo4935Q(clientWidth, 0, i2);
            if (z2) {
                m5304k(i);
                return;
            }
            return;
        }
        if (z2) {
            m5304k(i);
        }
        m5301g(false);
        scrollTo(clientWidth, 0);
        m5292C(clientWidth);
    }

    /* renamed from: R */
    private void m5299R() {
        if (this.f3755g0 != 0) {
            ArrayList<View> arrayList = this.f3757h0;
            if (arrayList == null) {
                this.f3757h0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3757h0.add(getChildAt(i));
            }
            Collections.sort(this.f3757h0, f3723n0);
        }
    }

    /* renamed from: e */
    private void m5300e(C0944f fVar, int i, C0944f fVar2) {
        int i2;
        int i3;
        C0944f fVar3;
        C0944f fVar4;
        int d = this.f3760j.mo510d();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f3769r) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f3782b;
            int i5 = fVar.f3782b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = fVar2.f3785e + fVar2.f3784d + f;
                while (true) {
                    i4++;
                    if (i4 > fVar.f3782b || i6 >= this.f3754g.size()) {
                        break;
                    }
                    while (true) {
                        fVar4 = this.f3754g.get(i6);
                        if (i4 > fVar4.f3782b && i6 < this.f3754g.size() - 1) {
                            i6++;
                        }
                    }
                    while (i4 < fVar4.f3782b) {
                        f2 += this.f3760j.mo5008g(i4) + f;
                        i4++;
                    }
                    fVar4.f3785e = f2;
                    f2 += fVar4.f3784d + f;
                }
            } else if (i4 > i5) {
                int size = this.f3754g.size() - 1;
                float f3 = fVar2.f3785e;
                while (true) {
                    int i7 = i4 - 1;
                    if (i7 < fVar.f3782b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f3754g.get(size);
                        if (i7 < fVar3.f3782b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > fVar3.f3782b) {
                        f3 -= this.f3760j.mo5008g(i4) + f;
                        i7 = i4 - 1;
                    }
                    f3 -= fVar3.f3784d + f;
                    fVar3.f3785e = f3;
                }
            }
        }
        int size2 = this.f3754g.size();
        float f4 = fVar.f3785e;
        int i8 = fVar.f3782b;
        int i9 = i8 - 1;
        this.f3773v = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = d - 1;
        this.f3774w = fVar.f3782b == i10 ? (fVar.f3785e + fVar.f3784d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0944f fVar5 = this.f3754g.get(i11);
            while (true) {
                i3 = fVar5.f3782b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f3760j.mo5008g(i9) + f;
                i9--;
            }
            f4 -= fVar5.f3784d + f;
            fVar5.f3785e = f4;
            if (i3 == 0) {
                this.f3773v = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f3785e + fVar.f3784d + f;
        int i12 = fVar.f3782b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0944f fVar6 = this.f3754g.get(i13);
            while (true) {
                i2 = fVar6.f3782b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f3760j.mo5008g(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f3774w = (fVar6.f3784d + f5) - 1.0f;
            }
            fVar6.f3785e = f5;
            f5 += fVar6.f3784d + f;
            i13++;
            i12++;
        }
    }

    /* renamed from: g */
    private void m5301g(boolean z) {
        boolean z2 = this.f3761j0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3766o.isFinished()) {
                this.f3766o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3766o.getCurrX();
                int currY = this.f3766o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m5292C(currX);
                    }
                }
            }
        }
        this.f3724A = false;
        for (int i = 0; i < this.f3754g.size(); i++) {
            C0944f fVar = this.f3754g.get(i);
            if (fVar.f3783c) {
                fVar.f3783c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C3403t.m14627a0(this, this.f3759i0);
        } else {
            this.f3759i0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private int m5302i(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f3739P || Math.abs(i2) <= this.f3737N) {
            i += (int) (f + (i >= this.f3762k ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f3754g.size() <= 0) {
            return i;
        }
        ArrayList<C0944f> arrayList = this.f3754g;
        return Math.max(this.f3754g.get(0).f3782b, Math.min(i, arrayList.get(arrayList.size() - 1).f3782b));
    }

    /* renamed from: j */
    private void m5303j(int i, float f, int i2) {
        C0948j jVar = this.f3748b0;
        if (jVar != null) {
            jVar.mo506a(i, f, i2);
        }
        List<C0948j> list = this.f3747a0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0948j jVar2 = this.f3747a0.get(i3);
                if (jVar2 != null) {
                    jVar2.mo506a(i, f, i2);
                }
            }
        }
        C0948j jVar3 = this.f3749c0;
        if (jVar3 != null) {
            jVar3.mo506a(i, f, i2);
        }
    }

    /* renamed from: k */
    private void m5304k(int i) {
        C0948j jVar = this.f3748b0;
        if (jVar != null) {
            jVar.mo508c(i);
        }
        List<C0948j> list = this.f3747a0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0948j jVar2 = this.f3747a0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo508c(i);
                }
            }
        }
        C0948j jVar3 = this.f3749c0;
        if (jVar3 != null) {
            jVar3.mo508c(i);
        }
    }

    /* renamed from: l */
    private void m5305l(int i) {
        C0948j jVar = this.f3748b0;
        if (jVar != null) {
            jVar.mo507b(i);
        }
        List<C0948j> list = this.f3747a0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0948j jVar2 = this.f3747a0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo507b(i);
                }
            }
        }
        C0948j jVar3 = this.f3749c0;
        if (jVar3 != null) {
            jVar3.mo507b(i);
        }
    }

    /* renamed from: n */
    private void m5306n(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f3753f0 : 0, (Paint) null);
        }
    }

    /* renamed from: o */
    private void m5307o() {
        this.f3726C = false;
        this.f3727D = false;
        VelocityTracker velocityTracker = this.f3736M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3736M = null;
        }
    }

    /* renamed from: q */
    private Rect m5308q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3777z != z) {
            this.f3777z = z;
        }
    }

    /* renamed from: t */
    private C0944f m5309t() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f3769r) / ((float) clientWidth) : 0.0f;
        C0944f fVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f3754g.size()) {
            C0944f fVar2 = this.f3754g.get(i3);
            if (!z && fVar2.f3782b != (i = i2 + 1)) {
                fVar2 = this.f3756h;
                fVar2.f3785e = f + f3 + f2;
                fVar2.f3782b = i;
                fVar2.f3784d = this.f3760j.mo5008g(i);
                i3--;
            }
            f = fVar2.f3785e;
            float f4 = fVar2.f3784d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i3 == this.f3754g.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f3782b;
            f3 = fVar2.f3784d;
            i3++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    /* renamed from: w */
    private static boolean m5310w(View view) {
        return view.getClass().getAnnotation(C0943e.class) != null;
    }

    /* renamed from: x */
    private boolean m5311x(float f, float f2) {
        return (f < ((float) this.f3729F) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f3729F)) && f2 < 0.0f);
    }

    /* renamed from: z */
    private void m5312z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3735L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3731H = motionEvent.getX(i);
            this.f3735L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3736M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo4926A() {
        int i = this.f3762k;
        if (i <= 0) {
            return false;
        }
        mo4932N(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo4927B() {
        C0954a aVar = this.f3760j;
        if (aVar == null || this.f3762k >= aVar.mo510d() - 1) {
            return false;
        }
        mo4932N(this.f3762k + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo4928E() {
        mo4929F(this.f3762k);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013c, code lost:
        if (r4 < r0.f3754g.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r4 < r0.f3754g.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r4 < r0.f3754g.size()) goto L_0x013e;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4929F(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3762k
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo4984u(r2)
            r0.f3762k = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f3760j
            if (r1 != 0) goto L_0x0018
            r17.m5299R()
            return
        L_0x0018:
            boolean r1 = r0.f3724A
            if (r1 == 0) goto L_0x0020
            r17.m5299R()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f3760j
            r1.mo3513q(r0)
            int r1 = r0.f3725B
            int r4 = r0.f3762k
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f3760j
            int r6 = r6.mo510d()
            int r7 = r6 + -1
            int r8 = r0.f3762k
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f3752f
            if (r6 != r7) goto L_0x01ef
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3754g
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3754g
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C0944f) r8
            int r9 = r8.f3782b
            int r10 = r0.f3762k
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f3762k
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo4936a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f3754g
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C0944f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f3784d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f3762k
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00ed
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00c3
            if (r3 >= r4) goto L_0x00c3
            if (r11 != 0) goto L_0x00a8
            goto L_0x00ed
        L_0x00a8:
            int r5 = r11.f3782b
            if (r3 != r5) goto L_0x00e9
            boolean r5 = r11.f3783c
            if (r5 != 0) goto L_0x00e9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f3760j
            java.lang.Object r11 = r11.f3781a
            r5.mo509a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00c3:
            if (r11 == 0) goto L_0x00d1
            int r5 = r11.f3782b
            if (r3 != r5) goto L_0x00d1
            float r5 = r11.f3784d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00d1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo4936a(r3, r5)
            float r5 = r5.f3784d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00e7
        L_0x00de:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0944f) r5
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r11 = r5
        L_0x00e9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00ed:
            float r3 = r8.f3784d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0170
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0106
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0944f) r5
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r12 > 0) goto L_0x010b
            r10 = 0
            goto L_0x0113
        L_0x010b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0113:
            int r11 = r0.f3762k
        L_0x0115:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0170
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0149
            if (r11 <= r1) goto L_0x0149
            if (r5 != 0) goto L_0x0122
            goto L_0x0170
        L_0x0122:
            int r12 = r5.f3782b
            if (r11 != r12) goto L_0x016f
            boolean r12 = r5.f3783c
            if (r12 != 0) goto L_0x016f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f3754g
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f3760j
            java.lang.Object r5 = r5.f3781a
            r12.mo509a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
        L_0x013e:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0944f) r5
            goto L_0x016f
        L_0x0147:
            r5 = 0
            goto L_0x016f
        L_0x0149:
            if (r5 == 0) goto L_0x015d
            int r12 = r5.f3782b
            if (r11 != r12) goto L_0x015d
            float r5 = r5.f3784d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x015d:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo4936a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3784d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3754g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x016f:
            goto L_0x0115
        L_0x0170:
            r0.m5300e(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f3760j
            int r2 = r0.f3762k
            java.lang.Object r3 = r8.f3781a
            r1.mo3512n(r0, r2, r3)
        L_0x017c:
            androidx.viewpager.widget.a r1 = r0.f3760j
            r1.mo3509c(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0186:
            if (r2 >= r1) goto L_0x01af
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.C0945g) r4
            r4.f3791f = r2
            boolean r5 = r4.f3786a
            if (r5 != 0) goto L_0x01ac
            float r5 = r4.f3788c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ac
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo4975s(r3)
            if (r3 == 0) goto L_0x01ac
            float r5 = r3.f3784d
            r4.f3788c = r5
            int r3 = r3.f3782b
            r4.f3790e = r3
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0186
        L_0x01af:
            r17.m5299R()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01ee
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c3
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo4973r(r1)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 == 0) goto L_0x01cc
            int r1 = r3.f3782b
            int r2 = r0.f3762k
            if (r1 == r2) goto L_0x01ee
        L_0x01cc:
            r5 = 0
        L_0x01cd:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01ee
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo4975s(r1)
            if (r2 == 0) goto L_0x01eb
            int r2 = r2.f3782b
            int r3 = r0.f3762k
            if (r2 != r3) goto L_0x01eb
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x01cd
        L_0x01ee:
            return
        L_0x01ef:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01fc }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01fc }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0204:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f3752f
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f3760j
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x0246
        L_0x0245:
            throw r2
        L_0x0246:
            goto L_0x0245
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo4929F(int):void");
    }

    /* renamed from: I */
    public void mo4930I(C0947i iVar) {
        List<C0947i> list = this.f3750d0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: J */
    public void mo4931J(C0948j jVar) {
        List<C0948j> list = this.f3747a0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* renamed from: N */
    public void mo4932N(int i, boolean z) {
        this.f3724A = false;
        mo4933O(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4933O(int i, boolean z, boolean z2) {
        mo4934P(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo4934P(int i, boolean z, boolean z2, int i2) {
        C0954a aVar = this.f3760j;
        boolean z3 = false;
        if (aVar == null || aVar.mo510d() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3762k != i || this.f3754g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3760j.mo510d()) {
                i = this.f3760j.mo510d() - 1;
            }
            int i3 = this.f3725B;
            int i4 = this.f3762k;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f3754g.size(); i5++) {
                    this.f3754g.get(i5).f3783c = true;
                }
            }
            if (this.f3762k != i) {
                z3 = true;
            }
            if (this.f3744U) {
                this.f3762k = i;
                if (z3) {
                    m5304k(i);
                }
                requestLayout();
                return;
            }
            mo4929F(i);
            m5298M(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo4935Q(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f3766o;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f3767p ? this.f3766o.getCurrX() : this.f3766o.getStartX();
            this.f3766o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m5301g(false);
            mo4928E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float m = f2 + (mo4960m(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f3760j.mo5008g(this.f3762k)) + ((float) this.f3769r))) + 1.0f) * 100.0f), 600);
        this.f3767p = false;
        this.f3766o.startScroll(i5, scrollY, i6, i7, min);
        C3403t.m14625Z(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0944f mo4936a(int i, int i2) {
        C0944f fVar = new C0944f();
        fVar.f3782b = i;
        fVar.f3781a = this.f3760j.mo511h(this, i);
        fVar.f3784d = this.f3760j.mo5008g(i);
        if (i2 < 0 || i2 >= this.f3754g.size()) {
            this.f3754g.add(fVar);
        } else {
            this.f3754g.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0944f s;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (s = mo4975s(childAt)) != null && s.f3782b == this.f3762k) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C0944f s;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (s = mo4975s(childAt)) != null && s.f3782b == this.f3762k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0945g gVar = (C0945g) layoutParams;
        boolean w = gVar.f3786a | m5310w(view);
        gVar.f3786a = w;
        if (!this.f3776y) {
            super.addView(view, i, layoutParams);
        } else if (gVar == null || !w) {
            gVar.f3789d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo4940b(C0947i iVar) {
        if (this.f3750d0 == null) {
            this.f3750d0 = new ArrayList();
        }
        this.f3750d0.add(iVar);
    }

    /* renamed from: c */
    public void mo4941c(C0948j jVar) {
        if (this.f3747a0 == null) {
            this.f3747a0 = new ArrayList();
        }
        this.f3747a0.add(jVar);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f3760j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f3773v)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f3774w));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0945g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f3767p = true;
        if (this.f3766o.isFinished() || !this.f3766o.computeScrollOffset()) {
            m5301g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3766o.getCurrX();
        int currY = this.f3766o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m5292C(currX)) {
                this.f3766o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C3403t.m14625Z(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4945d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f3758i
            android.graphics.Rect r1 = r6.m5308q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3758i
            android.graphics.Rect r2 = r6.m5308q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo4926A()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00c8
        L_0x009a:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f3758i
            android.graphics.Rect r1 = r6.m5308q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3758i
            android.graphics.Rect r2 = r6.m5308q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 > r2) goto L_0x0094
            boolean r0 = r6.mo4927B()
            goto L_0x0098
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.mo4927B()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.mo4926A()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo4945d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo4972p(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0944f s;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (s = mo4975s(childAt)) != null && s.f3782b == this.f3762k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        C0954a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3760j) != null && aVar.mo510d() > 1)) {
            if (!this.f3742S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f3773v * ((float) width));
                this.f3742S.setSize(height, width);
                z = false | this.f3742S.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3743T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3774w + 1.0f)) * ((float) width2));
                this.f3743T.setSize(height2, width2);
                z |= this.f3743T.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3742S.finish();
            this.f3743T.finish();
        }
        if (z) {
            C3403t.m14625Z(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3770s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo4950f(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo4950f(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0945g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0945g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0954a getAdapter() {
        return this.f3760j;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3755g0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0945g) this.f3757h0.get(i2).getLayoutParams()).f3791f;
    }

    public int getCurrentItem() {
        return this.f3762k;
    }

    public int getOffscreenPageLimit() {
        return this.f3725B;
    }

    public int getPageMargin() {
        return this.f3769r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4959h() {
        int d = this.f3760j.mo510d();
        this.f3752f = d;
        boolean z = this.f3754g.size() < (this.f3725B * 2) + 1 && this.f3754g.size() < d;
        int i = this.f3762k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f3754g.size()) {
            C0944f fVar = this.f3754g.get(i2);
            int e = this.f3760j.mo5006e(fVar.f3781a);
            if (e != -1) {
                if (e == -2) {
                    this.f3754g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f3760j.mo3513q(this);
                        z2 = true;
                    }
                    this.f3760j.mo509a(this, fVar.f3782b, fVar.f3781a);
                    int i3 = this.f3762k;
                    if (i3 == fVar.f3782b) {
                        i = Math.max(0, Math.min(i3, d - 1));
                    }
                } else {
                    int i4 = fVar.f3782b;
                    if (i4 != e) {
                        if (i4 == this.f3762k) {
                            i = e;
                        }
                        fVar.f3782b = e;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f3760j.mo3509c(this);
        }
        Collections.sort(this.f3754g, f3721l0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0945g gVar = (C0945g) getChildAt(i5).getLayoutParams();
                if (!gVar.f3786a) {
                    gVar.f3788c = 0.0f;
                }
            }
            mo4933O(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo4960m(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3744U = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3759i0);
        Scroller scroller = this.f3766o;
        if (scroller != null && !scroller.isFinished()) {
            this.f3766o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f3769r > 0 && this.f3770s != null && this.f3754g.size() > 0 && this.f3760j != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f3769r) / f3;
            int i = 0;
            C0944f fVar = this.f3754g.get(0);
            float f5 = fVar.f3785e;
            int size = this.f3754g.size();
            int i2 = fVar.f3782b;
            int i3 = this.f3754g.get(size - 1).f3782b;
            while (i2 < i3) {
                while (i2 > fVar.f3782b && i < size) {
                    i++;
                    fVar = this.f3754g.get(i);
                }
                if (i2 == fVar.f3782b) {
                    float f6 = fVar.f3785e;
                    float f7 = fVar.f3784d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float g = this.f3760j.mo5008g(i2);
                    f = (f5 + g) * f3;
                    f5 += g + f4;
                }
                if (((float) this.f3769r) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f3770s.setBounds(Math.round(f), this.f3771t, Math.round(((float) this.f3769r) + f), this.f3772u);
                    this.f3770s.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m5297L();
            return false;
        }
        if (action != 0) {
            if (this.f3726C) {
                return true;
            }
            if (this.f3727D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3733J = x;
            this.f3731H = x;
            float y = motionEvent.getY();
            this.f3734K = y;
            this.f3732I = y;
            this.f3735L = motionEvent2.getPointerId(0);
            this.f3727D = false;
            this.f3767p = true;
            this.f3766o.computeScrollOffset();
            if (this.f3761j0 != 2 || Math.abs(this.f3766o.getFinalX() - this.f3766o.getCurrX()) <= this.f3740Q) {
                m5301g(false);
                this.f3726C = false;
            } else {
                this.f3766o.abortAnimation();
                this.f3724A = false;
                mo4928E();
                this.f3726C = true;
                m5296K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3735L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f3731H;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f3734K);
                if (f != 0.0f && !m5311x(this.f3731H, f)) {
                    if (mo4950f(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f3731H = x2;
                        this.f3732I = y2;
                        this.f3727D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f3730G) && abs * 0.5f > abs2) {
                    this.f3726C = true;
                    m5296K(true);
                    setScrollState(1);
                    this.f3731H = f > 0.0f ? this.f3733J + ((float) this.f3730G) : this.f3733J - ((float) this.f3730G);
                    this.f3732I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f3730G)) {
                    this.f3727D = true;
                }
                if (this.f3726C && m5293D(x2)) {
                    C3403t.m14625Z(this);
                }
            }
        } else if (action == 6) {
            m5312z(motionEvent);
        }
        if (this.f3736M == null) {
            this.f3736M = VelocityTracker.obtain();
        }
        this.f3736M.addMovement(motionEvent2);
        return this.f3726C;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.C0945g) r12
            boolean r14 = r12.f3786a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f3787b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0945g) r9
            boolean r10 = r9.f3786a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo4975s(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f3785e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f3789d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f3789d = r14
            float r9 = r9.f3788c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f3771t = r5
            int r3 = r3 - r7
            r0.f3772u = r3
            r0.f3746W = r11
            boolean r1 = r0.f3744U
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f3762k
            r2 = 0
            r0.m5298M(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f3744U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f3728E
            int r15 = java.lang.Math.min(r15, r1)
            r13.f3729F = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.C0945g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f3786a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f3787b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f3775x = r15
            r13.f3776y = r4
            r13.mo4928E()
            r13.f3776y = r0
            int r15 = r13.getChildCount()
        L_0x00c6:
            if (r0 >= r15) goto L_0x00f0
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.C0945g) r2
            if (r2 == 0) goto L_0x00de
            boolean r4 = r2.f3786a
            if (r4 != 0) goto L_0x00ed
        L_0x00de:
            float r4 = (float) r14
            float r2 = r2.f3788c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f3775x
            r1.measure(r2, r4)
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0944f s;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (s = mo4975s(childAt)) != null && s.f3782b == this.f3762k && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0951m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0951m mVar = (C0951m) parcelable;
        super.onRestoreInstanceState(mVar.mo11760a());
        C0954a aVar = this.f3760j;
        if (aVar != null) {
            aVar.mo3510k(mVar.f3795i, mVar.f3796j);
            mo4933O(mVar.f3794h, false, true);
            return;
        }
        this.f3763l = mVar.f3794h;
        this.f3764m = mVar.f3795i;
        this.f3765n = mVar.f3796j;
    }

    public Parcelable onSaveInstanceState() {
        C0951m mVar = new C0951m(super.onSaveInstanceState());
        mVar.f3794h = this.f3762k;
        C0954a aVar = this.f3760j;
        if (aVar != null) {
            mVar.f3795i = aVar.mo3511l();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f3769r;
            m5294G(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f3741R
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            androidx.viewpager.widget.a r0 = r7.f3760j
            if (r0 == 0) goto L_0x0155
            int r0 = r0.mo510d()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f3736M
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f3736M = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f3736M
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.m5312z(r8)
            int r0 = r7.f3735L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f3731H = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f3731H = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f3726C
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f3762k
            r7.m5298M(r8, r1, r2, r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f3726C
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f3735L
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f3731H
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f3732I
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f3730G
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f3726C = r1
            r7.m5296K(r1)
            float r4 = r7.f3733J
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f3730G
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f3730G
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f3731H = r4
            r7.f3732I = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f3726C
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f3735L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.m5293D(r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f3726C
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f3736M
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f3738O
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f3735L
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f3724A = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            androidx.viewpager.widget.ViewPager$f r4 = r7.m5309t()
            int r5 = r7.f3769r
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f3782b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f3785e
            float r3 = r3 - r2
            float r2 = r4.f3784d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f3735L
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f3733J
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.m5302i(r6, r3, r0, r8)
            r7.mo4934P(r8, r1, r1, r0)
        L_0x012a:
            boolean r2 = r7.m5297L()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f3766o
            r0.abortAnimation()
            r7.f3724A = r2
            r7.mo4928E()
            float r0 = r8.getX()
            r7.f3733J = r0
            r7.f3731H = r0
            float r0 = r8.getY()
            r7.f3734K = r0
            r7.f3732I = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f3735L = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            p086f.p111h.p122m.C3403t.m14625Z(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo4972p(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo4945d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo4945d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo4927B();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo4926A();
            } else {
                i = 17;
            }
            return mo4945d(i);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0944f mo4973r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo4975s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void removeView(View view) {
        if (this.f3776y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0944f mo4975s(View view) {
        for (int i = 0; i < this.f3754g.size(); i++) {
            C0944f fVar = this.f3754g.get(i);
            if (this.f3760j.mo512i(view, fVar.f3781a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(C0954a aVar) {
        C0954a aVar2 = this.f3760j;
        if (aVar2 != null) {
            aVar2.mo5011o((DataSetObserver) null);
            this.f3760j.mo3513q(this);
            for (int i = 0; i < this.f3754g.size(); i++) {
                C0944f fVar = this.f3754g.get(i);
                this.f3760j.mo509a(this, fVar.f3782b, fVar.f3781a);
            }
            this.f3760j.mo3509c(this);
            this.f3754g.clear();
            m5295H();
            this.f3762k = 0;
            scrollTo(0, 0);
        }
        C0954a aVar3 = this.f3760j;
        this.f3760j = aVar;
        this.f3752f = 0;
        if (aVar != null) {
            if (this.f3768q == null) {
                this.f3768q = new C0950l();
            }
            this.f3760j.mo5011o(this.f3768q);
            this.f3724A = false;
            boolean z = this.f3744U;
            this.f3744U = true;
            this.f3752f = this.f3760j.mo510d();
            if (this.f3763l >= 0) {
                this.f3760j.mo3510k(this.f3764m, this.f3765n);
                mo4933O(this.f3763l, false, true);
                this.f3763l = -1;
                this.f3764m = null;
                this.f3765n = null;
            } else if (!z) {
                mo4928E();
            } else {
                requestLayout();
            }
        }
        List<C0947i> list = this.f3750d0;
        if (list != null && !list.isEmpty()) {
            int size = this.f3750d0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3750d0.get(i2).mo4992a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f3724A = false;
        mo4933O(i, !this.f3744U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f3725B) {
            this.f3725B = i;
            mo4928E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0948j jVar) {
        this.f3748b0 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f3769r;
        this.f3769r = i;
        int width = getWidth();
        m5294G(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C3267a.m14076f(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3770s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f3761j0 != i) {
            this.f3761j0 = i;
            if (this.f3751e0 != null) {
                m5306n(i != 0);
            }
            m5305l(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C0944f mo4984u(int i) {
        for (int i2 = 0; i2 < this.f3754g.size(); i2++) {
            C0944f fVar = this.f3754g.get(i2);
            if (fVar.f3782b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4985v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3766o = new Scroller(context, f3722m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3730G = viewConfiguration.getScaledPagingTouchSlop();
        this.f3737N = (int) (400.0f * f);
        this.f3738O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3742S = new EdgeEffect(context);
        this.f3743T = new EdgeEffect(context);
        this.f3739P = (int) (25.0f * f);
        this.f3740Q = (int) (2.0f * f);
        this.f3728E = (int) (f * 16.0f);
        C3403t.m14643i0(this, new C0946h());
        if (C3403t.m14670w(this) == 0) {
            C3403t.m14663s0(this, 1);
        }
        C3403t.m14667u0(this, new C0942d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3770s;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4987y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3746W
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0945g) r9
            boolean r10 = r9.f3786a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f3787b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.m5303j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f3751e0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0945g) r0
            boolean r0 = r0.f3786a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f3751e0
            r3.mo4993a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f3745V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo4987y(int, float, int):void");
    }
}
