package p148g.p189d.p190a.p200b;

import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.e0 */
public final class C3837e0 {

    /* renamed from: c */
    public static final C3837e0 f11542c = new C3837e0(0, 0);

    /* renamed from: d */
    public static final C3837e0 f11543d = f11542c;

    /* renamed from: a */
    public final long f11544a;

    /* renamed from: b */
    public final long f11545b;

    static {
        new C3837e0(Long.MAX_VALUE, Long.MAX_VALUE);
        new C3837e0(Long.MAX_VALUE, 0);
        new C3837e0(0, Long.MAX_VALUE);
    }

    public C3837e0(long j, long j2) {
        boolean z = true;
        C4260a.m18069a(j >= 0);
        C4260a.m18069a(j2 < 0 ? false : z);
        this.f11544a = j;
        this.f11545b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3837e0.class != obj.getClass()) {
            return false;
        }
        C3837e0 e0Var = (C3837e0) obj;
        return this.f11544a == e0Var.f11544a && this.f11545b == e0Var.f11545b;
    }

    public int hashCode() {
        return (((int) this.f11544a) * 31) + ((int) this.f11545b);
    }
}
