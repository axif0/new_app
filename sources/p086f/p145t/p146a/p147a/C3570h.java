package p086f.p145t.p146a.p147a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.graphics.drawable.C0589b;

/* renamed from: f.t.a.a.h */
abstract class C3570h extends Drawable implements C0589b {

    /* renamed from: f */
    Drawable f11089f;

    C3570h() {
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2758a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2766i(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2768k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2769l(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
