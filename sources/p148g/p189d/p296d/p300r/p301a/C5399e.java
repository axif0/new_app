package p148g.p189d.p296d.p300r.p301a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: g.d.d.r.a.e */
public final class C5399e {

    /* renamed from: a */
    private final Context f15624a;

    /* renamed from: b */
    private final BroadcastReceiver f15625b;

    /* renamed from: c */
    private boolean f15626c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f15627d;

    /* renamed from: e */
    private Runnable f15628e;

    /* renamed from: f */
    private boolean f15629f;

    /* renamed from: g.d.d.r.a.e$b */
    private final class C5401b extends BroadcastReceiver {

        /* renamed from: g.d.d.r.a.e$b$a */
        class C5402a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ boolean f15631f;

            C5402a(boolean z) {
                this.f15631f = z;
            }

            public void run() {
                C5399e.this.m22265f(this.f15631f);
            }
        }

        private C5401b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                C5399e.this.f15627d.post(new C5402a(intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public C5399e(Context context, Runnable runnable) {
        this.f15624a = context;
        this.f15628e = runnable;
        this.f15625b = new C5401b();
        this.f15627d = new Handler();
    }

    /* renamed from: e */
    private void m22264e() {
        this.f15627d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m22265f(boolean z) {
        this.f15629f = z;
        if (this.f15626c) {
            mo15642c();
        }
    }

    /* renamed from: g */
    private void m22266g() {
        if (!this.f15626c) {
            this.f15624a.registerReceiver(this.f15625b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f15626c = true;
        }
    }

    /* renamed from: i */
    private void m22267i() {
        if (this.f15626c) {
            this.f15624a.unregisterReceiver(this.f15625b);
            this.f15626c = false;
        }
    }

    /* renamed from: c */
    public void mo15642c() {
        m22264e();
        if (this.f15629f) {
            this.f15627d.postDelayed(this.f15628e, 300000);
        }
    }

    /* renamed from: d */
    public void mo15643d() {
        m22264e();
        m22267i();
    }

    /* renamed from: h */
    public void mo15644h() {
        m22266g();
        mo15642c();
    }
}
