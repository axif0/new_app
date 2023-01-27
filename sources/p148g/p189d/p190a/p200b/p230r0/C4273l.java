package p148g.p189d.p190a.p200b.p230r0;

/* renamed from: g.d.a.b.r0.l */
public final class C4273l {

    /* renamed from: a */
    public byte[] f13639a;

    /* renamed from: b */
    private int f13640b;

    /* renamed from: c */
    private int f13641c;

    /* renamed from: d */
    private int f13642d;

    public C4273l() {
    }

    public C4273l(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C4273l(byte[] bArr, int i) {
        this.f13639a = bArr;
        this.f13642d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13642d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18129a() {
        /*
            r2 = this;
            int r0 = r2.f13640b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13642d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13641c
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
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p230r0.C4273l.m18129a():void");
    }

    /* renamed from: b */
    public int mo13430b() {
        return ((this.f13642d - this.f13640b) * 8) - this.f13641c;
    }

    /* renamed from: c */
    public void mo13431c() {
        if (this.f13641c != 0) {
            this.f13641c = 0;
            this.f13640b++;
            m18129a();
        }
    }

    /* renamed from: d */
    public int mo13432d() {
        C4260a.m18074f(this.f13641c == 0);
        return this.f13640b;
    }

    /* renamed from: e */
    public int mo13433e() {
        return (this.f13640b * 8) + this.f13641c;
    }

    /* renamed from: f */
    public void mo13434f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f13641c, i2);
        int i3 = this.f13641c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f13639a;
        int i5 = this.f13640b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f13639a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f13639a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        mo13443o(i2);
        m18129a();
    }

    /* renamed from: g */
    public boolean mo13435g() {
        boolean z = (this.f13639a[this.f13640b] & (128 >> this.f13641c)) != 0;
        mo13442n();
        return z;
    }

    /* renamed from: h */
    public int mo13436h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f13641c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f13641c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f13641c = i4;
            byte[] bArr = this.f13639a;
            int i5 = this.f13640b;
            this.f13640b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f13639a;
        int i6 = this.f13640b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13641c = 0;
            this.f13640b = i6 + 1;
        }
        m18129a();
        return i7;
    }

    /* renamed from: i */
    public void mo13437i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f13639a;
            int i4 = this.f13640b;
            int i5 = i4 + 1;
            this.f13640b = i5;
            byte b = bArr2[i4];
            int i6 = this.f13641c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f13641c;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f13639a;
                int i9 = this.f13640b;
                this.f13640b = i9 + 1;
                bArr[i3] = (byte) (b2 | ((byte) ((bArr3[i9] & 255) << i8)));
                this.f13641c = i8 - 8;
            }
            int i10 = this.f13641c + i7;
            this.f13641c = i10;
            byte[] bArr4 = this.f13639a;
            int i11 = this.f13640b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f13641c = 0;
                this.f13640b = i11 + 1;
            }
            m18129a();
        }
    }

    /* renamed from: j */
    public void mo13438j(byte[] bArr, int i, int i2) {
        C4260a.m18074f(this.f13641c == 0);
        System.arraycopy(this.f13639a, this.f13640b, bArr, i, i2);
        this.f13640b += i2;
        m18129a();
    }

    /* renamed from: k */
    public void mo13439k(byte[] bArr) {
        mo13440l(bArr, bArr.length);
    }

    /* renamed from: l */
    public void mo13440l(byte[] bArr, int i) {
        this.f13639a = bArr;
        this.f13640b = 0;
        this.f13641c = 0;
        this.f13642d = i;
    }

    /* renamed from: m */
    public void mo13441m(int i) {
        int i2 = i / 8;
        this.f13640b = i2;
        this.f13641c = i - (i2 * 8);
        m18129a();
    }

    /* renamed from: n */
    public void mo13442n() {
        int i = this.f13641c + 1;
        this.f13641c = i;
        if (i == 8) {
            this.f13641c = 0;
            this.f13640b++;
        }
        m18129a();
    }

    /* renamed from: o */
    public void mo13443o(int i) {
        int i2 = i / 8;
        int i3 = this.f13640b + i2;
        this.f13640b = i3;
        int i4 = this.f13641c + (i - (i2 * 8));
        this.f13641c = i4;
        if (i4 > 7) {
            this.f13640b = i3 + 1;
            this.f13641c = i4 - 8;
        }
        m18129a();
    }

    /* renamed from: p */
    public void mo13444p(int i) {
        C4260a.m18074f(this.f13641c == 0);
        this.f13640b += i;
        m18129a();
    }
}
