package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f7682b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C2308a extends AnimatorListenerAdapter {
        C2308a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f7682b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo9079H(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f7682b != null;
        if (z3) {
            this.f7682b.cancel();
        }
        AnimatorSet J = mo9081J(view, view2, z, z3);
        this.f7682b = J;
        J.addListener(new C2308a());
        this.f7682b.start();
        if (!z2) {
            this.f7682b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo9081J(View view, View view2, boolean z, boolean z2);
}
