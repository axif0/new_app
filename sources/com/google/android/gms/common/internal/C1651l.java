package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.l */
final class C1651l implements C1653m {

    /* renamed from: a */
    private final IBinder f5518a;

    C1651l(IBinder iBinder) {
        this.f5518a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f5518a;
    }

    /* renamed from: e0 */
    public final void mo6551e0(C1648k kVar, C1635f fVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                fVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5518a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
