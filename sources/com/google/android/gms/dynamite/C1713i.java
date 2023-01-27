package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4420a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4422c;

/* renamed from: com.google.android.gms.dynamite.i */
public final class C1713i extends C4420a implements C1712h {
    C1713i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: R */
    public final C4400a mo6600R(C4400a aVar, String str, int i, C4400a aVar2) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18670c(n, aVar);
        n.writeString(str);
        n.writeInt(i);
        C4422c.m18670c(n, aVar2);
        Parcel r = mo13747r(2, n);
        C4400a r2 = C4400a.C4401a.m18642r(r.readStrongBinder());
        r.recycle();
        return r2;
    }

    /* renamed from: S */
    public final C4400a mo6601S(C4400a aVar, String str, int i, C4400a aVar2) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18670c(n, aVar);
        n.writeString(str);
        n.writeInt(i);
        C4422c.m18670c(n, aVar2);
        Parcel r = mo13747r(3, n);
        C4400a r2 = C4400a.C4401a.m18642r(r.readStrongBinder());
        r.recycle();
        return r2;
    }
}
