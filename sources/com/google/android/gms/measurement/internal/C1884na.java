package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.na */
public final class C1884na {

    /* renamed from: a */
    private final C1807h5 f6089a;

    public C1884na(C1807h5 h5Var) {
        this.f6089a = h5Var;
    }

    /* renamed from: d */
    private final boolean m8746d() {
        return m8747e() && this.f6089a.mo6708g().mo6587c() - this.f6089a.mo7051x().f6130B.mo7343a() > this.f6089a.mo7038b().mo7412p((String) null, C1957u.f6332M0);
    }

    /* renamed from: e */
    private final boolean m8747e() {
        return this.f6089a.mo7051x().f6130B.mo7343a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7259a() {
        this.f6089a.mo6706e().mo6700b();
        if (m8747e()) {
            if (m8746d()) {
                this.f6089a.mo7051x().f6129A.mo7378b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f6089a.mo7023F().mo7195X("auto", "_cmpx", bundle);
            } else {
                String a = this.f6089a.mo7051x().f6129A.mo7377a();
                if (TextUtils.isEmpty(a)) {
                    this.f6089a.mo6709i().mo6765F().mo6885a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f6089a.mo7051x().f6130B.mo7343a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    this.f6089a.mo7023F().mo7195X((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f6089a.mo7051x().f6129A.mo7378b((String) null);
            }
            this.f6089a.mo7051x().f6130B.mo7344b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7260b(String str, Bundle bundle) {
        String str2;
        this.f6089a.mo6706e().mo6700b();
        if (!this.f6089a.mo7044p()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f6089a.mo7051x().f6129A.mo7378b(str2);
                this.f6089a.mo7051x().f6130B.mo7344b(this.f6089a.mo6708g().mo6587c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7261c() {
        if (m8747e() && m8746d()) {
            this.f6089a.mo7051x().f6129A.mo7378b((String) null);
        }
    }
}
