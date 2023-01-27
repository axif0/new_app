package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

public final class Scope extends C1663a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1609m();

    /* renamed from: f */
    private final int f5306f;

    /* renamed from: g */
    private final String f5307g;

    Scope(int i, String str) {
        C1658o.m7842g(str, "scopeUri must not be null or empty");
        this.f5306f = i;
        this.f5307g = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: d */
    public final String mo6309d() {
        return this.f5307g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5307g.equals(((Scope) obj).f5307g);
    }

    public final int hashCode() {
        return this.f5307g.hashCode();
    }

    public final String toString() {
        return this.f5307g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5306f);
        C1666c.m7900n(parcel, 2, mo6309d(), false);
        C1666c.m7888b(parcel, a);
    }
}
