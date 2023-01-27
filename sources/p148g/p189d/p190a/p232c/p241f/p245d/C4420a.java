package p148g.p189d.p190a.p232c.p241f.p245d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.d.a */
public class C4420a implements IInterface {

    /* renamed from: a */
    private final IBinder f13952a;

    /* renamed from: b */
    private final String f13953b;

    protected C4420a(IBinder iBinder, String str) {
        this.f13952a = iBinder;
        this.f13953b = str;
    }

    public IBinder asBinder() {
        return this.f13952a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel mo13746n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13953b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Parcel mo13747r(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f13952a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
