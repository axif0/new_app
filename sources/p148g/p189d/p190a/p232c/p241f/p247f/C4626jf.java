package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.f.jf */
public abstract class C4626jf extends C4751r0 implements C4571gf {
    public C4626jf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo7342n(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo14082g((Bundle) C4800u.m20437a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
