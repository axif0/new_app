package com.google.firebase.messaging;

import com.google.android.gms.common.util.p038q.C1694a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p148g.p189d.p190a.p232c.p241f.p246e.C4424a;
import p148g.p189d.p190a.p232c.p241f.p246e.C4429f;

/* renamed from: com.google.firebase.messaging.h */
class C2633h {
    /* renamed from: a */
    private static Executor m11712a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1694a(str));
    }

    /* renamed from: b */
    static ExecutorService m11713b() {
        return C4424a.m18673a().mo13751a(new C1694a("Firebase-Messaging-Intent-Handle"), C4429f.f13955a);
    }

    /* renamed from: c */
    static ExecutorService m11714c() {
        return Executors.newSingleThreadExecutor(new C1694a("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: d */
    static ScheduledExecutorService m11715d() {
        return new ScheduledThreadPoolExecutor(1, new C1694a("Firebase-Messaging-Topics-Io"));
    }

    /* renamed from: e */
    static Executor m11716e() {
        return m11712a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
