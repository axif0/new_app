package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.y0 */
public final class C5139y0 extends C5109j0 implements C5141z0 {
    C5139y0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: e */
    public final void mo15236e(Bundle bundle) throws RemoteException {
        Parcel n = mo15212n();
        C5113l0.m21502c(n, bundle);
        mo15213r(3, n);
    }

    /* renamed from: h */
    public final void mo15237h(Bundle bundle) throws RemoteException {
        Parcel n = mo15212n();
        C5113l0.m21502c(n, bundle);
        mo15213r(4, n);
    }

    /* renamed from: s */
    public final void mo15238s(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel n = mo15212n();
        C5113l0.m21502c(n, bundle);
        C5113l0.m21502c(n, bundle2);
        mo15213r(2, n);
    }
}
