package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.h0.m */
final class C3885m {

    /* renamed from: a */
    private final int f11750a;

    /* renamed from: b */
    private final int f11751b;

    /* renamed from: c */
    private final float f11752c;

    /* renamed from: d */
    private final float f11753d;

    /* renamed from: e */
    private final float f11754e;

    /* renamed from: f */
    private final int f11755f;

    /* renamed from: g */
    private final int f11756g;

    /* renamed from: h */
    private final int f11757h;

    /* renamed from: i */
    private final short[] f11758i;

    /* renamed from: j */
    private int f11759j;

    /* renamed from: k */
    private short[] f11760k;

    /* renamed from: l */
    private int f11761l;

    /* renamed from: m */
    private short[] f11762m;

    /* renamed from: n */
    private int f11763n;

    /* renamed from: o */
    private short[] f11764o;

    /* renamed from: p */
    private int f11765p = 0;

    /* renamed from: q */
    private int f11766q = 0;

    /* renamed from: r */
    private int f11767r;

    /* renamed from: s */
    private int f11768s;

    /* renamed from: t */
    private int f11769t;

    /* renamed from: u */
    private int f11770u;

    /* renamed from: v */
    private int f11771v = 0;

    /* renamed from: w */
    private int f11772w;

    /* renamed from: x */
    private int f11773x;

    /* renamed from: y */
    private int f11774y;

    public C3885m(int i, int i2, float f, float f2, int i3) {
        this.f11750a = i;
        this.f11751b = i2;
        this.f11755f = i / 400;
        int i4 = i / 65;
        this.f11756g = i4;
        int i5 = i4 * 2;
        this.f11757h = i5;
        this.f11758i = new short[i5];
        this.f11759j = i5;
        this.f11760k = new short[(i5 * i2)];
        this.f11761l = i5;
        this.f11762m = new short[(i5 * i2)];
        this.f11763n = i5;
        this.f11764o = new short[(i5 * i2)];
        this.f11752c = f;
        this.f11753d = f2;
        this.f11754e = ((float) i) / ((float) i3);
    }

