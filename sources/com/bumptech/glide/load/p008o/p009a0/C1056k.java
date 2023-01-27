package com.bumptech.glide.load.p008o.p009a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.a0.k */
public class C1056k implements C1047e {

    /* renamed from: j */
    private static final Bitmap.Config f4038j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C1059l f4039a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f4040b;

    /* renamed from: c */
    private final C1057a f4041c;

    /* renamed from: d */
    private long f4042d;

    /* renamed from: e */
    private long f4043e;

    /* renamed from: f */
    private int f4044f;

    /* renamed from: g */
    private int f4045g;

    /* renamed from: h */
    private int f4046h;

    /* renamed from: i */
    private int f4047i;

    /* renamed from: com.bumptech.glide.load.o.a0.k$a */
    private interface C1057a {
        /* renamed from: a */
        void mo5269a(Bitmap bitmap);

        /* renamed from: b */
        void mo5270b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.o.a0.k$b */
    private static final class C1058b implements C1057a {
        C1058b() {
        }

        /* renamed from: a */
        public void mo5269a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo5270b(Bitmap bitmap) {
        }
    }

    public C1056k(long j) {
        this(j, m5744l(), m5743k());
    }

    C1056k(long j, C1059l lVar, Set<Bitmap.Config> set) {
        this.f4042d = j;
        this.f4039a = lVar;
        this.f4040b = set;
        this.f4041c = new C1058b();
    }

    @TargetApi(26)
    /* renamed from: f */
    private static void m5738f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m5739g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f4038j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m5740h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m5741i();
        }
    }

    /* renamed from: i */
    private void m5741i() {
        Log.v("LruBitmapPool", "Hits=" + this.f4044f + ", misses=" + this.f4045g + ", puts=" + this.f4046h + ", evictions=" + this.f4047i + ", currentSize=" + this.f4043e + ", maxSize=" + this.f4042d + "\nStrategy=" + this.f4039a);
    }

    /* renamed from: j */
    private void m5742j() {
        m5748q(this.f4042d);
    }

    @TargetApi(26)
    /* renamed from: k */
    private static Set<Bitmap.Config> m5743k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static C1059l m5744l() {
        return Build.VERSION.SDK_INT >= 19 ? new C1061n() : new C1043c();
    }

    /* renamed from: m */
    private synchronized Bitmap m5745m(int i, int i2, Bitmap.Config config) {
        Bitmap c;
        m5738f(config);
        c = this.f4039a.mo5231c(i, i2, config != null ? config : f4038j);
        if (c == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f4039a.mo5229a(i, i2, config));
            }
            this.f4045g++;
        } else {
            this.f4044f++;
            this.f4043e -= (long) this.f4039a.mo5230b(c);
            this.f4041c.mo5269a(c);
            m5747p(c);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f4039a.mo5229a(i, i2, config));
        }
        m5740h();
        return c;
    }

    @TargetApi(19)
    /* renamed from: o */
    private static void m5746o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    private static void m5747p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m5746o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m5748q(long j) {
        while (this.f4043e > j) {
            Bitmap e = this.f4039a.mo5233e();
            if (e == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m5741i();
                }
                this.f4043e = 0;
                return;
            }
            this.f4041c.mo5269a(e);
            this.f4043e -= (long) this.f4039a.mo5230b(e);
            this.f4047i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f4039a.mo5234f(e));
            }
            m5740h();
            e.recycle();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo5246a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo5247b();
        } else if (i >= 20 || i == 15) {
            m5748q(mo5268n() / 2);
        }
    }

    /* renamed from: b */
    public void mo5247b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m5748q(0);
    }

    /* renamed from: c */
    public Bitmap mo5248c(int i, int i2, Bitmap.Config config) {
        Bitmap m = m5745m(i, i2, config);
        if (m == null) {
            return m5739g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    /* renamed from: d */
    public synchronized void mo5249d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f4039a.mo5230b(bitmap)) <= this.f4042d) {
                        if (this.f4040b.contains(bitmap.getConfig())) {
                            int b = this.f4039a.mo5230b(bitmap);
                            this.f4039a.mo5232d(bitmap);
                            this.f4041c.mo5270b(bitmap);
                            this.f4046h++;
                            this.f4043e += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f4039a.mo5234f(bitmap));
                            }
                            m5740h();
                            m5742j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f4039a.mo5234f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f4040b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: e */
    public Bitmap mo5250e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m5745m(i, i2, config);
        return m == null ? m5739g(i, i2, config) : m;
    }

    /* renamed from: n */
    public long mo5268n() {
        return this.f4042d;
    }
}
