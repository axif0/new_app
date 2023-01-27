package p148g.p189d.p190a.p232c.p237d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1641h0;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p240e.C4403b;

/* renamed from: g.d.a.c.d.a0 */
public final class C4365a0 extends C1663a {
    public static final Parcelable.Creator<C4365a0> CREATOR = new C4367b0();

    /* renamed from: f */
    private final String f13892f;

    /* renamed from: g */
    private final C4394u f13893g;

    /* renamed from: h */
    private final boolean f13894h;

    /* renamed from: i */
    private final boolean f13895i;

    C4365a0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f13892f = str;
        this.f13893g = m18547d(iBinder);
        this.f13894h = z;
        this.f13895i = z2;
    }

    C4365a0(String str, C4394u uVar, boolean z, boolean z2) {
        this.f13892f = str;
        this.f13893g = uVar;
        this.f13894h = z;
        this.f13895i = z2;
    }

    /* renamed from: d */
    private static C4394u m18547d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            C4400a b = C1641h0.m7811r(iBinder).mo6535b();
            byte[] bArr = b == null ? null : (byte[]) C4403b.m18644w(b);
            if (bArr != null) {
                return new C4395v(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7900n(parcel, 1, this.f13892f, false);
        C4394u uVar = this.f13893g;
        if (uVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        } else {
            uVar.asBinder();
        }
        C1666c.m7895i(parcel, 2, uVar, false);
        C1666c.m7889c(parcel, 3, this.f13894h);
        C1666c.m7889c(parcel, 4, this.f13895i);
        C1666c.m7888b(parcel, a);
    }
}
