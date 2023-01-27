package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C1873n extends C1663a implements Iterable<String> {
    public static final Parcelable.Creator<C1873n> CREATOR = new C1897p();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Bundle f6072f;

    C1873n(Bundle bundle) {
        this.f6072f = bundle;
    }

    /* renamed from: d */
    public final int mo7243d() {
        return this.f6072f.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Object mo7244h(String str) {
        return this.f6072f.get(str);
    }

    /* renamed from: i */
    public final Bundle mo7245i() {
        return new Bundle(this.f6072f);
    }

    public final Iterator<String> iterator() {
        return new C1909q(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Long mo7247j(String str) {
        return Long.valueOf(this.f6072f.getLong(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Double mo7248m(String str) {
        return Double.valueOf(this.f6072f.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo7249o(String str) {
        return this.f6072f.getString(str);
    }

    public final String toString() {
        return this.f6072f.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7891e(parcel, 2, mo7245i(), false);
        C1666c.m7888b(parcel, a);
    }
}
