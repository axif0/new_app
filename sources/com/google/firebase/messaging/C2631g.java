package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.C2543b0;
import com.google.firebase.iid.C2547d0;
import java.util.concurrent.ExecutorService;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4941i;
import p148g.p189d.p190a.p232c.p251i.C4944k;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.g */
public abstract class C2631g extends Service {

    /* renamed from: f */
    final ExecutorService f8436f = C2633h.m11713b();

    /* renamed from: g */
    private Binder f8437g;

    /* renamed from: h */
    private final Object f8438h = new Object();

    /* renamed from: i */
    private int f8439i;

    /* renamed from: j */
    private int f8440j = 0;

    /* renamed from: com.google.firebase.messaging.g$a */
    class C2632a implements C2547d0.C2548a {
        C2632a() {
        }

        /* renamed from: a */
        public C4940h<Void> mo9442a(Intent intent) {
            return C2631g.this.m11704h(intent);
        }
    }

    /* renamed from: b */
    private void m11703b(Intent intent) {
        if (intent != null) {
            C2543b0.m11400b(intent);
        }
        synchronized (this.f8438h) {
            int i = this.f8440j - 1;
            this.f8440j = i;
            if (i == 0) {
                mo9581i(this.f8439i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C4940h<Void> m11704h(Intent intent) {
        if (mo9572e(intent)) {
            return C4944k.m20949e(null);
        }
        C4941i iVar = new C4941i();
        this.f8436f.execute(new C2628d(this, intent, iVar));
        return iVar.mo14883a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Intent mo9570c(Intent intent);

    /* renamed from: d */
    public abstract void mo9571d(Intent intent);

    /* renamed from: e */
    public abstract boolean mo9572e(Intent intent);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo9579f(Intent intent, C4940h hVar) {
        m11703b(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9580g(Intent intent, C4941i iVar) {
        try {
            mo9571d(intent);
        } finally {
            iVar.mo14885c(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9581i(int i) {
        return stopSelfResult(i);
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f8437g == null) {
            this.f8437g = new C2547d0(new C2632a());
        }
        return this.f8437g;
    }

    public void onDestroy() {
        this.f8436f.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f8438h) {
            this.f8439i = i2;
            this.f8440j++;
        }
        Intent c = mo9570c(intent);
        if (c == null) {
            m11703b(intent);
            return 2;
        }
        C4940h<Void> h = m11704h(c);
        if (h.mo14873k()) {
            m11703b(intent);
            return 2;
        }
        h.mo14864b(C2629e.f8433a, new C2630f(this, intent));
        return 3;
    }
}
