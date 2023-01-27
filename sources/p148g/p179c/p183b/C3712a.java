package p148g.p179c.p183b;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.text.ParseException;
import p086f.p111h.p122m.C3403t;
import p148g.p179c.p183b.p184d.C3715a;
import p148g.p179c.p183b.p184d.C3716b;
import p148g.p179c.p183b.p186f.C3720a;
import p148g.p179c.p183b.p187g.C3721a;
import p148g.p179c.p183b.p187g.C3724b;
import p148g.p179c.p183b.p188h.C3725a;

/* renamed from: g.c.b.a */
public class C3712a extends View {

    /* renamed from: f */
    private int f11318f;

    /* renamed from: g */
    private int f11319g;

    /* renamed from: h */
    private int f11320h;

    /* renamed from: i */
    private int f11321i;

    /* renamed from: j */
    private int f11322j;

    /* renamed from: k */
    private int f11323k;

    /* renamed from: l */
    private int f11324l;

    /* renamed from: m */
    private C3715a f11325m;

    /* renamed from: n */
    private String f11326n;

    /* renamed from: o */
    private C3714c f11327o;

    /* renamed from: p */
    private Paint f11328p;

    /* renamed from: q */
    private Paint f11329q;

    /* renamed from: r */
    private int f11330r;

    /* renamed from: s */
    private long f11331s;

    /* renamed from: t */
    private int f11332t;

    /* renamed from: u */
    private int f11333u;

    /* renamed from: v */
    private Interpolator f11334v;

    /* renamed from: w */
    private C3720a f11335w;

    C3712a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, int i6, int i7, C3715a aVar, String str) {
        super(viewGroup.getContext());
        this.f11318f = i;
        this.f11319g = i2;
        this.f11320h = i3;
        this.f11323k = i6;
        this.f11324l = i7;
        this.f11325m = aVar;
        this.f11321i = i4;
        this.f11322j = i5;
        this.f11326n = str;
        m15542i();
        viewGroup.addView(this, layoutParams);
    }

    /* renamed from: a */
    private void m15535a() {
        C3724b pathParser = getPathParser();
        C3714c cVar = new C3714c();
        this.f11327o = cVar;
        try {
            cVar.f11347a = pathParser.mo12276e(this.f11326n);
        } catch (ParseException unused) {
            this.f11327o.f11347a = new Path();
        }
        PathMeasure pathMeasure = new PathMeasure(this.f11327o.f11347a, true);
        do {
            C3714c cVar2 = this.f11327o;
            cVar2.f11348b = Math.max(cVar2.f11348b, pathMeasure.getLength());
        } while (pathMeasure.nextContour());
    }

    /* renamed from: b */
    private void m15536b(int i) {
        if (this.f11330r != i) {
            this.f11330r = i;
            C3720a aVar = this.f11335w;
            if (aVar != null) {
                aVar.mo560a(i);
            }
        }
    }

    /* renamed from: c */
    private void m15537c() {
        if (this.f11321i <= 0 || this.f11322j <= 0) {
            throw new IllegalArgumentException("You must provide the original image dimensions in order map the coordinates properly.");
        }
    }

    /* renamed from: d */
    private void m15538d() {
        if (this.f11327o == null) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
    }

    /* renamed from: e */
    private void m15539e() {
        m15537c();
        m15538d();
    }

    /* renamed from: f */
    private PathEffect m15540f(float f) {
        return new DashPathEffect(new float[]{f, this.f11327o.f11348b}, 0.0f);
    }

    private C3724b getPathParser() {
        C3721a.C3723b bVar = new C3721a.C3723b();
        bVar.mo12273c(this.f11321i);
        bVar.mo12272b(this.f11322j);
        bVar.mo12275e(this.f11332t);
        bVar.mo12274d(this.f11333u);
        return bVar.mo12271a();
    }

    /* renamed from: h */
    private boolean m15541h(long j) {
        return j < ((long) (this.f11323k + this.f11324l));
    }

    /* renamed from: i */
    private void m15542i() {
        this.f11330r = 0;
        m15543j();
        m15544k();
        this.f11334v = new DecelerateInterpolator();
        setLayerType(1, (Paint) null);
    }

    /* renamed from: j */
    private void m15543j() {
        Paint paint = new Paint();
        this.f11328p = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f11328p.setAntiAlias(true);
        this.f11328p.setStrokeWidth((float) this.f11320h);
        this.f11328p.setColor(this.f11318f);
    }

    /* renamed from: k */
    private void m15544k() {
        Paint paint = new Paint();
        this.f11329q = paint;
        paint.setAntiAlias(true);
        this.f11329q.setStyle(Paint.Style.FILL);
        this.f11329q.setColor(this.f11319g);
    }

    /* renamed from: g */
    public boolean mo12244g() {
        return (this.f11330r == 0 || this.f11327o == null) ? false : true;
    }

    /* renamed from: l */
    public boolean mo12245l(long j) {
        return j > ((long) this.f11323k);
    }

    /* renamed from: m */
    public void mo12246m() {
        m15539e();
        this.f11331s = System.currentTimeMillis();
        m15536b(1);
        C3403t.m14625Z(this);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mo12244g()) {
            long currentTimeMillis = System.currentTimeMillis() - this.f11331s;
            this.f11328p.setPathEffect(m15540f(this.f11334v.getInterpolation(C3725a.m15577a(0.0f, 1.0f, (((float) currentTimeMillis) * 1.0f) / ((float) this.f11323k))) * this.f11327o.f11348b));
            canvas.drawPath(this.f11327o.f11347a, this.f11328p);
            if (mo12245l(currentTimeMillis)) {
                if (this.f11330r < 2) {
                    m15536b(2);
                }
                this.f11325m.mo12268a(canvas, C3725a.m15577a(0.0f, 1.0f, (((float) (currentTimeMillis - ((long) this.f11323k))) * 1.0f) / ((float) this.f11324l)), this);
                canvas.drawPath(this.f11327o.f11347a, this.f11329q);
            }
            if (m15541h(currentTimeMillis)) {
                C3403t.m14625Z(this);
            } else {
                m15536b(3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11332t = i;
        this.f11333u = i2;
        m15535a();
    }

    public void setClippingTransform(C3715a aVar) {
        if (aVar == null) {
            aVar = new C3716b();
        }
        this.f11325m = aVar;
    }

    public void setFillColor(int i) {
        this.f11319g = i;
    }

    public void setFillDuration(int i) {
        this.f11324l = i;
    }

    public void setOnStateChangeListener(C3720a aVar) {
        this.f11335w = aVar;
    }

    public void setStrokeColor(int i) {
        this.f11318f = i;
    }

    public void setStrokeDrawingDuration(int i) {
        this.f11323k = i;
    }

    public void setStrokeWidth(int i) {
        this.f11320h = i;
    }

    public void setSvgPath(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
        this.f11326n = str;
        m15535a();
    }
}
