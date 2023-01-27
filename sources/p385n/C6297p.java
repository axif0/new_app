package p385n;

/* renamed from: n.p */
final class C6297p {

    /* renamed from: a */
    static C6296o f17817a;

    /* renamed from: b */
    static long f17818b;

    private C6297p() {
    }

    /* renamed from: a */
    static void m25987a(C6296o oVar) {
        if (oVar.f17815f != null || oVar.f17816g != null) {
            throw new IllegalArgumentException();
        } else if (!oVar.f17813d) {
            synchronized (C6297p.class) {
                if (f17818b + 8192 <= 65536) {
                    f17818b += 8192;
                    oVar.f17815f = f17817a;
                    oVar.f17812c = 0;
                    oVar.f17811b = 0;
                    f17817a = oVar;
                }
            }
        }
    }

    /* renamed from: b */
    static C6296o m25988b() {
        synchronized (C6297p.class) {
            if (f17817a == null) {
                return new C6296o();
            }
            C6296o oVar = f17817a;
            f17817a = oVar.f17815f;
            oVar.f17815f = null;
            f17818b -= 8192;
            return oVar;
        }
    }
}
