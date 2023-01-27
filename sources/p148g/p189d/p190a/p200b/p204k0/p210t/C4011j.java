package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4275n;

/* renamed from: g.d.a.b.k0.t.j */
public final class C4011j implements C4008h {

    /* renamed from: a */
    private final C4026t f12533a;

    /* renamed from: b */
    private final boolean f12534b;

    /* renamed from: c */
    private final boolean f12535c;

    /* renamed from: d */
    private final C4020o f12536d = new C4020o(7, 128);

    /* renamed from: e */
    private final C4020o f12537e = new C4020o(8, 128);

    /* renamed from: f */
    private final C4020o f12538f = new C4020o(6, 128);

    /* renamed from: g */
    private long f12539g;

    /* renamed from: h */
    private final boolean[] f12540h = new boolean[3];

    /* renamed from: i */
    private String f12541i;

    /* renamed from: j */
    private C3927n f12542j;

    /* renamed from: k */
    private C4013b f12543k;

    /* renamed from: l */
    private boolean f12544l;

    /* renamed from: m */
    private long f12545m;

    /* renamed from: n */
    private final C4274m f12546n = new C4274m();

    /* renamed from: g.d.a.b.k0.t.j$b */
    private static final class C4013b {

        /* renamed from: a */
        private final C3927n f12547a;

        /* renamed from: b */
        private final boolean f12548b;

        /* renamed from: c */
        private final boolean f12549c;

        /* renamed from: d */
        private final SparseArray<C4270k.C4272b> f12550d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C4270k.C4271a> f12551e = new SparseArray<>();

        /* renamed from: f */
        private final C4275n f12552f;

        /* renamed from: g */
        private byte[] f12553g;

        /* renamed from: h */
        private int f12554h;

        /* renamed from: i */
        private int f12555i;

        /* renamed from: j */
        private long f12556j;

        /* renamed from: k */
        private boolean f12557k;

        /* renamed from: l */
        private long f12558l;

        /* renamed from: m */
        private C4014a f12559m = new C4014a();

        /* renamed from: n */
        private C4014a f12560n = new C4014a();

        /* renamed from: o */
        private boolean f12561o;

        /* renamed from: p */
        private long f12562p;

        /* renamed from: q */
        private long f12563q;

        /* renamed from: r */
        private boolean f12564r;

        /* renamed from: g.d.a.b.k0.t.j$b$a */
        private static final class C4014a {

            /* renamed from: a */
            private boolean f12565a;

            /* renamed from: b */
            private boolean f12566b;

            /* renamed from: c */
            private C4270k.C4272b f12567c;

            /* renamed from: d */
            private int f12568d;

            /* renamed from: e */
            private int f12569e;

            /* renamed from: f */
            private int f12570f;

            /* renamed from: g */
            private int f12571g;

            /* renamed from: h */
            private boolean f12572h;

            /* renamed from: i */
            private boolean f12573i;

            /* renamed from: j */
            private boolean f12574j;

            /* renamed from: k */
            private boolean f12575k;

            /* renamed from: l */
            private int f12576l;

            /* renamed from: m */
            private int f12577m;

            /* renamed from: n */
            private int f12578n;

            /* renamed from: o */
            private int f12579o;

            /* renamed from: p */
            private int f12580p;

            private C4014a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public boolean m16925c(C4014a aVar) {
                boolean z;
                boolean z2;
                if (this.f12565a) {
                    if (!aVar.f12565a || this.f12570f != aVar.f12570f || this.f12571g != aVar.f12571g || this.f12572h != aVar.f12572h) {
                        return true;
                    }
                    if (this.f12573i && aVar.f12573i && this.f12574j != aVar.f12574j) {
                        return true;
                    }
                    int i = this.f12568d;
                    int i2 = aVar.f12568d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    if (this.f12567c.f13636h == 0 && aVar.f12567c.f13636h == 0 && (this.f12577m != aVar.f12577m || this.f12578n != aVar.f12578n)) {
                        return true;
                    }
                    if ((this.f12567c.f13636h != 1 || aVar.f12567c.f13636h != 1 || (this.f12579o == aVar.f12579o && this.f12580p == aVar.f12580p)) && (z = this.f12575k) == (z2 = aVar.f12575k)) {
                        return z && z2 && this.f12576l != aVar.f12576l;
                    }
                    return true;
                }
            }

            /* renamed from: b */
            public void mo12864b() {
                this.f12566b = false;
                this.f12565a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f12569e;
             */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo12865d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f12566b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f12569e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4011j.C4013b.C4014a.mo12865d():boolean");
            }

