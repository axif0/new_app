package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1559c;
import java.util.Map;
import java.util.Set;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p237d.C4366b;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
public final class C1582e0 {

    /* renamed from: a */
    private final C3190a<C1580d0<?>, C4366b> f5388a;

    /* renamed from: b */
    private final C3190a<C1580d0<?>, String> f5389b;

    /* renamed from: c */
    private final C4941i<Map<C1580d0<?>, String>> f5390c;

    /* renamed from: d */
    private int f5391d;

    /* renamed from: e */
    private boolean f5392e;

    /* renamed from: a */
    public final void mo6412a(C1580d0<?> d0Var, C4366b bVar, String str) {
        this.f5388a.put(d0Var, bVar);
        this.f5389b.put(d0Var, str);
        this.f5391d--;
        if (!bVar.mo13679j()) {
            this.f5392e = true;
        }
        if (this.f5391d != 0) {
            return;
        }
        if (this.f5392e) {
            this.f5390c.mo14884b(new C1559c(this.f5388a));
            return;
        }
        this.f5390c.mo14885c(this.f5389b);
    }

    /* renamed from: b */
    public final Set<C1580d0<?>> mo6413b() {
        return this.f5388a.keySet();
    }
}
