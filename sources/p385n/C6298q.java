package p385n;

import java.util.Arrays;

/* renamed from: n.q */
final class C6298q extends C6282f {

    /* renamed from: k */
    final transient byte[][] f17819k;

    /* renamed from: l */
    final transient int[] f17820l;

    C6298q(C6277c cVar, int i) {
        super((byte[]) null);
        C6303u.m26019b(cVar.f17777g, 0, (long) i);
        C6296o oVar = cVar.f17776f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = oVar.f17812c;
            int i6 = oVar.f17811b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                oVar = oVar.f17815f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f17819k = new byte[i4][];
        this.f17820l = new int[(i4 * 2)];
        C6296o oVar2 = cVar.f17776f;
        int i7 = 0;
        while (i2 < i) {
            this.f17819k[i7] = oVar2.f17810a;
            i2 += oVar2.f17812c - oVar2.f17811b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f17820l;
            iArr[i7] = i2;
            iArr[this.f17819k.length + i7] = oVar2.f17811b;
            oVar2.f17813d = true;
            i7++;
            oVar2 = oVar2.f17815f;
        }
    }

    /* renamed from: F */
    private int m25989F(int i) {
        int binarySearch = Arrays.binarySearch(this.f17820l, 0, this.f17819k.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    /* renamed from: G */
    private C6282f m25990G() {
        return new C6282f(mo17876B());
    }

    /* renamed from: A */
    public C6282f mo17875A() {
        return m25990G().mo17875A();
    }

    /* renamed from: B */
    public byte[] mo17876B() {
        int[] iArr = this.f17820l;
        byte[][] bArr = this.f17819k;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f17820l;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f17819k[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: D */
    public String mo17877D() {
        return m25990G().mo17877D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo17878E(C6277c cVar) {
        int length = this.f17819k.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f17820l;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C6296o oVar = new C6296o(this.f17819k[i], i3, (i3 + i4) - i2, true, false);
            C6296o oVar2 = cVar.f17776f;
            if (oVar2 == null) {
                oVar.f17816g = oVar;
                oVar.f17815f = oVar;
                cVar.f17776f = oVar;
            } else {
                oVar2.f17816g.mo17927c(oVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f17777g += (long) i2;
    }

    /* renamed from: e */
    public String mo17880e() {
        return m25990G().mo17880e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6282f) {
            C6282f fVar = (C6282f) obj;
            return fVar.mo17892x() == mo17892x() && mo17887t(0, fVar, 0, mo17892x());
        }
    }

    public int hashCode() {
        int i = this.f17783g;
        if (i != 0) {
            return i;
        }
        int length = this.f17819k.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f17819k[i2];
            int[] iArr = this.f17820l;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f17783g = i4;
        return i4;
    }

    /* renamed from: o */
    public byte mo17884o(int i) {
        C6303u.m26019b((long) this.f17820l[this.f17819k.length - 1], (long) i, 1);
        int F = m25989F(i);
        int i2 = F == 0 ? 0 : this.f17820l[F - 1];
        int[] iArr = this.f17820l;
        byte[][] bArr = this.f17819k;
        return bArr[F][(i - i2) + iArr[bArr.length + F]];
    }

    /* renamed from: q */
    public String mo17885q() {
        return m25990G().mo17885q();
    }

    /* renamed from: r */
    public C6282f mo17886r() {
        return m25990G().mo17886r();
    }

    /* renamed from: t */
    public boolean mo17887t(int i, C6282f fVar, int i2, int i3) {
        if (i < 0 || i > mo17892x() - i3) {
            return false;
        }
        int F = m25989F(i);
        while (i3 > 0) {
            int i4 = F == 0 ? 0 : this.f17820l[F - 1];
            int min = Math.min(i3, ((this.f17820l[F] - i4) + i4) - i);
            int[] iArr = this.f17820l;
            byte[][] bArr = this.f17819k;
            if (!fVar.mo17889u(i2, bArr[F], (i - i4) + iArr[bArr.length + F], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            F++;
        }
        return true;
    }

    public String toString() {
        return m25990G().toString();
    }

    /* renamed from: u */
    public boolean mo17889u(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo17892x() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int F = m25989F(i);
        while (i3 > 0) {
            int i4 = F == 0 ? 0 : this.f17820l[F - 1];
            int min = Math.min(i3, ((this.f17820l[F] - i4) + i4) - i);
            int[] iArr = this.f17820l;
            byte[][] bArr2 = this.f17819k;
            if (!C6303u.m26018a(bArr2[F], (i - i4) + iArr[bArr2.length + F], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            F++;
        }
        return true;
    }

    /* renamed from: v */
    public C6282f mo17890v() {
        return m25990G().mo17890v();
    }

    /* renamed from: w */
    public C6282f mo17891w() {
        return m25990G().mo17891w();
    }

    /* renamed from: x */
    public int mo17892x() {
        return this.f17820l[this.f17819k.length - 1];
    }

    /* renamed from: z */
    public C6282f mo17894z(int i, int i2) {
        return m25990G().mo17894z(i, i2);
    }
}