    /* renamed from: a */
    private void m16272a(float f, int i) {
        int i2;
        int i3;
        if (this.f11768s != i) {
            int i4 = this.f11750a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m16283n(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f11769t;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f11765p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f11766q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        m16278g(1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f11751b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f11762m[(this.f11768s * i10) + i9] = m16282m(this.f11764o, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f11766q++;
                        this.f11768s++;
                    }
                    int i11 = i2 + 1;
                    this.f11765p = i11;
                    if (i11 == i4) {
                        this.f11765p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C4260a.m18074f(z);
                        this.f11766q = 0;
                    }
                    i6++;
                } else {
                    m16287t(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m16273b(float f) {
        int v;
        int i = this.f11767r;
        if (i >= this.f11757h) {
            int i2 = 0;
            do {
                if (this.f11770u > 0) {
                    v = m16274c(i2);
                } else {
                    int h = m16279h(this.f11760k, i2, true);
                    int i3 = (((double) f) > 1.0d ? 1 : (((double) f) == 1.0d ? 0 : -1));
                    short[] sArr = this.f11760k;
                    v = i3 > 0 ? h + m16289v(sArr, i2, f, h) : m16281l(sArr, i2, f, h);
                }
                i2 += v;
            } while (this.f11757h + i2 <= i);
            m16288u(i2);
        }
    }

    /* renamed from: c */
    private int m16274c(int i) {
        int min = Math.min(this.f11757h, this.f11770u);
        m16275d(this.f11760k, i, min);
        this.f11770u -= min;
        return min;
    }

    /* renamed from: d */
    private void m16275d(short[] sArr, int i, int i2) {
        m16278g(i2);
        int i3 = this.f11751b;
        System.arraycopy(sArr, i * i3, this.f11762m, this.f11768s * i3, i3 * i2);
        this.f11768s += i2;
    }

    /* renamed from: e */
    private void m16276e(short[] sArr, int i, int i2) {
        int i3 = this.f11757h / i2;
        int i4 = this.f11751b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f11758i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    private void m16277f(int i) {
        int i2 = this.f11767r + i;
        int i3 = this.f11759j;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f11759j = i4;
            this.f11760k = Arrays.copyOf(this.f11760k, i4 * this.f11751b);
        }
    }

    /* renamed from: g */
    private void m16278g(int i) {
        int i2 = this.f11768s + i;
        int i3 = this.f11761l;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f11761l = i4;
            this.f11762m = Arrays.copyOf(this.f11762m, i4 * this.f11751b);
        }
    }

    /* renamed from: h */
    private int m16279h(short[] sArr, int i, boolean z) {
        int i2;
        int i3 = this.f11750a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f11751b == 1 && i4 == 1) {
            i2 = m16280i(sArr, i, this.f11755f, this.f11756g);
        } else {
            m16276e(sArr, i, i4);
            int i5 = m16280i(this.f11758i, 0, this.f11755f / i4, this.f11756g / i4);
            if (i4 != 1) {
                int i6 = i5 * i4;
                int i7 = i4 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f11755f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f11756g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f11751b == 1) {
                    i2 = m16280i(sArr, i, i8, i9);
                } else {
                    m16276e(sArr, i, 1);
                    i2 = m16280i(this.f11758i, 0, i8, i9);
                }
            } else {
                i2 = i5;
            }
        }
        int i12 = m16285p(this.f11773x, this.f11774y, z) ? this.f11771v : i2;
        this.f11772w = this.f11773x;
        this.f11771v = i2;
        return i12;
    }

    /* renamed from: i */
    private int m16280i(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f11751b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f11773x = i5 / i7;
        this.f11774y = i8 / i6;
        return i7;
    }

    /* renamed from: l */
    private int m16281l(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f11770u = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        m16278g(i4);
        int i5 = this.f11751b;
        System.arraycopy(sArr, i * i5, this.f11762m, this.f11768s * i5, i5 * i2);
        m16284o(i3, this.f11751b, this.f11762m, this.f11768s + i2, sArr, i + i2, sArr, i);
        this.f11768s += i4;
        return i3;
    }

    /* renamed from: m */
    private short m16282m(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f11751b];
        int i4 = this.f11766q * i2;
        int i5 = this.f11765p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: n */
    private void m16283n(int i) {
        int i2 = this.f11768s - i;
        int i3 = this.f11769t + i2;
        int i4 = this.f11763n;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f11763n = i5;
            this.f11764o = Arrays.copyOf(this.f11764o, i5 * this.f11751b);
        }
        short[] sArr = this.f11762m;
        int i6 = this.f11751b;
        System.arraycopy(sArr, i * i6, this.f11764o, this.f11769t * i6, i6 * i2);
        this.f11768s = i;
        this.f11769t += i2;
    }

    /* renamed from: o */
    private static void m16284o(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: p */
    private boolean m16285p(int i, int i2, boolean z) {
        if (i == 0 || this.f11771v == 0) {
            return false;
        }
        return z ? i2 <= i * 3 && i * 2 > this.f11772w * 3 : i > this.f11772w;
    }

    /* renamed from: q */
    private void m16286q() {
        int i = this.f11768s;
        float f = this.f11752c;
        float f2 = this.f11753d;
        float f3 = f / f2;
        float f4 = this.f11754e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            m16273b(f3);
        } else {
            m16275d(this.f11760k, 0, this.f11767r);
            this.f11767r = 0;
        }
        if (f4 != 1.0f) {
            m16272a(f4, i);
        }
    }

    /* renamed from: t */
    private void m16287t(int i) {
        if (i != 0) {
            short[] sArr = this.f11764o;
            int i2 = this.f11751b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f11769t - i) * i2);
            this.f11769t -= i;
        }
    }

    /* renamed from: u */
    private void m16288u(int i) {
        int i2 = this.f11767r - i;
        short[] sArr = this.f11760k;
        int i3 = this.f11751b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f11767r = i2;
    }

    /* renamed from: v */
    private int m16289v(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f11770u = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        m16278g(i3);
        m16284o(i3, this.f11751b, this.f11762m, this.f11768s, sArr, i, sArr, i + i2);
        this.f11768s += i3;
        return i3;
    }

    /* renamed from: j */
    public void mo12646j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f11751b, this.f11768s);
        shortBuffer.put(this.f11762m, 0, this.f11751b * min);
        int i = this.f11768s - min;
        this.f11768s = i;
        short[] sArr = this.f11762m;
        int i2 = this.f11751b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int mo12647k() {
        return this.f11768s;
    }

    /* renamed from: r */
    public void mo12648r() {
        int i;
        int i2 = this.f11767r;
        float f = this.f11752c;
        float f2 = this.f11753d;
        int i3 = this.f11768s + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f11769t)) / (this.f11754e * f2)) + 0.5f));
        m16277f((this.f11757h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f11757h;
            int i5 = this.f11751b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f11760k[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f11767r += i * 2;
        m16286q();
        if (this.f11768s > i3) {
            this.f11768s = i3;
        }
        this.f11767r = 0;
        this.f11770u = 0;
        this.f11769t = 0;
    }

    /* renamed from: s */
    public void mo12649s(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f11751b;
        int i2 = remaining / i;
        m16277f(i2);
        shortBuffer.get(this.f11760k, this.f11767r * this.f11751b, ((i * i2) * 2) / 2);
        this.f11767r += i2;
        m16286q();
    }
}
