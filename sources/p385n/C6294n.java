package p385n;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: n.n */
final class C6294n implements C6281e {

    /* renamed from: f */
    public final C6277c f17806f = new C6277c();

    /* renamed from: g */
    public final C6300s f17807g;

    /* renamed from: h */
    boolean f17808h;

    /* renamed from: n.n$a */
    class C6295a extends InputStream {
        C6295a() {
        }

        public int available() throws IOException {
            C6294n nVar = C6294n.this;
            if (!nVar.f17808h) {
                return (int) Math.min(nVar.f17806f.f17777g, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            C6294n.this.close();
        }

        public int read() throws IOException {
            C6294n nVar = C6294n.this;
            if (!nVar.f17808h) {
                C6277c cVar = nVar.f17806f;
                if (cVar.f17777g == 0 && nVar.f17807g.mo17355O(cVar, 8192) == -1) {
                    return -1;
                }
                return C6294n.this.f17806f.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C6294n.this.f17808h) {
                C6303u.m26019b((long) bArr.length, (long) i, (long) i2);
                C6294n nVar = C6294n.this;
                C6277c cVar = nVar.f17806f;
                if (cVar.f17777g == 0 && nVar.f17807g.mo17355O(cVar, 8192) == -1) {
                    return -1;
                }
                return C6294n.this.f17806f.mo17820e0(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C6294n.this + ".inputStream()";
        }
    }

    C6294n(C6300s sVar) {
        if (sVar != null) {
            this.f17807g = sVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A */
    public boolean mo17794A() throws IOException {
        if (!this.f17808h) {
            return this.f17806f.mo17794A() && this.f17807g.mo17355O(this.f17806f, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: C */
    public byte[] mo17798C(long j) throws IOException {
        mo17809W(j);
        return this.f17806f.mo17798C(j);
    }

    /* renamed from: K */
    public short mo17803K() throws IOException {
        mo17809W(2);
        return this.f17806f.mo17803K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo17805M() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo17809W(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo17917j(r3)
            if (r3 == 0) goto L_0x0040
            n.c r3 = r6.f17806f
            long r4 = (long) r1
            byte r3 = r3.mo17799D(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            n.c r0 = r6.f17806f
            long r0 = r0.mo17805M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p385n.C6294n.mo17805M():long");
    }

    /* renamed from: O */
    public long mo17355O(C6277c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f17808h) {
            C6277c cVar2 = this.f17806f;
            if (cVar2.f17777g == 0 && this.f17807g.mo17355O(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f17806f.mo17355O(cVar, Math.min(j, this.f17806f.f17777g));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: P */
    public String mo17806P(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = mo17914a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f17806f.mo17832k0(a);
            }
            if (j2 < Long.MAX_VALUE && mo17917j(j2) && this.f17806f.mo17799D(j2 - 1) == 13 && mo17917j(1 + j2) && this.f17806f.mo17799D(j2) == 10) {
                return this.f17806f.mo17832k0(j2);
            }
            C6277c cVar = new C6277c();
            C6277c cVar2 = this.f17806f;
            cVar2.mo17854u(cVar, 0, Math.min(32, cVar2.mo17834l0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f17806f.mo17834l0(), j) + " content=" + cVar.mo17822f0().mo17885q() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: R */
    public long mo17807R(C6299r rVar) throws IOException {
        C6277c cVar;
        if (rVar != null) {
            long j = 0;
            while (true) {
                int i = (this.f17807g.mo17355O(this.f17806f, 8192) > -1 ? 1 : (this.f17807g.mo17355O(this.f17806f, 8192) == -1 ? 0 : -1));
                cVar = this.f17806f;
                if (i == 0) {
                    break;
                }
                long t = cVar.mo17851t();
                if (t > 0) {
                    j += t;
                    rVar.mo17384f(this.f17806f, t);
                }
            }
            if (cVar.mo17834l0() <= 0) {
                return j;
            }
            long l0 = j + this.f17806f.mo17834l0();
            C6277c cVar2 = this.f17806f;
            rVar.mo17384f(cVar2, cVar2.mo17834l0());
            return l0;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: W */
    public void mo17809W(long j) throws IOException {
        if (!mo17917j(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public long mo17914a(byte b, long j, long j2) throws IOException {
        if (this.f17808h) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long J = this.f17806f.mo17802J(b, j, j2);
                if (J == -1) {
                    C6277c cVar = this.f17806f;
                    long j3 = cVar.f17777g;
                    if (j3 >= j2 || this.f17807g.mo17355O(cVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return J;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public C6277c mo17813b() {
        return this.f17806f;
    }

    /* renamed from: b0 */
    public long mo17814b0(byte b) throws IOException {
        return mo17914a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: c */
    public void mo17815c(long j) throws IOException {
        if (!this.f17808h) {
            while (j > 0) {
                C6277c cVar = this.f17806f;
                if (cVar.f17777g == 0 && this.f17807g.mo17355O(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f17806f.mo17834l0());
                this.f17806f.mo17815c(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c0 */
    public boolean mo17816c0(long j, C6282f fVar) throws IOException {
        return mo17915h(j, fVar, 0, fVar.mo17892x());
    }

    public void close() throws IOException {
        if (!this.f17808h) {
            this.f17808h = true;
            this.f17807g.close();
            this.f17806f.mo17840q();
        }
    }

    /* renamed from: d0 */
    public long mo17819d0() throws IOException {
        mo17809W(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo17917j((long) i2)) {
                break;
            }
            byte D = this.f17806f.mo17799D((long) i);
            if ((D >= 48 && D <= 57) || ((D >= 97 && D <= 102) || (D >= 65 && D <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(D)}));
            }
        }
        return this.f17806f.mo17819d0();
    }

    /* renamed from: h */
    public boolean mo17915h(long j, C6282f fVar, int i, int i2) throws IOException {
        if (this.f17808h) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || fVar.mo17892x() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!mo17917j(1 + j2) || this.f17806f.mo17799D(j2) != fVar.mo17884o(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public InputStream inputStream() {
        return new C6295a();
    }

    public boolean isOpen() {
        return !this.f17808h;
    }

    /* renamed from: j */
    public boolean mo17917j(long j) throws IOException {
        C6277c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f17808h) {
            do {
                cVar = this.f17806f;
                if (cVar.f17777g >= j) {
                    return true;
                }
            } while (this.f17807g.mo17355O(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: k */
    public C6282f mo17831k(long j) throws IOException {
        mo17809W(j);
        return this.f17806f.mo17831k(j);
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C6277c cVar = this.f17806f;
        if (cVar.f17777g == 0 && this.f17807g.mo17355O(cVar, 8192) == -1) {
            return -1;
        }
        return this.f17806f.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        mo17809W(1);
        return this.f17806f.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            mo17809W((long) bArr.length);
            this.f17806f.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C6277c cVar = this.f17806f;
                long j = cVar.f17777g;
                if (j > 0) {
                    int e0 = cVar.mo17820e0(bArr, i, (int) j);
                    if (e0 != -1) {
                        i += e0;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() throws IOException {
        mo17809W(4);
        return this.f17806f.readInt();
    }

    public short readShort() throws IOException {
        mo17809W(2);
        return this.f17806f.readShort();
    }

    /* renamed from: s */
    public String mo17849s() throws IOException {
        return mo17806P(Long.MAX_VALUE);
    }

    public C6301t timeout() {
        return this.f17807g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f17807g + ")";
    }

    /* renamed from: v */
    public byte[] mo17856v() throws IOException {
        this.f17806f.mo17850s0(this.f17807g);
        return this.f17806f.mo17856v();
    }

    /* renamed from: y */
    public int mo17862y() throws IOException {
        mo17809W(4);
        return this.f17806f.mo17862y();
    }
}
