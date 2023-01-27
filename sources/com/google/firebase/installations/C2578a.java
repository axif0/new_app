package com.google.firebase.installations;

import com.google.firebase.installations.C2594l;
import com.karumi.dexter.BuildConfig;

/* renamed from: com.google.firebase.installations.a */
final class C2578a extends C2594l {

    /* renamed from: a */
    private final String f8324a;

    /* renamed from: b */
    private final long f8325b;

    /* renamed from: c */
    private final long f8326c;

    /* renamed from: com.google.firebase.installations.a$b */
    static final class C2580b extends C2594l.C2595a {

        /* renamed from: a */
        private String f8327a;

        /* renamed from: b */
        private Long f8328b;

        /* renamed from: c */
        private Long f8329c;

        C2580b() {
        }

        /* renamed from: a */
        public C2594l mo9487a() {
            String str = this.f8327a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = str2 + " token";
            }
            if (this.f8328b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f8329c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new C2578a(this.f8327a, this.f8328b.longValue(), this.f8329c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C2594l.C2595a mo9488b(String str) {
            if (str != null) {
                this.f8327a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public C2594l.C2595a mo9489c(long j) {
            this.f8329c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C2594l.C2595a mo9490d(long j) {
            this.f8328b = Long.valueOf(j);
            return this;
        }
    }

    private C2578a(String str, long j, long j2) {
        this.f8324a = str;
        this.f8325b = j;
        this.f8326c = j2;
    }

    /* renamed from: b */
    public String mo9481b() {
        return this.f8324a;
    }

    /* renamed from: c */
    public long mo9482c() {
        return this.f8326c;
    }

    /* renamed from: d */
    public long mo9483d() {
        return this.f8325b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2594l)) {
            return false;
        }
        C2594l lVar = (C2594l) obj;
        return this.f8324a.equals(lVar.mo9481b()) && this.f8325b == lVar.mo9483d() && this.f8326c == lVar.mo9482c();
    }

    public int hashCode() {
        long j = this.f8325b;
        long j2 = this.f8326c;
        return ((((this.f8324a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f8324a + ", tokenExpirationTimestamp=" + this.f8325b + ", tokenCreationTimestamp=" + this.f8326c + "}";
    }
}
