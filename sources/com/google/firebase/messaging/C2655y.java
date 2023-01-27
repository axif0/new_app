package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.iid.C2566q;
import com.google.firebase.iid.C2567r;
import com.google.firebase.iid.C2569t;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C2588g;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4941i;
import p148g.p189d.p190a.p232c.p251i.C4944k;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5209h;

/* renamed from: com.google.firebase.messaging.y */
class C2655y {

    /* renamed from: i */
    private static final long f8479i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final FirebaseInstanceId f8480a;

    /* renamed from: b */
    private final Context f8481b;

    /* renamed from: c */
    private final C2569t f8482c;

    /* renamed from: d */
    private final C2566q f8483d;

    /* renamed from: e */
    private final Map<String, ArrayDeque<C4941i<Void>>> f8484e = new C3190a();

    /* renamed from: f */
    private final ScheduledExecutorService f8485f;

    /* renamed from: g */
    private boolean f8486g = false;

    /* renamed from: h */
    private final C2653w f8487h;

    private C2655y(FirebaseInstanceId firebaseInstanceId, C2569t tVar, C2653w wVar, C2566q qVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8480a = firebaseInstanceId;
        this.f8482c = tVar;
        this.f8487h = wVar;
        this.f8483d = qVar;
        this.f8481b = context;
        this.f8485f = scheduledExecutorService;
    }

    /* renamed from: a */
    private static <T> T m11813a(C4940h<T> hVar) throws IOException {
        try {
            return C4944k.m20946b(hVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: b */
    private void m11814b(String str) throws IOException {
        C2567r rVar = (C2567r) m11813a(this.f8480a.mo9417l());
        m11813a(this.f8483d.mo9460j(rVar.mo9463f(), rVar.mo9462a(), str));
    }

    /* renamed from: c */
    private void m11815c(String str) throws IOException {
        C2567r rVar = (C2567r) m11813a(this.f8480a.mo9417l());
        m11813a(this.f8483d.mo9461k(rVar.mo9463f(), rVar.mo9462a(), str));
    }

    /* renamed from: d */
    static C4940h<C2655y> m11816d(C5171c cVar, FirebaseInstanceId firebaseInstanceId, C2569t tVar, C5209h hVar, C5197c cVar2, C2588g gVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return m11817e(firebaseInstanceId, tVar, new C2566q(cVar, tVar, hVar, cVar2, gVar), context, scheduledExecutorService);
    }

    /* renamed from: e */
    static C4940h<C2655y> m11817e(FirebaseInstanceId firebaseInstanceId, C2569t tVar, C2566q qVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return C4944k.m20947c(scheduledExecutorService, new C2654x(context, scheduledExecutorService, firebaseInstanceId, tVar, qVar));
    }

    /* renamed from: g */
    static boolean m11818g() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    /* renamed from: i */
    static final /* synthetic */ C2655y m11819i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C2569t tVar, C2566q qVar) throws Exception {
        return new C2655y(firebaseInstanceId, tVar, C2653w.m11809a(context, scheduledExecutorService), qVar, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11820j(com.google.firebase.messaging.C2652v r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.c.i.i<java.lang.Void>>> r0 = r4.f8484e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo9632e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.c.i.i<java.lang.Void>>> r1 = r4.f8484e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.c.i.i<java.lang.Void>>> r1 = r4.f8484e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            g.d.a.c.i.i r2 = (p148g.p189d.p190a.p232c.p251i.C4941i) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo14885c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.c.i.i<java.lang.Void>>> r1 = r4.f8484e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C2655y.m11820j(com.google.firebase.messaging.v):void");
    }

    /* renamed from: n */
    private void m11821n() {
        if (!mo9639h()) {
            mo9645q(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9638f() {
        return this.f8487h.mo9635b() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized boolean mo9639h() {
        return this.f8486g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo9640k(C2652v vVar) throws IOException {
        String sb;
        String sb2;
        try {
            String b = vVar.mo9630b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals("S")) {
                c = 0;
            }
            if (c == 0) {
                m11814b(vVar.mo9631c());
                if (m11818g()) {
                    String c2 = vVar.mo9631c();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 31);
                    sb3.append("Subscribe to topic: ");
                    sb3.append(c2);
                    sb3.append(" succeeded.");
                    sb2 = sb3.toString();
                }
                return true;
            } else if (c != 1) {
                if (m11818g()) {
                    String valueOf = String.valueOf(vVar);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb4.append("Unknown topic operation");
                    sb4.append(valueOf);
                    sb4.append(".");
                    sb2 = sb4.toString();
                }
                return true;
            } else {
                m11815c(vVar.mo9631c());
                if (m11818g()) {
                    String c3 = vVar.mo9631c();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(c3).length() + 35);
                    sb5.append("Unsubscribe from topic: ");
                    sb5.append(c3);
                    sb5.append(" succeeded.");
                    sb2 = sb5.toString();
                }
                return true;
            }
            Log.d("FirebaseMessaging", sb2);
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 53);
                sb6.append("Topic operation failed: ");
                sb6.append(message);
                sb6.append(". Will retry Topic operation.");
                sb = sb6.toString();
            } else if (e.getMessage() == null) {
                sb = "Topic operation failed without exception message. Will retry Topic operation.";
            } else {
                throw e;
            }
            Log.e("FirebaseMessaging", sb);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9641l(Runnable runnable, long j) {
        this.f8485f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void mo9642m(boolean z) {
        this.f8486g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo9643o() {
        if (mo9638f()) {
            m11821n();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (mo9640k(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9644p() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.w r0 = r2.f8487h     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.v r0 = r0.mo9635b()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m11818g()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.mo9640k(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.w r1 = r2.f8487h
            r1.mo9636d(r0)
            r2.m11820j(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002e:
            throw r0
        L_0x002f:
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C2655y.mo9644p():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo9645q(long j) {
        mo9641l(new C2656z(this, this.f8481b, this.f8482c, Math.min(Math.max(30, j << 1), f8479i)), j);
        mo9642m(true);
    }
}
