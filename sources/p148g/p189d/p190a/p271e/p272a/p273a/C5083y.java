package p148g.p189d.p190a.p271e.p272a.p273a;

/* renamed from: g.d.a.e.a.a.y */
final class C5083y extends C5061d {

    /* renamed from: a */
    private final int f15119a;

    /* renamed from: b */
    private final boolean f15120b;

    /* synthetic */ C5083y(int i, boolean z) {
        this.f15119a = i;
        this.f15120b = z;
    }

    /* renamed from: a */
    public final boolean mo15172a() {
        return this.f15120b;
    }

    /* renamed from: b */
    public final int mo15173b() {
        return this.f15119a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5061d) {
            C5061d dVar = (C5061d) obj;
            return this.f15119a == dVar.mo15173b() && this.f15120b == dVar.mo15172a();
        }
    }

    public final int hashCode() {
        return ((this.f15119a ^ 1000003) * 1000003) ^ (true != this.f15120b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f15119a;
        boolean z = this.f15120b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
