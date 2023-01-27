package p148g.p189d.p296d.p314w;

import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.e */
public final class C5451e extends C5462p {

    /* renamed from: i */
    static final int[] f15797i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h */
    private final int[] f15798h = new int[4];

    /* renamed from: t */
    private static void m22485t(StringBuilder sb, int i) throws C5377i {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f15797i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo15753m(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i {
        int[] iArr2 = this.f15798h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.mo15656i();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int k = C5462p.m22531k(aVar, iArr2, i2, C5462p.f15823g);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        m22485t(sb, i3);
        int i6 = C5462p.m22532o(aVar, i2, true, C5462p.f15821e)[1];
        for (int i7 = 0; i7 < 6 && i6 < i; i7++) {
            sb.append((char) (C5462p.m22531k(aVar, iArr2, i6, C5462p.f15822f) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5369a mo15754r() {
        return C5369a.EAN_13;
    }
}
