package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C2174c;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p256m.C5014h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0547b {

    /* renamed from: A */
    private final CoordinatorLayout.C0548c<ExtendedFloatingActionButton> f7068A;

    /* renamed from: B */
    private boolean f7069B;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C2166d f7070w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C2166d f7071x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C2166d f7072y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C2166d f7073z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0548c<T> {

        /* renamed from: a */
        private Rect f7074a;

        /* renamed from: b */
        private C2146d f7075b;

        /* renamed from: c */
        private C2146d f7076c;

        /* renamed from: d */
        private boolean f7077d;

        /* renamed from: e */
        private boolean f7078e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7077d = false;
            this.f7078e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f7077d = obtainStyledAttributes.getBoolean(C5006l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f7078e = obtainStyledAttributes.getBoolean(C5006l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: G */
        private static boolean m9978G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0551f) {
                return ((CoordinatorLayout.C0551f) layoutParams).mo2770f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m9979J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f7077d || this.f7078e) && ((CoordinatorLayout.C0551f) extendedFloatingActionButton.getLayoutParams()).mo2769e() == view.getId();
        }

        /* renamed from: L */
        private boolean m9980L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m9979J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f7074a == null) {
                this.f7074a = new Rect();
            }
            Rect rect = this.f7074a;
            C2174c.m10197a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo8295K(extendedFloatingActionButton);
                return true;
            }
            mo8291E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m9981M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m9979J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0551f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo8295K(extendedFloatingActionButton);
                return true;
            }
            mo8291E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo8291E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m9976l(this.f7078e ? extendedFloatingActionButton.f7071x : extendedFloatingActionButton.f7072y, this.f7078e ? this.f7076c : this.f7075b);
        }

        /* renamed from: F */
        public boolean mo2737b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2737b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo2743h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m9980L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m9978G(view)) {
                return false;
            } else {
                m9981M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo2747l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> r = coordinatorLayout.mo2716r(extendedFloatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m9978G(view) && m9981M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m9980L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2683I(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void mo8295K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m9976l(this.f7078e ? extendedFloatingActionButton.f7070w : extendedFloatingActionButton.f7073z, this.f7078e ? this.f7076c : this.f7075b);
        }

        /* renamed from: g */
        public void mo2742g(CoordinatorLayout.C0551f fVar) {
            if (fVar.f2305h == 0) {
                fVar.f2305h = 80;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C2143a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7079a;

        /* renamed from: b */
        final /* synthetic */ C2166d f7080b;

        /* renamed from: c */
        final /* synthetic */ C2146d f7081c;

        C2143a(C2166d dVar, C2146d dVar2) {
            this.f7080b = dVar;
            this.f7081c = dVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7079a = true;
            this.f7080b.mo8448b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f7080b.mo8447a();
            if (!this.f7079a) {
                this.f7080b.mo8454h(this.f7081c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f7080b.onAnimationStart(animator);
            this.f7079a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C2144b extends Property<View, Float> {
        C2144b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C2145c extends Property<View, Float> {
        C2145c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class C2146d {
    }

    static {
        Class<Float> cls = Float.class;
        new C2144b(cls, "width");
        new C2145c(cls, "height");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m9976l(C2166d dVar, C2146d dVar2) {
        if (!dVar.mo8455i()) {
            if (!m9977m()) {
                dVar.mo8450d();
                dVar.mo8454h(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet f = dVar.mo8452f();
            f.addListener(new C2143a(dVar, dVar2));
            for (Animator.AnimatorListener addListener : dVar.mo8453g()) {
                f.addListener(addListener);
            }
            f.start();
        }
    }

    /* renamed from: m */
    private boolean m9977m() {
        return C3403t.m14614O(this) && !isInEditMode();
    }

    public CoordinatorLayout.C0548c<ExtendedFloatingActionButton> getBehavior() {
        return this.f7068A;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C3403t.m14603D(this), C3403t.m14602C(this)) * 2) + getIconSize();
    }

    public C5014h getExtendMotionSpec() {
        return this.f7071x.mo8451e();
    }

    public C5014h getHideMotionSpec() {
        return this.f7073z.mo8451e();
    }

    public C5014h getShowMotionSpec() {
        return this.f7072y.mo8451e();
    }

    public C5014h getShrinkMotionSpec() {
        return this.f7070w.mo8451e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7069B && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f7069B = false;
            this.f7070w.mo8450d();
        }
    }

    public void setExtendMotionSpec(C5014h hVar) {
        this.f7071x.mo8449c(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C5014h.m21214c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f7069B != z) {
            C2166d dVar = z ? this.f7071x : this.f7070w;
            if (!dVar.mo8455i()) {
                dVar.mo8450d();
            }
        }
    }

    public void setHideMotionSpec(C5014h hVar) {
        this.f7073z.mo8449c(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C5014h.m21214c(getContext(), i));
    }

    public void setShowMotionSpec(C5014h hVar) {
        this.f7072y.mo8449c(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C5014h.m21214c(getContext(), i));
    }

    public void setShrinkMotionSpec(C5014h hVar) {
        this.f7070w.mo8449c(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C5014h.m21214c(getContext(), i));
    }
}
