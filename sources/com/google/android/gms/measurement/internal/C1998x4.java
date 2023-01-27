package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p148g.p189d.p190a.p232c.p241f.p247f.C4501d2;
import p148g.p189d.p190a.p232c.p241f.p247f.C4541f5;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final class C1998x4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6507a;

    /* renamed from: b */
    final /* synthetic */ C1962u4 f6508b;

    C1998x4(C1962u4 u4Var, String str) {
        this.f6508b = u4Var;
        this.f6507a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f6508b.f6409a.mo6709i().mo6767H().mo6885a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C4501d2 r = C4541f5.m19399r(iBinder);
            if (r == null) {
                this.f6508b.f6409a.mo6709i().mo6767H().mo6885a("Install Referrer Service implementation was not found");
                return;
            }
            this.f6508b.f6409a.mo6709i().mo6772M().mo6885a("Install Referrer Service connected");
            this.f6508b.f6409a.mo6706e().mo6703y(new C1986w4(this, r, this));
        } catch (Exception e) {
            this.f6508b.f6409a.mo6709i().mo6767H().mo6886b("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6508b.f6409a.mo6709i().mo6772M().mo6885a("Install Referrer Service disconnected");
    }
}
