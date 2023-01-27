package p148g.p189d.p190a.p232c.p248g.p249b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p148g.p189d.p190a.p232c.p237d.C4366b;
import p148g.p189d.p190a.p232c.p241f.p243b.C4411b;
import p148g.p189d.p190a.p232c.p241f.p243b.C4412c;

/* renamed from: g.d.a.c.g.b.f */
public abstract class C4916f extends C4411b implements C4915e {
    public C4916f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public boolean mo13739S0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            mo14845Y((C4366b) C4412c.m18657a(parcel, C4366b.CREATOR), (C4912b) C4412c.m18657a(parcel, C4912b.CREATOR));
        } else if (i == 4) {
            mo14844O0((Status) C4412c.m18657a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo14842E((Status) C4412c.m18657a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo14843F((Status) C4412c.m18657a(parcel, Status.CREATOR), (GoogleSignInAccount) C4412c.m18657a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo6433Q((C4921k) C4412c.m18657a(parcel, C4921k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
