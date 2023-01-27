package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C1739b9;
import com.google.android.gms.measurement.internal.C1787f9;
import p086f.p135n.p136a.C3457a;

public final class AppMeasurementService extends Service implements C1787f9 {

    /* renamed from: f */
    private C1739b9<AppMeasurementService> f5606f;

    /* renamed from: c */
    private final C1739b9<AppMeasurementService> m8037c() {
        if (this.f5606f == null) {
            this.f5606f = new C1739b9<>(this);
        }
        return this.f5606f;
    }

    /* renamed from: a */
    public final void mo6620a(Intent intent) {
        C3457a.m14936b(intent);
    }

    /* renamed from: b */
    public final void mo6621b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final boolean mo6622e(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return m8037c().mo6738b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m8037c().mo6739c();
    }

    public final void onDestroy() {
        m8037c().mo6743h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m8037c().mo6745k(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m8037c().mo6737a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return m8037c().mo6744i(intent);
    }
}
