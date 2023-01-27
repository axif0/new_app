package p148g.p189d.p190a.p191a;

/* renamed from: g.d.a.a.b */
public final class C3727b {

    /* renamed from: a */
    private final String f11365a;

    private C3727b(String str) {
        if (str != null) {
            this.f11365a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C3727b m15581b(String str) {
        return new C3727b(str);
    }

    /* renamed from: a */
    public String mo12283a() {
        return this.f11365a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3727b)) {
            return false;
        }
        return this.f11365a.equals(((C3727b) obj).f11365a);
    }

    public int hashCode() {
        return this.f11365a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f11365a + "\"}";
    }
}
