package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: g.d.a.e.a.c.r0 */
public final class C5125r0 extends C5109j0 implements C5129t0 {
    C5125r0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: K0 */
    public final void mo15225K0(String str, Bundle bundle, Bundle bundle2, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21502c(n, bundle2);
        C5113l0.m21501b(n, v0Var);
        mo15213r(6, n);
    }

    /* renamed from: M */
    public final void mo15226M(String str, Bundle bundle, Bundle bundle2, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21502c(n, bundle2);
        C5113l0.m21501b(n, v0Var);
        mo15213r(7, n);
    }

    /* renamed from: k0 */
    public final void mo15227k0(String str, Bundle bundle, Bundle bundle2, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21502c(n, bundle2);
        C5113l0.m21501b(n, v0Var);
        mo15213r(9, n);
    }

    /* renamed from: l0 */
    public final void mo15228l0(String str, Bundle bundle, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21501b(n, v0Var);
        mo15213r(10, n);
    }

    /* renamed from: u0 */
    public final void mo15229u0(String str, Bundle bundle, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21501b(n, v0Var);
        mo15213r(5, n);
    }

    /* renamed from: v0 */
    public final void mo15230v0(String str, List<Bundle> list, Bundle bundle, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        n.writeTypedList(list);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21501b(n, v0Var);
        mo15213r(14, n);
    }

    /* renamed from: w0 */
    public final void mo15231w0(String str, Bundle bundle, Bundle bundle2, C5133v0 v0Var) throws RemoteException {
        Parcel n = mo15212n();
        n.writeString(str);
        C5113l0.m21502c(n, bundle);
        C5113l0.m21502c(n, bundle2);
        C5113l0.m21501b(n, v0Var);
        mo15213r(11, n);
    }
}
