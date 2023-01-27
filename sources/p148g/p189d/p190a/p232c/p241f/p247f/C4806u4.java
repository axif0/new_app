package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.u4 */
final class C4806u4<K> extends C4633k4<K> {

    /* renamed from: h */
    private final transient C4560g4<K, ?> f14561h;

    /* renamed from: i */
    private final transient C4448a4<K> f14562i;

    C4806u4(C4560g4<K, ?> g4Var, C4448a4<K> a4Var) {
        this.f14561h = g4Var;
        this.f14562i = a4Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13776c(Object[] objArr, int i) {
        return mo14334p().mo13776c(objArr, i);
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f14561h.get(obj) != null;
    }

    /* renamed from: d */
    public final C4855x4<K> iterator() {
        return (C4855x4) mo14334p().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13844m() {
        return true;
    }

    /* renamed from: p */
    public final C4448a4<K> mo14334p() {
        return this.f14562i;
    }

    public final int size() {
        return this.f14561h.size();
    }
}
