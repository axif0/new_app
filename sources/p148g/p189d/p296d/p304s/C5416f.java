package p148g.p189d.p296d.p304s;

import p148g.p189d.p296d.C5377i;

/* renamed from: g.d.d.s.f */
public final class C5416f extends C5419i {
    /* renamed from: c */
    public C5412b mo15697c(C5412b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C5377i {
        C5412b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo15698d(bVar, i, i2, C5421k.m22349b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C5412b mo15698d(C5412b bVar, int i, int i2, C5421k kVar) throws C5377i {
        if (i <= 0 || i2 <= 0) {
            throw C5377i.m22193a();
        }
        C5412b bVar2 = new C5412b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.mo15703f(fArr);
            C5419i.m22340a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo15665e((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo15675q(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C5377i.m22193a();
                }
            }
        }
        return bVar2;
    }
}
