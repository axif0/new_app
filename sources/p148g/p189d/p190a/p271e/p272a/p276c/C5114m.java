package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.e.a.c.m */
final class C5114m extends C5102g {

    /* renamed from: g */
    final /* synthetic */ IBinder f15143g;

    /* renamed from: h */
    final /* synthetic */ C5118o f15144h;

    C5114m(C5118o oVar, IBinder iBinder) {
        this.f15144h = oVar;
        this.f15143g = iBinder;
    }

    /* renamed from: a */
    public final void mo9144a() {
        C5120p pVar = this.f15144h.f15146a;
        pVar.f15158k = (IInterface) pVar.f15154g.mo9182a(this.f15143g);
        C5120p.m21519n(this.f15144h.f15146a);
        this.f15144h.f15146a.f15152e = false;
        for (Runnable run : this.f15144h.f15146a.f15151d) {
            run.run();
        }
        this.f15144h.f15146a.f15151d.clear();
    }
}
