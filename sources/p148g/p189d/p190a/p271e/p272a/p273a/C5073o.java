package p148g.p189d.p190a.p271e.p272a.p273a;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.a.o */
final class C5073o extends C5102g {

    /* renamed from: g */
    final /* synthetic */ C5163p f15085g;

    /* renamed from: h */
    final /* synthetic */ String f15086h;

    /* renamed from: i */
    final /* synthetic */ C5077s f15087i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5073o(C5077s sVar, C5163p pVar, C5163p pVar2, String str) {
        super(pVar);
        this.f15087i = sVar;
        this.f15085g = pVar2;
        this.f15086h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            this.f15087i.f15095a.mo15223f().mo15218p0(this.f15087i.f15096b, C5077s.m21427j(), new C5075q(this.f15087i, this.f15085g));
        } catch (RemoteException e) {
            C5077s.f15093e.mo15204d(e, "completeUpdate(%s)", this.f15086h);
            this.f15085g.mo15264d(new RuntimeException(e));
        }
    }
}
