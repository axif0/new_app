package p385n;

import com.karumi.dexter.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: n.c */
public final class C6277c implements C6281e, C6280d, Cloneable, ByteChannel {

    /* renamed from: h */
    private static final byte[] f17775h = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: f */
    C6296o f17776f;

    /* renamed from: g */
    long f17777g;

    /* renamed from: n.c$a */
    class C6278a extends OutputStream {
        C6278a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return C6277c.this + ".outputStream()";
        }

        public void write(int i) {
            C6277c.this.mo17852t0((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C6277c.this.mo17843r0(bArr, i, i2);
        }
    }

    /* renamed from: n.c$b */
    class C6279b extends InputStream {
        C6279b() {
        }

        public int available() {
            return (int) Math.min(C6277c.this.f17777g, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            C6277c cVar = C6277c.this;
            if (cVar.f17777g > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            return C6277c.this.mo17820e0(bArr, i, i2);
        }

        public String toString() {
            return C6277c.this + ".inputStream()";
        }
    }

    /* renamed from: A */
    public boolean mo17794A() {
        return this.f17777g == 0;
    }

    /* renamed from: A0 */
    public C6277c mo17795A0(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C6296o o0 = mo17838o0(1);
                    byte[] bArr = o0.f17810a;
                    int i4 = o0.f17812c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = o0.f17812c;
                    int i7 = (i4 + i5) - i6;
                    o0.f17812c = i6 + i7;
                    this.f17777g += (long) i7;
                    i = i5;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo17852t0((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo17852t0(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            mo17852t0((i9 >> 18) | 240);
                            mo17852t0(((i9 >> 12) & 63) | 128);
                            mo17852t0(((i9 >> 6) & 63) | 128);
                            mo17852t0((i9 & 63) | 128);
                            i += 2;
                        }
                    }
                    mo17852t0(i3);
                    mo17852t0((charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: B */
    public /* bridge */ /* synthetic */ C6280d mo17796B(int i) throws IOException {
        mo17852t0(i);
        return this;
    }

    /* renamed from: B0 */
    public C6277c mo17797B0(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        mo17852t0(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    mo17852t0((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                mo17852t0(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            mo17852t0(i3);
            i = (i & 63) | 128;
        }
        mo17852t0(i);
        return this;
    }

    /* renamed from: C */
    public byte[] mo17798C(long j) throws EOFException {
        C6303u.m26019b(this.f17777g, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: D */
    public final byte mo17799D(long j) {
        int i;
        C6303u.m26019b(this.f17777g, j, 1);
        long j2 = this.f17777g;
        if (j2 - j > j) {
            C6296o oVar = this.f17776f;
            while (true) {
                int i2 = oVar.f17812c;
                int i3 = oVar.f17811b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return oVar.f17810a[i3 + ((int) j)];
                }
                j -= j3;
                oVar = oVar.f17815f;
            }
        } else {
            long j4 = j - j2;
            C6296o oVar2 = this.f17776f;
            do {
                oVar2 = oVar2.f17816g;
                int i4 = oVar2.f17812c;
                i = oVar2.f17811b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return oVar2.f17810a[i + ((int) j4)];
        }
    }

    /* renamed from: G */
    public /* bridge */ /* synthetic */ C6280d mo17800G(byte[] bArr) throws IOException {
        mo17841q0(bArr);
        return this;
    }

    /* renamed from: I */
    public /* bridge */ /* synthetic */ C6280d mo17801I(C6282f fVar) throws IOException {
        mo17839p0(fVar);
        return this;
    }

    /* renamed from: J */
    public long mo17802J(byte b, long j, long j2) {
        C6296o oVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f17777g), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f17777g;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (oVar = this.f17776f) == null) {
            return -1;
        }
        long j5 = this.f17777g;
        if (j5 - j < j) {
            while (j5 > j) {
                oVar = oVar.f17816g;
                j5 -= (long) (oVar.f17812c - oVar.f17811b);
            }
        } else {
            while (true) {
                long j6 = ((long) (oVar.f17812c - oVar.f17811b)) + j3;
                if (j6 >= j) {
                    break;
                }
                oVar = oVar.f17815f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = oVar.f17810a;
            int min = (int) Math.min((long) oVar.f17812c, (((long) oVar.f17811b) + j4) - j5);
            for (int i = (int) ((((long) oVar.f17811b) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - oVar.f17811b)) + j5;
                }
            }
            byte b2 = b;
            j5 += (long) (oVar.f17812c - oVar.f17811b);
            oVar = oVar.f17815f;
            j7 = j5;
        }
        return -1;
    }

    /* renamed from: K */
    public short mo17803K() {
        return C6303u.m26021d(readShort());
    }

    /* renamed from: L */
    public /* bridge */ /* synthetic */ C6280d mo17804L() throws IOException {
        mo17860x();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if (r8 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return r3;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo17805M() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f17777g
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c4
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0014:
            n.o r10 = r0.f17776f
            byte[] r11 = r10.f17810a
            int r12 = r10.f17811b
            int r13 = r10.f17812c
        L_0x001c:
            if (r12 >= r13) goto L_0x009d
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x006a
            r14 = 57
            if (r15 > r14) goto L_0x006a
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0038
            long r1 = (long) r14
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0074
        L_0x003f:
            n.c r1 = new n.c
            r1.<init>()
            r1.mo17855u0(r3)
            r1.mo17852t0(r15)
            if (r8 != 0) goto L_0x004f
            r1.readByte()
        L_0x004f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo17827i0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006a:
            r1 = 45
            if (r15 != r1) goto L_0x007e
            if (r7 != 0) goto L_0x007e
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0074:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x007e:
            if (r7 == 0) goto L_0x0082
            r9 = 1
            goto L_0x009d
        L_0x0082:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009d:
            if (r12 != r13) goto L_0x00a9
            n.o r1 = r10.mo17926b()
            r0.f17776f = r1
            p385n.C6297p.m25987a(r10)
            goto L_0x00ab
        L_0x00a9:
            r10.f17811b = r12
        L_0x00ab:
            if (r9 != 0) goto L_0x00b9
            n.o r1 = r0.f17776f
            if (r1 != 0) goto L_0x00b2
            goto L_0x00b9
        L_0x00b2:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00b9:
            long r1 = r0.f17777g
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f17777g = r1
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            long r3 = -r3
        L_0x00c3:
            return r3
        L_0x00c4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00cd
        L_0x00cc:
            throw r1
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: p385n.C6277c.mo17805M():long");
    }

    /* renamed from: O */
    public long mo17355O(C6277c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f17777g;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.mo17384f(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    /* renamed from: P */
    public String mo17806P(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long J = mo17802J((byte) 10, 0, j2);
            if (J != -1) {
                return mo17832k0(J);
            }
            if (j2 < mo17834l0() && mo17799D(j2 - 1) == 13 && mo17799D(j2) == 10) {
                return mo17832k0(j2);
            }
            C6277c cVar = new C6277c();
            mo17854u(cVar, 0, Math.min(32, mo17834l0()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo17834l0(), j) + " content=" + cVar.mo17822f0().mo17885q() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: R */
    public long mo17807R(C6299r rVar) throws IOException {
        long j = this.f17777g;
        if (j > 0) {
            rVar.mo17384f(this, j);
        }
        return j;
    }

    /* renamed from: V */
    public OutputStream mo17808V() {
        return new C6278a();
    }

    /* renamed from: W */
    public void mo17809W(long j) throws EOFException {
        if (this.f17777g < j) {
            throw new EOFException();
        }
    }

    /* renamed from: Y */
    public /* bridge */ /* synthetic */ C6280d mo17810Y(String str) throws IOException {
        mo17864z0(str);
        return this;
    }

    /* renamed from: Z */
    public /* bridge */ /* synthetic */ C6280d mo17811Z(long j) throws IOException {
        mo17855u0(j);
        return this;
    }

    /* renamed from: a0 */
    public boolean mo17812a0(long j, C6282f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f17777g - j < ((long) i2) || fVar.mo17892x() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo17799D(((long) i3) + j) != fVar.mo17884o(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public C6277c mo17813b() {
        return this;
    }

    /* renamed from: b0 */
    public long mo17814b0(byte b) {
        return mo17802J(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: c */
    public void mo17815c(long j) throws EOFException {
        while (j > 0) {
            C6296o oVar = this.f17776f;
            if (oVar != null) {
                int min = (int) Math.min(j, (long) (oVar.f17812c - oVar.f17811b));
                long j2 = (long) min;
                this.f17777g -= j2;
                j -= j2;
                C6296o oVar2 = this.f17776f;
                int i = oVar2.f17811b + min;
                oVar2.f17811b = i;
                if (i == oVar2.f17812c) {
                    this.f17776f = oVar2.mo17926b();
                    C6297p.m25987a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: c0 */
    public boolean mo17816c0(long j, C6282f fVar) {
        return mo17812a0(j, fVar, 0, fVar.mo17892x());
    }

    public void close() {
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C6280d mo17818d(byte[] bArr, int i, int i2) throws IOException {
        mo17843r0(bArr, i, i2);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f17776f = r6.mo17926b();
        p385n.C6297p.m25987a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.f17811b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r1 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo17819d0() {
        /*
            r15 = this;
            long r0 = r15.f17777g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            n.o r6 = r15.f17776f
            byte[] r7 = r6.f17810a
            int r8 = r6.f17811b
            int r9 = r6.f17812c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            n.c r0 = new n.c
            r0.<init>()
            r0.mo17857v0(r4)
            r0.mo17852t0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo17827i0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x008f
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            n.o r7 = r6.mo17926b()
            r15.f17776f = r7
            p385n.C6297p.m25987a(r6)
            goto L_0x009d
        L_0x009b:
            r6.f17811b = r8
        L_0x009d:
            if (r1 != 0) goto L_0x00a3
            n.o r6 = r15.f17776f
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r1 = r15.f17777g
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f17777g = r1
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b3
        L_0x00b2:
            throw r0
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: p385n.C6277c.mo17819d0():long");
    }

    /* renamed from: e0 */
    public int mo17820e0(byte[] bArr, int i, int i2) {
        C6303u.m26019b((long) bArr.length, (long) i, (long) i2);
        C6296o oVar = this.f17776f;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i2, oVar.f17812c - oVar.f17811b);
        System.arraycopy(oVar.f17810a, oVar.f17811b, bArr, i, min);
        int i3 = oVar.f17811b + min;
        oVar.f17811b = i3;
        this.f17777g -= (long) min;
        if (i3 == oVar.f17812c) {
            this.f17776f = oVar.mo17926b();
            C6297p.m25987a(oVar);
        }
        return min;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6277c)) {
            return false;
        }
        C6277c cVar = (C6277c) obj;
        long j = this.f17777g;
        if (j != cVar.f17777g) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C6296o oVar = this.f17776f;
        C6296o oVar2 = cVar.f17776f;
        int i = oVar.f17811b;
        int i2 = oVar2.f17811b;
        while (j2 < this.f17777g) {
            long min = (long) Math.min(oVar.f17812c - i, oVar2.f17812c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (oVar.f17810a[i] != oVar2.f17810a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == oVar.f17812c) {
                oVar = oVar.f17815f;
                i = oVar.f17811b;
            }
            if (i2 == oVar2.f17812c) {
                oVar2 = oVar2.f17815f;
                i2 = oVar2.f17811b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public void mo17384f(C6277c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C6303u.m26019b(cVar.f17777g, 0, j);
            while (j > 0) {
                C6296o oVar = cVar.f17776f;
                if (j < ((long) (oVar.f17812c - oVar.f17811b))) {
                    C6296o oVar2 = this.f17776f;
                    C6296o oVar3 = oVar2 != null ? oVar2.f17816g : null;
                    if (oVar3 != null && oVar3.f17814e) {
                        if ((((long) oVar3.f17812c) + j) - ((long) (oVar3.f17813d ? 0 : oVar3.f17811b)) <= 8192) {
                            cVar.f17776f.mo17930f(oVar3, (int) j);
                            cVar.f17777g -= j;
                            this.f17777g += j;
                            return;
                        }
                    }
                    cVar.f17776f = cVar.f17776f.mo17929e((int) j);
                }
                C6296o oVar4 = cVar.f17776f;
                long j2 = (long) (oVar4.f17812c - oVar4.f17811b);
                cVar.f17776f = oVar4.mo17926b();
                C6296o oVar5 = this.f17776f;
                if (oVar5 == null) {
                    this.f17776f = oVar4;
                    oVar4.f17816g = oVar4;
                    oVar4.f17815f = oVar4;
                } else {
                    oVar5.f17816g.mo17927c(oVar4);
                    oVar4.mo17925a();
                }
                cVar.f17777g -= j2;
                this.f17777g += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: f0 */
    public C6282f mo17822f0() {
        return new C6282f(mo17856v());
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public String mo17823g0(long j, Charset charset) throws EOFException {
        C6303u.m26019b(this.f17777g, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            C6296o oVar = this.f17776f;
            if (((long) oVar.f17811b) + j > ((long) oVar.f17812c)) {
                return new String(mo17798C(j), charset);
            }
            String str = new String(oVar.f17810a, oVar.f17811b, (int) j, charset);
            int i = (int) (((long) oVar.f17811b) + j);
            oVar.f17811b = i;
            this.f17777g -= j;
            if (i == oVar.f17812c) {
                this.f17776f = oVar.mo17926b();
                C6297p.m25987a(oVar);
            }
            return str;
        }
    }

    /* renamed from: h0 */
    public String mo17824h0(Charset charset) {
        try {
            return mo17823g0(this.f17777g, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public int hashCode() {
        C6296o oVar = this.f17776f;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oVar.f17812c;
            for (int i3 = oVar.f17811b; i3 < i2; i3++) {
                i = (i * 31) + oVar.f17810a[i3];
            }
            oVar = oVar.f17815f;
        } while (oVar != this.f17776f);
        return i;
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ C6280d mo17826i(long j) throws IOException {
        mo17857v0(j);
        return this;
    }

    /* renamed from: i0 */
    public String mo17827i0() {
        try {
            return mo17823g0(this.f17777g, C6303u.f17825a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public InputStream inputStream() {
        return new C6279b();
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public String mo17830j0(long j) throws EOFException {
        return mo17823g0(j, C6303u.f17825a);
    }

    /* renamed from: k */
    public C6282f mo17831k(long j) throws EOFException {
        return new C6282f(mo17798C(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public String mo17832k0(long j) throws EOFException {
        String j0;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (mo17799D(j3) == 13) {
                j0 = mo17830j0(j3);
                j2 = 2;
                mo17815c(j2);
                return j0;
            }
        }
        j0 = mo17830j0(j);
        mo17815c(j2);
        return j0;
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ C6280d mo17833l(int i) throws IOException {
        mo17861x0(i);
        return this;
    }

    /* renamed from: l0 */
    public final long mo17834l0() {
        return this.f17777g;
    }

    /* renamed from: m0 */
    public final C6282f mo17835m0() {
        long j = this.f17777g;
        if (j <= 2147483647L) {
            return mo17837n0((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f17777g);
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C6280d mo17836n(int i) throws IOException {
        mo17858w0(i);
        return this;
    }

    /* renamed from: n0 */
    public final C6282f mo17837n0(int i) {
        return i == 0 ? C6282f.f17781j : new C6298q(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public C6296o mo17838o0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C6296o oVar = this.f17776f;
        if (oVar == null) {
            C6296o b = C6297p.m25988b();
            this.f17776f = b;
            b.f17816g = b;
            b.f17815f = b;
            return b;
        }
        C6296o oVar2 = oVar.f17816g;
        if (oVar2.f17812c + i <= 8192 && oVar2.f17814e) {
            return oVar2;
        }
        C6296o b2 = C6297p.m25988b();
        oVar2.mo17927c(b2);
        return b2;
    }

    /* renamed from: p0 */
    public C6277c mo17839p0(C6282f fVar) {
        if (fVar != null) {
            fVar.mo17878E(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: q */
    public final void mo17840q() {
        try {
            mo17815c(this.f17777g);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: q0 */
    public C6277c mo17841q0(byte[] bArr) {
        if (bArr != null) {
            mo17843r0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: r */
    public C6277c clone() {
        C6277c cVar = new C6277c();
        if (this.f17777g == 0) {
            return cVar;
        }
        C6296o d = this.f17776f.mo17928d();
        cVar.f17776f = d;
        d.f17816g = d;
        d.f17815f = d;
        C6296o oVar = this.f17776f;
        while (true) {
            oVar = oVar.f17815f;
            if (oVar != this.f17776f) {
                cVar.f17776f.f17816g.mo17927c(oVar.mo17928d());
            } else {
                cVar.f17777g = this.f17777g;
                return cVar;
            }
        }
    }

    /* renamed from: r0 */
    public C6277c mo17843r0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C6303u.m26019b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C6296o o0 = mo17838o0(1);
                int min = Math.min(i3 - i, 8192 - o0.f17812c);
                System.arraycopy(bArr, i, o0.f17810a, o0.f17812c, min);
                i += min;
                o0.f17812c += min;
            }
            this.f17777g += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C6296o oVar = this.f17776f;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f17812c - oVar.f17811b);
        byteBuffer.put(oVar.f17810a, oVar.f17811b, min);
        int i = oVar.f17811b + min;
        oVar.f17811b = i;
        this.f17777g -= (long) min;
        if (i == oVar.f17812c) {
            this.f17776f = oVar.mo17926b();
            C6297p.m25987a(oVar);
        }
        return min;
    }

    public byte readByte() {
        long j = this.f17777g;
        if (j != 0) {
            C6296o oVar = this.f17776f;
            int i = oVar.f17811b;
            int i2 = oVar.f17812c;
            int i3 = i + 1;
            byte b = oVar.f17810a[i];
            this.f17777g = j - 1;
            if (i3 == i2) {
                this.f17776f = oVar.mo17926b();
                C6297p.m25987a(oVar);
            } else {
                oVar.f17811b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int e0 = mo17820e0(bArr, i, bArr.length - i);
            if (e0 != -1) {
                i += e0;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f17777g;
        if (j >= 4) {
            C6296o oVar = this.f17776f;
            int i = oVar.f17811b;
            int i2 = oVar.f17812c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.f17810a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f17777g = j - 4;
            if (i6 == i2) {
                this.f17776f = oVar.mo17926b();
                C6297p.m25987a(oVar);
            } else {
                oVar.f17811b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f17777g);
    }

    public short readShort() {
        long j = this.f17777g;
        if (j >= 2) {
            C6296o oVar = this.f17776f;
            int i = oVar.f17811b;
            int i2 = oVar.f17812c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.f17810a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f17777g = j - 2;
            if (i4 == i2) {
                this.f17776f = oVar.mo17926b();
                C6297p.m25987a(oVar);
            } else {
                oVar.f17811b = i4;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.f17777g);
    }

    /* renamed from: s */
    public String mo17849s() throws EOFException {
        return mo17806P(Long.MAX_VALUE);
    }

    /* renamed from: s0 */
    public long mo17850s0(C6300s sVar) throws IOException {
        if (sVar != null) {
            long j = 0;
            while (true) {
                long O = sVar.mo17355O(this, 8192);
                if (O == -1) {
                    return j;
                }
                j += O;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: t */
    public final long mo17851t() {
        long j = this.f17777g;
        if (j == 0) {
            return 0;
        }
        C6296o oVar = this.f17776f.f17816g;
        int i = oVar.f17812c;
        return (i >= 8192 || !oVar.f17814e) ? j : j - ((long) (i - oVar.f17811b));
    }

    /* renamed from: t0 */
    public C6277c mo17852t0(int i) {
        C6296o o0 = mo17838o0(1);
        byte[] bArr = o0.f17810a;
        int i2 = o0.f17812c;
        o0.f17812c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f17777g++;
        return this;
    }

    public C6301t timeout() {
        return C6301t.f17821d;
    }

    public String toString() {
        return mo17835m0().toString();
    }

    /* renamed from: u */
    public final C6277c mo17854u(C6277c cVar, long j, long j2) {
        if (cVar != null) {
            C6303u.m26019b(this.f17777g, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f17777g += j2;
            C6296o oVar = this.f17776f;
            while (true) {
                int i = oVar.f17812c;
                int i2 = oVar.f17811b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                oVar = oVar.f17815f;
            }
            while (j2 > 0) {
                C6296o d = oVar.mo17928d();
                int i3 = (int) (((long) d.f17811b) + j);
                d.f17811b = i3;
                d.f17812c = Math.min(i3 + ((int) j2), d.f17812c);
                C6296o oVar2 = cVar.f17776f;
                if (oVar2 == null) {
                    d.f17816g = d;
                    d.f17815f = d;
                    cVar.f17776f = d;
                } else {
                    oVar2.f17816g.mo17927c(d);
                }
                j2 -= (long) (d.f17812c - d.f17811b);
                oVar = oVar.f17815f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: u0 */
    public C6277c mo17855u0(long j) {
        if (j == 0) {
            mo17852t0(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                mo17864z0("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C6296o o0 = mo17838o0(i);
        byte[] bArr = o0.f17810a;
        int i2 = o0.f17812c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f17775h[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        o0.f17812c += i;
        this.f17777g += (long) i;
        return this;
    }

    /* renamed from: v */
    public byte[] mo17856v() {
        try {
            return mo17798C(this.f17777g);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: v0 */
    public C6277c mo17857v0(long j) {
        if (j == 0) {
            mo17852t0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C6296o o0 = mo17838o0(numberOfTrailingZeros);
        byte[] bArr = o0.f17810a;
        int i = o0.f17812c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f17775h[(int) (15 & j)];
            j >>>= 4;
        }
        o0.f17812c += numberOfTrailingZeros;
        this.f17777g += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: w0 */
    public C6277c mo17858w0(int i) {
        C6296o o0 = mo17838o0(4);
        byte[] bArr = o0.f17810a;
        int i2 = o0.f17812c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        o0.f17812c = i5 + 1;
        this.f17777g += 4;
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C6296o o0 = mo17838o0(1);
                int min = Math.min(i, 8192 - o0.f17812c);
                byteBuffer.get(o0.f17810a, o0.f17812c, min);
                i -= min;
                o0.f17812c += min;
            }
            this.f17777g += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: x */
    public C6277c mo17860x() {
        return this;
    }

    /* renamed from: x0 */
    public C6277c mo17861x0(int i) {
        C6296o o0 = mo17838o0(2);
        byte[] bArr = o0.f17810a;
        int i2 = o0.f17812c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        o0.f17812c = i3 + 1;
        this.f17777g += 2;
        return this;
    }

    /* renamed from: y */
    public int mo17862y() {
        return C6303u.m26020c(readInt());
    }

    /* renamed from: y0 */
    public C6277c mo17863y0(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C6303u.f17825a)) {
            mo17795A0(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            mo17843r0(bytes, 0, bytes.length);
            return this;
        }
    }

    /* renamed from: z0 */
    public C6277c mo17864z0(String str) {
        mo17795A0(str, 0, str.length());
        return this;
    }
}
