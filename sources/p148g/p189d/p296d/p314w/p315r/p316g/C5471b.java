package p148g.p189d.p296d.p314w.p315r.p316g;

import java.util.Objects;
import p148g.p189d.p296d.p314w.p315r.C5465b;
import p148g.p189d.p296d.p314w.p315r.C5466c;

/* renamed from: g.d.d.w.r.g.b */
final class C5471b {

    /* renamed from: a */
    private final C5465b f15852a;

    /* renamed from: b */
    private final C5465b f15853b;

    /* renamed from: c */
    private final C5466c f15854c;

    C5471b(C5465b bVar, C5465b bVar2, C5466c cVar) {
        this.f15852a = bVar;
        this.f15853b = bVar2;
        this.f15854c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5466c mo15781a() {
        return this.f15854c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5465b mo15782b() {
        return this.f15852a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5465b mo15783c() {
        return this.f15853b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo15784d() {
        return this.f15853b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5471b)) {
            return false;
        }
        C5471b bVar = (C5471b) obj;
        return Objects.equals(this.f15852a, bVar.f15852a) && Objects.equals(this.f15853b, bVar.f15853b) && Objects.equals(this.f15854c, bVar.f15854c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f15852a) ^ Objects.hashCode(this.f15853b)) ^ Objects.hashCode(this.f15854c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f15852a);
        sb.append(" , ");
        sb.append(this.f15853b);
        sb.append(" : ");
        C5466c cVar = this.f15854c;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.mo15775c()));
        sb.append(" ]");
        return sb.toString();
    }
}
