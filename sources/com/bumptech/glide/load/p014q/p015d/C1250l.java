package com.bumptech.glide.load.p014q.p015d;

import android.os.Build;
import com.bumptech.glide.load.C0999h;

/* renamed from: com.bumptech.glide.load.q.d.l */
public abstract class C1250l {

    /* renamed from: a */
    public static final C1250l f4442a = new C1253c();

    /* renamed from: b */
    public static final C1250l f4443b = new C1251a();

    /* renamed from: c */
    public static final C1250l f4444c = new C1252b();

    /* renamed from: d */
    public static final C1250l f4445d = new C1254d();

    /* renamed from: e */
    public static final C1250l f4446e;

    /* renamed from: f */
    public static final C0999h<C1250l> f4447f;

    /* renamed from: g */
    static final boolean f4448g = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: com.bumptech.glide.load.q.d.l$a */
    private static class C1251a extends C1250l {
        C1251a() {
        }

        /* renamed from: a */
        public C1255e mo5560a(int i, int i2, int i3, int i4) {
            return mo5561b(i, i2, i3, i4) == 1.0f ? C1255e.QUALITY : C1250l.f4442a.mo5560a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo5561b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C1250l.f4442a.mo5561b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$b */
    private static class C1252b extends C1250l {
        C1252b() {
        }

        /* renamed from: a */
        public C1255e mo5560a(int i, int i2, int i3, int i4) {
            return C1255e.QUALITY;
        }

        /* renamed from: b */
        public float mo5561b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$c */
    private static class C1253c extends C1250l {
        C1253c() {
        }

        /* renamed from: a */
        public C1255e mo5560a(int i, int i2, int i3, int i4) {
            return C1250l.f4448g ? C1255e.QUALITY : C1255e.MEMORY;
        }

        /* renamed from: b */
        public float mo5561b(int i, int i2, int i3, int i4) {
            if (C1250l.f4448g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$d */
    private static class C1254d extends C1250l {
        C1254d() {
        }

        /* renamed from: a */
        public C1255e mo5560a(int i, int i2, int i3, int i4) {
            return C1255e.QUALITY;
        }

        /* renamed from: b */
        public float mo5561b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$e */
    public enum C1255e {
        MEMORY,
        QUALITY
    }

    static {
        C1250l lVar = f4444c;
        f4446e = lVar;
        f4447f = C0999h.m5546f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", lVar);
    }

    /* renamed from: a */
    public abstract C1255e mo5560a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo5561b(int i, int i2, int i3, int i4);
}
