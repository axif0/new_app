package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0677v;
import p086f.p111h.p118i.C3307a;
import p086f.p111h.p122m.C3400q;
import p086f.p131l.C3450a;
import p086f.p131l.C3451b;

/* renamed from: androidx.fragment.app.e */
class C0638e {

    /* renamed from: androidx.fragment.app.e$a */
    static class C0639a implements C3307a.C3308a {

        /* renamed from: a */
        final /* synthetic */ Fragment f2706a;

        C0639a(Fragment fragment) {
            this.f2706a = fragment;
        }

        /* renamed from: a */
        public void mo3325a() {
            if (this.f2706a.mo3231u() != null) {
                View u = this.f2706a.mo3231u();
                this.f2706a.mo3228s1((View) null);
                u.clearAnimation();
            }
            this.f2706a.mo3229t1((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    static class C0640b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2707a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2708b;

        /* renamed from: c */
        final /* synthetic */ C0677v.C0684g f2709c;

        /* renamed from: d */
        final /* synthetic */ C3307a f2710d;

        /* renamed from: androidx.fragment.app.e$b$a */
        class C0641a implements Runnable {
            C0641a() {
            }

            public void run() {
                if (C0640b.this.f2708b.mo3231u() != null) {
                    C0640b.this.f2708b.mo3228s1((View) null);
                    C0640b bVar = C0640b.this;
                    bVar.f2709c.mo3467a(bVar.f2708b, bVar.f2710d);
                }
            }
        }

        C0640b(ViewGroup viewGroup, Fragment fragment, C0677v.C0684g gVar, C3307a aVar) {
            this.f2707a = viewGroup;
            this.f2708b = fragment;
            this.f2709c = gVar;
            this.f2710d = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2707a.post(new C0641a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    static class C0642c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2712a;

        /* renamed from: b */
        final /* synthetic */ View f2713b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2714c;

        /* renamed from: d */
        final /* synthetic */ C0677v.C0684g f2715d;

        /* renamed from: e */
        final /* synthetic */ C3307a f2716e;

        C0642c(ViewGroup viewGroup, View view, Fragment fragment, C0677v.C0684g gVar, C3307a aVar) {
            this.f2712a = viewGroup;
            this.f2713b = view;
            this.f2714c = fragment;
            this.f2715d = gVar;
            this.f2716e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2712a.endViewTransition(this.f2713b);
            Animator v = this.f2714c.mo3234v();
            this.f2714c.mo3229t1((Animator) null);
            if (v != null && this.f2712a.indexOfChild(this.f2713b) < 0) {
                this.f2715d.mo3467a(this.f2714c, this.f2716e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    static class C0643d {

        /* renamed from: a */
        public final Animation f2717a;

        /* renamed from: b */
        public final Animator f2718b;

        C0643d(Animator animator) {
            this.f2717a = null;
            this.f2718b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0643d(Animation animation) {
            this.f2717a = animation;
            this.f2718b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    private static class C0644e extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f2719f;

        /* renamed from: g */
        private final View f2720g;

        /* renamed from: h */
        private boolean f2721h;

        /* renamed from: i */
        private boolean f2722i;

        /* renamed from: j */
        private boolean f2723j = true;

        C0644e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2719f = viewGroup;
            this.f2720g = view;
            addAnimation(animation);
            this.f2719f.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f2723j = true;
            if (this.f2721h) {
                return !this.f2722i;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2721h = true;
                C3400q.m14595a(this.f2719f, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2723j = true;
            if (this.f2721h) {
                return !this.f2722i;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2721h = true;
                C3400q.m14595a(this.f2719f, this);
            }
            return true;
        }

        public void run() {
            if (this.f2721h || !this.f2723j) {
                this.f2719f.endViewTransition(this.f2720g);
                this.f2722i = true;
                return;
            }
            this.f2723j = false;
            this.f2719f.post(this);
        }
    }

    /* renamed from: a */
    static void m3198a(Fragment fragment, C0643d dVar, C0677v.C0684g gVar) {
        View view = fragment.f2604L;
        ViewGroup viewGroup = fragment.f2603K;
        viewGroup.startViewTransition(view);
        C3307a aVar = new C3307a();
        aVar.mo11471c(new C0639a(fragment));
        gVar.mo3468b(fragment, aVar);
        if (dVar.f2717a != null) {
            C0644e eVar = new C0644e(dVar.f2717a, viewGroup, view);
            fragment.mo3228s1(fragment.f2604L);
            eVar.setAnimationListener(new C0640b(viewGroup, fragment, gVar, aVar));
            fragment.f2604L.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2718b;
        fragment.mo3229t1(animator);
        animator.addListener(new C0642c(viewGroup, view, fragment, gVar, aVar));
        animator.setTarget(fragment.f2604L);
        animator.start();
    }

    /* renamed from: b */
    static C0643d m3199b(Context context, C0645f fVar, Fragment fragment, boolean z) {
        int c;
        int I = fragment.mo3151I();
        int H = fragment.mo3148H();
        boolean z2 = false;
        fragment.mo3244y1(0);
        View e = fVar.mo3249e(fragment.f2594B);
        if (!(e == null || e.getTag(C3451b.visible_removing_fragment_view_tag) == null)) {
            e.setTag(C3451b.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = fragment.f2603K;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation q0 = fragment.mo3223q0(I, z, H);
        if (q0 != null) {
            return new C0643d(q0);
        }
        Animator r0 = fragment.mo3225r0(I, z, H);
        if (r0 != null) {
            return new C0643d(r0);
        }
        if (H != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(H));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, H);
                    if (loadAnimation != null) {
                        return new C0643d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, H);
                    if (loadAnimator != null) {
                        return new C0643d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, H);
                        if (loadAnimation2 != null) {
                            return new C0643d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (I != 0 && (c = m3200c(I, z)) >= 0) {
            return new C0643d(AnimationUtils.loadAnimation(context, c));
        }
        return null;
    }

    /* renamed from: c */
    private static int m3200c(int i, boolean z) {
        if (i == 4097) {
            return z ? C3450a.fragment_open_enter : C3450a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C3450a.fragment_fade_enter : C3450a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C3450a.fragment_close_enter : C3450a.fragment_close_exit;
    }
}
