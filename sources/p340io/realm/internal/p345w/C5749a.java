package p340io.realm.internal.p345w;

/* renamed from: io.realm.internal.w.a */
public class C5749a<F, S> {

    /* renamed from: a */
    public F f16588a;

    /* renamed from: b */
    public S f16589b;

    public C5749a(F f, S s) {
        this.f16588a = f;
        this.f16589b = s;
    }

    /* renamed from: a */
    private boolean m24018a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5749a)) {
            return false;
        }
        C5749a aVar = (C5749a) obj;
        return m24018a(aVar.f16588a, this.f16588a) && m24018a(aVar.f16589b, this.f16589b);
    }

    public int hashCode() {
        F f = this.f16588a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f16589b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f16588a) + " " + String.valueOf(this.f16589b) + "}";
    }
}
