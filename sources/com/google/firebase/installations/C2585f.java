package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.google.firebase.installations.C2589h;
import com.google.firebase.installations.p045p.C2602b;
import com.google.firebase.installations.p045p.C2603c;
import com.google.firebase.installations.p045p.C2605d;
import com.google.firebase.installations.p046q.C2613c;
import com.google.firebase.installations.p046q.C2614d;
import com.google.firebase.installations.p046q.C2617e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4941i;
import p148g.p189d.p190a.p232c.p251i.C4944k;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5209h;

/* renamed from: com.google.firebase.installations.f */
public class C2585f implements C2588g {

    /* renamed from: l */
    private static final Object f8337l = new Object();

    /* renamed from: m */
    private static final ThreadFactory f8338m = new C2586a();

    /* renamed from: a */
    private final C5171c f8339a;

    /* renamed from: b */
    private final C2613c f8340b;

    /* renamed from: c */
    private final C2603c f8341c;

    /* renamed from: d */
    private final C2598o f8342d;

    /* renamed from: e */
    private final C2602b f8343e;

    /* renamed from: f */
    private final C2596m f8344f;

    /* renamed from: g */
    private final Object f8345g;

    /* renamed from: h */
    private final ExecutorService f8346h;

    /* renamed from: i */
    private final ExecutorService f8347i;

    /* renamed from: j */
    private String f8348j;

    /* renamed from: k */
    private final List<C2597n> f8349k;

    /* renamed from: com.google.firebase.installations.f$a */
    class C2586a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f8350a = new AtomicInteger(1);

