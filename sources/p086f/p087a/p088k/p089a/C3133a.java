package p086f.p087a.p088k.p089a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0448k0;
import java.util.WeakHashMap;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p112e.p113c.C3269a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a.k.a.a */
public final class C3133a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f9932a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C3134a>> f9933b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f9934c = new Object();

    /* renamed from: f.a.k.a.a$a */
    private static class C3134a {

        /* renamed from: a */
        final ColorStateList f9935a;

        /* renamed from: b */
        final Configuration f9936b;

        C3134a(ColorStateList colorStateList, Configuration configuration) {
            this.f9935a = colorStateList;
            this.f9936b = configuration;
        }
    }

    /* renamed from: a */
    private static void m13385a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f9934c) {
            SparseArray sparseArray = f9933b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f9933b.put(context, sparseArray);
            }
            sparseArray.append(i, new C3134a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m13386b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f9934c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<f.a.k.a.a$a>> r1 = f9933b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            f.a.k.a.a$a r2 = (p086f.p087a.p088k.p089a.C3133a.C3134a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f9936b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f9935a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p087a.p088k.p089a.C3133a.m13386b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m13387c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m13386b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m13390f(context, i);
        if (f == null) {
            return C3267a.m14075e(context, i);
        }
        m13385a(context, i, f);
        return f;
    }

    /* renamed from: d */
    public static Drawable m13388d(Context context, int i) {
        return C0448k0.m2046h().mo2186j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m13389e() {
        TypedValue typedValue = f9932a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f9932a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m13390f(Context context, int i) {
        if (m13391g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C3269a.m14083a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m13391g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m13389e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
