package p086f.p087a.p090l.p091a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0588a;

/* renamed from: f.a.l.a.c */
public class C3147c extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private Drawable f10000f;

    public C3147c(Drawable drawable) {
        mo10857b(drawable);
    }

    /* renamed from: a */
    public Drawable mo10856a() {
        return this.f10000f;
    }

    /* renamed from: b */
    public void mo10857b(Drawable drawable) {
        Drawable drawable2 = this.f10000f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f10000f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f10000f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f10000f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f10000f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f10000f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10000f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f10000f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f10000f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f10000f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f10000f.getPadding(rect);
    }

    public int[] getState() {
        return this.f10000f.getState();
    }

    public Region getTransparentRegion() {
        return this.f10000f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0588a.m2765h(this.f10000f);
    }

    public boolean isStateful() {
        return this.f10000f.isStateful();
    }

    public void jumpToCurrentState() {
        this.f10000f.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f10000f.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f10000f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f10000f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0588a.m2767j(this.f10000f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f10000f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10000f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f10000f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f10000f.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0588a.m2768k(this.f10000f, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0588a.m2769l(this.f10000f, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f10000f.setState(iArr);
    }

    public void setTint(int i) {
        C0588a.m2771n(this.f10000f, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0588a.m2772o(this.f10000f, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0588a.m2773p(this.f10000f, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f10000f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
