package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
class C0592e extends C0591d {

    /* renamed from: m */
    private static Method f2453m;

    C0592e(Drawable drawable) {
        super(drawable);
        m2784g();
    }

    C0592e(C0593f fVar, Resources resources) {
        super(fVar, resources);
        m2784g();
    }

    /* renamed from: g */
    private void m2784g() {
        if (f2453m == null) {
            try {
                f2453m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2892c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2452k;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f2452k.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2452k.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2452k;
        if (!(drawable == null || (method = f2453m) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f2452k.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2452k.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo2892c()) {
            super.setTint(i);
        } else {
            this.f2452k.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo2892c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2452k.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2892c()) {
            super.setTintMode(mode);
        } else {
            this.f2452k.setTintMode(mode);
        }
    }
}
