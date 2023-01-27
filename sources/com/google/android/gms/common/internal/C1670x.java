package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: com.google.android.gms.common.internal.x */
public final class C1670x implements Parcelable.Creator<C1659p> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i = C1664b.m7879p(parcel, n);
            } else if (h == 2) {
                account = (Account) C1664b.m7865b(parcel, n, Account.CREATOR);
            } else if (h == 3) {
                i2 = C1664b.m7879p(parcel, n);
            } else if (h != 4) {
                C1664b.m7883t(parcel, n);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1664b.m7865b(parcel, n, GoogleSignInAccount.CREATOR);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C1659p(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1659p[i];
    }
}
