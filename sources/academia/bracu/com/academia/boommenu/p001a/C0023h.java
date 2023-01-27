package academia.bracu.com.academia.boommenu.p001a;

import academia.bracu.com.academia.boommenu.BoomMenuButton;
import academia.bracu.com.academia.boommenu.C0073q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: academia.bracu.com.academia.boommenu.a.h */
public class C0023h extends View {

    /* renamed from: f */
    private long f148f;

    /* renamed from: g */
    private long f149g;

    /* renamed from: h */
    private long f150h;

    /* renamed from: i */
    private long f151i;

    /* renamed from: j */
    private long f152j;

    /* renamed from: k */
    private long f153k;

    /* renamed from: l */
    private long f154l;

    /* renamed from: m */
    private long f155m;

    /* renamed from: n */
    private long f156n;

    /* renamed from: o */
    private long f157o;

    /* renamed from: p */
    private long f158p;

    /* renamed from: q */
    private long f159q;

    /* renamed from: r */
    private float f160r = 1.0f;

    /* renamed from: s */
    private float f161s = 1.0f;

    /* renamed from: t */
    private ArrayList<PointF> f162t;

    /* renamed from: u */
    private int f163u = -1;

    /* renamed from: v */
    private float f164v = 3.0f;

    /* renamed from: w */
    private Paint f165w;

    public C0023h(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f165w = paint;
        paint.setAntiAlias(true);
    }

    private void setHideProcess(float f) {
        long j = (long) (f * ((float) this.f159q));
        long j2 = this.f154l;
        float f2 = 1.0f;
        if (j2 < j) {
            long j3 = this.f155m;
            if (j <= j3) {
                f2 = 1.0f - (((float) (j3 - j)) / ((float) (j3 - j2)));
                this.f161s = f2;
                invalidate();
            }
        }
        if (this.f155m >= j || j > this.f156n) {
            long j4 = this.f156n;
            if (j4 < j) {
                long j5 = this.f157o;
                if (j <= j5) {
                    this.f160r = 1.0f - (((float) (j5 - j)) / ((float) (j5 - j4)));
                    invalidate();
                }
            }
            if (this.f157o <= j) {
                this.f160r = 1.0f;
            }
            invalidate();
        }
        this.f161s = f2;
        invalidate();
    }

    private void setShowProcess(float f) {
        float f2;
        long j = (long) (f * ((float) this.f153k));
        long j2 = this.f148f;
        if (j2 < j) {
            long j3 = this.f149g;
            if (j <= j3) {
                f2 = ((float) (j3 - j)) / ((float) (j3 - j2));
                this.f160r = f2;
                invalidate();
            }
        }
        f2 = 0.0f;
        if (this.f149g >= j || j > this.f150h) {
            long j4 = this.f150h;
            if (j4 < j) {
                long j5 = this.f151i;
                if (j <= j5) {
                    f2 = ((float) (j5 - j)) / ((float) (j5 - j4));
                    this.f161s = f2;
                    invalidate();
                }
            }
            if (this.f151i <= j) {
                this.f160r = 0.0f;
                this.f161s = f2;
            }
            invalidate();
        }
        this.f160r = f2;
        invalidate();
    }

    /* renamed from: a */
    public void mo171a(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public void mo172b(ArrayList<RectF> arrayList, BoomMenuButton boomMenuButton) {
        float dotRadius = boomMenuButton.getDotRadius() - (this.f164v / 4.0f);
        double dotRadius2 = (double) boomMenuButton.getDotRadius();
        double d = (double) this.f164v;
        double sqrt = Math.sqrt(3.0d);
        Double.isNaN(d);
        Double.isNaN(dotRadius2);
        float b = ((float) (dotRadius2 - ((d * sqrt) / 4.0d))) + ((float) C0073q.m291b(0.25f));
        this.f162t = new ArrayList<>();
        Iterator<RectF> it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            RectF next = it.next();
            Iterator<PointF> it2 = this.f162t.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(next.left, next.top)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                this.f162t.add(new PointF(next.left, next.top));
            }
        }
        Iterator<PointF> it3 = this.f162t.iterator();
        while (it3.hasNext()) {
            it3.next().offset(dotRadius, b);
        }
        int[] iArr = new int[3];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int i2 = i % 3;
            iArr[i2] = iArr[i2] + 1;
        }
        this.f148f = boomMenuButton.getShowDelay() * ((long) (iArr[0] - 1));
        this.f149g = ((long) iArr[0]) * boomMenuButton.getShowDelay();
        this.f150h = ((long) ((iArr[0] - 1) + iArr[1])) * boomMenuButton.getShowDelay();
        this.f151i = ((long) (iArr[0] + iArr[1])) * boomMenuButton.getShowDelay();
        long showDelay = (boomMenuButton.getShowDelay() * ((long) ((iArr[2] - 1) + iArr[1] + iArr[0]))) + boomMenuButton.getShowDuration();
        this.f152j = showDelay;
        this.f153k = showDelay;
        this.f154l = (((long) (iArr[2] - 1)) * boomMenuButton.getHideDelay()) + boomMenuButton.getHideDuration();
        this.f155m = (((long) iArr[2]) * boomMenuButton.getHideDelay()) + boomMenuButton.getHideDuration();
        this.f156n = (boomMenuButton.getHideDelay() * ((long) ((iArr[2] - 1) + iArr[1]))) + boomMenuButton.getHideDuration();
        this.f157o = (((long) (iArr[2] + iArr[1])) * boomMenuButton.getHideDelay()) + boomMenuButton.getHideDuration();
        long hideDelay = (boomMenuButton.getHideDelay() * ((long) ((iArr[2] - 1) + iArr[1] + iArr[0]))) + boomMenuButton.getHideDuration();
        this.f158p = hideDelay;
        this.f159q = hideDelay;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.drawLine(this.f162t.get(1).x, this.f162t.get(1).y, this.f162t.get(1).x + ((this.f162t.get(0).x - this.f162t.get(1).x) * this.f160r), ((this.f162t.get(0).y - this.f162t.get(1).y) * this.f160r) + this.f162t.get(1).y, this.f165w);
        this.f165w.setColor(this.f163u);
        canvas.drawLine(this.f162t.get(2).x, this.f162t.get(2).y, ((this.f162t.get(1).x - this.f162t.get(2).x) * this.f161s) + this.f162t.get(2).x, ((this.f162t.get(1).y - this.f162t.get(2).y) * this.f161s) + this.f162t.get(2).y, this.f165w);
        super.onDraw(canvas);
    }

    public void setLine1Color(int i) {
        this.f165w.setColor(i);
    }

    public void setLine2Color(int i) {
        this.f163u = i;
    }

    public void setLineWidth(float f) {
        this.f164v = f;
        this.f165w.setStrokeWidth(f);
    }
}
