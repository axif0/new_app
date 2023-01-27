package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0575h;
import com.google.android.gms.common.util.C1689l;
import com.google.firebase.messaging.C2623a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p148g.p189d.p190a.p232c.p251i.C4944k;

/* renamed from: com.google.firebase.messaging.c */
class C2627c {

    /* renamed from: a */
    private final Executor f8427a;

    /* renamed from: b */
    private final Context f8428b;

    /* renamed from: c */
    private final C2644p f8429c;

    public C2627c(Context context, C2644p pVar, Executor executor) {
        this.f8427a = executor;
        this.f8428b = context;
        this.f8429c = pVar;
    }

    /* renamed from: b */
    private boolean m11696b() {
        if (((KeyguardManager) this.f8428b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C1689l.m7964g()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f8428b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m11697c(C2623a.C2624a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f8428b.getSystemService("notification")).notify(aVar.f8424b, aVar.f8425c, aVar.f8423a.mo2839b());
    }

    /* renamed from: d */
    private C2642n m11698d() {
        C2642n j = C2642n.m11728j(this.f8429c.mo9611p("gcm.n.image"));
        if (j != null) {
            j.mo9596o(this.f8427a);
        }
        return j;
    }

    /* renamed from: e */
    private void m11699e(C0575h.C0580e eVar, C2642n nVar) {
        if (nVar != null) {
            try {
                Bitmap bitmap = (Bitmap) C4944k.m20946b(nVar.mo9595m(), 5, TimeUnit.SECONDS);
                eVar.mo2849o(bitmap);
                C0575h.C0577b bVar = new C0575h.C0577b();
                bVar.mo2834h(bitmap);
                bVar.mo2833g((Bitmap) null);
                eVar.mo2857w(bVar);
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                nVar.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                nVar.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9576a() {
        if (this.f8429c.mo9597a("gcm.n.noui")) {
            return true;
        }
        if (m11696b()) {
            return false;
        }
        C2642n d = m11698d();
        C2623a.C2624a d2 = C2623a.m11681d(this.f8428b, this.f8429c);
        m11699e(d2.f8423a, d);
        m11697c(d2);
        return true;
    }
}
