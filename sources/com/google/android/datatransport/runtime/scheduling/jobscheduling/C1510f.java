package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
final /* synthetic */ class C1510f implements Runnable {

    /* renamed from: f */
    private final JobInfoSchedulerService f5093f;

    /* renamed from: g */
    private final JobParameters f5094g;

    private C1510f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f5093f = jobInfoSchedulerService;
        this.f5094g = jobParameters;
    }

    /* renamed from: a */
    public static Runnable m7301a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new C1510f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f5093f.jobFinished(this.f5094g, false);
    }
}
