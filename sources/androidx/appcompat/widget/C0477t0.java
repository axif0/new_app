package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.t0 */
class C0477t0 extends C0456l0 {

    /* renamed from: b */
    private final WeakReference<Context> f1856b;

    public C0477t0(Context context, Resources resources) {
        super(resources);
        this.f1856b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1856b.get();
        if (!(drawable == null || context == null)) {
            C0448k0.m2046h().mo2193x(context, i, drawable);
        }
        return drawable;
    }
}
