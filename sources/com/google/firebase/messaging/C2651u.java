package com.google.firebase.messaging;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.u */
final class C2651u {

    /* renamed from: a */
    private final SharedPreferences f8460a;

    /* renamed from: b */
    private final String f8461b;

    /* renamed from: c */
    private final String f8462c;

    /* renamed from: d */
    private final ArrayDeque<String> f8463d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f8464e;

    /* renamed from: f */
    private boolean f8465f = false;

    private C2651u(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8460a = sharedPreferences;
        this.f8461b = str;
        this.f8462c = str2;
        this.f8464e = executor;
    }

    /* renamed from: b */
    private final boolean m11795b(boolean z) {
        if (z && !this.f8465f) {
            m11799i();
        }
        return z;
    }

    /* renamed from: c */
    static C2651u m11796c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C2651u uVar = new C2651u(sharedPreferences, str, str2, executor);
        uVar.m11797d();
        return uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11797d() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f8463d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f8463d     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences r1 = r6.f8460a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r6.f8461b     // Catch:{ all -> 0x004a }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r6.f8462c     // Catch:{ all -> 0x004a }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0021
            goto L_0x0048
        L_0x0021:
            java.lang.String r2 = r6.f8462c     // Catch:{ all -> 0x004a }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x004a }
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x0032:
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x0034:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]     // Catch:{ all -> 0x004a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            java.util.ArrayDeque<java.lang.String> r5 = r6.f8463d     // Catch:{ all -> 0x004a }
            r5.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004d:
            throw r1
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C2651u.m11797d():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void mo9626a() {
        synchronized (this.f8463d) {
            this.f8460a.edit().putString(this.f8461b, mo9629g()).commit();
        }
    }

    /* renamed from: i */
    private final void m11799i() {
        this.f8464e.execute(new C2650t(this));
    }

    /* renamed from: e */
    public final String mo9627e() {
        String peek;
        synchronized (this.f8463d) {
            peek = this.f8463d.peek();
        }
        return peek;
    }

    /* renamed from: f */
    public final boolean mo9628f(Object obj) {
        boolean remove;
        synchronized (this.f8463d) {
            remove = this.f8463d.remove(obj);
            m11795b(remove);
        }
        return remove;
    }

    /* renamed from: g */
    public final String mo9629g() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f8463d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f8462c);
        }
        return sb.toString();
    }
}