            /* renamed from: e */
            public void mo12866e(C4270k.C4272b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f12567c = bVar;
                this.f12568d = i;
                this.f12569e = i2;
                this.f12570f = i3;
                this.f12571g = i4;
                this.f12572h = z;
                this.f12573i = z2;
                this.f12574j = z3;
                this.f12575k = z4;
                this.f12576l = i5;
                this.f12577m = i6;
                this.f12578n = i7;
                this.f12579o = i8;
                this.f12580p = i9;
                this.f12565a = true;
                this.f12566b = true;
            }

            /* renamed from: f */
            public void mo12867f(int i) {
                this.f12569e = i;
                this.f12566b = true;
            }
        }

        public C4013b(C3927n nVar, boolean z, boolean z2) {
            this.f12547a = nVar;
            this.f12548b = z;
            this.f12549c = z2;
            byte[] bArr = new byte[128];
            this.f12553g = bArr;
            this.f12552f = new C4275n(bArr, 0, 0);
            mo12862g();
        }

        /* renamed from: d */
        private void m16916d(int i) {
            boolean z = this.f12564r;
            int i2 = (int) (this.f12556j - this.f12562p);
            this.f12547a.mo12736c(this.f12563q, z ? 1 : 0, i2, i, (C3927n.C3928a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo12857a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f12557k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f12553g
                int r4 = r3.length
                int r5 = r0.f12554h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f12553g = r3
            L_0x001e:
                byte[] r3 = r0.f12553g
                int r4 = r0.f12554h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f12554h
                int r1 = r1 + r2
                r0.f12554h = r1
                g.d.a.b.r0.n r2 = r0.f12552f
                byte[] r3 = r0.f12553g
                r4 = 0
                r2.mo13488i(r3, r4, r1)
                g.d.a.b.r0.n r1 = r0.f12552f
                r2 = 8
                boolean r1 = r1.mo13482b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                g.d.a.b.r0.n r1 = r0.f12552f
                r1.mo13489k()
                g.d.a.b.r0.n r1 = r0.f12552f
                int r10 = r1.mo13485e(r7)
                g.d.a.b.r0.n r1 = r0.f12552f
                r2 = 5
                r1.mo13490l(r2)
                g.d.a.b.r0.n r1 = r0.f12552f
                boolean r1 = r1.mo13483c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                g.d.a.b.r0.n r1 = r0.f12552f
                r1.mo13487h()
                g.d.a.b.r0.n r1 = r0.f12552f
                boolean r1 = r1.mo13483c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                g.d.a.b.r0.n r1 = r0.f12552f
                int r11 = r1.mo13487h()
                boolean r1 = r0.f12549c
                if (r1 != 0) goto L_0x0079
                r0.f12557k = r4
                g.d.a.b.k0.t.j$b$a r1 = r0.f12560n
                r1.mo12867f(r11)
                return
            L_0x0079:
                g.d.a.b.r0.n r1 = r0.f12552f
                boolean r1 = r1.mo13483c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                g.d.a.b.r0.n r1 = r0.f12552f
                int r13 = r1.mo13487h()
                android.util.SparseArray<g.d.a.b.r0.k$a> r1 = r0.f12551e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.f12557k = r4
                return
            L_0x0093:
                android.util.SparseArray<g.d.a.b.r0.k$a> r1 = r0.f12551e
                java.lang.Object r1 = r1.get(r13)
                g.d.a.b.r0.k$a r1 = (p148g.p189d.p190a.p200b.p230r0.C4270k.C4271a) r1
                android.util.SparseArray<g.d.a.b.r0.k$b> r3 = r0.f12550d
                int r5 = r1.f13627b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                g.d.a.b.r0.k$b r9 = (p148g.p189d.p190a.p200b.p230r0.C4270k.C4272b) r9
                boolean r3 = r9.f13633e
                if (r3 == 0) goto L_0x00b8
                g.d.a.b.r0.n r3 = r0.f12552f
                boolean r3 = r3.mo13482b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                g.d.a.b.r0.n r3 = r0.f12552f
                r3.mo13490l(r7)
            L_0x00b8:
                g.d.a.b.r0.n r3 = r0.f12552f
                int r5 = r9.f13635g
                boolean r3 = r3.mo13482b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                g.d.a.b.r0.n r3 = r0.f12552f
                int r5 = r9.f13635g
                int r12 = r3.mo13485e(r5)
                boolean r3 = r9.f13634f
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                g.d.a.b.r0.n r3 = r0.f12552f
                boolean r3 = r3.mo13482b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                g.d.a.b.r0.n r3 = r0.f12552f
                boolean r3 = r3.mo13484d()
                if (r3 == 0) goto L_0x00f5
                g.d.a.b.r0.n r6 = r0.f12552f
                boolean r6 = r6.mo13482b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                g.d.a.b.r0.n r6 = r0.f12552f
                boolean r6 = r6.mo13484d()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.f12555i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                g.d.a.b.r0.n r2 = r0.f12552f
                boolean r2 = r2.mo13483c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                g.d.a.b.r0.n r2 = r0.f12552f
                int r2 = r2.mo13487h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.f13636h
                if (r2 != 0) goto L_0x014e
                g.d.a.b.r0.n r2 = r0.f12552f
                int r3 = r9.f13637i
                boolean r2 = r2.mo13482b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                g.d.a.b.r0.n r2 = r0.f12552f
                int r3 = r9.f13637i
                int r2 = r2.mo13485e(r3)
                boolean r1 = r1.f13628c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                g.d.a.b.r0.n r1 = r0.f12552f
                boolean r1 = r1.mo13483c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                g.d.a.b.r0.n r1 = r0.f12552f
                int r1 = r1.mo13486g()
                r20 = r1
                r19 = r2
                goto L_0x018c
            L_0x014b:
                r19 = r2
                goto L_0x018a
            L_0x014e:
                if (r2 != r5) goto L_0x0188
                boolean r2 = r9.f13638j
                if (r2 != 0) goto L_0x0188
                g.d.a.b.r0.n r2 = r0.f12552f
                boolean r2 = r2.mo13483c()
                if (r2 != 0) goto L_0x015d
                return
            L_0x015d:
                g.d.a.b.r0.n r2 = r0.f12552f
                int r2 = r2.mo13486g()
                boolean r1 = r1.f13628c
                if (r1 == 0) goto L_0x0181
                if (r14 != 0) goto L_0x0181
                g.d.a.b.r0.n r1 = r0.f12552f
                boolean r1 = r1.mo13483c()
                if (r1 != 0) goto L_0x0172
                return
            L_0x0172:
                g.d.a.b.r0.n r1 = r0.f12552f
                int r1 = r1.mo13486g()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x0181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x018e
            L_0x0188:
                r19 = 0
            L_0x018a:
                r20 = 0
            L_0x018c:
                r21 = 0
            L_0x018e:
                r22 = 0
            L_0x0190:
                g.d.a.b.k0.t.j$b$a r8 = r0.f12560n
                r8.mo12866e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f12557k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4011j.C4013b.mo12857a(byte[], int, int):void");
        }

        /* renamed from: b */
        public void mo12858b(long j, int i) {
            boolean z = false;
            if (this.f12555i == 9 || (this.f12549c && this.f12560n.m16925c(this.f12559m))) {
                if (this.f12561o) {
                    m16916d(i + ((int) (j - this.f12556j)));
                }
                this.f12562p = this.f12556j;
                this.f12563q = this.f12558l;
                this.f12564r = false;
                this.f12561o = true;
            }
            boolean z2 = this.f12564r;
            int i2 = this.f12555i;
            if (i2 == 5 || (this.f12548b && i2 == 1 && this.f12560n.mo12865d())) {
                z = true;
            }
            this.f12564r = z2 | z;
        }

        /* renamed from: c */
        public boolean mo12859c() {
            return this.f12549c;
        }

        /* renamed from: e */
        public void mo12860e(C4270k.C4271a aVar) {
            this.f12551e.append(aVar.f13626a, aVar);
        }

        /* renamed from: f */
        public void mo12861f(C4270k.C4272b bVar) {
            this.f12550d.append(bVar.f13629a, bVar);
        }

        /* renamed from: g */
        public void mo12862g() {
            this.f12557k = false;
            this.f12561o = false;
            this.f12560n.mo12864b();
        }

        /* renamed from: h */
        public void mo12863h(long j, int i, long j2) {
            this.f12555i = i;
            this.f12558l = j2;
            this.f12556j = j;
            if (!this.f12548b || i != 1) {
                if (this.f12549c) {
                    int i2 = this.f12555i;
                    if (!(i2 == 5 || i2 == 1 || i2 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C4014a aVar = this.f12559m;
            this.f12559m = this.f12560n;
            this.f12560n = aVar;
            aVar.mo12864b();
            this.f12554h = 0;
            this.f12557k = true;
        }
    }

    public C4011j(C4026t tVar, boolean z, boolean z2) {
        this.f12533a = tVar;
        this.f12534b = z;
        this.f12535c = z2;
    }

    /* renamed from: b */
    private void m16908b(long j, int i, int i2, long j2) {
        C4020o oVar;
        int i3 = i2;
        if (!this.f12544l || this.f12543k.mo12859c()) {
            this.f12536d.mo12873b(i3);
            this.f12537e.mo12873b(i3);
            if (!this.f12544l) {
                if (this.f12536d.mo12874c() && this.f12537e.mo12874c()) {
                    ArrayList arrayList = new ArrayList();
                    C4020o oVar2 = this.f12536d;
                    arrayList.add(Arrays.copyOf(oVar2.f12649d, oVar2.f12650e));
                    C4020o oVar3 = this.f12537e;
                    arrayList.add(Arrays.copyOf(oVar3.f12649d, oVar3.f12650e));
                    C4020o oVar4 = this.f12536d;
                    C4270k.C4272b i4 = C4270k.m18126i(oVar4.f12649d, 3, oVar4.f12650e);
                    C4020o oVar5 = this.f12537e;
                    C4270k.C4271a h = C4270k.m18125h(oVar5.f12649d, 3, oVar5.f12650e);
                    this.f12542j.mo12737d(C4109n.m17346p(this.f12541i, "video/avc", (String) null, -1, -1, i4.f13630b, i4.f13631c, -1.0f, arrayList, -1, i4.f13632d, (C3900a) null));
                    this.f12544l = true;
                    this.f12543k.mo12861f(i4);
                    this.f12543k.mo12860e(h);
                    this.f12536d.mo12875d();
                    oVar = this.f12537e;
                }
            } else if (this.f12536d.mo12874c()) {
                C4020o oVar6 = this.f12536d;
                this.f12543k.mo12861f(C4270k.m18126i(oVar6.f12649d, 3, oVar6.f12650e));
                oVar = this.f12536d;
            } else if (this.f12537e.mo12874c()) {
                C4020o oVar7 = this.f12537e;
                this.f12543k.mo12860e(C4270k.m18125h(oVar7.f12649d, 3, oVar7.f12650e));
                oVar = this.f12537e;
            }
            oVar.mo12875d();
        }
        if (this.f12538f.mo12873b(i2)) {
            C4020o oVar8 = this.f12538f;
            this.f12546n.mo13452H(this.f12538f.f12649d, C4270k.m18128k(oVar8.f12649d, oVar8.f12650e));
            this.f12546n.mo13454J(4);
            this.f12533a.mo12884a(j2, this.f12546n);
        }
        this.f12543k.mo12858b(j, i);
    }

    /* renamed from: g */
    private void m16909g(byte[] bArr, int i, int i2) {
        if (!this.f12544l || this.f12543k.mo12859c()) {
            this.f12536d.mo12872a(bArr, i, i2);
            this.f12537e.mo12872a(bArr, i, i2);
        }
        this.f12538f.mo12872a(bArr, i, i2);
        this.f12543k.mo12857a(bArr, i, i2);
    }

    /* renamed from: h */
    private void m16910h(long j, int i, long j2) {
        if (!this.f12544l || this.f12543k.mo12859c()) {
            this.f12536d.mo12876e(i);
            this.f12537e.mo12876e(i);
        }
        this.f12538f.mo12876e(i);
        this.f12543k.mo12863h(j, i, j2);
    }

    /* renamed from: a */
    public void mo12847a() {
        C4270k.m18118a(this.f12540h);
        this.f12536d.mo12875d();
        this.f12537e.mo12875d();
        this.f12538f.mo12875d();
        this.f12543k.mo12862g();
        this.f12539g = 0;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        int c = mVar.mo13458c();
        int d = mVar.mo13459d();
        byte[] bArr = mVar.f13643a;
        this.f12539g += (long) mVar.mo13456a();
        this.f12542j.mo12734a(mVar, mVar.mo13456a());
        while (true) {
            int c2 = C4270k.m18120c(bArr, c, d, this.f12540h);
            if (c2 == d) {
                m16909g(bArr, c, d);
                return;
            }
            int f = C4270k.m18123f(bArr, c2);
            int i = c2 - c;
            if (i > 0) {
                m16909g(bArr, c, c2);
            }
            int i2 = d - c2;
            long j = this.f12539g - ((long) i2);
            m16908b(j, i2, i < 0 ? -i : 0, this.f12545m);
            m16910h(j, f, this.f12545m);
            c = c2 + 3;
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12545m = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12541i = dVar.mo12887b();
        C3927n m = gVar.mo12745m(dVar.mo12888c(), 2);
        this.f12542j = m;
        this.f12543k = new C4013b(m, this.f12534b, this.f12535c);
        this.f12533a.mo12885b(gVar, dVar);
    }
}
