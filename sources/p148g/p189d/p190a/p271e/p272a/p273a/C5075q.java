package p148g.p189d.p190a.p271e.p272a.p273a;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p274b.C5085a;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.a.q */
final class C5075q extends C5074p<Void> {
    C5075q(C5077s sVar, C5163p<Void> pVar) {
        super(sVar, new C5100f("OnCompleteUpdateCallback"), pVar);
    }

    /* renamed from: h */
    public final void mo15179h(Bundle bundle) throws RemoteException {
        super.mo15179h(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f15089b.mo15264d(new C5085a(bundle.getInt("error.code", -2)));
        } else {
            this.f15089b.mo15265e(null);
        }
    }
}
