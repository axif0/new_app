package p148g.p189d.p296d.p314w.p315r.p316g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g.d.d.w.r.g.c */
final class C5472c {

    /* renamed from: a */
    private final List<C5471b> f15855a;

    /* renamed from: b */
    private final int f15856b;

    /* renamed from: c */
    private final boolean f15857c;

    C5472c(List<C5471b> list, int i, boolean z) {
        this.f15855a = new ArrayList(list);
        this.f15856b = i;
        this.f15857c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C5471b> mo15788a() {
        return this.f15855a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15789b() {
        return this.f15856b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo15790c(List<C5471b> list) {
        return this.f15855a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5472c)) {
            return false;
        }
        C5472c cVar = (C5472c) obj;
        return this.f15855a.equals(cVar.mo15788a()) && this.f15857c == cVar.f15857c;
    }

    public int hashCode() {
        return this.f15855a.hashCode() ^ Boolean.valueOf(this.f15857c).hashCode();
    }

    public String toString() {
        return "{ " + this.f15855a + " }";
    }
}
