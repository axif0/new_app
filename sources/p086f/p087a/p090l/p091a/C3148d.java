package p086f.p087a.p090l.p091a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0588a;
import p086f.p087a.C3123a;
import p086f.p087a.C3131i;
import p086f.p087a.C3132j;

/* renamed from: f.a.l.a.d */
public class C3148d extends Drawable {

    /* renamed from: m */
    private static final float f10001m = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f10002a = new Paint();

    /* renamed from: b */
    private float f10003b;

    /* renamed from: c */
    private float f10004c;

    /* renamed from: d */
    private float f10005d;

    /* renamed from: e */
    private float f10006e;

    /* renamed from: f */
    private boolean f10007f;

    /* renamed from: g */
    private final Path f10008g = new Path();

    /* renamed from: h */
    private final int f10009h;

    /* renamed from: i */
    private boolean f10010i = false;

    /* renamed from: j */
    private float f10011j;

    /* renamed from: k */
    private float f10012k;

    /* renamed from: l */
    private int f10013l = 2;

    public C3148d(Context context) {
        this.f10002a.setStyle(Paint.Style.STROKE);
        this.f10002a.setStrokeJoin(Paint.Join.MITER);
        this.f10002a.setStrokeCap(Paint.Cap.BUTT);
        this.f10002a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C3132j.DrawerArrowToggle, C3123a.drawerArrowStyle, C3131i.Base_Widget_AppCompat_DrawerArrowToggle);
        mo10886c(obtainStyledAttributes.getColor(C3132j.DrawerArrowToggle_color, 0));
        mo10885b(obtainStyledAttributes.getDimension(C3132j.DrawerArrowToggle_thickness, 0.0f));
        mo10890f(obtainStyledAttributes.getBoolean(C3132j.DrawerArrowToggle_spinBars, true));
        mo10887d((float) Math.round(obtainStyledAttributes.getDimension(C3132j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f10009h = obtainStyledAttributes.getDimensionPixelSize(C3132j.DrawerArrowToggle_drawableSize, 0);
        this.f10004c = (float) Math.round(obtainStyledAttributes.getDimension(C3132j.DrawerArrowToggle_barLength, 0.0f));
        this.f10003b = (float) Math.round(obtainStyledAttributes.getDimension(C3132j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f10005d = obtainStyledAttributes.getDimension(C3132j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m13465a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: b */
    public void mo10885b(float f) {
        if (this.f10002a.getStrokeWidth() != f) {
            this.f10002a.setStrokeWidth(f);
            double d = (double) (f / 2.0f);
            double cos = Math.cos((double) f10001m);
            Double.isNaN(d);
            this.f10012k = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo10886c(int i) {
        if (i != this.f10002a.getColor()) {
            this.f10002a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo10887d(float f) {
        if (f != this.f10006e) {
            this.f10006e = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f10013l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C0588a.m2763f(this) == 0 : C0588a.m2763f(this) == 1))) {
            z = true;
        }
        float f = this.f10003b;
        float a = m13465a(this.f10004c, (float) Math.sqrt((double) (f * f * 2.0f)), this.f10011j);
        float a2 = m13465a(this.f10004c, this.f10005d, this.f10011j);
        float round = (float) Math.round(m13465a(0.0f, this.f10012k, this.f10011j));
        float a3 = m13465a(0.0f, f10001m, this.f10011j);
        double d = (double) a;
        float a4 = m13465a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f10011j);
        double d2 = (double) a3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f10008g.rewind();
        float a5 = m13465a(this.f10006e + this.f10002a.getStrokeWidth(), -this.f10012k, this.f10011j);
        float f2 = (-a2) / 2.0f;
        this.f10008g.moveTo(f2 + round, 0.0f);
        this.f10008g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f10008g.moveTo(f2, a5);
        this.f10008g.rLineTo(round2, round3);
        this.f10008g.moveTo(f2, -a5);
        this.f10008g.rLineTo(round2, -round3);
        this.f10008g.close();
        canvas.save();
        float strokeWidth = this.f10002a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f3 = this.f10006e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (strokeWidth * 1.5f) + f3);
        if (this.f10007f) {
            canvas2.rotate(a4 * ((float) (this.f10010i ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f10008g, this.f10002a);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo10889e(float f) {
        if (this.f10011j != f) {
            this.f10011j = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo10890f(boolean z) {
        if (this.f10007f != z) {
            this.f10007f = z;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo10891g(boolean z) {
        if (this.f10010i != z) {
            this.f10010i = z;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.f10009h;
    }

    public int getIntrinsicWidth() {
        return this.f10009h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f10002a.getAlpha()) {
            this.f10002a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10002a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
