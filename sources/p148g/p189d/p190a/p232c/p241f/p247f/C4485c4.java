package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.c4 */
final class C4485c4 extends C4448a4<E> {

    /* renamed from: h */
    private final transient int f14014h;

    /* renamed from: i */
    private final transient int f14015i;

    /* renamed from: j */
    private final /* synthetic */ C4448a4 f14016j;

    C4485c4(C4448a4 a4Var, int i, int i2) {
        this.f14016j = a4Var;
        this.f14014h = i;
        this.f14015i = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object[] mo13841f() {
        return this.f14016j.mo13841f();
    }

    public final E get(int i) {
        C4447a3.m18700a(i, this.f14015i);
        return this.f14016j.get(i + this.f14014h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo13842h() {
        return this.f14016j.mo13842h() + this.f14014h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo13843j() {
        return this.f14016j.mo13842h() + this.f14014h + this.f14015i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13844m() {
        return true;
    }

    /* renamed from: o */
    public final C4448a4<E> subList(int i, int i2) {
        C4447a3.m18704e(i, i2, this.f14015i);
        C4448a4 a4Var = this.f14016j;
        int i3 = this.f14014h;
        return (C4448a4) a4Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f14015i;
    }
}
