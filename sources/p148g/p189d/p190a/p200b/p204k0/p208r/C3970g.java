package p148g.p189d.p190a.p200b.p204k0.p208r;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3919i;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p208r.C3952a;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.r.g */
public final class C3970g implements C3915e, C3923l {

    /* renamed from: t */
    private static final int f12313t = C4284w.m18249o("qt  ");

    /* renamed from: a */
    private final int f12314a;

    /* renamed from: b */
    private final C4274m f12315b = new C4274m(C4270k.f13622a);

    /* renamed from: c */
    private final C4274m f12316c = new C4274m(4);

    /* renamed from: d */
    private final C4274m f12317d = new C4274m(16);

    /* renamed from: e */
    private final Stack<C3952a.C3953a> f12318e = new Stack<>();

    /* renamed from: f */
    private int f12319f;

    /* renamed from: g */
    private int f12320g;

    /* renamed from: h */
    private long f12321h;

    /* renamed from: i */
    private int f12322i;

    /* renamed from: j */
    private C4274m f12323j;

    /* renamed from: k */
    private int f12324k = -1;

    /* renamed from: l */
    private int f12325l;

    /* renamed from: m */
    private int f12326m;

    /* renamed from: n */
    private C3917g f12327n;

    /* renamed from: o */
    private C3971a[] f12328o;

    /* renamed from: p */
    private long[][] f12329p;

    /* renamed from: q */
    private int f12330q;

    /* renamed from: r */
    private long f12331r;

    /* renamed from: s */
    private boolean f12332s;

    /* renamed from: g.d.a.b.k0.r.g$a */
    private static final class C3971a {

        /* renamed from: a */
        public final C3975j f12333a;

        /* renamed from: b */
        public final C3978m f12334b;

        /* renamed from: c */
        public final C3927n f12335c;

        /* renamed from: d */
        public int f12336d;

        public C3971a(C3975j jVar, C3978m mVar, C3927n nVar) {
            this.f12333a = jVar;
            this.f12334b = mVar;
            this.f12335c = nVar;
        }
    }

    public C3970g(int i) {
        this.f12314a = i;
    }

