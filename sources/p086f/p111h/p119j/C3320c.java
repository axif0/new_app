package p086f.p111h.p119j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: f.h.j.c */
public class C3320c {

    /* renamed from: a */
    private final Object f10576a = new Object();

    /* renamed from: b */
    private HandlerThread f10577b;

    /* renamed from: c */
    private Handler f10578c;

    /* renamed from: d */
    private int f10579d;

    /* renamed from: e */
    private Handler.Callback f10580e = new C3321a();

    /* renamed from: f */
    private final int f10581f;

    /* renamed from: g */
    private final int f10582g;

    /* renamed from: h */
    private final String f10583h;

    /* renamed from: f.h.j.c$a */
    class C3321a implements Handler.Callback {
        C3321a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C3320c.this.mo11493a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C3320c.this.mo11494b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: f.h.j.c$b */
    class C3322b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callable f10585f;

        /* renamed from: g */
        final /* synthetic */ Handler f10586g;

        /* renamed from: h */
        final /* synthetic */ C3325d f10587h;

        /* renamed from: f.h.j.c$b$a */
        class C3323a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Object f10588f;

            C3323a(Object obj) {
                this.f10588f = obj;
            }

            public void run() {
                C3322b.this.f10587h.mo11481a(this.f10588f);
            }
        }

        C3322b(C3320c cVar, Callable callable, Handler handler, C3325d dVar) {
            this.f10585f = callable;
            this.f10586g = handler;
            this.f10587h = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f10585f.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f10586g.post(new C3323a(obj));
        }
    }

    /* renamed from: f.h.j.c$c */
    class C3324c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AtomicReference f10590f;

        /* renamed from: g */
        final /* synthetic */ Callable f10591g;

        /* renamed from: h */
        final /* synthetic */ ReentrantLock f10592h;

        /* renamed from: i */
        final /* synthetic */ AtomicBoolean f10593i;

        /* renamed from: j */
        final /* synthetic */ Condition f10594j;

        C3324c(C3320c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f10590f = atomicReference;
            this.f10591g = callable;
            this.f10592h = reentrantLock;
            this.f10593i = atomicBoolean;
            this.f10594j = condition;
        }

        public void run() {
            try {
                this.f10590f.set(this.f10591g.call());
            } catch (Exception unused) {
            }
            this.f10592h.lock();
            try {
                this.f10593i.set(false);
                this.f10594j.signal();
            } finally {
                this.f10592h.unlock();
            }
        }
    }

    /* renamed from: f.h.j.c$d */
    public interface C3325d<T> {
        /* renamed from: a */
        void mo11481a(T t);
    }

    public C3320c(String str, int i, int i2) {
        this.f10583h = str;
        this.f10582g = i;
        this.f10581f = i2;
        this.f10579d = 0;
    }

    /* renamed from: c */
    private void m14292c(Runnable runnable) {
        synchronized (this.f10576a) {
            if (this.f10577b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f10583h, this.f10582g);
                this.f10577b = handlerThread;
                handlerThread.start();
                this.f10578c = new Handler(this.f10577b.getLooper(), this.f10580e);
                this.f10579d++;
            }
            this.f10578c.removeMessages(0);
            this.f10578c.sendMessage(this.f10578c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11493a() {
        synchronized (this.f10576a) {
            if (!this.f10578c.hasMessages(1)) {
                this.f10577b.quit();
                this.f10577b = null;
                this.f10578c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11494b(Runnable runnable) {
        runnable.run();
        synchronized (this.f10576a) {
            this.f10578c.removeMessages(0);
            this.f10578c.sendMessageDelayed(this.f10578c.obtainMessage(0), (long) this.f10581f);
        }
    }

    /* renamed from: d */
    public <T> void mo11495d(Callable<T> callable, C3325d<T> dVar) {
        m14292c(new C3322b(this, callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo11496e(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            f.h.j.c$c r11 = new f.h.j.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m14292c(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            goto L_0x0062
        L_0x0061:
            throw r13
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p119j.C3320c.mo11496e(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
