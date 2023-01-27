package p148g.p189d.p190a.p200b.p204k0.p208r;

import android.util.Log;
import android.util.Pair;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3919i;
import p148g.p189d.p190a.p200b.p204k0.p208r.C3952a;
import p148g.p189d.p190a.p200b.p204k0.p208r.C3963d;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4269j;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;
import p148g.p189d.p190a.p200b.p231s0.C4288a;
import p148g.p189d.p190a.p200b.p231s0.C4289b;
import p148g.p189d.p190a.p200b.p231s0.C4294d;

/* renamed from: g.d.a.b.k0.r.b */
final class C3955b {

    /* renamed from: a */
    private static final int f12196a = C4284w.m18249o("vide");

    /* renamed from: b */
    private static final int f12197b = C4284w.m18249o("soun");

    /* renamed from: c */
    private static final int f12198c = C4284w.m18249o("text");

    /* renamed from: d */
    private static final int f12199d = C4284w.m18249o("sbtl");

    /* renamed from: e */
    private static final int f12200e = C4284w.m18249o("subt");

    /* renamed from: f */
    private static final int f12201f = C4284w.m18249o("clcp");

    /* renamed from: g */
    private static final int f12202g = C4284w.m18249o("meta");

    /* renamed from: g.d.a.b.k0.r.b$a */
    private static final class C3956a {

        /* renamed from: a */
        public final int f12203a;

        /* renamed from: b */
        public int f12204b;

        /* renamed from: c */
        public int f12205c;

        /* renamed from: d */
        public long f12206d;

        /* renamed from: e */
        private final boolean f12207e;

        /* renamed from: f */
        private final C4274m f12208f;

        /* renamed from: g */
        private final C4274m f12209g;

        /* renamed from: h */
        private int f12210h;

        /* renamed from: i */
        private int f12211i;

        public C3956a(C4274m mVar, C4274m mVar2, boolean z) {
            this.f12209g = mVar;
            this.f12208f = mVar2;
            this.f12207e = z;
            mVar2.mo13454J(12);
            this.f12203a = mVar2.mo13446B();
            mVar.mo13454J(12);
            this.f12211i = mVar.mo13446B();
            C4260a.m18075g(mVar.mo13464i() != 1 ? false : true, "first_chunk must be 1");
            this.f12204b = -1;
        }

        /* renamed from: a */
        public boolean mo12798a() {
            int i = this.f12204b + 1;
            this.f12204b = i;
            if (i == this.f12203a) {
                return false;
            }
            this.f12206d = this.f12207e ? this.f12208f.mo13447C() : this.f12208f.mo13481z();
            if (this.f12204b == this.f12210h) {
                this.f12205c = this.f12209g.mo13446B();
                this.f12209g.mo13455K(4);
                int i2 = this.f12211i - 1;
                this.f12211i = i2;
                this.f12210h = i2 > 0 ? this.f12209g.mo13446B() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: g.d.a.b.k0.r.b$b */
    private interface C3957b {
        /* renamed from: a */
        boolean mo12799a();

        /* renamed from: b */
        int mo12800b();

        /* renamed from: c */
        int mo12801c();
    }

    /* renamed from: g.d.a.b.k0.r.b$c */
    private static final class C3958c {

        /* renamed from: a */
        public final C3976k[] f12212a;

        /* renamed from: b */
        public C4109n f12213b;

        /* renamed from: c */
        public int f12214c;

        /* renamed from: d */
        public int f12215d = 0;

        public C3958c(int i) {
            this.f12212a = new C3976k[i];
        }
    }

    /* renamed from: g.d.a.b.k0.r.b$d */
    static final class C3959d implements C3957b {

        /* renamed from: a */
        private final int f12216a = this.f12218c.mo13446B();

        /* renamed from: b */
        private final int f12217b = this.f12218c.mo13446B();

        /* renamed from: c */
        private final C4274m f12218c;

        public C3959d(C3952a.C3954b bVar) {
            C4274m mVar = bVar.f12195P0;
            this.f12218c = mVar;
            mVar.mo13454J(12);
        }

        /* renamed from: a */
        public boolean mo12799a() {
            return this.f12216a != 0;
        }

        /* renamed from: b */
        public int mo12800b() {
            return this.f12217b;
        }

        /* renamed from: c */
        public int mo12801c() {
            int i = this.f12216a;
            return i == 0 ? this.f12218c.mo13446B() : i;
        }
    }

    /* renamed from: g.d.a.b.k0.r.b$e */
    static final class C3960e implements C3957b {

        /* renamed from: a */
        private final C4274m f12219a;

        /* renamed from: b */
        private final int f12220b = this.f12219a.mo13446B();

        /* renamed from: c */
        private final int f12221c = (this.f12219a.mo13446B() & 255);

        /* renamed from: d */
        private int f12222d;

        /* renamed from: e */
        private int f12223e;

        public C3960e(C3952a.C3954b bVar) {
            C4274m mVar = bVar.f12195P0;
            this.f12219a = mVar;
            mVar.mo13454J(12);
        }

        /* renamed from: a */
        public boolean mo12799a() {
            return false;
        }

        /* renamed from: b */
        public int mo12800b() {
            return this.f12220b;
        }

        /* renamed from: c */
        public int mo12801c() {
            int i = this.f12221c;
            if (i == 8) {
                return this.f12219a.mo13479x();
            }
            if (i == 16) {
                return this.f12219a.mo13448D();
            }
            int i2 = this.f12222d;
            this.f12222d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f12223e & 15;
            }
            int x = this.f12219a.mo13479x();
            this.f12223e = x;
            return (x & 240) >> 4;
        }
    }

    /* renamed from: g.d.a.b.k0.r.b$f */
    private static final class C3961f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f12224a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f12225b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f12226c;

        public C3961f(int i, long j, int i2) {
            this.f12224a = i;
            this.f12225b = j;
            this.f12226c = i2;
        }
    }

