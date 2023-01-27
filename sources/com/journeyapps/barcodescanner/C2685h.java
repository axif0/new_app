package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.journeyapps.barcodescanner.p047o.C2699b;
import com.journeyapps.barcodescanner.p047o.C2716k;
import p148g.p189d.p296d.C5375g;
import p148g.p189d.p296d.p300r.p301a.C5404g;

/* renamed from: com.journeyapps.barcodescanner.h */
public class C2685h {

    /* renamed from: k */
    private static final String f8591k = "h";

    /* renamed from: a */
    private C2699b f8592a;

    /* renamed from: b */
    private HandlerThread f8593b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f8594c;

    /* renamed from: d */
    private C2682e f8595d;

    /* renamed from: e */
    private Handler f8596e;

    /* renamed from: f */
    private Rect f8597f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f8598g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f8599h = new Object();

    /* renamed from: i */
    private final Handler.Callback f8600i = new C2686a();

    /* renamed from: j */
    private final C2716k f8601j = new C2687b();

    /* renamed from: com.journeyapps.barcodescanner.h$a */
    class C2686a implements Handler.Callback {
        C2686a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C5404g.zxing_decode) {
                C2685h.this.m11954g((C2693m) message.obj);
                return true;
            } else if (i != C5404g.zxing_preview_failed) {
                return true;
            } else {
                C2685h.this.m11955h();
                return true;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.h$b */
    class C2687b implements C2716k {
        C2687b() {
        }

        /* renamed from: a */
        public void mo9809a(Exception exc) {
            synchronized (C2685h.this.f8599h) {
                if (C2685h.this.f8598g) {
                    C2685h.this.f8594c.obtainMessage(C5404g.zxing_preview_failed).sendToTarget();
                }
            }
        }

        /* renamed from: b */
        public void mo9810b(C2693m mVar) {
            synchronized (C2685h.this.f8599h) {
                if (C2685h.this.f8598g) {
                    C2685h.this.f8594c.obtainMessage(C5404g.zxing_decode, mVar).sendToTarget();
                }
            }
        }
    }

    public C2685h(C2699b bVar, C2682e eVar, Handler handler) {
        C2694n.m11984a();
        this.f8592a = bVar;
        this.f8595d = eVar;
        this.f8596e = handler;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11954g(com.journeyapps.barcodescanner.C2693m r9) {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.graphics.Rect r2 = r8.f8597f
            r9.mo9825i(r2)
            g.d.d.g r2 = r8.mo9803f(r9)
            if (r2 == 0) goto L_0x0016
            com.journeyapps.barcodescanner.e r3 = r8.f8595d
            g.d.d.m r2 = r3.mo9798c(r2)
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x0053
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = f8591k
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Found barcode in "
            r6.append(r7)
            long r3 = r3 - r0
            r6.append(r3)
            java.lang.String r0 = " ms"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.d(r5, r0)
            android.os.Handler r0 = r8.f8596e
            if (r0 == 0) goto L_0x0060
            com.journeyapps.barcodescanner.b r0 = new com.journeyapps.barcodescanner.b
            r0.<init>(r2, r9)
            android.os.Handler r9 = r8.f8596e
            int r1 = p148g.p189d.p296d.p300r.p301a.C5404g.zxing_decode_succeeded
            android.os.Message r9 = android.os.Message.obtain(r9, r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r9.setData(r0)
            goto L_0x005d
        L_0x0053:
            android.os.Handler r9 = r8.f8596e
            if (r9 == 0) goto L_0x0060
            int r0 = p148g.p189d.p296d.p300r.p301a.C5404g.zxing_decode_failed
            android.os.Message r9 = android.os.Message.obtain(r9, r0)
        L_0x005d:
            r9.sendToTarget()
        L_0x0060:
            android.os.Handler r9 = r8.f8596e
            if (r9 == 0) goto L_0x0075
            com.journeyapps.barcodescanner.e r9 = r8.f8595d
            java.util.List r9 = r9.mo9799d()
            android.os.Handler r0 = r8.f8596e
            int r1 = p148g.p189d.p296d.p300r.p301a.C5404g.zxing_possible_result_points
            android.os.Message r9 = android.os.Message.obtain(r0, r1, r9)
            r9.sendToTarget()
        L_0x0075:
            r8.m11955h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.C2685h.m11954g(com.journeyapps.barcodescanner.m):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11955h() {
        if (this.f8592a.mo9834l()) {
            this.f8592a.mo9836o(this.f8601j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C5375g mo9803f(C2693m mVar) {
        if (this.f8597f == null) {
            return null;
        }
        return mVar.mo9822a();
    }

    /* renamed from: i */
    public void mo9804i(Rect rect) {
        this.f8597f = rect;
    }

    /* renamed from: j */
    public void mo9805j(C2682e eVar) {
        this.f8595d = eVar;
    }

    /* renamed from: k */
    public void mo9806k() {
        C2694n.m11984a();
        HandlerThread handlerThread = new HandlerThread(f8591k);
        this.f8593b = handlerThread;
        handlerThread.start();
        this.f8594c = new Handler(this.f8593b.getLooper(), this.f8600i);
        this.f8598g = true;
        m11955h();
    }

    /* renamed from: l */
    public void mo9807l() {
        C2694n.m11984a();
        synchronized (this.f8599h) {
            this.f8598g = false;
            this.f8594c.removeCallbacksAndMessages((Object) null);
            this.f8593b.quit();
        }
    }
}
