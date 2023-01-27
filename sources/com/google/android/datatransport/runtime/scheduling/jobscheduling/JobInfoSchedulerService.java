package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.C3761q;
import p148g.p189d.p190a.p191a.p192i.p199y.C3827a;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C3761q.m15694f(getApplicationContext());
        C3755l.C3756a a = C3755l.m15675a();
        a.mo12325b(string);
        a.mo12327d(C3827a.m15878b(i));
        if (string2 != null) {
            a.mo12326c(Base64.decode(string2, 0));
        }
        C3761q.m15692c().mo12352e().mo6176g(a.mo12324a(), i2, C1510f.m7301a(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
