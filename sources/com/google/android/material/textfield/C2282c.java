package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;

/* renamed from: com.google.android.material.textfield.c */
class C2282c extends C4972g {

    /* renamed from: D */
    private final Paint f7604D;

    /* renamed from: E */
    private final RectF f7605E;

    /* renamed from: F */
    private int f7606F;

    C2282c() {
        this((C4979k) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2282c(C4979k kVar) {
        super(kVar == null ? new C4979k() : kVar);
        this.f7604D = new Paint(1);
        m10639s0();
        this.f7605E = new RectF();
    }

    /* renamed from: m0 */
    private void m10636m0(Canvas canvas) {
        if (!m10640t0(getCallback())) {
            canvas.restoreToCount(this.f7606F);
        }
    }

    /* renamed from: n0 */
    private void m10637n0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m10640t0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m10638p0(canvas);
    }

    /* renamed from: p0 */
    private void m10638p0(Canvas canvas) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        }
        this.f7606F = i;
    }

    /* renamed from: s0 */
    private void m10639s0() {
        this.f7604D.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7604D.setColor(-1);
        this.f7604D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: t0 */
    private boolean m10640t0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        m10637n0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f7605E, this.f7604D);
        m10636m0(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public boolean mo9024l0() {
        return !this.f7605E.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo9025o0() {
        mo9026q0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo9026q0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f7605E;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f7605E.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo9027r0(RectF rectF) {
        mo9026q0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
