package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.C2576z;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.a0 */
class C2540a0 implements Runnable {

    /* renamed from: f */
    private final long f8245f;

    /* renamed from: g */
    private final PowerManager.WakeLock f8246g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final FirebaseInstanceId f8247h;

    /* renamed from: i */
    ExecutorService f8248i = C2556h.m11430b();

    /* renamed from: com.google.firebase.iid.a0$a */
    static class C2541a extends BroadcastReceiver {

        /* renamed from: a */
        private C2540a0 f8249a;

        public C2541a(C2540a0 a0Var) {
            this.f8249a = a0Var;
        }

        /* renamed from: a */
        public void mo9436a() {
            if (FirebaseInstanceId.m11360s()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f8249a.mo9432b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C2540a0 a0Var = this.f8249a;
            if (a0Var != null && a0Var.mo9433d()) {
                if (FirebaseInstanceId.m11360s()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f8249a.f8247h.mo9413g(this.f8249a, 0);
                this.f8249a.mo9432b().unregisterReceiver(this);
                this.f8249a = null;
            }
        }
    }

    C2540a0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f8247h = firebaseInstanceId;
        this.f8245f = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo9432b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f8246g = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    private void m11394c(String str) {
        if ("[DEFAULT]".equals(this.f8247h.mo9414h().mo15277i())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(this.f8247h.mo9414h().mo15277i());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2551f(mo9432b(), this.f8248i).mo9444g(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo9432b() {
        return this.f8247h.mo9414h().mo15275g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9433d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo9432b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9434e() throws IOException {
        String str;
        C2576z.C2577a q = this.f8247h.mo9419q();
        if (!this.f8247h.mo9411I(q)) {
            return true;
        }
        try {
            String e = this.f8247h.mo9412e();
            if (e == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (q == null || (q != null && !e.equals(q.f8321a))) {
                m11394c(e);
            }
            return true;
        } catch (IOException e2) {
            if (C2566q.m11440f(e2.getMessage())) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                str = sb.toString();
            } else if (e2.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e2;
            }
            Log.w("FirebaseInstanceId", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", str);
            return false;
        }
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (C2575y.m11465b().mo9473e(mo9432b())) {
            this.f8246g.acquire();
        }
        try {
            this.f8247h.mo9408E(true);
            if (!this.f8247h.mo9422u()) {
                this.f8247h.mo9408E(false);
                if (C2575y.m11465b().mo9473e(mo9432b())) {
                    this.f8246g.release();
                }
            } else if (!C2575y.m11465b().mo9472d(mo9432b()) || mo9433d()) {
                if (mo9434e()) {
                    this.f8247h.mo9408E(false);
                } else {
                    this.f8247h.mo9410H(this.f8245f);
                }
                if (!C2575y.m11465b().mo9473e(mo9432b())) {
                    return;
                }
                this.f8246g.release();
            } else {
                new C2541a(this).mo9436a();
                if (C2575y.m11465b().mo9473e(mo9432b())) {
                    this.f8246g.release();
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f8247h.mo9408E(false);
            if (!C2575y.m11465b().mo9473e(mo9432b())) {
            }
        } catch (Throwable th) {
            if (C2575y.m11465b().mo9473e(mo9432b())) {
                this.f8246g.release();
            }
            throw th;
        }
    }
}
