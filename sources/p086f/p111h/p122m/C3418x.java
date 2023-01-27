package p086f.p111h.p122m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: f.h.m.x */
public final class C3418x {

    /* renamed from: a */
    private WeakReference<View> f10725a;

    /* renamed from: b */
    Runnable f10726b = null;

    /* renamed from: c */
    Runnable f10727c = null;

    /* renamed from: d */
    int f10728d = -1;

    /* renamed from: f.h.m.x$a */
    class C3419a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3422y f10729a;

        /* renamed from: b */
        final /* synthetic */ View f10730b;

        C3419a(C3418x xVar, C3422y yVar, View view) {
            this.f10729a = yVar;
            this.f10730b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10729a.mo1944a(this.f10730b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f10729a.mo928b(this.f10730b);
        }

        public void onAnimationStart(Animator animator) {
            this.f10729a.mo929c(this.f10730b);
        }
    }

    /* renamed from: f.h.m.x$b */
    class C3420b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C3352a0 f10731a;

        /* renamed from: b */
        final /* synthetic */ View f10732b;

        C3420b(C3418x xVar, C3352a0 a0Var, View view) {
            this.f10731a = a0Var;
            this.f10732b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10731a.mo1015a(this.f10732b);
        }
    }

    /* renamed from: f.h.m.x$c */
    static class C3421c implements C3422y {

        /* renamed from: a */
        C3418x f10733a;

        /* renamed from: b */
        boolean f10734b;

        C3421c(C3418x xVar) {
            this.f10733a = xVar;
        }

        /* renamed from: a */
        public void mo1944a(View view) {
            Object tag = view.getTag(2113929216);
            C3422y yVar = tag instanceof C3422y ? (C3422y) tag : null;
            if (yVar != null) {
                yVar.mo1944a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: f.h.m.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo928b(android.view.View r4) {
            /*
                r3 = this;
                f.h.m.x r0 = r3.f10733a
                int r0 = r0.f10728d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                f.h.m.x r0 = r3.f10733a
                r0.f10728d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f10734b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                f.h.m.x r0 = r3.f10733a
                java.lang.Runnable r1 = r0.f10727c
                if (r1 == 0) goto L_0x0024
                r0.f10727c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p086f.p111h.p122m.C3422y
                if (r1 == 0) goto L_0x0031
                r2 = r0
                f.h.m.y r2 = (p086f.p111h.p122m.C3422y) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo928b(r4)
            L_0x0036:
                r4 = 1
                r3.f10734b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p122m.C3418x.C3421c.mo928b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: f.h.m.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo929c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f10734b = r0
                f.h.m.x r0 = r3.f10733a
                int r0 = r0.f10728d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                f.h.m.x r0 = r3.f10733a
                java.lang.Runnable r2 = r0.f10726b
                if (r2 == 0) goto L_0x001a
                r0.f10726b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p086f.p111h.p122m.C3422y
                if (r2 == 0) goto L_0x0027
                r1 = r0
                f.h.m.y r1 = (p086f.p111h.p122m.C3422y) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo929c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p122m.C3418x.C3421c.mo929c(android.view.View):void");
        }
    }

    C3418x(View view) {
        this.f10725a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m14731g(View view, C3422y yVar) {
        if (yVar != null) {
            view.animate().setListener(new C3419a(this, yVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C3418x mo11730a(float f) {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo11731b() {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long mo11732c() {
        View view = (View) this.f10725a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public C3418x mo11733d(long j) {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C3418x mo11734e(Interpolator interpolator) {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C3418x mo11735f(C3422y yVar) {
        View view = (View) this.f10725a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, yVar);
                yVar = new C3421c(this);
            }
            m14731g(view, yVar);
        }
        return this;
    }

    /* renamed from: h */
    public C3418x mo11736h(long j) {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C3418x mo11737i(C3352a0 a0Var) {
        View view = (View) this.f10725a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C3420b bVar = null;
            if (a0Var != null) {
                bVar = new C3420b(this, a0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: j */
    public void mo11738j() {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C3418x mo11739k(float f) {
        View view = (View) this.f10725a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
