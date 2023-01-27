package p370l.p371a.p372a.p373a;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: l.a.a.a.d */
public class C6096d implements C6097e {

    /* renamed from: a */
    private WeakReference<Activity> f17057a;

    /* renamed from: b */
    private WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f17058b;

    C6096d(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f17057a = new WeakReference<>(activity);
        this.f17058b = new WeakReference<>(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public void mo17196a() {
        Activity activity = (Activity) this.f17057a.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f17058b.get();
        if (!(activity == null || onGlobalLayoutListener == null)) {
            View a = C6092b.m24859a(activity);
            int i = Build.VERSION.SDK_INT;
            ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
            if (i >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
        }
        this.f17057a.clear();
        this.f17058b.clear();
    }
}
