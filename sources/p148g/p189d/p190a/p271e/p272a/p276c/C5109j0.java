package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.j0 */
public class C5109j0 implements IInterface {

    /* renamed from: a */
    private final IBinder f15141a;

    /* renamed from: b */
    private final String f15142b;

    protected C5109j0(IBinder iBinder, String str) {
        this.f15141a = iBinder;
        this.f15142b = str;
    }

    public final IBinder asBinder() {
        return this.f15141a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel mo15212n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15142b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo15213r(int i, Parcel parcel) throws RemoteException {
        try {
            this.f15141a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
