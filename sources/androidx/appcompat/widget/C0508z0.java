package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.z0 */
public class C0508z0 extends Resources {

    /* renamed from: b */
    private static boolean f1971b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1972a;

    public C0508z0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1972a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m2330a() {
        return f1971b;
    }

    /* renamed from: b */
    public static void m2331b(boolean z) {
        f1971b = z;
    }

    /* renamed from: c */
    public static boolean m2332c() {
        return m2330a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Drawable mo2486d(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = (Context) this.f1972a.get();
        return context != null ? C0448k0.m2046h().mo2191t(context, this, i) : super.getDrawable(i);
    }
}
