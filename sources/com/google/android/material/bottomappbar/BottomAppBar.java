package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0588a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C2206p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p086f.p126j.p127a.C3430a;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p256m.C5017k;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0547b {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final int f6668U;

    /* renamed from: V */
    private final C4972g f6669V;

    /* renamed from: W */
    private Animator f6670W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Animator f6671a0;

    /* renamed from: b0 */
    private int f6672b0;

    /* renamed from: c0 */
    private int f6673c0;

    /* renamed from: d0 */
    private boolean f6674d0;

    /* renamed from: e0 */
    private int f6675e0;

    /* renamed from: f0 */
    private ArrayList<C2056f> f6676f0;

    /* renamed from: g0 */
    private boolean f6677g0;

    /* renamed from: h0 */
    private Behavior f6678h0;

    /* renamed from: i0 */
    private int f6679i0;

    /* renamed from: j0 */
    private int f6680j0;

    /* renamed from: k0 */
    private int f6681k0;

    /* renamed from: l0 */
    AnimatorListenerAdapter f6682l0;

    /* renamed from: m0 */
    C5017k<FloatingActionButton> f6683m0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f6684e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f6685f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6686g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f6687h = new C2049a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C2049a implements View.OnLayoutChangeListener {
            C2049a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f6685f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo8329j(Behavior.this.f6684e);
                int height = Behavior.this.f6684e.height();
                bottomAppBar.mo7616t0(height);
                CoordinatorLayout.C0551f fVar = (CoordinatorLayout.C0551f) view.getLayoutParams();
                if (Behavior.this.f6686g == 0) {
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C4998d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (C2206p.m10310d(floatingActionButton)) {
                        fVar.leftMargin += bottomAppBar.f6668U;
                    } else {
                        fVar.rightMargin += bottomAppBar.f6668U;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: M */
        public boolean mo2747l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f6685f = new WeakReference<>(bottomAppBar);
            View b0 = bottomAppBar.m9378l0();
            if (b0 != null && !C3403t.m14614O(b0)) {
                CoordinatorLayout.C0551f fVar = (CoordinatorLayout.C0551f) b0.getLayoutParams();
                fVar.f2301d = 49;
                this.f6686g = fVar.bottomMargin;
                if (b0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) b0;
                    floatingActionButton.addOnLayoutChangeListener(this.f6687h);
                    bottomAppBar.m9371d0(floatingActionButton);
                }
                bottomAppBar.m9384s0();
            }
            coordinatorLayout.mo2683I(bottomAppBar, i);
            return super.mo2747l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo2732A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2732A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C2050a extends AnimatorListenerAdapter {
        C2050a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m9375i0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m9376j0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C2051b extends FloatingActionButton.C2148b {

        /* renamed from: a */
        final /* synthetic */ int f6690a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C2052a extends FloatingActionButton.C2148b {
            C2052a() {
            }

            /* renamed from: b */
            public void mo7623b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m9375i0();
            }
        }

        C2051b(int i) {
            this.f6690a = i;
        }

        /* renamed from: a */
        public void mo7622a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m9379n0(this.f6690a));
            floatingActionButton.mo8341s(new C2052a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C2053c extends AnimatorListenerAdapter {
        C2053c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m9375i0();
            Animator unused = BottomAppBar.this.f6671a0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m9376j0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C2054d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f6694a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f6695b;

        /* renamed from: c */
        final /* synthetic */ int f6696c;

        /* renamed from: d */
        final /* synthetic */ boolean f6697d;

        C2054d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f6695b = actionMenuView;
            this.f6696c = i;
            this.f6697d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6694a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6694a) {
                BottomAppBar.this.m9385u0(this.f6695b, this.f6696c, this.f6697d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C2055e extends AnimatorListenerAdapter {
        C2055e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f6682l0.onAnimationStart(animator);
            FloatingActionButton V = BottomAppBar.this.m9377k0();
            if (V != null) {
                V.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    interface C2056f {
        /* renamed from: a */
        void mo7629a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo7630b(BottomAppBar bottomAppBar);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    static class C2057g extends C3430a {
        public static final Parcelable.Creator<C2057g> CREATOR = new C2058a();

        /* renamed from: h */
        int f6700h;

        /* renamed from: i */
        boolean f6701i;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        static class C2058a implements Parcelable.ClassLoaderCreator<C2057g> {
            C2058a() {
            }

            /* renamed from: a */
            public C2057g createFromParcel(Parcel parcel) {
                return new C2057g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2057g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2057g(parcel, classLoader);
            }

            /* renamed from: c */
            public C2057g[] newArray(int i) {
                return new C2057g[i];
            }
        }

        public C2057g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6700h = parcel.readInt();
            this.f6701i = parcel.readInt() != 0;
        }

        public C2057g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6700h);
            parcel.writeInt(this.f6701i ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m9371d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo8309e(this.f6682l0);
        floatingActionButton.mo8310f(new C2055e());
        floatingActionButton.mo8311g(this.f6683m0);
    }

    /* renamed from: e0 */
    private void m9372e0() {
        Animator animator = this.f6671a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f6670W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: g0 */
    private void m9373g0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m9377k0(), "translationX", new float[]{m9379n0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f6679i0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m9379n0(this.f6672b0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo7638d();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f6681k0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f6680j0;
    }

    private C2059a getTopEdgeTreatment() {
        return (C2059a) this.f6669V.mo14914D().mo14966p();
    }

    /* renamed from: h0 */
    private void m9374h0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo7606m0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C2054d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m9375i0() {
        ArrayList<C2056f> arrayList;
        int i = this.f6675e0 - 1;
        this.f6675e0 = i;
        if (i == 0 && (arrayList = this.f6676f0) != null) {
            Iterator<C2056f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo7629a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m9376j0() {
        ArrayList<C2056f> arrayList;
        int i = this.f6675e0;
        this.f6675e0 = i + 1;
        if (i == 0 && (arrayList = this.f6676f0) != null) {
            Iterator<C2056f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo7630b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public FloatingActionButton m9377k0() {
        View l0 = m9378l0();
        if (l0 instanceof FloatingActionButton) {
            return (FloatingActionButton) l0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m9378l0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo2719s(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m9378l0():android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public float m9379n0(int i) {
        boolean d = C2206p.m10310d(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f6668U + (d ? this.f6681k0 : this.f6680j0));
        if (d) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: o0 */
    private boolean m9380o0() {
        FloatingActionButton k0 = m9377k0();
        return k0 != null && k0.mo8334o();
    }

    /* renamed from: p0 */
    private void m9381p0(int i, boolean z) {
        if (C3403t.m14614O(this)) {
            Animator animator = this.f6671a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m9380o0()) {
                i = 0;
                z = false;
            }
            m9374h0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f6671a0 = animatorSet;
            animatorSet.addListener(new C2053c());
            this.f6671a0.start();
        }
    }

    /* renamed from: q0 */
    private void m9382q0(int i) {
        if (this.f6672b0 != i && C3403t.m14614O(this)) {
            Animator animator = this.f6670W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f6673c0 == 1) {
                m9373g0(i, arrayList);
            } else {
                mo7598f0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f6670W = animatorSet;
            animatorSet.addListener(new C2050a());
            this.f6670W.start();
        }
    }

    /* renamed from: r0 */
    private void m9383r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m9380o0()) {
                m9385u0(actionMenuView, 0, false);
            } else {
                m9385u0(actionMenuView, this.f6672b0, this.f6677g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m9384s0() {
        getTopEdgeTreatment().mo7646p(getFabTranslationX());
        View l0 = m9378l0();
        this.f6669V.mo14927Y((!this.f6677g0 || !m9380o0()) ? 0.0f : 1.0f);
        if (l0 != null) {
            l0.setTranslationY(getFabTranslationY());
            l0.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m9385u0(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo7606m0(actionMenuView, i, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo7598f0(int i, List<Animator> list) {
        FloatingActionButton k0 = m9377k0();
        if (k0 != null && !k0.mo8333n()) {
            m9376j0();
            k0.mo8331l(new C2051b(i));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f6669V.mo14915F();
    }

    public Behavior getBehavior() {
        if (this.f6678h0 == null) {
            this.f6678h0 = new Behavior();
        }
        return this.f6678h0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo7638d();
    }

    public int getFabAlignmentMode() {
        return this.f6672b0;
    }

    public int getFabAnimationMode() {
        return this.f6673c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo7639e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo7640f();
    }

    public boolean getHideOnScroll() {
        return this.f6674d0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public int mo7606m0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean d = C2206p.m10310d(this);
        int measuredWidth = d ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0396e) && (((Toolbar.C0396e) childAt.getLayoutParams()).f883a & 8388615) == 8388611) {
                measuredWidth = d ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d ? this.f6680j0 : -this.f6681k0));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21069f(this, this.f6669V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m9372e0();
            m9384s0();
        }
        m9383r0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2057g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2057g gVar = (C2057g) parcelable;
        super.onRestoreInstanceState(gVar.mo11760a());
        this.f6672b0 = gVar.f6700h;
        this.f6677g0 = gVar.f6701i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2057g gVar = new C2057g(super.onSaveInstanceState());
        gVar.f6700h = this.f6672b0;
        gVar.f6701i = this.f6677g0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0588a.m2772o(this.f6669V, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo7642i(f);
            this.f6669V.invalidateSelf();
            m9384s0();
        }
    }

    public void setElevation(float f) {
        this.f6669V.mo14925W(f);
        getBehavior().mo7586G(this, this.f6669V.mo14913C() - this.f6669V.mo14912B());
    }

    public void setFabAlignmentMode(int i) {
        m9382q0(i);
        m9381p0(i, this.f6677g0);
        this.f6672b0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f6673c0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo7643k(f);
            this.f6669V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo7644l(f);
            this.f6669V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f6674d0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo7616t0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo7641g()) {
            return false;
        }
        getTopEdgeTreatment().mo7645n(f);
        this.f6669V.invalidateSelf();
        return true;
    }
}
