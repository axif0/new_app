package kotlinx.coroutines.p368c1;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.C6080v;
import kotlinx.coroutines.p368c1.C6031r;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.c1.q */
public class C6030q<T extends C6031r & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a */
    private T[] f16989a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C6030q.class, "_size");
    }

    /* renamed from: f */
    private final T[] m24658f() {
        T[] tArr = this.f16989a;
        if (tArr == null) {
            T[] tArr2 = new C6031r[4];
            this.f16989a = tArr2;
            return tArr2;
        } else if (mo17085c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo17085c() * 2);
            C5956g.m24497b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C6031r[]) copyOf;
            this.f16989a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m24659j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m24660k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo17085c()) {
                T[] tArr = this.f16989a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < mo17085c()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                C5956g.m24506k();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            C5956g.m24506k();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            C5956g.m24506k();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m24662m(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        C5956g.m24506k();
                        throw null;
                    }
                } else {
                    C5956g.m24506k();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m24661l(int i) {
        while (i > 0) {
            T[] tArr = this.f16989a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C5956g.m24506k();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m24662m(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C5956g.m24506k();
                    throw null;
                }
            } else {
                C5956g.m24506k();
                throw null;
            }
        }
    }

    /* renamed from: m */
    private final void m24662m(int i, int i2) {
        T[] tArr = this.f16989a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.mo17091e(i);
                    t2.mo17091e(i2);
                    return;
                }
                C5956g.m24506k();
                throw null;
            }
            C5956g.m24506k();
            throw null;
        }
        C5956g.m24506k();
        throw null;
    }

    /* renamed from: a */
    public final void mo17083a(T t) {
        C5956g.m24501f(t, "node");
        if (C6080v.m24813a()) {
            if (!(t.mo17094j() == null)) {
                throw new AssertionError();
            }
        }
        t.mo17093i(this);
        C6031r[] f = m24658f();
        int c = mo17085c();
        m24659j(c + 1);
        f[c] = t;
        t.mo17091e(c);
        m24661l(c);
    }

    /* renamed from: b */
    public final T mo17084b() {
        T[] tArr = this.f16989a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int mo17085c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo17086d() {
        return mo17085c() == 0;
    }

    /* renamed from: e */
    public final T mo17087e() {
        T b;
        synchronized (this) {
            b = mo17084b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo17088g(T t) {
        boolean z;
        C5956g.m24501f(t, "node");
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo17094j() == null) {
                z = false;
            } else {
                int g = t.mo17092g();
                if (C6080v.m24813a()) {
                    if (g >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo17089h(g);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo17089h(int i) {
        boolean z = false;
        if (C6080v.m24813a()) {
            if (!(mo17085c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f16989a;
        if (tArr != null) {
            m24659j(mo17085c() - 1);
            if (i < mo17085c()) {
                m24662m(i, mo17085c());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C5956g.m24506k();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m24662m(i, i2);
                            m24661l(i2);
                        }
                    } else {
                        C5956g.m24506k();
                        throw null;
                    }
                }
                m24660k(i);
            }
            T t3 = tArr[mo17085c()];
            if (t3 != null) {
                if (C6080v.m24813a()) {
                    if (t3.mo17094j() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.mo17093i((C6030q<?>) null);
                t3.mo17091e(-1);
                tArr[mo17085c()] = null;
                return t3;
            }
            C5956g.m24506k();
            throw null;
        }
        C5956g.m24506k();
        throw null;
    }

    /* renamed from: i */
    public final T mo17090i() {
        T h;
        synchronized (this) {
            h = mo17085c() > 0 ? mo17089h(0) : null;
        }
        return h;
    }
}
