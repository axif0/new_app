package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.core.widget.a */
public abstract class C0598a implements View.OnTouchListener {

    /* renamed from: w */
    private static final int f2487w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    final C0599a f2488f = new C0599a();

    /* renamed from: g */
    private final Interpolator f2489g = new AccelerateInterpolator();

    /* renamed from: h */
    final View f2490h;

    /* renamed from: i */
    private Runnable f2491i;

    /* renamed from: j */
    private float[] f2492j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f2493k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f2494l;

    /* renamed from: m */
    private int f2495m;

    /* renamed from: n */
    private float[] f2496n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f2497o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f2498p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f2499q;

    /* renamed from: r */
    boolean f2500r;

    /* renamed from: s */
    boolean f2501s;

    /* renamed from: t */
    boolean f2502t;

    /* renamed from: u */
    private boolean f2503u;

    /* renamed from: v */
    private boolean f2504v;

    /* renamed from: androidx.core.widget.a$a */
    private static class C0599a {

        /* renamed from: a */
        private int f2505a;

        /* renamed from: b */
        private int f2506b;

        /* renamed from: c */
        private float f2507c;

        /* renamed from: d */
        private float f2508d;

        /* renamed from: e */
        private long f2509e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2510f = 0;

        /* renamed from: g */
        private int f2511g = 0;

        /* renamed from: h */
        private int f2512h = 0;

        /* renamed from: i */
        private long f2513i = -1;

        /* renamed from: j */
        private float f2514j;

        /* renamed from: k */
        private int f2515k;

        C0599a() {
        }

