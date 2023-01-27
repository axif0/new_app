package p148g.p189d.p296d.p307t.p308b;

import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p304s.p306n.C5425a;
import p148g.p189d.p296d.p304s.p306n.C5427c;
import p148g.p189d.p296d.p304s.p306n.C5428d;

/* renamed from: g.d.d.t.b.d */
public final class C5435d {

    /* renamed from: a */
    private final C5427c f15747a = new C5427c(C5425a.f15713m);

    /* renamed from: a */
    private void m22413a(byte[] bArr, int i) throws C5372d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f15747a.mo15724a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C5428d unused) {
            throw C5372d.m22177a();
        }
    }

    /* renamed from: b */
    public C5415e mo15729b(C5412b bVar) throws C5374f, C5372d {
        C5430a aVar = new C5430a(bVar);
        C5431b[] b = C5431b.m22401b(aVar.mo15726c(), aVar.mo15725b());
        int i = 0;
        for (C5431b c : b) {
            i += c.mo15728c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C5431b bVar2 = b[i2];
            byte[] a = bVar2.mo15727a();
            int c2 = bVar2.mo15728c();
            m22413a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C5432c.m22404a(bArr);
    }
}