        C2586a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f8350a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.f$b */
    static /* synthetic */ class C2587b {

        /* renamed from: a */
        static final /* synthetic */ int[] f8351a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8352b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.q.e$b[] r0 = com.google.firebase.installations.p046q.C2617e.C2619b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8352b = r0
                r1 = 1
                com.google.firebase.installations.q.e$b r2 = com.google.firebase.installations.p046q.C2617e.C2619b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8352b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.q.e$b r3 = com.google.firebase.installations.p046q.C2617e.C2619b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f8352b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.q.e$b r3 = com.google.firebase.installations.p046q.C2617e.C2619b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.q.d$b[] r2 = com.google.firebase.installations.p046q.C2614d.C2616b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f8351a = r2
                com.google.firebase.installations.q.d$b r3 = com.google.firebase.installations.p046q.C2614d.C2616b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f8351a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.q.d$b r2 = com.google.firebase.installations.p046q.C2614d.C2616b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C2585f.C2587b.<clinit>():void");
        }
    }

    C2585f(C5171c cVar, C5209h hVar, C5197c cVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f8338m), cVar, new C2613c(cVar.mo15275g(), hVar, cVar2), new C2603c(cVar), new C2598o(), new C2602b(cVar), new C2596m());
    }

    C2585f(ExecutorService executorService, C5171c cVar, C2613c cVar2, C2603c cVar3, C2598o oVar, C2602b bVar, C2596m mVar) {
        this.f8345g = new Object();
        this.f8349k = new ArrayList();
        this.f8339a = cVar;
        this.f8340b = cVar2;
        this.f8341c = cVar3;
        this.f8342d = oVar;
        this.f8343e = bVar;
        this.f8344f = mVar;
        this.f8346h = executorService;
        this.f8347i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f8338m);
    }

    /* renamed from: b */
    private C4940h<C2594l> m11496b() {
        C4941i iVar = new C4941i();
        m11498d(new C2592j(this.f8342d, iVar));
        return iVar.mo14883a();
    }

    /* renamed from: c */
    private C4940h<String> m11497c() {
        C4941i iVar = new C4941i();
        m11498d(new C2593k(iVar));
        return iVar.mo14883a();
    }

    /* renamed from: d */
    private void m11498d(C2597n nVar) {
        synchronized (this.f8345g) {
            this.f8349k.add(nVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11499e(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.p.d r0 = r2.m11505n()
            boolean r1 = r0.mo9529i()     // Catch:{ h -> 0x0059 }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo9532l()     // Catch:{ h -> 0x0059 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.o r3 = r2.f8342d     // Catch:{ h -> 0x0059 }
            boolean r3 = r3.mo9505b(r0)     // Catch:{ h -> 0x0059 }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.p.d r3 = r2.m11501h(r0)     // Catch:{ h -> 0x0059 }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.p.d r3 = r2.m11513w(r0)     // Catch:{ h -> 0x0059 }
        L_0x0026:
            r2.m11507q(r3)
            boolean r0 = r3.mo9531k()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r3.mo9508d()
            r2.m11516z(r0)
        L_0x0036:
            boolean r0 = r3.mo9529i()
            if (r0 == 0) goto L_0x0047
            com.google.firebase.installations.h r0 = new com.google.firebase.installations.h
            com.google.firebase.installations.h$a r1 = com.google.firebase.installations.C2589h.C2590a.BAD_CONFIG
            r0.<init>(r1)
        L_0x0043:
            r2.m11514x(r3, r0)
            goto L_0x0058
        L_0x0047:
            boolean r0 = r3.mo9530j()
            if (r0 == 0) goto L_0x0055
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r1)
            goto L_0x0043
        L_0x0055:
            r2.m11515y(r3)
        L_0x0058:
            return
        L_0x0059:
            r3 = move-exception
            r2.m11514x(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C2585f.m11499e(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m11500g(boolean z) {
        C2605d o = m11506o();
        if (z) {
            o = o.mo9535p();
        }
        m11515y(o);
        this.f8347i.execute(C2584e.m11495a(this, z));
    }

    /* renamed from: h */
    private C2605d m11501h(C2605d dVar) throws C2589h {
        C2617e e = this.f8340b.mo9565e(mo9497i(), dVar.mo9508d(), mo9499p(), dVar.mo9511f());
        int i = C2587b.f8352b[e.mo9554b().ordinal()];
        if (i == 1) {
            return dVar.mo9534o(e.mo9555c(), e.mo9556d(), this.f8342d.mo9504a());
        } else if (i == 2) {
            return dVar.mo9536q("BAD CONFIG");
        } else {
            if (i == 3) {
                m11516z((String) null);
                return dVar.mo9537r();
            }
            throw new C2589h("Firebase Installations Service is unavailable. Please try again later.", C2589h.C2590a.UNAVAILABLE);
        }
    }

    /* renamed from: k */
    private synchronized String m11502k() {
        return this.f8348j;
    }

    /* renamed from: l */
    public static C2585f m11503l() {
        return m11504m(C5171c.m21659h());
    }

    /* renamed from: m */
    public static C2585f m11504m(C5171c cVar) {
        C1658o.m7837b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (C2585f) cVar.mo15274f(C2588g.class);
    }

    /* renamed from: n */
    private C2605d m11505n() {
        C2605d c;
        synchronized (f8337l) {
            C2581b a = C2581b.m11491a(this.f8339a.mo15275g(), "generatefid.lock");
            try {
                c = this.f8341c.mo9528c();
                if (a != null) {
                    a.mo9491b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo9491b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: o */
    private C2605d m11506o() {
        C2605d c;
        synchronized (f8337l) {
            C2581b a = C2581b.m11491a(this.f8339a.mo15275g(), "generatefid.lock");
            try {
                c = this.f8341c.mo9528c();
                if (c.mo9530j()) {
                    String v = m11512v(c);
                    C2603c cVar = this.f8341c;
                    c = c.mo9539t(v);
                    cVar.mo9527a(c);
                }
                if (a != null) {
                    a.mo9491b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo9491b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: q */
    private void m11507q(C2605d dVar) {
        synchronized (f8337l) {
            C2581b a = C2581b.m11491a(this.f8339a.mo15275g(), "generatefid.lock");
            try {
                this.f8341c.mo9527a(dVar);
                if (a != null) {
                    a.mo9491b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo9491b();
                }
                throw th;
            }
        }
    }

    /* renamed from: u */
    private void m11511u() {
        C1658o.m7842g(mo9498j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C1658o.m7842g(mo9499p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C1658o.m7842g(mo9497i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C1658o.m7837b(C2598o.m11544d(mo9498j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C1658o.m7837b(C2598o.m11543c(mo9497i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: v */
    private String m11512v(C2605d dVar) {
        if ((!this.f8339a.mo15277i().equals("CHIME_ANDROID_SDK") && !this.f8339a.mo15281q()) || !dVar.mo9533m()) {
            return this.f8344f.mo9503a();
        }
        String f = this.f8343e.mo9525f();
        return TextUtils.isEmpty(f) ? this.f8344f.mo9503a() : f;
    }

    /* renamed from: w */
    private C2605d m11513w(C2605d dVar) throws C2589h {
        C2614d d = this.f8340b.mo9564d(mo9497i(), dVar.mo9508d(), mo9499p(), mo9498j(), (dVar.mo9508d() == null || dVar.mo9508d().length() != 11) ? null : this.f8343e.mo9526i());
        int i = C2587b.f8351a[d.mo9543e().ordinal()];
        if (i == 1) {
            return dVar.mo9538s(d.mo9541c(), d.mo9542d(), this.f8342d.mo9504a(), d.mo9540b().mo9555c(), d.mo9540b().mo9556d());
        } else if (i == 2) {
            return dVar.mo9536q("BAD CONFIG");
        } else {
            throw new C2589h("Firebase Installations Service is unavailable. Please try again later.", C2589h.C2590a.UNAVAILABLE);
        }
    }

    /* renamed from: x */
    private void m11514x(C2605d dVar, Exception exc) {
        synchronized (this.f8345g) {
            Iterator<C2597n> it = this.f8349k.iterator();
            while (it.hasNext()) {
                if (it.next().mo9501a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: y */
    private void m11515y(C2605d dVar) {
        synchronized (this.f8345g) {
            Iterator<C2597n> it = this.f8349k.iterator();
            while (it.hasNext()) {
                if (it.next().mo9502b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    private synchronized void m11516z(String str) {
        this.f8348j = str;
    }

    /* renamed from: a */
    public C4940h<C2594l> mo9495a(boolean z) {
        m11511u();
        C4940h<C2594l> b = m11496b();
        this.f8346h.execute(C2583d.m11494a(this, z));
        return b;
    }

    /* renamed from: f */
    public C4940h<String> mo9496f() {
        m11511u();
        String k = m11502k();
        if (k != null) {
            return C4944k.m20949e(k);
        }
        C4940h<String> c = m11497c();
        this.f8346h.execute(C2582c.m11493a(this));
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo9497i() {
        return this.f8339a.mo15278j().mo15287b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo9498j() {
        return this.f8339a.mo15278j().mo15288c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo9499p() {
        return this.f8339a.mo15278j().mo15290e();
    }
}
