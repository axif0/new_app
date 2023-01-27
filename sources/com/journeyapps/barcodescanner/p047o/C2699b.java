package com.journeyapps.barcodescanner.p047o;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.C2692l;
import com.journeyapps.barcodescanner.C2694n;
import p148g.p189d.p296d.p300r.p301a.C5404g;

/* renamed from: com.journeyapps.barcodescanner.o.b */
public class C2699b {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f8633l = "b";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2711f f8634a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2710e f8635b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2706c f8636c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f8637d;

    /* renamed from: e */
    private C2713h f8638e;

    /* renamed from: f */
    private boolean f8639f = false;

    /* renamed from: g */
    private C2708d f8640g = new C2708d();

    /* renamed from: h */
    private Runnable f8641h = new C2702c();

    /* renamed from: i */
    private Runnable f8642i = new C2703d();

    /* renamed from: j */
    private Runnable f8643j = new C2704e();

    /* renamed from: k */
    private Runnable f8644k = new C2705f();

    /* renamed from: com.journeyapps.barcodescanner.o.b$a */
    class C2700a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f8645f;

        C2700a(boolean z) {
            this.f8645f = z;
        }

        public void run() {
            C2699b.this.f8636c.mo9860s(this.f8645f);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.o.b$b */
    class C2701b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2716k f8647f;

        C2701b(C2716k kVar) {
            this.f8647f = kVar;
        }

        public void run() {
            C2699b.this.f8636c.mo9856l(this.f8647f);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.o.b$c */
    class C2702c implements Runnable {
        C2702c() {
        }

        public void run() {
            try {
                Log.d(C2699b.f8633l, "Opening camera");
                C2699b.this.f8636c.mo9855k();
            } catch (Exception e) {
                C2699b.this.m12003m(e);
                Log.e(C2699b.f8633l, "Failed to open camera", e);
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.o.b$d */
    class C2703d implements Runnable {
        C2703d() {
        }

        public void run() {
            try {
                Log.d(C2699b.f8633l, "Configuring camera");
                C2699b.this.f8636c.mo9850d();
                if (C2699b.this.f8637d != null) {
                    C2699b.this.f8637d.obtainMessage(C5404g.zxing_prewiew_size_ready, C2699b.this.m12002k()).sendToTarget();
                }
            } catch (Exception e) {
                C2699b.this.m12003m(e);
                Log.e(C2699b.f8633l, "Failed to configure camera", e);
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.o.b$e */
    class C2704e implements Runnable {
        C2704e() {
        }

        public void run() {
            try {
                Log.d(C2699b.f8633l, "Starting preview");
                C2699b.this.f8636c.mo9859r(C2699b.this.f8635b);
                C2699b.this.f8636c.mo9861t();
            } catch (Exception e) {
                C2699b.this.m12003m(e);
                Log.e(C2699b.f8633l, "Failed to start preview", e);
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.o.b$f */
    class C2705f implements Runnable {
        C2705f() {
        }

        public void run() {
            try {
                Log.d(C2699b.f8633l, "Closing camera");
                C2699b.this.f8636c.mo9862u();
                C2699b.this.f8636c.mo9849c();
            } catch (Exception e) {
                Log.e(C2699b.f8633l, "Failed to close camera", e);
            }
            C2699b.this.f8634a.mo9876b();
        }
    }

    public C2699b(Context context) {
        C2694n.m11984a();
        this.f8634a = C2711f.m12051d();
        C2706c cVar = new C2706c(context);
        this.f8636c = cVar;
        cVar.mo9857n(this.f8640g);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public C2692l m12002k() {
        return this.f8636c.mo9852g();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m12003m(Exception exc) {
        Handler handler = this.f8637d;
        if (handler != null) {
            handler.obtainMessage(C5404g.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* renamed from: v */
    private void m12004v() {
        if (!this.f8639f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: h */
    public void mo9831h() {
        C2694n.m11984a();
        if (this.f8639f) {
            this.f8634a.mo9877c(this.f8644k);
        }
        this.f8639f = false;
    }

    /* renamed from: i */
    public void mo9832i() {
        C2694n.m11984a();
        m12004v();
        this.f8634a.mo9877c(this.f8642i);
    }

    /* renamed from: j */
    public C2713h mo9833j() {
        return this.f8638e;
    }

    /* renamed from: l */
    public boolean mo9834l() {
        return this.f8639f;
    }

    /* renamed from: n */
    public void mo9835n() {
        C2694n.m11984a();
        this.f8639f = true;
        this.f8634a.mo9878e(this.f8641h);
    }

    /* renamed from: o */
    public void mo9836o(C2716k kVar) {
        m12004v();
        this.f8634a.mo9877c(new C2701b(kVar));
    }

    /* renamed from: p */
    public void mo9837p(C2708d dVar) {
        if (!this.f8639f) {
            this.f8640g = dVar;
            this.f8636c.mo9857n(dVar);
        }
    }

    /* renamed from: q */
    public void mo9838q(C2713h hVar) {
        this.f8638e = hVar;
        this.f8636c.mo9858p(hVar);
    }

    /* renamed from: r */
    public void mo9839r(Handler handler) {
        this.f8637d = handler;
    }

    /* renamed from: s */
    public void mo9840s(C2710e eVar) {
        this.f8635b = eVar;
    }

    /* renamed from: t */
    public void mo9841t(boolean z) {
        C2694n.m11984a();
        if (this.f8639f) {
            this.f8634a.mo9877c(new C2700a(z));
        }
    }

    /* renamed from: u */
    public void mo9842u() {
        C2694n.m11984a();
        m12004v();
        this.f8634a.mo9877c(this.f8643j);
    }
}
