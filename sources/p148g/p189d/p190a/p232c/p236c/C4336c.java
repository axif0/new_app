package p148g.p189d.p190a.p232c.p236c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.c.c */
interface C4336c extends IInterface {

    /* renamed from: g.d.a.c.c.c$a */
    public static class C4337a implements C4336c {

        /* renamed from: a */
        private final IBinder f13838a;

        C4337a(IBinder iBinder) {
            this.f13838a = iBinder;
        }

        /* renamed from: V */
        public void mo13625V(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f13838a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f13838a;
        }
    }

    /* renamed from: V */
    void mo13625V(Message message) throws RemoteException;
}
