package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p193t.C3765a;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p148g.p189d.p190a.p191a.p192i.p199y.C3827a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public class C1503a implements C1527s {

    /* renamed from: a */
    private final Context f5076a;

    /* renamed from: b */
    private final C3784c f5077b;

    /* renamed from: c */
    private AlarmManager f5078c;

    /* renamed from: d */
    private final C1511g f5079d;

    /* renamed from: e */
    private final C3821a f5080e;

    C1503a(Context context, C3784c cVar, AlarmManager alarmManager, C3821a aVar, C1511g gVar) {
        this.f5076a = context;
        this.f5077b = cVar;
        this.f5078c = alarmManager;
        this.f5080e = aVar;
        this.f5079d = gVar;
    }

    public C1503a(Context context, C3784c cVar, C3821a aVar, C1511g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    /* renamed from: a */
    public void mo6147a(C3755l lVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", lVar.mo12319b());
        builder.appendQueryParameter("priority", String.valueOf(C3827a.m15877a(lVar.mo12321d())));
        if (lVar.mo12320c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(lVar.mo12320c(), 0));
        }
        Intent intent = new Intent(this.f5076a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (mo6148b(intent)) {
            C3765a.m15704a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long N = this.f5077b.mo12383N(lVar);
        long f = this.f5079d.mo6168f(lVar.mo12321d(), N, i);
        C3765a.m15705b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", lVar, Long.valueOf(f), Long.valueOf(N), Integer.valueOf(i));
        this.f5078c.set(3, this.f5080e.mo12402a() + f, PendingIntent.getBroadcast(this.f5076a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6148b(Intent intent) {
        return PendingIntent.getBroadcast(this.f5076a, 0, intent, 536870912) != null;
    }
}
