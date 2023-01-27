package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0518g;

/* renamed from: androidx.cardview.widget.c */
class C0513c implements C0516e {

    /* renamed from: a */
    final RectF f1986a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    class C0514a implements C0518g.C0519a {
        C0514a() {
        }

        /* renamed from: a */
        public void mo2520a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0513c.this.f1986a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0513c.this.f1986a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0513c.this.f1986a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0513c.this.f1986a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0513c.this.f1986a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0513c() {
    }

    /* renamed from: p */
    private C0518g m2363p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0518g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: q */
    private C0518g m2364q(C0515d dVar) {
        return (C0518g) dVar.mo2518g();
    }

    /* renamed from: a */
    public float mo2521a(C0515d dVar) {
        return m2364q(dVar).mo2557i();
    }

    /* renamed from: b */
    public ColorStateList mo2522b(C0515d dVar) {
        return m2364q(dVar).mo2552f();
    }

    /* renamed from: c */
    public void mo2523c(C0515d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0518g p = m2363p(context, colorStateList, f, f2, f3);
        p.mo2562m(dVar.mo2516e());
        dVar.mo2515d(p);
        mo2526f(dVar);
    }

    /* renamed from: d */
    public void mo2524d(C0515d dVar, float f) {
        m2364q(dVar).mo2566p(f);
        mo2526f(dVar);
    }

    /* renamed from: e */
    public float mo2525e(C0515d dVar) {
        return m2364q(dVar).mo2561l();
    }

    /* renamed from: f */
    public void mo2526f(C0515d dVar) {
        Rect rect = new Rect();
        m2364q(dVar).mo2556h(rect);
        dVar.mo2514c((int) Math.ceil((double) mo2529j(dVar)), (int) Math.ceil((double) mo2528i(dVar)));
        dVar.mo2512a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g */
    public void mo2519g() {
        C0518g.f2000r = new C0514a();
    }

    /* renamed from: h */
    public float mo2527h(C0515d dVar) {
        return m2364q(dVar).mo2553g();
    }

    /* renamed from: i */
    public float mo2528i(C0515d dVar) {
        return m2364q(dVar).mo2559j();
    }

    /* renamed from: j */
    public float mo2529j(C0515d dVar) {
        return m2364q(dVar).mo2560k();
    }

    /* renamed from: k */
    public void mo2530k(C0515d dVar) {
    }

    /* renamed from: l */
    public void mo2531l(C0515d dVar, float f) {
        m2364q(dVar).mo2568r(f);
    }

    /* renamed from: m */
    public void mo2532m(C0515d dVar) {
        m2364q(dVar).mo2562m(dVar.mo2516e());
        mo2526f(dVar);
    }

    /* renamed from: n */
    public void mo2533n(C0515d dVar, ColorStateList colorStateList) {
        m2364q(dVar).mo2563o(colorStateList);
    }

    /* renamed from: o */
    public void mo2534o(C0515d dVar, float f) {
        m2364q(dVar).mo2567q(f);
        mo2526f(dVar);
    }
}
