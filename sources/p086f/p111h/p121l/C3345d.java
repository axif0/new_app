package p086f.p111h.p121l;

/* renamed from: f.h.l.d */
public class C3345d<F, S> {

    /* renamed from: a */
    public final F f10638a;

    /* renamed from: b */
    public final S f10639b;

    public boolean equals(Object obj) {
        if (!(obj instanceof C3345d)) {
            return false;
        }
        C3345d dVar = (C3345d) obj;
        return C3344c.m14350a(dVar.f10638a, this.f10638a) && C3344c.m14350a(dVar.f10639b, this.f10639b);
    }

    public int hashCode() {
        F f = this.f10638a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f10639b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f10638a) + " " + String.valueOf(this.f10639b) + "}";
    }
}
