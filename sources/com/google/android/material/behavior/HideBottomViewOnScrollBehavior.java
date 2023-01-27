package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p148g.p189d.p190a.p252d.p256m.C5007a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0548c<V> {

    /* renamed from: a */
    private int f6646a = 0;

    /* renamed from: b */
    private int f6647b = 2;

    /* renamed from: c */
    private int f6648c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f6649d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C2044a extends AnimatorListenerAdapter {
        C2044a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f6649d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private void m9325F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f6649d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C2044a());
    }

    /* renamed from: A */
    public boolean mo2732A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void mo7586G(V v, int i) {
        this.f6648c = i;
        if (this.f6647b == 1) {
            v.setTranslationY((float) (this.f6646a + i));
        }
    }

    /* renamed from: H */
    public void mo7587H(V v) {
        if (this.f6647b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6649d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f6647b = 1;
            m9325F(v, this.f6646a + this.f6648c, 175, C5007a.f14949c);
        }
    }

    /* renamed from: I */
    public void mo7588I(V v) {
        if (this.f6647b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6649d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f6647b = 2;
            m9325F(v, 0, 225, C5007a.f14950d);
        }
    }

    /* renamed from: l */
    public boolean mo2747l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f6646a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2747l(coordinatorLayout, v, i);
    }

    /* renamed from: t */
    public void mo2755t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo7587H(v);
        } else if (i2 < 0) {
            mo7588I(v);
        }
    }
}
