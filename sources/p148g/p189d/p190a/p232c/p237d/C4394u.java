package p148g.p189d.p190a.p232c.p237d;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1638g0;
import com.google.android.gms.common.internal.C1641h0;
import com.google.android.gms.common.internal.C1658o;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p240e.C4403b;

/* renamed from: g.d.a.c.d.u */
abstract class C4394u extends C1641h0 {

    /* renamed from: a */
    private int f13939a;

    protected C4394u(byte[] bArr) {
        C1658o.m7836a(bArr.length == 25);
        this.f13939a = Arrays.hashCode(bArr);
    }

    /* renamed from: S0 */
    protected static byte[] m18633S0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final C4400a mo6535b() {
        return C4403b.m18643S0(mo13729w());
    }

    /* renamed from: c */
    public final int mo6536c() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        C4400a b;
        if (obj != null && (obj instanceof C1638g0)) {
            try {
                C1638g0 g0Var = (C1638g0) obj;
                if (g0Var.mo6536c() != hashCode() || (b = g0Var.mo6535b()) == null) {
                    return false;
                }
                return Arrays.equals(mo13729w(), (byte[]) C4403b.m18644w(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f13939a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public abstract byte[] mo13729w();
}
