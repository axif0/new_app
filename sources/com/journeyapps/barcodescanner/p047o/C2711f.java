package com.journeyapps.barcodescanner.p047o;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.journeyapps.barcodescanner.o.f */
class C2711f {

    /* renamed from: e */
    private static C2711f f8685e;

    /* renamed from: a */
    private Handler f8686a;

    /* renamed from: b */
    private HandlerThread f8687b;

    /* renamed from: c */
    private int f8688c = 0;

    /* renamed from: d */
    private final Object f8689d = new Object();

    private C2711f() {
    }

    /* renamed from: a */
    private void m12050a() {
        synchronized (this.f8689d) {
            if (this.f8686a == null) {
                if (this.f8688c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f8687b = handlerThread;
                    handlerThread.start();
                    this.f8686a = new Handler(this.f8687b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: d */
    public static C2711f m12051d() {
        if (f8685e == null) {
            f8685e = new C2711f();
        }
        return f8685e;
    }

    /* renamed from: f */
    private void m12052f() {
        synchronized (this.f8689d) {
            this.f8687b.quit();
            this.f8687b = null;
            this.f8686a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9876b() {
        synchronized (this.f8689d) {
            int i = this.f8688c - 1;
            this.f8688c = i;
            if (i == 0) {
                m12052f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9877c(Runnable runnable) {
        synchronized (this.f8689d) {
            m12050a();
            this.f8686a.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo9878e(Runnable runnable) {
        synchronized (this.f8689d) {
            this.f8688c++;
            mo9877c(runnable);
        }
    }
}
