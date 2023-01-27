package p148g.p189d.p190a.p200b.p217n0;

import java.io.IOException;
import p148g.p189d.p190a.p200b.C3837e0;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4150o;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p217n0.C4124e;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4269j;

/* renamed from: g.d.a.b.n0.a */
public final class C4111a implements C4124e, C4124e.C4125a {

    /* renamed from: f */
    public final C4124e f12965f;

    /* renamed from: g */
    private C4124e.C4125a f12966g;

    /* renamed from: h */
    private C4112a[] f12967h = new C4112a[0];

    /* renamed from: i */
    private long f12968i;

    /* renamed from: j */
    long f12969j;

    /* renamed from: k */
    long f12970k;

    /* renamed from: g.d.a.b.n0.a$a */
    private final class C4112a implements C4141j {

        /* renamed from: a */
        public final C4141j f12971a;

        /* renamed from: b */
        private boolean f12972b;

        public C4112a(C4141j jVar) {
            this.f12971a = jVar;
        }

        /* renamed from: a */
        public int mo13086a(C4150o oVar, C3895e eVar, boolean z) {
            if (C4111a.this.mo13072c()) {
                return -3;
            }
            if (this.f12972b) {
                eVar.mo12661r(4);
                return -4;
            }
            int a = this.f12971a.mo13086a(oVar, eVar, z);
            if (a == -5) {
                C4109n nVar = oVar.f13171a;
                if (!(nVar.f12964z == -1 && nVar.f12938A == -1)) {
                    int i = 0;
                    int i2 = C4111a.this.f12969j != 0 ? 0 : nVar.f12964z;
                    if (C4111a.this.f12970k == Long.MIN_VALUE) {
                        i = nVar.f12938A;
                    }
                    oVar.f13171a = nVar.mo13056b(i2, i);
                }
                return -5;
            }
            long j = C4111a.this.f12970k;
            if (j == Long.MIN_VALUE || ((a != -4 || eVar.f11823i < j) && !(a == -3 && C4111a.this.mo13080o() == Long.MIN_VALUE))) {
                if (a == -4 && !eVar.mo12659o()) {
                    eVar.f11823i -= C4111a.this.f12969j;
                }
                return a;
            }
            eVar.mo12655k();
            eVar.mo12661r(4);
            this.f12972b = true;
            return -4;
        }

        /* renamed from: b */
        public void mo13087b() throws IOException {
            this.f12971a.mo13087b();
        }

        /* renamed from: c */
        public int mo13088c(long j) {
            if (C4111a.this.mo13072c()) {
                return -3;
            }
            return this.f12971a.mo13088c(C4111a.this.f12969j + j);
        }

        /* renamed from: d */
        public void mo13089d() {
            this.f12972b = false;
        }

        /* renamed from: g */
        public boolean mo13090g() {
            return !C4111a.this.mo13072c() && this.f12971a.mo13090g();
        }
    }

    public C4111a(C4124e eVar, boolean z) {
        this.f12965f = eVar;
        this.f12968i = z ? 0 : -9223372036854775807L;
        this.f12969j = -9223372036854775807L;
        this.f12970k = -9223372036854775807L;
    }

    /* renamed from: b */
    private C3837e0 m17359b(long j, C3837e0 e0Var) {
        long min = Math.min(j - this.f12969j, e0Var.f11544a);
        long j2 = this.f12970k;
        long min2 = j2 == Long.MIN_VALUE ? e0Var.f11545b : Math.min(j2 - j, e0Var.f11545b);
        return (min == e0Var.f11544a && min2 == e0Var.f11545b) ? e0Var : new C3837e0(min, min2);
    }

