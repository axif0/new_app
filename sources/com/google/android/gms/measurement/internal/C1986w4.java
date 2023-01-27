package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C1673a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4456ac;
import p148g.p189d.p190a.p232c.p241f.p247f.C4501d2;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
final class C1986w4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4501d2 f6481f;

    /* renamed from: g */
    private final /* synthetic */ ServiceConnection f6482g;

    /* renamed from: h */
    private final /* synthetic */ C1998x4 f6483h;

    C1986w4(C1998x4 x4Var, C4501d2 d2Var, ServiceConnection serviceConnection) {
        this.f6483h = x4Var;
        this.f6481f = d2Var;
        this.f6482g = serviceConnection;
    }

    public final void run() {
        C1770e4 E;
        String str;
        C1998x4 x4Var = this.f6483h;
        C1962u4 u4Var = x4Var.f6508b;
        String a = x4Var.f6507a;
        C4501d2 d2Var = this.f6481f;
        ServiceConnection serviceConnection = this.f6482g;
        Bundle a2 = u4Var.mo7360a(a, d2Var);
        u4Var.f6409a.mo6706e().mo6700b();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                E = u4Var.f6409a.mo6709i().mo6767H();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    E = u4Var.f6409a.mo6709i().mo6764E();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    u4Var.f6409a.mo6709i().mo6772M().mo6886b("InstallReferrer API result", string);
                    C1788fa G = u4Var.f6409a.mo7024G();
                    String valueOf = String.valueOf(string);
                    Bundle A = G.mo6970A(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (A == null) {
                        E = u4Var.f6409a.mo6709i().mo6764E();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = A.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                E = u4Var.f6409a.mo6709i().mo6764E();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                A.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == u4Var.f6409a.mo7051x().f6140k.mo7343a()) {
                            E = u4Var.f6409a.mo6709i().mo6772M();
                            str = "Install Referrer campaign has already been logged";
                        } else if (!C4456ac.m18732b() || !u4Var.f6409a.mo7038b().mo7415s(C1957u.f6397v0) || u4Var.f6409a.mo7044p()) {
                            u4Var.f6409a.mo7051x().f6140k.mo7344b(j);
                            u4Var.f6409a.mo6709i().mo6772M().mo6886b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            A.putString("_cis", "referrer API");
                            u4Var.f6409a.mo7023F().mo7195X("auto", "_cmp", A);
                        }
                    }
                }
            }
            E.mo6885a(str);
        }
        if (serviceConnection != null) {
            C1673a.m7920b().mo6579c(u4Var.f6409a.mo6710j(), serviceConnection);
        }
    }
}
