package p340io.realm;

import p340io.realm.internal.OsList;

/* renamed from: io.realm.s */
abstract class C5788s<T> {

    /* renamed from: a */
    final C5632b f16784a;

    /* renamed from: b */
    final OsList f16785b;

    /* renamed from: c */
    final Class<T> f16786c;

    C5788s(C5632b bVar, OsList osList, Class<T> cls) {
        this.f16784a = bVar;
        this.f16786c = cls;
        this.f16785b = osList;
    }

    /* renamed from: b */
    private void m24193b() {
        this.f16785b.mo16405i();
    }

    /* renamed from: a */
    public final void mo16780a(Object obj) {
        mo16249d(obj);
        if (obj == null) {
            m24193b();
        } else {
            mo16248c(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo16248c(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16249d(Object obj);

    /* renamed from: e */
    public abstract T mo16250e(int i);

    /* renamed from: f */
    public final OsList mo16781f() {
        return this.f16785b;
    }

    /* renamed from: g */
    public final void mo16782g(int i, Object obj) {
        mo16249d(obj);
        if (obj == null) {
            mo16737h(i);
        } else {
            mo16251i(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16737h(int i) {
        this.f16785b.mo16416t((long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo16251i(int i, Object obj);

    /* renamed from: j */
    public final boolean mo16783j() {
        return this.f16785b.mo16419w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo16784k(int i) {
        this.f16785b.mo16420x((long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo16785l() {
        this.f16785b.mo16421y();
    }

    /* renamed from: m */
    public final T mo16786m(int i, Object obj) {
        mo16249d(obj);
        T e = mo16250e(i);
        if (obj == null) {
            mo16738n(i);
        } else {
            mo16252o(i, obj);
        }
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo16738n(int i) {
        this.f16785b.mo16393F((long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo16252o(int i, Object obj);

    /* renamed from: p */
    public final int mo16787p() {
        long I = this.f16785b.mo16396I();
        if (I < 2147483647L) {
            return (int) I;
        }
        return Integer.MAX_VALUE;
    }
}
