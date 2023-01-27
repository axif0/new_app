package p148g.p189d.p190a.p200b.p228p0;

import java.util.Arrays;

/* renamed from: g.d.a.b.p0.f */
public final class C4231f {

    /* renamed from: a */
    public final int f13529a;

    /* renamed from: b */
    private final C4229e[] f13530b;

    /* renamed from: c */
    private int f13531c;

    public C4231f(C4229e... eVarArr) {
        this.f13530b = eVarArr;
        this.f13529a = eVarArr.length;
    }

    /* renamed from: a */
    public C4229e mo13357a(int i) {
        return this.f13530b[i];
    }

    /* renamed from: b */
    public C4229e[] mo13358b() {
        return (C4229e[]) this.f13530b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4231f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13530b, ((C4231f) obj).f13530b);
    }

    public int hashCode() {
        if (this.f13531c == 0) {
            this.f13531c = 527 + Arrays.hashCode(this.f13530b);
        }
        return this.f13531c;
    }
}
