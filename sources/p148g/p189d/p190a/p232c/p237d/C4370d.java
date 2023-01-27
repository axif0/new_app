package p148g.p189d.p190a.p232c.p237d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1655n;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: g.d.a.c.d.d */
public class C4370d extends C1663a {
    public static final Parcelable.Creator<C4370d> CREATOR = new C4391r();

    /* renamed from: f */
    private final String f13907f;
    @Deprecated

    /* renamed from: g */
    private final int f13908g;

    /* renamed from: h */
    private final long f13909h;

    public C4370d(String str, int i, long j) {
        this.f13907f = str;
        this.f13908g = i;
        this.f13909h = j;
    }

    /* renamed from: d */
    public String mo13689d() {
        return this.f13907f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4370d) {
            C4370d dVar = (C4370d) obj;
            return ((mo13689d() != null && mo13689d().equals(dVar.mo13689d())) || (mo13689d() == null && dVar.mo13689d() == null)) && mo13691f() == dVar.mo13691f();
        }
    }

    /* renamed from: f */
    public long mo13691f() {
        long j = this.f13909h;
        return j == -1 ? (long) this.f13908g : j;
    }

    public int hashCode() {
        return C1655n.m7833b(mo13689d(), Long.valueOf(mo13691f()));
    }

    public String toString() {
        C1655n.C1656a c = C1655n.m7834c(this);
        c.mo6552a("name", mo13689d());
        c.mo6552a("version", Long.valueOf(mo13691f()));
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7900n(parcel, 1, mo13689d(), false);
        C1666c.m7896j(parcel, 2, this.f13908g);
        C1666c.m7897k(parcel, 3, mo13691f());
        C1666c.m7888b(parcel, a);
    }
}
