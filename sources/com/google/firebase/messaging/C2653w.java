package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.w */
final class C2653w {

    /* renamed from: d */
    private static WeakReference<C2653w> f8470d;

    /* renamed from: a */
    private final SharedPreferences f8471a;

    /* renamed from: b */
    private C2651u f8472b;

    /* renamed from: c */
    private final Executor f8473c;

    private C2653w(SharedPreferences sharedPreferences, Executor executor) {
        this.f8473c = executor;
        this.f8471a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C2653w m11809a(Context context, Executor executor) {
        C2653w wVar;
        synchronized (C2653w.class) {
            wVar = null;
            if (f8470d != null) {
                wVar = (C2653w) f8470d.get();
            }
            if (wVar == null) {
                wVar = new C2653w(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                wVar.m11810c();
                f8470d = new WeakReference<>(wVar);
            }
        }
        return wVar;
    }

    /* renamed from: c */
    private final synchronized void m11810c() {
        this.f8472b = C2651u.m11796c(this.f8471a, "topic_operation_queue", ",", this.f8473c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C2652v mo9635b() {
        return C2652v.m11804a(this.f8472b.mo9627e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized boolean mo9636d(C2652v vVar) {
        return this.f8472b.mo9628f(vVar.mo9632e());
    }
}
