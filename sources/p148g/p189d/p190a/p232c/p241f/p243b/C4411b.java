package p148g.p189d.p190a.p232c.p241f.p243b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.c.f.b.b */
public class C4411b extends Binder implements IInterface {
    protected C4411b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public boolean mo13739S0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public IBinder asBinder() {
        return this;
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
        return mo13739S0(i, parcel, parcel2, i2);
    }
}
