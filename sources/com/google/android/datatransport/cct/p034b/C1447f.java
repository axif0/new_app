package com.google.android.datatransport.cct.p034b;

import com.google.android.datatransport.cct.p034b.C1462m;

/* renamed from: com.google.android.datatransport.cct.b.f */
final class C1447f extends C1462m {

    /* renamed from: a */
    private final C1462m.C1464b f4952a;

    /* renamed from: b */
    private final C1439a f4953b;

    /* renamed from: com.google.android.datatransport.cct.b.f$b */
    static final class C1449b extends C1462m.C1463a {

        /* renamed from: a */
        private C1462m.C1464b f4954a;

        /* renamed from: b */
        private C1439a f4955b;

        C1449b() {
        }

        /* renamed from: a */
        public C1462m.C1463a mo6058a(C1439a aVar) {
            this.f4955b = aVar;
            return this;
        }

        /* renamed from: b */
        public C1462m.C1463a mo6059b(C1462m.C1464b bVar) {
            this.f4954a = bVar;
            return this;
        }

        /* renamed from: c */
        public C1462m mo6060c() {
            return new C1447f(this.f4954a, this.f4955b, (C1448a) null);
        }
    }

    /* synthetic */ C1447f(C1462m.C1464b bVar, C1439a aVar, C1448a aVar2) {
        this.f4952a = bVar;
        this.f4953b = aVar;
    }

    /* renamed from: b */
    public C1439a mo6053b() {
        return this.f4953b;
    }

    /* renamed from: c */
    public C1462m.C1464b mo6054c() {
        return this.f4952a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1462m)) {
            return false;
        }
        C1462m.C1464b bVar = this.f4952a;
        if (bVar != null ? bVar.equals(((C1447f) obj).f4952a) : ((C1447f) obj).f4952a == null) {
            C1439a aVar = this.f4953b;
            C1439a aVar2 = ((C1447f) obj).f4953b;
            if (aVar == null) {
                if (aVar2 == null) {
                    return true;
                }
            } else if (aVar.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1462m.C1464b bVar = this.f4952a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C1439a aVar = this.f4953b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f4952a + ", androidClientInfo=" + this.f4953b + "}";
    }
}
