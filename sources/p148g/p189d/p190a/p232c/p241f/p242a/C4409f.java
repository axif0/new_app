package p148g.p189d.p190a.p232c.p241f.p242a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.a.f */
public final class C4409f extends C4404a implements C4407d {
    C4409f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: f */
    public final String mo13734f() throws RemoteException {
        Parcel r = mo13733r(1, mo13732n());
        String readString = r.readString();
        r.recycle();
        return readString;
    }

    /* renamed from: t0 */
    public final boolean mo13735t0(boolean z) throws RemoteException {
        Parcel n = mo13732n();
        C4406c.m18647a(n, true);
        Parcel r = mo13733r(2, n);
        boolean b = C4406c.m18648b(r);
        r.recycle();
        return b;
    }
}
