package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.picasso.a0 */
class C2734a0 {

    /* renamed from: a */
    final HandlerThread f8732a;

    /* renamed from: b */
    final C2747d f8733b;

    /* renamed from: c */
    final Handler f8734c = new C2735a(this.f8732a.getLooper(), this);

    /* renamed from: d */
    long f8735d;

    /* renamed from: e */
    long f8736e;

    /* renamed from: f */
    long f8737f;

    /* renamed from: g */
    long f8738g;

    /* renamed from: h */
    long f8739h;

    /* renamed from: i */
    long f8740i;

    /* renamed from: j */
    long f8741j;

    /* renamed from: k */
    long f8742k;

    /* renamed from: l */
    int f8743l;

    /* renamed from: m */
    int f8744m;

    /* renamed from: n */
    int f8745n;

    /* renamed from: com.squareup.picasso.a0$a */
    private static class C2735a extends Handler {

        /* renamed from: a */
        private final C2734a0 f8746a;

        /* renamed from: com.squareup.picasso.a0$a$a */
        class C2736a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Message f8747f;

            C2736a(C2735a aVar, Message message) {
                this.f8747f = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f8747f.what);
            }
        }

        C2735a(Looper looper, C2734a0 a0Var) {
            super(looper);
            this.f8746a = a0Var;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f8746a.mo10003j();
            } else if (i == 1) {
                this.f8746a.mo10004k();
            } else if (i == 2) {
                this.f8746a.mo10001h((long) message.arg1);
            } else if (i == 3) {
                this.f8746a.mo10002i((long) message.arg1);
            } else if (i != 4) {
                C2776t.f8856p.post(new C2736a(this, message));
            } else {
                this.f8746a.mo10005l((Long) message.obj);
            }
        }
    }

    C2734a0(C2747d dVar) {
        this.f8733b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f8732a = handlerThread;
        handlerThread.start();
        C2748d0.m12145h(this.f8732a.getLooper());
    }

    /* renamed from: g */
    private static long m12088g(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: m */
    private void m12089m(Bitmap bitmap, int i) {
        int i2 = C2748d0.m12146i(bitmap);
        Handler handler = this.f8734c;
        handler.sendMessage(handler.obtainMessage(i, i2, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2738b0 mo9995a() {
        return new C2738b0(this.f8733b.mo10039b(), this.f8733b.size(), this.f8735d, this.f8736e, this.f8737f, this.f8738g, this.f8739h, this.f8740i, this.f8741j, this.f8742k, this.f8743l, this.f8744m, this.f8745n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9996b(Bitmap bitmap) {
        m12089m(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9997c(Bitmap bitmap) {
        m12089m(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9998d() {
        this.f8734c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9999e() {
        this.f8734c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10000f(long j) {
        Handler handler = this.f8734c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10001h(long j) {
        int i = this.f8744m + 1;
        this.f8744m = i;
        long j2 = this.f8738g + j;
        this.f8738g = j2;
        this.f8741j = m12088g(i, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo10002i(long j) {
        this.f8745n++;
        long j2 = this.f8739h + j;
        this.f8739h = j2;
        this.f8742k = m12088g(this.f8744m, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10003j() {
        this.f8735d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10004k() {
        this.f8736e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo10005l(Long l) {
        this.f8743l++;
        long longValue = this.f8737f + l.longValue();
        this.f8737f = longValue;
        this.f8740i = m12088g(this.f8743l, longValue);
    }
}
