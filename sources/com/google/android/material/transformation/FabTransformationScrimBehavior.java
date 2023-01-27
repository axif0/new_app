package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p252d.p256m.C5008b;
import p148g.p189d.p190a.p252d.p256m.C5015i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C5015i f7699c = new C5015i(75, 150);

    /* renamed from: d */
    private final C5015i f7700d = new C5015i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C2314a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7701a;

        /* renamed from: b */
        final /* synthetic */ View f7702b;

        C2314a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f7701a = z;
            this.f7702b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7701a) {
                this.f7702b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f7701a) {
                this.f7702b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: K */
    private void m10784K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C5015i iVar = z ? this.f7699c : this.f7700d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo15039a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: D */
    public boolean mo2735D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2735D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo9081J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m10784K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C5008b.m21202a(animatorSet, arrayList);
        animatorSet.addListener(new C2314a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2740e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
