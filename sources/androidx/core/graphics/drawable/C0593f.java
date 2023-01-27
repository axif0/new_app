package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
final class C0593f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2454a;

    /* renamed from: b */
    Drawable.ConstantState f2455b;

    /* renamed from: c */
    ColorStateList f2456c = null;

    /* renamed from: d */
    PorterDuff.Mode f2457d = C0591d.f2446l;

    C0593f(C0593f fVar) {
        if (fVar != null) {
            this.f2454a = fVar.f2454a;
            this.f2455b = fVar.f2455b;
            this.f2456c = fVar.f2456c;
            this.f2457d = fVar.f2457d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2927a() {
        return this.f2455b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2454a;
        Drawable.ConstantState constantState = this.f2455b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0592e(this, resources) : new C0591d(this, resources);
    }
}
