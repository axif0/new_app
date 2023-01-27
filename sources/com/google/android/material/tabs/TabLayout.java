package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0496w0;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0608i;
import androidx.viewpager.widget.C0954a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.C2205o;
import com.google.android.material.internal.C2206p;
import com.google.android.material.theme.p040a.C2306a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p086f.p087a.C3132j;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p121l.C3346e;
import p086f.p111h.p121l.C3347f;
import p086f.p111h.p121l.C3348g;
import p086f.p111h.p122m.C3390g;
import p086f.p111h.p122m.C3401r;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5002h;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p257n.C5018a;
import p148g.p189d.p190a.p252d.p257n.C5021b;
import p148g.p189d.p190a.p252d.p269y.C5046c;

@ViewPager.C0943e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: T */
    private static final int f7405T = C5005k.Widget_Design_TabLayout;

    /* renamed from: U */
    private static final C3346e<C2256g> f7406U = new C3348g(16);

    /* renamed from: A */
    private int f7407A;

    /* renamed from: B */
    int f7408B;

    /* renamed from: C */
    int f7409C;

    /* renamed from: D */
    int f7410D;

    /* renamed from: E */
    int f7411E;

    /* renamed from: F */
    boolean f7412F;

    /* renamed from: G */
    boolean f7413G;

    /* renamed from: H */
    boolean f7414H;

    /* renamed from: I */
    private C2250c f7415I;

    /* renamed from: J */
    private final ArrayList<C2250c> f7416J;

    /* renamed from: K */
    private C2250c f7417K;

    /* renamed from: L */
    private ValueAnimator f7418L;

    /* renamed from: M */
    ViewPager f7419M;

    /* renamed from: N */
    private C0954a f7420N;

    /* renamed from: O */
    private DataSetObserver f7421O;

    /* renamed from: P */
    private C2257h f7422P;

    /* renamed from: Q */
    private C2249b f7423Q;

    /* renamed from: R */
    private boolean f7424R;

    /* renamed from: S */
    private final C3346e<C2258i> f7425S;

    /* renamed from: f */
    private final ArrayList<C2256g> f7426f;

    /* renamed from: g */
    private C2256g f7427g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final RectF f7428h;

    /* renamed from: i */
    final C2253f f7429i;

    /* renamed from: j */
    int f7430j;

    /* renamed from: k */
    int f7431k;

    /* renamed from: l */
    int f7432l;

    /* renamed from: m */
    int f7433m;

    /* renamed from: n */
    int f7434n;

    /* renamed from: o */
    ColorStateList f7435o;

    /* renamed from: p */
    ColorStateList f7436p;

    /* renamed from: q */
    ColorStateList f7437q;

    /* renamed from: r */
    Drawable f7438r;

    /* renamed from: s */
    PorterDuff.Mode f7439s;

    /* renamed from: t */
    float f7440t;

    /* renamed from: u */
    float f7441u;

    /* renamed from: v */
    final int f7442v;

    /* renamed from: w */
    int f7443w;

    /* renamed from: x */
    private final int f7444x;

    /* renamed from: y */
    private final int f7445y;

    /* renamed from: z */
    private final int f7446z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C2248a implements ValueAnimator.AnimatorUpdateListener {
        C2248a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C2249b implements ViewPager.C0947i {

        /* renamed from: a */
        private boolean f7448a;

        C2249b() {
        }

        /* renamed from: a */
        public void mo4992a(ViewPager viewPager, C0954a aVar, C0954a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f7419M == viewPager) {
                tabLayout.mo8737E(aVar2, this.f7448a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8797b(boolean z) {
            this.f7448a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C2250c<T extends C2256g> {
        /* renamed from: a */
        void mo8798a(T t);

        /* renamed from: b */
        void mo8799b(T t);

        /* renamed from: c */
        void mo8800c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C2251d extends C2250c<C2256g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C2252e extends DataSetObserver {
        C2252e() {
        }

        public void onChanged() {
            TabLayout.this.mo8793x();
        }

        public void onInvalidated() {
            TabLayout.this.mo8793x();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    class C2253f extends LinearLayout {

        /* renamed from: f */
        private int f7451f;

        /* renamed from: g */
        private final Paint f7452g;

        /* renamed from: h */
        private final GradientDrawable f7453h;

        /* renamed from: i */
        int f7454i = -1;

        /* renamed from: j */
        float f7455j;

        /* renamed from: k */
        private int f7456k = -1;

        /* renamed from: l */
        int f7457l = -1;

        /* renamed from: m */
        int f7458m = -1;

        /* renamed from: n */
        ValueAnimator f7459n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f7460o = -1;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f7461p = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class C2254a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f7463a;

            /* renamed from: b */
            final /* synthetic */ int f7464b;

            C2254a(int i, int i2) {
                this.f7463a = i;
                this.f7464b = i2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C2253f fVar = C2253f.this;
                fVar.mo8806f(C5007a.m21201b(fVar.f7460o, this.f7463a, animatedFraction), C5007a.m21201b(C2253f.this.f7461p, this.f7464b, animatedFraction));
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        class C2255b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f7466a;

            C2255b(int i) {
                this.f7466a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C2253f fVar = C2253f.this;
                fVar.f7454i = this.f7466a;
                fVar.f7455j = 0.0f;
            }

            public void onAnimationStart(Animator animator) {
                C2253f.this.f7454i = this.f7466a;
            }
        }

        C2253f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f7452g = new Paint();
            this.f7453h = new GradientDrawable();
        }

        /* renamed from: d */
        private void m10480d(C2258i iVar, RectF rectF) {
            int b = iVar.getContentWidth();
            int b2 = (int) C2206p.m10308b(getContext(), 24);
            if (b < b2) {
                b = b2;
            }
            int left = (iVar.getLeft() + iVar.getRight()) / 2;
            int i = b / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }

        /* renamed from: j */
        private void m10481j() {
            int i;
            int i2;
            View childAt = getChildAt(this.f7454i);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f7413G && (childAt instanceof C2258i)) {
                    m10480d((C2258i) childAt, tabLayout.f7428h);
                    i2 = (int) TabLayout.this.f7428h.left;
                    i = (int) TabLayout.this.f7428h.right;
                }
                if (this.f7455j > 0.0f && this.f7454i < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f7454i + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f7413G && (childAt2 instanceof C2258i)) {
                        m10480d((C2258i) childAt2, tabLayout2.f7428h);
                        left = (int) TabLayout.this.f7428h.left;
                        right = (int) TabLayout.this.f7428h.right;
                    }
                    float f = this.f7455j;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo8806f(i2, i);
        }

        /* renamed from: k */
        private void m10482k(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m10481j();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f7413G && (childAt instanceof C2258i)) {
                m10480d((C2258i) childAt, tabLayout.f7428h);
                left = (int) TabLayout.this.f7428h.left;
                right = (int) TabLayout.this.f7428h.right;
            }
            int i3 = this.f7457l;
            int i4 = this.f7458m;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.f7460o = i3;
                    this.f7461p = i4;
                }
                C2254a aVar = new C2254a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f7459n = valueAnimator;
                    valueAnimator.setInterpolator(C5007a.f14948b);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new C2255b(i));
                    valueAnimator.start();
                    return;
                }
                this.f7459n.removeAllUpdateListeners();
                this.f7459n.addUpdateListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8803c(int i, int i2) {
            ValueAnimator valueAnimator = this.f7459n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7459n.cancel();
            }
            m10482k(true, i, i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f7438r
                r1 = 0
                if (r0 == 0) goto L_0x000c
                int r0 = r0.getIntrinsicHeight()
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                int r2 = r5.f7451f
                if (r2 < 0) goto L_0x0012
                r0 = r2
            L_0x0012:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.f7410D
                if (r2 == 0) goto L_0x0031
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L_0x0023
                if (r2 == r4) goto L_0x003a
                r0 = 3
                if (r2 == r0) goto L_0x0036
                r0 = 0
                goto L_0x003a
            L_0x0023:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r1 = r1 / r4
                int r2 = r5.getHeight()
                int r2 = r2 + r0
                int r0 = r2 / 2
                goto L_0x003a
            L_0x0031:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
            L_0x0036:
                int r0 = r5.getHeight()
            L_0x003a:
                int r2 = r5.f7457l
                if (r2 < 0) goto L_0x0074
                int r3 = r5.f7458m
                if (r3 <= r2) goto L_0x0074
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r2 = r2.f7438r
                if (r2 == 0) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                android.graphics.drawable.GradientDrawable r2 = r5.f7453h
            L_0x004b:
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.C0588a.m2775r(r2)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                int r3 = r5.f7457l
                int r4 = r5.f7458m
                r2.setBounds(r3, r1, r4, r0)
                android.graphics.Paint r0 = r5.f7452g
                if (r0 == 0) goto L_0x0071
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                int r0 = r0.getColor()
                if (r1 != r3) goto L_0x006e
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.setColorFilter(r0, r1)
                goto L_0x0071
            L_0x006e:
                androidx.core.graphics.drawable.C0588a.m2771n(r2, r0)
            L_0x0071:
                r2.draw(r6)
            L_0x0074:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C2253f.draw(android.graphics.Canvas):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo8805e() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo8806f(int i, int i2) {
            if (i != this.f7457l || i2 != this.f7458m) {
                this.f7457l = i;
                this.f7458m = i2;
                C3403t.m14625Z(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo8807g(int i, float f) {
            ValueAnimator valueAnimator = this.f7459n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7459n.cancel();
            }
            this.f7454i = i;
            this.f7455j = f;
            m10481j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo8808h(int i) {
            if (this.f7452g.getColor() != i) {
                this.f7452g.setColor(i);
                C3403t.m14625Z(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo8809i(int i) {
            if (this.f7451f != i) {
                this.f7451f = i;
                C3403t.m14625Z(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f7459n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m10481j();
            } else {
                m10482k(false, this.f7454i, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f7408B == 1 || tabLayout.f7411E == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C2206p.m10308b(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f7408B = 0;
                            tabLayout2.mo8741L(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f7456k != i) {
                requestLayout();
                this.f7456k = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C2256g {

        /* renamed from: a */
        private Drawable f7468a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public CharSequence f7469b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f7470c;

        /* renamed from: d */
        private int f7471d = -1;

        /* renamed from: e */
        private View f7472e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f7473f = 1;

        /* renamed from: g */
        public TabLayout f7474g;

        /* renamed from: h */
        public C2258i f7475h;

        /* renamed from: d */
        public View mo8816d() {
            return this.f7472e;
        }

        /* renamed from: e */
        public Drawable mo8817e() {
            return this.f7468a;
        }

        /* renamed from: f */
        public int mo8818f() {
            return this.f7471d;
        }

        /* renamed from: g */
        public int mo8819g() {
            return this.f7473f;
        }

        /* renamed from: h */
        public CharSequence mo8820h() {
            return this.f7469b;
        }

        /* renamed from: i */
        public boolean mo8821i() {
            TabLayout tabLayout = this.f7474g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f7471d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo8822j() {
            this.f7474g = null;
            this.f7475h = null;
            this.f7468a = null;
            this.f7469b = null;
            this.f7470c = null;
            this.f7471d = -1;
            this.f7472e = null;
        }

        /* renamed from: k */
        public void mo8823k() {
            TabLayout tabLayout = this.f7474g;
            if (tabLayout != null) {
                tabLayout.mo8735C(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: l */
        public C2256g mo8824l(CharSequence charSequence) {
            this.f7470c = charSequence;
            mo8830r();
            return this;
        }

        /* renamed from: m */
        public C2256g mo8825m(int i) {
            mo8826n(LayoutInflater.from(this.f7475h.getContext()).inflate(i, this.f7475h, false));
            return this;
        }

        /* renamed from: n */
        public C2256g mo8826n(View view) {
            this.f7472e = view;
            mo8830r();
            return this;
        }

        /* renamed from: o */
        public C2256g mo8827o(Drawable drawable) {
            this.f7468a = drawable;
            TabLayout tabLayout = this.f7474g;
            if (tabLayout.f7408B == 1 || tabLayout.f7411E == 2) {
                this.f7474g.mo8741L(true);
            }
            mo8830r();
            if (C5021b.f14999a && this.f7475h.m10523m() && this.f7475h.f7483j.isVisible()) {
                this.f7475h.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo8828p(int i) {
            this.f7471d = i;
        }

        /* renamed from: q */
        public C2256g mo8829q(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f7470c) && !TextUtils.isEmpty(charSequence)) {
                this.f7475h.setContentDescription(charSequence);
            }
            this.f7469b = charSequence;
            mo8830r();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo8830r() {
            C2258i iVar = this.f7475h;
            if (iVar != null) {
                iVar.mo8840u();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C2257h implements ViewPager.C0948j {

        /* renamed from: a */
        private final WeakReference<TabLayout> f7476a;

        /* renamed from: b */
        private int f7477b;

        /* renamed from: c */
        private int f7478c;

        public C2257h(TabLayout tabLayout) {
            this.f7476a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo506a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f7476a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f7478c != 2 || this.f7477b == 1;
                if (!(this.f7478c == 2 && this.f7477b == 0)) {
                    z = true;
                }
                tabLayout.mo8739G(i, f, z2, z);
            }
        }

        /* renamed from: b */
        public void mo507b(int i) {
            this.f7477b = this.f7478c;
            this.f7478c = i;
        }

        /* renamed from: c */
        public void mo508c(int i) {
            TabLayout tabLayout = (TabLayout) this.f7476a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f7478c;
                tabLayout.mo8736D(tabLayout.mo8791v(i), i2 == 0 || (i2 == 2 && this.f7477b == 0));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8831d() {
            this.f7478c = 0;
            this.f7477b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C2258i extends LinearLayout {

        /* renamed from: f */
        private C2256g f7479f;

        /* renamed from: g */
        private TextView f7480g;

        /* renamed from: h */
        private ImageView f7481h;

        /* renamed from: i */
        private View f7482i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C5018a f7483j;

        /* renamed from: k */
        private View f7484k;

        /* renamed from: l */
        private TextView f7485l;

        /* renamed from: m */
        private ImageView f7486m;

        /* renamed from: n */
        private Drawable f7487n;

        /* renamed from: o */
        private int f7488o = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        class C2259a implements View.OnLayoutChangeListener {

            /* renamed from: f */
            final /* synthetic */ View f7490f;

            C2259a(View view) {
                this.f7490f = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f7490f.getVisibility() == 0) {
                    C2258i.this.m10529t(this.f7490f);
                }
            }
        }

        public C2258i(Context context) {
            super(context);
            m10530v(context);
            C3403t.m14669v0(this, TabLayout.this.f7430j, TabLayout.this.f7431k, TabLayout.this.f7432l, TabLayout.this.f7433m);
            setGravity(17);
            setOrientation(TabLayout.this.f7412F ^ true ? 1 : 0);
            setClickable(true);
            C3403t.m14671w0(this, C3401r.m14597b(getContext(), 1002));
        }

        /* renamed from: g */
        private void m10517g(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C2259a(view));
            }
        }

        private C5018a getBadge() {
            return this.f7483j;
        }

        /* access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f7480g, this.f7481h, this.f7484k};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        private C5018a getOrCreateBadge() {
            if (this.f7483j == null) {
                this.f7483j = C5018a.m21232c(getContext());
            }
            m10528s();
            C5018a aVar = this.f7483j;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private float m10518h(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: i */
        private void m10519i(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: j */
        private FrameLayout m10520j() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public void m10521k(Canvas canvas) {
            Drawable drawable = this.f7487n;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f7487n.draw(canvas);
            }
        }

        /* renamed from: l */
        private FrameLayout m10522l(View view) {
            if ((view == this.f7481h || view == this.f7480g) && C5021b.f14999a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public boolean m10523m() {
            return this.f7483j != null;
        }

        /* renamed from: n */
        private void m10524n() {
            ViewGroup viewGroup;
            if (C5021b.f14999a) {
                viewGroup = m10520j();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C5002h.design_layout_tab_icon, viewGroup, false);
            this.f7481h = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: o */
        private void m10525o() {
            ViewGroup viewGroup;
            if (C5021b.f14999a) {
                viewGroup = m10520j();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C5002h.design_layout_tab_text, viewGroup, false);
            this.f7480g = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: q */
        private void m10526q(View view) {
            if (m10523m() && view != null) {
                m10519i(false);
                C5021b.m21274a(this.f7483j, view, m10522l(view));
                this.f7482i = view;
            }
        }

        /* renamed from: r */
        private void m10527r() {
            if (m10523m()) {
                m10519i(true);
                View view = this.f7482i;
                if (view != null) {
                    C5021b.m21275b(this.f7483j, view, m10522l(view));
                    this.f7482i = null;
                }
            }
        }

        /* renamed from: s */
        private void m10528s() {
            C2256g gVar;
            View view;
            View view2;
            C2256g gVar2;
            if (m10523m()) {
                if (this.f7484k == null) {
                    if (this.f7481h != null && (gVar2 = this.f7479f) != null && gVar2.mo8817e() != null) {
                        View view3 = this.f7482i;
                        view = this.f7481h;
                        if (view3 != view) {
                            m10527r();
                            view2 = this.f7481h;
                        }
                        m10529t(view);
                        return;
                    } else if (!(this.f7480g == null || (gVar = this.f7479f) == null || gVar.mo8819g() != 1)) {
                        View view4 = this.f7482i;
                        view = this.f7480g;
                        if (view4 != view) {
                            m10527r();
                            view2 = this.f7480g;
                        }
                        m10529t(view);
                        return;
                    }
                    m10526q(view2);
                    return;
                }
                m10527r();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m10529t(View view) {
            if (m10523m() && view == this.f7482i) {
                C5021b.m21276c(this.f7483j, view, m10522l(view));
            }
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m10530v(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f7442v
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = p086f.p087a.p088k.p089a.C3133a.m13388d(r7, r0)
                r6.f7487n = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f7487n
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f7487n = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f7437q
                if (r2 == 0) goto L_0x0078
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f7437q
                android.content.res.ColorStateList r3 = p148g.p189d.p190a.p252d.p270z.C5055b.m21361a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x0063
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f7414H
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f7414H
                if (r4 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r1 = r2
            L_0x005e:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0078
            L_0x0063:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.C0588a.m2775r(r2)
                androidx.core.graphics.drawable.C0588a.m2772o(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0078:
                p086f.p111h.p122m.C3403t.m14649l0(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C2258i.m10530v(android.content.Context):void");
        }

        /* renamed from: x */
        private void m10531x(TextView textView, ImageView imageView) {
            C2256g gVar = this.f7479f;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.mo8817e() == null) ? null : C0588a.m2775r(this.f7479f.mo8817e()).mutate();
            C2256g gVar2 = this.f7479f;
            CharSequence h = gVar2 != null ? gVar2.mo8820h() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(h);
            if (textView != null) {
                if (z) {
                    textView.setText(h);
                    if (this.f7479f.f7473f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b = (!z || imageView.getVisibility() != 0) ? 0 : (int) C2206p.m10308b(getContext(), 8);
                if (TabLayout.this.f7412F) {
                    if (b != C3390g.m14554a(marginLayoutParams)) {
                        C3390g.m14556c(marginLayoutParams, b);
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b;
                    C3390g.m14556c(marginLayoutParams, 0);
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
            C2256g gVar3 = this.f7479f;
            CharSequence a = gVar3 != null ? gVar3.f7470c : null;
            if (!z) {
                charSequence = a;
            }
            C0496w0.m2250a(this, charSequence);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f7487n;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f7487n.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public C2256g getTab() {
            return this.f7479f;
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C5018a aVar = this.f7483j;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f7483j.mo15051g());
            }
            C3369c D0 = C3369c.m14440D0(accessibilityNodeInfo);
            D0.mo11626e0(C3369c.C3372c.m14527f(0, 1, this.f7479f.mo8818f(), 1, false, isSelected()));
            if (isSelected()) {
                D0.mo11623c0(false);
                D0.mo11613T(C3369c.C3370a.f10673g);
            }
            D0.mo11653t0("Tab");
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f7443w, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f7480g != null) {
                float f = TabLayout.this.f7440t;
                int i3 = this.f7488o;
                ImageView imageView = this.f7481h;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f7480g;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f7441u;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f7480g.getTextSize();
                int lineCount = this.f7480g.getLineCount();
                int d = C0608i.m2890d(this.f7480g);
                if (f != textSize || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f7411E == 1 && f > textSize && lineCount == 1 && ((layout = this.f7480g.getLayout()) == null || m10518h(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f7480g.setTextSize(0, f);
                        this.f7480g.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo8836p() {
            setTab((C2256g) null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f7479f == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f7479f.mo8823k();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f7480g;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f7481h;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f7484k;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(C2256g gVar) {
            if (gVar != this.f7479f) {
                this.f7479f = gVar;
                mo8840u();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public final void mo8840u() {
            C2256g gVar = this.f7479f;
            Drawable drawable = null;
            View d = gVar != null ? gVar.mo8816d() : null;
            if (d != null) {
                ViewParent parent = d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d);
                    }
                    addView(d);
                }
                this.f7484k = d;
                TextView textView = this.f7480g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f7481h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f7481h.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) d.findViewById(16908308);
                this.f7485l = textView2;
                if (textView2 != null) {
                    this.f7488o = C0608i.m2890d(textView2);
                }
                this.f7486m = (ImageView) d.findViewById(16908294);
            } else {
                View view = this.f7484k;
                if (view != null) {
                    removeView(view);
                    this.f7484k = null;
                }
                this.f7485l = null;
                this.f7486m = null;
            }
            if (this.f7484k == null) {
                if (this.f7481h == null) {
                    m10524n();
                }
                if (!(gVar == null || gVar.mo8817e() == null)) {
                    drawable = C0588a.m2775r(gVar.mo8817e()).mutate();
                }
                if (drawable != null) {
                    C0588a.m2772o(drawable, TabLayout.this.f7436p);
                    PorterDuff.Mode mode = TabLayout.this.f7439s;
                    if (mode != null) {
                        C0588a.m2773p(drawable, mode);
                    }
                }
                if (this.f7480g == null) {
                    m10525o();
                    this.f7488o = C0608i.m2890d(this.f7480g);
                }
                C0608i.m2903q(this.f7480g, TabLayout.this.f7434n);
                ColorStateList colorStateList = TabLayout.this.f7435o;
                if (colorStateList != null) {
                    this.f7480g.setTextColor(colorStateList);
                }
                m10531x(this.f7480g, this.f7481h);
                m10528s();
                m10517g(this.f7481h);
                m10517g(this.f7480g);
            } else if (!(this.f7485l == null && this.f7486m == null)) {
                m10531x(this.f7485l, this.f7486m);
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f7470c)) {
                setContentDescription(gVar.f7470c);
            }
            setSelected(gVar != null && gVar.mo8821i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final void mo8841w() {
            ImageView imageView;
            TextView textView;
            setOrientation(TabLayout.this.f7412F ^ true ? 1 : 0);
            if (this.f7485l == null && this.f7486m == null) {
                textView = this.f7480g;
                imageView = this.f7481h;
            } else {
                textView = this.f7485l;
                imageView = this.f7486m;
            }
            m10531x(textView, imageView);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C2260j implements C2251d {

        /* renamed from: a */
        private final ViewPager f7492a;

        public C2260j(ViewPager viewPager) {
            this.f7492a = viewPager;
        }

        /* renamed from: a */
        public void mo8798a(C2256g gVar) {
        }

        /* renamed from: b */
        public void mo8799b(C2256g gVar) {
        }

        /* renamed from: c */
        public void mo8800c(C2256g gVar) {
            this.f7492a.setCurrentItem(gVar.mo8818f());
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f7405T), attributeSet, i);
        this.f7426f = new ArrayList<>();
        this.f7428h = new RectF();
        this.f7443w = Integer.MAX_VALUE;
        this.f7416J = new ArrayList<>();
        this.f7425S = new C3347f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C2253f fVar = new C2253f(context2);
        this.f7429i = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.TabLayout, i, f7405T, C5006l.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            C4972g gVar = new C4972g();
            gVar.mo14926X(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.mo14920N(context2);
            gVar.mo14925W(C3403t.m14664t(this));
            C3403t.m14649l0(this, gVar);
        }
        this.f7429i.mo8809i(h.getDimensionPixelSize(C5006l.TabLayout_tabIndicatorHeight, -1));
        this.f7429i.mo8808h(h.getColor(C5006l.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C5046c.m21338d(context2, h, C5006l.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(h.getInt(C5006l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(h.getBoolean(C5006l.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = h.getDimensionPixelSize(C5006l.TabLayout_tabPadding, 0);
        this.f7433m = dimensionPixelSize;
        this.f7432l = dimensionPixelSize;
        this.f7431k = dimensionPixelSize;
        this.f7430j = dimensionPixelSize;
        this.f7430j = h.getDimensionPixelSize(C5006l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f7431k = h.getDimensionPixelSize(C5006l.TabLayout_tabPaddingTop, this.f7431k);
        this.f7432l = h.getDimensionPixelSize(C5006l.TabLayout_tabPaddingEnd, this.f7432l);
        this.f7433m = h.getDimensionPixelSize(C5006l.TabLayout_tabPaddingBottom, this.f7433m);
        int resourceId = h.getResourceId(C5006l.TabLayout_tabTextAppearance, C5005k.TextAppearance_Design_Tab);
        this.f7434n = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C3132j.TextAppearance);
        try {
            this.f7440t = (float) obtainStyledAttributes.getDimensionPixelSize(C3132j.TextAppearance_android_textSize, 0);
            this.f7435o = C5046c.m21335a(context2, obtainStyledAttributes, C3132j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (h.hasValue(C5006l.TabLayout_tabTextColor)) {
                this.f7435o = C5046c.m21335a(context2, h, C5006l.TabLayout_tabTextColor);
            }
            if (h.hasValue(C5006l.TabLayout_tabSelectedTextColor)) {
                this.f7435o = m10448n(this.f7435o.getDefaultColor(), h.getColor(C5006l.TabLayout_tabSelectedTextColor, 0));
            }
            this.f7436p = C5046c.m21335a(context2, h, C5006l.TabLayout_tabIconTint);
            this.f7439s = C2206p.m10311e(h.getInt(C5006l.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.f7437q = C5046c.m21335a(context2, h, C5006l.TabLayout_tabRippleColor);
            this.f7409C = h.getInt(C5006l.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f7444x = h.getDimensionPixelSize(C5006l.TabLayout_tabMinWidth, -1);
            this.f7445y = h.getDimensionPixelSize(C5006l.TabLayout_tabMaxWidth, -1);
            this.f7442v = h.getResourceId(C5006l.TabLayout_tabBackground, 0);
            this.f7407A = h.getDimensionPixelSize(C5006l.TabLayout_tabContentStart, 0);
            this.f7411E = h.getInt(C5006l.TabLayout_tabMode, 1);
            this.f7408B = h.getInt(C5006l.TabLayout_tabGravity, 0);
            this.f7412F = h.getBoolean(C5006l.TabLayout_tabInlineLabel, false);
            this.f7414H = h.getBoolean(C5006l.TabLayout_tabUnboundedRipple, false);
            h.recycle();
            Resources resources = getResources();
            this.f7441u = (float) resources.getDimensionPixelSize(C4998d.design_tab_text_size_2line);
            this.f7446z = resources.getDimensionPixelSize(C4998d.design_tab_scrollable_min_width);
            m10445k();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: B */
    private void m10435B(int i) {
        C2258i iVar = (C2258i) this.f7429i.getChildAt(i);
        this.f7429i.removeViewAt(i);
        if (iVar != null) {
            iVar.mo8836p();
            this.f7425S.mo5908a(iVar);
        }
        requestLayout();
    }

    /* renamed from: I */
    private void m10436I(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f7419M;
        if (viewPager2 != null) {
            C2257h hVar = this.f7422P;
            if (hVar != null) {
                viewPager2.mo4931J(hVar);
            }
            C2249b bVar = this.f7423Q;
            if (bVar != null) {
                this.f7419M.mo4930I(bVar);
            }
        }
        C2250c cVar = this.f7417K;
        if (cVar != null) {
            mo8734A(cVar);
            this.f7417K = null;
        }
        if (viewPager != null) {
            this.f7419M = viewPager;
            if (this.f7422P == null) {
                this.f7422P = new C2257h(this);
            }
            this.f7422P.mo8831d();
            viewPager.mo4941c(this.f7422P);
            C2260j jVar = new C2260j(viewPager);
            this.f7417K = jVar;
            mo8746b(jVar);
            C0954a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo8737E(adapter, z);
            }
            if (this.f7423Q == null) {
                this.f7423Q = new C2249b();
            }
            this.f7423Q.mo8797b(z);
            viewPager.mo4940b(this.f7423Q);
            mo8738F(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f7419M = null;
            mo8737E((C0954a) null, false);
        }
        this.f7424R = z2;
    }

    /* renamed from: J */
    private void m10437J() {
        int size = this.f7426f.size();
        for (int i = 0; i < size; i++) {
            this.f7426f.get(i).mo8830r();
        }
    }

    /* renamed from: K */
    private void m10438K(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f7411E == 1 && this.f7408B == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* renamed from: f */
    private void m10440f(C2261a aVar) {
        C2256g w = mo8792w();
        CharSequence charSequence = aVar.f7493f;
        if (charSequence != null) {
            w.mo8829q(charSequence);
        }
        Drawable drawable = aVar.f7494g;
        if (drawable != null) {
            w.mo8827o(drawable);
        }
        int i = aVar.f7495h;
        if (i != 0) {
            w.mo8825m(i);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            w.mo8824l(aVar.getContentDescription());
        }
        mo8747c(w);
    }

    /* renamed from: g */
    private void m10441g(C2256g gVar) {
        C2258i iVar = gVar.f7475h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f7429i.addView(iVar, gVar.mo8818f(), m10449o());
    }

    private int getDefaultHeight() {
        int size = this.f7426f.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C2256g gVar = this.f7426f.get(i);
                if (gVar != null && gVar.mo8817e() != null && !TextUtils.isEmpty(gVar.mo8820h())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f7412F) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f7444x;
        if (i != -1) {
            return i;
        }
        int i2 = this.f7411E;
        if (i2 == 0 || i2 == 2) {
            return this.f7446z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f7429i.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m10442h(View view) {
        if (view instanceof C2261a) {
            m10440f((C2261a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: i */
    private void m10443i(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C3403t.m14614O(this) || this.f7429i.mo8805e()) {
                mo8738F(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int l = m10446l(i, 0.0f);
            if (scrollX != l) {
                m10454u();
                this.f7418L.setIntValues(new int[]{scrollX, l});
                this.f7418L.start();
            }
            this.f7429i.mo8803c(i, this.f7409C);
        }
    }

    /* renamed from: j */
    private void m10444j(int i) {
        C2253f fVar;
        int i2;
        if (i != 0) {
            i2 = 1;
            if (i == 1) {
                fVar = this.f7429i;
                fVar.setGravity(i2);
            } else if (i != 2) {
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        fVar = this.f7429i;
        i2 = 8388611;
        fVar.setGravity(i2);
    }

    /* renamed from: k */
    private void m10445k() {
        int i = this.f7411E;
        C3403t.m14669v0(this.f7429i, (i == 0 || i == 2) ? Math.max(0, this.f7407A - this.f7430j) : 0, 0, 0, 0);
        int i2 = this.f7411E;
        if (i2 == 0) {
            m10444j(this.f7408B);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f7408B == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f7429i.setGravity(1);
        }
        mo8741L(true);
    }

    /* renamed from: l */
    private int m10446l(int i, float f) {
        int i2 = this.f7411E;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f7429i.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f7429i.getChildCount() ? this.f7429i.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C3403t.m14674y(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: m */
    private void m10447m(C2256g gVar, int i) {
        gVar.mo8828p(i);
        this.f7426f.add(i, gVar);
        int size = this.f7426f.size();
        while (true) {
            i++;
            if (i < size) {
                this.f7426f.get(i).mo8828p(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    private static ColorStateList m10448n(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: o */
    private LinearLayout.LayoutParams m10449o() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m10438K(layoutParams);
        return layoutParams;
    }

    /* renamed from: q */
    private C2258i m10450q(C2256g gVar) {
        C3346e<C2258i> eVar = this.f7425S;
        C2258i b = eVar != null ? eVar.mo5909b() : null;
        if (b == null) {
            b = new C2258i(getContext());
        }
        b.setTab(gVar);
        b.setFocusable(true);
        b.setMinimumWidth(getTabMinWidth());
        b.setContentDescription(TextUtils.isEmpty(gVar.f7470c) ? gVar.f7469b : gVar.f7470c);
        return b;
    }

    /* renamed from: r */
    private void m10451r(C2256g gVar) {
        for (int size = this.f7416J.size() - 1; size >= 0; size--) {
            this.f7416J.get(size).mo8798a(gVar);
        }
    }

    /* renamed from: s */
    private void m10452s(C2256g gVar) {
        for (int size = this.f7416J.size() - 1; size >= 0; size--) {
            this.f7416J.get(size).mo8800c(gVar);
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f7429i.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f7429i.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private void m10453t(C2256g gVar) {
        for (int size = this.f7416J.size() - 1; size >= 0; size--) {
            this.f7416J.get(size).mo8799b(gVar);
        }
    }

    /* renamed from: u */
    private void m10454u() {
        if (this.f7418L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7418L = valueAnimator;
            valueAnimator.setInterpolator(C5007a.f14948b);
            this.f7418L.setDuration((long) this.f7409C);
            this.f7418L.addUpdateListener(new C2248a());
        }
    }

    @Deprecated
    /* renamed from: A */
    public void mo8734A(C2250c cVar) {
        this.f7416J.remove(cVar);
    }

    /* renamed from: C */
    public void mo8735C(C2256g gVar) {
        mo8736D(gVar, true);
    }

    /* renamed from: D */
    public void mo8736D(C2256g gVar, boolean z) {
        C2256g gVar2 = this.f7427g;
        if (gVar2 != gVar) {
            int f = gVar != null ? gVar.mo8818f() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo8818f() == -1) && f != -1) {
                    mo8738F(f, 0.0f, true);
                } else {
                    m10443i(f);
                }
                if (f != -1) {
                    setSelectedTabView(f);
                }
            }
            this.f7427g = gVar;
            if (gVar2 != null) {
                m10453t(gVar2);
            }
            if (gVar != null) {
                m10452s(gVar);
            }
        } else if (gVar2 != null) {
            m10451r(gVar);
            m10443i(gVar.mo8818f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo8737E(C0954a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C0954a aVar2 = this.f7420N;
        if (!(aVar2 == null || (dataSetObserver = this.f7421O) == null)) {
            aVar2.mo5013r(dataSetObserver);
        }
        this.f7420N = aVar;
        if (z && aVar != null) {
            if (this.f7421O == null) {
                this.f7421O = new C2252e();
            }
            aVar.mo5009j(this.f7421O);
        }
        mo8793x();
    }

    /* renamed from: F */
    public void mo8738F(int i, float f, boolean z) {
        mo8739G(i, f, z, true);
    }

    /* renamed from: G */
    public void mo8739G(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f7429i.getChildCount()) {
            if (z2) {
                this.f7429i.mo8807g(i, f);
            }
            ValueAnimator valueAnimator = this.f7418L;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7418L.cancel();
            }
            scrollTo(m10446l(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: H */
    public void mo8740H(ViewPager viewPager, boolean z) {
        m10436I(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo8741L(boolean z) {
        for (int i = 0; i < this.f7429i.getChildCount(); i++) {
            View childAt = this.f7429i.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m10438K((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m10442h(view);
    }

    public void addView(View view, int i) {
        m10442h(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m10442h(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m10442h(view);
    }

    @Deprecated
    /* renamed from: b */
    public void mo8746b(C2250c cVar) {
        if (!this.f7416J.contains(cVar)) {
            this.f7416J.add(cVar);
        }
    }

    /* renamed from: c */
    public void mo8747c(C2256g gVar) {
        mo8749e(gVar, this.f7426f.isEmpty());
    }

    /* renamed from: d */
    public void mo8748d(C2256g gVar, int i, boolean z) {
        if (gVar.f7474g == this) {
            m10447m(gVar, i);
            m10441g(gVar);
            if (z) {
                gVar.mo8823k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: e */
    public void mo8749e(C2256g gVar, boolean z) {
        mo8748d(gVar, this.f7426f.size(), z);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C2256g gVar = this.f7427g;
        if (gVar != null) {
            return gVar.mo8818f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f7426f.size();
    }

    public int getTabGravity() {
        return this.f7408B;
    }

    public ColorStateList getTabIconTint() {
        return this.f7436p;
    }

    public int getTabIndicatorGravity() {
        return this.f7410D;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f7443w;
    }

    public int getTabMode() {
        return this.f7411E;
    }

    public ColorStateList getTabRippleColor() {
        return this.f7437q;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f7438r;
    }

    public ColorStateList getTabTextColors() {
        return this.f7435o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21068e(this);
        if (this.f7419M == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m10436I((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7424R) {
            setupWithViewPager((ViewPager) null);
            this.f7424R = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f7429i.getChildCount(); i++) {
            View childAt = this.f7429i.getChildAt(i);
            if (childAt instanceof C2258i) {
                ((C2258i) childAt).m10521k(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3369c.m14440D0(accessibilityNodeInfo).mo11625d0(C3369c.C3371b.m14526b(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C2206p.m10308b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f7445y
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C2206p.m10308b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f7443w = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f7411E
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C2256g mo8766p() {
        C2256g b = f7406U.mo5909b();
        return b == null ? new C2256g() : b;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4976h.m21067d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f7412F != z) {
            this.f7412F = z;
            for (int i = 0; i < this.f7429i.getChildCount(); i++) {
                View childAt = this.f7429i.getChildAt(i);
                if (childAt instanceof C2258i) {
                    ((C2258i) childAt).mo8841w();
                }
            }
            m10445k();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C2250c cVar) {
        C2250c cVar2 = this.f7415I;
        if (cVar2 != null) {
            mo8734A(cVar2);
        }
        this.f7415I = cVar;
        if (cVar != null) {
            mo8746b(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C2251d dVar) {
        setOnTabSelectedListener((C2250c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m10454u();
        this.f7418L.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        setSelectedTabIndicator(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f7438r != drawable) {
            this.f7438r = drawable;
            C3403t.m14625Z(this.f7429i);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f7429i.mo8808h(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f7410D != i) {
            this.f7410D = i;
            C3403t.m14625Z(this.f7429i);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f7429i.mo8809i(i);
    }

    public void setTabGravity(int i) {
        if (this.f7408B != i) {
            this.f7408B = i;
            m10445k();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f7436p != colorStateList) {
            this.f7436p = colorStateList;
            m10437J();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C3133a.m13387c(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f7413G = z;
        C3403t.m14625Z(this.f7429i);
    }

    public void setTabMode(int i) {
        if (i != this.f7411E) {
            this.f7411E = i;
            m10445k();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f7437q != colorStateList) {
            this.f7437q = colorStateList;
            for (int i = 0; i < this.f7429i.getChildCount(); i++) {
                View childAt = this.f7429i.getChildAt(i);
                if (childAt instanceof C2258i) {
                    ((C2258i) childAt).m10530v(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C3133a.m13387c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f7435o != colorStateList) {
            this.f7435o = colorStateList;
            m10437J();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C0954a aVar) {
        mo8737E(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f7414H != z) {
            this.f7414H = z;
            for (int i = 0; i < this.f7429i.getChildCount(); i++) {
                View childAt = this.f7429i.getChildAt(i);
                if (childAt instanceof C2258i) {
                    ((C2258i) childAt).m10530v(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo8740H(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: v */
    public C2256g mo8791v(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f7426f.get(i);
    }

    /* renamed from: w */
    public C2256g mo8792w() {
        C2256g p = mo8766p();
        p.f7474g = this;
        p.f7475h = m10450q(p);
        return p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo8793x() {
        int currentItem;
        mo8795z();
        C0954a aVar = this.f7420N;
        if (aVar != null) {
            int d = aVar.mo510d();
            for (int i = 0; i < d; i++) {
                C2256g w = mo8792w();
                w.mo8829q(this.f7420N.mo5007f(i));
                mo8749e(w, false);
            }
            ViewPager viewPager = this.f7419M;
            if (viewPager != null && d > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo8735C(mo8791v(currentItem));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo8794y(C2256g gVar) {
        return f7406U.mo5908a(gVar);
    }

    /* renamed from: z */
    public void mo8795z() {
        for (int childCount = this.f7429i.getChildCount() - 1; childCount >= 0; childCount--) {
            m10435B(childCount);
        }
        Iterator<C2256g> it = this.f7426f.iterator();
        while (it.hasNext()) {
            C2256g next = it.next();
            it.remove();
            next.mo8822j();
            mo8794y(next);
        }
        this.f7427g = null;
    }
}
