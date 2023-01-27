package p148g.p189d.p296d.p304s;

import java.util.Arrays;

/* renamed from: g.d.d.s.a */
public final class C5411a implements Cloneable {

    /* renamed from: f */
    private int[] f15634f;

    /* renamed from: g */
    private int f15635g;

    public C5411a() {
        this.f15635g = 0;
        this.f15634f = new int[1];
    }

    public C5411a(int i) {
        this.f15635g = i;
        this.f15634f = m22287l(i);
    }

    C5411a(int[] iArr, int i) {
        this.f15634f = iArr;
        this.f15635g = i;
    }

    /* renamed from: l */
    private static int[] m22287l(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: b */
    public void mo15647b() {
        int length = this.f15634f.length;
        for (int i = 0; i < length; i++) {
            this.f15634f[i] = 0;
        }
    }

    /* renamed from: c */
    public C5411a clone() {
        return new C5411a((int[]) this.f15634f.clone(), this.f15635g);
    }

    /* renamed from: d */
    public boolean mo15650d(int i) {
        return ((1 << (i & 31)) & this.f15634f[i / 32]) != 0;
    }

    /* renamed from: e */
    public int[] mo15651e() {
        return this.f15634f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5411a)) {
            return false;
        }
        C5411a aVar = (C5411a) obj;
        return this.f15635g == aVar.f15635g && Arrays.equals(this.f15634f, aVar.f15634f);
    }

    /* renamed from: f */
    public int mo15653f(int i) {
        int i2 = this.f15635g;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f15634f[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f15634f;
            if (i3 == iArr.length) {
                return this.f15635g;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f15635g;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: g */
    public int mo15654g(int i) {
        int i2 = this.f15635g;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (this.f15634f[i3] ^ -1);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f15634f;
            if (i3 == iArr.length) {
                return this.f15635g;
            }
            i4 = iArr[i3] ^ -1;
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f15635g;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int hashCode() {
        return (this.f15635g * 31) + Arrays.hashCode(this.f15634f);
    }

    /* renamed from: i */
    public int mo15656i() {
        return this.f15635g;
    }

    /* renamed from: k */
    public boolean mo15657k(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f15635g) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f15634f[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: n */
    public void mo15658n() {
        int[] iArr = new int[this.f15634f.length];
        int i = (this.f15635g - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f15634f[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f15635g;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f15634f = iArr;
    }

    /* renamed from: p */
    public void mo15659p(int i) {
        int[] iArr = this.f15634f;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: q */
    public void mo15660q(int i, int i2) {
        this.f15634f[i / 32] = i2;
    }

    public String toString() {
        int i = this.f15635g;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f15635g; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo15650d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
