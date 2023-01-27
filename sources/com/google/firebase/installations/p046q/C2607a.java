package com.google.firebase.installations.p046q;

import com.google.firebase.installations.p046q.C2614d;

/* renamed from: com.google.firebase.installations.q.a */
final class C2607a extends C2614d {

    /* renamed from: a */
    private final String f8389a;

    /* renamed from: b */
    private final String f8390b;

    /* renamed from: c */
    private final String f8391c;

    /* renamed from: d */
    private final C2617e f8392d;

    /* renamed from: e */
    private final C2614d.C2616b f8393e;

    /* renamed from: com.google.firebase.installations.q.a$b */
    static final class C2609b extends C2614d.C2615a {

        /* renamed from: a */
        private String f8394a;

        /* renamed from: b */
        private String f8395b;

        /* renamed from: c */
        private String f8396c;

        /* renamed from: d */
        private C2617e f8397d;

        /* renamed from: e */
        private C2614d.C2616b f8398e;

        C2609b() {
        }

        /* renamed from: a */
        public C2614d mo9548a() {
            return new C2607a(this.f8394a, this.f8395b, this.f8396c, this.f8397d, this.f8398e);
        }

        /* renamed from: b */
        public C2614d.C2615a mo9549b(C2617e eVar) {
            this.f8397d = eVar;
            return this;
        }

        /* renamed from: c */
        public C2614d.C2615a mo9550c(String str) {
            this.f8395b = str;
            return this;
        }

        /* renamed from: d */
        public C2614d.C2615a mo9551d(String str) {
            this.f8396c = str;
            return this;
        }

        /* renamed from: e */
        public C2614d.C2615a mo9552e(C2614d.C2616b bVar) {
            this.f8398e = bVar;
            return this;
        }

        /* renamed from: f */
        public C2614d.C2615a mo9553f(String str) {
            this.f8394a = str;
            return this;
        }
    }

    private C2607a(String str, String str2, String str3, C2617e eVar, C2614d.C2616b bVar) {
        this.f8389a = str;
        this.f8390b = str2;
        this.f8391c = str3;
        this.f8392d = eVar;
        this.f8393e = bVar;
    }

    /* renamed from: b */
    public C2617e mo9540b() {
        return this.f8392d;
    }

    /* renamed from: c */
    public String mo9541c() {
        return this.f8390b;
    }

    /* renamed from: d */
    public String mo9542d() {
        return this.f8391c;
    }

    /* renamed from: e */
    public C2614d.C2616b mo9543e() {
        return this.f8393e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2614d)) {
            return false;
        }
        C2614d dVar = (C2614d) obj;
        String str = this.f8389a;
        if (str != null ? str.equals(dVar.mo9545f()) : dVar.mo9545f() == null) {
            String str2 = this.f8390b;
            if (str2 != null ? str2.equals(dVar.mo9541c()) : dVar.mo9541c() == null) {
                String str3 = this.f8391c;
                if (str3 != null ? str3.equals(dVar.mo9542d()) : dVar.mo9542d() == null) {
                    C2617e eVar = this.f8392d;
                    if (eVar != null ? eVar.equals(dVar.mo9540b()) : dVar.mo9540b() == null) {
                        C2614d.C2616b bVar = this.f8393e;
                        C2614d.C2616b e = dVar.mo9543e();
                        if (bVar == null) {
                            if (e == null) {
                                return true;
                            }
                        } else if (bVar.equals(e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo9545f() {
        return this.f8389a;
    }

    public int hashCode() {
        String str = this.f8389a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f8390b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8391c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C2617e eVar = this.f8392d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C2614d.C2616b bVar = this.f8393e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f8389a + ", fid=" + this.f8390b + ", refreshToken=" + this.f8391c + ", authToken=" + this.f8392d + ", responseCode=" + this.f8393e + "}";
    }
}
