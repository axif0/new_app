package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import p086f.p111h.p121l.C3349h;

/* renamed from: com.google.android.material.internal.m */
final class C2200m {

    /* renamed from: k */
    private static boolean f7291k;

    /* renamed from: l */
    private static Constructor<StaticLayout> f7292l;

    /* renamed from: m */
    private static Object f7293m;

    /* renamed from: a */
    private CharSequence f7294a;

    /* renamed from: b */
    private final TextPaint f7295b;

    /* renamed from: c */
    private final int f7296c;

    /* renamed from: d */
    private int f7297d = 0;

    /* renamed from: e */
    private int f7298e;

    /* renamed from: f */
    private Layout.Alignment f7299f;

    /* renamed from: g */
    private int f7300g;

    /* renamed from: h */
    private boolean f7301h;

    /* renamed from: i */
    private boolean f7302i;

    /* renamed from: j */
    private TextUtils.TruncateAt f7303j;

    /* renamed from: com.google.android.material.internal.m$a */
    static class C2201a extends Exception {
        C2201a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C2200m(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f7294a = charSequence;
        this.f7295b = textPaint;
        this.f7296c = i;
        this.f7298e = charSequence.length();
        this.f7299f = Layout.Alignment.ALIGN_NORMAL;
        this.f7300g = Integer.MAX_VALUE;
        this.f7301h = true;
        this.f7303j = null;
    }

    /* renamed from: b */
    private void m10277b() throws C2201a {
        Class cls;
        if (!f7291k) {
            try {
                boolean z = this.f7302i && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f7293m = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C2200m.class.getClassLoader();
                    String str = this.f7302i ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f7293m = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE});
                f7292l = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f7291k = true;
            } catch (Exception e) {
                throw new C2201a(e);
            }
        }
    }

    /* renamed from: c */
    public static C2200m m10278c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C2200m(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo8597a() throws C2201a {
        if (this.f7294a == null) {
            this.f7294a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f7296c);
        CharSequence charSequence = this.f7294a;
        if (this.f7300g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f7295b, (float) max, this.f7303j);
        }
        this.f7298e = Math.min(charSequence.length(), this.f7298e);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f7302i) {
                this.f7299f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f7297d, this.f7298e, this.f7295b, max);
            obtain.setAlignment(this.f7299f);
            obtain.setIncludePad(this.f7301h);
            obtain.setTextDirection(this.f7302i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f7303j;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f7300g);
            return obtain.build();
        }
        m10277b();
        try {
            Constructor<StaticLayout> constructor = f7292l;
            C3349h.m14361c(constructor);
            Object obj = f7293m;
            C3349h.m14361c(obj);
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, Integer.valueOf(this.f7297d), Integer.valueOf(this.f7298e), this.f7295b, Integer.valueOf(max), this.f7299f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f7301h), null, Integer.valueOf(max), Integer.valueOf(this.f7300g)});
        } catch (Exception e) {
            throw new C2201a(e);
        }
    }

    /* renamed from: d */
    public C2200m mo8598d(Layout.Alignment alignment) {
        this.f7299f = alignment;
        return this;
    }

    /* renamed from: e */
    public C2200m mo8599e(TextUtils.TruncateAt truncateAt) {
        this.f7303j = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C2200m mo8600f(boolean z) {
        this.f7301h = z;
        return this;
    }

    /* renamed from: g */
    public C2200m mo8601g(boolean z) {
        this.f7302i = z;
        return this;
    }

    /* renamed from: h */
    public C2200m mo8602h(int i) {
        this.f7300g = i;
        return this;
    }
}
