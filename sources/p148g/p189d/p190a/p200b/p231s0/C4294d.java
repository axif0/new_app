package p148g.p189d.p190a.p200b.p231s0;

import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.s0.d */
public final class C4294d {

    /* renamed from: a */
    public final List<byte[]> f13696a;

    /* renamed from: b */
    public final int f13697b;

    private C4294d(List<byte[]> list, int i) {
        this.f13696a = list;
        this.f13697b = i;
    }

    /* renamed from: a */
    public static C4294d m18280a(C4274m mVar) throws C4313u {
        try {
            mVar.mo13455K(21);
            int x = mVar.mo13479x() & 3;
            int x2 = mVar.mo13479x();
            int c = mVar.mo13458c();
            int i = 0;
            for (int i2 = 0; i2 < x2; i2++) {
                mVar.mo13455K(1);
                int D = mVar.mo13448D();
                for (int i3 = 0; i3 < D; i3++) {
                    int D2 = mVar.mo13448D();
                    i += D2 + 4;
                    mVar.mo13455K(D2);
                }
            }
            mVar.mo13454J(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < x2; i5++) {
                mVar.mo13455K(1);
                int D3 = mVar.mo13448D();
                for (int i6 = 0; i6 < D3; i6++) {
                    int D4 = mVar.mo13448D();
                    System.arraycopy(C4270k.f13622a, 0, bArr, i4, C4270k.f13622a.length);
                    int length = i4 + C4270k.f13622a.length;
                    System.arraycopy(mVar.f13643a, mVar.mo13458c(), bArr, length, D4);
                    i4 = length + D4;
                    mVar.mo13455K(D4);
                }
            }
            return new C4294d(i == 0 ? null : Collections.singletonList(bArr), x + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4313u("Error parsing HEVC config", e);
        }
    }
}
