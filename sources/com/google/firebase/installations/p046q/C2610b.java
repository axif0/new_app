package com.google.firebase.installations.p046q;

import com.google.firebase.installations.p046q.C2617e;
import com.karumi.dexter.BuildConfig;

/* renamed from: com.google.firebase.installations.q.b */
final class C2610b extends C2617e {

    /* renamed from: a */
    private final String f8399a;

    /* renamed from: b */
    private final long f8400b;

    /* renamed from: c */
    private final C2617e.C2619b f8401c;

    /* renamed from: com.google.firebase.installations.q.b$b */
    static final class C2612b extends C2617e.C2618a {

        /* renamed from: a */
        private String f8402a;

        /* renamed from: b */
        private Long f8403b;

        /* renamed from: c */
        private C2617e.C2619b f8404c;

        C2612b() {
        }

        /* renamed from: a */
        public C2617e mo9560a() {
            Long l = this.f8403b;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2610b(this.f8402a, this.f8403b.longValue(), this.f8404c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2617e.C2618a mo9561b(C2617e.C2619b bVar) {
            this.f8404c = bVar;
            return this;
        }

        /* renamed from: c */
        public C2617e.C2618a mo9562c(String str) {
            this.f8402a = str;
            return this;
        }

        /* renamed from: d */
        public C2617e.C2618a mo9563d(long j) {
            this.f8403b = Long.valueOf(j);
            return this;
        }
    }

    private C2610b(String str, long j, C2617e.C2619b bVar) {
        this.f8399a = str;
        this.f8400b = j;
        this.f8401c = bVar;
    }

    /* renamed from: b */
    public C2617e.C2619b mo9554b() {
        return this.f8401c;
    }

    /* renamed from: c */
    public String mo9555c() {
        return this.f8399a;
    }

    /* renamed from: d */
    public long mo9556d() {
        return this.f8400b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2617e)) {
            return false;
        }
        C2617e eVar = (C2617e) obj;
        String str = this.f8399a;
        if (str != null ? str.equals(eVar.mo9555c()) : eVar.mo9555c() == null) {
            if (this.f8400b == eVar.mo9556d()) {
                C2617e.C2619b bVar = this.f8401c;
                C2617e.C2619b b = eVar.mo9554b();
                if (bVar == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (bVar.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8399a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f8400b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C2617e.C2619b bVar = this.f8401c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f8399a + ", tokenExpirationTimestamp=" + this.f8400b + ", responseCode=" + this.f8401c + "}";
    }
}
