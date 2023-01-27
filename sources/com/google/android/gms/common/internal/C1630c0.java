package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.C1639h;
import com.google.android.gms.common.stats.C1673a;
import java.util.HashMap;
import p148g.p189d.p190a.p232c.p241f.p245d.C4423d;

/* renamed from: com.google.android.gms.common.internal.c0 */
final class C1630c0 extends C1639h implements Handler.Callback {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final HashMap<C1639h.C1640a, C1632d0> f5480h = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f5481i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Handler f5482j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1673a f5483k;

    /* renamed from: l */
    private final long f5484l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f5485m;

    C1630c0(Context context) {
        this.f5481i = context.getApplicationContext();
        this.f5482j = new C4423d(context.getMainLooper(), this);
        this.f5483k = C1673a.m7920b();
        this.f5484l = 5000;
        this.f5485m = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo6513c(C1639h.C1640a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C1658o.m7846k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5480h) {
            C1632d0 d0Var = this.f5480h.get(aVar);
            if (d0Var == null) {
                d0Var = new C1632d0(this, aVar);
                d0Var.mo6520e(serviceConnection, str);
                d0Var.mo6523h(str);
                this.f5480h.put(aVar, d0Var);
            } else {
                this.f5482j.removeMessages(0, aVar);
                if (!d0Var.mo6521f(serviceConnection)) {
                    d0Var.mo6520e(serviceConnection, str);
                    int c = d0Var.mo6518c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(d0Var.mo6517b(), d0Var.mo6516a());
                    } else if (c == 2) {
                        d0Var.mo6523h(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = d0Var.mo6519d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo6514d(C1639h.C1640a aVar, ServiceConnection serviceConnection, String str) {
        C1658o.m7846k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5480h) {
            C1632d0 d0Var = this.f5480h.get(aVar);
            if (d0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (d0Var.mo6521f(serviceConnection)) {
                d0Var.mo6522g(serviceConnection, str);
                if (d0Var.mo6525j()) {
                    this.f5482j.sendMessageDelayed(this.f5482j.obtainMessage(0, aVar), this.f5484l);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f5480h) {
                C1639h.C1640a aVar = (C1639h.C1640a) message.obj;
                C1632d0 d0Var = this.f5480h.get(aVar);
                if (d0Var != null && d0Var.mo6525j()) {
                    if (d0Var.mo6519d()) {
                        d0Var.mo6524i("GmsClientSupervisor");
                    }
                    this.f5480h.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f5480h) {
                C1639h.C1640a aVar2 = (C1639h.C1640a) message.obj;
                C1632d0 d0Var2 = this.f5480h.get(aVar2);
                if (d0Var2 != null && d0Var2.mo6518c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = d0Var2.mo6517b();
                    if (b == null) {
                        b = aVar2.mo6538a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo6539b(), "unknown");
                    }
                    d0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
