package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C2437d;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p277d.C5144c;

/* renamed from: com.google.android.play.core.assetpacks.w */
final class C2418w extends C5144c<C2327c> {

    /* renamed from: g */
    private final C2379m1 f8000g;

    /* renamed from: h */
    private final C2415v0 f8001h;

    /* renamed from: i */
    private final C5099e0<C2371k3> f8002i;

    /* renamed from: j */
    private final C2378m0 f8003j;

    /* renamed from: k */
    private final C2427y0 f8004k;

    /* renamed from: l */
    private final C2437d f8005l;

    /* renamed from: m */
    private final C5099e0<Executor> f8006m;

    /* renamed from: n */
    private final C5099e0<Executor> f8007n;

    /* renamed from: o */
    private final Handler f8008o = new Handler(Looper.getMainLooper());

    C2418w(Context context, C2379m1 m1Var, C2415v0 v0Var, C5099e0<C2371k3> e0Var, C2427y0 y0Var, C2378m0 m0Var, C2437d dVar, C5099e0<Executor> e0Var2, C5099e0<Executor> e0Var3) {
        super(new C5100f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f8000g = m1Var;
        this.f8001h = v0Var;
        this.f8002i = e0Var;
        this.f8004k = y0Var;
        this.f8003j = m0Var;
        this.f8005l = dVar;
        this.f8006m = e0Var2;
        this.f8007n = e0Var3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9252a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f15167a.mo15205e("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
            if (bundleExtra2 != null) {
                this.f8005l.mo9278a(bundleExtra2);
            }
            C2327c b = C2327c.m10810b(bundleExtra, stringArrayList.get(0), this.f8004k, C2426y.f8049a);
            this.f15167a.mo15203c("ListenerRegistryBroadcastReceiver.onReceive: %s", b);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f8003j.mo9196a(pendingIntent);
            }
            this.f8007n.mo15202d().execute(new C2410u(this, bundleExtra, b));
            this.f8006m.mo15202d().execute(new C2414v(this, bundleExtra));
            return;
        }
        this.f15167a.mo15205e("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo9253h(Bundle bundle) {
        if (this.f8000g.mo9200e(bundle)) {
            this.f8001h.mo9251a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo9254i(Bundle bundle, C2327c cVar) {
        if (this.f8000g.mo9204i(bundle)) {
            mo9255j(cVar);
            this.f8002i.mo15202d().mo9162d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo9255j(C2327c cVar) {
        this.f8008o.post(new C2406t(this, cVar));
    }
}
