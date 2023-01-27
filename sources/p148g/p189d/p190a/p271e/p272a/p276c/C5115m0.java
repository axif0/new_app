package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.m0 */
public final class C5115m0 extends C5109j0 implements C5119o0 {
    C5115m0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: C0 */
    public final void mo15217C0(String str, Bundle bundle, C5123q0 q0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21501b(n, q0Var);
        mo15213r(2, n);
    }

    /* renamed from: p0 */
    public final void mo15218p0(String str, Bundle bundle, C5123q0 q0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21501b(n, q0Var);
        mo15213r(3, n);
    }
}
