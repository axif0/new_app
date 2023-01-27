package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.l */
public final class C2197l {

    /* renamed from: a */
    private final ArrayList<C2199b> f7284a = new ArrayList<>();

    /* renamed from: b */
    private C2199b f7285b = null;

    /* renamed from: c */
    ValueAnimator f7286c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f7287d = new C2198a();

    /* renamed from: com.google.android.material.internal.l$a */
    class C2198a extends AnimatorListenerAdapter {
        C2198a() {
        }

        public void onAnimationEnd(Animator animator) {
            C2197l lVar = C2197l.this;
            if (lVar.f7286c == animator) {
                lVar.f7286c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.l$b */
    static class C2199b {

        /* renamed from: a */
        final int[] f7289a;

        /* renamed from: b */
        final ValueAnimator f7290b;

        C2199b(int[] iArr, ValueAnimator valueAnimator) {
            this.f7289a = iArr;
            this.f7290b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m10272b() {
        ValueAnimator valueAnimator = this.f7286c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7286c = null;
        }
    }

    /* renamed from: e */
    private void m10273e(C2199b bVar) {
        ValueAnimator valueAnimator = bVar.f7290b;
        this.f7286c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo8593a(int[] iArr, ValueAnimator valueAnimator) {
        C2199b bVar = new C2199b(iArr, valueAnimator);
        valueAnimator.addListener(this.f7287d);
        this.f7284a.add(bVar);
    }

    /* renamed from: c */
    public void mo8594c() {
        ValueAnimator valueAnimator = this.f7286c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f7286c = null;
        }
    }

    /* renamed from: d */
    public void mo8595d(int[] iArr) {
        C2199b bVar;
        int size = this.f7284a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f7284a.get(i);
            if (StateSet.stateSetMatches(bVar.f7289a, iArr)) {
                break;
            }
            i++;
        }
        C2199b bVar2 = this.f7285b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m10272b();
            }
            this.f7285b = bVar;
            if (bVar != null) {
                m10273e(bVar);
            }
        }
    }
}
