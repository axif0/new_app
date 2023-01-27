package p148g.p189d.p190a.p232c.p241f.p243b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.b.a */
public class C4410a implements IInterface {

    /* renamed from: a */
    private final IBinder f13947a;

    /* renamed from: b */
    private final String f13948b;

    protected C4410a(IBinder iBinder, String str) {
        this.f13947a = iBinder;
        this.f13948b = str;
    }

    public IBinder asBinder() {
        return this.f13947a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel mo13737n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13948b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo13738r(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13947a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
