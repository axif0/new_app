package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p237d.C4365a0;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4420a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4422c;

/* renamed from: com.google.android.gms.common.internal.l0 */
public final class C1652l0 extends C4420a implements C1647j0 {
    C1652l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: i0 */
    public final boolean mo6549i0(C4365a0 a0Var, C4400a aVar) throws RemoteException {
        Parcel n = mo13746n();
        C4422c.m18671d(n, a0Var);
        C4422c.m18670c(n, aVar);
        Parcel r = mo13747r(5, n);
        boolean e = C4422c.m18672e(r);
        r.recycle();
        return e;
    }
}
