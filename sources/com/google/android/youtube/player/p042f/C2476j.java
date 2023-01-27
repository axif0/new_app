package com.google.android.youtube.player.p042f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.youtube.player.p042f.C2473i;

/* renamed from: com.google.android.youtube.player.f.j */
public interface C2476j extends IInterface {

    /* renamed from: com.google.android.youtube.player.f.j$a */
    public static abstract class C2477a extends Binder implements C2476j {

        /* renamed from: com.google.android.youtube.player.f.j$a$a */
        private static class C2478a implements C2476j {

            /* renamed from: a */
            private IBinder f8115a;

            C2478a(IBinder iBinder) {
                this.f8115a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f8115a;
            }

            /* renamed from: v */
            public final C2473i mo9328v(C2471h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f8115a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2473i.C2474a.m11168n(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public final void mo9329x(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f8115a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: n */
        public static C2476j m11173n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2476j)) ? new C2478a(iBinder) : (C2476j) queryLocalInterface;
        }
    }

    /* renamed from: v */
    C2473i mo9328v(C2471h hVar) throws RemoteException;

    /* renamed from: x */
    void mo9329x(boolean z) throws RemoteException;
}
