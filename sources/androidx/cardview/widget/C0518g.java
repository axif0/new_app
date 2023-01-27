package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p086f.p101d.C3186b;
import p086f.p101d.C3187c;

/* renamed from: androidx.cardview.widget.g */
class C0518g extends Drawable {

    /* renamed from: q */
    private static final double f1999q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0519a f2000r;

    /* renamed from: a */
    private final int f2001a;

    /* renamed from: b */
    private Paint f2002b;

    /* renamed from: c */
    private Paint f2003c;

    /* renamed from: d */
    private Paint f2004d;

    /* renamed from: e */
    private final RectF f2005e;

    /* renamed from: f */
    private float f2006f;

    /* renamed from: g */
    private Path f2007g;

    /* renamed from: h */
    private float f2008h;

    /* renamed from: i */
    private float f2009i;

    /* renamed from: j */
    private float f2010j;

    /* renamed from: k */
    private ColorStateList f2011k;

    /* renamed from: l */
    private boolean f2012l = true;

    /* renamed from: m */
    private final int f2013m;

    /* renamed from: n */
    private final int f2014n;

    /* renamed from: o */
    private boolean f2015o = true;

    /* renamed from: p */
    private boolean f2016p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    interface C0519a {
        /* renamed from: a */
        void mo2520a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0518g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f2013m = resources.getColor(C3186b.cardview_shadow_start_color);
        this.f2014n = resources.getColor(C3186b.cardview_shadow_end_color);
        this.f2001a = resources.getDimensionPixelSize(C3187c.cardview_compat_inset_shadow);
        this.f2002b = new Paint(5);
        m2417n(colorStateList);
        Paint paint = new Paint(5);
        this.f2003c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2006f = (float) ((int) (f + 0.5f));
        this.f2005e = new RectF();
        Paint paint2 = new Paint(this.f2003c);
        this.f2004d = paint2;
        paint2.setAntiAlias(false);
        m2418s(f2, f3);
    }

    /* renamed from: a */
    private void m2412a(Rect rect) {
        float f = this.f2008h;
        float f2 = 1.5f * f;
        this.f2005e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m2413b();
    }

    /* renamed from: b */
    private void m2413b() {
        float f = this.f2006f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f2009i;
        rectF2.inset(-f2, -f2);
        Path path = this.f2007g;
        if (path == null) {
            this.f2007g = new Path();
        } else {
            path.reset();
        }
        this.f2007g.setFillType(Path.FillType.EVEN_ODD);
        this.f2007g.moveTo(-this.f2006f, 0.0f);
        this.f2007g.rLineTo(-this.f2009i, 0.0f);
        this.f2007g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2007g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2007g.close();
        float f3 = this.f2006f;
        float f4 = f3 / (this.f2009i + f3);
        Paint paint = this.f2003c;
        float f5 = this.f2006f + this.f2009i;
        int i = this.f2013m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f2014n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f2004d;
        float f6 = this.f2006f;
        float f7 = this.f2009i;
        int i2 = this.f2013m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f2014n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2004d.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m2414c(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f1999q) * d2));
    }

    /* renamed from: d */
    static float m2415d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = (double) f3;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f1999q) * d2));
    }

    /* renamed from: e */
    private void m2416e(Canvas canvas) {
        float f = this.f2006f;
        float f2 = (-f) - this.f2009i;
        float f3 = f + ((float) this.f2001a) + (this.f2010j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f2005e.width() - f4 > 0.0f;
        boolean z2 = this.f2005e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f2005e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f2007g, this.f2003c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2005e.width() - f4, -this.f2006f, this.f2004d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2005e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2007g, this.f2003c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2005e.width() - f4, (-this.f2006f) + this.f2009i, this.f2004d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2005e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2007g, this.f2003c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2005e.height() - f4, -this.f2006f, this.f2004d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2005e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2007g, this.f2003c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2005e.height() - f4, -this.f2006f, this.f2004d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m2417n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2011k = colorStateList;
        this.f2002b.setColor(colorStateList.getColorForState(getState(), this.f2011k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m2418s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) m2419t(f);
            float t2 = (float) m2419t(f2);
            if (t > t2) {
                if (!this.f2016p) {
                    this.f2016p = true;
                }
                t = t2;
            }
            if (this.f2010j != t || this.f2008h != t2) {
                this.f2010j = t;
                this.f2008h = t2;
                this.f2009i = (float) ((int) ((t * 1.5f) + ((float) this.f2001a) + 0.5f));
                this.f2012l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m2419t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f2012l) {
            m2412a(getBounds());
            this.f2012l = false;
        }
        canvas.translate(0.0f, this.f2010j / 2.0f);
        m2416e(canvas);
        canvas.translate(0.0f, (-this.f2010j) / 2.0f);
        f2000r.mo2520a(canvas, this.f2005e, this.f2006f, this.f2002b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo2552f() {
        return this.f2011k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2553g() {
        return this.f2006f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m2415d(this.f2008h, this.f2006f, this.f2015o));
        int ceil2 = (int) Math.ceil((double) m2414c(this.f2008h, this.f2006f, this.f2015o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2556h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2557i() {
        return this.f2008h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2011k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2559j() {
        float f = this.f2008h;
        return (Math.max(f, this.f2006f + ((float) this.f2001a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f2008h * 1.5f) + ((float) this.f2001a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo2560k() {
        float f = this.f2008h;
        return (Math.max(f, this.f2006f + ((float) this.f2001a) + (f / 2.0f)) * 2.0f) + ((this.f2008h + ((float) this.f2001a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo2561l() {
        return this.f2010j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2562m(boolean z) {
        this.f2015o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2563o(ColorStateList colorStateList) {
        m2417n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2012l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2011k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2002b.getColor() == colorForState) {
            return false;
        }
        this.f2002b.setColor(colorForState);
        this.f2012l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2566p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f2006f != f2) {
                this.f2006f = f2;
                this.f2012l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2567q(float f) {
        m2418s(this.f2010j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2568r(float f) {
        m2418s(f, this.f2008h);
    }

    public void setAlpha(int i) {
        this.f2002b.setAlpha(i);
        this.f2003c.setAlpha(i);
        this.f2004d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2002b.setColorFilter(colorFilter);
    }
}
