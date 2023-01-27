package p148g.p189d.p190a.p271e.p272a.p276c;

import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.c.g */
public abstract class C5102g implements Runnable {

    /* renamed from: f */
    private final C5163p<?> f15133f;

    C5102g() {
        this.f15133f = null;
    }

    public C5102g(C5163p<?> pVar) {
        this.f15133f = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9144a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5163p<?> mo15208b() {
        return this.f15133f;
    }

    public final void run() {
        try {
            mo9144a();
        } catch (Exception e) {
            C5163p<?> pVar = this.f15133f;
            if (pVar != null) {
                pVar.mo15264d(e);
            }
        }
    }
}
