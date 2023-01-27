package p148g.p189d.p296d.p314w.p315r;

/* renamed from: g.d.d.w.r.b */
public class C5465b {

    /* renamed from: a */
    private final int f15836a;

    /* renamed from: b */
    private final int f15837b;

    public C5465b(int i, int i2) {
        this.f15836a = i;
        this.f15837b = i2;
    }

    /* renamed from: a */
    public final int mo15768a() {
        return this.f15837b;
    }

    /* renamed from: b */
    public final int mo15769b() {
        return this.f15836a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5465b)) {
            return false;
        }
        C5465b bVar = (C5465b) obj;
        return this.f15836a == bVar.f15836a && this.f15837b == bVar.f15837b;
    }

    public final int hashCode() {
        return this.f15836a ^ this.f15837b;
    }

    public final String toString() {
        return this.f15836a + "(" + this.f15837b + ')';
    }
}
