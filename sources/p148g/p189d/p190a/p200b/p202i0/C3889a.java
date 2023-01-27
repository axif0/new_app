package p148g.p189d.p190a.p200b.p202i0;

/* renamed from: g.d.a.b.i0.a */
public abstract class C3889a {

    /* renamed from: f */
    private int f11799f;

    /* renamed from: j */
    public final void mo12654j(int i) {
        this.f11799f = i | this.f11799f;
    }

    /* renamed from: k */
    public void mo12655k() {
        this.f11799f = 0;
    }

    /* renamed from: l */
    public final void mo12656l(int i) {
        this.f11799f = (i ^ -1) & this.f11799f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo12657m(int i) {
        return (this.f11799f & i) == i;
    }

    /* renamed from: n */
    public final boolean mo12658n() {
        return mo12657m(Integer.MIN_VALUE);
    }

    /* renamed from: o */
    public final boolean mo12659o() {
        return mo12657m(4);
    }

    /* renamed from: q */
    public final boolean mo12660q() {
        return mo12657m(1);
    }

    /* renamed from: r */
    public final void mo12661r(int i) {
        this.f11799f = i;
    }
}
