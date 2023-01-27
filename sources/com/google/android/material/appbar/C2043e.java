package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C2205o;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5001g;

/* renamed from: com.google.android.material.appbar.e */
class C2043e {

    /* renamed from: a */
    private static final int[] f6645a = {16843848};

    /* renamed from: a */
    static void m9321a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    static void m9322b(View view, float f) {
        int integer = view.getResources().getInteger(C5001g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C4965b.state_liftable, -C4965b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    static void m9323c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray h = C2205o.m10305h(context, attributeSet, f6645a, i, i2, new int[0]);
        try {
            if (h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h.getResourceId(0, 0)));
            }
        } finally {
            h.recycle();
        }
    }
}
