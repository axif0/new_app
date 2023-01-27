package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
class C0591d extends Drawable implements Drawable.Callback, C0590c, C0589b {

    /* renamed from: l */
    static final PorterDuff.Mode f2446l = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    private int f2447f;

    /* renamed from: g */
    private PorterDuff.Mode f2448g;

    /* renamed from: h */
    private boolean f2449h;

    /* renamed from: i */
    C0593f f2450i;

    /* renamed from: j */
    private boolean f2451j;

    /* renamed from: k */
    Drawable f2452k;

    C0591d(Drawable drawable) {
        this.f2450i = m2778d();
        mo2890a(drawable);
    }

    C0591d(C0593f fVar, Resources resources) {
        this.f2450i = fVar;
        m2779e(resources);
    }

    /* renamed from: d */
    private C0593f m2778d() {
        return new C0593f(this.f2450i);
    }

    /* renamed from: e */
    private void m2779e(Resources resources) {
        Drawable.ConstantState constantState;
        C0593f fVar = this.f2450i;
        if (fVar != null && (constantState = fVar.f2455b) != null) {
            mo2890a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m2780f(int[] iArr) {
        if (!mo2892c()) {
            return false;
        }
        C0593f fVar = this.f2450i;
        ColorStateList colorStateList = fVar.f2456c;
        PorterDuff.Mode mode = fVar.f2457d;
        if (colorStateList == null || mode == null) {
            this.f2449h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2449h && colorForState == this.f2447f && mode == this.f2448g)) {
                setColorFilter(colorForState, mode);
                this.f2447f = colorForState;
                this.f2448g = mode;
                this.f2449h = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2890a(Drawable drawable) {
        Drawable drawable2 = this.f2452k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2452k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0593f fVar = this.f2450i;
            if (fVar != null) {
                fVar.f2455b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo2891b() {
        return this.f2452k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2892c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2452k.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0593f fVar = this.f2450i;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2452k.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0593f fVar = this.f2450i;
        if (fVar == null || !fVar.mo2927a()) {
            return null;
        }
        this.f2450i.f2454a = getChangingConfigurations();
        return this.f2450i;
    }

    public Drawable getCurrent() {
        return this.f2452k.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2452k.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2452k.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2452k.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2452k.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2452k.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2452k.getPadding(rect);
    }

    public int[] getState() {
        return this.f2452k.getState();
    }

    public Region getTransparentRegion() {
        return this.f2452k.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2452k.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2450i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo2892c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f2450i
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f2456c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f2452k
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0591d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f2452k.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2451j && super.mutate() == this) {
            this.f2450i = m2778d();
            Drawable drawable = this.f2452k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0593f fVar = this.f2450i;
            if (fVar != null) {
                Drawable drawable2 = this.f2452k;
                fVar.f2455b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2451j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2452k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2452k.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2452k.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2452k.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2452k.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2452k.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2452k.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2452k.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m2780f(iArr) || this.f2452k.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2450i.f2456c = colorStateList;
        m2780f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2450i.f2457d = mode;
        m2780f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2452k.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
