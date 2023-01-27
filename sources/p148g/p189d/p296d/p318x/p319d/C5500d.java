package p148g.p189d.p296d.p318x.p319d;

/* renamed from: g.d.d.x.d.d */
final class C5500d {

    /* renamed from: a */
    private final int f15915a;

    /* renamed from: b */
    private final int f15916b;

    /* renamed from: c */
    private final int f15917c;

    /* renamed from: d */
    private final int f15918d;

    /* renamed from: e */
    private int f15919e = -1;

    C5500d(int i, int i2, int i3, int i4) {
        this.f15915a = i;
        this.f15916b = i2;
        this.f15917c = i3;
        this.f15918d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15856a() {
        return this.f15917c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15857b() {
        return this.f15916b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15858c() {
        return this.f15919e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15859d() {
        return this.f15915a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15860e() {
        return this.f15918d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15861f() {
        return this.f15916b - this.f15915a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo15862g() {
        return mo15863h(this.f15919e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo15863h(int i) {
        return i != -1 && this.f15917c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo15864i(int i) {
        this.f15919e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo15865j() {
        this.f15919e = ((this.f15918d / 30) * 3) + (this.f15917c / 3);
    }

    public String toString() {
        return this.f15919e + "|" + this.f15918d;
    }
}
