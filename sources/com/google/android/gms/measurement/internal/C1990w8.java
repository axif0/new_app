package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.internal.C1613b;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.stats.C1673a;
import p148g.p189d.p190a.p232c.p237d.C4366b;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
public final class C1990w8 implements ServiceConnection, C1613b.C1614a, C1613b.C1615b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f6494a;

    /* renamed from: b */
    private volatile C2021z3 f6495b;

    /* renamed from: c */
    final /* synthetic */ C1750c8 f6496c;

    protected C1990w8(C1750c8 c8Var) {
        this.f6496c = c8Var;
    }

    /* renamed from: a */
    public final void mo7390a() {
        if (this.f6495b != null && (this.f6495b.mo6459b() || this.f6495b.mo6465i())) {
            this.f6495b.mo6469m();
        }
        this.f6495b = null;
    }

    /* renamed from: b */
    public final void mo7391b(Intent intent) {
        this.f6496c.mo6700b();
        Context j = this.f6496c.mo6710j();
        C1673a b = C1673a.m7920b();
        synchronized (this) {
            if (this.f6494a) {
                this.f6496c.mo6709i().mo6772M().mo6885a("Connection attempt already in progress");
                return;
            }
            this.f6496c.mo6709i().mo6772M().mo6885a("Using local app measurement service");
            this.f6494a = true;
            b.mo6578a(j, intent, this.f6496c.f5702c, 129);
        }
    }

    /* renamed from: d */
    public final void mo7392d() {
        this.f6496c.mo6700b();
        Context j = this.f6496c.mo6710j();
        synchronized (this) {
            if (this.f6494a) {
                this.f6496c.mo6709i().mo6772M().mo6885a("Connection attempt already in progress");
            } else if (this.f6495b == null || (!this.f6495b.mo6465i() && !this.f6495b.mo6459b())) {
                this.f6495b = new C2021z3(j, Looper.getMainLooper(), this, this);
                this.f6496c.mo6709i().mo6772M().mo6885a("Connecting to remote service");
                this.f6494a = true;
                this.f6495b.mo6472r();
            } else {
                this.f6496c.mo6709i().mo6772M().mo6885a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: n */
    public final void mo6481n(int i) {
        C1658o.m7840e("MeasurementServiceConnection.onConnectionSuspended");
        this.f6496c.mo6709i().mo6771L().mo6885a("Service connection suspended");
        this.f6496c.mo6706e().mo6703y(new C1727a9(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f6496c.mo6709i().mo6764E().mo6885a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C1658o.m7840e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f6494a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.c8 r4 = r3.f6496c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6764E()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo6885a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C1961u3     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C1961u3) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.w3 r1 = new com.google.android.gms.measurement.internal.w3     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.c8 r5 = r3.f6496c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo6709i()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6772M()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo6885a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.c8 r5 = r3.f6496c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo6709i()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6764E()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo6886b(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.c8 r5 = r3.f6496c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo6709i()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6764E()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo6885a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f6494a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C1673a.m7920b()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.c8 r5 = r3.f6496c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.mo6710j()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.c8 r0 = r3.f6496c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.w8 r0 = r0.f5702c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo6579c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.c8 r4 = r3.f6496c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.a5 r4 = r4.mo6706e()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.v8 r5 = new com.google.android.gms.measurement.internal.v8     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo6703y(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1990w8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C1658o.m7840e("MeasurementServiceConnection.onServiceDisconnected");
        this.f6496c.mo6709i().mo6771L().mo6885a("Service disconnected");
        this.f6496c.mo6706e().mo6703y(new C2015y8(this, componentName));
    }

    /* renamed from: r */
    public final void mo6483r(C4366b bVar) {
        C1658o.m7840e("MeasurementServiceConnection.onConnectionFailed");
        C1746c4 B = this.f6496c.f5634a.mo7019B();
        if (B != null) {
            B.mo6767H().mo6886b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f6494a = false;
            this.f6495b = null;
        }
        this.f6496c.mo6706e().mo6703y(new C2026z8(this));
    }

    /* renamed from: w */
    public final void mo6482w(Bundle bundle) {
        C1658o.m7840e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f6496c.mo6706e().mo6703y(new C2002x8(this, (C1961u3) this.f6495b.mo6447B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f6495b = null;
                this.f6494a = false;
            }
        }
    }
}
