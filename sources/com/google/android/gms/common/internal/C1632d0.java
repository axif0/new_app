package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1639h;
import com.google.android.gms.common.stats.C1673a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.d0 */
final class C1632d0 implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f5487a = new HashSet();

    /* renamed from: b */
    private int f5488b = 2;

    /* renamed from: c */
    private boolean f5489c;

    /* renamed from: d */
    private IBinder f5490d;

    /* renamed from: e */
    private final C1639h.C1640a f5491e;

    /* renamed from: f */
    private ComponentName f5492f;

    /* renamed from: g */
    private final /* synthetic */ C1630c0 f5493g;

    public C1632d0(C1630c0 c0Var, C1639h.C1640a aVar) {
        this.f5493g = c0Var;
        this.f5491e = aVar;
    }

    /* renamed from: a */
    public final IBinder mo6516a() {
        return this.f5490d;
    }

    /* renamed from: b */
    public final ComponentName mo6517b() {
        return this.f5492f;
    }

    /* renamed from: c */
    public final int mo6518c() {
        return this.f5488b;
    }

    /* renamed from: d */
    public final boolean mo6519d() {
        return this.f5489c;
    }

    /* renamed from: e */
    public final void mo6520e(ServiceConnection serviceConnection, String str) {
        C1673a unused = this.f5493g.f5483k;
        Context unused2 = this.f5493g.f5481i;
        this.f5491e.mo6540c(this.f5493g.f5481i);
        this.f5487a.add(serviceConnection);
    }

    /* renamed from: f */
    public final boolean mo6521f(ServiceConnection serviceConnection) {
        return this.f5487a.contains(serviceConnection);
    }

    /* renamed from: g */
    public final void mo6522g(ServiceConnection serviceConnection, String str) {
        C1673a unused = this.f5493g.f5483k;
        Context unused2 = this.f5493g.f5481i;
        this.f5487a.remove(serviceConnection);
    }

    /* renamed from: h */
    public final void mo6523h(String str) {
        this.f5488b = 3;
        boolean d = this.f5493g.f5483k.mo6580d(this.f5493g.f5481i, str, this.f5491e.mo6540c(this.f5493g.f5481i), this, this.f5491e.mo6541d());
        this.f5489c = d;
        if (d) {
            this.f5493g.f5482j.sendMessageDelayed(this.f5493g.f5482j.obtainMessage(1, this.f5491e), this.f5493g.f5485m);
            return;
        }
        this.f5488b = 2;
        try {
            this.f5493g.f5483k.mo6579c(this.f5493g.f5481i, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: i */
    public final void mo6524i(String str) {
        this.f5493g.f5482j.removeMessages(1, this.f5491e);
        this.f5493g.f5483k.mo6579c(this.f5493g.f5481i, this);
        this.f5489c = false;
        this.f5488b = 2;
    }

    /* renamed from: j */
    public final boolean mo6525j() {
        return this.f5487a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5493g.f5480h) {
            this.f5493g.f5482j.removeMessages(1, this.f5491e);
            this.f5490d = iBinder;
            this.f5492f = componentName;
            for (ServiceConnection onServiceConnected : this.f5487a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f5488b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5493g.f5480h) {
            this.f5493g.f5482j.removeMessages(1, this.f5491e);
            this.f5490d = null;
            this.f5492f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f5487a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f5488b = 2;
        }
    }
}
