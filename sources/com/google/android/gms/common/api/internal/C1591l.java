package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1572b;
import com.google.android.gms.common.util.C1689l;

/* renamed from: com.google.android.gms.common.api.internal.l */
public abstract class C1591l {
    public C1591l(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m7643a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C1689l.m7959b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: b */
    public abstract void mo6402b(Status status);

    /* renamed from: c */
    public abstract void mo6403c(C1572b.C1573a<?> aVar) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo6406d(C1588i iVar, boolean z);

    /* renamed from: e */
    public abstract void mo6404e(RuntimeException runtimeException);
}
