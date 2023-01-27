package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.EOFException;
import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.k0.s.a */
final class C3979a implements C3987f {

    /* renamed from: a */
    private final C3986e f12380a = new C3986e();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f12381b;

    /* renamed from: c */
    private final long f12382c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3989h f12383d;

    /* renamed from: e */
    private int f12384e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f12385f;

    /* renamed from: g */
    private long f12386g;

    /* renamed from: h */
    private long f12387h;

    /* renamed from: i */
    private long f12388i;

    /* renamed from: j */
    private long f12389j;

    /* renamed from: k */
    private long f12390k;

    /* renamed from: l */
    private long f12391l;

    /* renamed from: g.d.a.b.k0.s.a$b */
    private class C3981b implements C3923l {
        private C3981b() {
        }

        /* renamed from: e */
        public boolean mo12716e() {
            return true;
        }

        /* renamed from: g */
        public C3923l.C3924a mo12717g(long j) {
            if (j == 0) {
                return new C3923l.C3924a(new C3926m(0, C3979a.this.f12381b));
            }
            long b = C3979a.this.f12383d.mo12837b(j);
            C3979a aVar = C3979a.this;
            return new C3923l.C3924a(new C3926m(j, aVar.m16752i(aVar.f12381b, b, 30000)));
        }

        /* renamed from: i */
        public long mo12718i() {
            return C3979a.this.f12383d.mo12836a(C3979a.this.f12385f);
        }
    }

    public C3979a(long j, long j2, C3989h hVar, int i, long j3) {
        C4260a.m18069a(j >= 0 && j2 > j);
        this.f12383d = hVar;
        this.f12381b = j;
        this.f12382c = j2;
        if (((long) i) == j2 - j) {
            this.f12385f = j3;
            this.f12384e = 3;
            return;
        }
        this.f12384e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public long m16752i(long j, long j2, long j3) {
        long j4 = this.f12382c;
        long j5 = this.f12381b;
        long j6 = j + (((j2 * (j4 - j5)) / this.f12385f) - j3);
        if (j6 >= j5) {
            j5 = j6;
        }
        long j7 = this.f12382c;
        return j5 >= j7 ? j7 - 1 : j5;
    }

    /* renamed from: a */
    public long mo12814a(C3916f fVar) throws IOException, InterruptedException {
        int i = this.f12384e;
        if (i == 0) {
            long k = fVar.mo12729k();
            this.f12386g = k;
            this.f12384e = 1;
            long j = this.f12382c - 65307;
            if (j > k) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.f12387h;
                long j3 = 0;
                if (j2 != 0) {
                    long j4 = mo12818j(j2, fVar);
                    if (j4 >= 0) {
                        return j4;
                    }
                    j3 = mo12823o(fVar, this.f12387h, -(j4 + 2));
                }
                this.f12384e = 3;
                return -(j3 + 2);
            } else if (i == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f12385f = mo12819k(fVar);
        this.f12384e = 3;
        return this.f12386g;
    }

    /* renamed from: c */
    public long mo12816c(long j) {
        int i = this.f12384e;
        C4260a.m18069a(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.f12383d.mo12837b(j);
        }
        this.f12387h = j2;
        this.f12384e = 2;
        mo12820l();
        return this.f12387h;
    }

    /* renamed from: h */
    public C3981b mo12815b() {
        if (this.f12385f != 0) {
            return new C3981b();
        }
        return null;
    }

    /* renamed from: j */
    public long mo12818j(long j, C3916f fVar) throws IOException, InterruptedException {
        C3916f fVar2 = fVar;
        long j2 = 2;
        if (this.f12388i == this.f12389j) {
            return -(this.f12390k + 2);
        }
        long k = fVar.mo12729k();
        if (!mo12822n(fVar2, this.f12389j)) {
            long j3 = this.f12388i;
            if (j3 != k) {
                return j3;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f12380a.mo12834a(fVar2, false);
        fVar.mo12723e();
        C3986e eVar = this.f12380a;
        long j4 = j - eVar.f12411c;
        int i = eVar.f12413e + eVar.f12414f;
        if (j4 < 0 || j4 > 72000) {
            if (j4 < 0) {
                this.f12389j = k;
                this.f12391l = this.f12380a.f12411c;
            } else {
                long j5 = (long) i;
                long k2 = fVar.mo12729k() + j5;
                this.f12388i = k2;
                this.f12390k = this.f12380a.f12411c;
                if ((this.f12389j - k2) + j5 < 100000) {
                    fVar2.mo12724f(i);
                    return -(this.f12390k + 2);
                }
            }
            long j6 = this.f12389j;
            long j7 = this.f12388i;
            if (j6 - j7 < 100000) {
                this.f12389j = j7;
                return j7;
            }
            long j8 = (long) i;
            if (j4 > 0) {
                j2 = 1;
            }
            long j9 = j8 * j2;
            long j10 = this.f12389j;
            long j11 = this.f12388i;
            return Math.min(Math.max((fVar.mo12729k() - j9) + ((j4 * (j10 - j11)) / (this.f12391l - this.f12390k)), j11), this.f12389j - 1);
        }
        fVar2.mo12724f(i);
        return -(this.f12380a.f12411c + 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public long mo12819k(C3916f fVar) throws IOException, InterruptedException {
        mo12821m(fVar);
        this.f12380a.mo12835b();
        while ((this.f12380a.f12410b & 4) != 4 && fVar.mo12729k() < this.f12382c) {
            this.f12380a.mo12834a(fVar, false);
            C3986e eVar = this.f12380a;
            fVar.mo12724f(eVar.f12413e + eVar.f12414f);
        }
        return this.f12380a.f12411c;
    }

    /* renamed from: l */
    public void mo12820l() {
        this.f12388i = this.f12381b;
        this.f12389j = this.f12382c;
        this.f12390k = 0;
        this.f12391l = this.f12385f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo12821m(C3916f fVar) throws IOException, InterruptedException {
        if (!mo12822n(fVar, this.f12382c)) {
            throw new EOFException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12822n(C3916f fVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f12382c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (fVar.mo12729k() + ((long) i2) <= min || (i2 = (int) (min - fVar.mo12729k())) >= 4) {
                fVar.mo12725g(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        fVar.mo12724f(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            fVar.mo12724f(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo12823o(C3916f fVar, long j, long j2) throws IOException, InterruptedException {
        this.f12380a.mo12834a(fVar, false);
        while (true) {
            C3986e eVar = this.f12380a;
            if (eVar.f12411c < j) {
                fVar.mo12724f(eVar.f12413e + eVar.f12414f);
                C3986e eVar2 = this.f12380a;
                long j3 = eVar2.f12411c;
                eVar2.mo12834a(fVar, false);
                j2 = j3;
            } else {
                fVar.mo12723e();
                return j2;
            }
        }
    }
}