    /* renamed from: a */
    private static int m16623a(C4274m mVar, int i, int i2) {
        int c = mVar.mo13458c();
        while (c - i < i2) {
            mVar.mo13454J(c);
            int i3 = mVar.mo13464i();
            C4260a.m18070b(i3 > 0, "childAtomSize should be positive");
            if (mVar.mo13464i() == C3952a.f12119K) {
                return c;
            }
            c += i3;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0200: MOVE  (r8v4 java.lang.String) = (r26v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    private static void m16624b(p148g.p189d.p190a.p200b.p230r0.C4274m r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, p148g.p189d.p190a.p200b.p203j0.C3900a r35, p148g.p189d.p190a.p200b.p204k0.p208r.C3955b.C3958c r36, int r37) throws p148g.p189d.p190a.p200b.C4313u {
        /*
            r0 = r28
            r1 = r30
            r2 = r31
            r14 = r33
            r3 = r35
            r15 = r36
            int r4 = r1 + 8
            r5 = 8
            int r4 = r4 + r5
            r0.mo13454J(r4)
            r4 = 6
            r13 = 0
            if (r34 == 0) goto L_0x0020
            int r5 = r28.mo13448D()
            r0.mo13455K(r4)
            goto L_0x0024
        L_0x0020:
            r0.mo13455K(r5)
            r5 = 0
        L_0x0024:
            r12 = 2
            r6 = 16
            r11 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 != r11) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            if (r5 != r12) goto L_0x0045
            r0.mo13455K(r6)
            double r4 = r28.mo13463h()
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = r28.mo13446B()
            r6 = 20
            r0.mo13455K(r6)
            goto L_0x0058
        L_0x0045:
            return
        L_0x0046:
            int r7 = r28.mo13448D()
            r0.mo13455K(r4)
            int r4 = r28.mo13480y()
            if (r5 != r11) goto L_0x0056
            r0.mo13455K(r6)
        L_0x0056:
            r5 = r4
            r4 = r7
        L_0x0058:
            int r6 = r28.mo13458c()
            int r7 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12142b0
            r16 = 0
            r8 = r29
            if (r8 != r7) goto L_0x008c
            android.util.Pair r7 = m16636n(r0, r1, r2)
            if (r7 == 0) goto L_0x0089
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0077
            r3 = r16
            goto L_0x0081
        L_0x0077:
            java.lang.Object r9 = r7.second
            g.d.a.b.k0.r.k r9 = (p148g.p189d.p190a.p200b.p204k0.p208r.C3976k) r9
            java.lang.String r9 = r9.f12350a
            g.d.a.b.j0.a r3 = r3.mo12685b(r9)
        L_0x0081:
            g.d.a.b.k0.r.k[] r9 = r15.f12212a
            java.lang.Object r7 = r7.second
            g.d.a.b.k0.r.k r7 = (p148g.p189d.p190a.p200b.p204k0.p208r.C3976k) r7
            r9[r37] = r7
        L_0x0089:
            r0.mo13454J(r6)
        L_0x008c:
            r10 = r3
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12167o
            java.lang.String r9 = "audio/raw"
            if (r8 != r3) goto L_0x0096
            java.lang.String r3 = "audio/ac3"
            goto L_0x00e0
        L_0x0096:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12171q
            if (r8 != r3) goto L_0x009d
            java.lang.String r3 = "audio/eac3"
            goto L_0x00e0
        L_0x009d:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12175s
            if (r8 != r3) goto L_0x00a4
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x00e0
        L_0x00a4:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12177t
            if (r8 == r3) goto L_0x00de
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12179u
            if (r8 != r3) goto L_0x00ad
            goto L_0x00de
        L_0x00ad:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12181v
            if (r8 != r3) goto L_0x00b4
            java.lang.String r3 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00e0
        L_0x00b4:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12188y0
            if (r8 != r3) goto L_0x00bb
            java.lang.String r3 = "audio/3gpp"
            goto L_0x00e0
        L_0x00bb:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12190z0
            if (r8 != r3) goto L_0x00c2
            java.lang.String r3 = "audio/amr-wb"
            goto L_0x00e0
        L_0x00c2:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12163m
            if (r8 == r3) goto L_0x00dc
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12165n
            if (r8 != r3) goto L_0x00cb
            goto L_0x00dc
        L_0x00cb:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12159k
            if (r8 != r3) goto L_0x00d2
            java.lang.String r3 = "audio/mpeg"
            goto L_0x00e0
        L_0x00d2:
            int r3 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12128O0
            if (r8 != r3) goto L_0x00d9
            java.lang.String r3 = "audio/alac"
            goto L_0x00e0
        L_0x00d9:
            r3 = r16
            goto L_0x00e0
        L_0x00dc:
            r3 = r9
            goto L_0x00e0
        L_0x00de:
            java.lang.String r3 = "audio/vnd.dts.hd"
        L_0x00e0:
            r8 = r3
            r17 = r4
            r18 = r5
            r7 = r6
            r19 = r16
        L_0x00e8:
            int r3 = r7 - r1
            r4 = -1
            if (r3 >= r2) goto L_0x01f4
            r0.mo13454J(r7)
            int r6 = r28.mo13464i()
            if (r6 <= 0) goto L_0x00f8
            r3 = 1
            goto L_0x00f9
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            java.lang.String r5 = "childAtomSize should be positive"
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18070b(r3, r5)
            int r3 = r28.mo13464i()
            int r5 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12119K
            if (r3 == r5) goto L_0x01a3
            if (r34 == 0) goto L_0x010e
            int r5 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12161l
            if (r3 != r5) goto L_0x010e
            goto L_0x01a3
        L_0x010e:
            int r4 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12169p
            if (r3 != r4) goto L_0x0130
            int r3 = r7 + 8
            r0.mo13454J(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            g.d.a.b.n r3 = p148g.p189d.p190a.p200b.p201h0.C3849a.m16079c(r0, r3, r14, r10)
        L_0x011f:
            r15.f12213b = r3
            r5 = r6
            r6 = r7
            r26 = r8
            r27 = r9
            r20 = r10
            r1 = 0
            r21 = 1
            r22 = 2
            goto L_0x01a0
        L_0x0130:
            int r4 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12173r
            if (r3 != r4) goto L_0x0142
            int r3 = r7 + 8
            r0.mo13454J(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            g.d.a.b.n r3 = p148g.p189d.p190a.p200b.p201h0.C3849a.m16082f(r0, r3, r14, r10)
            goto L_0x011f
        L_0x0142:
            int r4 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12183w
            if (r3 != r4) goto L_0x017c
            java.lang.String r3 = java.lang.Integer.toString(r32)
            r5 = 0
            r20 = -1
            r21 = -1
            r22 = 0
            r23 = 0
            r4 = r8
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r21
            r26 = r8
            r8 = r17
            r27 = r9
            r9 = r18
            r20 = r10
            r10 = r22
            r21 = 1
            r11 = r20
            r22 = 2
            r12 = r23
            r1 = 0
            r13 = r33
            g.d.a.b.n r3 = p148g.p189d.p190a.p200b.C4109n.m17338h(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.f12213b = r3
            r5 = r24
            goto L_0x019e
        L_0x017c:
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r20 = r10
            r1 = 0
            r21 = 1
            r22 = 2
            int r4 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12128O0
            r5 = r24
            if (r3 != r4) goto L_0x019e
            byte[] r3 = new byte[r5]
            r6 = r25
            r0.mo13454J(r6)
            r0.mo13462g(r3, r1, r5)
            r19 = r3
            goto L_0x01a0
        L_0x019e:
            r6 = r25
        L_0x01a0:
            r8 = r26
            goto L_0x01e7
        L_0x01a3:
            r5 = r6
            r6 = r7
            r26 = r8
            r27 = r9
            r20 = r10
            r1 = 0
            r21 = 1
            r22 = 2
            int r7 = p148g.p189d.p190a.p200b.p204k0.p208r.C3952a.f12119K
            if (r3 != r7) goto L_0x01b6
            r7 = r6
            goto L_0x01ba
        L_0x01b6:
            int r7 = m16623a(r0, r6, r5)
        L_0x01ba:
            if (r7 == r4) goto L_0x01a0
            android.util.Pair r3 = m16627e(r0, r7)
            java.lang.Object r4 = r3.first
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r3.second
            r19 = r3
            byte[] r19 = (byte[]) r19
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x01e7
            android.util.Pair r3 = p148g.p189d.p190a.p200b.p230r0.C4262c.m18084f(r19)
            java.lang.Object r4 = r3.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r18 = r4.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r17 = r3.intValue()
        L_0x01e7:
            int r7 = r6 + r5
            r1 = r30
            r10 = r20
            r9 = r27
            r11 = 1
            r12 = 2
            r13 = 0
            goto L_0x00e8
        L_0x01f4:
            r26 = r8
            r27 = r9
            r20 = r10
            r22 = 2
            g.d.a.b.n r0 = r15.f12213b
            if (r0 != 0) goto L_0x0231
            r8 = r26
            if (r8 == 0) goto L_0x0231
            r0 = r27
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x020e
            r7 = 2
            goto L_0x020f
        L_0x020e:
            r7 = -1
        L_0x020f:
            java.lang.String r0 = java.lang.Integer.toString(r32)
            r2 = 0
            r3 = -1
            r4 = -1
            if (r19 != 0) goto L_0x0219
            goto L_0x021f
        L_0x0219:
            java.util.List r1 = java.util.Collections.singletonList(r19)
            r16 = r1
        L_0x021f:
            r10 = 0
            r1 = r8
            r5 = r17
            r6 = r18
            r8 = r16
            r9 = r20
            r11 = r33
            g.d.a.b.n r0 = p148g.p189d.p190a.p200b.C4109n.m17337g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f12213b = r0
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p208r.C3955b.m16624b(g.d.a.b.r0.m, int, int, int, int, java.lang.String, boolean, g.d.a.b.j0.a, g.d.a.b.k0.r.b$c, int):void");
    }

    /* renamed from: c */
    static Pair<Integer, C3976k> m16625c(C4274m mVar, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            mVar.mo13454J(i3);
            int i6 = mVar.mo13464i();
            int i7 = mVar.mo13464i();
            if (i7 == C3952a.f12144c0) {
                num = Integer.valueOf(mVar.mo13464i());
            } else if (i7 == C3952a.f12137X) {
                mVar.mo13455K(4);
                str = mVar.mo13476u(4);
            } else if (i7 == C3952a.f12138Y) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C4260a.m18070b(num != null, "frma atom is mandatory");
        C4260a.m18070b(i4 != -1, "schi atom is mandatory");
        C3976k o = m16637o(mVar, i4, i5, str);
        if (o != null) {
            z = true;
        }
        C4260a.m18070b(z, "tenc atom is mandatory");
        return Pair.create(num, o);
    }

    /* renamed from: d */
    private static Pair<long[], long[]> m16626d(C3952a.C3953a aVar) {
        C3952a.C3954b g;
        if (aVar == null || (g = aVar.mo12797g(C3952a.f12131R)) == null) {
            return Pair.create((Object) null, (Object) null);
        }
        C4274m mVar = g.f12195P0;
        mVar.mo13454J(8);
        int c = C3952a.m16618c(mVar.mo13464i());
        int B = mVar.mo13446B();
        long[] jArr = new long[B];
        long[] jArr2 = new long[B];
        int i = 0;
        while (i < B) {
            jArr[i] = c == 1 ? mVar.mo13447C() : mVar.mo13481z();
            jArr2[i] = c == 1 ? mVar.mo13472q() : (long) mVar.mo13464i();
            if (mVar.mo13475t() == 1) {
                mVar.mo13455K(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: e */
    private static Pair<String, byte[]> m16627e(C4274m mVar, int i) {
        mVar.mo13454J(i + 8 + 4);
        mVar.mo13455K(1);
        m16628f(mVar);
        mVar.mo13455K(2);
        int x = mVar.mo13479x();
        if ((x & 128) != 0) {
            mVar.mo13455K(2);
        }
        if ((x & 64) != 0) {
            mVar.mo13455K(mVar.mo13448D());
        }
        if ((x & 32) != 0) {
            mVar.mo13455K(2);
        }
        mVar.mo13455K(1);
        m16628f(mVar);
        String c = C4269j.m18112c(mVar.mo13479x());
        if ("audio/mpeg".equals(c) || "audio/vnd.dts".equals(c) || "audio/vnd.dts.hd".equals(c)) {
            return Pair.create(c, (Object) null);
        }
        mVar.mo13455K(12);
        mVar.mo13455K(1);
        int f = m16628f(mVar);
        byte[] bArr = new byte[f];
        mVar.mo13462g(bArr, 0, f);
        return Pair.create(c, bArr);
    }

    /* renamed from: f */
    private static int m16628f(C4274m mVar) {
        int x = mVar.mo13479x();
        int i = x & 127;
        while ((x & 128) == 128) {
            x = mVar.mo13479x();
            i = (i << 7) | (x & 127);
        }
        return i;
    }

    /* renamed from: g */
    private static int m16629g(C4274m mVar) {
        mVar.mo13454J(16);
        int i = mVar.mo13464i();
        if (i == f12197b) {
            return 1;
        }
        if (i == f12196a) {
            return 2;
        }
        if (i == f12198c || i == f12199d || i == f12200e || i == f12201f) {
            return 3;
        }
        return i == f12202g ? 4 : -1;
    }

    /* renamed from: h */
    private static C4059a m16630h(C4274m mVar, int i) {
        mVar.mo13455K(8);
        ArrayList arrayList = new ArrayList();
        while (mVar.mo13458c() < i) {
            C4059a.C4061b c = C3969f.m16702c(mVar);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4059a((List<? extends C4059a.C4061b>) arrayList);
    }

    /* renamed from: i */
    private static Pair<Long, String> m16631i(C4274m mVar) {
        int i = 8;
        mVar.mo13454J(8);
        int c = C3952a.m16618c(mVar.mo13464i());
        mVar.mo13455K(c == 0 ? 8 : 16);
        long z = mVar.mo13481z();
        if (c == 0) {
            i = 4;
        }
        mVar.mo13455K(i);
        int D = mVar.mo13448D();
        return Pair.create(Long.valueOf(z), BuildConfig.FLAVOR + ((char) (((D >> 10) & 31) + 96)) + ((char) (((D >> 5) & 31) + 96)) + ((char) ((D & 31) + 96)));
    }

    /* renamed from: j */
    private static C4059a m16632j(C4274m mVar, int i) {
        mVar.mo13455K(12);
        while (mVar.mo13458c() < i) {
            int c = mVar.mo13458c();
            int i2 = mVar.mo13464i();
            if (mVar.mo13464i() == C3952a.f12104C0) {
                mVar.mo13454J(c);
                return m16630h(mVar, c + i2);
            }
            mVar.mo13455K(i2 - 8);
        }
        return null;
    }

    /* renamed from: k */
    private static long m16633k(C4274m mVar) {
        int i = 8;
        mVar.mo13454J(8);
        if (C3952a.m16618c(mVar.mo13464i()) != 0) {
            i = 16;
        }
        mVar.mo13455K(i);
        return mVar.mo13481z();
    }

    /* renamed from: l */
    private static float m16634l(C4274m mVar, int i) {
        mVar.mo13454J(i + 8);
        return ((float) mVar.mo13446B()) / ((float) mVar.mo13446B());
    }

    /* renamed from: m */
    private static byte[] m16635m(C4274m mVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            mVar.mo13454J(i3);
            int i4 = mVar.mo13464i();
            if (mVar.mo13464i() == C3952a.f12118J0) {
                return Arrays.copyOfRange(mVar.f13643a, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    /* renamed from: n */
    private static Pair<Integer, C3976k> m16636n(C4274m mVar, int i, int i2) {
        Pair<Integer, C3976k> c;
        int c2 = mVar.mo13458c();
        while (c2 - i < i2) {
            mVar.mo13454J(c2);
            int i3 = mVar.mo13464i();
            C4260a.m18070b(i3 > 0, "childAtomSize should be positive");
            if (mVar.mo13464i() == C3952a.f12136W && (c = m16625c(mVar, c2, i3)) != null) {
                return c;
            }
            c2 += i3;
        }
        return null;
    }

    /* renamed from: o */
    private static C3976k m16637o(C4274m mVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            mVar.mo13454J(i5);
            int i6 = mVar.mo13464i();
            if (mVar.mo13464i() == C3952a.f12139Z) {
                int c = C3952a.m16618c(mVar.mo13464i());
                mVar.mo13455K(1);
                if (c == 0) {
                    mVar.mo13455K(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int x = mVar.mo13479x();
                    i3 = x & 15;
                    i4 = (x & 240) >> 4;
                }
                boolean z = mVar.mo13479x() == 1;
                int x2 = mVar.mo13479x();
                byte[] bArr2 = new byte[16];
                mVar.mo13462g(bArr2, 0, 16);
                if (z && x2 == 0) {
                    int x3 = mVar.mo13479x();
                    bArr = new byte[x3];
                    mVar.mo13462g(bArr, 0, x3);
                }
                return new C3976k(z, str, x2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    /* renamed from: p */
    public static C3978m m16638p(C3975j jVar, C3952a.C3953a aVar, C3919i iVar) throws C4313u {
        C3957b bVar;
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        C3975j jVar2;
        String str;
        int[] iArr3;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        boolean z2;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        String str2;
        int[] iArr8;
        int i5;
        C3975j jVar3 = jVar;
        C3952a.C3953a aVar2 = aVar;
        C3919i iVar2 = iVar;
        C3952a.C3954b g = aVar2.mo12797g(C3952a.f12172q0);
        if (g != null) {
            bVar = new C3959d(g);
        } else {
            C3952a.C3954b g2 = aVar2.mo12797g(C3952a.f12174r0);
            if (g2 != null) {
                bVar = new C3960e(g2);
            } else {
                throw new C4313u("Track has no sample table size information");
            }
        }
        int b = bVar.mo12800b();
        if (b == 0) {
            return new C3978m(new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        C3952a.C3954b g3 = aVar2.mo12797g(C3952a.f12176s0);
        if (g3 == null) {
            g3 = aVar2.mo12797g(C3952a.f12178t0);
            z = true;
        } else {
            z = false;
        }
        C4274m mVar = g3.f12195P0;
        C4274m mVar2 = aVar2.mo12797g(C3952a.f12170p0).f12195P0;
        C4274m mVar3 = aVar2.mo12797g(C3952a.f12164m0).f12195P0;
        C3952a.C3954b g4 = aVar2.mo12797g(C3952a.f12166n0);
        C4274m mVar4 = null;
        C4274m mVar5 = g4 != null ? g4.f12195P0 : null;
        C3952a.C3954b g5 = aVar2.mo12797g(C3952a.f12168o0);
        C4274m mVar6 = g5 != null ? g5.f12195P0 : null;
        C3956a aVar3 = new C3956a(mVar2, mVar, z);
        mVar3.mo13454J(12);
        int B = mVar3.mo13446B() - 1;
        int B2 = mVar3.mo13446B();
        int B3 = mVar3.mo13446B();
        if (mVar6 != null) {
            mVar6.mo13454J(12);
            i = mVar6.mo13446B();
        } else {
            i = 0;
        }
        int i6 = -1;
        if (mVar5 != null) {
            mVar5.mo13454J(12);
            i2 = mVar5.mo13446B();
            if (i2 > 0) {
                i6 = mVar5.mo13446B() - 1;
                mVar4 = mVar5;
            }
        } else {
            mVar4 = mVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(bVar.mo12799a() && "audio/raw".equals(jVar3.f12344f.f12949k) && B == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[b];
            iArr2 = new int[b];
            int i7 = i2;
            jArr = new long[b];
            int i8 = B;
            iArr = new int[b];
            C4274m mVar7 = mVar3;
            int i9 = B3;
            long j3 = 0;
            long j4 = 0;
            int i10 = i8;
            int i11 = 0;
            i4 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = B2;
            int i16 = i7;
            String str3 = "AtomParsers";
            int i17 = i6;
            int i18 = i;
            int i19 = i15;
            while (i11 < b) {
                while (i14 == 0) {
                    C4260a.m18074f(aVar3.mo12798a());
                    j4 = aVar3.f12206d;
                    i14 = aVar3.f12205c;
                    i10 = i10;
                    i19 = i19;
                }
                int i20 = i10;
                int i21 = i19;
                if (mVar6 != null) {
                    while (i12 == 0 && i18 > 0) {
                        i12 = mVar6.mo13446B();
                        i13 = mVar6.mo13464i();
                        i18--;
                    }
                    i12--;
                }
                int i22 = i13;
                jArr2[i11] = j4;
                iArr2[i11] = bVar.mo12801c();
                if (iArr2[i11] > i4) {
                    i4 = iArr2[i11];
                }
                int i23 = b;
                C3957b bVar2 = bVar;
                jArr[i11] = j3 + ((long) i22);
                iArr[i11] = mVar4 == null ? 1 : 0;
                if (i11 == i17) {
                    iArr[i11] = 1;
                    i16--;
                    if (i16 > 0) {
                        i17 = mVar4.mo13446B() - 1;
                    }
                }
                j3 += (long) i9;
                int i24 = i21 - 1;
                if (i24 == 0 && i20 > 0) {
                    i20--;
                    i24 = mVar7.mo13446B();
                    i9 = mVar7.mo13464i();
                }
                int i25 = i24;
                j4 += (long) iArr2[i11];
                i14--;
                i11++;
                bVar = bVar2;
                b = i23;
                i9 = i9;
                i19 = i25;
                i13 = i22;
                i10 = i20;
            }
            int i26 = i10;
            int i27 = i19;
            int i28 = i13;
            i3 = b;
            j = j3 + ((long) i28);
            C4260a.m18069a(i12 == 0);
            while (i18 > 0) {
                C4260a.m18069a(mVar6.mo13446B() == 0);
                mVar6.mo13464i();
                i18--;
            }
            if (i16 == 0 && i27 == 0) {
                i5 = i14;
                if (i5 == 0 && i26 == 0) {
                    jVar2 = jVar;
                    str = str3;
                }
            } else {
                i5 = i14;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent stbl box for track ");
            jVar2 = jVar;
            sb.append(jVar2.f12339a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i16);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i27);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i5);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i26);
            String sb2 = sb.toString();
            str = str3;
            Log.w(str, sb2);
        } else {
            jVar2 = jVar3;
            i3 = b;
            C3957b bVar3 = bVar;
            str = "AtomParsers";
            int i29 = aVar3.f12203a;
            long[] jArr6 = new long[i29];
            int[] iArr9 = new int[i29];
            while (aVar3.mo12798a()) {
                int i30 = aVar3.f12204b;
                jArr6[i30] = aVar3.f12206d;
                iArr9[i30] = aVar3.f12205c;
            }
            C3963d.C3965b a = C3963d.m16658a(bVar3.mo12801c(), jArr6, iArr9, (long) B3);
            jArr2 = a.f12231a;
            iArr2 = a.f12232b;
            i4 = a.f12233c;
            jArr = a.f12234d;
            iArr = a.f12235e;
            j = a.f12236f;
        }
        long[] jArr7 = jArr;
        int[] iArr10 = iArr2;
        int[] iArr11 = iArr;
        int i31 = i4;
        long B4 = C4284w.m18229B(j, 1000000, jVar2.f12341c);
        if (jVar2.f12346h == null || iVar.mo12746a()) {
            int[] iArr12 = iArr10;
            C4284w.m18230C(jArr7, 1000000, jVar2.f12341c);
            return new C3978m(jArr2, iArr12, i31, jArr7, iArr11, B4);
        }
        long[] jArr8 = jVar2.f12346h;
        if (jArr8.length == 1 && jVar2.f12340b == 1 && jArr7.length >= 2) {
            long j5 = jVar2.f12347i[0];
            long B5 = C4284w.m18229B(jArr8[0], jVar2.f12341c, jVar2.f12342d) + j5;
            if (jArr7[0] <= j5 && j5 < jArr7[1] && jArr7[jArr7.length - 1] < B5 && B5 <= j) {
                long j6 = j - B5;
                long B6 = C4284w.m18229B(j5 - jArr7[0], (long) jVar2.f12344f.f12962x, jVar2.f12341c);
                long B7 = C4284w.m18229B(j6, (long) jVar2.f12344f.f12962x, jVar2.f12341c);
                if (!(B6 == 0 && B7 == 0) && B6 <= 2147483647L && B7 <= 2147483647L) {
                    int i32 = (int) B6;
                    C3919i iVar3 = iVar;
                    iVar3.f11893a = i32;
                    iVar3.f11894b = (int) B7;
                    C4284w.m18230C(jArr7, 1000000, jVar2.f12341c);
                    return new C3978m(jArr2, iArr10, i31, jArr7, iArr11, B4);
                }
            }
        }
        long[] jArr9 = jVar2.f12346h;
        if (jArr9.length == 1 && jArr9[0] == 0) {
            long j7 = jVar2.f12347i[0];
            for (int i33 = 0; i33 < jArr7.length; i33++) {
                jArr7[i33] = C4284w.m18229B(jArr7[i33] - j7, 1000000, jVar2.f12341c);
            }
            return new C3978m(jArr2, iArr10, i31, jArr7, iArr11, C4284w.m18229B(j - j7, 1000000, jVar2.f12341c));
        }
        boolean z3 = jVar2.f12340b == 1;
        boolean z4 = false;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            long[] jArr10 = jVar2.f12346h;
            if (i36 >= jArr10.length) {
                break;
            }
            long j8 = jVar2.f12347i[i36];
            if (j8 != -1) {
                iArr8 = iArr11;
                iArr7 = iArr10;
                str2 = str;
                long B8 = C4284w.m18229B(jArr10[i36], jVar2.f12341c, jVar2.f12342d);
                int c = C4284w.m18237c(jArr7, j8, true, true);
                int c2 = C4284w.m18237c(jArr7, j8 + B8, z3, false);
                i34 += c2 - c;
                z4 = (i35 != c) | z4;
                i35 = c2;
            } else {
                iArr7 = iArr10;
                str2 = str;
                iArr8 = iArr11;
            }
            i36++;
            iArr11 = iArr8;
            str = str2;
            iArr10 = iArr7;
        }
        int[] iArr13 = iArr10;
        String str4 = str;
        int[] iArr14 = iArr11;
        boolean z5 = (i34 != i3) | z4;
        long[] jArr11 = z5 ? new long[i34] : jArr2;
        int[] iArr15 = z5 ? new int[i34] : iArr13;
        int i37 = z5 ? 0 : i31;
        int[] iArr16 = z5 ? new int[i34] : iArr14;
        long[] jArr12 = new long[i34];
        int i38 = i37;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            long[] jArr13 = jVar2.f12346h;
            if (i39 >= jArr13.length) {
                break;
            }
            int i41 = i38;
            int[] iArr17 = iArr14;
            long j9 = jVar2.f12347i[i39];
            long j10 = jArr13[i39];
            if (j9 != -1) {
                long j11 = jVar2.f12341c;
                jArr3 = jArr12;
                int[] iArr18 = iArr16;
                int c3 = C4284w.m18237c(jArr7, j9, true, true);
                int c4 = C4284w.m18237c(jArr7, C4284w.m18229B(j10, j11, jVar2.f12342d) + j9, z3, false);
                if (z5) {
                    int i42 = c4 - c3;
                    System.arraycopy(jArr2, c3, jArr11, i40, i42);
                    iArr4 = iArr13;
                    System.arraycopy(iArr4, c3, iArr15, i40, i42);
                    z2 = z3;
                    iArr6 = iArr17;
                    jArr5 = jArr11;
                    iArr5 = iArr18;
                    System.arraycopy(iArr6, c3, iArr5, i40, i42);
                } else {
                    iArr4 = iArr13;
                    z2 = z3;
                    iArr6 = iArr17;
                    jArr5 = jArr11;
                    iArr5 = iArr18;
                }
                int i43 = i41;
                while (c3 < c4) {
                    long[] jArr14 = jArr2;
                    int[] iArr19 = iArr6;
                    long j12 = j9;
                    jArr3[i40] = C4284w.m18229B(j2, 1000000, jVar2.f12342d) + C4284w.m18229B(jArr7[c3] - j9, 1000000, jVar2.f12341c);
                    if (z5 && iArr15[i40] > i43) {
                        i43 = iArr4[c3];
                    }
                    i40++;
                    c3++;
                    jArr2 = jArr14;
                    j9 = j12;
                    iArr6 = iArr19;
                }
                jArr4 = jArr2;
                iArr3 = iArr6;
                i38 = i43;
            } else {
                jArr4 = jArr2;
                jArr3 = jArr12;
                iArr4 = iArr13;
                iArr3 = iArr17;
                jArr5 = jArr11;
                z2 = z3;
                iArr5 = iArr16;
                i38 = i41;
            }
            j2 += j10;
            i39++;
            iArr16 = iArr5;
            z3 = z2;
            jArr11 = jArr5;
            jArr2 = jArr4;
            jArr12 = jArr3;
            iArr14 = iArr3;
            iArr13 = iArr4;
        }
        long[] jArr15 = jArr11;
        long[] jArr16 = jArr2;
        long[] jArr17 = jArr12;
        int[] iArr20 = iArr16;
        int i44 = i38;
        int[] iArr21 = iArr14;
        int[] iArr22 = iArr13;
        long B9 = C4284w.m18229B(j2, 1000000, jVar2.f12341c);
        boolean z6 = false;
        for (int i45 = 0; i45 < iArr20.length && !z6; i45++) {
            z6 |= (iArr20[i45] & 1) != 0;
        }
        if (z6) {
            return new C3978m(jArr15, iArr15, i44, jArr17, iArr20, B9);
        }
        Log.w(str4, "Ignoring edit list: Edited sample sequence does not contain a sync sample.");
        C4284w.m18230C(jArr7, 1000000, jVar2.f12341c);
        return new C3978m(jArr16, iArr22, i31, jArr7, iArr21, B4);
    }

    /* renamed from: q */
    private static C3958c m16639q(C4274m mVar, int i, int i2, String str, C3900a aVar, boolean z) throws C4313u {
        C4274m mVar2 = mVar;
        mVar2.mo13454J(12);
        int i3 = mVar.mo13464i();
        C3958c cVar = new C3958c(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int c = mVar.mo13458c();
            int i5 = mVar.mo13464i();
            C4260a.m18070b(i5 > 0, "childAtomSize should be positive");
            int i6 = mVar.mo13464i();
            if (i6 == C3952a.f12143c || i6 == C3952a.f12145d || i6 == C3952a.f12140a0 || i6 == C3952a.f12162l0 || i6 == C3952a.f12147e || i6 == C3952a.f12149f || i6 == C3952a.f12151g || i6 == C3952a.f12120K0 || i6 == C3952a.f12122L0) {
                m16644v(mVar, i6, c, i5, i, i2, aVar, cVar, i4);
            } else if (i6 == C3952a.f12157j || i6 == C3952a.f12142b0 || i6 == C3952a.f12167o || i6 == C3952a.f12171q || i6 == C3952a.f12175s || i6 == C3952a.f12181v || i6 == C3952a.f12177t || i6 == C3952a.f12179u || i6 == C3952a.f12188y0 || i6 == C3952a.f12190z0 || i6 == C3952a.f12163m || i6 == C3952a.f12165n || i6 == C3952a.f12159k || i6 == C3952a.f12128O0) {
                m16624b(mVar, i6, c, i5, i, str, z, aVar, cVar, i4);
            } else if (i6 == C3952a.f12160k0 || i6 == C3952a.f12180u0 || i6 == C3952a.f12182v0 || i6 == C3952a.f12184w0 || i6 == C3952a.f12186x0) {
                m16640r(mVar, i6, c, i5, i, str, cVar);
            } else if (i6 == C3952a.f12126N0) {
                cVar.f12213b = C4109n.m17341k(Integer.toString(i), "application/x-camera-motion", (String) null, -1, (C3900a) null);
            }
            mVar2.mo13454J(c + i5);
        }
        return cVar;
    }

    /* renamed from: r */
    private static void m16640r(C4274m mVar, int i, int i2, int i3, int i4, String str, C3958c cVar) throws C4313u {
        C4274m mVar2 = mVar;
        int i5 = i;
        C3958c cVar2 = cVar;
        mVar2.mo13454J(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 != C3952a.f12160k0) {
            if (i5 == C3952a.f12180u0) {
                int i6 = (i3 - 8) - 8;
                byte[] bArr = new byte[i6];
                mVar2.mo13462g(bArr, 0, i6);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i5 == C3952a.f12182v0) {
                str2 = "application/x-mp4-vtt";
            } else if (i5 == C3952a.f12184w0) {
                j = 0;
            } else if (i5 == C3952a.f12186x0) {
                cVar2.f12215d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.f12213b = C4109n.m17345o(Integer.toString(i4), str2, (String) null, -1, 0, str, -1, (C3900a) null, j, list);
    }

    /* renamed from: s */
    private static C3961f m16641s(C4274m mVar) {
        boolean z;
        int i = 8;
        mVar.mo13454J(8);
        int c = C3952a.m16618c(mVar.mo13464i());
        mVar.mo13455K(c == 0 ? 8 : 16);
        int i2 = mVar.mo13464i();
        mVar.mo13455K(4);
        int c2 = mVar.mo13458c();
        if (c == 0) {
            i = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                z = true;
                break;
            } else if (mVar.f13643a[c2 + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            mVar.mo13455K(i);
        } else {
            long z2 = c == 0 ? mVar.mo13481z() : mVar.mo13447C();
            if (z2 != 0) {
                j = z2;
            }
        }
        mVar.mo13455K(16);
        int i5 = mVar.mo13464i();
        int i6 = mVar.mo13464i();
        mVar.mo13455K(4);
        int i7 = mVar.mo13464i();
        int i8 = mVar.mo13464i();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new C3961f(i2, j, i3);
    }

    /* renamed from: t */
    public static C3975j m16642t(C3952a.C3953a aVar, C3952a.C3954b bVar, long j, C3900a aVar2, boolean z, boolean z2) throws C4313u {
        long j2;
        C3952a.C3954b bVar2;
        long[] jArr;
        long[] jArr2;
        C3952a.C3953a aVar3 = aVar;
        C3952a.C3953a f = aVar3.mo12796f(C3952a.f12109F);
        int g = m16629g(f.mo12797g(C3952a.f12133T).f12195P0);
        if (g == -1) {
            return null;
        }
        C3961f s = m16641s(aVar3.mo12797g(C3952a.f12129P).f12195P0);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = s.f12225b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long k = m16633k(bVar2.f12195P0);
        if (j2 != -9223372036854775807L) {
            j3 = C4284w.m18229B(j2, 1000000, k);
        }
        long j4 = j3;
        C3952a.C3953a f2 = f.mo12796f(C3952a.f12111G).mo12796f(C3952a.f12113H);
        Pair<Long, String> i = m16631i(f.mo12797g(C3952a.f12132S).f12195P0);
        C3958c q = m16639q(f2.mo12797g(C3952a.f12134U).f12195P0, s.f12224a, s.f12226c, (String) i.second, aVar2, z2);
        if (!z) {
            Pair<long[], long[]> d = m16626d(aVar3.mo12796f(C3952a.f12130Q));
            jArr = (long[]) d.second;
            jArr2 = (long[]) d.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (q.f12213b == null) {
            return null;
        }
        return new C3975j(s.f12224a, g, ((Long) i.first).longValue(), k, j4, q.f12213b, q.f12215d, q.f12212a, q.f12214c, jArr2, jArr);
    }

    /* renamed from: u */
    public static C4059a m16643u(C3952a.C3954b bVar, boolean z) {
        if (z) {
            return null;
        }
        C4274m mVar = bVar.f12195P0;
        mVar.mo13454J(8);
        while (mVar.mo13456a() >= 8) {
            int c = mVar.mo13458c();
            int i = mVar.mo13464i();
            if (mVar.mo13464i() == C3952a.f12102B0) {
                mVar.mo13454J(c);
                return m16632j(mVar, c + i);
            }
            mVar.mo13455K(i - 8);
        }
        return null;
    }

    /* renamed from: v */
    private static void m16644v(C4274m mVar, int i, int i2, int i3, int i4, int i5, C3900a aVar, C3958c cVar, int i6) throws C4313u {
        C4274m mVar2 = mVar;
        int i7 = i2;
        int i8 = i3;
        C3900a aVar2 = aVar;
        C3958c cVar2 = cVar;
        mVar2.mo13454J(i7 + 8 + 8);
        mVar2.mo13455K(16);
        int D = mVar.mo13448D();
        int D2 = mVar.mo13448D();
        mVar2.mo13455K(50);
        int c = mVar.mo13458c();
        String str = null;
        int i9 = i;
        if (i9 == C3952a.f12140a0) {
            Pair<Integer, C3976k> n = m16636n(mVar2, i7, i8);
            if (n != null) {
                i9 = ((Integer) n.first).intValue();
                aVar2 = aVar2 == null ? null : aVar2.mo12685b(((C3976k) n.second).f12350a);
                cVar2.f12212a[i6] = (C3976k) n.second;
            }
            mVar2.mo13454J(c);
        }
        C3900a aVar3 = aVar2;
        List<byte[]> list = null;
        byte[] bArr = null;
        boolean z = false;
        float f = 1.0f;
        int i10 = -1;
        while (c - i7 < i8) {
            mVar2.mo13454J(c);
            int c2 = mVar.mo13458c();
            int i11 = mVar.mo13464i();
            if (i11 == 0 && mVar.mo13458c() - i7 == i8) {
                break;
            }
            C4260a.m18070b(i11 > 0, "childAtomSize should be positive");
            int i12 = mVar.mo13464i();
            if (i12 == C3952a.f12115I) {
                C4260a.m18074f(str == null);
                mVar2.mo13454J(c2 + 8);
                C4288a b = C4288a.m18269b(mVar);
                list = b.f13673a;
                cVar2.f12214c = b.f13674b;
                if (!z) {
                    f = b.f13677e;
                }
                str = "video/avc";
            } else if (i12 == C3952a.f12117J) {
                C4260a.m18074f(str == null);
                mVar2.mo13454J(c2 + 8);
                C4294d a = C4294d.m18280a(mVar);
                list = a.f13696a;
                cVar2.f12214c = a.f13697b;
                str = "video/hevc";
            } else if (i12 == C3952a.f12124M0) {
                C4260a.m18074f(str == null);
                str = i9 == C3952a.f12120K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (i12 == C3952a.f12153h) {
                C4260a.m18074f(str == null);
                str = "video/3gpp";
            } else if (i12 == C3952a.f12119K) {
                C4260a.m18074f(str == null);
                Pair<String, byte[]> e = m16627e(mVar2, c2);
                str = (String) e.first;
                list = Collections.singletonList(e.second);
            } else if (i12 == C3952a.f12158j0) {
                f = m16634l(mVar2, c2);
                z = true;
            } else if (i12 == C3952a.f12116I0) {
                bArr = m16635m(mVar2, c2, i11);
            } else if (i12 == C3952a.f12114H0) {
                int x = mVar.mo13479x();
                mVar2.mo13455K(3);
                if (x == 0) {
                    int x2 = mVar.mo13479x();
                    if (x2 == 0) {
                        i10 = 0;
                    } else if (x2 == 1) {
                        i10 = 1;
                    } else if (x2 == 2) {
                        i10 = 2;
                    } else if (x2 == 3) {
                        i10 = 3;
                    }
                }
            }
            c += i11;
        }
        if (str != null) {
            cVar2.f12213b = C4109n.m17347s(Integer.toString(i4), str, (String) null, -1, -1, D, D2, -1.0f, list, i5, f, bArr, i10, (C4289b) null, aVar3);
        }
    }
}
