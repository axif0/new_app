package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import p148g.p189d.p190a.p191a.p192i.C3749h;
import p148g.p189d.p190a.p191a.p192i.C3755l;

/* renamed from: g.d.a.a.i.v.j.b */
final class C3782b extends C3795h {

    /* renamed from: a */
    private final long f11468a;

    /* renamed from: b */
    private final C3755l f11469b;

    /* renamed from: c */
    private final C3749h f11470c;

    C3782b(long j, C3755l lVar, C3749h hVar) {
        this.f11468a = j;
        if (lVar != null) {
            this.f11469b = lVar;
            if (hVar != null) {
                this.f11470c = hVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public C3749h mo12374b() {
        return this.f11470c;
    }

    /* renamed from: c */
    public long mo12375c() {
        return this.f11468a;
    }

    /* renamed from: d */
    public C3755l mo12376d() {
        return this.f11469b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3795h)) {
            return false;
        }
        C3795h hVar = (C3795h) obj;
        return this.f11468a == hVar.mo12375c() && this.f11469b.equals(hVar.mo12376d()) && this.f11470c.equals(hVar.mo12374b());
    }

    public int hashCode() {
        long j = this.f11468a;
        return this.f11470c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11469b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f11468a + ", transportContext=" + this.f11469b + ", event=" + this.f11470c + "}";
    }
}
