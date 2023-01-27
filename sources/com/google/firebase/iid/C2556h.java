package com.google.firebase.iid;

import com.google.android.gms.common.util.p038q.C1694a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.h */
class C2556h {

    /* renamed from: a */
    private static final Executor f8276a = C2553g.f8267a;

    /* renamed from: a */
    static Executor m11429a() {
        return f8276a;
    }

    /* renamed from: b */
    static ExecutorService m11430b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1694a("firebase-iid-executor"));
    }
}
