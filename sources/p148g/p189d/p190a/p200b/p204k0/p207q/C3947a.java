package p148g.p189d.p190a.p200b.p204k0.p207q;

import p148g.p189d.p190a.p200b.p204k0.C3921j;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p204k0.p207q.C3948b;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.q.a */
final class C3947a implements C3948b.C3949a {

    /* renamed from: a */
    private final long f12070a;

    /* renamed from: b */
    private final int f12071b;

    /* renamed from: c */
    private final long f12072c;

    /* renamed from: d */
    private final int f12073d;

    /* renamed from: e */
    private final long f12074e;

    public C3947a(long j, long j2, C3921j jVar) {
        long j3;
        this.f12070a = j2;
        this.f12071b = jVar.f11904c;
        this.f12073d = jVar.f11907f;
        if (j == -1) {
            this.f12072c = -1;
            j3 = -9223372036854775807L;
        } else {
            this.f12072c = j - j2;
            j3 = mo12792f(j);
        }
        this.f12074e = j3;
    }

    /* renamed from: e */
    public boolean mo12716e() {
        return this.f12072c != -1;
    }

    /* renamed from: f */
    public long mo12792f(long j) {
        return ((Math.max(0, j - this.f12070a) * 1000000) * 8) / ((long) this.f12073d);
    }

    /* renamed from: g */
    public C3923l.C3924a mo12717g(long j) {
        long j2 = this.f12072c;
        if (j2 == -1) {
            return new C3923l.C3924a(new C3926m(0, this.f12070a));
        }
        int i = this.f12071b;
        long j3 = C4284w.m18244j((((((long) this.f12073d) * j) / 8000000) / ((long) i)) * ((long) i), 0, j2 - ((long) i));
        long j4 = this.f12070a + j3;
        long f = mo12792f(j4);
        C3926m mVar = new C3926m(f, j4);
        if (f < j) {
            long j5 = this.f12072c;
            int i2 = this.f12071b;
            if (j3 != j5 - ((long) i2)) {
                long j6 = j4 + ((long) i2);
                return new C3923l.C3924a(mVar, new C3926m(mo12792f(j6), j6));
            }
        }
        return new C3923l.C3924a(mVar);
    }

    /* renamed from: i */
    public long mo12718i() {
        return this.f12074e;
    }
}
