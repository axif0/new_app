package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
final class C1930r8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6226f;

    /* renamed from: g */
    private final /* synthetic */ String f6227g;

    /* renamed from: h */
    private final /* synthetic */ String f6228h;

    /* renamed from: i */
    private final /* synthetic */ String f6229i;

    /* renamed from: j */
    private final /* synthetic */ C1860la f6230j;

    /* renamed from: k */
    private final /* synthetic */ C1750c8 f6231k;

    C1930r8(C1750c8 c8Var, AtomicReference atomicReference, String str, String str2, String str3, C1860la laVar) {
        this.f6231k = c8Var;
        this.f6226f = atomicReference;
        this.f6227g = str;
        this.f6228h = str2;
        this.f6229i = str3;
        this.f6230j = laVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<C1968ua> F0;
        synchronized (this.f6226f) {
            try {
                C1961u3 l0 = this.f6231k.f5703d;
                if (l0 == null) {
                    this.f6231k.mo6709i().mo6764E().mo6888d("(legacy) Failed to get conditional properties; not connected to service", C1746c4.m8178w(this.f6227g), this.f6228h, this.f6229i);
                    this.f6226f.set(Collections.emptyList());
                    this.f6226f.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6227g)) {
                    atomicReference2 = this.f6226f;
                    F0 = l0.mo7129H0(this.f6228h, this.f6229i, this.f6230j);
                } else {
                    atomicReference2 = this.f6226f;
                    F0 = l0.mo7127F0(this.f6227g, this.f6228h, this.f6229i);
                }
                atomicReference2.set(F0);
                this.f6231k.m8205e0();
                atomicReference = this.f6226f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f6231k.mo6709i().mo6764E().mo6888d("(legacy) Failed to get conditional properties; remote exception", C1746c4.m8178w(this.f6227g), this.f6228h, e);
                    this.f6226f.set(Collections.emptyList());
                    atomicReference = this.f6226f;
                } catch (Throwable th) {
                    this.f6226f.notify();
                    throw th;
                }
            }
        }
    }
}
