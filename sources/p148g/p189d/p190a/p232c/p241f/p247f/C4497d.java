package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.f.d */
public final class C4497d extends C4442a implements C4460b {
    C4497d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: O */
    public final void mo13810O(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20439c(n, bundle);
        n.writeLong(j);
        mo13769w(1, n);
    }

    /* renamed from: a */
    public final int mo13811a() throws RemoteException {
        Parcel r = mo13768r(2, mo13767n());
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }
}
