package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.f.e4 */
public final class C4522e4 extends C4442a implements C4501d2 {
    C4522e4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: g */
    public final Bundle mo14032g(Bundle bundle) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, bundle);
        Parcel r = mo13768r(1, n);
        Bundle bundle2 = (Bundle) C4800u.m20437a(r, Bundle.CREATOR);
        r.recycle();
        return bundle2;
    }
}
