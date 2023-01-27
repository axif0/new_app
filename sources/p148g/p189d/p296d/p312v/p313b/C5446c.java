package p148g.p189d.p296d.p312v.p313b;

import java.util.Map;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p304s.p306n.C5425a;
import p148g.p189d.p296d.p304s.p306n.C5427c;
import p148g.p189d.p296d.p304s.p306n.C5428d;

/* renamed from: g.d.d.v.b.c */
public final class C5446c {

    /* renamed from: a */
    private final C5427c f15779a = new C5427c(C5425a.f15715o);

    /* renamed from: a */
    private void m22461a(byte[] bArr, int i, int i2, int i3, int i4) throws C5372d {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f15779a.mo15724a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C5428d unused) {
            throw C5372d.m22177a();
        }
    }

    /* renamed from: b */
    public C5415e mo15751b(C5412b bVar, Map<C5373e, ?> map) throws C5374f, C5372d {
        int i;
        byte[] a = new C5444a(bVar).mo15750a();
        m22461a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr = a;
            m22461a(bArr, 20, 84, 40, 1);
            m22461a(bArr, 20, 84, 40, 2);
            i = 94;
        } else if (b == 5) {
            byte[] bArr2 = a;
            m22461a(bArr2, 20, 68, 56, 1);
            m22461a(bArr2, 20, 68, 56, 2);
            i = 78;
        } else {
            throw C5374f.m22179a();
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(a, 0, bArr3, 0, 10);
        System.arraycopy(a, 20, bArr3, 10, bArr3.length - 10);
        return C5445b.m22452a(bArr3, b);
    }
}
