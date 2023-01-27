package com.google.firebase.components;

/* renamed from: com.google.firebase.components.n */
public final class C2526n {

    /* renamed from: a */
    private final Class<?> f8208a;

    /* renamed from: b */
    private final int f8209b;

    /* renamed from: c */
    private final int f8210c;

    private C2526n(Class<?> cls, int i, int i2) {
        C2533u.m11341c(cls, "Null dependency anInterface.");
        this.f8208a = cls;
        this.f8209b = i;
        this.f8210c = i2;
    }

    /* renamed from: e */
    public static C2526n m11325e(Class<?> cls) {
        return new C2526n(cls, 0, 0);
    }

    /* renamed from: f */
    public static C2526n m11326f(Class<?> cls) {
        return new C2526n(cls, 1, 0);
    }

    /* renamed from: g */
    public static C2526n m11327g(Class<?> cls) {
        return new C2526n(cls, 2, 0);
    }

    /* renamed from: a */
    public Class<?> mo9393a() {
        return this.f8208a;
    }

    /* renamed from: b */
    public boolean mo9394b() {
        return this.f8210c == 0;
    }

    /* renamed from: c */
    public boolean mo9395c() {
        return this.f8209b == 1;
    }

    /* renamed from: d */
    public boolean mo9396d() {
        return this.f8209b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2526n)) {
            return false;
        }
        C2526n nVar = (C2526n) obj;
        return this.f8208a == nVar.f8208a && this.f8209b == nVar.f8209b && this.f8210c == nVar.f8210c;
    }

    public int hashCode() {
        return ((((this.f8208a.hashCode() ^ 1000003) * 1000003) ^ this.f8209b) * 1000003) ^ this.f8210c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8208a);
        sb.append(", type=");
        int i = this.f8209b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.f8210c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
