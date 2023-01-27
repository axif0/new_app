package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.k0 */
public class C5111k0 extends Binder implements IInterface {
    protected C5111k0(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo15201n(int i, Parcel parcel) throws RemoteException {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo15201n(i, parcel);
    }
}
