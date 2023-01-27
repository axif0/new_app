package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1644j;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import p148g.p189d.p190a.p232c.p237d.C4370d;
import p148g.p189d.p190a.p232c.p237d.C4375f;

/* renamed from: com.google.android.gms.common.internal.f */
public class C1635f extends C1663a {
    public static final Parcelable.Creator<C1635f> CREATOR = new C1626b0();

    /* renamed from: f */
    private final int f5494f;

    /* renamed from: g */
    private final int f5495g;

    /* renamed from: h */
    private int f5496h;

    /* renamed from: i */
    String f5497i;

    /* renamed from: j */
    IBinder f5498j;

    /* renamed from: k */
    Scope[] f5499k;

    /* renamed from: l */
    Bundle f5500l;

    /* renamed from: m */
    Account f5501m;

    /* renamed from: n */
    C4370d[] f5502n;

    /* renamed from: o */
    C4370d[] f5503o;

    /* renamed from: p */
    private boolean f5504p;

    public C1635f(int i) {
        this.f5494f = 4;
        this.f5496h = C4375f.f13916a;
        this.f5495g = i;
        this.f5504p = true;
    }

    C1635f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C4370d[] dVarArr, C4370d[] dVarArr2, boolean z) {
        this.f5494f = i;
        this.f5495g = i2;
        this.f5496h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f5497i = "com.google.android.gms";
        } else {
            this.f5497i = str;
        }
        if (i < 2) {
            this.f5501m = iBinder != null ? C1611a.m7666w(C1644j.C1645a.m7818r(iBinder)) : null;
        } else {
            this.f5498j = iBinder;
            this.f5501m = account;
        }
        this.f5499k = scopeArr;
        this.f5500l = bundle;
        this.f5502n = dVarArr;
        this.f5503o = dVarArr2;
        this.f5504p = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5494f);
        C1666c.m7896j(parcel, 2, this.f5495g);
        C1666c.m7896j(parcel, 3, this.f5496h);
        C1666c.m7900n(parcel, 4, this.f5497i, false);
        C1666c.m7895i(parcel, 5, this.f5498j, false);
        C1666c.m7902p(parcel, 6, this.f5499k, i, false);
        C1666c.m7891e(parcel, 7, this.f5500l, false);
        C1666c.m7899m(parcel, 8, this.f5501m, i, false);
        C1666c.m7902p(parcel, 10, this.f5502n, i, false);
        C1666c.m7902p(parcel, 11, this.f5503o, i, false);
        C1666c.m7889c(parcel, 12, this.f5504p);
        C1666c.m7888b(parcel, a);
    }
}
