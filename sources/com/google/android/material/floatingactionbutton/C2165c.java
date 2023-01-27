package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p148g.p189d.p190a.p252d.p253a0.C4964b;
import p148g.p189d.p190a.p252d.p270z.C5055b;

/* renamed from: com.google.android.material.floatingactionbutton.c */
class C2165c extends C2152b {
    C2165c(FloatingActionButton floatingActionButton, C4964b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: e0 */
    private Animator m10105e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7142y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f7142y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C2152b.f7106F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo8389A() {
        mo8415b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8391C(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f7142y.isEnabled()) {
                this.f7142y.setElevation(this.f7125h);
                if (this.f7142y.isPressed()) {
                    floatingActionButton = this.f7142y;
                    f = this.f7127j;
                } else if (this.f7142y.isFocused() || this.f7142y.isHovered()) {
                    floatingActionButton = this.f7142y;
                    f = this.f7126i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f7142y.setElevation(0.0f);
            floatingActionButton = this.f7142y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo8392D(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f7142y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C2152b.f7107G, m10105e0(f, f3));
            stateListAnimator.addState(C2152b.f7108H, m10105e0(f, f2));
            stateListAnimator.addState(C2152b.f7109I, m10105e0(f, f2));
            stateListAnimator.addState(C2152b.f7110J, m10105e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f7142y, "elevation", new float[]{f}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f7142y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f7142y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C2152b.f7106F);
            stateListAnimator.addState(C2152b.f7111K, animatorSet);
            stateListAnimator.addState(C2152b.f7112L, m10105e0(0.0f, 0.0f));
            this.f7142y.setStateListAnimator(stateListAnimator);
        }
        if (mo8410V()) {
            mo8415b0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo8397I() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo8406R(ColorStateList colorStateList) {
        Drawable drawable = this.f7120c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C5055b.m21364d(colorStateList));
        } else {
            super.mo8406R(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo8410V() {
        return this.f7143z.mo8382c() || !mo8411X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo8413Z() {
    }

    /* renamed from: m */
    public float mo8421m() {
        return this.f7142y.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8425r(Rect rect) {
        if (this.f7143z.mo8382c()) {
            super.mo8425r(rect);
            return;
        }
        int sizeDimension = !mo8411X() ? (this.f7128k - this.f7142y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo8432y() {
    }
}
