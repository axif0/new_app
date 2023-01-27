package p148g.p189d.p190a.p232c.p233a.p234a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.stats.C1673a;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p148g.p189d.p190a.p232c.p237d.C4364a;
import p148g.p189d.p190a.p232c.p237d.C4375f;
import p148g.p189d.p190a.p232c.p237d.C4376g;
import p148g.p189d.p190a.p232c.p237d.C4377h;
import p148g.p189d.p190a.p232c.p237d.C4379j;
import p148g.p189d.p190a.p232c.p241f.p242a.C4407d;
import p148g.p189d.p190a.p232c.p241f.p242a.C4408e;

/* renamed from: g.d.a.c.a.a.a */
public class C4325a {

    /* renamed from: a */
    private C4364a f13816a;

    /* renamed from: b */
    private C4407d f13817b;

    /* renamed from: c */
    private boolean f13818c;

    /* renamed from: d */
    private final Object f13819d = new Object();

    /* renamed from: e */
    private C4327b f13820e;

    /* renamed from: f */
    private final Context f13821f;

    /* renamed from: g */
    private final boolean f13822g;

    /* renamed from: h */
    private final long f13823h;

    /* renamed from: g.d.a.c.a.a.a$a */
    public static final class C4326a {

        /* renamed from: a */
        private final String f13824a;

        /* renamed from: b */
        private final boolean f13825b;

        public C4326a(String str, boolean z) {
            this.f13824a = str;
            this.f13825b = z;
        }

        /* renamed from: a */
        public final String mo13612a() {
            return this.f13824a;
        }

        /* renamed from: b */
        public final boolean mo13613b() {
            return this.f13825b;
        }

        public final String toString() {
            String str = this.f13824a;
            boolean z = this.f13825b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: g.d.a.c.a.a.a$b */
    static class C4327b extends Thread {

        /* renamed from: f */
        private WeakReference<C4325a> f13826f;

        /* renamed from: g */
        private long f13827g;

        /* renamed from: h */
        CountDownLatch f13828h = new CountDownLatch(1);

        /* renamed from: i */
        boolean f13829i = false;

        public C4327b(C4325a aVar, long j) {
            this.f13826f = new WeakReference<>(aVar);
            this.f13827g = j;
            start();
        }

        /* renamed from: a */
        private final void m18487a() {
            C4325a aVar = (C4325a) this.f13826f.get();
            if (aVar != null) {
                aVar.mo13609a();
                this.f13829i = true;
            }
        }

        public final void run() {
            try {
                if (!this.f13828h.await(this.f13827g, TimeUnit.MILLISECONDS)) {
                    m18487a();
                }
            } catch (InterruptedException unused) {
                m18487a();
            }
        }
    }

    private C4325a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C1658o.m7845j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f13821f = context;
        this.f13818c = false;
        this.f13823h = j;
        this.f13822g = z2;
    }

    /* renamed from: b */
    public static C4326a m18476b(Context context) throws IOException, IllegalStateException, C4376g, C4377h {
        C4329c cVar = new C4329c(context);
        boolean a = cVar.mo13617a("gads:ad_id_app_context:enabled", false);
        float b = cVar.mo13618b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String c = cVar.mo13619c("gads:ad_id_use_shared_preference:experiment_id", BuildConfig.FLAVOR);
        C4325a aVar = new C4325a(context, -1, a, cVar.mo13617a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m18481h(false);
            C4326a c2 = aVar.mo13610c();
            aVar.m18482i(c2, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, c, (Throwable) null);
            aVar.mo13609a();
            return c2;
        } catch (Throwable th) {
            aVar.mo13609a();
            throw th;
        }
    }

    /* renamed from: d */
    public static void m18477d(boolean z) {
    }

    /* renamed from: e */
    private static C4364a m18478e(Context context, boolean z) throws IOException, C4376g, C4377h {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int h = C4375f.m18582f().mo13699h(context, C4379j.f13918a);
            if (h == 0 || h == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C4364a aVar = new C4364a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C1673a.m7920b().mo6578a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C4376g(9);
        }
    }

    /* renamed from: f */
    private static C4407d m18479f(Context context, C4364a aVar) throws IOException {
        try {
            return C4408e.m18651n(aVar.mo13669a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18480g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13819d
            monitor-enter(r0)
            g.d.a.c.a.a.a$b r1 = r6.f13820e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            g.d.a.c.a.a.a$b r1 = r6.f13820e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f13828h     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            g.d.a.c.a.a.a$b r1 = r6.f13820e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f13823h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            g.d.a.c.a.a.a$b r1 = new g.d.a.c.a.a.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f13823h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f13820e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p233a.p234a.C4325a.m18480g():void");
    }

    /* renamed from: h */
    private final void m18481h(boolean z) throws IOException, IllegalStateException, C4376g, C4377h {
        C1658o.m7844i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f13818c) {
                mo13609a();
            }
            C4364a e = m18478e(this.f13821f, this.f13822g);
            this.f13816a = e;
            this.f13817b = m18479f(this.f13821f, e);
            this.f13818c = true;
            if (z) {
                m18480g();
            }
        }
    }

    /* renamed from: i */
    private final boolean m18482i(C4326a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.mo13613b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.mo13612a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.mo13612a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C4328b(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13609a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C1658o.m7844i(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f13821f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            g.d.a.c.d.a r0 = r3.f13816a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f13818c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C1673a.m7920b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f13821f     // Catch:{ all -> 0x001f }
            g.d.a.c.d.a r2 = r3.f13816a     // Catch:{ all -> 0x001f }
            r0.mo6579c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f13818c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f13817b = r0     // Catch:{ all -> 0x0033 }
            r3.f13816a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p233a.p234a.C4325a.mo13609a():void");
    }

    /* renamed from: c */
    public C4326a mo13610c() throws IOException {
        C4326a aVar;
        C1658o.m7844i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f13818c) {
                synchronized (this.f13819d) {
                    if (this.f13820e == null || !this.f13820e.f13829i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m18481h(false);
                    if (!this.f13818c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C1658o.m7845j(this.f13816a);
            C1658o.m7845j(this.f13817b);
            aVar = new C4326a(this.f13817b.mo13734f(), this.f13817b.mo13735t0(true));
        }
        m18480g();
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo13609a();
        super.finalize();
    }
}
