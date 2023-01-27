package p148g.p189d.p190a.p232c.p236c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: g.d.a.c.c.a */
public final class C4332a extends C1663a {
    public static final Parcelable.Creator<C4332a> CREATOR = new C4343f();

    /* renamed from: f */
    private Intent f13832f;

    public C4332a(Intent intent) {
        this.f13832f = intent;
    }

    /* renamed from: d */
    public final Intent mo13620d() {
        return this.f13832f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7899m(parcel, 1, this.f13832f, i, false);
        C1666c.m7888b(parcel, a);
    }
}
