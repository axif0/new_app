package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
final /* synthetic */ class C1763d9 implements Runnable {

    /* renamed from: f */
    private final C1739b9 f5738f;

    /* renamed from: g */
    private final C1746c4 f5739g;

    /* renamed from: h */
    private final JobParameters f5740h;

    C1763d9(C1739b9 b9Var, C1746c4 c4Var, JobParameters jobParameters) {
        this.f5738f = b9Var;
        this.f5739g = c4Var;
        this.f5740h = jobParameters;
    }

    public final void run() {
        this.f5738f.mo6741e(this.f5739g, this.f5740h);
    }
}
