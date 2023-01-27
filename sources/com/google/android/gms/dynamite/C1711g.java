package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4420a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4422c;

/* renamed from: com.google.android.gms.dynamite.g */
public final class C1711g extends C4420a implements C1710f {
    C1711g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: U */
    public final int mo6595U(C4400a aVar, String str, boolean z) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18670c(n, aVar);
        n.writeString(str);
        C4422c.m18668a(n, z);
        Parcel r = mo13747r(3, n);
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }

    /* renamed from: c0 */
    public final C4400a mo6596c0(C4400a aVar, String str, int i) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18670c(n, aVar);
        n.writeString(str);
        n.writeInt(i);
        Parcel r = mo13747r(4, n);
        C4400a r2 = C4400a.C4401a.m18642r(r.readStrongBinder());
        r.recycle();
        return r2;
    }

    /* renamed from: r0 */
    public final C4400a mo6597r0(C4400a aVar, String str, int i) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18670c(n, aVar);
        n.writeString(str);
        n.writeInt(i);
        Parcel r = mo13747r(2, n);
        C4400a r2 = C4400a.C4401a.m18642r(r.readStrongBinder());
        r.recycle();
        return r2;
    }

    /* renamed from: y */
    public final int mo6598y(C4400a aVar, String str, boolean z) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18670c(n, aVar);
        n.writeString(str);
        C4422c.m18668a(n, z);
        Parcel r = mo13747r(5, n);
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }

    /* renamed from: z0 */
    public final int mo6599z0() throws RemoteException {
        Parcel r = mo13747r(6, mo13746n());
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }
}
