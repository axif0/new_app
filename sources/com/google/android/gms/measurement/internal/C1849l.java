package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C1849l {

    /* renamed from: a */
    final String f5977a;

    /* renamed from: b */
    final String f5978b;

    /* renamed from: c */
    private final String f5979c;

    /* renamed from: d */
    final long f5980d;

    /* renamed from: e */
    final long f5981e;

    /* renamed from: f */
    final C1873n f5982f;

    C1849l(C1807h5 h5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C1873n nVar;
        C1658o.m7841f(str2);
        C1658o.m7841f(str3);
        this.f5977a = str2;
        this.f5978b = str3;
        this.f5979c = TextUtils.isEmpty(str) ? null : str;
        this.f5980d = j;
        this.f5981e = j2;
        if (j2 != 0 && j2 > j) {
            h5Var.mo6709i().mo6767H().mo6886b("Event created with reverse previous/current timestamps. appId", C1746c4.m8178w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            nVar = new C1873n(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    h5Var.mo6709i().mo6764E().mo6885a("Param name can't be null");
                } else {
                    Object G = h5Var.mo7024G().mo6977G(str4, bundle2.get(str4));
                    if (G == null) {
                        h5Var.mo6709i().mo6767H().mo6886b("Param value can't be null", h5Var.mo7025H().mo6693y(str4));
                    } else {
                        h5Var.mo7024G().mo6984N(bundle2, str4, G);
                    }
                }
                it.remove();
            }
            nVar = new C1873n(bundle2);
        }
        this.f5982f = nVar;
    }

    private C1849l(C1807h5 h5Var, String str, String str2, String str3, long j, long j2, C1873n nVar) {
        C1658o.m7841f(str2);
        C1658o.m7841f(str3);
        C1658o.m7845j(nVar);
        this.f5977a = str2;
        this.f5978b = str3;
        this.f5979c = TextUtils.isEmpty(str) ? null : str;
        this.f5980d = j;
        this.f5981e = j2;
        if (j2 != 0 && j2 > j) {
            h5Var.mo6709i().mo6767H().mo6887c("Event created with reverse previous/current timestamps. appId, name", C1746c4.m8178w(str2), C1746c4.m8178w(str3));
        }
        this.f5982f = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1849l mo7176a(C1807h5 h5Var, long j) {
        return new C1849l(h5Var, this.f5979c, this.f5977a, this.f5978b, this.f5980d, j, this.f5982f);
    }

    public final String toString() {
        String str = this.f5977a;
        String str2 = this.f5978b;
        String valueOf = String.valueOf(this.f5982f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
