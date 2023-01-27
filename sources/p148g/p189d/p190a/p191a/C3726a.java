package p148g.p189d.p190a.p191a;

/* renamed from: g.d.a.a.a */
final class C3726a<T> extends C3728c<T> {

    /* renamed from: a */
    private final Integer f11362a;

    /* renamed from: b */
    private final T f11363b;

    /* renamed from: c */
    private final C3729d f11364c;

    C3726a(Integer num, T t, C3729d dVar) {
        this.f11362a = num;
        if (t != null) {
            this.f11363b = t;
            if (dVar != null) {
                this.f11364c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public Integer mo12277a() {
        return this.f11362a;
    }

    /* renamed from: b */
    public T mo12278b() {
        return this.f11363b;
    }

    /* renamed from: c */
    public C3729d mo12279c() {
        return this.f11364c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3728c)) {
            return false;
        }
        C3728c cVar = (C3728c) obj;
        Integer num = this.f11362a;
        if (num != null ? num.equals(cVar.mo12277a()) : cVar.mo12277a() == null) {
            return this.f11363b.equals(cVar.mo12278b()) && this.f11364c.equals(cVar.mo12279c());
        }
    }

    public int hashCode() {
        Integer num = this.f11362a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f11363b.hashCode()) * 1000003) ^ this.f11364c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f11362a + ", payload=" + this.f11363b + ", priority=" + this.f11364c + "}";
    }
}
