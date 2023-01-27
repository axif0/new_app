package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3786d;

/* renamed from: g.d.a.a.i.v.j.a */
final class C3778a extends C3786d {

    /* renamed from: b */
    private final long f11456b;

    /* renamed from: c */
    private final int f11457c;

    /* renamed from: d */
    private final int f11458d;

    /* renamed from: e */
    private final long f11459e;

    /* renamed from: g.d.a.a.i.v.j.a$b */
    static final class C3780b extends C3786d.C3787a {

        /* renamed from: a */
        private Long f11460a;

        /* renamed from: b */
        private Integer f11461b;

        /* renamed from: c */
        private Integer f11462c;

        /* renamed from: d */
        private Long f11463d;

        C3780b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3786d mo12368a() {
            Long l = this.f11460a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f11461b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f11462c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f11463d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new C3778a(this.f11460a.longValue(), this.f11461b.intValue(), this.f11462c.intValue(), this.f11463d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3786d.C3787a mo12369b(int i) {
            this.f11462c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3786d.C3787a mo12370c(long j) {
            this.f11463d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3786d.C3787a mo12371d(int i) {
            this.f11461b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3786d.C3787a mo12372e(long j) {
            this.f11460a = Long.valueOf(j);
            return this;
        }
    }

    private C3778a(long j, int i, int i2, long j2) {
        this.f11456b = j;
        this.f11457c = i;
        this.f11458d = i2;
        this.f11459e = j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo12361b() {
        return this.f11458d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo12362c() {
        return this.f11459e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo12363d() {
        return this.f11457c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo12364e() {
        return this.f11456b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3786d)) {
            return false;
        }
        C3786d dVar = (C3786d) obj;
        return this.f11456b == dVar.mo12364e() && this.f11457c == dVar.mo12363d() && this.f11458d == dVar.mo12361b() && this.f11459e == dVar.mo12362c();
    }

    public int hashCode() {
        long j = this.f11456b;
        long j2 = this.f11459e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11457c) * 1000003) ^ this.f11458d) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f11456b + ", loadBatchSize=" + this.f11457c + ", criticalSectionEnterTimeoutMs=" + this.f11458d + ", eventCleanUpAge=" + this.f11459e + "}";
    }
}
