package com.google.android.youtube.player.p042f;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.youtube.player.f.h */
public interface C2471h extends IInterface {

    /* renamed from: com.google.android.youtube.player.f.h$a */
    public static abstract class C2472a extends Binder implements C2471h {
        public C2472a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IThumbnailLoaderClient");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                Bitmap bitmap = parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo9322b0(bitmap, readString, z2, z);
            } else if (i == 2) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                String readString2 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo9321L0(readString2, z3, z);
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: L0 */
    void mo9321L0(String str, boolean z, boolean z2) throws RemoteException;

    /* renamed from: b0 */
    void mo9322b0(Bitmap bitmap, String str, boolean z, boolean z2) throws RemoteException;
}
