package com.google.android.datatransport.cct.p034b;

import com.google.android.datatransport.cct.p034b.C1474u;

/* renamed from: com.google.android.datatransport.cct.b.j */
final class C1457j extends C1474u {

    /* renamed from: a */
    private final C1474u.C1477c f4985a;

    /* renamed from: b */
    private final C1474u.C1476b f4986b;

    /* renamed from: com.google.android.datatransport.cct.b.j$b */
    static final class C1459b extends C1474u.C1475a {

        /* renamed from: a */
        private C1474u.C1477c f4987a;

        /* renamed from: b */
        private C1474u.C1476b f4988b;

        C1459b() {
        }

        /* renamed from: a */
        public C1474u.C1475a mo6105a(C1474u.C1476b bVar) {
            this.f4988b = bVar;
            return this;
        }

        /* renamed from: b */
        public C1474u.C1475a mo6106b(C1474u.C1477c cVar) {
            this.f4987a = cVar;
            return this;
        }

        /* renamed from: c */
        public C1474u mo6107c() {
            return new C1457j(this.f4987a, this.f4988b, (C1458a) null);
        }
    }

    /* synthetic */ C1457j(C1474u.C1477c cVar, C1474u.C1476b bVar, C1458a aVar) {
        this.f4985a = cVar;
        this.f4986b = bVar;
    }

    /* renamed from: b */
    public C1474u.C1476b mo6100b() {
        return this.f4986b;
    }

    /* renamed from: c */
    public C1474u.C1477c mo6101c() {
        return this.f4985a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1474u)) {
            return false;
        }
        C1474u.C1477c cVar = this.f4985a;
        if (cVar != null ? cVar.equals(((C1457j) obj).f4985a) : ((C1457j) obj).f4985a == null) {
            C1474u.C1476b bVar = this.f4986b;
            C1474u.C1476b bVar2 = ((C1457j) obj).f4986b;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1474u.C1477c cVar = this.f4985a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C1474u.C1476b bVar = this.f4986b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f4985a + ", mobileSubtype=" + this.f4986b + "}";
    }
}
