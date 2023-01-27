package p337i.p338a.p339a;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p337i.p338a.p339a.C5608b;

@TargetApi(11)
/* renamed from: i.a.a.c */
final class C5610c extends C5608b {

    /* renamed from: a */
    WeakReference<Animator> f16182a;

    /* renamed from: i.a.a.c$a */
    class C5611a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5608b.C5609a f16183a;

        C5611a(C5610c cVar, C5608b.C5609a aVar) {
            this.f16183a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f16183a.mo562b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f16183a.mo561a();
        }

        public void onAnimationRepeat(Animator animator) {
            this.f16183a.mo563c();
        }

        public void onAnimationStart(Animator animator) {
            this.f16183a.mo564d();
        }
    }

    C5610c(Animator animator, C5602a aVar) {
        super(aVar);
        this.f16182a = new WeakReference<>(animator);
    }

    /* renamed from: a */
    public void mo16135a(C5608b.C5609a aVar) {
        Animator animator = (Animator) this.f16182a.get();
        if (animator != null) {
            if (aVar == null) {
                animator.addListener((Animator.AnimatorListener) null);
            } else {
                animator.addListener(new C5611a(this, aVar));
            }
        }
    }

    /* renamed from: b */
    public void mo16136b(int i) {
        Animator animator = (Animator) this.f16182a.get();
        if (animator != null) {
            animator.setDuration((long) i);
        }
    }

    /* renamed from: c */
    public void mo16137c(Interpolator interpolator) {
        Animator animator = (Animator) this.f16182a.get();
        if (animator != null) {
            animator.setInterpolator(interpolator);
        }
    }

    /* renamed from: d */
    public void mo16138d() {
        Animator animator = (Animator) this.f16182a.get();
        if (animator != null) {
            animator.start();
        }
    }
}