    /* renamed from: m */
    private static boolean m17360m(long j, C4229e[] eVarArr) {
        if (j != 0) {
            for (C4229e eVar : eVarArr) {
                if (eVar != null && !C4269j.m18115f(eVar.mo13330e().f12949k)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public long mo13071a(long j, C3837e0 e0Var) {
        long j2 = this.f12969j;
        if (j == j2) {
            return 0;
        }
        long j3 = j + j2;
        return this.f12965f.mo13071a(j3, m17359b(j3, e0Var)) - this.f12969j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo13072c() {
        return this.f12968i != -9223372036854775807L;
    }

    /* renamed from: d */
    public void mo12905d(C4124e eVar) {
        C4260a.m18074f((this.f12969j == -9223372036854775807L || this.f12970k == -9223372036854775807L) ? false : true);
        this.f12966g.mo12905d(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if ((r0.f12969j + r3) > r5) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo13073f(p148g.p189d.p190a.p200b.p228p0.C4229e[] r13, boolean[] r14, p148g.p189d.p190a.p200b.p217n0.C4141j[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            g.d.a.b.n0.a$a[] r2 = new p148g.p189d.p190a.p200b.p217n0.C4111a.C4112a[r2]
            r0.f12967h = r2
            int r2 = r1.length
            g.d.a.b.n0.j[] r2 = new p148g.p189d.p190a.p200b.p217n0.C4141j[r2]
            r10 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.length
            r11 = 0
            if (r3 >= r4) goto L_0x0025
            g.d.a.b.n0.a$a[] r4 = r0.f12967h
            r5 = r1[r3]
            g.d.a.b.n0.a$a r5 = (p148g.p189d.p190a.p200b.p217n0.C4111a.C4112a) r5
            r4[r3] = r5
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0020
            r4 = r4[r3]
            g.d.a.b.n0.j r11 = r4.f12971a
        L_0x0020:
            r2[r3] = r11
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0025:
            g.d.a.b.n0.e r3 = r0.f12965f
            long r4 = r0.f12969j
            long r8 = r17 + r4
            r4 = r13
            r5 = r14
            r6 = r2
            r7 = r16
            long r3 = r3.mo13073f(r4, r5, r6, r7, r8)
            long r5 = r0.f12969j
            long r3 = r3 - r5
            boolean r5 = r12.mo13072c()
            r6 = 0
            if (r5 == 0) goto L_0x004e
            int r5 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x004e
            long r8 = r0.f12969j
            r5 = r13
            boolean r5 = m17360m(r8, r13)
            if (r5 == 0) goto L_0x004e
            r8 = r3
            goto L_0x0053
        L_0x004e:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0053:
            r0.f12968i = r8
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x006f
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x006d
            long r5 = r0.f12970k
            r7 = -9223372036854775808
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x006f
            long r7 = r0.f12969j
            long r7 = r7 + r3
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r5 = 0
            goto L_0x0070
        L_0x006f:
            r5 = 1
        L_0x0070:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r5)
        L_0x0073:
            int r5 = r1.length
            if (r10 >= r5) goto L_0x00a1
            r5 = r2[r10]
            if (r5 != 0) goto L_0x007f
            g.d.a.b.n0.a$a[] r5 = r0.f12967h
            r5[r10] = r11
            goto L_0x0098
        L_0x007f:
            r5 = r1[r10]
            if (r5 == 0) goto L_0x008d
            g.d.a.b.n0.a$a[] r5 = r0.f12967h
            r5 = r5[r10]
            g.d.a.b.n0.j r5 = r5.f12971a
            r6 = r2[r10]
            if (r5 == r6) goto L_0x0098
        L_0x008d:
            g.d.a.b.n0.a$a[] r5 = r0.f12967h
            g.d.a.b.n0.a$a r6 = new g.d.a.b.n0.a$a
            r7 = r2[r10]
            r6.<init>(r7)
            r5[r10] = r6
        L_0x0098:
            g.d.a.b.n0.a$a[] r5 = r0.f12967h
            r5 = r5[r10]
            r1[r10] = r5
            int r10 = r10 + 1
            goto L_0x0073
        L_0x00a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4111a.mo13073f(g.d.a.b.p0.e[], boolean[], g.d.a.b.n0.j[], boolean[], long):long");
    }

    /* renamed from: g */
    public void mo12906e(C4124e eVar) {
        this.f12966g.mo12906e(this);
    }

    /* renamed from: h */
    public long mo13075h() {
        long h = this.f12965f.mo13075h();
        if (h != Long.MIN_VALUE) {
            long j = this.f12970k;
            if (j == Long.MIN_VALUE || h < j) {
                return h - this.f12969j;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: i */
    public long mo13076i() {
        if (mo13072c()) {
            long j = this.f12968i;
            this.f12968i = -9223372036854775807L;
            long i = mo13076i();
            return i != -9223372036854775807L ? i : j;
        }
        long i2 = this.f12965f.mo13076i();
        if (i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C4260a.m18074f(i2 >= this.f12969j);
        long j2 = this.f12970k;
        if (j2 != Long.MIN_VALUE && i2 > j2) {
            z = false;
        }
        C4260a.m18074f(z);
        return i2 - this.f12969j;
    }

    /* renamed from: j */
    public void mo13077j(C4124e.C4125a aVar, long j) {
        this.f12966g = aVar;
        this.f12965f.mo13077j(this, this.f12969j + j);
    }

    /* renamed from: k */
    public void mo13078k(long j, long j2) {
        this.f12969j = j;
        this.f12970k = j2;
    }

    /* renamed from: l */
    public C4146n mo13079l() {
        return this.f12965f.mo13079l();
    }

    /* renamed from: o */
    public long mo13080o() {
        long o = this.f12965f.mo13080o();
        if (o != Long.MIN_VALUE) {
            long j = this.f12970k;
            if (j == Long.MIN_VALUE || o < j) {
                return Math.max(0, o - this.f12969j);
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: p */
    public void mo13081p() throws IOException {
        this.f12965f.mo13081p();
    }

    /* renamed from: q */
    public void mo13082q(long j, boolean z) {
        this.f12965f.mo13082q(j + this.f12969j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 > r7) goto L_0x0038;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo13083r(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f12968i = r0
            g.d.a.b.n0.a$a[] r0 = r6.f12967h
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo13089d()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            long r0 = r6.f12969j
            long r7 = r7 + r0
            g.d.a.b.n0.e r0 = r6.f12965f
            long r0 = r0.mo13083r(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0037
            long r7 = r6.f12969j
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0038
            long r7 = r6.f12970k
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0038
        L_0x0037:
            r2 = 1
        L_0x0038:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r2)
            long r7 = r6.f12969j
            long r0 = r0 - r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4111a.mo13083r(long):long");
    }

    /* renamed from: s */
    public boolean mo13084s(long j) {
        return this.f12965f.mo13084s(j + this.f12969j);
    }

    /* renamed from: t */
    public void mo13085t(long j) {
        this.f12965f.mo13085t(j + this.f12969j);
    }
}
