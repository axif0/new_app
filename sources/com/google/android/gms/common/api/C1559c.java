package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C1580d0;
import java.util.ArrayList;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p237d.C4366b;

/* renamed from: com.google.android.gms.common.api.c */
public class C1559c extends Exception {

    /* renamed from: f */
    private final C3190a<C1580d0<?>, C4366b> f5317f;

    public C1559c(C3190a<C1580d0<?>, C4366b> aVar) {
        this.f5317f = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1580d0 next : this.f5317f.keySet()) {
            C4366b bVar = this.f5317f.get(next);
            if (bVar.mo13679j()) {
                z = false;
            }
            String a = next.mo6409a();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
