package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.f.a */
public class C4442a implements IInterface {

    /* renamed from: a */
    private final IBinder f13964a;

    /* renamed from: b */
    private final String f13965b;

    protected C4442a(IBinder iBinder, String str) {
        this.f13964a = iBinder;
        this.f13965b = str;
    }

    public IBinder asBinder() {
        return this.f13964a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel mo13767n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13965b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Parcel mo13768r(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f13964a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo13769w(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13964a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
