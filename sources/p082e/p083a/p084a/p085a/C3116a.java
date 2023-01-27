package p082e.p083a.p084a.p085a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: e.a.a.a.a */
public interface C3116a extends IInterface {

    /* renamed from: e.a.a.a.a$a */
    public static abstract class C3117a extends Binder implements C3116a {

        /* renamed from: e.a.a.a.a$a$a */
        private static class C3118a implements C3116a {

            /* renamed from: b */
            public static C3116a f9922b;

            /* renamed from: a */
            private IBinder f9923a;

            C3118a(IBinder iBinder) {
                this.f9923a = iBinder;
            }

            /* renamed from: P0 */
            public void mo10754P0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9923a.transact(1, obtain, (Parcel) null, 1) || C3117a.m13379r() == null) {
                        obtain.recycle();
                    } else {
                        C3117a.m13379r().mo10754P0(i, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f9923a;
            }
        }

        public C3117a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: n */
        public static C3116a m13378n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3116a)) ? new C3118a(iBinder) : (C3116a) queryLocalInterface;
        }

        /* renamed from: r */
        public static C3116a m13379r() {
            return C3118a.f9922b;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo10754P0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: P0 */
    void mo10754P0(int i, Bundle bundle) throws RemoteException;
}
