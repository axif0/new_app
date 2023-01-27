package p148g.p189d.p190a.p200b.p204k0.p209s;

/* renamed from: g.d.a.b.k0.s.i */
final class C3993i {

    /* renamed from: a */
    private final byte[] f12435a;

    /* renamed from: b */
    private final int f12436b;

    /* renamed from: c */
    private int f12437c;

    /* renamed from: d */
    private int f12438d;

    public C3993i(byte[] bArr) {
        this.f12435a = bArr;
        this.f12436b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f12436b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16819a() {
        /*
            r2 = this;
            int r0 = r2.f12437c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f12436b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f12438d
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
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p209s.C3993i.m16819a():void");
    }

    /* renamed from: b */
    public int mo12842b() {
        return (this.f12437c * 8) + this.f12438d;
    }

    /* renamed from: c */
    public boolean mo12843c() {
        boolean z = (((this.f12435a[this.f12437c] & 255) >> this.f12438d) & 1) == 1;
        mo12845e(1);
        return z;
    }

    /* renamed from: d */
    public int mo12844d(int i) {
        int i2 = this.f12437c;
        int min = Math.min(i, 8 - this.f12438d);
        int i3 = i2 + 1;
        int i4 = ((this.f12435a[i2] & 255) >> this.f12438d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f12435a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo12845e(i);
        return i5;
    }

    /* renamed from: e */
    public void mo12845e(int i) {
        int i2 = i / 8;
        int i3 = this.f12437c + i2;
        this.f12437c = i3;
        int i4 = this.f12438d + (i - (i2 * 8));
        this.f12438d = i4;
        if (i4 > 7) {
            this.f12437c = i3 + 1;
            this.f12438d = i4 - 8;
        }
        m16819a();
    }
}
