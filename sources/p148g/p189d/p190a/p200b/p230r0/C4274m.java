package p148g.p189d.p190a.p200b.p230r0;

import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;

/* renamed from: g.d.a.b.r0.m */
public final class C4274m {

    /* renamed from: a */
    public byte[] f13643a;

    /* renamed from: b */
    private int f13644b;

    /* renamed from: c */
    private int f13645c;

    public C4274m() {
    }

    public C4274m(int i) {
        this.f13643a = new byte[i];
        this.f13645c = i;
    }

    public C4274m(byte[] bArr) {
        this.f13643a = bArr;
        this.f13645c = bArr.length;
    }

    public C4274m(byte[] bArr, int i) {
        this.f13643a = bArr;
        this.f13645c = i;
    }

    /* renamed from: A */
    public int mo13445A() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f13644b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: B */
    public int mo13446B() {
        int i = mo13464i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    /* renamed from: C */
    public long mo13447C() {
        long q = mo13472q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    /* renamed from: D */
    public int mo13448D() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        this.f13644b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: E */
    public long mo13449E() {
        int i;
        int i2;
        long j = (long) this.f13643a[this.f13644b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f13643a[this.f13644b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f13644b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: F */
    public void mo13450F() {
        this.f13644b = 0;
        this.f13645c = 0;
    }

    /* renamed from: G */
    public void mo13451G(int i) {
        mo13452H(mo13457b() < i ? new byte[i] : this.f13643a, i);
    }

    /* renamed from: H */
    public void mo13452H(byte[] bArr, int i) {
        this.f13643a = bArr;
        this.f13645c = i;
        this.f13644b = 0;
    }

    /* renamed from: I */
    public void mo13453I(int i) {
        C4260a.m18069a(i >= 0 && i <= this.f13643a.length);
        this.f13645c = i;
    }

    /* renamed from: J */
    public void mo13454J(int i) {
        C4260a.m18069a(i >= 0 && i <= this.f13645c);
        this.f13644b = i;
    }

    /* renamed from: K */
    public void mo13455K(int i) {
        mo13454J(this.f13644b + i);
    }

    /* renamed from: a */
    public int mo13456a() {
        return this.f13645c - this.f13644b;
    }

    /* renamed from: b */
    public int mo13457b() {
        byte[] bArr = this.f13643a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public int mo13458c() {
        return this.f13644b;
    }

    /* renamed from: d */
    public int mo13459d() {
        return this.f13645c;
    }

    /* renamed from: e */
    public char mo13460e() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: f */
    public void mo13461f(C4273l lVar, int i) {
        mo13462g(lVar.f13639a, 0, i);
        lVar.mo13441m(0);
    }

    /* renamed from: g */
    public void mo13462g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13643a, this.f13644b, bArr, i, i2);
        this.f13644b += i2;
    }

    /* renamed from: h */
    public double mo13463h() {
        return Double.longBitsToDouble(mo13472q());
    }

    /* renamed from: i */
    public int mo13464i() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f13644b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f13644b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: j */
    public int mo13465j() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        byte b = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f13644b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: k */
    public String mo13466k() {
        if (mo13456a() == 0) {
            return null;
        }
        int i = this.f13644b;
        while (i < this.f13645c && !C4284w.m18258x(this.f13643a[i])) {
            i++;
        }
        int i2 = this.f13644b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f13643a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f13644b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f13643a;
        int i3 = this.f13644b;
        String str = new String(bArr2, i3, i - i3);
        this.f13644b = i;
        int i4 = this.f13645c;
        if (i == i4) {
            return str;
        }
        if (this.f13643a[i] == 13) {
            int i5 = i + 1;
            this.f13644b = i5;
            if (i5 == i4) {
                return str;
            }
        }
        byte[] bArr3 = this.f13643a;
        int i6 = this.f13644b;
        if (bArr3[i6] == 10) {
            this.f13644b = i6 + 1;
        }
        return str;
    }

    /* renamed from: l */
    public int mo13467l() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f13644b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f13644b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: m */
    public long mo13468m() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        int i4 = i3 + 1;
        this.f13644b = i4;
        int i5 = i4 + 1;
        this.f13644b = i5;
        int i6 = i5 + 1;
        this.f13644b = i6;
        int i7 = i6 + 1;
        this.f13644b = i7;
        int i8 = i7 + 1;
        this.f13644b = i8;
        this.f13644b = i8 + 1;
        return ((((long) bArr[i8]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48);
    }

    /* renamed from: n */
    public long mo13469n() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        int i4 = i3 + 1;
        this.f13644b = i4;
        this.f13644b = i4 + 1;
        return ((((long) bArr[i4]) & 255) << 24) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
    }

    /* renamed from: o */
    public int mo13470o() {
        int l = mo13467l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    /* renamed from: p */
    public int mo13471p() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        this.f13644b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: q */
    public long mo13472q() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        int i4 = i3 + 1;
        this.f13644b = i4;
        int i5 = i4 + 1;
        this.f13644b = i5;
        int i6 = i5 + 1;
        this.f13644b = i6;
        int i7 = i6 + 1;
        this.f13644b = i7;
        int i8 = i7 + 1;
        this.f13644b = i8;
        this.f13644b = i8 + 1;
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    /* renamed from: r */
    public String mo13473r() {
        if (mo13456a() == 0) {
            return null;
        }
        int i = this.f13644b;
        while (i < this.f13645c && this.f13643a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f13643a;
        int i2 = this.f13644b;
        String str = new String(bArr, i2, i - i2);
        this.f13644b = i;
        if (i < this.f13645c) {
            this.f13644b = i + 1;
        }
        return str;
    }

    /* renamed from: s */
    public String mo13474s(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = (this.f13644b + i) - 1;
        String str = new String(this.f13643a, this.f13644b, (i2 >= this.f13645c || this.f13643a[i2] != 0) ? i : i - 1);
        this.f13644b += i;
        return str;
    }

    /* renamed from: t */
    public short mo13475t() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        this.f13644b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: u */
    public String mo13476u(int i) {
        return mo13477v(i, Charset.forName("UTF-8"));
    }

    /* renamed from: v */
    public String mo13477v(int i, Charset charset) {
        String str = new String(this.f13643a, this.f13644b, i, charset);
        this.f13644b += i;
        return str;
    }

    /* renamed from: w */
    public int mo13478w() {
        return (mo13479x() << 21) | (mo13479x() << 14) | (mo13479x() << 7) | mo13479x();
    }

    /* renamed from: x */
    public int mo13479x() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        this.f13644b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: y */
    public int mo13480y() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f13644b = i3 + 2;
        return b;
    }

    /* renamed from: z */
    public long mo13481z() {
        byte[] bArr = this.f13643a;
        int i = this.f13644b;
        int i2 = i + 1;
        this.f13644b = i2;
        int i3 = i2 + 1;
        this.f13644b = i3;
        int i4 = i3 + 1;
        this.f13644b = i4;
        this.f13644b = i4 + 1;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }
}
