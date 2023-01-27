package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.C2776t;

/* renamed from: com.squareup.picasso.u */
final class C2786u extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f8896h = new Paint();

    /* renamed from: a */
    private final boolean f8897a;

    /* renamed from: b */
    private final float f8898b;

    /* renamed from: c */
    private final C2776t.C2782e f8899c;

    /* renamed from: d */
    Drawable f8900d;

    /* renamed from: e */
    long f8901e;

    /* renamed from: f */
    boolean f8902f;

    /* renamed from: g */
    int f8903g = 255;

    C2786u(Context context, Bitmap bitmap, Drawable drawable, C2776t.C2782e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f8897a = z2;
        this.f8898b = context.getResources().getDisplayMetrics().density;
        this.f8899c = eVar;
        if (eVar != C2776t.C2782e.MEMORY && !z) {
            this.f8900d = drawable;
            this.f8902f = true;
            this.f8901e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    private void m12241a(Canvas canvas) {
        f8896h.setColor(-1);
        canvas.drawPath(m12242b(0, 0, (int) (this.f8898b * 16.0f)), f8896h);
        f8896h.setColor(this.f8899c.f8890f);
        canvas.drawPath(m12242b(0, 0, (int) (this.f8898b * 15.0f)), f8896h);
    }

    /* renamed from: b */
    private static Path m12242b(int i, int i2, int i3) {
        Path path = new Path();
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        path.lineTo((float) (i + i3), f2);
        path.lineTo(f, (float) (i2 + i3));
        return path;
    }

    /* renamed from: c */
    static void m12243c(ImageView imageView, Context context, Bitmap bitmap, C2776t.C2782e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C2786u(context, bitmap, drawable, eVar, z, z2));
    }

    /* renamed from: d */
    static void m12244d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f8902f
            if (r0 != 0) goto L_0x0008
        L_0x0004:
            super.draw(r5)
            goto L_0x0038
        L_0x0008:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f8901e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0020
            r0 = 0
            r4.f8902f = r0
            r0 = 0
            r4.f8900d = r0
            goto L_0x0004
        L_0x0020:
            android.graphics.drawable.Drawable r1 = r4.f8900d
            if (r1 == 0) goto L_0x0027
            r1.draw(r5)
        L_0x0027:
            int r1 = r4.f8903g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f8903g
            super.setAlpha(r0)
        L_0x0038:
            boolean r0 = r4.f8897a
            if (r0 == 0) goto L_0x003f
            r4.m12241a(r5)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C2786u.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8900d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f8903g = i;
        Drawable drawable = this.f8900d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8900d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
