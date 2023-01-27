package p148g.p189d.p281b.p288k;

/* renamed from: g.d.b.k.a */
final class C5202a extends C5207f {

    /* renamed from: a */
    private final String f15256a;

    /* renamed from: b */
    private final String f15257b;

    C5202a(String str, String str2) {
        if (str != null) {
            this.f15256a = str;
            if (str2 != null) {
                this.f15257b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: b */
    public String mo15324b() {
        return this.f15256a;
    }

    /* renamed from: c */
    public String mo15325c() {
        return this.f15257b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5207f)) {
            return false;
        }
        C5207f fVar = (C5207f) obj;
        return this.f15256a.equals(fVar.mo15324b()) && this.f15257b.equals(fVar.mo15325c());
    }

    public int hashCode() {
        return ((this.f15256a.hashCode() ^ 1000003) * 1000003) ^ this.f15257b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f15256a + ", version=" + this.f15257b + "}";
    }
}
