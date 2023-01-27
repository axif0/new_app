package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p245d.C4421b;
import p148g.p189d.p190a.p232c.p241f.p245d.C4422c;

/* renamed from: com.google.android.gms.common.internal.k */
public interface C1648k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class C1649a extends C4421b implements C1648k {
        public C1649a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public final boolean mo6545n(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                mo6493Q0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C4422c.m18669b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo6492I0(parcel.readInt(), (Bundle) C4422c.m18669b(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo6494x0(parcel.readInt(), parcel.readStrongBinder(), (C1672z) C4422c.m18669b(parcel, C1672z.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: I0 */
    void mo6492I0(int i, Bundle bundle) throws RemoteException;

    /* renamed from: Q0 */
    void mo6493Q0(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: x0 */
    void mo6494x0(int i, IBinder iBinder, C1672z zVar) throws RemoteException;
}
