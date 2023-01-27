package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.h */
class C2755h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final C2792x f8800f;

    /* renamed from: g */
    final WeakReference<ImageView> f8801g;

    /* renamed from: h */
    C2752e f8802h;

    C2755h(C2792x xVar, ImageView imageView, C2752e eVar) {
        this.f8800f = xVar;
        this.f8801g = new WeakReference<>(imageView);
        this.f8802h = eVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10048a() {
        this.f8800f.mo10130a();
        this.f8802h = null;
        ImageView imageView = (ImageView) this.f8801g.get();
        if (imageView != null) {
            this.f8801g.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f8801g.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f8801g.clear();
            C2792x xVar = this.f8800f;
            xVar.mo10135h();
            xVar.mo10134g(width, height);
            xVar.mo10132e(imageView, this.f8802h);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
