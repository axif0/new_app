package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.e.i */
abstract class C5482i extends C5481h {
    C5482i(C5411a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo15797h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo15798i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo15802j(StringBuilder sb, int i, int i2) {
        int f = mo15803b().mo15827f(i, i2);
        mo15797h(sb, f);
        int i3 = mo15798i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
