package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: g.d.a.c.f.f.p8 */
final class C4727p8<T> implements C4453a9<T> {

    /* renamed from: p */
    private static final int[] f14386p = new int[0];

    /* renamed from: q */
    private static final Unsafe f14387q = C4877y9.m20682t();

    /* renamed from: a */
    private final int[] f14388a;

    /* renamed from: b */
    private final Object[] f14389b;

    /* renamed from: c */
    private final int f14390c;

    /* renamed from: d */
    private final int f14391d;

    /* renamed from: e */
    private final C4655l8 f14392e;

    /* renamed from: f */
    private final boolean f14393f;

    /* renamed from: g */
    private final boolean f14394g;

    /* renamed from: h */
    private final int[] f14395h;

    /* renamed from: i */
    private final int f14396i;

    /* renamed from: j */
    private final int f14397j;

    /* renamed from: k */
    private final C4793t8 f14398k;

    /* renamed from: l */
    private final C4809u7 f14399l;

    /* renamed from: m */
    private final C4777s9<?, ?> f14400m;

    /* renamed from: n */
    private final C4709o6<?> f14401n;

    /* renamed from: o */
    private final C4507d8 f14402o;

    private C4727p8(int[] iArr, Object[] objArr, int i, int i2, C4655l8 l8Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C4793t8 t8Var, C4809u7 u7Var, C4777s9<?, ?> s9Var, C4709o6<?> o6Var, C4507d8 d8Var) {
        this.f14388a = iArr;
        this.f14389b = objArr;
        this.f14390c = i;
        this.f14391d = i2;
        boolean z3 = l8Var instanceof C4895z6;
        this.f14394g = z;
        this.f14393f = o6Var != null && o6Var.mo14502e(l8Var);
        this.f14395h = iArr2;
        this.f14396i = i3;
        this.f14397j = i4;
        this.f14398k = t8Var;
        this.f14399l = u7Var;
        this.f14400m = s9Var;
        this.f14401n = o6Var;
        this.f14392e = l8Var;
        this.f14402o = d8Var;
    }

