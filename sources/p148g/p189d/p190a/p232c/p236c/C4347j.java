package p148g.p189d.p190a.p232c.p236c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C1673a;
import java.util.ArrayDeque;
import java.util.Queue;
import p148g.p189d.p190a.p232c.p241f.p244c.C4418e;

/* renamed from: g.d.a.c.c.j */
final class C4347j implements ServiceConnection {

    /* renamed from: a */
    int f13863a;

    /* renamed from: b */
    final Messenger f13864b;

    /* renamed from: c */
    C4356s f13865c;

    /* renamed from: d */
    final Queue<C4358u<?>> f13866d;

    /* renamed from: e */
    final SparseArray<C4358u<?>> f13867e;

    /* renamed from: f */
    final /* synthetic */ C4346i f13868f;

    private C4347j(C4346i iVar) {
        this.f13868f = iVar;
        this.f13863a = 0;
        this.f13864b = new Messenger(new C4418e(Looper.getMainLooper(), new C4350m(this)));
        this.f13866d = new ArrayDeque();
        this.f13867e = new SparseArray<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13645a() {
        this.f13868f.f13860b.execute(new C4351n(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo13646b(int i) {
        C4358u uVar = this.f13867e.get(i);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f13867e.remove(i);
            uVar.mo13663b(new C4357t(3, "Timed out waiting for response"));
            mo13650f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo13647c(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f13863a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f13863a = 4;
            C1673a.m7920b().mo6579c(this.f13868f.f13859a, this);
            C4357t tVar = new C4357t(i, str);
            for (C4358u b : this.f13866d) {
                b.mo13663b(tVar);
            }
            this.f13866d.clear();
            for (int i3 = 0; i3 < this.f13867e.size(); i3++) {
                this.f13867e.valueAt(i3).mo13663b(tVar);
            }
            this.f13867e.clear();
        } else if (i2 == 3) {
            this.f13863a = 4;
        } else if (i2 != 4) {
            int i4 = this.f13863a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.mo13663b(new p148g.p189d.p190a.p232c.p236c.C4357t(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo13660a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13648d(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Received response to request: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r1, r2)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<g.d.a.c.c.u<?>> r1 = r4.f13867e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            g.d.a.c.c.u r1 = (p148g.p189d.p190a.p232c.p236c.C4358u) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<g.d.a.c.c.u<?>> r3 = r4.f13867e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo13650f()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x006b
            g.d.a.c.c.t r5 = new g.d.a.c.c.t
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo13663b(r5)
            goto L_0x006e
        L_0x006b:
            r1.mo13660a(r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p236c.C4347j.mo13648d(android.os.Message):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13649e(p148g.p189d.p190a.p232c.p236c.C4358u<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f13863a     // Catch:{ all -> 0x0097 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            int r0 = r5.f13863a     // Catch:{ all -> 0x0097 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2.<init>(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x0097 }
            r2.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0097 }
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<g.d.a.c.c.u<?>> r0 = r5.f13866d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            r5.mo13645a()     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<g.d.a.c.c.u<?>> r0 = r5.f13866d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<g.d.a.c.c.u<?>> r0 = r5.f13866d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            int r6 = r5.f13863a     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            com.google.android.gms.common.internal.C1658o.m7848m(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0097 }
        L_0x005f:
            r5.f13863a = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C1673a.m7920b()     // Catch:{ all -> 0x0097 }
            g.d.a.c.c.i r1 = r5.f13868f     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.f13859a     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.mo6578a(r1, r6, r5, r3)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "Unable to bind to service"
            r5.mo13647c(r2, r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            g.d.a.c.c.i r6 = r5.f13868f     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f13860b     // Catch:{ all -> 0x0097 }
            g.d.a.c.c.l r0 = new g.d.a.c.c.l     // Catch:{ all -> 0x0097 }
            r0.<init>(r5)     // Catch:{ all -> 0x0097 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r5)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p236c.C4347j.mo13649e(g.d.a.c.c.u):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo13650f() {
        if (this.f13863a == 2 && this.f13866d.isEmpty() && this.f13867e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f13863a = 3;
            C1673a.m7920b().mo6579c(this.f13868f.f13859a, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo13651g() {
        if (this.f13863a == 1) {
            mo13647c(1, "Timed out while binding");
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f13868f.f13860b.execute(new C4352o(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f13868f.f13860b.execute(new C4354q(this));
    }
}
