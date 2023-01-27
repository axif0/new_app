package p148g.p189d.p190a.p232c.p241f.p242a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.a.a */
public class C4404a implements IInterface {

    /* renamed from: a */
    private final IBinder f13945a;

    /* renamed from: b */
    private final String f13946b;

    protected C4404a(IBinder iBinder, String str) {
        this.f13945a = iBinder;
        this.f13946b = str;
    }

    public IBinder asBinder() {
        return this.f13945a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel mo13732n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13946b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Parcel mo13733r(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f13945a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
