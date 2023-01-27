package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.C1673a;
import java.util.List;
import p148g.p189d.p190a.p232c.p237d.p239p.C4388b;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;
import p148g.p189d.p190a.p232c.p241f.p247f.C4501d2;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
public final class C1962u4 {

    /* renamed from: a */
    final C1807h5 f6409a;

    C1962u4(C1807h5 h5Var) {
        this.f6409a = h5Var;
    }

    /* renamed from: c */
    private final boolean m9008c() {
        try {
            C4388b a = C4389c.m18627a(this.f6409a.mo6710j());
            if (a != null) {
                return a.mo13717e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f6409a.mo6709i().mo6772M().mo6885a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f6409a.mo6709i().mo6772M().mo6886b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo7360a(String str, C4501d2 d2Var) {
        this.f6409a.mo6706e().mo6700b();
        if (d2Var == null) {
            this.f6409a.mo6709i().mo6767H().mo6885a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle g = d2Var.mo14032g(bundle);
            if (g != null) {
                return g;
            }
            this.f6409a.mo6709i().mo6764E().mo6885a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f6409a.mo6709i().mo6764E().mo6886b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7361b(String str) {
        if (str == null || str.isEmpty()) {
            this.f6409a.mo6709i().mo6768I().mo6885a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f6409a.mo6706e().mo6700b();
        if (!m9008c()) {
            this.f6409a.mo6709i().mo6770K().mo6885a("Install Referrer Reporter is not available");
            return;
        }
        C1998x4 x4Var = new C1998x4(this, str);
        this.f6409a.mo6706e().mo6700b();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f6409a.mo6710j().getPackageManager();
        if (packageManager == null) {
            this.f6409a.mo6709i().mo6768I().mo6885a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f6409a.mo6709i().mo6770K().mo6885a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !m9008c()) {
                this.f6409a.mo6709i().mo6767H().mo6885a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f6409a.mo6709i().mo6772M().mo6886b("Install Referrer Service is", C1673a.m7920b().mo6578a(this.f6409a.mo6710j(), new Intent(intent), x4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f6409a.mo6709i().mo6764E().mo6886b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
