package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p148g.p189d.p190a.p232c.p241f.p247f.C4907zc;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
final /* synthetic */ class C1892o6 implements Runnable {

    /* renamed from: f */
    private final C1856l6 f6109f;

    /* renamed from: g */
    private final Bundle f6110g;

    C1892o6(C1856l6 l6Var, Bundle bundle) {
        this.f6109f = l6Var;
        this.f6110g = bundle;
    }

    public final void run() {
        C1856l6 l6Var = this.f6109f;
        Bundle bundle = this.f6110g;
        if (C4907zc.m20843b() && l6Var.mo6712l().mo7415s(C1957u.f6322H0)) {
            if (bundle == null) {
                l6Var.mo6711k().f6131C.mo7308b(new Bundle());
                return;
            }
            Bundle a = l6Var.mo6711k().f6131C.mo7307a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    l6Var.mo6707f();
                    if (C1788fa.m8459c0(obj)) {
                        l6Var.mo6707f().mo6980J(27, (String) null, (String) null, 0);
                    }
                    l6Var.mo6709i().mo6769J().mo6887c("Invalid default event parameter type. Name, value", str, obj);
                } else if (C1788fa.m8443C0(str)) {
                    l6Var.mo6709i().mo6769J().mo6886b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else if (l6Var.mo6707f().mo6998h0("param", str, 100, obj)) {
                    l6Var.mo6707f().mo6984N(a, str, obj);
                }
            }
            l6Var.mo6707f();
            if (C1788fa.m8457a0(a, l6Var.mo6712l().mo7420x())) {
                l6Var.mo6707f().mo6980J(26, (String) null, (String) null, 0);
                l6Var.mo6709i().mo6769J().mo6885a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            l6Var.mo6711k().f6131C.mo7308b(a);
            l6Var.mo6857r().mo6777E(a);
        }
    }
}
