package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.C1673a;
import com.google.android.gms.common.util.p038q.C1694a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.firebase.iid.g0 */
public class C2554g0 implements ServiceConnection {

    /* renamed from: a */
    private final Context f8268a;

    /* renamed from: b */
    private final Intent f8269b;

    /* renamed from: c */
    private final ScheduledExecutorService f8270c;

    /* renamed from: d */
    private final Queue<C2555a> f8271d;

    /* renamed from: e */
    private C2547d0 f8272e;

    /* renamed from: f */
    private boolean f8273f;

    /* renamed from: com.google.firebase.iid.g0$a */
    static class C2555a {

        /* renamed from: a */
        final Intent f8274a;

        /* renamed from: b */
        private final C4941i<Void> f8275b = new C4941i<>();

        C2555a(Intent intent) {
            this.f8274a = intent;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9450a(ScheduledExecutorService scheduledExecutorService) {
            mo9452c().mo14864b(scheduledExecutorService, new C2552f0(scheduledExecutorService.schedule(new C2550e0(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9451b() {
            this.f8275b.mo14887e(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4940h<Void> mo9452c() {
            return this.f8275b.mo14883a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final /* synthetic */ void mo9453d() {
            String action = this.f8274a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseInstanceId", sb.toString());
            mo9451b();
        }
    }

    public C2554g0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C1694a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    C2554g0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8271d = new ArrayDeque();
        this.f8273f = false;
        this.f8268a = context.getApplicationContext();
        this.f8269b = new Intent(str).setPackage(this.f8268a.getPackageName());
        this.f8270c = scheduledExecutorService;
    }

    /* renamed from: a */
    private void m11420a() {
        while (!this.f8271d.isEmpty()) {
            this.f8271d.poll().mo9451b();
        }
    }

    /* renamed from: b */
    private synchronized void m11421b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f8271d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            if (this.f8272e == null || !this.f8272e.isBinderAlive()) {
                m11422d();
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
            }
            this.f8272e.mo9441b(this.f8271d.poll());
        }
    }

    /* renamed from: d */
    private void m11422d() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f8273f);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        if (!this.f8273f) {
            this.f8273f = true;
            try {
                if (!C1673a.m7920b().mo6578a(this.f8268a, this.f8269b, this, 65)) {
                    Log.e("FirebaseInstanceId", "binding to the service failed");
                    this.f8273f = false;
                    m11420a();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseInstanceId", "Exception while binding the service", e);
            }
        }
    }

    /* renamed from: c */
    public synchronized C4940h<Void> mo9447c(Intent intent) {
        C2555a aVar;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C2555a(intent);
        aVar.mo9450a(this.f8270c);
        this.f8271d.add(aVar);
        m11421b();
        return aVar.mo9452c();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f8273f = false;
        if (!(iBinder instanceof C2547d0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            m11420a();
            return;
        }
        this.f8272e = (C2547d0) iBinder;
        m11421b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        m11421b();
    }
}
