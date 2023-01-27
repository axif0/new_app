package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.p038q.C1694a;
import com.google.firebase.iid.C2576z;
import com.google.firebase.installations.C2588g;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4944k;
import p148g.p189d.p281b.C5169a;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p284g.C5191a;
import p148g.p189d.p281b.p284g.C5192b;
import p148g.p189d.p281b.p284g.C5194d;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5209h;

public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f8226i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C2576z f8227j;

    /* renamed from: k */
    private static final Pattern f8228k = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: l */
    static ScheduledExecutorService f8229l;

    /* renamed from: a */
    final Executor f8230a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5171c f8231b;

    /* renamed from: c */
    private final C2569t f8232c;

    /* renamed from: d */
    private final C2566q f8233d;

    /* renamed from: e */
    private final C2573x f8234e;

    /* renamed from: f */
    private final C2588g f8235f;

    /* renamed from: g */
    private boolean f8236g;

    /* renamed from: h */
    private final C2537a f8237h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C2537a {

        /* renamed from: a */
        private boolean f8238a;

        /* renamed from: b */
        private final C5194d f8239b;

        /* renamed from: c */
        private boolean f8240c;

        /* renamed from: d */
        private C5192b<C5169a> f8241d;

        /* renamed from: e */
        private Boolean f8242e;

        C2537a(C5194d dVar) {
            this.f8239b = dVar;
        }

        /* renamed from: c */
        private boolean m11384c() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context g = FirebaseInstanceId.this.f8231b.mo15275g();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(g.getPackageName());
                ResolveInfo resolveService = g.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* renamed from: e */
        private Boolean m11385e() {
            ApplicationInfo applicationInfo;
            Context g = FirebaseInstanceId.this.f8231b.mo15275g();
            SharedPreferences sharedPreferences = g.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = g.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(g.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo9425a() {
            if (!this.f8240c) {
                this.f8238a = m11384c();
                Boolean e = m11385e();
                this.f8242e = e;
                if (e == null && this.f8238a) {
                    C2564o oVar = new C2564o(this);
                    this.f8241d = oVar;
                    this.f8239b.mo9401a(C5169a.class, oVar);
                }
                this.f8240c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            return r1.f8238a && com.google.firebase.iid.FirebaseInstanceId.m11351a(r1.f8243f).mo15280p();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo9426b() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.mo9425a()     // Catch:{ all -> 0x0025 }
                java.lang.Boolean r0 = r1.f8242e     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.f8242e     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0025 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.f8238a     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0025 }
                g.d.b.c r0 = r0.f8231b     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.mo15280p()     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                r0 = 1
            L_0x0021:
                monitor-exit(r1)
                return r0
            L_0x0023:
                r0 = 0
                goto L_0x0021
            L_0x0025:
                r0 = move-exception
                monitor-exit(r1)
                goto L_0x0029
            L_0x0028:
                throw r0
            L_0x0029:
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C2537a.mo9426b():boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final /* synthetic */ void mo9427d(C5191a aVar) {
            synchronized (this) {
                if (mo9426b()) {
                    FirebaseInstanceId.this.m11350G();
                }
            }
        }
    }

    FirebaseInstanceId(C5171c cVar, C2569t tVar, Executor executor, Executor executor2, C5194d dVar, C5209h hVar, C5197c cVar2, C2588g gVar) {
        this.f8236g = false;
        if (C2569t.m11451c(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f8227j == null) {
                    f8227j = new C2576z(cVar.mo15275g());
                }
            }
            this.f8231b = cVar;
            this.f8232c = tVar;
            this.f8233d = new C2566q(cVar, tVar, hVar, cVar2, gVar);
            this.f8230a = executor2;
            this.f8237h = new C2537a(dVar);
            this.f8234e = new C2573x(executor);
            this.f8235f = gVar;
            executor2.execute(new C2558i(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    FirebaseInstanceId(C5171c cVar, C5194d dVar, C5209h hVar, C5197c cVar2, C2588g gVar) {
        this(cVar, new C2569t(cVar.mo15275g()), C2556h.m11430b(), C2556h.m11430b(), dVar, hVar, cVar2, gVar);
    }

    /* renamed from: C */
    private static String m11349C(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m11350G() {
        if (mo9411I(mo9419q())) {
            mo9409F();
        }
    }

    /* renamed from: c */
    private <T> T m11353c(C4940h<T> hVar) throws IOException {
        try {
            return C4944k.m20946b(hVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo9407D();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: d */
    private static <T> T m11354d(C4940h<T> hVar) throws InterruptedException {
        C1658o.m7846k(hVar, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.mo14864b(C2560k.f8281a, new C2561l(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return m11358n(hVar);
    }

    /* renamed from: f */
    private static void m11355f(C5171c cVar) {
        C1658o.m7842g(cVar.mo15278j().mo15290e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        C1658o.m7842g(cVar.mo15278j().mo15288c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        C1658o.m7842g(cVar.mo15278j().mo15287b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        C1658o.m7837b(m11362w(cVar.mo15278j().mo15288c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C1658o.m7837b(m11361v(cVar.mo15278j().mo15287b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(C5171c cVar) {
        m11355f(cVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) cVar.mo15274f(FirebaseInstanceId.class);
        C1658o.m7846k(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: k */
    public static FirebaseInstanceId m11356k() {
        return getInstance(C5171c.m21659h());
    }

    /* renamed from: m */
    private C4940h<C2567r> m11357m(String str, String str2) {
        return C4944k.m20949e(null).mo14868f(this.f8230a, new C2559j(this, str, m11349C(str2)));
    }

    /* renamed from: n */
    private static <T> T m11358n(C4940h<T> hVar) {
        if (hVar.mo14874l()) {
            return hVar.mo14870h();
        }
        if (hVar.mo14872j()) {
            throw new CancellationException("Task is already canceled");
        } else if (hVar.mo14873k()) {
            throw new IllegalStateException(hVar.mo14869g());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    /* renamed from: o */
    private String m11359o() {
        return "[DEFAULT]".equals(this.f8231b.mo15277i()) ? BuildConfig.FLAVOR : this.f8231b.mo15279k();
    }

    /* renamed from: s */
    static boolean m11360s() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* renamed from: v */
    static boolean m11361v(String str) {
        return f8228k.matcher(str).matches();
    }

    /* renamed from: w */
    static boolean m11362w(String str) {
        return str.contains(":");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ C4940h mo9405A(String str, String str2, C4940h hVar) throws Exception {
        String j = mo9416j();
        C2576z.C2577a r = mo9420r(str, str2);
        return !mo9411I(r) ? C4944k.m20949e(new C2568s(j, r.f8321a)) : this.f8234e.mo9469a(str, str2, new C2562m(this, j, str, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ void mo9406B() {
        if (mo9421t()) {
            m11350G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized void mo9407D() {
        f8227j.mo9475d();
        if (mo9421t()) {
            mo9409F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public synchronized void mo9408E(boolean z) {
        this.f8236g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public synchronized void mo9409F() {
        if (!this.f8236g) {
            mo9410H(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public synchronized void mo9410H(long j) {
        mo9413g(new C2540a0(this, Math.min(Math.max(30, j << 1), f8226i)), j);
        this.f8236g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo9411I(C2576z.C2577a aVar) {
        return aVar == null || aVar.mo9480b(this.f8232c.mo9464a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9412e() throws IOException {
        return mo9418p(C2569t.m11451c(this.f8231b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9413g(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f8229l == null) {
                f8229l = new ScheduledThreadPoolExecutor(1, new C1694a("FirebaseInstanceId"));
            }
            f8229l.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5171c mo9414h() {
        return this.f8231b;
    }

    /* renamed from: i */
    public String mo9415i() {
        m11355f(this.f8231b);
        m11350G();
        return mo9416j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo9416j() {
        try {
            f8227j.mo9479i(this.f8231b.mo15279k());
            return (String) m11354d(this.f8235f.mo9496f());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    public C4940h<C2567r> mo9417l() {
        m11355f(this.f8231b);
        return m11357m(C2569t.m11451c(this.f8231b), "*");
    }

    /* renamed from: p */
    public String mo9418p(String str, String str2) throws IOException {
        m11355f(this.f8231b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C2567r) m11353c(m11357m(str, str2))).mo9462a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C2576z.C2577a mo9419q() {
        return mo9420r(C2569t.m11451c(this.f8231b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C2576z.C2577a mo9420r(String str, String str2) {
        return f8227j.mo9476f(m11359o(), str, str2);
    }

    /* renamed from: t */
    public boolean mo9421t() {
        return this.f8237h.mo9426b();
    }

    /* renamed from: u */
    public boolean mo9422u() {
        return this.f8232c.mo9468g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ C4940h mo9423y(String str, String str2, String str3, String str4) throws Exception {
        f8227j.mo9478h(m11359o(), str, str2, str4, this.f8232c.mo9464a());
        return C4944k.m20949e(new C2568s(str3, str4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ C4940h mo9424z(String str, String str2, String str3) {
        return this.f8233d.mo9458d(str, str2, str3).mo14875m(this.f8230a, new C2563n(this, str2, str3, str));
    }
}
