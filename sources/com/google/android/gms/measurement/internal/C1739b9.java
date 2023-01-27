package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.measurement.internal.C1787f9;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
public final class C1739b9<T extends Context & C1787f9> {

    /* renamed from: a */
    private final T f5678a;

    public C1739b9(T t) {
        C1658o.m7845j(t);
        this.f5678a = t;
    }

    /* renamed from: f */
    private final void m8126f(Runnable runnable) {
        C2003x9 d = C2003x9.m9118d(this.f5678a);
        d.mo6706e().mo6703y(new C1799g9(this, d, runnable));
    }

    /* renamed from: j */
    private final C1746c4 m8127j() {
        return C1807h5.m8537a(this.f5678a, (C4515e) null, (Long) null).mo6709i();
    }

    /* renamed from: a */
    public final int mo6737a(Intent intent, int i, int i2) {
        C1746c4 i3 = C1807h5.m8537a(this.f5678a, (C4515e) null, (Long) null).mo6709i();
        if (intent == null) {
            i3.mo6767H().mo6885a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        i3.mo6772M().mo6887c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m8126f(new C1775e9(this, i2, i3, intent));
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder mo6738b(Intent intent) {
        if (intent == null) {
            m8127j().mo6764E().mo6885a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C1819i5(C2003x9.m9118d(this.f5678a));
        }
        m8127j().mo6767H().mo6886b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final void mo6739c() {
        C1807h5.m8537a(this.f5678a, (C4515e) null, (Long) null).mo6709i().mo6772M().mo6885a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo6740d(int i, C1746c4 c4Var, Intent intent) {
        if (((C1787f9) this.f5678a).mo6622e(i)) {
            c4Var.mo6772M().mo6886b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m8127j().mo6772M().mo6885a("Completed wakeful intent.");
            ((C1787f9) this.f5678a).mo6620a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo6741e(C1746c4 c4Var, JobParameters jobParameters) {
        c4Var.mo6772M().mo6885a("AppMeasurementJobService processed last upload request.");
        ((C1787f9) this.f5678a).mo6621b(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: g */
    public final boolean mo6742g(JobParameters jobParameters) {
        C1746c4 i = C1807h5.m8537a(this.f5678a, (C4515e) null, (Long) null).mo6709i();
        String string = jobParameters.getExtras().getString("action");
        i.mo6772M().mo6886b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m8126f(new C1763d9(this, i, jobParameters));
        return true;
    }

    /* renamed from: h */
    public final void mo6743h() {
        C1807h5.m8537a(this.f5678a, (C4515e) null, (Long) null).mo6709i().mo6772M().mo6885a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: i */
    public final boolean mo6744i(Intent intent) {
        if (intent == null) {
            m8127j().mo6764E().mo6885a("onUnbind called with null intent");
            return true;
        }
        m8127j().mo6772M().mo6886b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final void mo6745k(Intent intent) {
        if (intent == null) {
            m8127j().mo6764E().mo6885a("onRebind called with null intent");
            return;
        }
        m8127j().mo6772M().mo6886b("onRebind called. action", intent.getAction());
    }
}
