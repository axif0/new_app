package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1644j;

/* renamed from: com.google.android.gms.common.internal.a */
public class C1611a extends C1644j.C1645a {
    /* renamed from: w */
    public static Account m7666w(C1644j jVar) {
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return jVar.mo6548k();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
