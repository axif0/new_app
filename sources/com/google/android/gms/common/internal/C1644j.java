package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p245d.C4420a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4421b;
import p148g.p189d.p190a.p232c.p241f.p245d.C4422c;

/* renamed from: com.google.android.gms.common.internal.j */
public interface C1644j extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.j$a */
    public static abstract class C1645a extends C4421b implements C1644j {

        /* renamed from: com.google.android.gms.common.internal.j$a$a */
        public static class C1646a extends C4420a implements C1644j {
            C1646a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: k */
            public final Account mo6548k() throws RemoteException {
                Parcel r = mo13747r(2, mo13746n());
                Account account = (Account) C4422c.m18669b(r, Account.CREATOR);
                r.recycle();
                return account;
            }
        }

        /* renamed from: r */
        public static C1644j m7818r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C1644j ? (C1644j) queryLocalInterface : new C1646a(iBinder);
        }
    }

    /* renamed from: k */
    Account mo6548k() throws RemoteException;
}
