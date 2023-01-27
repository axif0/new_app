package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.c0 */
final class C5999c0 implements C6052j0 {

    /* renamed from: f */
    private final boolean f16947f;

    public C5999c0(boolean z) {
        this.f16947f = z;
    }

    /* renamed from: a */
    public C6077t0 mo17042a() {
        return null;
    }

    /* renamed from: d */
    public boolean mo17043d() {
        return this.f16947f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo17043d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
