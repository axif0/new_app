package p148g.p189d.p190a.p200b.p230r0;

/* renamed from: g.d.a.b.r0.n */
public final class C4275n {

    /* renamed from: a */
    private byte[] f13646a;

    /* renamed from: b */
    private int f13647b;

    /* renamed from: c */
    private int f13648c;

    /* renamed from: d */
    private int f13649d;

    public C4275n(byte[] bArr, int i, int i2) {
        mo13488i(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13647b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18182a() {
        /*
            r2 = this;
            int r0 = r2.f13648c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13647b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13649d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p230r0.C4275n.m18182a():void");
    }

    /* renamed from: f */
    private int m18183f() {
        int i = 0;
        int i2 = 0;
        while (!mo13484d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo13485e(i2);
        }
        return i3 + i;
    }

    /* renamed from: j */
    private boolean m18184j(int i) {
        if (2 <= i && i < this.f13647b) {
            byte[] bArr = this.f13646a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: b */
    public boolean mo13482b(int i) {
        int i2 = this.f13648c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f13649d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f13647b) {
                int i6 = this.f13647b;
            } else if (m18184j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f13647b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo13483c() {
        int i = this.f13648c;
        int i2 = this.f13649d;
        int i3 = 0;
        while (this.f13648c < this.f13647b && !mo13484d()) {
            i3++;
        }
        boolean z = this.f13648c == this.f13647b;
        this.f13648c = i;
        this.f13649d = i2;
        return !z && mo13482b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public boolean mo13484d() {
        boolean z = (this.f13646a[this.f13648c] & (128 >> this.f13649d)) != 0;
        mo13489k();
        return z;
    }

    /* renamed from: e */
    public int mo13485e(int i) {
        int i2;
        int i3;
        this.f13649d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f13649d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f13649d = i5;
            byte[] bArr = this.f13646a;
            int i6 = this.f13648c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m18184j(i6 + 1)) {
                i3 = 1;
            }
            this.f13648c = i6 + i3;
        }
        byte[] bArr2 = this.f13646a;
        int i7 = this.f13648c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13649d = 0;
            if (!m18184j(i7 + 1)) {
                i3 = 1;
            }
            this.f13648c = i7 + i3;
        }
        m18182a();
        return i8;
    }

    /* renamed from: g */
    public int mo13486g() {
        int f = m18183f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: h */
    public int mo13487h() {
        return m18183f();
    }

    /* renamed from: i */
    public void mo13488i(byte[] bArr, int i, int i2) {
        this.f13646a = bArr;
        this.f13648c = i;
        this.f13647b = i2;
        this.f13649d = 0;
        m18182a();
    }

    /* renamed from: k */
    public void mo13489k() {
        int i = 1;
        int i2 = this.f13649d + 1;
        this.f13649d = i2;
        if (i2 == 8) {
            this.f13649d = 0;
            int i3 = this.f13648c;
            if (m18184j(i3 + 1)) {
                i = 2;
            }
            this.f13648c = i3 + i;
        }
        m18182a();
    }

    /* renamed from: l */
    public void mo13490l(int i) {
        int i2 = this.f13648c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f13648c = i4;
        int i5 = this.f13649d + (i - (i3 * 8));
        this.f13649d = i5;
        if (i5 > 7) {
            this.f13648c = i4 + 1;
            this.f13649d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13648c) {
                m18182a();
                return;
            } else if (m18184j(i2)) {
                this.f13648c++;
                i2 += 2;
            }
        }
    }
}
