package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
class C1878n4 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2003x9 f6077a;

    /* renamed from: b */
    private boolean f6078b;

    /* renamed from: c */
    private boolean f6079c;

    static {
        Class<C1878n4> cls = C1878n4.class;
    }

    C1878n4(C2003x9 x9Var) {
        C1658o.m7845j(x9Var);
        this.f6077a = x9Var;
    }

    /* renamed from: b */
    public final void mo7252b() {
        this.f6077a.mo7453g0();
        this.f6077a.mo6706e().mo6700b();
        if (!this.f6078b) {
            this.f6077a.mo6710j().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6079c = this.f6077a.mo7444X().mo7010x();
            this.f6077a.mo6709i().mo6772M().mo6886b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6079c));
            this.f6078b = true;
        }
    }

    /* renamed from: c */
    public final void mo7253c() {
        this.f6077a.mo7453g0();
        this.f6077a.mo6706e().mo6700b();
        this.f6077a.mo6706e().mo6700b();
        if (this.f6078b) {
            this.f6077a.mo6709i().mo6772M().mo6885a("Unregistering connectivity change receiver");
            this.f6078b = false;
            this.f6079c = false;
            try {
                this.f6077a.mo6710j().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6077a.mo6709i().mo6764E().mo6886b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f6077a.mo7453g0();
        String action = intent.getAction();
        this.f6077a.mo6709i().mo6772M().mo6886b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean x = this.f6077a.mo7444X().mo7010x();
            if (this.f6079c != x) {
                this.f6079c = x;
                this.f6077a.mo6706e().mo6703y(new C1866m4(this, x));
                return;
            }
            return;
        }
        this.f6077a.mo6709i().mo6767H().mo6886b("NetworkBroadcastReceiver received unknown action", action);
    }
}
