package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p193t.C3765a;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p199y.C3827a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
public class C1509e implements C1527s {

    /* renamed from: a */
    private final Context f5090a;

    /* renamed from: b */
    private final C3784c f5091b;

    /* renamed from: c */
    private final C1511g f5092c;

    public C1509e(Context context, C3784c cVar, C1511g gVar) {
        this.f5090a = context;
        this.f5091b = cVar;
        this.f5092c = gVar;
    }

    /* renamed from: c */
    private boolean m7298c(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo6147a(C3755l lVar, int i) {
        ComponentName componentName = new ComponentName(this.f5090a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5090a.getSystemService("jobscheduler");
        int b = mo6165b(lVar);
        if (m7298c(jobScheduler, b, i)) {
            C3765a.m15704a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long N = this.f5091b.mo12383N(lVar);
        C1511g gVar = this.f5092c;
        JobInfo.Builder builder = new JobInfo.Builder(b, componentName);
        gVar.mo6167b(builder, lVar.mo12321d(), N, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", lVar.mo12319b());
        persistableBundle.putInt("priority", C3827a.m15877a(lVar.mo12321d()));
        if (lVar.mo12320c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(lVar.mo12320c(), 0));
        }
        builder.setExtras(persistableBundle);
        C3765a.m15705b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", lVar, Integer.valueOf(b), Long.valueOf(this.f5092c.mo6168f(lVar.mo12321d(), N, i)), Long.valueOf(N), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6165b(C3755l lVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5090a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(lVar.mo12319b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C3827a.m15877a(lVar.mo12321d())).array());
        if (lVar.mo12320c() != null) {
            adler32.update(lVar.mo12320c());
        }
        return (int) adler32.getValue();
    }
}
