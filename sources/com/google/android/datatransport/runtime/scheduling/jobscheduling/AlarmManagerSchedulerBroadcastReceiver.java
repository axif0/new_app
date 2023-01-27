package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.C3761q;
import p148g.p189d.p190a.p191a.p192i.p199y.C3827a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m7284a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C3761q.m15694f(context);
        C3755l.C3756a a = C3755l.m15675a();
        a.mo12325b(queryParameter);
        a.mo12327d(C3827a.m15878b(intValue));
        if (queryParameter2 != null) {
            a.mo12326c(Base64.decode(queryParameter2, 0));
        }
        C3761q.m15692c().mo12352e().mo6176g(a.mo12324a(), i, C1504b.m7288a());
    }
}
