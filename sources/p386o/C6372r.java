package p386o;

import p374m.C6113c0;
import p374m.C6117d0;

/* renamed from: o.r */
public final class C6372r<T> {

    /* renamed from: a */
    private final C6113c0 f17974a;

    /* renamed from: b */
    private final T f17975b;

    /* renamed from: c */
    private final C6117d0 f17976c;

    private C6372r(C6113c0 c0Var, T t, C6117d0 d0Var) {
        this.f17974a = c0Var;
        this.f17975b = t;
        this.f17976c = d0Var;
    }

    /* renamed from: c */
    public static <T> C6372r<T> m26183c(C6117d0 d0Var, C6113c0 c0Var) {
        C6379w.m26209b(d0Var, "body == null");
        C6379w.m26209b(c0Var, "rawResponse == null");
        if (!c0Var.mo17276u()) {
            return new C6372r<>(c0Var, (Object) null, d0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static <T> C6372r<T> m26184f(T t, C6113c0 c0Var) {
        C6379w.m26209b(c0Var, "rawResponse == null");
        if (c0Var.mo17276u()) {
            return new C6372r<>(c0Var, t, (C6117d0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T mo17993a() {
        return this.f17975b;
    }

    /* renamed from: b */
    public int mo17994b() {
        return this.f17974a.mo17270m();
    }

    /* renamed from: d */
    public boolean mo17995d() {
        return this.f17974a.mo17276u();
    }

    /* renamed from: e */
    public String mo17996e() {
        return this.f17974a.mo17277w();
    }

    public String toString() {
        return this.f17974a.toString();
    }
}
