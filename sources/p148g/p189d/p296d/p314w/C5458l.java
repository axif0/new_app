package p148g.p189d.p296d.p314w;

import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5371c;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.l */
public final class C5458l extends C5462p {

    /* renamed from: h */
    private final C5462p f15811h = new C5451e();

    /* renamed from: t */
    private static C5381m m22513t(C5381m mVar) throws C5374f {
        String f = mVar.mo15614f();
        if (f.charAt(0) == '0') {
            C5381m mVar2 = new C5381m(f.substring(1), (byte[]) null, mVar.mo15613e(), C5369a.UPC_A);
            if (mVar.mo15612d() != null) {
                mVar2.mo15615g(mVar.mo15612d());
            }
            return mVar2;
        }
        throw C5374f.m22179a();
    }

    /* renamed from: a */
    public C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i, C5374f {
        return m22513t(this.f15811h.mo15603a(cVar, map));
    }

    /* renamed from: c */
    public C5381m mo15605c(C5371c cVar) throws C5377i, C5374f {
        return m22513t(this.f15811h.mo15605c(cVar));
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i, C5374f, C5372d {
        return m22513t(this.f15811h.mo15752d(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo15753m(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i {
        return this.f15811h.mo15753m(aVar, iArr, sb);
    }

    /* renamed from: n */
    public C5381m mo15756n(int i, C5411a aVar, int[] iArr, Map<C5373e, ?> map) throws C5377i, C5374f, C5372d {
        return m22513t(this.f15811h.mo15756n(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5369a mo15754r() {
        return C5369a.UPC_A;
    }
}
