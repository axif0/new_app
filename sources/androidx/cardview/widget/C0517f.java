package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
class C0517f extends Drawable {

    /* renamed from: a */
    private float f1988a;

    /* renamed from: b */
    private final Paint f1989b;

    /* renamed from: c */
    private final RectF f1990c;

    /* renamed from: d */
    private final Rect f1991d;

    /* renamed from: e */
    private float f1992e;

    /* renamed from: f */
    private boolean f1993f = false;

    /* renamed from: g */
    private boolean f1994g = true;

    /* renamed from: h */
    private ColorStateList f1995h;

    /* renamed from: i */
    private PorterDuffColorFilter f1996i;

    /* renamed from: j */
    private ColorStateList f1997j;

    /* renamed from: k */
    private PorterDuff.Mode f1998k = PorterDuff.Mode.SRC_IN;

    C0517f(ColorStateList colorStateList, float f) {
        this.f1988a = f;
        this.f1989b = new Paint(5);
        m2404e(colorStateList);
        this.f1990c = new RectF();
        this.f1991d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m2403a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m2404e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1995h = colorStateList;
        this.f1989b.setColor(colorStateList.getColorForState(getState(), this.f1995h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m2405i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1990c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1991d.set(rect);
        if (this.f1993f) {
            float d = C0518g.m2415d(this.f1992e, this.f1988a, this.f1994g);
            this.f1991d.inset((int) Math.ceil((double) C0518g.m2414c(this.f1992e, this.f1988a, this.f1994g)), (int) Math.ceil((double) d));
            this.f1990c.set(this.f1991d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo2535b() {
        return this.f1995h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2536c() {
        return this.f1992e;
    }

    /* renamed from: d */
    public float mo2537d() {
        return this.f1988a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1989b;
        if (this.f1996i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1996i);
            z = true;
        }
        RectF rectF = this.f1990c;
        float f = this.f1988a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: f */
    public void mo2539f(ColorStateList colorStateList) {
        m2404e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2540g(float f, boolean z, boolean z2) {
        if (f != this.f1992e || this.f1993f != z || this.f1994g != z2) {
            this.f1992e = f;
            this.f1993f = z;
            this.f1994g = z2;
            m2405i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1991d, this.f1988a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2543h(float f) {
        if (f != this.f1988a) {
            this.f1988a = f;
            m2405i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1995h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1997j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1995h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.C0517f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2405i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1995h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1989b.getColor();
        if (z) {
            this.f1989b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1997j;
        if (colorStateList2 == null || (mode = this.f1998k) == null) {
            return z;
        }
        this.f1996i = m2403a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f1989b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1989b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1997j = colorStateList;
        this.f1996i = m2403a(colorStateList, this.f1998k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1998k = mode;
        this.f1996i = m2403a(this.f1997j, mode);
        invalidateSelf();
    }
}
