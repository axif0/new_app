package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.b */
final /* synthetic */ class C2542b implements Callable {

    /* renamed from: a */
    private final Context f8250a;

    /* renamed from: b */
    private final Intent f8251b;

    C2542b(Context context, Intent intent) {
        this.f8250a = context;
        this.f8251b = intent;
    }

    public final Object call() {
        return Integer.valueOf(C2575y.m11465b().mo9474g(this.f8250a, this.f8251b));
    }
}
