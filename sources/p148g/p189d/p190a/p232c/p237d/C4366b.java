package p148g.p189d.p190a.p232c.p237d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1655n;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: g.d.a.c.d.b */
public final class C4366b extends C1663a {
    public static final Parcelable.Creator<C4366b> CREATOR = new C4390q();

    /* renamed from: j */
    public static final C4366b f13896j = new C4366b(0);

    /* renamed from: f */
    private final int f13897f;

    /* renamed from: g */
    private final int f13898g;

    /* renamed from: h */
    private final PendingIntent f13899h;

    /* renamed from: i */
    private final String f13900i;

    public C4366b(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    C4366b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f13897f = i;
        this.f13898g = i2;
        this.f13899h = pendingIntent;
        this.f13900i = str;
    }

    public C4366b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public C4366b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: m */
    static String m18548m(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: d */
    public final int mo13673d() {
        return this.f13898g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4366b)) {
            return false;
        }
        C4366b bVar = (C4366b) obj;
        return this.f13898g == bVar.f13898g && C1655n.m7832a(this.f13899h, bVar.f13899h) && C1655n.m7832a(this.f13900i, bVar.f13900i);
    }

    /* renamed from: f */
    public final String mo13675f() {
        return this.f13900i;
    }

    /* renamed from: h */
    public final PendingIntent mo13676h() {
        return this.f13899h;
    }

    public final int hashCode() {
        return C1655n.m7833b(Integer.valueOf(this.f13898g), this.f13899h, this.f13900i);
    }

    /* renamed from: i */
    public final boolean mo13678i() {
        return (this.f13898g == 0 || this.f13899h == null) ? false : true;
    }

    /* renamed from: j */
    public final boolean mo13679j() {
        return this.f13898g == 0;
    }

    public final String toString() {
        C1655n.C1656a c = C1655n.m7834c(this);
        c.mo6552a("statusCode", m18548m(this.f13898g));
        c.mo6552a("resolution", this.f13899h);
        c.mo6552a("message", this.f13900i);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f13897f);
        C1666c.m7896j(parcel, 2, mo13673d());
        C1666c.m7899m(parcel, 3, mo13676h(), i, false);
        C1666c.m7900n(parcel, 4, mo13675f(), false);
        C1666c.m7888b(parcel, a);
    }
}
