package p148g.p189d.p190a.p200b.p231s0;

import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p230r0.C4262c;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.s0.a */
public final class C4288a {

    /* renamed from: a */
    public final List<byte[]> f13673a;

    /* renamed from: b */
    public final int f13674b;

    /* renamed from: c */
    public final int f13675c;

    /* renamed from: d */
    public final int f13676d;

    /* renamed from: e */
    public final float f13677e;

    private C4288a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f13673a = list;
        this.f13674b = i;
        this.f13675c = i2;
        this.f13676d = i3;
        this.f13677e = f;
    }

    /* renamed from: a */
    private static byte[] m18268a(C4274m mVar) {
        int D = mVar.mo13448D();
        int c = mVar.mo13458c();
        mVar.mo13455K(D);
        return C4262c.m18080b(mVar.f13643a, c, D);
    }

    /* renamed from: b */
    public static C4288a m18269b(C4274m mVar) throws C4313u {
        float f;
        int i;
        int i2;
        try {
            mVar.mo13455K(4);
            int x = (mVar.mo13479x() & 3) + 1;
            if (x != 3) {
                ArrayList arrayList = new ArrayList();
                int x2 = mVar.mo13479x() & 31;
                for (int i3 = 0; i3 < x2; i3++) {
                    arrayList.add(m18268a(mVar));
                }
                int x3 = mVar.mo13479x();
                for (int i4 = 0; i4 < x3; i4++) {
                    arrayList.add(m18268a(mVar));
                }
                if (x2 > 0) {
                    C4270k.C4272b i5 = C4270k.m18126i((byte[]) arrayList.get(0), x, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.f13630b;
                    int i7 = i5.f13631c;
                    f = i5.f13632d;
                    i2 = i6;
                    i = i7;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C4288a(arrayList, x, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4313u("Error parsing AVC config", e);
        }
    }
}
