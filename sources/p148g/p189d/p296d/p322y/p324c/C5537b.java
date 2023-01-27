package p148g.p189d.p296d.p322y.p324c;

import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5384p;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.y.c.b */
final class C5537b {

    /* renamed from: a */
    private final C5412b f16008a;

    /* renamed from: b */
    private final List<C5536a> f16009b = new ArrayList(5);

    /* renamed from: c */
    private final int f16010c;

    /* renamed from: d */
    private final int f16011d;

    /* renamed from: e */
    private final int f16012e;

    /* renamed from: f */
    private final int f16013f;

    /* renamed from: g */
    private final float f16014g;

    /* renamed from: h */
    private final int[] f16015h;

    /* renamed from: i */
    private final C5384p f16016i;

    C5537b(C5412b bVar, int i, int i2, int i3, int i4, float f, C5384p pVar) {
        this.f16008a = bVar;
        this.f16010c = i;
        this.f16011d = i2;
        this.f16012e = i3;
        this.f16013f = i4;
        this.f16014g = f;
        this.f16015h = new int[3];
        this.f16016i = pVar;
    }

    /* renamed from: a */
    private static float m22876a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m22877b(int i, int i2, int i3, int i4) {
        C5412b bVar = this.f16008a;
        int i5 = bVar.mo15670i();
        int[] iArr = this.f16015h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && bVar.mo15665e(i2, i6) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && !bVar.mo15665e(i2, i6) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i7 = i + 1;
            while (i7 < i5 && bVar.mo15665e(i2, i7) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i7++;
            }
            if (i7 != i5 && iArr[1] <= i3) {
                while (i7 < i5 && !bVar.mo15665e(i2, i7) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i7++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m22878d(iArr)) {
                    return m22876a(iArr, i7);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m22878d(int[] iArr) {
        float f = this.f16014g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C5536a m22879e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m22876a(iArr, i2);
        float b = m22877b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C5536a next : this.f16009b) {
            if (next.mo15939f(f, b, a)) {
                return next.mo15940g(b, a, f);
            }
        }
        C5536a aVar = new C5536a(a, b, f);
        this.f16009b.add(aVar);
        C5384p pVar = this.f16016i;
        if (pVar == null) {
            return null;
        }
        pVar.mo9796a(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5536a mo15941c() throws C5377i {
        C5536a e;
        C5536a e2;
        int i = this.f16010c;
        int i2 = this.f16013f;
        int i3 = this.f16012e + i;
        int i4 = this.f16011d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f16008a.mo15665e(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f16008a.mo15665e(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m22878d(iArr) && (e2 = m22879e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m22878d(iArr) && (e = m22879e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f16009b.isEmpty()) {
            return this.f16009b.get(0);
        }
        throw C5377i.m22193a();
    }
}
