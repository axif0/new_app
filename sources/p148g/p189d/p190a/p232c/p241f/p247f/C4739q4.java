package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.q4 */
final class C4739q4<E> extends C4448a4<E> {

    /* renamed from: j */
    static final C4448a4<Object> f14412j = new C4739q4(new Object[0], 0);

    /* renamed from: h */
    private final transient Object[] f14413h;

    /* renamed from: i */
    private final transient int f14414i;

    C4739q4(Object[] objArr, int i) {
        this.f14413h = objArr;
        this.f14414i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13776c(Object[] objArr, int i) {
        System.arraycopy(this.f14413h, 0, objArr, i, this.f14414i);
        return i + this.f14414i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object[] mo13841f() {
        return this.f14413h;
    }

    public final E get(int i) {
        C4447a3.m18700a(i, this.f14414i);
        return this.f14413h[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo13842h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo13843j() {
        return this.f14414i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13844m() {
        return false;
    }

    public final int size() {
        return this.f14414i;
    }
}
