package com.bumptech.glide.load.p008o.p010b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.o.b0.i */
public final class C1081i {

    /* renamed from: a */
    private final int f4075a;

    /* renamed from: b */
    private final int f4076b;

    /* renamed from: c */
    private final Context f4077c;

    /* renamed from: d */
    private final int f4078d;

    /* renamed from: com.bumptech.glide.load.o.b0.i$a */
    public static final class C1082a {

        /* renamed from: i */
        static final int f4079i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f4080a;

        /* renamed from: b */
        ActivityManager f4081b;

        /* renamed from: c */
        C1084c f4082c;

        /* renamed from: d */
        float f4083d = 2.0f;

        /* renamed from: e */
        float f4084e = ((float) f4079i);

        /* renamed from: f */
        float f4085f = 0.4f;

        /* renamed from: g */
        float f4086g = 0.33f;

        /* renamed from: h */
        int f4087h = 4194304;

        public C1082a(Context context) {
            this.f4080a = context;
            this.f4081b = (ActivityManager) context.getSystemService("activity");
            this.f4082c = new C1083b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C1081i.m5814e(this.f4081b)) {
                this.f4084e = 0.0f;
            }
        }

        /* renamed from: a */
        public C1081i mo5300a() {
            return new C1081i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.i$b */
    private static final class C1083b implements C1084c {

        /* renamed from: a */
        private final DisplayMetrics f4088a;

        C1083b(DisplayMetrics displayMetrics) {
            this.f4088a = displayMetrics;
        }

        /* renamed from: a */
        public int mo5301a() {
            return this.f4088a.heightPixels;
        }

        /* renamed from: b */
        public int mo5302b() {
            return this.f4088a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.i$c */
    interface C1084c {
        /* renamed from: a */
        int mo5301a();

        /* renamed from: b */
        int mo5302b();
    }

    C1081i(C1082a aVar) {
        this.f4077c = aVar.f4080a;
        this.f4078d = m5814e(aVar.f4081b) ? aVar.f4087h / 2 : aVar.f4087h;
        int c = m5813c(aVar.f4081b, aVar.f4085f, aVar.f4086g);
        float b = (float) (aVar.f4082c.mo5302b() * aVar.f4082c.mo5301a() * 4);
        int round = Math.round(aVar.f4084e * b);
        int round2 = Math.round(b * aVar.f4083d);
        int i = c - this.f4078d;
        int i2 = round2 + round;
        if (i2 <= i) {
            this.f4076b = round2;
            this.f4075a = round;
        } else {
            float f = (float) i;
            float f2 = aVar.f4084e;
            float f3 = aVar.f4083d;
            float f4 = f / (f2 + f3);
            this.f4076b = Math.round(f3 * f4);
            this.f4075a = Math.round(f4 * aVar.f4084e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m5815f(this.f4076b));
            sb.append(", pool size: ");
            sb.append(m5815f(this.f4075a));
            sb.append(", byte array size: ");
            sb.append(m5815f(this.f4078d));
            sb.append(", memory class limited? ");
            sb.append(i2 > c);
            sb.append(", max size: ");
            sb.append(m5815f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f4081b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m5814e(aVar.f4081b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m5813c(ActivityManager activityManager, float f, float f2) {
        boolean e = m5814e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    static boolean m5814e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m5815f(int i) {
        return Formatter.formatFileSize(this.f4077c, (long) i);
    }

    /* renamed from: a */
    public int mo5297a() {
        return this.f4078d;
    }

    /* renamed from: b */
    public int mo5298b() {
        return this.f4075a;
    }

    /* renamed from: d */
    public int mo5299d() {
        return this.f4076b;
    }
}
