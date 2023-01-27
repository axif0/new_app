package com.bumptech.glide.load.p008o;

import android.os.Process;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p008o.C1132p;
import com.bumptech.glide.p029s.C1401j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.o.a */
final class C1035a {

    /* renamed from: a */
    private final boolean f4005a;

    /* renamed from: b */
    final Map<C0998g, C1040d> f4006b;

    /* renamed from: c */
    private final ReferenceQueue<C1132p<?>> f4007c;

    /* renamed from: d */
    private C1132p.C1133a f4008d;

    /* renamed from: e */
    private volatile boolean f4009e;

    /* renamed from: f */
    private volatile C1039c f4010f;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    class C1036a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.o.a$a$a */
        class C1037a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f4011f;

            C1037a(C1036a aVar, Runnable runnable) {
                this.f4011f = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f4011f.run();
            }
        }

        C1036a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C1037a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$b */
    class C1038b implements Runnable {
        C1038b() {
        }

        public void run() {
            C1035a.this.mo5210b();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$c */
    interface C1039c {
        /* renamed from: a */
        void mo5218a();
    }

    /* renamed from: com.bumptech.glide.load.o.a$d */
    static final class C1040d extends WeakReference<C1132p<?>> {

        /* renamed from: a */
        final C0998g f4013a;

        /* renamed from: b */
        final boolean f4014b;

        /* renamed from: c */
        C1141v<?> f4015c;

        C1040d(C0998g gVar, C1132p<?> pVar, ReferenceQueue<? super C1132p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            C1141v<?> vVar;
            C1401j.m6972d(gVar);
            this.f4013a = gVar;
            if (!pVar.mo5424f() || !z) {
                vVar = null;
            } else {
                C1141v<?> e = pVar.mo5423e();
                C1401j.m6972d(e);
                vVar = e;
            }
            this.f4015c = vVar;
            this.f4014b = pVar.mo5424f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5219a() {
            this.f4015c = null;
            clear();
        }
    }

    C1035a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C1036a()));
    }

    C1035a(boolean z, Executor executor) {
        this.f4006b = new HashMap();
        this.f4007c = new ReferenceQueue<>();
        this.f4005a = z;
        executor.execute(new C1038b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo5209a(C0998g gVar, C1132p<?> pVar) {
        C1040d put = this.f4006b.put(gVar, new C1040d(gVar, pVar, this.f4007c, this.f4005a));
        if (put != null) {
            put.mo5219a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5210b() {
        while (!this.f4009e) {
            try {
                mo5211c((C1040d) this.f4007c.remove());
                C1039c cVar = this.f4010f;
                if (cVar != null) {
                    cVar.mo5218a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5211c(C1040d dVar) {
        synchronized (this) {
            this.f4006b.remove(dVar.f4013a);
            if (dVar.f4014b) {
                if (dVar.f4015c != null) {
                    this.f4008d.mo5384d(dVar.f4013a, new C1132p(dVar.f4015c, true, false, dVar.f4013a, this.f4008d));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo5212d(C0998g gVar) {
        C1040d remove = this.f4006b.remove(gVar);
        if (remove != null) {
            remove.mo5219a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.p008o.C1132p<?> mo5213e(com.bumptech.glide.load.C0998g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.g, com.bumptech.glide.load.o.a$d> r0 = r1.f4006b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.o.a$d r2 = (com.bumptech.glide.load.p008o.C1035a.C1040d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.o.p r0 = (com.bumptech.glide.load.p008o.C1132p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo5211c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p008o.C1035a.mo5213e(com.bumptech.glide.load.g):com.bumptech.glide.load.o.p");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5214f(C1132p.C1133a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f4008d = aVar;
            }
        }
    }
}
