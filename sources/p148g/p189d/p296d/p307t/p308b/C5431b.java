package p148g.p189d.p296d.p307t.p308b;

import p148g.p189d.p296d.p307t.p308b.C5436e;

/* renamed from: g.d.d.t.b.b */
final class C5431b {

    /* renamed from: a */
    private final int f15731a;

    /* renamed from: b */
    private final byte[] f15732b;

    private C5431b(int i, byte[] bArr) {
        this.f15731a = i;
        this.f15732b = bArr;
    }

    /* renamed from: b */
    static C5431b[] m22401b(byte[] bArr, C5436e eVar) {
        C5436e.C5439c d = eVar.mo15732d();
        C5436e.C5438b[] a = d.mo15740a();
        int i = 0;
        for (C5436e.C5438b a2 : a) {
            i += a2.mo15738a();
        }
        C5431b[] bVarArr = new C5431b[i];
        int i2 = 0;
        for (C5436e.C5438b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo15738a()) {
                int b = bVar.mo15739b();
                bVarArr[i2] = new C5431b(b, new byte[(d.mo15741b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f15732b.length - d.mo15741b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f15732b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.mo15736i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f15732b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f15732b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f15732b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo15727a() {
        return this.f15732b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15728c() {
        return this.f15731a;
    }
}
