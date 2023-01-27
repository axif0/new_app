package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0588a;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.u */
class C0478u extends C0470q {

    /* renamed from: d */
    private final SeekBar f1857d;

    /* renamed from: e */
    private Drawable f1858e;

    /* renamed from: f */
    private ColorStateList f1859f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1860g = null;

    /* renamed from: h */
    private boolean f1861h = false;

    /* renamed from: i */
    private boolean f1862i = false;

    C0478u(SeekBar seekBar) {
        super(seekBar);
        this.f1857d = seekBar;
    }

    /* renamed from: f */
    private void m2140f() {
        if (this.f1858e == null) {
            return;
        }
        if (this.f1861h || this.f1862i) {
            Drawable r = C0588a.m2775r(this.f1858e.mutate());
            this.f1858e = r;
            if (this.f1861h) {
                C0588a.m2772o(r, this.f1859f);
            }
            if (this.f1862i) {
                C0588a.m2773p(this.f1858e, this.f1860g);
            }
            if (this.f1858e.isStateful()) {
                this.f1858e.setState(this.f1857d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2320c(AttributeSet attributeSet, int i) {
        super.mo2320c(attributeSet, i);
        C0479u0 v = C0479u0.m2148v(this.f1857d.getContext(), attributeSet, C3132j.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f1857d;
        C3403t.m14639g0(seekBar, seekBar.getContext(), C3132j.AppCompatSeekBar, attributeSet, v.mo2360r(), i, 0);
        Drawable h = v.mo2350h(C3132j.AppCompatSeekBar_android_thumb);
        if (h != null) {
            this.f1857d.setThumb(h);
        }
        mo2342j(v.mo2349g(C3132j.AppCompatSeekBar_tickMark));
        if (v.mo2361s(C3132j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1860g = C0418c0.m1905e(v.mo2353k(C3132j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1860g);
            this.f1862i = true;
        }
        if (v.mo2361s(C3132j.AppCompatSeekBar_tickMarkTint)) {
            this.f1859f = v.mo2345c(C3132j.AppCompatSeekBar_tickMarkTint);
            this.f1861h = true;
        }
        v.mo2362w();
        m2140f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2339g(Canvas canvas) {
        if (this.f1858e != null) {
            int max = this.f1857d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1858e.getIntrinsicWidth();
                int intrinsicHeight = this.f1858e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1858e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1857d.getWidth() - this.f1857d.getPaddingLeft()) - this.f1857d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1857d.getPaddingLeft(), (float) (this.f1857d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1858e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2340h() {
        Drawable drawable = this.f1858e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1857d.getDrawableState())) {
            this.f1857d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2341i() {
        Drawable drawable = this.f1858e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2342j(Drawable drawable) {
        Drawable drawable2 = this.f1858e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1858e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1857d);
            C0588a.m2770m(drawable, C3403t.m14674y(this.f1857d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1857d.getDrawableState());
            }
            m2140f();
        }
        this.f1857d.invalidate();
    }
}
