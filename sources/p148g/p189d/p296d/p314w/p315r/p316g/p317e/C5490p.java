package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.C5374f;

/* renamed from: g.d.d.w.r.g.e.p */
final class C5490p extends C5491q {

    /* renamed from: b */
    private final int f15884b;

    /* renamed from: c */
    private final int f15885c;

    C5490p(int i, int i2, int i3) throws C5374f {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C5374f.m22179a();
        }
        this.f15884b = i2;
        this.f15885c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15820b() {
        return this.f15884b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15821c() {
        return this.f15885c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo15822d() {
        return this.f15884b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15823e() {
        return this.f15885c == 10;
    }
}
