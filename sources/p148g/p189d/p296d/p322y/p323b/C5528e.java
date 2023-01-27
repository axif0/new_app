package p148g.p189d.p296d.p322y.p323b;

import java.util.Map;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p304s.p306n.C5425a;
import p148g.p189d.p296d.p304s.p306n.C5427c;
import p148g.p189d.p296d.p304s.p306n.C5428d;

/* renamed from: g.d.d.y.b.e */
public final class C5528e {

    /* renamed from: a */
    private final C5427c f15974a = new C5427c(C5425a.f15712l);

    /* renamed from: a */
    private void m22848a(byte[] bArr, int i) throws C5372d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f15974a.mo15724a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C5428d unused) {
            throw C5372d.m22177a();
        }
    }

    /* renamed from: c */
    private C5415e m22849c(C5515a aVar, Map<C5373e, ?> map) throws C5374f, C5372d {
        C5533j e = aVar.mo15914e();
        C5529f d = aVar.mo15913d().mo15923d();
        C5516b[] b = C5516b.m22827b(aVar.mo15912c(), e, d);
        int i = 0;
        for (C5516b c : b) {
            i += c.mo15918c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C5516b bVar : b) {
            byte[] a = bVar.mo15917a();
            int c2 = bVar.mo15918c();
            m22848a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C5526d.m22840a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C5415e mo15921b(C5412b bVar, Map<C5373e, ?> map) throws C5374f, C5372d {
        C5372d e;
        C5515a aVar = new C5515a(bVar);
        C5374f fVar = null;
        try {
            return m22849c(aVar, map);
        } catch (C5374f e2) {
            C5374f fVar2 = e2;
            e = null;
            fVar = fVar2;
            try {
                aVar.mo15915f();
                aVar.mo15916g(true);
                aVar.mo15914e();
                aVar.mo15913d();
                aVar.mo15911b();
                C5415e c = m22849c(aVar, map);
                c.mo15696m(new C5532i(true));
                return c;
            } catch (C5372d | C5374f unused) {
                if (fVar != null) {
                    throw fVar;
                }
                throw e;
            }
        } catch (C5372d e3) {
            e = e3;
            aVar.mo15915f();
            aVar.mo15916g(true);
            aVar.mo15914e();
            aVar.mo15913d();
            aVar.mo15911b();
            C5415e c2 = m22849c(aVar, map);
            c2.mo15696m(new C5532i(true));
            return c2;
        }
    }
}