        /* renamed from: e */
        private float m2858e(long j) {
            if (j < this.f2509e) {
                return 0.0f;
            }
            long j2 = this.f2513i;
            if (j2 < 0 || j < j2) {
                return C0598a.m2837e(((float) (j - this.f2509e)) / ((float) this.f2505a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f2514j;
            return (1.0f - f) + (f * C0598a.m2837e(((float) j3) / ((float) this.f2515k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m2859g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3021a() {
            if (this.f2510f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m2859g(m2858e(currentAnimationTimeMillis));
                this.f2510f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2510f)) * g;
                this.f2511g = (int) (this.f2507c * f);
                this.f2512h = (int) (f * this.f2508d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3022b() {
            return this.f2511g;
        }

        /* renamed from: c */
        public int mo3023c() {
            return this.f2512h;
        }

        /* renamed from: d */
        public int mo3024d() {
            float f = this.f2507c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3025f() {
            float f = this.f2508d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3026h() {
            return this.f2513i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2513i + ((long) this.f2515k);
        }

        /* renamed from: i */
        public void mo3027i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2515k = C0598a.m2838f((int) (currentAnimationTimeMillis - this.f2509e), 0, this.f2506b);
            this.f2514j = m2858e(currentAnimationTimeMillis);
            this.f2513i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3028j(int i) {
            this.f2506b = i;
        }

        /* renamed from: k */
        public void mo3029k(int i) {
            this.f2505a = i;
        }

        /* renamed from: l */
        public void mo3030l(float f, float f2) {
            this.f2507c = f;
            this.f2508d = f2;
        }

        /* renamed from: m */
        public void mo3031m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2509e = currentAnimationTimeMillis;
            this.f2513i = -1;
            this.f2510f = currentAnimationTimeMillis;
            this.f2514j = 0.5f;
            this.f2511g = 0;
            this.f2512h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C0600b implements Runnable {
        C0600b() {
        }

        public void run() {
            C0598a aVar = C0598a.this;
            if (aVar.f2502t) {
                if (aVar.f2500r) {
                    aVar.f2500r = false;
                    aVar.f2488f.mo3031m();
                }
                C0599a aVar2 = C0598a.this.f2488f;
                if (aVar2.mo3026h() || !C0598a.this.mo3020u()) {
                    C0598a.this.f2502t = false;
                    return;
                }
                C0598a aVar3 = C0598a.this;
                if (aVar3.f2501s) {
                    aVar3.f2501s = false;
                    aVar3.mo3007c();
                }
                aVar2.mo3021a();
                C0598a.this.mo3008j(aVar2.mo3022b(), aVar2.mo3023c());
                C3403t.m14627a0(C0598a.this.f2490h, this);
            }
        }
    }

    public C0598a(View view) {
        this.f2490h = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3013o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3015p(f3, f3);
        mo3010l(1);
        mo3012n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3018s(0.2f, 0.2f);
        mo3019t(1.0f, 1.0f);
        mo3009k(f2487w);
        mo3017r(500);
        mo3016q(500);
    }

    /* renamed from: d */
    private float m2836d(int i, float f, float f2, float f3) {
        float h = m2840h(this.f2492j[i], f2, this.f2493k[i], f);
        if (h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f2496n[i];
        float f5 = this.f2497o[i];
        float f6 = this.f2498p[i];
        float f7 = f4 * f3;
        return h > 0.0f ? m2837e(h * f7, f5, f6) : -m2837e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m2837e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m2838f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m2839g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2494l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f2502t || this.f2494l != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m2840h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m2837e(f * f2, 0.0f, f3);
        float g = m2839g(f2 - f4, e) - m2839g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f2489g.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2489g.getInterpolation(g);
        }
        return m2837e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m2841i() {
        if (this.f2500r) {
            this.f2502t = false;
        } else {
            this.f2488f.mo3027i();
        }
    }

    /* renamed from: v */
    private void m2842v() {
        int i;
        if (this.f2491i == null) {
            this.f2491i = new C0600b();
        }
        this.f2502t = true;
        this.f2500r = true;
        if (this.f2499q || (i = this.f2495m) <= 0) {
            this.f2491i.run();
        } else {
            C3403t.m14629b0(this.f2490h, this.f2491i, (long) i);
        }
        this.f2499q = true;
    }

    /* renamed from: a */
    public abstract boolean mo3005a(int i);

    /* renamed from: b */
    public abstract boolean mo3006b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3007c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2490h.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo3008j(int i, int i2);

    /* renamed from: k */
    public C0598a mo3009k(int i) {
        this.f2495m = i;
        return this;
    }

    /* renamed from: l */
    public C0598a mo3010l(int i) {
        this.f2494l = i;
        return this;
    }

    /* renamed from: m */
    public C0598a mo3011m(boolean z) {
        if (this.f2503u && !z) {
            m2841i();
        }
        this.f2503u = z;
        return this;
    }

    /* renamed from: n */
    public C0598a mo3012n(float f, float f2) {
        float[] fArr = this.f2493k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C0598a mo3013o(float f, float f2) {
        float[] fArr = this.f2498p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2503u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m2841i()
            goto L_0x0058
        L_0x001a:
            r5.f2501s = r2
            r5.f2499q = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2490h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2836d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2490h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2836d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2488f
            r7.mo3030l(r0, r6)
            boolean r6 = r5.f2502t
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3020u()
            if (r6 == 0) goto L_0x0058
            r5.m2842v()
        L_0x0058:
            boolean r6 = r5.f2504v
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2502t
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0598a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C0598a mo3015p(float f, float f2) {
        float[] fArr = this.f2497o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C0598a mo3016q(int i) {
        this.f2488f.mo3028j(i);
        return this;
    }

    /* renamed from: r */
    public C0598a mo3017r(int i) {
        this.f2488f.mo3029k(i);
        return this;
    }

    /* renamed from: s */
    public C0598a mo3018s(float f, float f2) {
        float[] fArr = this.f2492j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C0598a mo3019t(float f, float f2) {
        float[] fArr = this.f2496n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3020u() {
        C0599a aVar = this.f2488f;
        int f = aVar.mo3025f();
        int d = aVar.mo3024d();
        return (f != 0 && mo3006b(f)) || (d != 0 && mo3005a(d));
    }
}
