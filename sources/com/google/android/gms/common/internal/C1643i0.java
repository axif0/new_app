package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4420a;

/* renamed from: com.google.android.gms.common.internal.i0 */
public final class C1643i0 extends C4420a implements C1638g0 {
    C1643i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final C4400a mo6535b() throws RemoteException {
        Parcel r = mo13747r(1, mo13746n());
        C4400a r2 = C4400a.C4401a.m18642r(r.readStrongBinder());
        r.recycle();
        return r2;
    }

    /* renamed from: c */
    public final int mo6536c() throws RemoteException {
        Parcel r = mo13747r(2, mo13746n());
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }
}
