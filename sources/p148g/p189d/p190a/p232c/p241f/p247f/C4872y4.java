package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.y4 */
final class C4872y4<E> extends C4633k4<E> {

    /* renamed from: h */
    private final transient E f14641h;

    /* renamed from: i */
    private transient int f14642i;

    C4872y4(E e) {
        C4447a3.m18701b(e);
        this.f14641h = e;
    }

    C4872y4(E e, int i) {
        this.f14641h = e;
        this.f14642i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14331a() {
        return this.f14642i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13776c(Object[] objArr, int i) {
        objArr[i] = this.f14641h;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f14641h.equals(obj);
    }

    /* renamed from: d */
    public final C4855x4<E> iterator() {
        return new C4651l4(this.f14641h);
    }

    public final int hashCode() {
        int i = this.f14642i;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f14641h.hashCode();
        this.f14642i = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13844m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C4448a4<E> mo14335q() {
        return C4448a4.m18708p(this.f14641h);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f14641h.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
