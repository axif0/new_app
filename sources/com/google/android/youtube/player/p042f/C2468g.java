package com.google.android.youtube.player.p042f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.youtube.player.f.g */
public interface C2468g extends IInterface {

    /* renamed from: com.google.android.youtube.player.f.g$a */
    public static abstract class C2469a extends Binder implements C2468g {

        /* renamed from: com.google.android.youtube.player.f.g$a$a */
        private static class C2470a implements C2468g {

            /* renamed from: a */
            private IBinder f8113a;

            C2470a(IBinder iBinder) {
                this.f8113a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f8113a;
            }

            /* renamed from: m0 */
            public final void mo9319m0(C2466f fVar, int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f8113a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: n */
        public static C2468g m11162n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2468g)) ? new C2470a(iBinder) : (C2468g) queryLocalInterface;
        }
    }

    /* renamed from: m0 */
    void mo9319m0(C2466f fVar, int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;
}
