package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g.d.a.c.f.f.j6 */
public abstract class C4615j6 extends C4790t5 {

    /* renamed from: b */
    private static final Logger f14194b = Logger.getLogger(C4615j6.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f14195c = C4877y9.m20675m();

    /* renamed from: a */
    C4653l6 f14196a;

    /* renamed from: g.d.a.c.f.f.j6$a */
    public static class C4616a extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C4616a(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4615j6.C4616a.<init>(java.lang.String, java.lang.Throwable):void");
        }

        C4616a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: g.d.a.c.f.f.j6$b */
    static class C4617b extends C4615j6 {

        /* renamed from: d */
        private final byte[] f14197d;

        /* renamed from: e */
        private final int f14198e;

        /* renamed from: f */
        private int f14199f;

        C4617b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                this.f14197d = bArr;
                this.f14199f = 0;
                this.f14198e = i2;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
        }

        /* renamed from: G0 */
        private final void m19744G0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f14197d, this.f14199f, i2);
                this.f14199f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C4616a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14199f), Integer.valueOf(this.f14198e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: O */
        public final void mo14272O(int i) throws IOException {
            if (!C4615j6.f14195c || C4724p5.m20110b() || mo14282b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f14197d;
                    int i2 = this.f14199f;
                    this.f14199f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f14197d;
                    int i3 = this.f14199f;
                    this.f14199f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C4616a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14199f), Integer.valueOf(this.f14198e), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f14197d;
                int i4 = this.f14199f;
                this.f14199f = i4 + 1;
                C4877y9.m20674l(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f14197d;
                int i5 = this.f14199f;
                this.f14199f = i5 + 1;
                C4877y9.m20674l(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f14197d;
                    int i7 = this.f14199f;
                    this.f14199f = i7 + 1;
                    C4877y9.m20674l(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f14197d;
                int i8 = this.f14199f;
                this.f14199f = i8 + 1;
                C4877y9.m20674l(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f14197d;
                    int i10 = this.f14199f;
                    this.f14199f = i10 + 1;
                    C4877y9.m20674l(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f14197d;
                int i11 = this.f14199f;
                this.f14199f = i11 + 1;
                C4877y9.m20674l(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f14197d;
                    int i13 = this.f14199f;
                    this.f14199f = i13 + 1;
                    C4877y9.m20674l(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f14197d;
                int i14 = this.f14199f;
                this.f14199f = i14 + 1;
                C4877y9.m20674l(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f14197d;
                int i15 = this.f14199f;
                this.f14199f = i15 + 1;
                C4877y9.m20674l(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: P */
        public final void mo14273P(int i, int i2) throws IOException {
            mo14292m(i, 0);
            mo14288j(i2);
        }

        /* renamed from: R */
        public final void mo14275R(int i, C4773s5 s5Var) throws IOException {
            mo14292m(1, 3);
            mo14279Y(2, i);
            mo14294o(3, s5Var);
            mo14292m(1, 4);
        }

        /* renamed from: T */
        public final void mo14277T(byte[] bArr, int i, int i2) throws IOException {
            mo14272O(i2);
            m19744G0(bArr, 0, i2);
        }

        /* renamed from: Y */
        public final void mo14279Y(int i, int i2) throws IOException {
            mo14292m(i, 0);
            mo14272O(i2);
        }

        /* renamed from: Z */
        public final void mo14280Z(int i, long j) throws IOException {
            mo14292m(i, 1);
            mo14281a0(j);
        }

        /* renamed from: a */
        public final void mo14305a(byte[] bArr, int i, int i2) throws IOException {
            m19744G0(bArr, i, i2);
        }

        /* renamed from: a0 */
        public final void mo14281a0(long j) throws IOException {
            try {
                byte[] bArr = this.f14197d;
                int i = this.f14199f;
                int i2 = i + 1;
                this.f14199f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f14197d;
                int i3 = i2 + 1;
                this.f14199f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f14197d;
                int i4 = i3 + 1;
                this.f14199f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f14197d;
                int i5 = i4 + 1;
                this.f14199f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f14197d;
                int i6 = i5 + 1;
                this.f14199f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f14197d;
                int i7 = i6 + 1;
                this.f14199f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f14197d;
                int i8 = i7 + 1;
                this.f14199f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f14197d;
                this.f14199f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C4616a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14199f), Integer.valueOf(this.f14198e), 1}), e);
            }
        }

        /* renamed from: b */
        public final int mo14282b() {
            return this.f14198e - this.f14199f;
        }

        /* renamed from: f0 */
        public final void mo14283f0(int i) throws IOException {
            try {
                byte[] bArr = this.f14197d;
                int i2 = this.f14199f;
                int i3 = i2 + 1;
                this.f14199f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f14197d;
                int i4 = i3 + 1;
                this.f14199f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f14197d;
                int i5 = i4 + 1;
                this.f14199f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f14197d;
                this.f14199f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C4616a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14199f), Integer.valueOf(this.f14198e), 1}), e);
            }
        }

        /* renamed from: g */
        public final void mo14284g(byte b) throws IOException {
            try {
                byte[] bArr = this.f14197d;
                int i = this.f14199f;
                this.f14199f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C4616a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14199f), Integer.valueOf(this.f14198e), 1}), e);
            }
        }

        /* renamed from: j */
        public final void mo14288j(int i) throws IOException {
            if (i >= 0) {
                mo14272O(i);
            } else {
                mo14299t((long) i);
            }
        }

        /* renamed from: k0 */
        public final void mo14290k0(int i, int i2) throws IOException {
            mo14292m(i, 5);
            mo14283f0(i2);
        }

        /* renamed from: m */
        public final void mo14292m(int i, int i2) throws IOException {
            mo14272O((i << 3) | i2);
        }

        /* renamed from: n */
        public final void mo14293n(int i, long j) throws IOException {
            mo14292m(i, 0);
            mo14299t(j);
        }

        /* renamed from: o */
        public final void mo14294o(int i, C4773s5 s5Var) throws IOException {
            mo14292m(i, 2);
            mo14300u(s5Var);
        }

        /* renamed from: p */
        public final void mo14295p(int i, C4655l8 l8Var) throws IOException {
            mo14292m(1, 3);
            mo14279Y(2, i);
            mo14292m(3, 2);
            mo14301v(l8Var);
            mo14292m(1, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public final void mo14296q(int i, C4655l8 l8Var, C4453a9 a9Var) throws IOException {
            mo14292m(i, 2);
            C4614j5 j5Var = (C4614j5) l8Var;
            int l = j5Var.mo14269l();
            if (l == -1) {
                l = a9Var.mo13800f(j5Var);
                j5Var.mo14270n(l);
            }
            mo14272O(l);
            a9Var.mo13802h(l8Var, this.f14196a);
        }

        /* renamed from: r */
        public final void mo14297r(int i, String str) throws IOException {
            mo14292m(i, 2);
            mo14302w(str);
        }

        /* renamed from: s */
        public final void mo14298s(int i, boolean z) throws IOException {
            mo14292m(i, 0);
            mo14284g(z ? (byte) 1 : 0);
        }

        /* renamed from: t */
        public final void mo14299t(long j) throws IOException {
            if (!C4615j6.f14195c || mo14282b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f14197d;
                    int i = this.f14199f;
                    this.f14199f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f14197d;
                    int i2 = this.f14199f;
                    this.f14199f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C4616a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14199f), Integer.valueOf(this.f14198e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f14197d;
                    int i3 = this.f14199f;
                    this.f14199f = i3 + 1;
                    C4877y9.m20674l(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f14197d;
                int i4 = this.f14199f;
                this.f14199f = i4 + 1;
                C4877y9.m20674l(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: u */
        public final void mo14300u(C4773s5 s5Var) throws IOException {
            mo14272O(s5Var.mo13854d());
            s5Var.mo13859p(this);
        }

        /* renamed from: v */
        public final void mo14301v(C4655l8 l8Var) throws IOException {
            mo14272O(l8Var.mo14431c());
            l8Var.mo14433e(this);
        }

        /* renamed from: w */
        public final void mo14302w(String str) throws IOException {
            int i = this.f14199f;
            try {
                int p0 = C4615j6.m19698p0(str.length() * 3);
                int p02 = C4615j6.m19698p0(str.length());
                if (p02 == p0) {
                    int i2 = i + p02;
                    this.f14199f = i2;
                    int e = C4473ba.m18883e(str, this.f14197d, i2, mo14282b());
                    this.f14199f = i;
                    mo14272O((e - i) - p02);
                    this.f14199f = e;
                    return;
                }
                mo14272O(C4473ba.m18882d(str));
                this.f14199f = C4473ba.m18883e(str, this.f14197d, this.f14199f, mo14282b());
            } catch (C4528ea e2) {
                this.f14199f = i;
                mo14303x(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C4616a(e3);
            }
        }
    }

    private C4615j6() {
    }

    /* renamed from: A */
    public static int m19661A(float f) {
        return 4;
    }

    /* renamed from: A0 */
    public static int m19662A0(int i) {
        return 4;
    }

    /* renamed from: B */
    public static int m19663B(int i, double d) {
        return m19698p0(i << 3) + 8;
    }

    /* renamed from: B0 */
    public static int m19664B0(int i, int i2) {
        return m19698p0(i << 3) + 4;
    }

    /* renamed from: C */
    public static int m19665C(int i, float f) {
        return m19698p0(i << 3) + 4;
    }

    /* renamed from: C0 */
    public static int m19666C0(int i) {
        return m19694l0(i);
    }

    /* renamed from: D */
    public static int m19667D(int i, C4726p7 p7Var) {
        return (m19698p0(8) << 1) + m19699q0(2, i) + m19684c(3, p7Var);
    }

    /* renamed from: D0 */
    public static int m19668D0(int i, int i2) {
        return m19698p0(i << 3) + m19694l0(i2);
    }

    /* renamed from: E */
    public static int m19669E(int i, C4655l8 l8Var) {
        return (m19698p0(8) << 1) + m19699q0(2, i) + m19698p0(24) + m19676J(l8Var);
    }

    @Deprecated
    /* renamed from: E0 */
    public static int m19670E0(int i) {
        return m19698p0(i);
    }

    /* renamed from: F */
    static int m19671F(int i, C4655l8 l8Var, C4453a9 a9Var) {
        return m19698p0(i << 3) + m19688e(l8Var, a9Var);
    }

    /* renamed from: F0 */
    private static int m19672F0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: G */
    public static int m19673G(int i, String str) {
        return m19698p0(i << 3) + m19677K(str);
    }

    /* renamed from: H */
    public static int m19674H(int i, boolean z) {
        return m19698p0(i << 3) + 1;
    }

    /* renamed from: I */
    public static int m19675I(C4773s5 s5Var) {
        int d = s5Var.mo13854d();
        return m19698p0(d) + d;
    }

    /* renamed from: J */
    public static int m19676J(C4655l8 l8Var) {
        int c = l8Var.mo14431c();
        return m19698p0(c) + c;
    }

    /* renamed from: K */
    public static int m19677K(String str) {
        int i;
        try {
            i = C4473ba.m18882d(str);
        } catch (C4528ea unused) {
            i = str.getBytes(C4470b7.f13993a).length;
        }
        return m19698p0(i) + i;
    }

    /* renamed from: L */
    public static int m19678L(boolean z) {
        return 1;
    }

    /* renamed from: M */
    public static int m19679M(byte[] bArr) {
        int length = bArr.length;
        return m19698p0(length) + length;
    }

    /* renamed from: U */
    public static int m19680U(int i, C4773s5 s5Var) {
        int p0 = m19698p0(i << 3);
        int d = s5Var.mo13854d();
        return p0 + m19698p0(d) + d;
    }

    @Deprecated
    /* renamed from: V */
    static int m19681V(int i, C4655l8 l8Var, C4453a9 a9Var) {
        int p0 = m19698p0(i << 3) << 1;
        C4614j5 j5Var = (C4614j5) l8Var;
        int l = j5Var.mo14269l();
        if (l == -1) {
            l = a9Var.mo13800f(j5Var);
            j5Var.mo14270n(l);
        }
        return p0 + l;
    }

    @Deprecated
    /* renamed from: W */
    public static int m19682W(C4655l8 l8Var) {
        return l8Var.mo14431c();
    }

    /* renamed from: c */
    public static int m19684c(int i, C4726p7 p7Var) {
        int p0 = m19698p0(i << 3);
        int b = p7Var.mo14534b();
        return p0 + m19698p0(b) + b;
    }

    /* renamed from: c0 */
    public static int m19685c0(int i, long j) {
        return m19698p0(i << 3) + m19693j0(j);
    }

    /* renamed from: d */
    public static int m19686d(C4726p7 p7Var) {
        int b = p7Var.mo14534b();
        return m19698p0(b) + b;
    }

    /* renamed from: d0 */
    public static int m19687d0(int i, C4773s5 s5Var) {
        return (m19698p0(8) << 1) + m19699q0(2, i) + m19680U(3, s5Var);
    }

    /* renamed from: e */
    static int m19688e(C4655l8 l8Var, C4453a9 a9Var) {
        C4614j5 j5Var = (C4614j5) l8Var;
        int l = j5Var.mo14269l();
        if (l == -1) {
            l = a9Var.mo13800f(j5Var);
            j5Var.mo14270n(l);
        }
        return m19698p0(l) + l;
    }

    /* renamed from: e0 */
    public static int m19689e0(long j) {
        return m19693j0(j);
    }

    /* renamed from: f */
    public static C4615j6 m19690f(byte[] bArr) {
        return new C4617b(bArr, 0, bArr.length);
    }

    /* renamed from: h0 */
    public static int m19691h0(int i) {
        return m19698p0(i << 3);
    }

    /* renamed from: i0 */
    public static int m19692i0(int i, long j) {
        return m19698p0(i << 3) + m19693j0(j);
    }

    /* renamed from: j0 */
    public static int m19693j0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: l0 */
    public static int m19694l0(int i) {
        if (i >= 0) {
            return m19698p0(i);
        }
        return 10;
    }

    /* renamed from: m0 */
    public static int m19695m0(int i, int i2) {
        return m19698p0(i << 3) + m19694l0(i2);
    }

    /* renamed from: n0 */
    public static int m19696n0(int i, long j) {
        return m19698p0(i << 3) + m19693j0(m19709z0(j));
    }

    /* renamed from: o0 */
    public static int m19697o0(long j) {
        return m19693j0(m19709z0(j));
    }

    /* renamed from: p0 */
    public static int m19698p0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: q0 */
    public static int m19699q0(int i, int i2) {
        return m19698p0(i << 3) + m19698p0(i2);
    }

    /* renamed from: r0 */
    public static int m19700r0(int i, long j) {
        return m19698p0(i << 3) + 8;
    }

    /* renamed from: s0 */
    public static int m19701s0(long j) {
        return 8;
    }

    /* renamed from: t0 */
    public static int m19702t0(int i) {
        return m19698p0(m19672F0(i));
    }

    /* renamed from: u0 */
    public static int m19703u0(int i, int i2) {
        return m19698p0(i << 3) + m19698p0(m19672F0(i2));
    }

    /* renamed from: v0 */
    public static int m19704v0(int i, long j) {
        return m19698p0(i << 3) + 8;
    }

    /* renamed from: w0 */
    public static int m19705w0(long j) {
        return 8;
    }

    /* renamed from: x0 */
    public static int m19706x0(int i) {
        return 4;
    }

    /* renamed from: y0 */
    public static int m19707y0(int i, int i2) {
        return m19698p0(i << 3) + 4;
    }

    /* renamed from: z */
    public static int m19708z(double d) {
        return 8;
    }

    /* renamed from: z0 */
    private static long m19709z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: N */
    public final void mo14271N() {
        if (mo14282b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: O */
    public abstract void mo14272O(int i) throws IOException;

    /* renamed from: P */
    public abstract void mo14273P(int i, int i2) throws IOException;

    /* renamed from: Q */
    public final void mo14274Q(int i, long j) throws IOException {
        mo14293n(i, m19709z0(j));
    }

    /* renamed from: R */
    public abstract void mo14275R(int i, C4773s5 s5Var) throws IOException;

    /* renamed from: S */
    public final void mo14276S(long j) throws IOException {
        mo14299t(m19709z0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract void mo14277T(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: X */
    public final void mo14278X(int i) throws IOException {
        mo14272O(m19672F0(i));
    }

    /* renamed from: Y */
    public abstract void mo14279Y(int i, int i2) throws IOException;

    /* renamed from: Z */
    public abstract void mo14280Z(int i, long j) throws IOException;

    /* renamed from: a0 */
    public abstract void mo14281a0(long j) throws IOException;

    /* renamed from: b */
    public abstract int mo14282b();

    /* renamed from: f0 */
    public abstract void mo14283f0(int i) throws IOException;

    /* renamed from: g */
    public abstract void mo14284g(byte b) throws IOException;

    /* renamed from: g0 */
    public final void mo14285g0(int i, int i2) throws IOException {
        mo14279Y(i, m19672F0(i2));
    }

    /* renamed from: h */
    public final void mo14286h(double d) throws IOException {
        mo14281a0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void mo14287i(float f) throws IOException {
        mo14283f0(Float.floatToRawIntBits(f));
    }

    /* renamed from: j */
    public abstract void mo14288j(int i) throws IOException;

    /* renamed from: k */
    public final void mo14289k(int i, double d) throws IOException {
        mo14280Z(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k0 */
    public abstract void mo14290k0(int i, int i2) throws IOException;

    /* renamed from: l */
    public final void mo14291l(int i, float f) throws IOException {
        mo14290k0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: m */
    public abstract void mo14292m(int i, int i2) throws IOException;

    /* renamed from: n */
    public abstract void mo14293n(int i, long j) throws IOException;

    /* renamed from: o */
    public abstract void mo14294o(int i, C4773s5 s5Var) throws IOException;

    /* renamed from: p */
    public abstract void mo14295p(int i, C4655l8 l8Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract void mo14296q(int i, C4655l8 l8Var, C4453a9 a9Var) throws IOException;

    /* renamed from: r */
    public abstract void mo14297r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo14298s(int i, boolean z) throws IOException;

    /* renamed from: t */
    public abstract void mo14299t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo14300u(C4773s5 s5Var) throws IOException;

    /* renamed from: v */
    public abstract void mo14301v(C4655l8 l8Var) throws IOException;

    /* renamed from: w */
    public abstract void mo14302w(String str) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo14303x(String str, C4528ea eaVar) throws IOException {
        f14194b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", eaVar);
        byte[] bytes = str.getBytes(C4470b7.f13993a);
        try {
            mo14272O(bytes.length);
            mo14305a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C4616a(e);
        } catch (C4616a e2) {
            throw e2;
        }
    }

    /* renamed from: y */
    public final void mo14304y(boolean z) throws IOException {
        mo14284g(z ? (byte) 1 : 0);
    }
}
