package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

/* renamed from: g.d.d.w.r.g.e.m */
final class C5486m {

    /* renamed from: a */
    private int f15874a = 0;

    /* renamed from: b */
    private C5487a f15875b = C5487a.NUMERIC;

    /* renamed from: g.d.d.w.r.g.e.m$a */
    private enum C5487a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C5486m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15807a() {
        return this.f15874a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15808b(int i) {
        this.f15874a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo15809c() {
        return this.f15875b == C5487a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo15810d() {
        return this.f15875b == C5487a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo15811e() {
        this.f15875b = C5487a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15812f() {
        this.f15875b = C5487a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15813g() {
        this.f15875b = C5487a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo15814h(int i) {
        this.f15874a = i;
    }
}
