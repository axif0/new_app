package p148g.p189d.p190a.p252d.p260q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p148g.p189d.p190a.p252d.p260q.C5028d;

/* renamed from: g.d.a.d.q.a */
public final class C5024a {

    /* renamed from: g.d.a.d.q.a$a */
    static class C5025a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5028d f15004a;

        C5025a(C5028d dVar) {
            this.f15004a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f15004a.mo15080a();
        }

        public void onAnimationStart(Animator animator) {
            this.f15004a.mo15081b();
        }
    }

    /* renamed from: a */
    public static Animator m21279a(C5028d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C5028d.C5031c.f15009a, C5028d.C5030b.f15007b, new C5028d.C5033e[]{new C5028d.C5033e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C5028d.C5033e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f15013c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m21280b(C5028d dVar) {
        return new C5025a(dVar);
    }
}
