package p148g.p189d.p190a.p200b.p204k0.p208r;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.UUID;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3911a;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p208r.C3952a;
import p148g.p189d.p190a.p200b.p219o0.p220m.C4176f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.r.e */
public final class C3966e implements C3915e {

    /* renamed from: I */
    private static final int f12237I = C4284w.m18249o("seig");

    /* renamed from: J */
    private static final byte[] f12238J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    private static final C4109n f12239K = C4109n.m17340j((String) null, "application/x-emsg", Long.MAX_VALUE);

    /* renamed from: A */
    private int f12240A;

    /* renamed from: B */
    private int f12241B;

    /* renamed from: C */
    private int f12242C;

    /* renamed from: D */
    private boolean f12243D;

    /* renamed from: E */
    private C3917g f12244E;

    /* renamed from: F */
    private C3927n[] f12245F;

    /* renamed from: G */
    private C3927n[] f12246G;

    /* renamed from: H */
    private boolean f12247H;

    /* renamed from: a */
    private final int f12248a;

    /* renamed from: b */
    private final C3975j f12249b;

    /* renamed from: c */
    private final List<C4109n> f12250c;

    /* renamed from: d */
    private final C3900a f12251d;

    /* renamed from: e */
    private final SparseArray<C3968b> f12252e;

    /* renamed from: f */
    private final C4274m f12253f;

    /* renamed from: g */
    private final C4274m f12254g;

    /* renamed from: h */
    private final C4274m f12255h;

    /* renamed from: i */
    private final C4274m f12256i;

    /* renamed from: j */
    private final C4274m f12257j;

    /* renamed from: k */
    private final C4282u f12258k;

    /* renamed from: l */
    private final C4274m f12259l;

    /* renamed from: m */
    private final byte[] f12260m;

    /* renamed from: n */
    private final Stack<C3952a.C3953a> f12261n;

    /* renamed from: o */
    private final ArrayDeque<C3967a> f12262o;

    /* renamed from: p */
    private final C3927n f12263p;

    /* renamed from: q */
    private int f12264q;

    /* renamed from: r */
    private int f12265r;

    /* renamed from: s */
    private long f12266s;

    /* renamed from: t */
    private int f12267t;

    /* renamed from: u */
    private C4274m f12268u;

    /* renamed from: v */
    private long f12269v;

    /* renamed from: w */
    private int f12270w;

    /* renamed from: x */
    private long f12271x;

    /* renamed from: y */
    private long f12272y;

    /* renamed from: z */
    private C3968b f12273z;

    /* renamed from: g.d.a.b.k0.r.e$a */
    private static final class C3967a {

        /* renamed from: a */
        public final long f12274a;

        /* renamed from: b */
        public final int f12275b;

        public C3967a(long j, int i) {
            this.f12274a = j;
            this.f12275b = i;
        }
    }

    /* renamed from: g.d.a.b.k0.r.e$b */
    private static final class C3968b {

        /* renamed from: a */
        public final C3977l f12276a = new C3977l();

        /* renamed from: b */
        public final C3927n f12277b;

        /* renamed from: c */
        public C3975j f12278c;

        /* renamed from: d */
        public C3962c f12279d;

        /* renamed from: e */
        public int f12280e;

        /* renamed from: f */
        public int f12281f;

        /* renamed from: g */
        public int f12282g;

        public C3968b(C3927n nVar) {
            this.f12277b = nVar;
        }

        /* renamed from: a */
        public void mo12802a(C3975j jVar, C3962c cVar) {
            C4260a.m18073e(jVar);
            this.f12278c = jVar;
            C4260a.m18073e(cVar);
            this.f12279d = cVar;
            this.f12277b.mo12737d(jVar.f12344f);
            mo12803b();
        }

        /* renamed from: b */
        public void mo12803b() {
            this.f12276a.mo12811f();
            this.f12280e = 0;
            this.f12282g = 0;
            this.f12281f = 0;
        }

        /* renamed from: c */
        public void mo12804c(C3900a aVar) {
            C3976k a = this.f12278c.mo12805a(this.f12276a.f12354a.f12227a);
            this.f12277b.mo12737d(this.f12278c.f12344f.mo13055a(aVar.mo12685b(a != null ? a.f12350a : null)));
        }
    }

    public C3966e(int i) {
        this(i, (C4282u) null);
    }

    public C3966e(int i, C4282u uVar) {
        this(i, uVar, (C3975j) null, (C3900a) null);
    }

    public C3966e(int i, C4282u uVar, C3975j jVar, C3900a aVar) {
        this(i, uVar, jVar, aVar, Collections.emptyList());
    }

    public C3966e(int i, C4282u uVar, C3975j jVar, C3900a aVar, List<C4109n> list) {
        this(i, uVar, jVar, aVar, list, (C3927n) null);
    }

    public C3966e(int i, C4282u uVar, C3975j jVar, C3900a aVar, List<C4109n> list, C3927n nVar) {
        this.f12248a = i | (jVar != null ? 8 : 0);
        this.f12258k = uVar;
        this.f12249b = jVar;
        this.f12251d = aVar;
        this.f12250c = Collections.unmodifiableList(list);
        this.f12263p = nVar;
        this.f12259l = new C4274m(16);
        this.f12253f = new C4274m(C4270k.f13622a);
        this.f12254g = new C4274m(5);
        this.f12255h = new C4274m();
        this.f12256i = new C4274m(1);
        this.f12257j = new C4274m();
        this.f12260m = new byte[16];
        this.f12261n = new Stack<>();
        this.f12262o = new ArrayDeque<>();
        this.f12252e = new SparseArray<>();
        this.f12271x = -9223372036854775807L;
        this.f12272y = -9223372036854775807L;
        m16672f();
    }

