package com.flaviofaria.kenburnsview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class KenBurnsView extends ImageView {

    /* renamed from: f */
    private final Matrix f4806f;

    /* renamed from: g */
    private C1421e f4807g;

    /* renamed from: h */
    private C1416a f4808h;

    /* renamed from: i */
    private C1420d f4809i;

    /* renamed from: j */
    private final RectF f4810j;

    /* renamed from: k */
    private RectF f4811k;

    /* renamed from: l */
    private long f4812l;

    /* renamed from: m */
    private long f4813m;

    /* renamed from: n */
    private boolean f4814n;

    /* renamed from: o */
    private boolean f4815o;

    /* renamed from: com.flaviofaria.kenburnsview.KenBurnsView$a */
    public interface C1416a {
        /* renamed from: a */
        void mo5925a(C1420d dVar);

        /* renamed from: b */
        void mo5926b(C1420d dVar);
    }

    public KenBurnsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KenBurnsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4806f = new Matrix();
        this.f4807g = new C1419c();
        this.f4810j = new RectF();
        this.f4815o = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: a */
    private void m7018a(C1420d dVar) {
        C1416a aVar = this.f4808h;
        if (aVar != null && dVar != null) {
            aVar.mo5926b(dVar);
        }
    }

    /* renamed from: b */
    private void m7019b(C1420d dVar) {
        C1416a aVar = this.f4808h;
        if (aVar != null && dVar != null) {
            aVar.mo5925a(dVar);
        }
    }

    /* renamed from: c */
    private void m7020c() {
        m7023i();
        if (this.f4815o) {
            m7022h();
        }
    }

    /* renamed from: d */
    private boolean m7021d() {
        return !this.f4810j.isEmpty();
    }

    /* renamed from: h */
    private void m7022h() {
        if (m7021d()) {
            this.f4809i = this.f4807g.mo5927a(this.f4811k, this.f4810j);
            this.f4812l = 0;
            this.f4813m = System.currentTimeMillis();
            m7019b(this.f4809i);
        }
    }

    /* renamed from: i */
    private void m7023i() {
        if (this.f4811k == null) {
            this.f4811k = new RectF();
        }
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) {
            this.f4811k.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: j */
    private void m7024j(float f, float f2) {
        this.f4810j.set(0.0f, 0.0f, f, f2);
    }

    /* renamed from: e */
    public void mo5912e() {
        this.f4814n = true;
    }

    /* renamed from: f */
    public void mo5913f() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            m7024j((float) width, (float) height);
            m7023i();
            m7022h();
        }
    }

    /* renamed from: g */
    public void mo5914g() {
        this.f4814n = false;
        this.f4813m = System.currentTimeMillis();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (!this.f4814n && drawable != null) {
            if (this.f4811k.isEmpty()) {
                m7023i();
            } else if (m7021d()) {
                if (this.f4809i == null) {
                    m7022h();
                }
                if (this.f4809i.mo5930a() != null) {
                    long currentTimeMillis = this.f4812l + (System.currentTimeMillis() - this.f4813m);
                    this.f4812l = currentTimeMillis;
                    RectF c = this.f4809i.mo5932c(currentTimeMillis);
                    float min = Math.min(this.f4811k.width() / c.width(), this.f4811k.height() / c.height()) * Math.min(this.f4810j.width() / c.width(), this.f4810j.height() / c.height());
                    this.f4806f.reset();
                    this.f4806f.postTranslate((-this.f4811k.width()) / 2.0f, (-this.f4811k.height()) / 2.0f);
                    this.f4806f.postScale(min, min);
                    this.f4806f.postTranslate((this.f4811k.centerX() - c.left) * min, (this.f4811k.centerY() - c.top) * min);
                    setImageMatrix(this.f4806f);
                    if (this.f4812l >= this.f4809i.mo5931b()) {
                        m7018a(this.f4809i);
                        m7022h();
                    }
                } else {
                    m7018a(this.f4809i);
                }
            }
            this.f4813m = System.currentTimeMillis();
            postInvalidateDelayed(16);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo5913f();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m7020c();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m7020c();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m7020c();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m7020c();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setTransitionGenerator(C1421e eVar) {
        this.f4807g = eVar;
        m7022h();
    }

    public void setTransitionListener(C1416a aVar) {
        this.f4808h = aVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            mo5912e();
        } else {
            mo5914g();
        }
    }
}
