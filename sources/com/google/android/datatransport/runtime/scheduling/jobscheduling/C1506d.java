package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1511g;
import com.karumi.dexter.BuildConfig;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
final class C1506d extends C1511g.C1513b {

    /* renamed from: a */
    private final long f5084a;

    /* renamed from: b */
    private final long f5085b;

    /* renamed from: c */
    private final Set<C1511g.C1515c> f5086c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$b */
    static final class C1508b extends C1511g.C1513b.C1514a {

        /* renamed from: a */
        private Long f5087a;

        /* renamed from: b */
        private Long f5088b;

        /* renamed from: c */
        private Set<C1511g.C1515c> f5089c;

        C1508b() {
        }

        /* renamed from: a */
        public C1511g.C1513b mo6161a() {
            Long l = this.f5087a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " delta";
            }
            if (this.f5088b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f5089c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C1506d(this.f5087a.longValue(), this.f5088b.longValue(), this.f5089c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C1511g.C1513b.C1514a mo6162b(long j) {
            this.f5087a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1511g.C1513b.C1514a mo6163c(Set<C1511g.C1515c> set) {
            if (set != null) {
                this.f5089c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public C1511g.C1513b.C1514a mo6164d(long j) {
            this.f5088b = Long.valueOf(j);
            return this;
        }
    }

    private C1506d(long j, long j2, Set<C1511g.C1515c> set) {
        this.f5084a = j;
        this.f5085b = j2;
        this.f5086c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo6155b() {
        return this.f5084a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C1511g.C1515c> mo6156c() {
        return this.f5086c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo6157d() {
        return this.f5085b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1511g.C1513b)) {
            return false;
        }
        C1511g.C1513b bVar = (C1511g.C1513b) obj;
        return this.f5084a == bVar.mo6155b() && this.f5085b == bVar.mo6157d() && this.f5086c.equals(bVar.mo6156c());
    }

    public int hashCode() {
        long j = this.f5084a;
        long j2 = this.f5085b;
        return this.f5086c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f5084a + ", maxAllowedDelay=" + this.f5085b + ", flags=" + this.f5086c + "}";
    }
}
