package p148g.p189d.p296d.p314w;

import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.f */
public final class C5452f extends C5462p {

    /* renamed from: h */
    private final int[] f15799h = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo15753m(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i {
        int[] iArr2 = this.f15799h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.mo15656i();
        int i2 = iArr[1];
        for (int i3 = 0; i3 < 4 && i2 < i; i3++) {
            sb.append((char) (C5462p.m22531k(aVar, iArr2, i2, C5462p.f15822f) + 48));
            for (int i4 : iArr2) {
                i2 += i4;
            }
        }
        int i5 = C5462p.m22532o(aVar, i2, true, C5462p.f15821e)[1];
        for (int i6 = 0; i6 < 4 && i5 < i; i6++) {
            sb.append((char) (C5462p.m22531k(aVar, iArr2, i5, C5462p.f15822f) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5369a mo15754r() {
        return C5369a.EAN_8;
    }
}
