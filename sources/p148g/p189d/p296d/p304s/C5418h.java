package p148g.p189d.p296d.p304s;

import p148g.p189d.p296d.C5370b;
import p148g.p189d.p296d.C5375g;
import p148g.p189d.p296d.C5377i;

/* renamed from: g.d.d.s.h */
public class C5418h extends C5370b {

    /* renamed from: d */
    private static final byte[] f15685d = new byte[0];

    /* renamed from: b */
    private byte[] f15686b = f15685d;

    /* renamed from: c */
    private final int[] f15687c = new int[32];

    public C5418h(C5375g gVar) {
        super(gVar);
    }

    /* renamed from: f */
    private static int m22336f(int[] iArr) throws C5377i {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: g */
    private void m22337g(int i) {
        if (this.f15686b.length < i) {
            this.f15686b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f15687c[i2] = 0;
        }
    }

    /* renamed from: a */
    public C5412b mo15583a() throws C5377i {
        C5375g d = mo15586d();
        int d2 = d.mo15599d();
        int a = d.mo15596a();
        C5412b bVar = new C5412b(d2, a);
        m22337g(d2);
        int[] iArr = this.f15687c;
        for (int i = 1; i < 5; i++) {
            byte[] c = d.mo15598c((a * i) / 5, this.f15686b);
            int i2 = (d2 << 2) / 5;
            for (int i3 = d2 / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int f = m22336f(iArr);
        byte[] b = d.mo15597b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d2;
            for (int i7 = 0; i7 < d2; i7++) {
                if ((b[i6 + i7] & 255) < f) {
                    bVar.mo15675q(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public C5411a mo15584b(int i, C5411a aVar) throws C5377i {
        C5375g d = mo15586d();
        int d2 = d.mo15599d();
        if (aVar == null || aVar.mo15656i() < d2) {
            aVar = new C5411a(d2);
        } else {
            aVar.mo15647b();
        }
        m22337g(d2);
        byte[] c = d.mo15598c(i, this.f15686b);
        int[] iArr = this.f15687c;
        for (int i2 = 0; i2 < d2; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int f = m22336f(iArr);
        if (d2 < 3) {
            for (int i4 = 0; i4 < d2; i4++) {
                if ((c[i4] & 255) < f) {
                    aVar.mo15659p(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d2 - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < f) {
                    aVar.mo15659p(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }
}
