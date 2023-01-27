package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
final class C1954t8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6291f;

    /* renamed from: g */
    private final /* synthetic */ String f6292g;

    /* renamed from: h */
    private final /* synthetic */ String f6293h;

    /* renamed from: i */
    private final /* synthetic */ String f6294i;

    /* renamed from: j */
    private final /* synthetic */ boolean f6295j;

    /* renamed from: k */
    private final /* synthetic */ C1860la f6296k;

    /* renamed from: l */
    private final /* synthetic */ C1750c8 f6297l;

    C1954t8(C1750c8 c8Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C1860la laVar) {
        this.f6297l = c8Var;
        this.f6291f = atomicReference;
        this.f6292g = str;
        this.f6293h = str2;
        this.f6294i = str3;
        this.f6295j = z;
        this.f6296k = laVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<C1776ea> X;
        synchronized (this.f6291f) {
            try {
                C1961u3 l0 = this.f6297l.f5703d;
                if (l0 == null) {
                    this.f6297l.mo6709i().mo6764E().mo6888d("(legacy) Failed to get user properties; not connected to service", C1746c4.m8178w(this.f6292g), this.f6293h, this.f6294i);
                    this.f6291f.set(Collections.emptyList());
                    this.f6291f.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6292g)) {
                    atomicReference2 = this.f6291f;
                    X = l0.mo7121A(this.f6293h, this.f6294i, this.f6295j, this.f6296k);
                } else {
                    atomicReference2 = this.f6291f;
                    X = l0.mo7135X(this.f6292g, this.f6293h, this.f6294i, this.f6295j);
                }
                atomicReference2.set(X);
                this.f6297l.m8205e0();
                atomicReference = this.f6291f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f6297l.mo6709i().mo6764E().mo6888d("(legacy) Failed to get user properties; remote exception", C1746c4.m8178w(this.f6292g), this.f6293h, e);
                    this.f6291f.set(Collections.emptyList());
                    atomicReference = this.f6291f;
                } catch (Throwable th) {
                    this.f6291f.notify();
                    throw th;
                }
            }
        }
    }
}
