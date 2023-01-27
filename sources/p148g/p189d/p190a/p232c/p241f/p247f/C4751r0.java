package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.f.r0 */
public class C4751r0 extends Binder implements IInterface {
    protected C4751r0(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo7342n(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo7342n(i, parcel, parcel2, i2);
    }
}
