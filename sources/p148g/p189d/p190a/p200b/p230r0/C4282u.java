package p148g.p189d.p190a.p200b.p230r0;

/* renamed from: g.d.a.b.r0.u */
public final class C4282u {

    /* renamed from: a */
    private long f13656a;

    /* renamed from: b */
    private long f13657b;

    /* renamed from: c */
    private volatile long f13658c = -9223372036854775807L;

    public C4282u(long j) {
        mo13503h(j);
    }

    /* renamed from: f */
    public static long m18215f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m18216i(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public long mo13497a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13658c != -9223372036854775807L) {
            this.f13658c = j;
        } else {
            long j2 = this.f13656a;
            if (j2 != Long.MAX_VALUE) {
                this.f13657b = j2 - j;
            }
            synchronized (this) {
                this.f13658c = j;
                notifyAll();
            }
        }
        return j + this.f13657b;
    }

    /* renamed from: b */
    public long mo13498b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13658c != -9223372036854775807L) {
            long i = m18216i(this.f13658c);
            long j2 = (4294967296L + i) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - i) < Math.abs(j - i)) {
                j = j3;
            }
        }
        return mo13497a(m18215f(j));
    }

    /* renamed from: c */
    public long mo13499c() {
        return this.f13656a;
    }

    /* renamed from: d */
    public long mo13500d() {
        if (this.f13658c != -9223372036854775807L) {
            return this.f13658c;
        }
        long j = this.f13656a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public long mo13501e() {
        if (this.f13656a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f13658c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f13657b;
    }

    /* renamed from: g */
    public void mo13502g() {
        this.f13658c = -9223372036854775807L;
    }

    /* renamed from: h */
    public synchronized void mo13503h(long j) {
        C4260a.m18074f(this.f13658c == -9223372036854775807L);
        this.f13656a = j;
    }
}
