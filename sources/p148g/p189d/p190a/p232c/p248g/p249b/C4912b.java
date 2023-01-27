package p148g.p189d.p190a.p232c.p248g.p249b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C1606j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: g.d.a.c.g.b.b */
public final class C4912b extends C1663a implements C1606j {
    public static final Parcelable.Creator<C4912b> CREATOR = new C4913c();

    /* renamed from: f */
    private final int f14721f;

    /* renamed from: g */
    private int f14722g;

    /* renamed from: h */
    private Intent f14723h;

    public C4912b() {
        this(0, (Intent) null);
    }

    C4912b(int i, int i2, Intent intent) {
        this.f14721f = i;
        this.f14722g = i2;
        this.f14723h = intent;
    }

    private C4912b(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }

    /* renamed from: c */
    public final Status mo6314c() {
        return this.f14722g == 0 ? Status.f5308j : Status.f5310l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f14721f);
        C1666c.m7896j(parcel, 2, this.f14722g);
        C1666c.m7899m(parcel, 3, this.f14723h, i, false);
        C1666c.m7888b(parcel, a);
    }
}
