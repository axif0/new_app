package p148g.p189d.p296d.p322y.p323b;

import p148g.p189d.p296d.p322y.p323b.C5533j;

/* renamed from: g.d.d.y.b.b */
final class C5516b {

    /* renamed from: a */
    private final int f15961a;

    /* renamed from: b */
    private final byte[] f15962b;

    private C5516b(int i, byte[] bArr) {
        this.f15961a = i;
        this.f15962b = bArr;
    }

    /* renamed from: b */
    static C5516b[] m22827b(byte[] bArr, C5533j jVar, C5529f fVar) {
        if (bArr.length == jVar.mo15932h()) {
            C5533j.C5535b f = jVar.mo15931f(fVar);
            C5533j.C5534a[] a = f.mo15937a();
            int i = 0;
            for (C5533j.C5534a a2 : a) {
                i += a2.mo15935a();
            }
            C5516b[] bVarArr = new C5516b[i];
            int i2 = 0;
            for (C5533j.C5534a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo15935a()) {
                    int b = aVar.mo15936b();
                    bVarArr[i2] = new C5516b(b, new byte[(f.mo15938b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f15962b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f15962b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo15938b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f15962b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f15962b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f15962b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f15962b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo15917a() {
        return this.f15962b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15918c() {
        return this.f15961a;
    }
}
