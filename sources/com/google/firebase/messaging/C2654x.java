package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.C2566q;
import com.google.firebase.iid.C2569t;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.x */
final /* synthetic */ class C2654x implements Callable {

    /* renamed from: a */
    private final Context f8474a;

    /* renamed from: b */
    private final ScheduledExecutorService f8475b;

    /* renamed from: c */
    private final FirebaseInstanceId f8476c;

    /* renamed from: d */
    private final C2569t f8477d;

    /* renamed from: e */
    private final C2566q f8478e;

    C2654x(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C2569t tVar, C2566q qVar) {
        this.f8474a = context;
        this.f8475b = scheduledExecutorService;
        this.f8476c = firebaseInstanceId;
        this.f8477d = tVar;
        this.f8478e = qVar;
    }

    public final Object call() {
        return C2655y.m11819i(this.f8474a, this.f8475b, this.f8476c, this.f8477d, this.f8478e);
    }
}
