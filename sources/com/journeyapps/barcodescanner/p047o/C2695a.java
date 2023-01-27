package com.journeyapps.barcodescanner.p047o;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.journeyapps.barcodescanner.o.a */
public final class C2695a {

    /* renamed from: i */
    private static final String f8620i = "a";

    /* renamed from: j */
    private static final Collection<String> f8621j;

    /* renamed from: a */
    private boolean f8622a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f8623b;

    /* renamed from: c */
    private final boolean f8624c;

    /* renamed from: d */
    private final Camera f8625d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f8626e = new Handler(this.f8628g);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f8627f = 1;

    /* renamed from: g */
    private final Handler.Callback f8628g = new C2696a();

    /* renamed from: h */
    private final Camera.AutoFocusCallback f8629h = new C2697b();

    /* renamed from: com.journeyapps.barcodescanner.o.a$a */
    class C2696a implements Handler.Callback {
        C2696a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != C2695a.this.f8627f) {
                return false;
            }
            C2695a.this.m11992h();
            return true;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.o.a$b */
    class C2697b implements Camera.AutoFocusCallback {

        /* renamed from: com.journeyapps.barcodescanner.o.a$b$a */
        class C2698a implements Runnable {
            C2698a() {
            }

            public void run() {
                boolean unused = C2695a.this.f8623b = false;
                C2695a.this.m11990f();
            }
        }

        C2697b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C2695a.this.f8626e.post(new C2698a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f8621j = arrayList;
        arrayList.add("auto");
        f8621j.add("macro");
    }

    public C2695a(Camera camera, C2708d dVar) {
        boolean z = true;
        this.f8625d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        this.f8624c = (!dVar.mo9868c() || !f8621j.contains(focusMode)) ? false : z;
        String str = f8620i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + this.f8624c);
        mo9826i();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m11990f() {
        if (!this.f8622a && !this.f8626e.hasMessages(this.f8627f)) {
            this.f8626e.sendMessageDelayed(this.f8626e.obtainMessage(this.f8627f), 2000);
        }
    }

    /* renamed from: g */
    private void m11991g() {
        this.f8626e.removeMessages(this.f8627f);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11992h() {
        if (this.f8624c && !this.f8622a && !this.f8623b) {
            try {
                this.f8625d.autoFocus(this.f8629h);
                this.f8623b = true;
            } catch (RuntimeException e) {
                Log.w(f8620i, "Unexpected exception while focusing", e);
                m11990f();
            }
        }
    }

    /* renamed from: i */
    public void mo9826i() {
        this.f8622a = false;
        m11992h();
    }

    /* renamed from: j */
    public void mo9827j() {
        this.f8622a = true;
        this.f8623b = false;
        m11991g();
        if (this.f8624c) {
            try {
                this.f8625d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f8620i, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
