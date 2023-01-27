package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.e.j */
public abstract class C5483j {

    /* renamed from: a */
    private final C5411a f15870a;

    /* renamed from: b */
    private final C5493s f15871b;

    C5483j(C5411a aVar) {
        this.f15870a = aVar;
        this.f15871b = new C5493s(aVar);
    }

    /* renamed from: a */
    public static C5483j m22623a(C5411a aVar) {
        if (aVar.mo15650d(1)) {
            return new C5480g(aVar);
        }
        if (!aVar.mo15650d(2)) {
            return new C5484k(aVar);
        }
        int g = C5493s.m22654g(aVar, 1, 4);
        if (g == 4) {
            return new C5474a(aVar);
        }
        if (g == 5) {
            return new C5475b(aVar);
        }
        int g2 = C5493s.m22654g(aVar, 1, 5);
        if (g2 == 12) {
            return new C5476c(aVar);
        }
        if (g2 == 13) {
            return new C5477d(aVar);
        }
        switch (C5493s.m22654g(aVar, 1, 7)) {
            case 56:
                return new C5478e(aVar, "310", "11");
            case 57:
                return new C5478e(aVar, "320", "11");
            case 58:
                return new C5478e(aVar, "310", "13");
            case 59:
                return new C5478e(aVar, "320", "13");
            case 60:
                return new C5478e(aVar, "310", "15");
            case 61:
                return new C5478e(aVar, "320", "15");
            case 62:
                return new C5478e(aVar, "310", "17");
            case 63:
                return new C5478e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5493s mo15803b() {
        return this.f15871b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C5411a mo15804c() {
        return this.f15870a;
    }

    /* renamed from: d */
    public abstract String mo15799d() throws C5377i, C5374f;
}
