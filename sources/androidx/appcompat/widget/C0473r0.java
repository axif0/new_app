package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.r0 */
public class C0473r0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1846c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0473r0>> f1847d;

    /* renamed from: a */
    private final Resources f1848a;

    /* renamed from: b */
    private final Resources.Theme f1849b;

    private C0473r0(Context context) {
        super(context);
        if (C0508z0.m2332c()) {
            C0508z0 z0Var = new C0508z0(this, context.getResources());
            this.f1848a = z0Var;
            Resources.Theme newTheme = z0Var.newTheme();
            this.f1849b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1848a = new C0477t0(this, context.getResources());
        this.f1849b = null;
    }

    /* renamed from: a */
    private static boolean m2137a(Context context) {
        if ((context instanceof C0473r0) || (context.getResources() instanceof C0477t0) || (context.getResources() instanceof C0508z0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0508z0.m2332c();
    }

    /* renamed from: b */
    public static Context m2138b(Context context) {
        if (!m2137a(context)) {
            return context;
        }
        synchronized (f1846c) {
            if (f1847d == null) {
                f1847d = new ArrayList<>();
            } else {
                for (int size = f1847d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1847d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1847d.remove(size);
                    }
                }
                for (int size2 = f1847d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1847d.get(size2);
                    C0473r0 r0Var = weakReference2 != null ? (C0473r0) weakReference2.get() : null;
                    if (r0Var != null && r0Var.getBaseContext() == context) {
                        return r0Var;
                    }
                }
            }
            C0473r0 r0Var2 = new C0473r0(context);
            f1847d.add(new WeakReference(r0Var2));
            return r0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1848a.getAssets();
    }

    public Resources getResources() {
        return this.f1848a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1849b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1849b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
