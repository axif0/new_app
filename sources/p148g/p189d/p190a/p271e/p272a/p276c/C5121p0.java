package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.p0 */
public abstract class C5121p0 extends C5111k0 implements C5123q0 {
    public C5121p0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo15201n(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo15178e((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo15179h((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
