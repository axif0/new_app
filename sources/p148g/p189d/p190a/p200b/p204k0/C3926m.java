package p148g.p189d.p190a.p200b.p204k0;

/* renamed from: g.d.a.b.k0.m */
public final class C3926m {

    /* renamed from: c */
    public static final C3926m f11914c = new C3926m(0, 0);

    /* renamed from: a */
    public final long f11915a;

    /* renamed from: b */
    public final long f11916b;

    public C3926m(long j, long j2) {
        this.f11915a = j;
        this.f11916b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3926m.class != obj.getClass()) {
            return false;
        }
        C3926m mVar = (C3926m) obj;
        return this.f11915a == mVar.f11915a && this.f11916b == mVar.f11916b;
    }

    public int hashCode() {
        return (((int) this.f11915a) * 31) + ((int) this.f11916b);
    }

    public String toString() {
        return "[timeUs=" + this.f11915a + ", position=" + this.f11916b + "]";
    }
}
