package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0518g;

/* renamed from: androidx.cardview.widget.a */
class C0510a extends C0513c {

    /* renamed from: androidx.cardview.widget.a$a */
    class C0511a implements C0518g.C0519a {
        C0511a(C0510a aVar) {
        }

        /* renamed from: a */
        public void mo2520a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0510a() {
    }

    /* renamed from: g */
    public void mo2519g() {
        C0518g.f2000r = new C0511a(this);
    }
}