    /* renamed from: j */
    private static long[][] m16709j(C3971a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f12334b.f12373a];
            jArr2[i] = aVarArr[i].f12334b.f12377e[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].f12334b.f12375c[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f12334b.f12377e[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: k */
    private void m16710k() {
        this.f12319f = 0;
        this.f12322i = 0;
    }

    /* renamed from: l */
    private static int m16711l(C3978m mVar, long j) {
        int a = mVar.mo12812a(j);
        return a == -1 ? mVar.mo12813b(j) : a;
    }

    /* renamed from: m */
    private int m16712m(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C3971a[] aVarArr = this.f12328o;
            if (i3 >= aVarArr.length) {
                break;
            }
            C3971a aVar = aVarArr[i3];
            int i4 = aVar.f12336d;
            C3978m mVar = aVar.f12334b;
            if (i4 != mVar.f12373a) {
                long j5 = mVar.f12374b[i4];
                long j6 = this.f12329p[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* renamed from: n */
    private static long m16713n(C3978m mVar, long j, long j2) {
        int l = m16711l(mVar, j);
        return l == -1 ? j2 : Math.min(mVar.f12374b[l], j2);
    }

    /* renamed from: o */
    private void m16714o(long j) throws C4313u {
        while (!this.f12318e.isEmpty() && this.f12318e.peek().f12192P0 == j) {
            C3952a.C3953a pop = this.f12318e.pop();
            if (pop.f12191a == C3952a.f12103C) {
                m16716q(pop);
                this.f12318e.clear();
                this.f12319f = 2;
            } else if (!this.f12318e.isEmpty()) {
                this.f12318e.peek().mo12794d(pop);
            }
        }
        if (this.f12319f != 2) {
            m16710k();
        }
    }

    /* renamed from: p */
    private static boolean m16715p(C4274m mVar) {
        mVar.mo13454J(8);
        if (mVar.mo13464i() == f12313t) {
            return true;
        }
        mVar.mo13455K(4);
        while (mVar.mo13456a() > 0) {
            if (mVar.mo13464i() == f12313t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private void m16716q(C3952a.C3953a aVar) throws C4313u {
        C4059a aVar2;
        C3952a.C3953a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        C3919i iVar = new C3919i();
        C3952a.C3954b g = aVar3.mo12797g(C3952a.f12100A0);
        if (g != null) {
            aVar2 = C3955b.m16643u(g, this.f12332s);
            if (aVar2 != null) {
                iVar.mo12747c(aVar2);
            }
        } else {
            aVar2 = null;
        }
        int i = -1;
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < aVar3.f12194R0.size(); i2++) {
            C3952a.C3953a aVar4 = aVar3.f12194R0.get(i2);
            if (aVar4.f12191a == C3952a.f12107E) {
                C3975j t = C3955b.m16642t(aVar4, aVar3.mo12797g(C3952a.f12105D), -9223372036854775807L, (C3900a) null, (this.f12314a & 1) != 0, this.f12332s);
                if (t != null) {
                    C3978m p = C3955b.m16638p(t, aVar4.mo12796f(C3952a.f12109F).mo12796f(C3952a.f12111G).mo12796f(C3952a.f12113H), iVar);
                    if (p.f12373a != 0) {
                        C3971a aVar5 = new C3971a(t, p, this.f12327n.mo12745m(i2, t.f12340b));
                        C4109n c = t.f12344f.mo13057c(p.f12376d + 30);
                        if (t.f12340b == 1) {
                            if (iVar.mo12746a()) {
                                c = c.mo13056b(iVar.f11893a, iVar.f11894b);
                            }
                            if (aVar2 != null) {
                                c = c.mo13058d(aVar2);
                            }
                        }
                        aVar5.f12335c.mo12737d(c);
                        long j2 = t.f12343e;
                        if (j2 == -9223372036854775807L) {
                            j2 = p.f12379g;
                        }
                        j = Math.max(j, j2);
                        if (t.f12340b == 2) {
                            if (i == -1) {
                                i = arrayList.size();
                            }
                        }
                        arrayList.add(aVar5);
                    }
                }
            }
        }
        this.f12330q = i;
        this.f12331r = j;
        C3971a[] aVarArr = (C3971a[]) arrayList.toArray(new C3971a[arrayList.size()]);
        this.f12328o = aVarArr;
        this.f12329p = m16709j(aVarArr);
        this.f12327n.mo12744c();
        this.f12327n.mo12743b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16717r(p148g.p189d.p190a.p200b.p204k0.C3916f r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.f12322i
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L_0x002a
            g.d.a.b.r0.m r0 = r8.f12317d
            byte[] r0 = r0.f13643a
            boolean r0 = r9.mo12721c(r0, r3, r2, r1)
            if (r0 != 0) goto L_0x0013
            return r3
        L_0x0013:
            r8.f12322i = r2
            g.d.a.b.r0.m r0 = r8.f12317d
            r0.mo13454J(r3)
            g.d.a.b.r0.m r0 = r8.f12317d
            long r4 = r0.mo13481z()
            r8.f12321h = r4
            g.d.a.b.r0.m r0 = r8.f12317d
            int r0 = r0.mo13464i()
            r8.f12320g = r0
        L_0x002a:
            long r4 = r8.f12321h
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            g.d.a.b.r0.m r0 = r8.f12317d
            byte[] r0 = r0.f13643a
            r9.readFully(r0, r2, r2)
            int r0 = r8.f12322i
            int r0 = r0 + r2
            r8.f12322i = r0
            g.d.a.b.r0.m r0 = r8.f12317d
            long r4 = r0.mo13447C()
        L_0x0044:
            r8.f12321h = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.mo12722d()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.Stack<g.d.a.b.k0.r.a$a> r0 = r8.f12318e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.Stack<g.d.a.b.k0.r.a$a> r0 = r8.f12318e
            java.lang.Object r0 = r0.peek()
            g.d.a.b.k0.r.a$a r0 = (p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.C3953a) r0
            long r4 = r0.f12192P0
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.mo12729k()
            long r4 = r4 - r6
            int r0 = r8.f12322i
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.f12321h
            int r0 = r8.f12322i
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00eb
            int r0 = r8.f12320g
            boolean r0 = m16720u(r0)
            if (r0 == 0) goto L_0x00b0
            long r2 = r9.mo12729k()
            long r4 = r8.f12321h
            long r2 = r2 + r4
            int r9 = r8.f12322i
            long r4 = (long) r9
            long r2 = r2 - r4
            java.util.Stack<g.d.a.b.k0.r.a$a> r9 = r8.f12318e
            g.d.a.b.k0.r.a$a r0 = new g.d.a.b.k0.r.a$a
            int r4 = r8.f12320g
            r0.<init>(r4, r2)
            r9.add(r0)
            long r4 = r8.f12321h
            int r9 = r8.f12322i
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00ac
            r8.m16714o(r2)
            goto L_0x00ea
        L_0x00ac:
            r8.m16710k()
            goto L_0x00ea
        L_0x00b0:
            int r9 = r8.f12320g
            boolean r9 = m16721v(r9)
            if (r9 == 0) goto L_0x00e5
            int r9 = r8.f12322i
            if (r9 != r2) goto L_0x00be
            r9 = 1
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r9)
            long r4 = r8.f12321h
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00cd
            r9 = 1
            goto L_0x00ce
        L_0x00cd:
            r9 = 0
        L_0x00ce:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r9)
            g.d.a.b.r0.m r9 = new g.d.a.b.r0.m
            long r4 = r8.f12321h
            int r0 = (int) r4
            r9.<init>((int) r0)
            r8.f12323j = r9
            g.d.a.b.r0.m r0 = r8.f12317d
            byte[] r0 = r0.f13643a
            byte[] r9 = r9.f13643a
            java.lang.System.arraycopy(r0, r3, r9, r3, r2)
            goto L_0x00e8
        L_0x00e5:
            r9 = 0
            r8.f12323j = r9
        L_0x00e8:
            r8.f12319f = r1
        L_0x00ea:
            return r1
        L_0x00eb:
            g.d.a.b.u r9 = new g.d.a.b.u
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>(r0)
            goto L_0x00f4
        L_0x00f3:
            throw r9
        L_0x00f4:
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p208r.C3970g.m16717r(g.d.a.b.k0.f):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16718s(p148g.p189d.p190a.p200b.p204k0.C3916f r10, p148g.p189d.p190a.p200b.p204k0.C3922k r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            long r0 = r9.f12321h
            int r2 = r9.f12322i
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.mo12729k()
            long r2 = r2 + r0
            g.d.a.b.r0.m r4 = r9.f12323j
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0045
            byte[] r11 = r4.f13643a
            int r4 = r9.f12322i
            int r1 = (int) r0
            r10.readFully(r11, r4, r1)
            int r10 = r9.f12320g
            int r11 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12141b
            if (r10 != r11) goto L_0x0028
            g.d.a.b.r0.m r10 = r9.f12323j
            boolean r10 = m16715p(r10)
            r9.f12332s = r10
            goto L_0x0050
        L_0x0028:
            java.util.Stack<g.d.a.b.k0.r.a$a> r10 = r9.f12318e
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0050
            java.util.Stack<g.d.a.b.k0.r.a$a> r10 = r9.f12318e
            java.lang.Object r10 = r10.peek()
            g.d.a.b.k0.r.a$a r10 = (p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.C3953a) r10
            g.d.a.b.k0.r.a$b r11 = new g.d.a.b.k0.r.a$b
            int r0 = r9.f12320g
            g.d.a.b.r0.m r1 = r9.f12323j
            r11.<init>(r0, r1)
            r10.mo12795e(r11)
            goto L_0x0050
        L_0x0045:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            int r11 = (int) r0
            r10.mo12724f(r11)
        L_0x0050:
            r10 = 0
            goto L_0x005a
        L_0x0052:
            long r7 = r10.mo12729k()
            long r7 = r7 + r0
            r11.f11909a = r7
            r10 = 1
        L_0x005a:
            r9.m16714o(r2)
            if (r10 == 0) goto L_0x0065
            int r10 = r9.f12319f
            r11 = 2
            if (r10 == r11) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p208r.C3970g.m16718s(g.d.a.b.k0.f, g.d.a.b.k0.k):boolean");
    }

    /* renamed from: t */
    private int m16719t(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        long k = fVar.mo12729k();
        if (this.f12324k == -1) {
            int m = m16712m(k);
            this.f12324k = m;
            if (m == -1) {
                return -1;
            }
        }
        C3971a aVar = this.f12328o[this.f12324k];
        C3927n nVar = aVar.f12335c;
        int i = aVar.f12336d;
        C3978m mVar = aVar.f12334b;
        long j = mVar.f12374b[i];
        int i2 = mVar.f12375c[i];
        long j2 = (j - k) + ((long) this.f12325l);
        if (j2 < 0 || j2 >= 262144) {
            kVar.f11909a = j;
            return 1;
        }
        if (aVar.f12333a.f12345g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        fVar.mo12724f((int) j2);
        int i3 = aVar.f12333a.f12348j;
        if (i3 == 0) {
            while (true) {
                int i4 = this.f12325l;
                if (i4 >= i2) {
                    break;
                }
                int b = nVar.mo12735b(fVar, i2 - i4, false);
                this.f12325l += b;
                this.f12326m -= b;
            }
        } else {
            byte[] bArr = this.f12316c.f13643a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = 4 - i3;
            while (this.f12325l < i2) {
                int i6 = this.f12326m;
                if (i6 == 0) {
                    fVar.readFully(this.f12316c.f13643a, i5, i3);
                    this.f12316c.mo13454J(0);
                    this.f12326m = this.f12316c.mo13446B();
                    this.f12315b.mo13454J(0);
                    nVar.mo12734a(this.f12315b, 4);
                    this.f12325l += 4;
                    i2 += i5;
                } else {
                    int b2 = nVar.mo12735b(fVar, i6, false);
                    this.f12325l += b2;
                    this.f12326m -= b2;
                }
            }
        }
        C3978m mVar2 = aVar.f12334b;
        nVar.mo12736c(mVar2.f12377e[i], mVar2.f12378f[i], i2, 0, (C3927n.C3928a) null);
        aVar.f12336d++;
        this.f12324k = -1;
        this.f12325l = 0;
        this.f12326m = 0;
        return 0;
    }

    /* renamed from: u */
    private static boolean m16720u(int i) {
        return i == C3952a.f12103C || i == C3952a.f12107E || i == C3952a.f12109F || i == C3952a.f12111G || i == C3952a.f12113H || i == C3952a.f12130Q;
    }

    /* renamed from: v */
    private static boolean m16721v(int i) {
        return i == C3952a.f12132S || i == C3952a.f12105D || i == C3952a.f12133T || i == C3952a.f12134U || i == C3952a.f12164m0 || i == C3952a.f12166n0 || i == C3952a.f12168o0 || i == C3952a.f12131R || i == C3952a.f12170p0 || i == C3952a.f12172q0 || i == C3952a.f12174r0 || i == C3952a.f12176s0 || i == C3952a.f12178t0 || i == C3952a.f12129P || i == C3952a.f12141b || i == C3952a.f12100A0;
    }

    /* renamed from: w */
    private void m16722w(long j) {
        for (C3971a aVar : this.f12328o) {
            C3978m mVar = aVar.f12334b;
            int a = mVar.mo12812a(j);
            if (a == -1) {
                a = mVar.mo12813b(j);
            }
            aVar.f12336d = a;
        }
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12327n = gVar;
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f12318e.clear();
        this.f12322i = 0;
        this.f12324k = -1;
        this.f12325l = 0;
        this.f12326m = 0;
        if (j == 0) {
            m16710k();
        } else if (this.f12328o != null) {
            m16722w(j2);
        }
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        return C3974i.m16737d(fVar);
    }

    /* renamed from: e */
    public boolean mo12716e() {
        return true;
    }

    /* renamed from: g */
    public C3923l.C3924a mo12717g(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        C3971a[] aVarArr = this.f12328o;
        if (aVarArr.length == 0) {
            return new C3923l.C3924a(C3926m.f11914c);
        }
        int i = this.f12330q;
        if (i != -1) {
            C3978m mVar = aVarArr[i].f12334b;
            int l = m16711l(mVar, j);
            if (l == -1) {
                return new C3923l.C3924a(C3926m.f11914c);
            }
            long j6 = mVar.f12377e[l];
            j2 = mVar.f12374b[l];
            if (j6 >= j || l >= mVar.f12373a - 1 || (b = mVar.mo12813b(j)) == -1 || b == l) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = mVar.f12377e[b];
                j5 = mVar.f12374b[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C3971a[] aVarArr2 = this.f12328o;
            if (i2 >= aVarArr2.length) {
                break;
            }
            if (i2 != this.f12330q) {
                C3978m mVar2 = aVarArr2[i2].f12334b;
                long n = m16713n(mVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m16713n(mVar2, j4, j3);
                }
                j2 = n;
            }
            i2++;
        }
        C3926m mVar3 = new C3926m(j, j2);
        return j4 == -9223372036854775807L ? new C3923l.C3924a(mVar3) : new C3923l.C3924a(mVar3, new C3926m(j4, j3));
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f12319f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m16719t(fVar, kVar);
                    }
                    throw new IllegalStateException();
                } else if (m16718s(fVar, kVar)) {
                    return 1;
                }
            } else if (!m16717r(fVar)) {
                return -1;
            }
        }
    }

    /* renamed from: i */
    public long mo12718i() {
        return this.f12331r;
    }
}
