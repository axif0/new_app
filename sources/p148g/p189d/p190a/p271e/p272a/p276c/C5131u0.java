package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.u0 */
public abstract class C5131u0 extends C5111k0 implements C5133v0 {
    public C5131u0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo15201n(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo9189h0(parcel.readInt(), (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9195u(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9183J(readInt2);
                return true;
            case 5:
                mo9191l(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle3 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9188h((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo9187e((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle4 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9194s0((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle5 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9190j0((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo9193s((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR), (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                mo9184J0((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR), (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo9185L((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR), (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Bundle bundle6 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9192o();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR);
                mo9186d();
                return true;
            default:
                return false;
        }
    }
}