    /* renamed from: A */
    private final boolean m20119A(T t, int i) {
        int Q = m20135Q(i);
        long j = (long) (Q & 1048575);
        if (j == 1048575) {
            int O = m20133O(i);
            long j2 = (long) (O & 1048575);
            switch ((O & 267386880) >>> 20) {
                case 0:
                    return C4877y9.m20650C(t, j2) != 0.0d;
                case 1:
                    return C4877y9.m20686x(t, j2) != 0.0f;
                case 2:
                    return C4877y9.m20677o(t, j2) != 0;
                case 3:
                    return C4877y9.m20677o(t, j2) != 0;
                case 4:
                    return C4877y9.m20664b(t, j2) != 0;
                case 5:
                    return C4877y9.m20677o(t, j2) != 0;
                case 6:
                    return C4877y9.m20664b(t, j2) != 0;
                case 7:
                    return C4877y9.m20685w(t, j2);
                case 8:
                    Object F = C4877y9.m20653F(t, j2);
                    if (F instanceof String) {
                        return !((String) F).isEmpty();
                    }
                    if (F instanceof C4773s5) {
                        return !C4773s5.f14473g.equals(F);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C4877y9.m20653F(t, j2) != null;
                case 10:
                    return !C4773s5.f14473g.equals(C4877y9.m20653F(t, j2));
                case 11:
                    return C4877y9.m20664b(t, j2) != 0;
                case 12:
                    return C4877y9.m20664b(t, j2) != 0;
                case 13:
                    return C4877y9.m20664b(t, j2) != 0;
                case 14:
                    return C4877y9.m20677o(t, j2) != 0;
                case 15:
                    return C4877y9.m20664b(t, j2) != 0;
                case 16:
                    return C4877y9.m20677o(t, j2) != 0;
                case 17:
                    return C4877y9.m20653F(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C4877y9.m20664b(t, j) & (1 << (Q >>> 20))) != 0;
        }
    }

    /* renamed from: B */
    private final boolean m20120B(T t, int i, int i2) {
        return C4877y9.m20664b(t, (long) (m20135Q(i2) & 1048575)) == i;
    }

    /* renamed from: C */
    private final boolean m20121C(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m20119A(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: D */
    private static boolean m20122D(Object obj, int i, C4453a9 a9Var) {
        return a9Var.mo13797c(C4877y9.m20653F(obj, (long) (i & 1048575)));
    }

    /* renamed from: E */
    private static <T> double m20123E(T t, long j) {
        return ((Double) C4877y9.m20653F(t, j)).doubleValue();
    }

    /* renamed from: F */
    private final int m20124F(int i, int i2) {
        int length = (this.f14388a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f14388a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: G */
    private final Object m20125G(int i) {
        return this.f14389b[(i / 3) << 1];
    }

    /* renamed from: H */
    private final void m20126H(T t, int i) {
        int Q = m20135Q(i);
        long j = (long) (1048575 & Q);
        if (j != 1048575) {
            C4877y9.m20670h(t, j, (1 << (Q >>> 20)) | C4877y9.m20664b(t, j));
        }
    }

    /* renamed from: I */
    private final void m20127I(T t, int i, int i2) {
        C4877y9.m20670h(t, (long) (m20135Q(i2) & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20128J(T r17, p148g.p189d.p190a.p232c.p241f.p247f.C4745qa r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f14393f
            if (r3 == 0) goto L_0x0023
            g.d.a.c.f.f.o6<?> r3 = r0.f14401n
            g.d.a.c.f.f.s6 r3 = r3.mo14499b(r1)
            g.d.a.c.f.f.f9<T, java.lang.Object> r5 = r3.f14477a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo14614p()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            int[] r5 = r0.f14388a
            int r5 = r5.length
            sun.misc.Unsafe r6 = f14387q
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0031:
            if (r9 >= r5) goto L_0x046b
            int r12 = r0.m20133O(r9)
            int[] r13 = r0.f14388a
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f14394g
            r8 = 1
            if (r4 != 0) goto L_0x005c
            r4 = 17
            if (r15 > r4) goto L_0x005c
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x0057
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            r10 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x0464
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03f5;
                case 9: goto L_0x03e4;
                case 10: goto L_0x03d5;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03bb;
                case 13: goto L_0x03ae;
                case 14: goto L_0x03a1;
                case 15: goto L_0x0394;
                case 16: goto L_0x0387;
                case 17: goto L_0x0376;
                case 18: goto L_0x0366;
                case 19: goto L_0x0356;
                case 20: goto L_0x0346;
                case 21: goto L_0x0336;
                case 22: goto L_0x0326;
                case 23: goto L_0x0316;
                case 24: goto L_0x0306;
                case 25: goto L_0x02f6;
                case 26: goto L_0x02e7;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02c5;
                case 29: goto L_0x02b5;
                case 30: goto L_0x02a5;
                case 31: goto L_0x0295;
                case 32: goto L_0x0285;
                case 33: goto L_0x0275;
                case 34: goto L_0x0265;
                case 35: goto L_0x0256;
                case 36: goto L_0x0247;
                case 37: goto L_0x0238;
                case 38: goto L_0x0229;
                case 39: goto L_0x021a;
                case 40: goto L_0x020b;
                case 41: goto L_0x01fc;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cf;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b1;
                case 47: goto L_0x01a2;
                case 48: goto L_0x0193;
                case 49: goto L_0x0180;
                case 50: goto L_0x0177;
                case 51: goto L_0x0168;
                case 52: goto L_0x0159;
                case 53: goto L_0x014a;
                case 54: goto L_0x013b;
                case 55: goto L_0x012c;
                case 56: goto L_0x011d;
                case 57: goto L_0x010e;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00dd;
                case 61: goto L_0x00cd;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0095;
                case 66: goto L_0x0087;
                case 67: goto L_0x0079;
                case 68: goto L_0x0067;
                default: goto L_0x0064;
            }
        L_0x0064:
            r15 = 0
            goto L_0x0460
        L_0x0067:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r9)
            r2.mo14412k(r14, r4, r8)
            goto L_0x0064
        L_0x0079:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m20136R(r1, r12)
            r2.mo14395I(r14, r12)
            goto L_0x0064
        L_0x0087:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m20134P(r1, r12)
            r2.mo14409h(r14, r4)
            goto L_0x0064
        L_0x0095:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m20136R(r1, r12)
            r2.mo14411j(r14, r12)
            goto L_0x0064
        L_0x00a3:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m20134P(r1, r12)
            r2.mo14397K(r14, r4)
            goto L_0x0064
        L_0x00b1:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m20134P(r1, r12)
            r2.mo14413l(r14, r4)
            goto L_0x0064
        L_0x00bf:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m20134P(r1, r12)
            r2.mo14393G(r14, r4)
            goto L_0x0064
        L_0x00cd:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            g.d.a.c.f.f.s5 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r4
            r2.mo14417p(r14, r4)
            goto L_0x0064
        L_0x00dd:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r9)
            r2.mo14401O(r14, r4, r8)
            goto L_0x0064
        L_0x00f0:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            m20152w(r14, r4, r2)
            goto L_0x0064
        L_0x00ff:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            boolean r4 = m20138T(r1, r12)
            r2.mo14405d(r14, r4)
            goto L_0x0064
        L_0x010e:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m20134P(r1, r12)
            r2.mo14427z(r14, r4)
            goto L_0x0064
        L_0x011d:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m20136R(r1, r12)
            r2.mo14388B(r14, r12)
            goto L_0x0064
        L_0x012c:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m20134P(r1, r12)
            r2.mo14420s(r14, r4)
            goto L_0x0064
        L_0x013b:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m20136R(r1, r12)
            r2.mo14421t(r14, r12)
            goto L_0x0064
        L_0x014a:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m20136R(r1, r12)
            r2.mo14398L(r14, r12)
            goto L_0x0064
        L_0x0159:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            float r4 = m20130L(r1, r12)
            r2.mo14400N(r14, r4)
            goto L_0x0064
        L_0x0168:
            boolean r4 = r0.m20120B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            double r12 = m20123E(r1, r12)
            r2.mo14399M(r14, r12)
            goto L_0x0064
        L_0x0177:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.m20154y(r2, r14, r4, r9)
            goto L_0x0064
        L_0x0180:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            g.d.a.c.f.f.a9 r12 = r0.m20147r(r9)
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18876x(r4, r8, r2, r12)
            goto L_0x0064
        L_0x0193:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18833K(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01a2:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18848Z(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01b1:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18839Q(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01c0:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18852b0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01cf:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18854c0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01de:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18845W(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01ed:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18856d0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01fc:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18850a0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x020b:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18836N(r4, r12, r2, r8)
            goto L_0x0064
        L_0x021a:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18842T(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0229:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18829G(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0238:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18825C(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0247:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18877y(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0256:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18864l(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0265:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18833K(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0275:
            r14 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18848Z(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0285:
            r14 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18839Q(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0295:
            r14 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18852b0(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02a5:
            r14 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18854c0(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02b5:
            r14 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18845W(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02c5:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18875w(r4, r8, r2)
            goto L_0x0064
        L_0x02d4:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            g.d.a.c.f.f.a9 r12 = r0.m20147r(r9)
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18863k(r4, r8, r2, r12)
            goto L_0x0064
        L_0x02e7:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18862j(r4, r8, r2)
            goto L_0x0064
        L_0x02f6:
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18856d0(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0306:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18850a0(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0316:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18836N(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0326:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18842T(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0336:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18829G(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0346:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18825C(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0356:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18877y(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0366:
            r15 = 0
            int[] r4 = r0.f14388a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18864l(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0376:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r9)
            r2.mo14412k(r14, r4, r8)
            goto L_0x0460
        L_0x0387:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo14395I(r14, r12)
            goto L_0x0460
        L_0x0394:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo14409h(r14, r4)
            goto L_0x0460
        L_0x03a1:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo14411j(r14, r12)
            goto L_0x0460
        L_0x03ae:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo14397K(r14, r4)
            goto L_0x0460
        L_0x03bb:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo14413l(r14, r4)
            goto L_0x0460
        L_0x03c8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo14393G(r14, r4)
            goto L_0x0460
        L_0x03d5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            g.d.a.c.f.f.s5 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r4
            r2.mo14417p(r14, r4)
            goto L_0x0460
        L_0x03e4:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r9)
            r2.mo14401O(r14, r4, r8)
            goto L_0x0460
        L_0x03f5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            m20152w(r14, r4, r2)
            goto L_0x0460
        L_0x0401:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r1, r12)
            r2.mo14405d(r14, r4)
            goto L_0x0460
        L_0x040d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo14427z(r14, r4)
            goto L_0x0460
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo14388B(r14, r12)
            goto L_0x0460
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo14420s(r14, r4)
            goto L_0x0460
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo14421t(r14, r12)
            goto L_0x0460
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo14398L(r14, r12)
            goto L_0x0460
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            float r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r1, r12)
            r2.mo14400N(r14, r4)
            goto L_0x0460
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            double r12 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r1, r12)
            r2.mo14399M(r14, r12)
        L_0x0460:
            int r9 = r9 + 3
            goto L_0x0031
        L_0x0464:
            g.d.a.c.f.f.o6<?> r1 = r0.f14401n
            r1.mo14498a(r3)
            r4 = 0
            throw r4
        L_0x046b:
            r4 = 0
            if (r3 != 0) goto L_0x0474
            g.d.a.c.f.f.s9<?, ?> r3 = r0.f14400m
            m20153x(r3, r1, r2)
            return
        L_0x0474:
            g.d.a.c.f.f.o6<?> r1 = r0.f14401n
            r1.mo14501d(r2, r3)
            goto L_0x047b
        L_0x047a:
            throw r4
        L_0x047b:
            goto L_0x047a
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.m20128J(java.lang.Object, g.d.a.c.f.f.qa):void");
    }

    /* renamed from: K */
    private final void m20129K(T t, T t2, int i) {
        int O = m20133O(i);
        int i2 = this.f14388a[i];
        long j = (long) (O & 1048575);
        if (m20120B(t2, i2, i)) {
            Object F = C4877y9.m20653F(t, j);
            Object F2 = C4877y9.m20653F(t2, j);
            if (F != null && F2 != null) {
                C4877y9.m20672j(t, j, C4470b7.m18817e(F, F2));
                m20127I(t, i2, i);
            } else if (F2 != null) {
                C4877y9.m20672j(t, j, F2);
                m20127I(t, i2, i);
            }
        }
    }

    /* renamed from: L */
    private static <T> float m20130L(T t, long j) {
        return ((Float) C4877y9.m20653F(t, j)).floatValue();
    }

    /* renamed from: M */
    private final C4563g7 m20131M(int i) {
        return (C4563g7) this.f14389b[((i / 3) << 1) + 1];
    }

    /* renamed from: N */
    private final boolean m20132N(T t, T t2, int i) {
        return m20119A(t, i) == m20119A(t2, i);
    }

    /* renamed from: O */
    private final int m20133O(int i) {
        return this.f14388a[i + 1];
    }

    /* renamed from: P */
    private static <T> int m20134P(T t, long j) {
        return ((Integer) C4877y9.m20653F(t, j)).intValue();
    }

    /* renamed from: Q */
    private final int m20135Q(int i) {
        return this.f14388a[i + 2];
    }

    /* renamed from: R */
    private static <T> long m20136R(T t, long j) {
        return ((Long) C4877y9.m20653F(t, j)).longValue();
    }

    /* renamed from: S */
    private static C4827v9 m20137S(Object obj) {
        C4895z6 z6Var = (C4895z6) obj;
        C4827v9 v9Var = z6Var.zzb;
        if (v9Var != C4827v9.m20502a()) {
            return v9Var;
        }
        C4827v9 g = C4827v9.m20505g();
        z6Var.zzb = g;
        return g;
    }

    /* renamed from: T */
    private static <T> boolean m20138T(T t, long j) {
        return ((Boolean) C4877y9.m20653F(t, j)).booleanValue();
    }

    /* renamed from: U */
    private final int m20139U(int i) {
        if (i < this.f14390c || i > this.f14391d) {
            return -1;
        }
        return m20124F(i, 0);
    }

    /* renamed from: j */
    private final int m20140j(int i, int i2) {
        if (i < this.f14390c || i > this.f14391d) {
            return -1;
        }
        return m20124F(i, i2);
    }

    /* renamed from: k */
    private static <UT, UB> int m20141k(C4777s9<UT, UB> s9Var, T t) {
        return s9Var.mo14635l(s9Var.mo14629f(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0133, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0163, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0168, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r2;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20142l(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f14387q
            int[] r7 = r0.f14388a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0158;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0138;
                case 55: goto L_0x012b;
                case 56: goto L_0x011f;
                case 57: goto L_0x0114;
                case 58: goto L_0x00fe;
                case 59: goto L_0x00d0;
                case 60: goto L_0x00ac;
                case 61: goto L_0x00a2;
                case 62: goto L_0x012b;
                case 63: goto L_0x0074;
                case 64: goto L_0x0114;
                case 65: goto L_0x011f;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x016c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x016c
            r2 = r2 & -8
            r7 = r2 | 4
            g.d.a.c.f.f.a9 r2 = r0.m20147r(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20039f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f14446c
            if (r15 != 0) goto L_0x0052
            goto L_0x0144
        L_0x0052:
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18817e(r15, r3)
            goto L_0x0144
        L_0x0058:
            if (r5 != 0) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r4, r11)
            long r3 = r11.f14445b
            long r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19226a(r3)
            goto L_0x0140
        L_0x0066:
            if (r5 != 0) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r11)
            int r3 = r11.f14444a
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19228c(r3)
            goto L_0x0133
        L_0x0074:
            if (r5 != 0) goto L_0x016c
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r11)
            int r4 = r11.f14444a
            g.d.a.c.f.f.g7 r5 = r0.m20131M(r6)
            if (r5 == 0) goto L_0x0098
            boolean r5 = r5.mo14197e(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            g.d.a.c.f.f.v9 r1 = m20137S(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo14684c(r2, r4)
            r2 = r3
            goto L_0x016d
        L_0x0098:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0168
        L_0x00a2:
            if (r5 != r15) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20050q(r3, r4, r11)
            java.lang.Object r3 = r11.f14446c
            goto L_0x0144
        L_0x00ac:
            if (r5 != r15) goto L_0x016c
            g.d.a.c.f.f.a9 r2 = r0.m20147r(r6)
            r5 = r20
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20040g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c3
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c4
        L_0x00c3:
            r15 = 0
        L_0x00c4:
            java.lang.Object r3 = r11.f14446c
            if (r15 != 0) goto L_0x00ca
            goto L_0x0144
        L_0x00ca:
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18817e(r15, r3)
            goto L_0x0144
        L_0x00d0:
            if (r5 != r15) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r11)
            int r4 = r11.f14444a
            if (r4 != 0) goto L_0x00dd
            java.lang.String r3 = ""
            goto L_0x0144
        L_0x00dd:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f1
            int r5 = r2 + r4
            boolean r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4473ba.m18885g(r3, r2, r5)
            if (r5 == 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19828f()
            throw r1
        L_0x00f1:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.f13993a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0168
        L_0x00fe:
            if (r5 != 0) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r4, r11)
            long r3 = r11.f14445b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x010e
            r15 = 1
            goto L_0x010f
        L_0x010e:
            r15 = 0
        L_0x010f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0144
        L_0x0114:
            if (r5 != r7) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0152
        L_0x011f:
            r2 = 1
            if (r5 != r2) goto L_0x016c
            long r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0163
        L_0x012b:
            if (r5 != 0) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r11)
            int r3 = r11.f14444a
        L_0x0133:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0144
        L_0x0138:
            if (r5 != 0) goto L_0x016c
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r4, r11)
            long r3 = r11.f14445b
        L_0x0140:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0144:
            r12.putObject(r1, r9, r3)
            goto L_0x0168
        L_0x0148:
            if (r5 != r7) goto L_0x016c
            float r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0152:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0168
        L_0x0158:
            r2 = 1
            if (r5 != r2) goto L_0x016c
            double r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0163:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0168:
            r12.putInt(r1, r13, r8)
            goto L_0x016d
        L_0x016c:
            r2 = r4
        L_0x016d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.m20142l(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, g.d.a.c.f.f.r5):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026e, code lost:
        if (r7.f14445b != 0) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0270, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0272, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0273, code lost:
        r11.mo14547d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0276, code lost:
        if (r4 >= r5) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0278, code lost:
        r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027e, code lost:
        if (r2 != r7.f14444a) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0280, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0288, code lost:
        if (r7.f14445b == 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        if (r4 == 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r11.add(p148g.p189d.p190a.p232c.p241f.p247f.C4773s5.f14473g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r11.add(p148g.p189d.p190a.p232c.p241f.p247f.C4773s5.m20338m(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
        if (r2 != r7.f14444a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7);
        r4 = r7.f14444a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0160, code lost:
        if (r4 < 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r4 != 0) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        throw p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bf  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20143m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f14387q
            java.lang.Object r11 = r11.getObject(r1, r9)
            g.d.a.c.f.f.h7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4581h7) r11
            boolean r12 = r11.mo14223a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            g.d.a.c.f.f.h7 r11 = r11.mo13882e(r12)
            sun.misc.Unsafe r12 = f14387q
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x0399;
                case 19: goto L_0x035b;
                case 20: goto L_0x0323;
                case 21: goto L_0x0323;
                case 22: goto L_0x0309;
                case 23: goto L_0x02ca;
                case 24: goto L_0x028b;
                case 25: goto L_0x023a;
                case 26: goto L_0x0197;
                case 27: goto L_0x017d;
                case 28: goto L_0x0132;
                case 29: goto L_0x0309;
                case 30: goto L_0x00fa;
                case 31: goto L_0x028b;
                case 32: goto L_0x02ca;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x0399;
                case 36: goto L_0x035b;
                case 37: goto L_0x0323;
                case 38: goto L_0x0323;
                case 39: goto L_0x0309;
                case 40: goto L_0x02ca;
                case 41: goto L_0x028b;
                case 42: goto L_0x023a;
                case 43: goto L_0x0309;
                case 44: goto L_0x00fa;
                case 45: goto L_0x028b;
                case 46: goto L_0x02ca;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03d7
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x03d7
            g.d.a.c.f.f.a9 r1 = r0.m20147r(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20039f(r22, r23, r24, r25, r26, r27)
        L_0x005a:
            java.lang.Object r8 = r7.f14446c
            r11.add(r8)
            if (r4 >= r5) goto L_0x03d7
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r9 = r7.f14444a
            if (r2 != r9) goto L_0x03d7
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20039f(r22, r23, r24, r25, r26, r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            g.d.a.c.f.f.y7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4875y7) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r1, r7)
            long r4 = r7.f14445b
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19226a(r4)
            r11.mo14760d(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x03d8
        L_0x0099:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x03d7
            g.d.a.c.f.f.y7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4875y7) r11
        L_0x00a2:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r4, r7)
            long r8 = r7.f14445b
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19226a(r8)
            r11.mo14760d(r8)
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            g.d.a.c.f.f.c7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4488c7) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r4 = r7.f14444a
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19228c(r4)
            r11.mo13886h(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x03d8
        L_0x00d9:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x03d7
            g.d.a.c.f.f.c7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4488c7) r11
        L_0x00e2:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r4 = r7.f14444a
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19228c(r4)
            r11.mo13886h(r4)
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20043j(r3, r4, r11, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x03d7
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20035b(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            g.d.a.c.f.f.z6 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r1
            g.d.a.c.f.f.v9 r3 = r1.zzb
            g.d.a.c.f.f.v9 r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4827v9.m20502a()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            g.d.a.c.f.f.g7 r4 = r0.m20131M(r8)
            g.d.a.c.f.f.s9<?, ?> r5 = r0.f14400m
            r6 = r22
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18861i(r6, r11, r4, r3, r5)
            g.d.a.c.f.f.v9 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4827v9) r3
            if (r3 == 0) goto L_0x012f
            r1.zzb = r3
        L_0x012f:
            r1 = r2
            goto L_0x03d8
        L_0x0132:
            if (r6 != r10) goto L_0x03d7
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r4 = r7.f14444a
            if (r4 < 0) goto L_0x0178
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0173
            if (r4 != 0) goto L_0x0148
        L_0x0142:
            g.d.a.c.f.f.s5 r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4773s5.f14473g
            r11.add(r4)
            goto L_0x0150
        L_0x0148:
            g.d.a.c.f.f.s5 r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4773s5.m20338m(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r4 = r7.f14444a
            if (r4 < 0) goto L_0x016e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0169
            if (r4 != 0) goto L_0x0148
            goto L_0x0142
        L_0x0169:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x016e:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b()
            throw r1
        L_0x0173:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x0178:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b()
            throw r1
        L_0x017d:
            if (r6 != r10) goto L_0x03d7
            g.d.a.c.f.f.a9 r1 = r0.m20147r(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20038e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03d8
        L_0x0197:
            if (r6 != r10) goto L_0x03d7
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            if (r6 != 0) goto L_0x01e4
            int r6 = r7.f14444a
            if (r6 < 0) goto L_0x01df
            if (r6 != 0) goto L_0x01b2
        L_0x01ae:
            r11.add(r1)
            goto L_0x01bd
        L_0x01b2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.f13993a
            r8.<init>(r3, r4, r6, r9)
        L_0x01b9:
            r11.add(r8)
            int r4 = r4 + r6
        L_0x01bd:
            if (r4 >= r5) goto L_0x03d7
            int r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r8 = r7.f14444a
            if (r2 != r8) goto L_0x03d7
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r6, r7)
            int r6 = r7.f14444a
            if (r6 < 0) goto L_0x01da
            if (r6 != 0) goto L_0x01d2
            goto L_0x01ae
        L_0x01d2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.f13993a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x01b9
        L_0x01da:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b()
            throw r1
        L_0x01df:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b()
            throw r1
        L_0x01e4:
            int r6 = r7.f14444a
            if (r6 < 0) goto L_0x0235
            if (r6 != 0) goto L_0x01ee
        L_0x01ea:
            r11.add(r1)
            goto L_0x0201
        L_0x01ee:
            int r8 = r4 + r6
            boolean r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4473ba.m18885g(r3, r4, r8)
            if (r9 == 0) goto L_0x0230
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.f13993a
            r9.<init>(r3, r4, r6, r10)
        L_0x01fd:
            r11.add(r9)
            r4 = r8
        L_0x0201:
            if (r4 >= r5) goto L_0x03d7
            int r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r8 = r7.f14444a
            if (r2 != r8) goto L_0x03d7
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r6, r7)
            int r6 = r7.f14444a
            if (r6 < 0) goto L_0x022b
            if (r6 != 0) goto L_0x0216
            goto L_0x01ea
        L_0x0216:
            int r8 = r4 + r6
            boolean r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4473ba.m18885g(r3, r4, r8)
            if (r9 == 0) goto L_0x0226
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.f13993a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01fd
        L_0x0226:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19828f()
            throw r1
        L_0x022b:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b()
            throw r1
        L_0x0230:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19828f()
            throw r1
        L_0x0235:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19824b()
            throw r1
        L_0x023a:
            r1 = 0
            if (r6 != r10) goto L_0x0262
            g.d.a.c.f.f.q5 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4740q5) r11
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r4 = r7.f14444a
            int r4 = r4 + r2
        L_0x0246:
            if (r2 >= r4) goto L_0x0259
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r2, r7)
            long r5 = r7.f14445b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0254
            r5 = 1
            goto L_0x0255
        L_0x0254:
            r5 = 0
        L_0x0255:
            r11.mo14547d(r5)
            goto L_0x0246
        L_0x0259:
            if (r2 != r4) goto L_0x025d
            goto L_0x012f
        L_0x025d:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x0262:
            if (r6 != 0) goto L_0x03d7
            g.d.a.c.f.f.q5 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4740q5) r11
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r4, r7)
            long r8 = r7.f14445b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0272
        L_0x0270:
            r6 = 1
            goto L_0x0273
        L_0x0272:
            r6 = 0
        L_0x0273:
            r11.mo14547d(r6)
            if (r4 >= r5) goto L_0x03d7
            int r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r8 = r7.f14444a
            if (r2 != r8) goto L_0x03d7
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r6, r7)
            long r8 = r7.f14445b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0272
            goto L_0x0270
        L_0x028b:
            if (r6 != r10) goto L_0x02ab
            g.d.a.c.f.f.c7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4488c7) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x0296:
            if (r1 >= r2) goto L_0x02a2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r3, r1)
            r11.mo13886h(r4)
            int r1 = r1 + 4
            goto L_0x0296
        L_0x02a2:
            if (r1 != r2) goto L_0x02a6
            goto L_0x03d8
        L_0x02a6:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x02ab:
            if (r6 != r9) goto L_0x03d7
            g.d.a.c.f.f.c7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4488c7) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r18, r19)
            r11.mo13886h(r1)
        L_0x02b6:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r3, r4)
            r11.mo13886h(r1)
            goto L_0x02b6
        L_0x02ca:
            if (r6 != r10) goto L_0x02ea
            g.d.a.c.f.f.y7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4875y7) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x02d5:
            if (r1 >= r2) goto L_0x02e1
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r3, r1)
            r11.mo14760d(r4)
            int r1 = r1 + 8
            goto L_0x02d5
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x03d8
        L_0x02e5:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x02ea:
            if (r6 != r13) goto L_0x03d7
            g.d.a.c.f.f.y7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4875y7) r11
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r18, r19)
            r11.mo14760d(r8)
        L_0x02f5:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r3, r4)
            r11.mo14760d(r8)
            goto L_0x02f5
        L_0x0309:
            if (r6 != r10) goto L_0x0311
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20043j(r3, r4, r11, r7)
            goto L_0x03d8
        L_0x0311:
            if (r6 != 0) goto L_0x03d7
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20035b(r21, r22, r23, r24, r25, r26)
            goto L_0x03d8
        L_0x0323:
            if (r6 != r10) goto L_0x0343
            g.d.a.c.f.f.y7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4875y7) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x032e:
            if (r1 >= r2) goto L_0x033a
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r1, r7)
            long r4 = r7.f14445b
            r11.mo14760d(r4)
            goto L_0x032e
        L_0x033a:
            if (r1 != r2) goto L_0x033e
            goto L_0x03d8
        L_0x033e:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x0343:
            if (r6 != 0) goto L_0x03d7
            g.d.a.c.f.f.y7 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4875y7) r11
        L_0x0347:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r3, r4, r7)
            long r8 = r7.f14445b
            r11.mo14760d(r8)
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            goto L_0x0347
        L_0x035b:
            if (r6 != r10) goto L_0x037a
            g.d.a.c.f.f.y6 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4874y6) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x0366:
            if (r1 >= r2) goto L_0x0372
            float r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r3, r1)
            r11.mo14751d(r4)
            int r1 = r1 + 4
            goto L_0x0366
        L_0x0372:
            if (r1 != r2) goto L_0x0375
            goto L_0x03d8
        L_0x0375:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x037a:
            if (r6 != r9) goto L_0x03d7
            g.d.a.c.f.f.y6 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4874y6) r11
            float r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r18, r19)
            r11.mo14751d(r1)
        L_0x0385:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            float r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r3, r4)
            r11.mo14751d(r1)
            goto L_0x0385
        L_0x0399:
            if (r6 != r10) goto L_0x03b8
            g.d.a.c.f.f.k6 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4635k6) r11
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r4, r7)
            int r2 = r7.f14444a
            int r2 = r2 + r1
        L_0x03a4:
            if (r1 >= r2) goto L_0x03b0
            double r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r3, r1)
            r11.mo14340d(r4)
            int r1 = r1 + 8
            goto L_0x03a4
        L_0x03b0:
            if (r1 != r2) goto L_0x03b3
            goto L_0x03d8
        L_0x03b3:
            g.d.a.c.f.f.k7 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r1
        L_0x03b8:
            if (r6 != r13) goto L_0x03d7
            g.d.a.c.f.f.k6 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4635k6) r11
            double r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r18, r19)
            r11.mo14340d(r8)
        L_0x03c3:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03d8
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r3, r1, r7)
            int r6 = r7.f14444a
            if (r2 != r6) goto L_0x03d8
            double r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r3, r4)
            r11.mo14340d(r8)
            goto L_0x03c3
        L_0x03d7:
            r1 = r4
        L_0x03d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.m20143m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, g.d.a.c.f.f.r5):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m20144n(T r8, byte[] r9, int r10, int r11, int r12, long r13, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f14387q
            java.lang.Object r12 = r7.m20125G(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            g.d.a.c.f.f.d8 r2 = r7.f14402o
            boolean r2 = r2.mo14041e(r1)
            if (r2 == 0) goto L_0x0021
            g.d.a.c.f.f.d8 r2 = r7.f14402o
            java.lang.Object r2 = r2.mo14044h(r12)
            g.d.a.c.f.f.d8 r3 = r7.f14402o
            r3.mo14040d(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            g.d.a.c.f.f.d8 r8 = r7.f14402o
            g.d.a.c.f.f.b8 r8 = r8.mo14043g(r12)
            g.d.a.c.f.f.d8 r12 = r7.f14402o
            java.util.Map r12 = r12.mo14038b(r1)
            int r10 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r9, r10, r15)
            int r13 = r15.f14444a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f13996b
            V r0 = r8.f13998d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20037d(r10, r9, r1, r15)
            int r10 = r15.f14444a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            g.d.a.c.f.f.ka r1 = r8.f13997c
            int r1 = r1.mo14360g()
            if (r3 != r1) goto L_0x0087
            g.d.a.c.f.f.ka r4 = r8.f13997c
            V r10 = r8.f13998d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m20145p(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f14446c
            goto L_0x003e
        L_0x0072:
            g.d.a.c.f.f.ka r1 = r8.f13995a
            int r1 = r1.mo14360g()
            if (r3 != r1) goto L_0x0087
            g.d.a.c.f.f.ka r4 = r8.f13995a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m20145p(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f14446c
            goto L_0x003e
        L_0x0087:
            int r10 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20034a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            g.d.a.c.f.f.k7 r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19827e()
            throw r8
        L_0x0097:
            g.d.a.c.f.f.k7 r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            goto L_0x009d
        L_0x009c:
            throw r8
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.m20144n(java.lang.Object, byte[], int, int, int, long, g.d.a.c.f.f.r5):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r6.f14446c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r6.f14446c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r6.f14446c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r2 = java.lang.Long.valueOf(r2);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m20145p(byte[] r1, int r2, int r3, p148g.p189d.p190a.p232c.p241f.p247f.C4639ka r4, java.lang.Class<?> r5, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r6) throws java.io.IOException {
        /*
            int[] r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4711o8.f14352a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x005d;
                case 7: goto L_0x005d;
                case 8: goto L_0x0054;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20049p(r1, r2, r6)
            goto L_0x0099
        L_0x0019:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r1, r2, r6)
            long r2 = r6.f14445b
            long r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19226a(r2)
            goto L_0x0042
        L_0x0024:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r1, r2, r6)
            int r2 = r6.f14444a
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19228c(r2)
            goto L_0x004d
        L_0x002f:
            g.d.a.c.f.f.w8 r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4842w8.m20540a()
            g.d.a.c.f.f.a9 r4 = r4.mo14699b(r5)
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20040g(r4, r1, r2, r3, r6)
            goto L_0x0099
        L_0x003c:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r1, r2, r6)
            long r2 = r6.f14445b
        L_0x0042:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0051
        L_0x0047:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r1, r2, r6)
            int r2 = r6.f14444a
        L_0x004d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0051:
            r6.f14446c = r2
            goto L_0x0099
        L_0x0054:
            float r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x006e
        L_0x005d:
            long r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x007b
        L_0x0066:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x006e:
            r6.f14446c = r1
            int r1 = r2 + 4
            goto L_0x0099
        L_0x0073:
            double r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
        L_0x007b:
            r6.f14446c = r1
            int r1 = r2 + 8
            goto L_0x0099
        L_0x0080:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20050q(r1, r2, r6)
            goto L_0x0099
        L_0x0085:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r1, r2, r6)
            long r2 = r6.f14445b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0051
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.m20145p(byte[], int, int, g.d.a.c.f.f.ka, java.lang.Class, g.d.a.c.f.f.r5):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> p148g.p189d.p190a.p232c.p241f.p247f.C4727p8<T> m20146q(java.lang.Class<T> r33, p148g.p189d.p190a.p232c.p241f.p247f.C4619j8 r34, p148g.p189d.p190a.p232c.p241f.p247f.C4793t8 r35, p148g.p189d.p190a.p232c.p241f.p247f.C4809u7 r36, p148g.p189d.p190a.p232c.p241f.p247f.C4777s9<?, ?> r37, p148g.p189d.p190a.p232c.p241f.p247f.C4709o6<?> r38, p148g.p189d.p190a.p232c.p241f.p247f.C4507d8 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4876y8
            if (r1 == 0) goto L_0x040f
            g.d.a.c.f.f.y8 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4876y8) r0
            int r1 = r0.mo14306a()
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4900e.f14689j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.mo14767d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = f14386p
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = f14387q
            java.lang.Object[] r16 = r0.mo14768e()
            g.d.a.c.f.f.l8 r17 = r0.mo14308c()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03e3
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02aa
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m20150u(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r10 = (int) r9
            int r4 = r4 + 1
            r9 = r16[r4]
            r25 = r10
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x028e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0296
        L_0x028e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m20150u(r6, r9)
            r16[r4] = r9
        L_0x0296:
            long r9 = r8.objectFieldOffset(r9)
            int r4 = (int) r9
            r30 = r1
            r9 = r4
            r1 = r11
            r24 = r12
            r10 = r25
            r11 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a8
        L_0x02aa:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m20150u(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031e
            r13 = 17
            if (r15 != r13) goto L_0x02bd
            goto L_0x031e
        L_0x02bd:
            r13 = 27
            if (r15 == r13) goto L_0x030d
            r13 = 49
            if (r15 != r13) goto L_0x02c6
            goto L_0x030d
        L_0x02c6:
            r13 = 12
            if (r15 == r13) goto L_0x02f9
            r13 = 30
            if (r15 == r13) goto L_0x02f9
            r13 = 44
            if (r15 != r13) goto L_0x02d3
            goto L_0x02f9
        L_0x02d3:
            r13 = 50
            if (r15 != r13) goto L_0x032c
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032c
        L_0x02f6:
            r21 = r13
            goto L_0x031b
        L_0x02f9:
            if (r11 != 0) goto L_0x030a
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x031b
        L_0x030a:
            r24 = 1
            goto L_0x032c
        L_0x030d:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x031b:
            r13 = r25
            goto L_0x032d
        L_0x031e:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032c:
            r13 = r9
        L_0x032d:
            long r9 = r8.objectFieldOffset(r10)
            int r10 = (int) r9
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r9 != r13) goto L_0x038c
            r9 = 17
            if (r15 > r9) goto L_0x038c
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0364
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034d:
            int r28 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x035f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r18
            r4 = r4 | r9
            int r18 = r18 + 13
            r9 = r28
            goto L_0x034d
        L_0x035f:
            int r9 = r9 << r18
            r4 = r4 | r9
            r9 = r28
        L_0x0364:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0377
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037f
        L_0x0377:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m20150u(r6, r13)
            r16[r24] = r13
        L_0x037f:
            r1 = r11
            r24 = r12
            long r11 = r8.objectFieldOffset(r13)
            int r12 = (int) r11
            int r4 = r4 % 32
            r11 = r9
            r9 = r12
            goto L_0x0398
        L_0x038c:
            r30 = r1
            r1 = r11
            r24 = r12
            r18 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r4
            r4 = 0
        L_0x0398:
            r12 = 18
            if (r15 < r12) goto L_0x03a6
            r12 = 49
            if (r15 > r12) goto L_0x03a6
            int r12 = r22 + 1
            r14[r22] = r10
            r22 = r12
        L_0x03a6:
            r13 = r25
        L_0x03a8:
            int r12 = r20 + 1
            r5[r20] = r7
            int r7 = r12 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03bf
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r10
            r5[r12] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r9
            r5[r7] = r3
            r7 = r11
            r3 = r20
            r10 = r23
            r12 = r24
            r15 = r27
            r9 = r29
            r4 = 1
            r11 = r1
            r20 = r2
            r2 = r26
            r1 = r30
            goto L_0x0193
        L_0x03e3:
            r29 = r9
            r23 = r10
            r1 = r11
            r24 = r12
            r27 = r15
            g.d.a.c.f.f.p8 r2 = new g.d.a.c.f.f.p8
            g.d.a.c.f.f.l8 r10 = r0.mo14308c()
            r12 = 0
            r0 = r5
            r5 = r2
            r6 = r0
            r7 = r24
            r8 = r29
            r9 = r23
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x040f:
            g.d.a.c.f.f.p9 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4728p9) r0
            r0.mo14306a()
            r0 = 0
            goto L_0x0417
        L_0x0416:
            throw r0
        L_0x0417:
            goto L_0x0416
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.m20146q(java.lang.Class, g.d.a.c.f.f.j8, g.d.a.c.f.f.t8, g.d.a.c.f.f.u7, g.d.a.c.f.f.s9, g.d.a.c.f.f.o6, g.d.a.c.f.f.d8):g.d.a.c.f.f.p8");
    }

    /* renamed from: r */
    private final C4453a9 m20147r(int i) {
        int i2 = (i / 3) << 1;
        C4453a9 a9Var = (C4453a9) this.f14389b[i2];
        if (a9Var != null) {
            return a9Var;
        }
        C4453a9 b = C4842w8.m20540a().mo14699b((Class) this.f14389b[i2 + 1]);
        this.f14389b[i2] = b;
        return b;
    }

    /* renamed from: s */
    private final <K, V, UT, UB> UB m20148s(int i, int i2, Map<K, V> map, C4563g7 g7Var, UB ub, C4777s9<UT, UB> s9Var) {
        C4471b8<?, ?> g = this.f14402o.mo14043g(m20125G(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!g7Var.mo14197e(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = s9Var.mo14624a();
                }
                C4894z5 u = C4773s5.m20340u(C4489c8.m18959a(g, next.getKey(), next.getValue()));
                try {
                    C4489c8.m18960b(u.mo14808b(), g, next.getKey(), next.getValue());
                    s9Var.mo14626c(ub, i2, u.mo14807a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: t */
    private final <UT, UB> UB m20149t(Object obj, int i, UB ub, C4777s9<UT, UB> s9Var) {
        C4563g7 M;
        int i2 = this.f14388a[i];
        Object F = C4877y9.m20653F(obj, (long) (m20133O(i) & 1048575));
        if (F == null || (M = m20131M(i)) == null) {
            return ub;
        }
        return m20148s(i, i2, this.f14402o.mo14038b(F), M, ub, s9Var);
    }

    /* renamed from: u */
    private static Field m20150u(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: v */
    private static List<?> m20151v(Object obj, long j) {
        return (List) C4877y9.m20653F(obj, j);
    }

    /* renamed from: w */
    private static void m20152w(int i, Object obj, C4745qa qaVar) throws IOException {
        if (obj instanceof String) {
            qaVar.mo14391E(i, (String) obj);
        } else {
            qaVar.mo14417p(i, (C4773s5) obj);
        }
    }

    /* renamed from: x */
    private static <UT, UB> void m20153x(C4777s9<UT, UB> s9Var, T t, C4745qa qaVar) throws IOException {
        s9Var.mo14627d(s9Var.mo14629f(t), qaVar);
    }

    /* renamed from: y */
    private final <K, V> void m20154y(C4745qa qaVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            qaVar.mo14404c(i, this.f14402o.mo14043g(m20125G(i2)), this.f14402o.mo14042f(obj));
        }
    }

    /* renamed from: z */
    private final void m20155z(T t, T t2, int i) {
        long O = (long) (m20133O(i) & 1048575);
        if (m20119A(t2, i)) {
            Object F = C4877y9.m20653F(t, O);
            Object F2 = C4877y9.m20653F(t2, O);
            if (F != null && F2 != null) {
                C4877y9.m20672j(t, O, C4470b7.m18817e(F, F2));
                m20126H(t, i);
            } else if (F2 != null) {
                C4877y9.m20672j(t, O, F2);
                m20126H(t, i);
            }
        }
    }

    /* renamed from: a */
    public final T mo13795a() {
        return this.f14398k.mo14623b(this.f14392e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m20134P(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m20136R(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18815c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18814b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13796b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f14388a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.m20133O(r1)
            int[] r4 = r8.f14388a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m20138T(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m20134P(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m20136R(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m20130L(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.m20120B(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m20123E(r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r9, r5)
        L_0x00fd:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18815c(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18814b(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            g.d.a.c.f.f.s9<?, ?> r0 = r8.f14400m
            java.lang.Object r0 = r0.mo14629f(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f14393f
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            g.d.a.c.f.f.o6<?> r0 = r8.f14401n
            g.d.a.c.f.f.s6 r9 = r0.mo14499b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo13796b(java.lang.Object):int");
    }

    /* renamed from: c */
    public final boolean mo13797c(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.f14396i) {
                return !this.f14393f || this.f14401n.mo14499b(t2).mo14616r();
            }
            int i6 = this.f14395h[i5];
            int i7 = this.f14388a[i6];
            int O = m20133O(i6);
            int i8 = this.f14388a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f14387q.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if (((268435456 & O) != 0) && !m20121C(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (267386880 & O) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (m20120B(t2, i7, i6) && !m20122D(t2, O, m20147r(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> f = this.f14402o.mo14042f(C4877y9.m20653F(t2, (long) (O & 1048575)));
                            if (!f.isEmpty()) {
                                if (this.f14402o.mo14043g(m20125G(i6)).f13997c.mo14359e() == C4695na.MESSAGE) {
                                    C4453a9<?> a9Var = null;
                                    Iterator<?> it = f.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (a9Var == null) {
                                            a9Var = C4842w8.m20540a().mo14699b(next.getClass());
                                        }
                                        if (!a9Var.mo13797c(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C4877y9.m20653F(t2, (long) (O & 1048575));
                if (!list.isEmpty()) {
                    C4453a9 r = m20147r(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!r.mo13797c(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m20121C(t, i6, i2, i, i10) && !m20122D(t2, O, m20147r(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6), p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6), p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6), p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6), p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6) == p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r10, r6)) == java.lang.Float.floatToIntBits(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r10, r6)) == java.lang.Double.doubleToLongBits(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6), p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)) != false) goto L_0x01b3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13798d(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f14388a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.m20133O(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0198;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b3
        L_0x001c:
            int r4 = r9.m20135Q(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r4)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6)
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6)
            java.lang.Object r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)
            boolean r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(r3, r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6)
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6)
            long r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6)
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6)
            long r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6)
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6)
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6)
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6)
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6)
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r10, r6)
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r11, r6)
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18869q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r10, r6)
            boolean r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6)
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6)
            long r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r10, r6)
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6)
            long r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r10, r6)
            long r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.m20132N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
        L_0x01b2:
            r3 = 0
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            g.d.a.c.f.f.s9<?, ?> r0 = r9.f14400m
            java.lang.Object r0 = r0.mo14629f(r10)
            g.d.a.c.f.f.s9<?, ?> r2 = r9.f14400m
            java.lang.Object r2 = r2.mo14629f(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r9.f14393f
            if (r0 == 0) goto L_0x01e2
            g.d.a.c.f.f.o6<?> r0 = r9.f14401n
            g.d.a.c.f.f.s6 r10 = r0.mo14499b(r10)
            g.d.a.c.f.f.o6<?> r0 = r9.f14401n
            g.d.a.c.f.f.s6 r11 = r0.mo14499b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo13798d(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: e */
    public final void mo13799e(T t) {
        int i;
        int i2 = this.f14396i;
        while (true) {
            i = this.f14397j;
            if (i2 >= i) {
                break;
            }
            long O = (long) (m20133O(this.f14395h[i2]) & 1048575);
            Object F = C4877y9.m20653F(t, O);
            if (F != null) {
                C4877y9.m20672j(t, O, this.f14402o.mo14039c(F));
            }
            i2++;
        }
        int length = this.f14395h.length;
        while (i < length) {
            this.f14399l.mo14677d(t, (long) this.f14395h[i]);
            i++;
        }
        this.f14400m.mo14633j(t);
        if (this.f14393f) {
            this.f14401n.mo14504g(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0256, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025f, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19681V(r3, (p148g.p189d.p190a.p232c.p241f.p247f.C4655l8) p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5), m20147r(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0278, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19696n0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0287, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19703u0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0292, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19704v0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x029d, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19664B0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ac, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19668D0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bb, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19699q0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c6, code lost:
        r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ca, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19680U(r3, (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d7, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18849a(r3, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5), m20147r(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f1, code lost:
        if ((r5 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f4, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19673G(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0302, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19674H(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x030e, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19707y0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031a, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19700r0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x032a, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19695m0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033a, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19692i0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034a, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19685c0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0356, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19665C(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0362, code lost:
        r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19663B(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036a, code lost:
        r12 = r12 + 3;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b8, code lost:
        if (m20120B(r1, r15, r3) != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d8, code lost:
        if (m20120B(r1, r15, r3) != false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e0, code lost:
        if (m20120B(r1, r15, r3) != false) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0400, code lost:
        if (m20120B(r1, r15, r3) != false) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0408, code lost:
        if (m20120B(r1, r15, r3) != false) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0418, code lost:
        if ((r4 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) != false) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04b9, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c7, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d5, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04e3, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04f1, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ff, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x050d, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x051a, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0527, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0534, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0541, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x054e, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x055b, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0568, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x056a, code lost:
        r8 = (p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19691h0(r15) + p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19698p0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0617, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0627, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x062c, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0632, code lost:
        if ((r12 & r11) != 0) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0634, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19681V(r15, (p148g.p189d.p190a.p232c.p241f.p247f.C4655l8) r2.getObject(r1, r8), m20147r(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x064b, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19696n0(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0658, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19703u0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x065f, code lost:
        if ((r12 & r11) != 0) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0661, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19704v0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x066a, code lost:
        if ((r12 & r11) != 0) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x066c, code lost:
        r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19664B0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0671, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x067b, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19668D0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0688, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19699q0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x068f, code lost:
        if ((r12 & r11) != 0) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0691, code lost:
        r4 = r2.getObject(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0695, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19680U(r15, (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x069e, code lost:
        if ((r12 & r11) != 0) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06a0, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18849a(r15, r2.getObject(r1, r8), m20147r(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06b8, code lost:
        if ((r4 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) != false) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06bb, code lost:
        r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19673G(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0718, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x073b, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if ((r5 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d1, code lost:
        r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19691h0(r3) + p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19698p0(r5)) + r5;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13800f(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f14394g
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0378
            sun.misc.Unsafe r2 = f14387q
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f14388a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0370
            int r14 = r0.m20133O(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f14388a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            g.d.a.c.f.f.t6 r14 = p148g.p189d.p190a.p232c.p241f.p247f.C4791t6.DOUBLE_LIST_PACKED
            int r14 = r14.mo14660a()
            if (r15 < r14) goto L_0x003f
            g.d.a.c.f.f.t6 r14 = p148g.p189d.p190a.p232c.p241f.p247f.C4791t6.SINT64_LIST_PACKED
            int r14 = r14.mo14660a()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.f14388a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x035c;
                case 1: goto L_0x0350;
                case 2: goto L_0x0340;
                case 3: goto L_0x0330;
                case 4: goto L_0x0320;
                case 5: goto L_0x0314;
                case 6: goto L_0x0308;
                case 7: goto L_0x02fc;
                case 8: goto L_0x02e5;
                case 9: goto L_0x02d1;
                case 10: goto L_0x02c0;
                case 11: goto L_0x02b1;
                case 12: goto L_0x02a2;
                case 13: goto L_0x0297;
                case 14: goto L_0x028c;
                case 15: goto L_0x027d;
                case 16: goto L_0x026e;
                case 17: goto L_0x0259;
                case 18: goto L_0x024e;
                case 19: goto L_0x0245;
                case 20: goto L_0x023c;
                case 21: goto L_0x0233;
                case 22: goto L_0x022a;
                case 23: goto L_0x024e;
                case 24: goto L_0x0245;
                case 25: goto L_0x0221;
                case 26: goto L_0x0218;
                case 27: goto L_0x020b;
                case 28: goto L_0x0202;
                case 29: goto L_0x01f9;
                case 30: goto L_0x01f0;
                case 31: goto L_0x0245;
                case 32: goto L_0x024e;
                case 33: goto L_0x01e7;
                case 34: goto L_0x01dd;
                case 35: goto L_0x01c5;
                case 36: goto L_0x01b8;
                case 37: goto L_0x01ab;
                case 38: goto L_0x019e;
                case 39: goto L_0x0191;
                case 40: goto L_0x0184;
                case 41: goto L_0x0177;
                case 42: goto L_0x016a;
                case 43: goto L_0x015c;
                case 44: goto L_0x014e;
                case 45: goto L_0x0140;
                case 46: goto L_0x0132;
                case 47: goto L_0x0124;
                case 48: goto L_0x0116;
                case 49: goto L_0x0108;
                case 50: goto L_0x00f8;
                case 51: goto L_0x00f0;
                case 52: goto L_0x00e8;
                case 53: goto L_0x00dc;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c4;
                case 56: goto L_0x00bc;
                case 57: goto L_0x00b4;
                case 58: goto L_0x00ac;
                case 59: goto L_0x009c;
                case 60: goto L_0x0094;
                case 61: goto L_0x008c;
                case 62: goto L_0x0080;
                case 63: goto L_0x0074;
                case 64: goto L_0x006c;
                case 65: goto L_0x0064;
                case 66: goto L_0x0058;
                case 67: goto L_0x004c;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x036a
        L_0x0044:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x025f
        L_0x004c:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = m20136R(r1, r5)
            goto L_0x0278
        L_0x0058:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = m20134P(r1, r5)
            goto L_0x0287
        L_0x0064:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0292
        L_0x006c:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x029d
        L_0x0074:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = m20134P(r1, r5)
            goto L_0x02ac
        L_0x0080:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = m20134P(r1, r5)
            goto L_0x02bb
        L_0x008c:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x02c6
        L_0x0094:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x02d7
        L_0x009c:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5)
            boolean r6 = r5 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5
            if (r6 == 0) goto L_0x02f4
            goto L_0x02f3
        L_0x00ac:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0302
        L_0x00b4:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x030e
        L_0x00bc:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x031a
        L_0x00c4:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = m20134P(r1, r5)
            goto L_0x032a
        L_0x00d0:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = m20136R(r1, r5)
            goto L_0x033a
        L_0x00dc:
            boolean r14 = r0.m20120B(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = m20136R(r1, r5)
            goto L_0x034a
        L_0x00e8:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0356
        L_0x00f0:
            boolean r5 = r0.m20120B(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0362
        L_0x00f8:
            g.d.a.c.f.f.d8 r14 = r0.f14402o
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5)
            java.lang.Object r6 = r0.m20125G(r12)
            int r3 = r14.mo14045i(r3, r5, r6)
            goto L_0x0256
        L_0x0108:
            java.util.List r5 = m20151v(r1, r5)
            g.d.a.c.f.f.a9 r6 = r0.m20147r(r12)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18871s(r3, r5, r6)
            goto L_0x0256
        L_0x0116:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18823A(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0124:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18838P(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0132:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18844V(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0140:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18841S(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x014e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18827E(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x015c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18835M(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x016a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18847Y(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0177:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18841S(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0184:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18844V(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0191:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18831I(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x019e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18873u(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01ab:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18857e(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01b8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18841S(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01c5:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18844V(r5)
            if (r5 <= 0) goto L_0x036a
        L_0x01d1:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19691h0(r3)
            int r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19698p0(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0256
        L_0x01dd:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18878z(r3, r5, r11)
            goto L_0x0256
        L_0x01e7:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18837O(r3, r5, r11)
            goto L_0x0256
        L_0x01f0:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18826D(r3, r5, r11)
            goto L_0x0256
        L_0x01f9:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18834L(r3, r5, r11)
            goto L_0x0256
        L_0x0202:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18870r(r3, r5)
            goto L_0x0256
        L_0x020b:
            java.util.List r5 = m20151v(r1, r5)
            g.d.a.c.f.f.a9 r6 = r0.m20147r(r12)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18853c(r3, r5, r6)
            goto L_0x0256
        L_0x0218:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18851b(r3, r5)
            goto L_0x0256
        L_0x0221:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18846X(r3, r5, r11)
            goto L_0x0256
        L_0x022a:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18830H(r3, r5, r11)
            goto L_0x0256
        L_0x0233:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18872t(r3, r5, r11)
            goto L_0x0256
        L_0x023c:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18855d(r3, r5, r11)
            goto L_0x0256
        L_0x0245:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18840R(r3, r5, r11)
            goto L_0x0256
        L_0x024e:
            java.util.List r5 = m20151v(r1, r5)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18843U(r3, r5, r11)
        L_0x0256:
            int r13 = r13 + r3
            goto L_0x036a
        L_0x0259:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
        L_0x025f:
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5)
            g.d.a.c.f.f.l8 r5 = (p148g.p189d.p190a.p232c.p241f.p247f.C4655l8) r5
            g.d.a.c.f.f.a9 r6 = r0.m20147r(r12)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19681V(r3, r5, r6)
            goto L_0x0256
        L_0x026e:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r1, r5)
        L_0x0278:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19696n0(r3, r5)
            goto L_0x0256
        L_0x027d:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r1, r5)
        L_0x0287:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19703u0(r3, r5)
            goto L_0x0256
        L_0x028c:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0292:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19704v0(r3, r9)
            goto L_0x0256
        L_0x0297:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x029d:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19664B0(r3, r11)
            goto L_0x0256
        L_0x02a2:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r1, r5)
        L_0x02ac:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19668D0(r3, r5)
            goto L_0x0256
        L_0x02b1:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r1, r5)
        L_0x02bb:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19699q0(r3, r5)
            goto L_0x0256
        L_0x02c0:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
        L_0x02c6:
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5)
        L_0x02ca:
            g.d.a.c.f.f.s5 r5 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r5
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19680U(r3, r5)
            goto L_0x0256
        L_0x02d1:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
        L_0x02d7:
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5)
            g.d.a.c.f.f.a9 r6 = r0.m20147r(r12)
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18849a(r3, r5, r6)
            goto L_0x0256
        L_0x02e5:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            java.lang.Object r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r1, r5)
            boolean r6 = r5 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5
            if (r6 == 0) goto L_0x02f4
        L_0x02f3:
            goto L_0x02ca
        L_0x02f4:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19673G(r3, r5)
            goto L_0x0256
        L_0x02fc:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0302:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19674H(r3, r8)
            goto L_0x0256
        L_0x0308:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x030e:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19707y0(r3, r11)
            goto L_0x0256
        L_0x0314:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x031a:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19700r0(r3, r9)
            goto L_0x0256
        L_0x0320:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r1, r5)
        L_0x032a:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19695m0(r3, r5)
            goto L_0x0256
        L_0x0330:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r1, r5)
        L_0x033a:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19692i0(r3, r5)
            goto L_0x0256
        L_0x0340:
            boolean r14 = r0.m20119A(r1, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r1, r5)
        L_0x034a:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19685c0(r3, r5)
            goto L_0x0256
        L_0x0350:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0356:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19665C(r3, r4)
            goto L_0x0256
        L_0x035c:
            boolean r5 = r0.m20119A(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0362:
            r5 = 0
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19663B(r3, r5)
            goto L_0x0256
        L_0x036a:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0370:
            g.d.a.c.f.f.s9<?, ?> r2 = r0.f14400m
            int r1 = m20141k(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x0378:
            sun.misc.Unsafe r2 = f14387q
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0380:
            int[] r13 = r0.f14388a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0746
            int r13 = r0.m20133O(r3)
            int[] r14 = r0.f14388a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03ab
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r6) goto L_0x03ac
            long r8 = (long) r14
            int r6 = r2.getInt(r1, r8)
            r12 = r6
            r6 = r14
            goto L_0x03ac
        L_0x03ab:
            r11 = 0
        L_0x03ac:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x072b;
                case 1: goto L_0x071a;
                case 2: goto L_0x0709;
                case 3: goto L_0x06f9;
                case 4: goto L_0x06e9;
                case 5: goto L_0x06dc;
                case 6: goto L_0x06cf;
                case 7: goto L_0x06c3;
                case 8: goto L_0x06ae;
                case 9: goto L_0x069c;
                case 10: goto L_0x068d;
                case 11: goto L_0x0680;
                case 12: goto L_0x0673;
                case 13: goto L_0x0668;
                case 14: goto L_0x065d;
                case 15: goto L_0x0650;
                case 16: goto L_0x0643;
                case 17: goto L_0x0630;
                case 18: goto L_0x061c;
                case 19: goto L_0x060c;
                case 20: goto L_0x0600;
                case 21: goto L_0x05f4;
                case 22: goto L_0x05e8;
                case 23: goto L_0x05dc;
                case 24: goto L_0x060c;
                case 25: goto L_0x05d0;
                case 26: goto L_0x05c5;
                case 27: goto L_0x05b6;
                case 28: goto L_0x05aa;
                case 29: goto L_0x059d;
                case 30: goto L_0x0590;
                case 31: goto L_0x060c;
                case 32: goto L_0x05dc;
                case 33: goto L_0x0583;
                case 34: goto L_0x0576;
                case 35: goto L_0x055e;
                case 36: goto L_0x0551;
                case 37: goto L_0x0544;
                case 38: goto L_0x0537;
                case 39: goto L_0x052a;
                case 40: goto L_0x051d;
                case 41: goto L_0x0510;
                case 42: goto L_0x0503;
                case 43: goto L_0x04f5;
                case 44: goto L_0x04e7;
                case 45: goto L_0x04d9;
                case 46: goto L_0x04cb;
                case 47: goto L_0x04bd;
                case 48: goto L_0x04af;
                case 49: goto L_0x049f;
                case 50: goto L_0x048f;
                case 51: goto L_0x0481;
                case 52: goto L_0x0474;
                case 53: goto L_0x0464;
                case 54: goto L_0x0454;
                case 55: goto L_0x0444;
                case 56: goto L_0x0436;
                case 57: goto L_0x0429;
                case 58: goto L_0x041c;
                case 59: goto L_0x040c;
                case 60: goto L_0x0404;
                case 61: goto L_0x03fc;
                case 62: goto L_0x03f0;
                case 63: goto L_0x03e4;
                case 64: goto L_0x03dc;
                case 65: goto L_0x03d4;
                case 66: goto L_0x03c8;
                case 67: goto L_0x03bc;
                case 68: goto L_0x03b4;
                default: goto L_0x03b2;
            }
        L_0x03b2:
            goto L_0x0628
        L_0x03b4:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x0634
        L_0x03bc:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            long r8 = m20136R(r1, r8)
            goto L_0x064b
        L_0x03c8:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = m20134P(r1, r8)
            goto L_0x0658
        L_0x03d4:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x0661
        L_0x03dc:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x066c
        L_0x03e4:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = m20134P(r1, r8)
            goto L_0x067b
        L_0x03f0:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = m20134P(r1, r8)
            goto L_0x0688
        L_0x03fc:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x0691
        L_0x0404:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x06a0
        L_0x040c:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5
            if (r8 == 0) goto L_0x06bb
            goto L_0x06ba
        L_0x041c:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r4 = 1
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19674H(r15, r4)
            goto L_0x0671
        L_0x0429:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r4 = 0
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19707y0(r15, r4)
            goto L_0x0671
        L_0x0436:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r8 = 0
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19700r0(r15, r8)
            goto L_0x0627
        L_0x0444:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = m20134P(r1, r8)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19695m0(r15, r4)
            goto L_0x0627
        L_0x0454:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            long r8 = m20136R(r1, r8)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19692i0(r15, r8)
            goto L_0x0627
        L_0x0464:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            long r8 = m20136R(r1, r8)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19685c0(r15, r8)
            goto L_0x0627
        L_0x0474:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r4 = 0
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19665C(r15, r4)
            goto L_0x0671
        L_0x0481:
            boolean r4 = r0.m20120B(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r8 = 0
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19663B(r15, r8)
            goto L_0x0627
        L_0x048f:
            g.d.a.c.f.f.d8 r4 = r0.f14402o
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m20125G(r3)
            int r4 = r4.mo14045i(r15, r8, r9)
            goto L_0x0627
        L_0x049f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r3)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18871s(r15, r4, r8)
            goto L_0x0627
        L_0x04af:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18823A(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04bd:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18838P(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04cb:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18844V(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04d9:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18841S(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04e7:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18827E(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04f5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18835M(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0503:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18847Y(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0510:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18841S(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x051d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18844V(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x052a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18831I(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0537:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18873u(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0544:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18857e(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0551:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18841S(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x055e:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18844V(r4)
            if (r4 <= 0) goto L_0x0628
        L_0x056a:
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19691h0(r15)
            int r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19698p0(r4)
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0671
        L_0x0576:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18878z(r15, r4, r10)
            goto L_0x0617
        L_0x0583:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18837O(r15, r4, r10)
            goto L_0x0617
        L_0x0590:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18826D(r15, r4, r10)
            goto L_0x0617
        L_0x059d:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18834L(r15, r4, r10)
            goto L_0x0627
        L_0x05aa:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18870r(r15, r4)
            goto L_0x0627
        L_0x05b6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r3)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18853c(r15, r4, r8)
            goto L_0x0627
        L_0x05c5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18851b(r15, r4)
            goto L_0x0627
        L_0x05d0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18846X(r15, r4, r10)
            goto L_0x0617
        L_0x05dc:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18843U(r15, r4, r10)
            goto L_0x0617
        L_0x05e8:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18830H(r15, r4, r10)
            goto L_0x0617
        L_0x05f4:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18872t(r15, r4, r10)
            goto L_0x0617
        L_0x0600:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18855d(r15, r4, r10)
            goto L_0x0617
        L_0x060c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18840R(r15, r4, r10)
        L_0x0617:
            int r5 = r5 + r4
            r4 = 1
        L_0x0619:
            r7 = 0
            goto L_0x062c
        L_0x061c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18843U(r15, r4, r10)
        L_0x0627:
            int r5 = r5 + r4
        L_0x0628:
            r4 = 1
        L_0x0629:
            r7 = 0
            r10 = 0
        L_0x062c:
            r13 = 0
            goto L_0x073b
        L_0x0630:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x0634:
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.d.a.c.f.f.l8 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4655l8) r4
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r3)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19681V(r15, r4, r8)
            goto L_0x0627
        L_0x0643:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            long r8 = r2.getLong(r1, r8)
        L_0x064b:
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19696n0(r15, r8)
            goto L_0x0627
        L_0x0650:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            int r4 = r2.getInt(r1, r8)
        L_0x0658:
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19703u0(r15, r4)
            goto L_0x0627
        L_0x065d:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x0661:
            r8 = 0
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19704v0(r15, r8)
            goto L_0x0627
        L_0x0668:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x066c:
            r4 = 0
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19664B0(r15, r4)
        L_0x0671:
            int r5 = r5 + r8
            goto L_0x0628
        L_0x0673:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            int r4 = r2.getInt(r1, r8)
        L_0x067b:
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19668D0(r15, r4)
            goto L_0x0627
        L_0x0680:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            int r4 = r2.getInt(r1, r8)
        L_0x0688:
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19699q0(r15, r4)
            goto L_0x0627
        L_0x068d:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x0691:
            java.lang.Object r4 = r2.getObject(r1, r8)
        L_0x0695:
            g.d.a.c.f.f.s5 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19680U(r15, r4)
            goto L_0x0627
        L_0x069c:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x06a0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.d.a.c.f.f.a9 r8 = r0.m20147r(r3)
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18849a(r15, r4, r8)
            goto L_0x0627
        L_0x06ae:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5
            if (r8 == 0) goto L_0x06bb
        L_0x06ba:
            goto L_0x0695
        L_0x06bb:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19673G(r15, r4)
            goto L_0x0627
        L_0x06c3:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            r4 = 1
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19674H(r15, r4)
            int r5 = r5 + r8
            goto L_0x0629
        L_0x06cf:
            r4 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x0619
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19707y0(r15, r10)
            int r5 = r5 + r8
            goto L_0x0619
        L_0x06dc:
            r4 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x0728
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19700r0(r15, r13)
            goto L_0x0718
        L_0x06e9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0728
            int r8 = r2.getInt(r1, r8)
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19695m0(r15, r8)
            goto L_0x0718
        L_0x06f9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0728
            long r8 = r2.getLong(r1, r8)
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19692i0(r15, r8)
            goto L_0x0718
        L_0x0709:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0728
            long r8 = r2.getLong(r1, r8)
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19685c0(r15, r8)
        L_0x0718:
            int r5 = r5 + r8
            goto L_0x0728
        L_0x071a:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0728
            r8 = 0
            int r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19665C(r15, r8)
            int r5 = r5 + r9
        L_0x0728:
            r7 = 0
            goto L_0x073b
        L_0x072b:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            if (r9 == 0) goto L_0x0728
            r7 = 0
            int r11 = p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.m19663B(r15, r7)
            int r5 = r5 + r11
        L_0x073b:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x0380
        L_0x0746:
            r10 = 0
            g.d.a.c.f.f.s9<?, ?> r2 = r0.f14400m
            int r2 = m20141k(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f14393f
            if (r2 == 0) goto L_0x07a0
            g.d.a.c.f.f.o6<?> r2 = r0.f14401n
            g.d.a.c.f.f.s6 r1 = r2.mo14499b(r1)
            r11 = 0
        L_0x0759:
            g.d.a.c.f.f.f9<T, java.lang.Object> r2 = r1.f14477a
            int r2 = r2.mo14129j()
            if (r11 >= r2) goto L_0x0779
            g.d.a.c.f.f.f9<T, java.lang.Object> r2 = r1.f14477a
            java.util.Map$Entry r2 = r2.mo14126h(r11)
            java.lang.Object r3 = r2.getKey()
            g.d.a.c.f.f.u6 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4808u6) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4774s6.m20351a(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0759
        L_0x0779:
            g.d.a.c.f.f.f9<T, java.lang.Object> r1 = r1.f14477a
            java.lang.Iterable r1 = r1.mo14130m()
            java.util.Iterator r1 = r1.iterator()
        L_0x0783:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x079f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            g.d.a.c.f.f.u6 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4808u6) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4774s6.m20351a(r3, r2)
            int r10 = r10 + r2
            goto L_0x0783
        L_0x079f:
            int r5 = r5 + r10
        L_0x07a0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo13800f(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c6, code lost:
        if (r0 == r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x030d, code lost:
        if (r0 == r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032e, code lost:
        if (r0 == r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0330, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        r1 = r11.f14446c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        r7.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b4, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c8, code lost:
        r1 = r11.f14444a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021e, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0223, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13801g(T r31, byte[] r32, int r33, int r34, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f14394g
            if (r0 == 0) goto L_0x0375
            sun.misc.Unsafe r9 = f14387q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x0358
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20037d(r0, r12, r3, r11)
            int r3 = r11.f14444a
            r4 = r0
            r17 = r3
            goto L_0x0033
        L_0x0030:
            r17 = r0
            r4 = r3
        L_0x0033:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.m20140j(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.m20139U(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r18 = 0
        L_0x004e:
            r20 = -1
            goto L_0x0332
        L_0x0052:
            int[] r0 = r15.f14388a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x022c
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r18
        L_0x0094:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0207;
                case 1: goto L_0x01f0;
                case 2: goto L_0x01ce;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01b7;
                case 5: goto L_0x0195;
                case 6: goto L_0x017e;
                case 7: goto L_0x015e;
                case 8: goto L_0x0141;
                case 9: goto L_0x011c;
                case 10: goto L_0x0104;
                case 11: goto L_0x01b7;
                case 12: goto L_0x00f2;
                case 13: goto L_0x017e;
                case 14: goto L_0x0195;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x0223
        L_0x00a5:
            if (r3 != 0) goto L_0x00cc
            int r10 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r12, r4, r11)
            long r0 = r11.f14445b
            long r17 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19226a(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x0276
        L_0x00cc:
            r25 = r33
            r8 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0223
        L_0x00da:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01b4
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r12, r4, r11)
            int r1 = r11.f14444a
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19228c(r1)
            goto L_0x01ca
        L_0x00f2:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01b4
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r12, r4, r11)
            goto L_0x01c8
        L_0x0104:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20050q(r12, r4, r11)
        L_0x0115:
            java.lang.Object r1 = r11.f14446c
        L_0x0117:
            r7.putObject(r14, r8, r1)
            goto L_0x021e
        L_0x011c:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            g.d.a.c.f.f.a9 r0 = r15.m20147r(r10)
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20040g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x013a
            java.lang.Object r1 = r11.f14446c
            goto L_0x0117
        L_0x013a:
            java.lang.Object r2 = r11.f14446c
            java.lang.Object r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18817e(r1, r2)
            goto L_0x0117
        L_0x0141:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0159
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20047n(r12, r4, r11)
            goto L_0x0115
        L_0x0159:
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20049p(r12, r4, r11)
            goto L_0x0115
        L_0x015e:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01b4
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r12, r4, r11)
            long r1 = r11.f14445b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0178
            r1 = 1
            goto L_0x0179
        L_0x0178:
            r1 = 0
        L_0x0179:
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20673k(r14, r8, r1)
            goto L_0x021e
        L_0x017e:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x021e
        L_0x0195:
            r25 = r33
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            long r17 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x021e
        L_0x01b4:
            r5 = r4
            goto L_0x0223
        L_0x01b7:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0223
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r12, r5, r11)
        L_0x01c8:
            int r1 = r11.f14444a
        L_0x01ca:
            r7.putInt(r14, r8, r1)
            goto L_0x021e
        L_0x01ce:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0223
            int r17 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r12, r5, r11)
            long r4 = r11.f14445b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x0276
        L_0x01f0:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0223
            float r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r12, r5)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20669g(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x021e
        L_0x0207:
            r25 = r33
            r5 = r4
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0223
            double r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r12, r5)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20668f(r14, r8, r0)
            int r0 = r5 + 8
        L_0x021e:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x0276
        L_0x0223:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            goto L_0x004e
        L_0x022c:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x0289
            r0 = 2
            if (r3 != r0) goto L_0x027c
            java.lang.Object r0 = r7.getObject(r14, r8)
            g.d.a.c.f.f.h7 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4581h7) r0
            boolean r1 = r0.mo14223a()
            if (r1 != 0) goto L_0x025c
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0253
            r1 = 10
            goto L_0x0255
        L_0x0253:
            int r1 = r1 << 1
        L_0x0255:
            g.d.a.c.f.f.h7 r0 = r0.mo13882e(r1)
            r7.putObject(r14, r8, r0)
        L_0x025c:
            r8 = r0
            g.d.a.c.f.f.a9 r0 = r15.m20147r(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20038e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
        L_0x0276:
            r7 = r20
            r1 = r25
            goto L_0x0352
        L_0x027c:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r20 = -1
            goto L_0x0310
        L_0x0289:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02de
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r19 = r10
            r29 = r20
            r20 = -1
            r9 = r21
            r11 = r19
            r12 = r23
            r14 = r35
            int r0 = r0.m20143m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02ca
            goto L_0x0330
        L_0x02ca:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0350
        L_0x02de:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r19 = r10
            r28 = r20
            r1 = r21
            r20 = -1
            r0 = 50
            r9 = r19
            r7 = r33
            if (r9 != r0) goto L_0x0316
            r0 = 2
            if (r7 != r0) goto L_0x0310
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.m20144n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02ca
            goto L_0x0330
        L_0x0310:
            r2 = r15
        L_0x0311:
            r6 = r27
            r7 = r28
            goto L_0x0332
        L_0x0316:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.m20142l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02ca
        L_0x0330:
            r2 = r0
            goto L_0x0311
        L_0x0332:
            g.d.a.c.f.f.v9 r4 = m20137S(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20036c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
        L_0x0350:
            r9 = r29
        L_0x0352:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001e
        L_0x0358:
            r27 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x036b
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x036b:
            r4 = r34
            if (r0 != r4) goto L_0x0370
            return
        L_0x0370:
            g.d.a.c.f.f.k7 r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19827e()
            throw r0
        L_0x0375:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo14536o(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo13801g(java.lang.Object, byte[], int, int, g.d.a.c.f.f.r5):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0345, code lost:
        r14.mo14395I(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0356, code lost:
        r14.mo14409h(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0367, code lost:
        r14.mo14411j(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0378, code lost:
        r14.mo14397K(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0389, code lost:
        r14.mo14413l(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039a, code lost:
        r14.mo14393G(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a5, code lost:
        r14.mo14417p(r9, (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r7 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b8, code lost:
        r14.mo14401O(r9, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r7 & 1048575)), m20147r(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cd, code lost:
        m20152w(r9, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r7 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e4, code lost:
        r14.mo14405d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f5, code lost:
        r14.mo14427z(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        r14.mo14388B(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0415, code lost:
        r14.mo14420s(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0425, code lost:
        r14.mo14421t(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0435, code lost:
        r14.mo14398L(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0445, code lost:
        r14.mo14400N(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0455, code lost:
        r14.mo14399M(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0783, code lost:
        r14.mo14412k(r10, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r8 & 1048575)), m20147r(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079e, code lost:
        r14.mo14395I(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07af, code lost:
        r14.mo14409h(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07c0, code lost:
        r14.mo14411j(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07d1, code lost:
        r14.mo14397K(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07e2, code lost:
        r14.mo14413l(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07f3, code lost:
        r14.mo14393G(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07fe, code lost:
        r14.mo14417p(r10, (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0811, code lost:
        r14.mo14401O(r10, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r8 & 1048575)), m20147r(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0826, code lost:
        m20152w(r10, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r8 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x083d, code lost:
        r14.mo14405d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x084e, code lost:
        r14.mo14427z(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x085e, code lost:
        r14.mo14388B(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x086e, code lost:
        r14.mo14420s(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087e, code lost:
        r14.mo14421t(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x088e, code lost:
        r14.mo14398L(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089e, code lost:
        r14.mo14400N(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ae, code lost:
        r14.mo14399M(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032a, code lost:
        r14.mo14412k(r9, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, (long) (r7 & 1048575)), m20147r(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13802h(T r13, p148g.p189d.p190a.p232c.p241f.p247f.C4745qa r14) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r14.mo14402a()
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4900e.f14691l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x046b
            g.d.a.c.f.f.s9<?, ?> r0 = r12.f14400m
            m20153x(r0, r13, r14)
            boolean r0 = r12.f14393f
            if (r0 == 0) goto L_0x0032
            g.d.a.c.f.f.o6<?> r0 = r12.f14401n
            g.d.a.c.f.f.s6 r0 = r0.mo14499b(r13)
            g.d.a.c.f.f.f9<T, java.lang.Object> r1 = r0.f14477a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo14615q()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.f14388a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x0462
            int r7 = r12.m20133O(r1)
            int[] r8 = r12.f14388a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x045c
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0449;
                case 1: goto L_0x0439;
                case 2: goto L_0x0429;
                case 3: goto L_0x0419;
                case 4: goto L_0x0409;
                case 5: goto L_0x03f9;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03d8;
                case 8: goto L_0x03c7;
                case 9: goto L_0x03b2;
                case 10: goto L_0x039f;
                case 11: goto L_0x038e;
                case 12: goto L_0x037d;
                case 13: goto L_0x036c;
                case 14: goto L_0x035b;
                case 15: goto L_0x034a;
                case 16: goto L_0x0339;
                case 17: goto L_0x0324;
                case 18: goto L_0x0315;
                case 19: goto L_0x0306;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02e8;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02ca;
                case 24: goto L_0x02bb;
                case 25: goto L_0x02ac;
                case 26: goto L_0x029d;
                case 27: goto L_0x028a;
                case 28: goto L_0x027b;
                case 29: goto L_0x026c;
                case 30: goto L_0x025d;
                case 31: goto L_0x024e;
                case 32: goto L_0x023f;
                case 33: goto L_0x0230;
                case 34: goto L_0x0221;
                case 35: goto L_0x0212;
                case 36: goto L_0x0203;
                case 37: goto L_0x01f4;
                case 38: goto L_0x01e5;
                case 39: goto L_0x01d6;
                case 40: goto L_0x01c7;
                case 41: goto L_0x01b8;
                case 42: goto L_0x01a9;
                case 43: goto L_0x019a;
                case 44: goto L_0x018b;
                case 45: goto L_0x017c;
                case 46: goto L_0x016d;
                case 47: goto L_0x015e;
                case 48: goto L_0x014f;
                case 49: goto L_0x013c;
                case 50: goto L_0x0131;
                case 51: goto L_0x0123;
                case 52: goto L_0x0115;
                case 53: goto L_0x0107;
                case 54: goto L_0x00f9;
                case 55: goto L_0x00eb;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00b9;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a9;
                case 62: goto L_0x009b;
                case 63: goto L_0x008d;
                case 64: goto L_0x007f;
                case 65: goto L_0x0071;
                case 66: goto L_0x0063;
                case 67: goto L_0x0055;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0458
        L_0x004d:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x032a
        L_0x0055:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m20136R(r13, r7)
            goto L_0x0345
        L_0x0063:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m20134P(r13, r7)
            goto L_0x0356
        L_0x0071:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m20136R(r13, r7)
            goto L_0x0367
        L_0x007f:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m20134P(r13, r7)
            goto L_0x0378
        L_0x008d:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m20134P(r13, r7)
            goto L_0x0389
        L_0x009b:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m20134P(r13, r7)
            goto L_0x039a
        L_0x00a9:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03a5
        L_0x00b1:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03b8
        L_0x00b9:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03cd
        L_0x00c1:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = m20138T(r13, r7)
            goto L_0x03e4
        L_0x00cf:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m20134P(r13, r7)
            goto L_0x03f5
        L_0x00dd:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m20136R(r13, r7)
            goto L_0x0405
        L_0x00eb:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m20134P(r13, r7)
            goto L_0x0415
        L_0x00f9:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m20136R(r13, r7)
            goto L_0x0425
        L_0x0107:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m20136R(r13, r7)
            goto L_0x0435
        L_0x0115:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = m20130L(r13, r7)
            goto L_0x0445
        L_0x0123:
            boolean r8 = r12.m20120B(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = m20123E(r13, r7)
            goto L_0x0455
        L_0x0131:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r7)
            r12.m20154y(r14, r9, r7, r1)
            goto L_0x0458
        L_0x013c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            g.d.a.c.f.f.a9 r9 = r12.m20147r(r1)
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18876x(r8, r7, r14, r9)
            goto L_0x0458
        L_0x014f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18833K(r8, r7, r14, r4)
            goto L_0x0458
        L_0x015e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18848Z(r8, r7, r14, r4)
            goto L_0x0458
        L_0x016d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18839Q(r8, r7, r14, r4)
            goto L_0x0458
        L_0x017c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18852b0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x018b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18854c0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x019a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18845W(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01a9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18856d0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01b8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18850a0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01c7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18836N(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01d6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18842T(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01e5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18829G(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01f4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18825C(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0203:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18877y(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0212:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18864l(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0221:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18833K(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0230:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18848Z(r8, r7, r14, r5)
            goto L_0x0458
        L_0x023f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18839Q(r8, r7, r14, r5)
            goto L_0x0458
        L_0x024e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18852b0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x025d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18854c0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x026c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18845W(r8, r7, r14, r5)
            goto L_0x0458
        L_0x027b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18875w(r8, r7, r14)
            goto L_0x0458
        L_0x028a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            g.d.a.c.f.f.a9 r9 = r12.m20147r(r1)
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18863k(r8, r7, r14, r9)
            goto L_0x0458
        L_0x029d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18862j(r8, r7, r14)
            goto L_0x0458
        L_0x02ac:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18856d0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02bb:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18850a0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02ca:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18836N(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02d9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18842T(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02e8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18829G(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02f7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18825C(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0306:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18877y(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0315:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18864l(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0324:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x032a:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r7)
            g.d.a.c.f.f.a9 r8 = r12.m20147r(r1)
            r14.mo14412k(r9, r7, r8)
            goto L_0x0458
        L_0x0339:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r7)
        L_0x0345:
            r14.mo14395I(r9, r7)
            goto L_0x0458
        L_0x034a:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r7)
        L_0x0356:
            r14.mo14409h(r9, r7)
            goto L_0x0458
        L_0x035b:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r7)
        L_0x0367:
            r14.mo14411j(r9, r7)
            goto L_0x0458
        L_0x036c:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r7)
        L_0x0378:
            r14.mo14397K(r9, r7)
            goto L_0x0458
        L_0x037d:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r7)
        L_0x0389:
            r14.mo14413l(r9, r7)
            goto L_0x0458
        L_0x038e:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r7)
        L_0x039a:
            r14.mo14393G(r9, r7)
            goto L_0x0458
        L_0x039f:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03a5:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r7)
            g.d.a.c.f.f.s5 r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r7
            r14.mo14417p(r9, r7)
            goto L_0x0458
        L_0x03b2:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03b8:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r7)
            g.d.a.c.f.f.a9 r8 = r12.m20147r(r1)
            r14.mo14401O(r9, r7, r8)
            goto L_0x0458
        L_0x03c7:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03cd:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r7)
            m20152w(r9, r7, r14)
            goto L_0x0458
        L_0x03d8:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r13, r7)
        L_0x03e4:
            r14.mo14405d(r9, r7)
            goto L_0x0458
        L_0x03e9:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r7)
        L_0x03f5:
            r14.mo14427z(r9, r7)
            goto L_0x0458
        L_0x03f9:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r7)
        L_0x0405:
            r14.mo14388B(r9, r7)
            goto L_0x0458
        L_0x0409:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r7)
        L_0x0415:
            r14.mo14420s(r9, r7)
            goto L_0x0458
        L_0x0419:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r7)
        L_0x0425:
            r14.mo14421t(r9, r7)
            goto L_0x0458
        L_0x0429:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r7)
        L_0x0435:
            r14.mo14398L(r9, r7)
            goto L_0x0458
        L_0x0439:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r13, r7)
        L_0x0445:
            r14.mo14400N(r9, r7)
            goto L_0x0458
        L_0x0449:
            boolean r8 = r12.m20119A(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r13, r7)
        L_0x0455:
            r14.mo14399M(r9, r7)
        L_0x0458:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x045c:
            g.d.a.c.f.f.o6<?> r13 = r12.f14401n
            r13.mo14498a(r0)
            throw r3
        L_0x0462:
            if (r0 != 0) goto L_0x0465
            return
        L_0x0465:
            g.d.a.c.f.f.o6<?> r13 = r12.f14401n
            r13.mo14501d(r14, r0)
            throw r3
        L_0x046b:
            boolean r0 = r12.f14394g
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r12.f14393f
            if (r0 == 0) goto L_0x048c
            g.d.a.c.f.f.o6<?> r0 = r12.f14401n
            g.d.a.c.f.f.s6 r0 = r0.mo14499b(r13)
            g.d.a.c.f.f.f9<T, java.lang.Object> r1 = r0.f14477a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x048c
            java.util.Iterator r0 = r0.mo14614p()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x048d
        L_0x048c:
            r0 = r3
        L_0x048d:
            int[] r1 = r12.f14388a
            int r1 = r1.length
            r7 = 0
        L_0x0491:
            if (r7 >= r1) goto L_0x08bb
            int r8 = r12.m20133O(r7)
            int[] r9 = r12.f14388a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x08b5
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x08a2;
                case 1: goto L_0x0892;
                case 2: goto L_0x0882;
                case 3: goto L_0x0872;
                case 4: goto L_0x0862;
                case 5: goto L_0x0852;
                case 6: goto L_0x0842;
                case 7: goto L_0x0831;
                case 8: goto L_0x0820;
                case 9: goto L_0x080b;
                case 10: goto L_0x07f8;
                case 11: goto L_0x07e7;
                case 12: goto L_0x07d6;
                case 13: goto L_0x07c5;
                case 14: goto L_0x07b4;
                case 15: goto L_0x07a3;
                case 16: goto L_0x0792;
                case 17: goto L_0x077d;
                case 18: goto L_0x076e;
                case 19: goto L_0x075f;
                case 20: goto L_0x0750;
                case 21: goto L_0x0741;
                case 22: goto L_0x0732;
                case 23: goto L_0x0723;
                case 24: goto L_0x0714;
                case 25: goto L_0x0705;
                case 26: goto L_0x06f6;
                case 27: goto L_0x06e3;
                case 28: goto L_0x06d4;
                case 29: goto L_0x06c5;
                case 30: goto L_0x06b6;
                case 31: goto L_0x06a7;
                case 32: goto L_0x0698;
                case 33: goto L_0x0689;
                case 34: goto L_0x067a;
                case 35: goto L_0x066b;
                case 36: goto L_0x065c;
                case 37: goto L_0x064d;
                case 38: goto L_0x063e;
                case 39: goto L_0x062f;
                case 40: goto L_0x0620;
                case 41: goto L_0x0611;
                case 42: goto L_0x0602;
                case 43: goto L_0x05f3;
                case 44: goto L_0x05e4;
                case 45: goto L_0x05d5;
                case 46: goto L_0x05c6;
                case 47: goto L_0x05b7;
                case 48: goto L_0x05a8;
                case 49: goto L_0x0595;
                case 50: goto L_0x058a;
                case 51: goto L_0x057c;
                case 52: goto L_0x056e;
                case 53: goto L_0x0560;
                case 54: goto L_0x0552;
                case 55: goto L_0x0544;
                case 56: goto L_0x0536;
                case 57: goto L_0x0528;
                case 58: goto L_0x051a;
                case 59: goto L_0x0512;
                case 60: goto L_0x050a;
                case 61: goto L_0x0502;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e6;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04ca;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ae;
                case 68: goto L_0x04a6;
                default: goto L_0x04a4;
            }
        L_0x04a4:
            goto L_0x08b1
        L_0x04a6:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0783
        L_0x04ae:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m20136R(r13, r8)
            goto L_0x079e
        L_0x04bc:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m20134P(r13, r8)
            goto L_0x07af
        L_0x04ca:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m20136R(r13, r8)
            goto L_0x07c0
        L_0x04d8:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m20134P(r13, r8)
            goto L_0x07d1
        L_0x04e6:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m20134P(r13, r8)
            goto L_0x07e2
        L_0x04f4:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m20134P(r13, r8)
            goto L_0x07f3
        L_0x0502:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x07fe
        L_0x050a:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0811
        L_0x0512:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0826
        L_0x051a:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = m20138T(r13, r8)
            goto L_0x083d
        L_0x0528:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m20134P(r13, r8)
            goto L_0x084e
        L_0x0536:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m20136R(r13, r8)
            goto L_0x085e
        L_0x0544:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m20134P(r13, r8)
            goto L_0x086e
        L_0x0552:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m20136R(r13, r8)
            goto L_0x087e
        L_0x0560:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m20136R(r13, r8)
            goto L_0x088e
        L_0x056e:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = m20130L(r13, r8)
            goto L_0x089e
        L_0x057c:
            boolean r9 = r12.m20120B(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = m20123E(r13, r8)
            goto L_0x08ae
        L_0x058a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r8)
            r12.m20154y(r14, r10, r8, r7)
            goto L_0x08b1
        L_0x0595:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            g.d.a.c.f.f.a9 r10 = r12.m20147r(r7)
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18876x(r9, r8, r14, r10)
            goto L_0x08b1
        L_0x05a8:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18833K(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05b7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18848Z(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05c6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18839Q(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05d5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18852b0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05e4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18854c0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05f3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18845W(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0602:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18856d0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0611:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18850a0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0620:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18836N(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x062f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18842T(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x063e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18829G(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x064d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18825C(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x065c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18877y(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x066b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18864l(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x067a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18833K(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0689:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18848Z(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0698:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18839Q(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06a7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18852b0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06b6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18854c0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06c5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18845W(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06d4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18875w(r9, r8, r14)
            goto L_0x08b1
        L_0x06e3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            g.d.a.c.f.f.a9 r10 = r12.m20147r(r7)
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18863k(r9, r8, r14, r10)
            goto L_0x08b1
        L_0x06f6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18862j(r9, r8, r14)
            goto L_0x08b1
        L_0x0705:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18856d0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0714:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18850a0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0723:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18836N(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0732:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18842T(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0741:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18829G(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0750:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18825C(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x075f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18877y(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x076e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18864l(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x077d:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0783:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r8)
            g.d.a.c.f.f.a9 r9 = r12.m20147r(r7)
            r14.mo14412k(r10, r8, r9)
            goto L_0x08b1
        L_0x0792:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r8)
        L_0x079e:
            r14.mo14395I(r10, r8)
            goto L_0x08b1
        L_0x07a3:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r8)
        L_0x07af:
            r14.mo14409h(r10, r8)
            goto L_0x08b1
        L_0x07b4:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r8)
        L_0x07c0:
            r14.mo14411j(r10, r8)
            goto L_0x08b1
        L_0x07c5:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r8)
        L_0x07d1:
            r14.mo14397K(r10, r8)
            goto L_0x08b1
        L_0x07d6:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r8)
        L_0x07e2:
            r14.mo14413l(r10, r8)
            goto L_0x08b1
        L_0x07e7:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r8)
        L_0x07f3:
            r14.mo14393G(r10, r8)
            goto L_0x08b1
        L_0x07f8:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x07fe:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r8)
            g.d.a.c.f.f.s5 r8 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r8
            r14.mo14417p(r10, r8)
            goto L_0x08b1
        L_0x080b:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0811:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r8)
            g.d.a.c.f.f.a9 r9 = r12.m20147r(r7)
            r14.mo14401O(r10, r8, r9)
            goto L_0x08b1
        L_0x0820:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0826:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r13, r8)
            m20152w(r10, r8, r14)
            goto L_0x08b1
        L_0x0831:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r13, r8)
        L_0x083d:
            r14.mo14405d(r10, r8)
            goto L_0x08b1
        L_0x0842:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r8)
        L_0x084e:
            r14.mo14427z(r10, r8)
            goto L_0x08b1
        L_0x0852:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r8)
        L_0x085e:
            r14.mo14388B(r10, r8)
            goto L_0x08b1
        L_0x0862:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r13, r8)
        L_0x086e:
            r14.mo14420s(r10, r8)
            goto L_0x08b1
        L_0x0872:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r8)
        L_0x087e:
            r14.mo14421t(r10, r8)
            goto L_0x08b1
        L_0x0882:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r13, r8)
        L_0x088e:
            r14.mo14398L(r10, r8)
            goto L_0x08b1
        L_0x0892:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r13, r8)
        L_0x089e:
            r14.mo14400N(r10, r8)
            goto L_0x08b1
        L_0x08a2:
            boolean r9 = r12.m20119A(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r13, r8)
        L_0x08ae:
            r14.mo14399M(r10, r8)
        L_0x08b1:
            int r7 = r7 + 3
            goto L_0x0491
        L_0x08b5:
            g.d.a.c.f.f.o6<?> r13 = r12.f14401n
            r13.mo14498a(r0)
            throw r3
        L_0x08bb:
            if (r0 != 0) goto L_0x08c3
            g.d.a.c.f.f.s9<?, ?> r0 = r12.f14400m
            m20153x(r0, r13, r14)
            return
        L_0x08c3:
            g.d.a.c.f.f.o6<?> r13 = r12.f14401n
            r13.mo14501d(r14, r0)
            throw r3
        L_0x08c9:
            r12.m20128J(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo13802h(java.lang.Object, g.d.a.c.f.f.qa):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20672j(r7, r2, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r8, r2));
        m20127I(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20672j(r7, r2, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20670h(r7, r2, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20671i(r7, r2, p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        m20126H(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13803i(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0101
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f14388a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m20133O(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f14388a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m20120B(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m20129K(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m20120B(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20672j(r7, r2, r1)
            r6.m20127I(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            g.d.a.c.f.f.d8 r1 = r6.f14402o
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18866n(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            g.d.a.c.f.f.u7 r1 = r6.f14399l
            r1.mo14676b(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m20155z(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20653F(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20672j(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20685w(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20673k(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20664b(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20670h(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20677o(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20671i(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20686x(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20669g(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m20119A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20650C(r8, r2)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20668f(r7, r2, r4)
        L_0x00eb:
            r6.m20126H(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x00f2:
            g.d.a.c.f.f.s9<?, ?> r0 = r6.f14400m
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18867o(r0, r7, r8)
            boolean r0 = r6.f14393f
            if (r0 == 0) goto L_0x0100
            g.d.a.c.f.f.o6<?> r0 = r6.f14401n
            p148g.p189d.p190a.p232c.p241f.p247f.C4472b9.m18865m(r0, r7, r8)
        L_0x0100:
            return
        L_0x0101:
            r7 = 0
            goto L_0x0104
        L_0x0103:
            throw r7
        L_0x0104:
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo13803i(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03a4, code lost:
        if (r0 == r15) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e7, code lost:
        if (r0 == r15) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f5, code lost:
        r10.putObject(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0243, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0247, code lost:
        r3 = r8;
        r1 = r9;
        r9 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028d, code lost:
        r10.putInt(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b2, code lost:
        r0.putLong(r1, r2, r4);
        r5 = r6 | r22;
        r6 = r30;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f3, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f7, code lost:
        r3 = r8;
        r1 = r9;
        r2 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fb, code lost:
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ff, code lost:
        r7 = r32;
        r2 = r3;
        r22 = r6;
        r26 = r10;
        r17 = r11;
        r6 = r30;
        r30 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14536o(T r28, byte[] r29, int r30, int r31, int r32, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = f14387q
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x04b4
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20037d(r0, r12, r3, r9)
            int r3 = r9.f14444a
            r4 = r3
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.m20140j(r0, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.m20139U(r0)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004f
            r30 = r0
            r2 = r3
            r8 = r4
            r22 = r5
            r26 = r10
            r7 = r11
            r17 = 0
            r18 = -1
            goto L_0x0411
        L_0x004f:
            int[] r1 = r15.f14388a
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r4
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r8 & r17
            long r12 = (long) r4
            r4 = 17
            r20 = r8
            if (r11 > r4) goto L_0x030e
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r6) goto L_0x0085
            if (r6 == r4) goto L_0x007e
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x007e:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            goto L_0x0086
        L_0x0085:
            r8 = r6
        L_0x0086:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02d7;
                case 1: goto L_0x02bb;
                case 2: goto L_0x0292;
                case 3: goto L_0x0292;
                case 4: goto L_0x0275;
                case 5: goto L_0x024e;
                case 6: goto L_0x0226;
                case 7: goto L_0x01f9;
                case 8: goto L_0x01cf;
                case 9: goto L_0x019c;
                case 10: goto L_0x017e;
                case 11: goto L_0x0275;
                case 12: goto L_0x0143;
                case 13: goto L_0x0226;
                case 14: goto L_0x024e;
                case 15: goto L_0x0125;
                case 16: goto L_0x00f4;
                case 17: goto L_0x009c;
                default: goto L_0x008b;
            }
        L_0x008b:
            r12 = r29
            r13 = r33
            r9 = r0
            r11 = r2
            r30 = r8
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ff
        L_0x009c:
            r5 = 3
            if (r7 != r5) goto L_0x00e2
            int r1 = r0 << 3
            r5 = r1 | 4
            g.d.a.c.f.f.a9 r1 = r15.m20147r(r2)
            r9 = r0
            r0 = r1
            r18 = -1
            r1 = r29
            r11 = r2
            r2 = r3
            r3 = r31
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r5
            r5 = r33
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20039f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            r4 = r33
            if (r1 != 0) goto L_0x00c6
            java.lang.Object r1 = r4.f14446c
            goto L_0x00d0
        L_0x00c6:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r4.f14446c
            java.lang.Object r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18817e(r1, r2)
        L_0x00d0:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r22
            r12 = r29
            r13 = r31
            r3 = r7
            r6 = r8
            r1 = r9
            r2 = r11
            r11 = r32
            r9 = r4
            goto L_0x0019
        L_0x00e2:
            r9 = r0
            r11 = r2
            r7 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r30 = r8
            r8 = r7
            goto L_0x02ff
        L_0x00f4:
            r4 = r33
            r9 = r0
            r11 = r2
            r5 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x011d
            r1 = r12
            r12 = r29
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r12, r3, r4)
            r20 = r1
            long r0 = r4.f14445b
            long r23 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19226a(r0)
            r0 = r10
            r2 = r20
            r1 = r28
            r13 = r4
            r30 = r8
            r8 = r5
            r4 = r23
            goto L_0x02b2
        L_0x011d:
            r12 = r29
            r13 = r4
            r30 = r8
            r8 = r5
            goto L_0x02ff
        L_0x0125:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r12, r3, r13)
            int r1 = r13.f14444a
            int r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4505d6.m19228c(r1)
            goto L_0x028d
        L_0x0143:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r12, r3, r13)
            int r1 = r13.f14444a
            g.d.a.c.f.f.g7 r2 = r15.m20131M(r11)
            if (r2 == 0) goto L_0x028d
            boolean r2 = r2.mo14197e(r1)
            if (r2 == 0) goto L_0x0169
            goto L_0x028d
        L_0x0169:
            g.d.a.c.f.f.v9 r2 = m20137S(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo14684c(r8, r1)
            r5 = r6
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r6 = r30
            goto L_0x02fb
        L_0x017e:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20050q(r12, r3, r13)
            java.lang.Object r1 = r13.f14446c
            r10.putObject(r14, r4, r1)
            goto L_0x02f3
        L_0x019c:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x01cb
            g.d.a.c.f.f.a9 r0 = r15.m20147r(r11)
            r2 = r31
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20040g(r0, r12, r3, r2, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01c0
            java.lang.Object r1 = r13.f14446c
            goto L_0x01f5
        L_0x01c0:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r13.f14446c
            java.lang.Object r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18817e(r1, r3)
            goto L_0x01f5
        L_0x01cb:
            r2 = r31
            goto L_0x02ff
        L_0x01cf:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01ef
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20047n(r12, r3, r13)
            goto L_0x01f3
        L_0x01ef:
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20049p(r12, r3, r13)
        L_0x01f3:
            java.lang.Object r1 = r13.f14446c
        L_0x01f5:
            r10.putObject(r14, r4, r1)
            goto L_0x0243
        L_0x01f9:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r12, r3, r13)
            r3 = r0
            long r0 = r13.f14445b
            r20 = 0
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x021c
            r0 = 1
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20673k(r14, r4, r0)
            r5 = r6 | r22
            r6 = r30
            r0 = r3
            goto L_0x0247
        L_0x0226:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r1) goto L_0x02ff
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20041h(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x0243:
            r5 = r6 | r22
            r6 = r30
        L_0x0247:
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            goto L_0x04b0
        L_0x024e:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            long r20 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20045l(r12, r3)
            r0 = r10
            r1 = r28
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x02f3
        L_0x0275:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r12, r3, r13)
            int r1 = r13.f14444a
        L_0x028d:
            r10.putInt(r14, r4, r1)
            goto L_0x02f3
        L_0x0292:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20044k(r12, r3, r13)
            long r2 = r13.f14445b
            r0 = r10
            r1 = r28
            r20 = r2
            r2 = r4
            r4 = r20
        L_0x02b2:
            r0.putLong(r1, r2, r4)
            r5 = r6 | r22
            r6 = r30
            r0 = r7
            goto L_0x02f7
        L_0x02bb:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r1) goto L_0x02ff
            float r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20048o(r12, r3)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20669g(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x02f3
        L_0x02d7:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            double r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20046m(r12, r3)
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20668f(r14, r4, r0)
            int r0 = r3 + 8
        L_0x02f3:
            r5 = r6 | r22
            r6 = r30
        L_0x02f7:
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
        L_0x02fb:
            r13 = r31
            goto L_0x04b0
        L_0x02ff:
            r7 = r32
            r2 = r3
            r22 = r6
            r26 = r10
            r17 = r11
            r6 = r30
            r30 = r9
            goto L_0x0411
        L_0x030e:
            r4 = r2
            r1 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r9
            r9 = r0
            r0 = 27
            if (r11 != r0) goto L_0x0375
            r0 = 2
            if (r7 != r0) goto L_0x0366
            java.lang.Object r0 = r10.getObject(r14, r1)
            g.d.a.c.f.f.h7 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4581h7) r0
            boolean r7 = r0.mo14223a()
            if (r7 != 0) goto L_0x0340
            int r7 = r0.size()
            if (r7 != 0) goto L_0x0337
            r7 = 10
            goto L_0x0339
        L_0x0337:
            int r7 = r7 << 1
        L_0x0339:
            g.d.a.c.f.f.h7 r0 = r0.mo13882e(r7)
            r10.putObject(r14, r1, r0)
        L_0x0340:
            r7 = r0
            g.d.a.c.f.f.a9 r0 = r15.m20147r(r4)
            r1 = r8
            r2 = r29
            r17 = r4
            r4 = r31
            r22 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20038e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r32
            r3 = r8
            r1 = r9
            r9 = r13
            r2 = r17
            r5 = r22
            r6 = r23
            r13 = r31
            goto L_0x0019
        L_0x0366:
            r17 = r4
            r22 = r5
            r23 = r6
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            goto L_0x03ea
        L_0x0375:
            r17 = r4
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x03c2
            r6 = r20
            long r5 = (long) r6
            r0 = r27
            r24 = r1
            r1 = r28
            r2 = r29
            r4 = r3
            r15 = r4
            r4 = r31
            r20 = r5
            r5 = r8
            r6 = r9
            r19 = r8
            r8 = r17
            r30 = r9
            r26 = r10
            r9 = r20
            r12 = r24
            r14 = r33
            int r0 = r0.m20143m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x03a8
            goto L_0x040d
        L_0x03a8:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r2 = r17
            r3 = r19
            r5 = r22
            r6 = r23
            r10 = r26
            goto L_0x0019
        L_0x03c2:
            r24 = r1
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x03f2
            r0 = 2
            if (r7 != r0) goto L_0x03ea
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r24
            r8 = r33
            int r0 = r0.m20144n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x03a8
            goto L_0x040d
        L_0x03ea:
            r7 = r32
            r2 = r15
        L_0x03ed:
            r8 = r19
            r6 = r23
            goto L_0x0411
        L_0x03f2:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r8 = r6
            r6 = r30
            r9 = r11
            r10 = r24
            r12 = r17
            r13 = r33
            int r0 = r0.m20142l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0498
        L_0x040d:
            r7 = r32
            r2 = r0
            goto L_0x03ed
        L_0x0411:
            if (r8 != r7) goto L_0x0420
            if (r7 != 0) goto L_0x0416
            goto L_0x0420
        L_0x0416:
            r9 = r27
            r12 = r28
            r0 = r2
            r3 = r8
            r5 = r22
            goto L_0x04bd
        L_0x0420:
            r9 = r27
            boolean r0 = r9.f14393f
            if (r0 == 0) goto L_0x0471
            r10 = r33
            g.d.a.c.f.f.m6 r0 = r10.f14447d
            g.d.a.c.f.f.m6 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4673m6.m19962a()
            if (r0 == r1) goto L_0x046c
            g.d.a.c.f.f.l8 r0 = r9.f14392e
            g.d.a.c.f.f.m6 r1 = r10.f14447d
            r11 = r30
            g.d.a.c.f.f.z6$f r0 = r1.mo14456b(r0, r11)
            if (r0 != 0) goto L_0x045c
            g.d.a.c.f.f.v9 r4 = m20137S(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20036c(r0, r1, r2, r3, r4, r5)
            r14 = r28
            r12 = r29
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r2 = r17
            r5 = r22
            r10 = r26
            goto L_0x0495
        L_0x045c:
            r12 = r28
            r0 = r12
            g.d.a.c.f.f.z6$d r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4899d) r0
            r0.mo14820B()
            g.d.a.c.f.f.s6<g.d.a.c.f.f.z6$c> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x046c:
            r12 = r28
            r11 = r30
            goto L_0x0477
        L_0x0471:
            r12 = r28
            r11 = r30
            r10 = r33
        L_0x0477:
            g.d.a.c.f.f.v9 r4 = m20137S(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20036c(r0, r1, r2, r3, r4, r5)
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r2 = r17
            r5 = r22
            r10 = r26
            r12 = r29
        L_0x0495:
            r11 = r7
            goto L_0x0019
        L_0x0498:
            r11 = r30
            r8 = r19
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r9 = r33
            r3 = r8
            r1 = r11
            r2 = r17
            r5 = r22
            r6 = r23
            r10 = r26
        L_0x04b0:
            r11 = r32
            goto L_0x0019
        L_0x04b4:
            r22 = r5
            r23 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x04bd:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x04c8
            long r1 = (long) r6
            r4 = r26
            r4.putInt(r12, r1, r5)
        L_0x04c8:
            r1 = 0
            int r2 = r9.f14396i
        L_0x04cb:
            int r4 = r9.f14397j
            if (r2 >= r4) goto L_0x04de
            int[] r4 = r9.f14395h
            r4 = r4[r2]
            g.d.a.c.f.f.s9<?, ?> r5 = r9.f14400m
            java.lang.Object r1 = r9.m20149t(r12, r4, r1, r5)
            g.d.a.c.f.f.v9 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4827v9) r1
            int r2 = r2 + 1
            goto L_0x04cb
        L_0x04de:
            if (r1 == 0) goto L_0x04e5
            g.d.a.c.f.f.s9<?, ?> r2 = r9.f14400m
            r2.mo14631h(r12, r1)
        L_0x04e5:
            r1 = r31
            if (r7 != 0) goto L_0x04f1
            if (r0 != r1) goto L_0x04ec
            goto L_0x04f5
        L_0x04ec:
            g.d.a.c.f.f.k7 r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19827e()
            throw r0
        L_0x04f1:
            if (r0 > r1) goto L_0x04f6
            if (r3 != r7) goto L_0x04f6
        L_0x04f5:
            return r0
        L_0x04f6:
            g.d.a.c.f.f.k7 r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19827e()
            goto L_0x04fc
        L_0x04fb:
            throw r0
        L_0x04fc:
            goto L_0x04fb
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4727p8.mo14536o(java.lang.Object, byte[], int, int, int, g.d.a.c.f.f.r5):int");
    }
}
