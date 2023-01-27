package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.e */
final /* synthetic */ class C2629e implements Executor {

    /* renamed from: a */
    static final Executor f8433a = new C2629e();

    private C2629e() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
