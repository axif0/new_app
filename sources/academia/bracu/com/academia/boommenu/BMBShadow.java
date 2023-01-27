package academia.bracu.com.academia.boommenu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class BMBShadow extends FrameLayout {

    /* renamed from: f */
    private boolean f1f = true;

    /* renamed from: g */
    private int f2g;

    /* renamed from: h */
    private int f3h;

    /* renamed from: i */
    private int f4i;

    /* renamed from: j */
    private int f5j;

    /* renamed from: k */
    private int f6k;

    public BMBShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private void m6b() {
        if (this.f1f) {
            Bitmap c = m7c();
            if (c != null) {
                setBackground(new BitmapDrawable(getResources(), c));
                return;
            }
            return;
        }
        mo4a();
    }

    /* renamed from: c */
    private Bitmap m7c() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF((float) (this.f4i + Math.abs(this.f2g)), (float) (this.f4i + Math.abs(this.f3h)), (float) ((getWidth() - this.f4i) - Math.abs(this.f2g)), (float) ((getHeight() - this.f4i) - Math.abs(this.f3h)));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        if (!isInEditMode()) {
            paint.setShadowLayer((float) this.f4i, (float) this.f2g, (float) this.f3h, this.f6k);
        }
        int i = this.f5j;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        return createBitmap;
    }

    /* renamed from: d */
    private void m8d() {
        int abs = this.f4i + Math.abs(this.f2g);
        int abs2 = this.f4i + Math.abs(this.f3h);
        setPadding(abs, abs2, abs, abs2);
    }

    /* renamed from: a */
    public void mo4a() {
        C0073q.m315z(this, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m6b();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            m6b();
        }
    }

    public void setShadowColor(int i) {
        this.f6k = i;
    }

    public void setShadowCornerRadius(int i) {
        this.f5j = i;
        m8d();
    }

    public void setShadowEffect(boolean z) {
        this.f1f = z;
    }

    public void setShadowOffsetX(int i) {
        this.f2g = i;
        m8d();
    }

    public void setShadowOffsetY(int i) {
        this.f3h = i;
        m8d();
    }

    public void setShadowRadius(int i) {
        this.f4i = i;
        m8d();
    }
}