    /* renamed from: A */
    private static void m16659A(C3952a.C3953a aVar, SparseArray<C3968b> sparseArray, int i, byte[] bArr) throws C4313u {
        C3968b z = m16691z(aVar.mo12797g(C3952a.f12187y).f12195P0, sparseArray, i);
        if (z != null) {
            C3977l lVar = z.f12276a;
            long j = lVar.f12372s;
            z.mo12803b();
            if (aVar.mo12797g(C3952a.f12185x) != null && (i & 2) == 0) {
                j = m16690y(aVar.mo12797g(C3952a.f12185x).f12195P0);
            }
            m16662D(aVar, z, j, i);
            C3976k a = z.f12278c.mo12805a(lVar.f12354a.f12227a);
            C3952a.C3954b g = aVar.mo12797g(C3952a.f12146d0);
            if (g != null) {
                m16685t(a, g.f12195P0, lVar);
            }
            C3952a.C3954b g2 = aVar.mo12797g(C3952a.f12148e0);
            if (g2 != null) {
                m16684s(g2.f12195P0, lVar);
            }
            C3952a.C3954b g3 = aVar.mo12797g(C3952a.f12156i0);
            if (g3 != null) {
                m16687v(g3.f12195P0, lVar);
            }
            C3952a.C3954b g4 = aVar.mo12797g(C3952a.f12150f0);
            C3952a.C3954b g5 = aVar.mo12797g(C3952a.f12152g0);
            if (!(g4 == null || g5 == null)) {
                m16688w(g4.f12195P0, g5.f12195P0, a != null ? a.f12350a : null, lVar);
            }
            int size = aVar.f12193Q0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3952a.C3954b bVar = aVar.f12193Q0.get(i2);
                if (bVar.f12191a == C3952a.f12154h0) {
                    m16663E(bVar.f12195P0, lVar, bArr);
                }
            }
        }
    }

    /* renamed from: B */
    private static Pair<Integer, C3962c> m16660B(C4274m mVar) {
        mVar.mo13454J(12);
        return Pair.create(Integer.valueOf(mVar.mo13464i()), new C3962c(mVar.mo13446B() - 1, mVar.mo13446B(), mVar.mo13446B(), mVar.mo13464i()));
    }

    /* renamed from: C */
    private static int m16661C(C3968b bVar, int i, long j, int i2, C4274m mVar, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        C3968b bVar2 = bVar;
        mVar.mo13454J(8);
        int b = C3952a.m16617b(mVar.mo13464i());
        C3975j jVar = bVar2.f12278c;
        C3977l lVar = bVar2.f12276a;
        C3962c cVar = lVar.f12354a;
        lVar.f12361h[i] = mVar.mo13446B();
        long[] jArr = lVar.f12360g;
        jArr[i] = lVar.f12356c;
        if ((b & 1) != 0) {
            jArr[i] = jArr[i] + ((long) mVar.mo13464i());
        }
        boolean z5 = (b & 4) != 0;
        int i6 = cVar.f12230d;
        if (z5) {
            i6 = mVar.mo13446B();
        }
        boolean z6 = (b & 256) != 0;
        boolean z7 = (b & 512) != 0;
        boolean z8 = (b & 1024) != 0;
        boolean z9 = (b & 2048) != 0;
        long[] jArr2 = jVar.f12346h;
        long j2 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j2 = C4284w.m18229B(jVar.f12347i[0], 1000, jVar.f12341c);
        }
        int[] iArr = lVar.f12362i;
        int[] iArr2 = lVar.f12363j;
        long[] jArr3 = lVar.f12364k;
        boolean[] zArr = lVar.f12365l;
        int i7 = i6;
        boolean z10 = jVar.f12340b == 2 && (i2 & 1) != 0;
        int i8 = i3 + lVar.f12361h[i];
        long j3 = jVar.f12341c;
        long j4 = j2;
        boolean[] zArr2 = zArr;
        long j5 = i > 0 ? lVar.f12372s : j;
        int i9 = i3;
        while (i9 < i8) {
            int B = z6 ? mVar.mo13446B() : cVar.f12228b;
            if (z7) {
                z = z6;
                i4 = mVar.mo13446B();
            } else {
                z = z6;
                i4 = cVar.f12229c;
            }
            if (i9 == 0 && z5) {
                z2 = z5;
                i5 = i7;
            } else if (z8) {
                z2 = z5;
                i5 = mVar.mo13464i();
            } else {
                z2 = z5;
                i5 = cVar.f12230d;
            }
            boolean z11 = z9;
            if (z9) {
                z4 = z7;
                z3 = z8;
                iArr2[i9] = (int) ((((long) mVar.mo13464i()) * 1000) / j3);
            } else {
                z4 = z7;
                z3 = z8;
                iArr2[i9] = 0;
            }
            jArr3[i9] = C4284w.m18229B(j5, 1000, j3) - j4;
            iArr[i9] = i4;
            zArr2[i9] = ((i5 >> 16) & 1) == 0 && (!z10 || i9 == 0);
            i9++;
            j5 += (long) B;
            j3 = j3;
            z6 = z;
            z5 = z2;
            z9 = z11;
            z7 = z4;
            z8 = z3;
        }
        lVar.f12372s = j5;
        return i8;
    }

    /* renamed from: D */
    private static void m16662D(C3952a.C3953a aVar, C3968b bVar, long j, int i) {
        List<C3952a.C3954b> list = aVar.f12193Q0;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C3952a.C3954b bVar2 = list.get(i4);
            if (bVar2.f12191a == C3952a.f12099A) {
                C4274m mVar = bVar2.f12195P0;
                mVar.mo13454J(12);
                int B = mVar.mo13446B();
                if (B > 0) {
                    i3 += B;
                    i2++;
                }
            }
        }
        bVar.f12282g = 0;
        bVar.f12281f = 0;
        bVar.f12280e = 0;
        bVar.f12276a.mo12810e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C3952a.C3954b bVar3 = list.get(i7);
            if (bVar3.f12191a == C3952a.f12099A) {
                i6 = m16661C(bVar, i5, j, i, bVar3.f12195P0, i6);
                i5++;
            }
        }
    }

    /* renamed from: E */
    private static void m16663E(C4274m mVar, C3977l lVar, byte[] bArr) throws C4313u {
        mVar.mo13454J(8);
        mVar.mo13462g(bArr, 0, 16);
        if (Arrays.equals(bArr, f12238J)) {
            m16686u(mVar, 16, lVar);
        }
    }

    /* renamed from: F */
    private void m16664F(long j) throws C4313u {
        while (!this.f12261n.isEmpty() && this.f12261n.peek().f12192P0 == j) {
            m16676k(this.f12261n.pop());
        }
        m16672f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16665G(p148g.p189d.p190a.p200b.p204k0.C3916f r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.f12267t
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002a
            g.d.a.b.r0.m r0 = r8.f12259l
            byte[] r0 = r0.f13643a
            boolean r0 = r9.mo12721c(r0, r2, r1, r3)
            if (r0 != 0) goto L_0x0013
            return r2
        L_0x0013:
            r8.f12267t = r1
            g.d.a.b.r0.m r0 = r8.f12259l
            r0.mo13454J(r2)
            g.d.a.b.r0.m r0 = r8.f12259l
            long r4 = r0.mo13481z()
            r8.f12266s = r4
            g.d.a.b.r0.m r0 = r8.f12259l
            int r0 = r0.mo13464i()
            r8.f12265r = r0
        L_0x002a:
            long r4 = r8.f12266s
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            g.d.a.b.r0.m r0 = r8.f12259l
            byte[] r0 = r0.f13643a
            r9.readFully(r0, r1, r1)
            int r0 = r8.f12267t
            int r0 = r0 + r1
            r8.f12267t = r0
            g.d.a.b.r0.m r0 = r8.f12259l
            long r4 = r0.mo13447C()
        L_0x0044:
            r8.f12266s = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.mo12722d()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.Stack<g.d.a.b.k0.r.a$a> r0 = r8.f12261n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.Stack<g.d.a.b.k0.r.a$a> r0 = r8.f12261n
            java.lang.Object r0 = r0.peek()
            g.d.a.b.k0.r.a$a r0 = (p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.C3953a) r0
            long r4 = r0.f12192P0
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.mo12729k()
            long r4 = r4 - r6
            int r0 = r8.f12267t
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.f12266s
            int r0 = r8.f12267t
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0145
            long r4 = r9.mo12729k()
            int r0 = r8.f12267t
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r8.f12265r
            int r6 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12121L
            if (r0 != r6) goto L_0x00aa
            android.util.SparseArray<g.d.a.b.k0.r.e$b> r0 = r8.f12252e
            int r0 = r0.size()
            r6 = 0
        L_0x0095:
            if (r6 >= r0) goto L_0x00aa
            android.util.SparseArray<g.d.a.b.k0.r.e$b> r7 = r8.f12252e
            java.lang.Object r7 = r7.valueAt(r6)
            g.d.a.b.k0.r.e$b r7 = (p148g.p189d.p190a.p200b.p204k0.p208r.C3966e.C3968b) r7
            g.d.a.b.k0.r.l r7 = r7.f12276a
            r7.f12355b = r4
            r7.f12357d = r4
            r7.f12356c = r4
            int r6 = r6 + 1
            goto L_0x0095
        L_0x00aa:
            int r0 = r8.f12265r
            int r6 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12155i
            r7 = 0
            if (r0 != r6) goto L_0x00ce
            r8.f12273z = r7
            long r0 = r8.f12266s
            long r0 = r0 + r4
            r8.f12269v = r0
            boolean r9 = r8.f12247H
            if (r9 != 0) goto L_0x00ca
            g.d.a.b.k0.g r9 = r8.f12244E
            g.d.a.b.k0.l$b r0 = new g.d.a.b.k0.l$b
            long r1 = r8.f12271x
            r0.<init>(r1, r4)
            r9.mo12743b(r0)
            r8.f12247H = r3
        L_0x00ca:
            r9 = 2
            r8.f12264q = r9
            return r3
        L_0x00ce:
            boolean r0 = m16669K(r0)
            if (r0 == 0) goto L_0x00fb
            long r0 = r9.mo12729k()
            long r4 = r8.f12266s
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.Stack<g.d.a.b.k0.r.a$a> r9 = r8.f12261n
            g.d.a.b.k0.r.a$a r2 = new g.d.a.b.k0.r.a$a
            int r4 = r8.f12265r
            r2.<init>(r4, r0)
            r9.add(r2)
            long r4 = r8.f12266s
            int r9 = r8.f12267t
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00f7
            r8.m16664F(r0)
            goto L_0x013c
        L_0x00f7:
            r8.m16672f()
            goto L_0x013c
        L_0x00fb:
            int r9 = r8.f12265r
            boolean r9 = m16670L(r9)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r9 == 0) goto L_0x0132
            int r9 = r8.f12267t
            if (r9 != r1) goto L_0x012a
            long r6 = r8.f12266s
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0122
            g.d.a.b.r0.m r9 = new g.d.a.b.r0.m
            int r0 = (int) r6
            r9.<init>((int) r0)
            r8.f12268u = r9
            g.d.a.b.r0.m r0 = r8.f12259l
            byte[] r0 = r0.f13643a
            byte[] r9 = r9.f13643a
            java.lang.System.arraycopy(r0, r2, r9, r2, r1)
            goto L_0x013a
        L_0x0122:
            g.d.a.b.u r9 = new g.d.a.b.u
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            r9.<init>(r0)
            throw r9
        L_0x012a:
            g.d.a.b.u r9 = new g.d.a.b.u
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            r9.<init>(r0)
            throw r9
        L_0x0132:
            long r0 = r8.f12266s
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x013d
            r8.f12268u = r7
        L_0x013a:
            r8.f12264q = r3
        L_0x013c:
            return r3
        L_0x013d:
            g.d.a.b.u r9 = new g.d.a.b.u
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            r9.<init>(r0)
            throw r9
        L_0x0145:
            g.d.a.b.u r9 = new g.d.a.b.u
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>(r0)
            goto L_0x014e
        L_0x014d:
            throw r9
        L_0x014e:
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p208r.C3966e.m16665G(g.d.a.b.k0.f):boolean");
    }

    /* renamed from: H */
    private void m16666H(C3916f fVar) throws IOException, InterruptedException {
        int i = ((int) this.f12266s) - this.f12267t;
        C4274m mVar = this.f12268u;
        if (mVar != null) {
            fVar.readFully(mVar.f13643a, 8, i);
            m16678m(new C3952a.C3954b(this.f12265r, this.f12268u), fVar.mo12729k());
        } else {
            fVar.mo12724f(i);
        }
        m16664F(fVar.mo12729k());
    }

    /* renamed from: I */
    private void m16667I(C3916f fVar) throws IOException, InterruptedException {
        int size = this.f12252e.size();
        C3968b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C3977l lVar = this.f12252e.valueAt(i).f12276a;
            if (lVar.f12371r) {
                long j2 = lVar.f12357d;
                if (j2 < j) {
                    bVar = this.f12252e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f12264q = 3;
            return;
        }
        int k = (int) (j - fVar.mo12729k());
        if (k >= 0) {
            fVar.mo12724f(k);
            bVar.f12276a.mo12806a(fVar);
            return;
        }
        throw new C4313u("Offset to encryption data was negative.");
    }

    /* renamed from: J */
    private boolean m16668J(C3916f fVar) throws IOException, InterruptedException {
        C3927n.C3928a aVar;
        boolean z;
        int i;
        C3916f fVar2 = fVar;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.f12264q == 3) {
            if (this.f12273z == null) {
                C3968b i5 = m16674i(this.f12252e);
                if (i5 == null) {
                    int k = (int) (this.f12269v - fVar.mo12729k());
                    if (k >= 0) {
                        fVar2.mo12724f(k);
                        m16672f();
                        return false;
                    }
                    throw new C4313u("Offset to end of mdat was negative.");
                }
                int k2 = (int) (i5.f12276a.f12360g[i5.f12282g] - fVar.mo12729k());
                if (k2 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    k2 = 0;
                }
                fVar2.mo12724f(k2);
                this.f12273z = i5;
            }
            C3968b bVar = this.f12273z;
            C3977l lVar = bVar.f12276a;
            this.f12240A = lVar.f12362i[bVar.f12280e];
            if (lVar.f12366m) {
                int e = m16671e(bVar);
                this.f12241B = e;
                this.f12240A += e;
            } else {
                this.f12241B = 0;
            }
            if (this.f12273z.f12278c.f12345g == 1) {
                this.f12240A -= 8;
                fVar2.mo12724f(8);
            }
            this.f12264q = 4;
            this.f12242C = 0;
        }
        C3968b bVar2 = this.f12273z;
        C3977l lVar2 = bVar2.f12276a;
        C3975j jVar = bVar2.f12278c;
        C3927n nVar = bVar2.f12277b;
        int i6 = bVar2.f12280e;
        int i7 = jVar.f12348j;
        if (i7 == 0) {
            while (true) {
                int i8 = this.f12241B;
                int i9 = this.f12240A;
                if (i8 >= i9) {
                    break;
                }
                this.f12241B += nVar.mo12735b(fVar2, i9 - i8, false);
            }
        } else {
            byte[] bArr = this.f12254g.f13643a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = i7 + 1;
            int i11 = 4 - i7;
            while (this.f12241B < this.f12240A) {
                int i12 = this.f12242C;
                if (i12 == 0) {
                    fVar2.readFully(bArr, i11, i10);
                    this.f12254g.mo13454J(i4);
                    this.f12242C = this.f12254g.mo13446B() - i3;
                    this.f12253f.mo13454J(i4);
                    nVar.mo12734a(this.f12253f, i2);
                    nVar.mo12734a(this.f12254g, i3);
                    this.f12243D = this.f12246G.length > 0 && C4270k.m18124g(jVar.f12344f.f12949k, bArr[i2]);
                    this.f12241B += 5;
                    this.f12240A += i11;
                } else {
                    if (this.f12243D) {
                        this.f12255h.mo13451G(i12);
                        fVar2.readFully(this.f12255h.f13643a, i4, this.f12242C);
                        nVar.mo12734a(this.f12255h, this.f12242C);
                        i = this.f12242C;
                        C4274m mVar = this.f12255h;
                        int k3 = C4270k.m18128k(mVar.f13643a, mVar.mo13459d());
                        this.f12255h.mo13454J("video/hevc".equals(jVar.f12344f.f12949k) ? 1 : 0);
                        this.f12255h.mo13453I(k3);
                        C4176f.m17704a(lVar2.mo12808c(i6) * 1000, this.f12255h, this.f12246G);
                    } else {
                        i = nVar.mo12735b(fVar2, i12, false);
                    }
                    this.f12241B += i;
                    this.f12242C -= i;
                    i2 = 4;
                    i3 = 1;
                    i4 = 0;
                }
            }
        }
        long c = lVar2.mo12808c(i6) * 1000;
        C4282u uVar = this.f12258k;
        if (uVar != null) {
            c = uVar.mo13497a(c);
        }
        boolean z2 = lVar2.f12365l[i6];
        if (lVar2.f12366m) {
            boolean z3 = z2 | true;
            C3976k kVar = lVar2.f12368o;
            if (kVar == null) {
                kVar = jVar.mo12805a(lVar2.f12354a.f12227a);
            }
            z = z3;
            aVar = kVar.f12351b;
        } else {
            z = z2;
            aVar = null;
        }
        nVar.mo12736c(c, z ? 1 : 0, this.f12240A, 0, aVar);
        m16681p(c);
        C3968b bVar3 = this.f12273z;
        bVar3.f12280e++;
        int i13 = bVar3.f12281f + 1;
        bVar3.f12281f = i13;
        int[] iArr = lVar2.f12361h;
        int i14 = bVar3.f12282g;
        if (i13 == iArr[i14]) {
            bVar3.f12282g = i14 + 1;
            bVar3.f12281f = 0;
            this.f12273z = null;
        }
        this.f12264q = 3;
        return true;
    }

    /* renamed from: K */
    private static boolean m16669K(int i) {
        return i == C3952a.f12103C || i == C3952a.f12107E || i == C3952a.f12109F || i == C3952a.f12111G || i == C3952a.f12113H || i == C3952a.f12121L || i == C3952a.f12123M || i == C3952a.f12125N || i == C3952a.f12130Q;
    }

    /* renamed from: L */
    private static boolean m16670L(int i) {
        return i == C3952a.f12133T || i == C3952a.f12132S || i == C3952a.f12105D || i == C3952a.f12101B || i == C3952a.f12134U || i == C3952a.f12185x || i == C3952a.f12187y || i == C3952a.f12129P || i == C3952a.f12189z || i == C3952a.f12099A || i == C3952a.f12135V || i == C3952a.f12146d0 || i == C3952a.f12148e0 || i == C3952a.f12156i0 || i == C3952a.f12154h0 || i == C3952a.f12150f0 || i == C3952a.f12152g0 || i == C3952a.f12131R || i == C3952a.f12127O || i == C3952a.f12112G0;
    }

    /* renamed from: e */
    private int m16671e(C3968b bVar) {
        C4274m mVar;
        C3977l lVar = bVar.f12276a;
        int i = lVar.f12354a.f12227a;
        C3976k kVar = lVar.f12368o;
        if (kVar == null) {
            kVar = bVar.f12278c.mo12805a(i);
        }
        int i2 = kVar.f12352c;
        if (i2 != 0) {
            mVar = lVar.f12370q;
        } else {
            byte[] bArr = kVar.f12353d;
            this.f12257j.mo13452H(bArr, bArr.length);
            mVar = this.f12257j;
            i2 = bArr.length;
        }
        boolean z = lVar.f12367n[bVar.f12280e];
        this.f12256i.f13643a[0] = (byte) ((z ? 128 : 0) | i2);
        this.f12256i.mo13454J(0);
        C3927n nVar = bVar.f12277b;
        nVar.mo12734a(this.f12256i, 1);
        nVar.mo12734a(mVar, i2);
        if (!z) {
            return i2 + 1;
        }
        C4274m mVar2 = lVar.f12370q;
        int D = mVar2.mo13448D();
        mVar2.mo13455K(-2);
        int i3 = (D * 6) + 2;
        nVar.mo12734a(mVar2, i3);
        return i2 + 1 + i3;
    }

    /* renamed from: f */
    private void m16672f() {
        this.f12264q = 0;
        this.f12267t = 0;
    }

    /* renamed from: g */
    private static C3900a m16673g(List<C3952a.C3954b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C3952a.C3954b bVar = list.get(i);
            if (bVar.f12191a == C3952a.f12135V) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f12195P0.f13643a;
                UUID b = C3972h.m16732b(bArr);
                if (b == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C3900a.C3902b(b, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C3900a((List<C3900a.C3902b>) arrayList);
    }

    /* renamed from: i */
    private static C3968b m16674i(SparseArray<C3968b> sparseArray) {
        int size = sparseArray.size();
        C3968b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C3968b valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.f12282g;
            C3977l lVar = valueAt.f12276a;
            if (i2 != lVar.f12358e) {
                long j2 = lVar.f12360g[i2];
                if (j2 < j) {
                    bVar = valueAt;
                    j = j2;
                }
            }
        }
        return bVar;
    }

    /* renamed from: j */
    private void m16675j() {
        int i;
        if (this.f12245F == null) {
            C3927n[] nVarArr = new C3927n[2];
            this.f12245F = nVarArr;
            C3927n nVar = this.f12263p;
            if (nVar != null) {
                nVarArr[0] = nVar;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f12248a & 4) != 0) {
                this.f12245F[i] = this.f12244E.mo12745m(this.f12252e.size(), 4);
                i++;
            }
            C3927n[] nVarArr2 = (C3927n[]) Arrays.copyOf(this.f12245F, i);
            this.f12245F = nVarArr2;
            for (C3927n d : nVarArr2) {
                d.mo12737d(f12239K);
            }
        }
        if (this.f12246G == null) {
            this.f12246G = new C3927n[this.f12250c.size()];
            for (int i2 = 0; i2 < this.f12246G.length; i2++) {
                C3927n m = this.f12244E.mo12745m(this.f12252e.size() + 1 + i2, 3);
                m.mo12737d(this.f12250c.get(i2));
                this.f12246G[i2] = m;
            }
        }
    }

    /* renamed from: k */
    private void m16676k(C3952a.C3953a aVar) throws C4313u {
        int i = aVar.f12191a;
        if (i == C3952a.f12103C) {
            m16680o(aVar);
        } else if (i == C3952a.f12121L) {
            m16679n(aVar);
        } else if (!this.f12261n.isEmpty()) {
            this.f12261n.peek().mo12794d(aVar);
        }
    }

    /* renamed from: l */
    private void m16677l(C4274m mVar) {
        C3927n[] nVarArr = this.f12245F;
        if (nVarArr != null && nVarArr.length != 0) {
            mVar.mo13454J(12);
            int a = mVar.mo13456a();
            mVar.mo13473r();
            mVar.mo13473r();
            long B = C4284w.m18229B(mVar.mo13481z(), 1000000, mVar.mo13481z());
            for (C3927n a2 : this.f12245F) {
                mVar.mo13454J(12);
                a2.mo12734a(mVar, a);
            }
            if (this.f12272y != -9223372036854775807L) {
                for (C3927n c : this.f12245F) {
                    c.mo12736c(this.f12272y + B, 1, a, 0, (C3927n.C3928a) null);
                }
                return;
            }
            this.f12262o.addLast(new C3967a(B, a));
            this.f12270w += a;
        }
    }

    /* renamed from: m */
    private void m16678m(C3952a.C3954b bVar, long j) throws C4313u {
        if (!this.f12261n.isEmpty()) {
            this.f12261n.peek().mo12795e(bVar);
            return;
        }
        int i = bVar.f12191a;
        if (i == C3952a.f12101B) {
            Pair<Long, C3911a> x = m16689x(bVar.f12195P0, j);
            this.f12272y = ((Long) x.first).longValue();
            this.f12244E.mo12743b((C3923l) x.second);
            this.f12247H = true;
        } else if (i == C3952a.f12112G0) {
            m16677l(bVar.f12195P0);
        }
    }

    /* renamed from: n */
    private void m16679n(C3952a.C3953a aVar) throws C4313u {
        m16683r(aVar, this.f12252e, this.f12248a, this.f12260m);
        C3900a g = this.f12251d != null ? null : m16673g(aVar.f12193Q0);
        if (g != null) {
            int size = this.f12252e.size();
            for (int i = 0; i < size; i++) {
                this.f12252e.valueAt(i).mo12804c(g);
            }
        }
    }

    /* renamed from: o */
    private void m16680o(C3952a.C3953a aVar) throws C4313u {
        int i;
        int i2;
        C3952a.C3953a aVar2 = aVar;
        boolean z = true;
        int i3 = 0;
        C4260a.m18075g(this.f12249b == null, "Unexpected moov box.");
        C3900a aVar3 = this.f12251d;
        if (aVar3 == null) {
            aVar3 = m16673g(aVar2.f12193Q0);
        }
        C3952a.C3953a f = aVar2.mo12796f(C3952a.f12125N);
        SparseArray sparseArray = new SparseArray();
        int size = f.f12193Q0.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            C3952a.C3954b bVar = f.f12193Q0.get(i4);
            int i5 = bVar.f12191a;
            if (i5 == C3952a.f12189z) {
                Pair<Integer, C3962c> B = m16660B(bVar.f12195P0);
                sparseArray.put(((Integer) B.first).intValue(), B.second);
            } else if (i5 == C3952a.f12127O) {
                j = m16682q(bVar.f12195P0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.f12194R0.size();
        int i6 = 0;
        while (i6 < size2) {
            C3952a.C3953a aVar4 = aVar2.f12194R0.get(i6);
            if (aVar4.f12191a == C3952a.f12107E) {
                i = i6;
                i2 = size2;
                C3975j t = C3955b.m16642t(aVar4, aVar2.mo12797g(C3952a.f12105D), j, aVar3, (this.f12248a & 16) != 0, false);
                if (t != null) {
                    sparseArray2.put(t.f12339a, t);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.f12252e.size() == 0) {
            while (i3 < size3) {
                C3975j jVar = (C3975j) sparseArray2.valueAt(i3);
                C3968b bVar2 = new C3968b(this.f12244E.mo12745m(i3, jVar.f12340b));
                bVar2.mo12802a(jVar, (C3962c) sparseArray.get(jVar.f12339a));
                this.f12252e.put(jVar.f12339a, bVar2);
                this.f12271x = Math.max(this.f12271x, jVar.f12343e);
                i3++;
            }
            m16675j();
            this.f12244E.mo12744c();
            return;
        }
        if (this.f12252e.size() != size3) {
            z = false;
        }
        C4260a.m18074f(z);
        while (i3 < size3) {
            C3975j jVar2 = (C3975j) sparseArray2.valueAt(i3);
            this.f12252e.get(jVar2.f12339a).mo12802a(jVar2, (C3962c) sparseArray.get(jVar2.f12339a));
            i3++;
        }
    }

    /* renamed from: p */
    private void m16681p(long j) {
        while (!this.f12262o.isEmpty()) {
            C3967a removeFirst = this.f12262o.removeFirst();
            this.f12270w -= removeFirst.f12275b;
            for (C3927n c : this.f12245F) {
                c.mo12736c(removeFirst.f12274a + j, 1, removeFirst.f12275b, this.f12270w, (C3927n.C3928a) null);
            }
        }
    }

    /* renamed from: q */
    private static long m16682q(C4274m mVar) {
        mVar.mo13454J(8);
        return C3952a.m16618c(mVar.mo13464i()) == 0 ? mVar.mo13481z() : mVar.mo13447C();
    }

    /* renamed from: r */
    private static void m16683r(C3952a.C3953a aVar, SparseArray<C3968b> sparseArray, int i, byte[] bArr) throws C4313u {
        int size = aVar.f12194R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3952a.C3953a aVar2 = aVar.f12194R0.get(i2);
            if (aVar2.f12191a == C3952a.f12123M) {
                m16659A(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: s */
    private static void m16684s(C4274m mVar, C3977l lVar) throws C4313u {
        mVar.mo13454J(8);
        int i = mVar.mo13464i();
        if ((C3952a.m16617b(i) & 1) == 1) {
            mVar.mo13455K(8);
        }
        int B = mVar.mo13446B();
        if (B == 1) {
            lVar.f12357d += C3952a.m16618c(i) == 0 ? mVar.mo13481z() : mVar.mo13447C();
            return;
        }
        throw new C4313u("Unexpected saio entry count: " + B);
    }

    /* renamed from: t */
    private static void m16685t(C3976k kVar, C4274m mVar, C3977l lVar) throws C4313u {
        int i;
        int i2 = kVar.f12352c;
        mVar.mo13454J(8);
        boolean z = true;
        if ((C3952a.m16617b(mVar.mo13464i()) & 1) == 1) {
            mVar.mo13455K(8);
        }
        int x = mVar.mo13479x();
        int B = mVar.mo13446B();
        if (B == lVar.f12359f) {
            if (x == 0) {
                boolean[] zArr = lVar.f12367n;
                i = 0;
                for (int i3 = 0; i3 < B; i3++) {
                    int x2 = mVar.mo13479x();
                    i += x2;
                    zArr[i3] = x2 > i2;
                }
            } else {
                if (x <= i2) {
                    z = false;
                }
                i = (x * B) + 0;
                Arrays.fill(lVar.f12367n, 0, B, z);
            }
            lVar.mo12809d(i);
            return;
        }
        throw new C4313u("Length mismatch: " + B + ", " + lVar.f12359f);
    }

    /* renamed from: u */
    private static void m16686u(C4274m mVar, int i, C3977l lVar) throws C4313u {
        mVar.mo13454J(i + 8);
        int b = C3952a.m16617b(mVar.mo13464i());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int B = mVar.mo13446B();
            if (B == lVar.f12359f) {
                Arrays.fill(lVar.f12367n, 0, B, z);
                lVar.mo12809d(mVar.mo13456a());
                lVar.mo12807b(mVar);
                return;
            }
            throw new C4313u("Length mismatch: " + B + ", " + lVar.f12359f);
        }
        throw new C4313u("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: v */
    private static void m16687v(C4274m mVar, C3977l lVar) throws C4313u {
        m16686u(mVar, 0, lVar);
    }

    /* renamed from: w */
    private static void m16688w(C4274m mVar, C4274m mVar2, String str, C3977l lVar) throws C4313u {
        byte[] bArr;
        mVar.mo13454J(8);
        int i = mVar.mo13464i();
        if (mVar.mo13464i() == f12237I) {
            if (C3952a.m16618c(i) == 1) {
                mVar.mo13455K(4);
            }
            if (mVar.mo13464i() == 1) {
                mVar2.mo13454J(8);
                int i2 = mVar2.mo13464i();
                if (mVar2.mo13464i() == f12237I) {
                    int c = C3952a.m16618c(i2);
                    if (c == 1) {
                        if (mVar2.mo13481z() == 0) {
                            throw new C4313u("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c >= 2) {
                        mVar2.mo13455K(4);
                    }
                    if (mVar2.mo13481z() == 1) {
                        mVar2.mo13455K(1);
                        int x = mVar2.mo13479x();
                        int i3 = (x & 240) >> 4;
                        int i4 = x & 15;
                        boolean z = mVar2.mo13479x() == 1;
                        if (z) {
                            int x2 = mVar2.mo13479x();
                            byte[] bArr2 = new byte[16];
                            mVar2.mo13462g(bArr2, 0, 16);
                            if (!z || x2 != 0) {
                                bArr = null;
                            } else {
                                int x3 = mVar2.mo13479x();
                                byte[] bArr3 = new byte[x3];
                                mVar2.mo13462g(bArr3, 0, x3);
                                bArr = bArr3;
                            }
                            lVar.f12366m = true;
                            lVar.f12368o = new C3976k(z, str, x2, bArr2, i3, i4, bArr);
                            return;
                        }
                        return;
                    }
                    throw new C4313u("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new C4313u("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: x */
    private static Pair<Long, C3911a> m16689x(C4274m mVar, long j) throws C4313u {
        long j2;
        long j3;
        C4274m mVar2 = mVar;
        mVar2.mo13454J(8);
        int c = C3952a.m16618c(mVar.mo13464i());
        mVar2.mo13455K(4);
        long z = mVar.mo13481z();
        if (c == 0) {
            j3 = mVar.mo13481z();
            j2 = mVar.mo13481z();
        } else {
            j3 = mVar.mo13447C();
            j2 = mVar.mo13447C();
        }
        long j4 = j3;
        long j5 = j + j2;
        long B = C4284w.m18229B(j4, 1000000, z);
        mVar2.mo13455K(2);
        int D = mVar.mo13448D();
        int[] iArr = new int[D];
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long[] jArr3 = new long[D];
        long j6 = j4;
        long j7 = B;
        int i = 0;
        while (i < D) {
            int i2 = mVar.mo13464i();
            if ((i2 & Integer.MIN_VALUE) == 0) {
                long z2 = mVar.mo13481z();
                iArr[i] = i2 & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j7;
                long j8 = j6 + z2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i3 = D;
                int[] iArr2 = iArr;
                long B2 = C4284w.m18229B(j8, 1000000, z);
                jArr4[i] = B2 - jArr5[i];
                mVar2.mo13455K(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                D = i3;
                long j9 = B2;
                j6 = j8;
                j7 = j9;
            } else {
                throw new C4313u("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(B), new C3911a(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: y */
    private static long m16690y(C4274m mVar) {
        mVar.mo13454J(8);
        return C3952a.m16618c(mVar.mo13464i()) == 1 ? mVar.mo13447C() : mVar.mo13481z();
    }

    /* renamed from: z */
    private static C3968b m16691z(C4274m mVar, SparseArray<C3968b> sparseArray, int i) {
        mVar.mo13454J(8);
        int b = C3952a.m16617b(mVar.mo13464i());
        int i2 = mVar.mo13464i();
        if ((i & 8) != 0) {
            i2 = 0;
        }
        C3968b bVar = sparseArray.get(i2);
        if (bVar == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long C = mVar.mo13447C();
            C3977l lVar = bVar.f12276a;
            lVar.f12356c = C;
            lVar.f12357d = C;
        }
        C3962c cVar = bVar.f12279d;
        bVar.f12276a.f12354a = new C3962c((b & 2) != 0 ? mVar.mo13446B() - 1 : cVar.f12227a, (b & 8) != 0 ? mVar.mo13446B() : cVar.f12228b, (b & 16) != 0 ? mVar.mo13446B() : cVar.f12229c, (b & 32) != 0 ? mVar.mo13446B() : cVar.f12230d);
        return bVar;
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12244E = gVar;
        C3975j jVar = this.f12249b;
        if (jVar != null) {
            C3968b bVar = new C3968b(gVar.mo12745m(0, jVar.f12340b));
            bVar.mo12802a(this.f12249b, new C3962c(0, 0, 0, 0));
            this.f12252e.put(0, bVar);
            m16675j();
            this.f12244E.mo12744c();
        }
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        int size = this.f12252e.size();
        for (int i = 0; i < size; i++) {
            this.f12252e.valueAt(i).mo12803b();
        }
        this.f12262o.clear();
        this.f12270w = 0;
        this.f12261n.clear();
        m16672f();
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        return C3974i.m16735b(fVar);
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f12264q;
            if (i != 0) {
                if (i == 1) {
                    m16666H(fVar);
                } else if (i == 2) {
                    m16667I(fVar);
                } else if (m16668J(fVar)) {
                    return 0;
                }
            } else if (!m16665G(fVar)) {
                return -1;
            }
        }
    }
}
