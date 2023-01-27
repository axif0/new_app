package kotlinx.coroutines.p368c1;

import p351k.C5856n;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.c1.a */
public class C6000a<T> {

    /* renamed from: a */
    private Object[] f16948a = new Object[16];

    /* renamed from: b */
    private int f16949b;

    /* renamed from: c */
    private int f16950c;

    /* renamed from: b */
    private final void m24569b() {
        Object[] objArr = this.f16948a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C5864d.m24377c(objArr, objArr3, 0, this.f16949b, 0, 10, (Object) null);
        Object[] objArr4 = this.f16948a;
        int length2 = objArr4.length;
        int i = this.f16949b;
        Object[] unused2 = C5864d.m24377c(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f16948a = objArr3;
        this.f16949b = 0;
        this.f16950c = length;
    }

    /* renamed from: a */
    public final void mo17045a(T t) {
        C5956g.m24501f(t, "element");
        Object[] objArr = this.f16948a;
        int i = this.f16950c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f16950c = length;
        if (length == this.f16949b) {
            m24569b();
        }
    }

    /* renamed from: c */
    public final boolean mo17046c() {
        return this.f16949b == this.f16950c;
    }

    /* renamed from: d */
    public final T mo17047d() {
        int i = this.f16949b;
        if (i == this.f16950c) {
            return null;
        }
        T[] tArr = this.f16948a;
        T t = tArr[i];
        tArr[i] = null;
        this.f16949b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new C5856n("null cannot be cast to non-null type T");
    }
}
