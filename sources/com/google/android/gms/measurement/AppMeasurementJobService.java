package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C1739b9;
import com.google.android.gms.measurement.internal.C1787f9;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C1787f9 {

    /* renamed from: f */
    private C1739b9<AppMeasurementJobService> f5604f;

    /* renamed from: c */
    private final C1739b9<AppMeasurementJobService> m8032c() {
        if (this.f5604f == null) {
            this.f5604f = new C1739b9<>(this);
        }
        return this.f5604f;
    }

    /* renamed from: a */
    public final void mo6620a(Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: b */
    public final void mo6621b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: e */
    public final boolean mo6622e(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        m8032c().mo6739c();
    }

    public final void onDestroy() {
        m8032c().mo6743h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m8032c().mo6745k(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m8032c().mo6742g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return m8032c().mo6744i(intent);
    }
}
