package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import p148g.p189d.p190a.p232c.p241f.p247f.C4542f6;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
public final class C1955t9 extends C1967u9 {

    /* renamed from: d */
    private final AlarmManager f6298d = ((AlarmManager) mo6710j().getSystemService("alarm"));

    /* renamed from: e */
    private final C1837k f6299e;

    /* renamed from: f */
    private Integer f6300f;

    protected C1955t9(C2003x9 x9Var) {
        super(x9Var);
        this.f6299e = new C1943s9(this, x9Var.mo7459k0(), x9Var);
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m8873w() {
        ((JobScheduler) mo6710j().getSystemService("jobscheduler")).cancel(m8874x());
    }

    /* renamed from: x */
    private final int m8874x() {
        if (this.f6300f == null) {
            String valueOf = String.valueOf(mo6710j().getPackageName());
            this.f6300f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f6300f.intValue();
    }

    /* renamed from: y */
    private final PendingIntent m8875y() {
        Context j = mo6710j();
        return PendingIntent.getBroadcast(j, 0, new Intent().setClassName(j, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo6730t() {
        this.f6298d.cancel(m8875y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m8873w();
        return false;
    }

    /* renamed from: u */
    public final void mo7358u(long j) {
        mo7366r();
        Context j2 = mo6710j();
        if (!C2022z4.m9199b(j2)) {
            mo6709i().mo6771L().mo6885a("Receiver not registered/enabled");
        }
        if (!C1788fa.m8455Y(j2, false)) {
            mo6709i().mo6771L().mo6885a("Service not registered/enabled");
        }
        mo7359v();
        mo6709i().mo6772M().mo6886b("Scheduling upload, millis", Long.valueOf(j));
        long a = mo6708g().mo6585a() + j;
        if (j < Math.max(0, C1957u.f6400x.mo7323a(null).longValue()) && !this.f6299e.mo7166d()) {
            this.f6299e.mo7165c(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context j3 = mo6710j();
            ComponentName componentName = new ComponentName(j3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = m8874x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            C4542f6.m19401b(j3, new JobInfo.Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.f6298d.setInexactRepeating(2, a, Math.max(C1957u.f6390s.mo7323a(null).longValue(), j), m8875y());
    }

    /* renamed from: v */
    public final void mo7359v() {
        mo7366r();
        mo6709i().mo6772M().mo6885a("Unscheduling upload");
        this.f6298d.cancel(m8875y());
        this.f6299e.mo7167e();
        if (Build.VERSION.SDK_INT >= 24) {
            m8873w();
        }
    }
}
