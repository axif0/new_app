package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.a */
final /* synthetic */ class C2539a implements Executor {

    /* renamed from: a */
    static final Executor f8244a = new C2539a();

    private C2539a() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
