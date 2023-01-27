package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C1658o;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
public final class C2022z4 {

    /* renamed from: a */
    private final C2011y4 f6566a;

    public C2022z4(C2011y4 y4Var) {
        C1658o.m7845j(y4Var);
        this.f6566a = y4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9199b(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.C1658o.m7845j(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2022z4.m9199b(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final void mo7481a(Context context, Intent intent) {
        C1746c4 i = C1807h5.m8537a(context, (C4515e) null, (Long) null).mo6709i();
        if (intent == null) {
            i.mo6767H().mo6885a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        i.mo6772M().mo6886b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            i.mo6772M().mo6885a("Starting wakeful intent.");
            this.f6566a.mo6629a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            i.mo6767H().mo6885a("Install Referrer Broadcasts are deprecated");
        }
    }
}
