package com.google.firebase.iid;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p251i.C4940h;

/* renamed from: com.google.firebase.iid.x */
class C2573x {

    /* renamed from: a */
    private final Executor f8310a;

    /* renamed from: b */
    private final Map<Pair<String, String>, C4940h<C2567r>> f8311b = new C3190a();

    /* renamed from: com.google.firebase.iid.x$a */
    interface C2574a {
        C4940h<C2567r> start();
    }

    C2573x(Executor executor) {
        this.f8310a = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p148g.p189d.p190a.p232c.p251i.C4940h<com.google.firebase.iid.C2567r> mo9469a(java.lang.String r4, java.lang.String r5, com.google.firebase.iid.C2573x.C2574a r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0081 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0081 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, g.d.a.c.i.h<com.google.firebase.iid.r>> r4 = r3.f8311b     // Catch:{ all -> 0x0081 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0081 }
            g.d.a.c.i.h r4 = (p148g.p189d.p190a.p232c.p251i.C4940h) r4     // Catch:{ all -> 0x0081 }
            r5 = 3
            if (r4 == 0) goto L_0x003f
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0081 }
            int r0 = r0.length()     // Catch:{ all -> 0x0081 }
            int r0 = r0 + 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            r1.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0081 }
        L_0x003d:
            monitor-exit(r3)
            return r4
        L_0x003f:
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0081 }
            int r1 = r1.length()     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x0081 }
            r2.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0081 }
        L_0x006b:
            g.d.a.c.i.h r4 = r6.start()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Executor r5 = r3.f8310a     // Catch:{ all -> 0x0081 }
            com.google.firebase.iid.w r6 = new com.google.firebase.iid.w     // Catch:{ all -> 0x0081 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0081 }
            g.d.a.c.i.h r4 = r4.mo14868f(r5, r6)     // Catch:{ all -> 0x0081 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, g.d.a.c.i.h<com.google.firebase.iid.r>> r5 = r3.f8311b     // Catch:{ all -> 0x0081 }
            r5.put(r0, r4)     // Catch:{ all -> 0x0081 }
            monitor-exit(r3)
            return r4
        L_0x0081:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2573x.mo9469a(java.lang.String, java.lang.String, com.google.firebase.iid.x$a):g.d.a.c.i.h");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C4940h mo9470b(Pair pair, C4940h hVar) throws Exception {
        synchronized (this) {
            this.f8311b.remove(pair);
        }
        return hVar;
    }
}
