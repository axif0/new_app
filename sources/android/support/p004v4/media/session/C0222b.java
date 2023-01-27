package android.support.p004v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
public interface C0222b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0223a extends Binder implements C0222b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0224a implements C0222b {

            /* renamed from: a */
            private IBinder f739a;

            C0224a(IBinder iBinder) {
                this.f739a = iBinder;
            }

            /* renamed from: G */
            public void mo692G(C0220a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f739a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f739a;
            }
        }

        /* renamed from: n */
        public static C0222b m826n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0222b)) ? new C0224a(iBinder) : (C0222b) queryLocalInterface;
        }
    }

    /* renamed from: G */
    void mo692G(C0220a aVar) throws RemoteException;
}
