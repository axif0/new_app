package p148g.p189d.p190a.p200b.p204k0.p211u;

import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.u.b */
final class C4037b implements C3923l {

    /* renamed from: a */
    private final int f12727a;

    /* renamed from: b */
    private final int f12728b;

    /* renamed from: c */
    private final int f12729c;

    /* renamed from: d */
    private final int f12730d;

    /* renamed from: e */
    private final int f12731e;

    /* renamed from: f */
    private final int f12732f;

    /* renamed from: g */
    private long f12733g;

    /* renamed from: h */
    private long f12734h;

    public C4037b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f12727a = i;
        this.f12728b = i2;
        this.f12729c = i3;
        this.f12730d = i4;
        this.f12731e = i5;
        this.f12732f = i6;
    }

    /* renamed from: a */
    public int mo12889a() {
        return this.f12728b * this.f12731e * this.f12727a;
    }

    /* renamed from: b */
    public int mo12890b() {
        return this.f12730d;
    }

    /* renamed from: c */
    public int mo12891c() {
        return this.f12732f;
    }

    /* renamed from: d */
    public int mo12892d() {
        return this.f12727a;
    }

    /* renamed from: e */
    public boolean mo12716e() {
        return true;
    }

    /* renamed from: f */
    public long mo12893f(long j) {
        return (Math.max(0, j - this.f12733g) * 1000000) / ((long) this.f12729c);
    }

    /* renamed from: g */
    public C3923l.C3924a mo12717g(long j) {
        int i = this.f12730d;
        long j2 = C4284w.m18244j((((((long) this.f12729c) * j) / 1000000) / ((long) i)) * ((long) i), 0, this.f12734h - ((long) i));
        long j3 = this.f12733g + j2;
        long f = mo12893f(j3);
        C3926m mVar = new C3926m(f, j3);
        if (f < j) {
            long j4 = this.f12734h;
            int i2 = this.f12730d;
            if (j2 != j4 - ((long) i2)) {
                long j5 = j3 + ((long) i2);
                return new C3923l.C3924a(mVar, new C3926m(mo12893f(j5), j5));
            }
        }
        return new C3923l.C3924a(mVar);
    }

    /* renamed from: h */
    public int mo12894h() {
        return this.f12728b;
    }

    /* renamed from: i */
    public long mo12718i() {
        return ((this.f12734h / ((long) this.f12730d)) * 1000000) / ((long) this.f12728b);
    }

    /* renamed from: j */
    public boolean mo12895j() {
        return (this.f12733g == 0 || this.f12734h == 0) ? false : true;
    }

    /* renamed from: k */
    public void mo12896k(long j, long j2) {
        this.f12733g = j;
        this.f12734h = j2;
    }
}
