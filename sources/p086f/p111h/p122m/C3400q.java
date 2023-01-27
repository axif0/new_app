package p086f.p111h.p122m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: f.h.m.q */
public final class C3400q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f10702f;

    /* renamed from: g */
    private ViewTreeObserver f10703g;

    /* renamed from: h */
    private final Runnable f10704h;

    private C3400q(View view, Runnable runnable) {
        this.f10702f = view;
        this.f10703g = view.getViewTreeObserver();
        this.f10704h = runnable;
    }

    /* renamed from: a */
    public static C3400q m14595a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C3400q qVar = new C3400q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(qVar);
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo11703b() {
        (this.f10703g.isAlive() ? this.f10703g : this.f10702f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f10702f.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo11703b();
        this.f10704h.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f10703g = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo11703b();
    }
}
