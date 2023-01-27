package p148g.p189d.p190a.p271e.p272a.p273a;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p274b.C5085a;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.a.r */
final class C5076r extends C5074p<C5056a> {

    /* renamed from: d */
    private final String f15091d;

    /* renamed from: e */
    final /* synthetic */ C5077s f15092e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5076r(C5077s sVar, C5163p<C5056a> pVar, String str) {
        super(sVar, new C5100f("OnRequestInstallCallback"), pVar);
        this.f15092e = sVar;
        this.f15091d = str;
    }

    /* renamed from: e */
    public final void mo15178e(Bundle bundle) throws RemoteException {
        super.mo15178e(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f15089b.mo15264d(new C5085a(bundle.getInt("error.code", -2)));
        } else {
            this.f15089b.mo15265e(C5077s.m21422c(this.f15092e, bundle, this.f15091d));
        }
    }
}
