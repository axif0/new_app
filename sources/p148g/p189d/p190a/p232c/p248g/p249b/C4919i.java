package p148g.p189d.p190a.p232c.p248g.p249b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1659p;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: g.d.a.c.g.b.i */
public final class C4919i extends C1663a {
    public static final Parcelable.Creator<C4919i> CREATOR = new C4920j();

    /* renamed from: f */
    private final int f14724f;

    /* renamed from: g */
    private final C1659p f14725g;

    C4919i(int i, C1659p pVar) {
        this.f14724f = i;
        this.f14725g = pVar;
    }

    public C4919i(C1659p pVar) {
        this(1, pVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f14724f);
        C1666c.m7899m(parcel, 2, this.f14725g, i, false);
        C1666c.m7888b(parcel, a);
    }
}
