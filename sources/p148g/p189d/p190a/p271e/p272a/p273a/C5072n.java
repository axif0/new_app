package p148g.p189d.p190a.p271e.p272a.p273a;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.a.n */
final class C5072n extends C5102g {

    /* renamed from: g */
    final /* synthetic */ String f15082g;

    /* renamed from: h */
    final /* synthetic */ C5163p f15083h;

    /* renamed from: i */
    final /* synthetic */ C5077s f15084i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5072n(C5077s sVar, C5163p pVar, String str, C5163p pVar2) {
        super(pVar);
        this.f15084i = sVar;
        this.f15082g = str;
        this.f15083h = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            this.f15084i.f15095a.mo15223f().mo15217C0(this.f15084i.f15096b, C5077s.m21421b(this.f15084i, this.f15082g), new C5076r(this.f15084i, this.f15083h, this.f15082g));
        } catch (RemoteException e) {
            C5077s.f15093e.mo15204d(e, "requestUpdateInfo(%s)", this.f15082g);
            this.f15083h.mo15264d(new RuntimeException(e));
        }
    }
}
