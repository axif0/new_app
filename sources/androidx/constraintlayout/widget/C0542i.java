package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: androidx.constraintlayout.widget.i */
public class C0542i extends View {

    /* renamed from: f */
    private int f2264f;

    /* renamed from: g */
    private View f2265g;

    /* renamed from: h */
    private int f2266h;

    /* renamed from: a */
    public void mo2670a(ConstraintLayout constraintLayout) {
        if (this.f2265g != null) {
            ConstraintLayout.C0521b bVar = (ConstraintLayout.C0521b) getLayoutParams();
            ConstraintLayout.C0521b bVar2 = (ConstraintLayout.C0521b) this.f2265g.getLayoutParams();
            bVar2.f2086m0.mo11274A0(0);
            if (bVar.f2086m0.mo11342w() != C3229e.C3231b.FIXED) {
                bVar.f2086m0.mo11276B0(bVar2.f2086m0.mo11293N());
            }
            if (bVar.f2086m0.mo11290K() != C3229e.C3231b.FIXED) {
                bVar.f2086m0.mo11310e0(bVar2.f2086m0.mo11336t());
            }
            bVar2.f2086m0.mo11274A0(8);
        }
    }

    /* renamed from: b */
    public void mo2671b(ConstraintLayout constraintLayout) {
        if (this.f2264f == -1 && !isInEditMode()) {
            setVisibility(this.f2266h);
        }
        View findViewById = constraintLayout.findViewById(this.f2264f);
        this.f2265g = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0521b) findViewById.getLayoutParams()).f2062a0 = true;
            this.f2265g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2265g;
    }

    public int getEmptyVisibility() {
        return this.f2266h;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2264f != i) {
            View view = this.f2265g;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0521b) this.f2265g.getLayoutParams()).f2062a0 = false;
                this.f2265g = null;
            }
            this.f2264f = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2266h = i;
    }
}
