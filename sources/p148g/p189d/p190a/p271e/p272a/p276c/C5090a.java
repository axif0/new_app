package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.a */
public final class C5090a extends C5109j0 implements C5094c {
    C5090a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* renamed from: y0 */
    public final void mo15199y0(String str, Bundle bundle, C5098e eVar) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21501b(n, eVar);
        mo15213r(2, n);
    }
}
