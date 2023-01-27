package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.C2569t;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.z */
class C2656z implements Runnable {

    /* renamed from: k */
    private static final Object f8488k = new Object();

    /* renamed from: l */
    private static Boolean f8489l;

    /* renamed from: m */
    private static Boolean f8490m;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f8491f;

    /* renamed from: g */
    private final C2569t f8492g;

    /* renamed from: h */
    private final PowerManager.WakeLock f8493h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2655y f8494i;

    /* renamed from: j */
    private final long f8495j;

    /* renamed from: com.google.firebase.messaging.z$a */
    class C2657a extends BroadcastReceiver {

        /* renamed from: a */
        private C2656z f8496a;

        public C2657a(C2656z zVar) {
            this.f8496a = zVar;
        }

        /* renamed from: a */
        public void mo9647a() {
            if (C2656z.m11839j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            C2656z.this.f8491f.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (this.f8496a != null) {
                if (this.f8496a.m11838i()) {
                    if (C2656z.m11839j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f8496a.f8494i.mo9641l(this.f8496a, 0);
                    context.unregisterReceiver(this);
                    this.f8496a = null;
                }
            }
        }
    }

    C2656z(C2655y yVar, Context context, C2569t tVar, long j) {
        this.f8494i = yVar;
        this.f8491f = context;
        this.f8495j = j;
        this.f8492g = tVar;
        this.f8493h = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m11834e(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    /* renamed from: f */
    private static boolean m11835f(Context context) {
        boolean booleanValue;
        synchronized (f8488k) {
            Boolean valueOf = Boolean.valueOf(f8490m == null ? m11836g(context, "android.permission.ACCESS_NETWORK_STATE", f8490m) : f8490m.booleanValue());
            f8490m = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m11836g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m11834e(str));
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m11837h(Context context) {
        boolean booleanValue;
        synchronized (f8488k) {
            Boolean valueOf = Boolean.valueOf(f8489l == null ? m11836g(context, "android.permission.WAKE_LOCK", f8489l) : f8489l.booleanValue());
            f8489l = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m11838i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8491f.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m11839j() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (m11837h(this.f8491f)) {
            this.f8493h.acquire(C2625b.f8426a);
        }
        try {
            this.f8494i.mo9642m(true);
            if (!this.f8492g.mo9468g()) {
                this.f8494i.mo9642m(false);
                if (m11837h(this.f8491f)) {
                    try {
                        this.f8493h.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m11835f(this.f8491f) || m11838i()) {
                if (this.f8494i.mo9644p()) {
                    this.f8494i.mo9642m(false);
                } else {
                    this.f8494i.mo9645q(this.f8495j);
                }
                if (m11837h(this.f8491f)) {
                    try {
                        this.f8493h.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new C2657a(this).mo9647a();
                if (m11837h(this.f8491f)) {
                    try {
                        this.f8493h.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.f8494i.mo9642m(false);
            if (m11837h(this.f8491f)) {
                try {
                    this.f8493h.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (m11837h(this.f8491f)) {
                try {
                    this.f8493h.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
