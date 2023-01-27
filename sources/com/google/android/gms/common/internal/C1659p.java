package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: com.google.android.gms.common.internal.p */
public class C1659p extends C1663a {
    public static final Parcelable.Creator<C1659p> CREATOR = new C1670x();

    /* renamed from: f */
    private final int f5525f;

    /* renamed from: g */
    private final Account f5526g;

    /* renamed from: h */
    private final int f5527h;

    /* renamed from: i */
    private final GoogleSignInAccount f5528i;

    C1659p(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f5525f = i;
        this.f5526g = account;
        this.f5527h = i2;
        this.f5528i = googleSignInAccount;
    }

    public C1659p(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: d */
    public Account mo6554d() {
        return this.f5526g;
    }

    /* renamed from: f */
    public int mo6555f() {
        return this.f5527h;
    }

    /* renamed from: h */
    public GoogleSignInAccount mo6556h() {
        return this.f5528i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5525f);
        C1666c.m7899m(parcel, 2, mo6554d(), i, false);
        C1666c.m7896j(parcel, 3, mo6555f());
        C1666c.m7899m(parcel, 4, mo6556h(), i, false);
        C1666c.m7888b(parcel, a);
    }
}
