package com.google.android.youtube.player.p042f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.youtube.player.f.f */
public interface C2466f extends IInterface {

    /* renamed from: com.google.android.youtube.player.f.f$a */
    public static abstract class C2467a extends Binder implements C2466f {
        public C2467a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                mo9316d0(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
                return true;
            }
        }
    }

    /* renamed from: d0 */
    void mo9316d0(String str, IBinder iBinder) throws RemoteException;
}
