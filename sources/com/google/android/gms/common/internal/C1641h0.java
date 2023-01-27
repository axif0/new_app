package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4421b;
import p148g.p189d.p190a.p232c.p241f.p245d.C4422c;

/* renamed from: com.google.android.gms.common.internal.h0 */
public abstract class C1641h0 extends C4421b implements C1638g0 {
    public C1641h0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: r */
    public static C1638g0 m7811r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C1638g0 ? (C1638g0) queryLocalInterface : new C1643i0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo6545n(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4400a b = mo6535b();
            parcel2.writeNoException();
            C4422c.m18670c(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int c = mo6536c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
