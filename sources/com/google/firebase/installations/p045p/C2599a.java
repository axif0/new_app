package com.google.firebase.installations.p045p;

import com.google.firebase.installations.p045p.C2603c;
import com.google.firebase.installations.p045p.C2605d;
import com.karumi.dexter.BuildConfig;

/* renamed from: com.google.firebase.installations.p.a */
final class C2599a extends C2605d {

    /* renamed from: a */
    private final String f8364a;

    /* renamed from: b */
    private final C2603c.C2604a f8365b;

    /* renamed from: c */
    private final String f8366c;

    /* renamed from: d */
    private final String f8367d;

    /* renamed from: e */
    private final long f8368e;

    /* renamed from: f */
    private final long f8369f;

    /* renamed from: g */
    private final String f8370g;

    /* renamed from: com.google.firebase.installations.p.a$b */
    static final class C2601b extends C2605d.C2606a {

        /* renamed from: a */
        private String f8371a;

        /* renamed from: b */
        private C2603c.C2604a f8372b;

        /* renamed from: c */
        private String f8373c;

        /* renamed from: d */
        private String f8374d;

        /* renamed from: e */
        private Long f8375e;

        /* renamed from: f */
        private Long f8376f;

        /* renamed from: g */
        private String f8377g;

        C2601b() {
        }

        private C2601b(C2605d dVar) {
            this.f8371a = dVar.mo9508d();
            this.f8372b = dVar.mo9512g();
            this.f8373c = dVar.mo9506b();
            this.f8374d = dVar.mo9511f();
            this.f8375e = Long.valueOf(dVar.mo9507c());
            this.f8376f = Long.valueOf(dVar.mo9513h());
            this.f8377g = dVar.mo9509e();
        }

        /* renamed from: a */
        public C2605d mo9517a() {
            C2603c.C2604a aVar = this.f8372b;
            String str = BuildConfig.FLAVOR;
            if (aVar == null) {
                str = str + " registrationStatus";
            }
            if (this.f8375e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f8376f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2599a(this.f8371a, this.f8372b, this.f8373c, this.f8374d, this.f8375e.longValue(), this.f8376f.longValue(), this.f8377g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2605d.C2606a mo9518b(String str) {
            this.f8373c = str;
            return this;
        }

        /* renamed from: c */
        public C2605d.C2606a mo9519c(long j) {
            this.f8375e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C2605d.C2606a mo9520d(String str) {
            this.f8371a = str;
            return this;
        }

        /* renamed from: e */
        public C2605d.C2606a mo9521e(String str) {
            this.f8377g = str;
            return this;
        }

        /* renamed from: f */
        public C2605d.C2606a mo9522f(String str) {
            this.f8374d = str;
            return this;
        }

        /* renamed from: g */
        public C2605d.C2606a mo9523g(C2603c.C2604a aVar) {
            if (aVar != null) {
                this.f8372b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C2605d.C2606a mo9524h(long j) {
            this.f8376f = Long.valueOf(j);
            return this;
        }
    }

    private C2599a(String str, C2603c.C2604a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f8364a = str;
        this.f8365b = aVar;
        this.f8366c = str2;
        this.f8367d = str3;
        this.f8368e = j;
        this.f8369f = j2;
        this.f8370g = str4;
    }

    /* renamed from: b */
    public String mo9506b() {
        return this.f8366c;
    }

    /* renamed from: c */
    public long mo9507c() {
        return this.f8368e;
    }

    /* renamed from: d */
    public String mo9508d() {
        return this.f8364a;
    }

    /* renamed from: e */
    public String mo9509e() {
        return this.f8370g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2605d)) {
            return false;
        }
        C2605d dVar = (C2605d) obj;
        String str3 = this.f8364a;
        if (str3 != null ? str3.equals(dVar.mo9508d()) : dVar.mo9508d() == null) {
            if (this.f8365b.equals(dVar.mo9512g()) && ((str = this.f8366c) != null ? str.equals(dVar.mo9506b()) : dVar.mo9506b() == null) && ((str2 = this.f8367d) != null ? str2.equals(dVar.mo9511f()) : dVar.mo9511f() == null) && this.f8368e == dVar.mo9507c() && this.f8369f == dVar.mo9513h()) {
                String str4 = this.f8370g;
                String e = dVar.mo9509e();
                if (str4 == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (str4.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo9511f() {
        return this.f8367d;
    }

    /* renamed from: g */
    public C2603c.C2604a mo9512g() {
        return this.f8365b;
    }

    /* renamed from: h */
    public long mo9513h() {
        return this.f8369f;
    }

    public int hashCode() {
        String str = this.f8364a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f8365b.hashCode()) * 1000003;
        String str2 = this.f8366c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8367d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f8368e;
        long j2 = this.f8369f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f8370g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C2605d.C2606a mo9515n() {
        return new C2601b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f8364a + ", registrationStatus=" + this.f8365b + ", authToken=" + this.f8366c + ", refreshToken=" + this.f8367d + ", expiresInSecs=" + this.f8368e + ", tokenCreationEpochInSecs=" + this.f8369f + ", fisError=" + this.f8370g + "}";
    }
}
