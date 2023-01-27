package com.google.android.youtube.player.p042f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.youtube.player.f.i */
public interface C2473i extends IInterface {

    /* renamed from: com.google.android.youtube.player.f.i$a */
    public static abstract class C2474a extends Binder implements C2473i {

        /* renamed from: com.google.android.youtube.player.f.i$a$a */
        private static class C2475a implements C2473i {

            /* renamed from: a */
            private IBinder f8114a;

            C2475a(IBinder iBinder) {
                this.f8114a = iBinder;
            }

            /* renamed from: N */
            public final void mo9325N(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    obtain.writeString(str);
                    this.f8114a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f8114a;
            }

            /* renamed from: t */
            public final void mo9326t() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f8114a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: n */
        public static C2473i m11168n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2473i)) ? new C2475a(iBinder) : (C2473i) queryLocalInterface;
        }
    }

    /* renamed from: N */
    void mo9325N(String str) throws RemoteException;

    /* renamed from: t */
    void mo9326t() throws RemoteException;
}
