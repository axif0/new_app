package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.x */
public final class C6084x extends C6040e0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k */
    private static final long f17041k;

    /* renamed from: l */
    public static final C6084x f17042l;

    static {
        Long l;
        C6084x xVar = new C6084x();
        f17042l = xVar;
        C6034d0.m24681p(xVar, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        C5956g.m24497b(l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f17041k = timeUnit.toNanos(l.longValue());
    }

    private C6084x() {
    }

    /* renamed from: J */
    private final synchronized void m24823J() {
        if (m24825L()) {
            debugStatus = 3;
            mo17113F();
            notifyAll();
        }
    }

    /* renamed from: K */
    private final synchronized Thread m24824K() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: L */
    private final boolean m24825L() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: M */
    private final synchronized boolean m24826M() {
        if (m24825L()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public void run() {
        boolean C;
        long j;
        C6088y0.f17049b.mo17181c(this);
        C6090z0 a = C5994a1.m24562a();
        if (a != null) {
            a.mo17184c();
        }
        if (!m24826M()) {
            _thread = null;
            m24823J();
            C6090z0 a2 = C5994a1.m24562a();
            if (a2 != null) {
                a2.mo17186e();
            }
            if (!mo17111C()) {
                mo17040u();
                return;
            }
            return;
        }
        long j2 = Long.MAX_VALUE;
        while (true) {
            try {
                Thread.interrupted();
                long D = mo17112D();
                if (D == Long.MAX_VALUE) {
                    if (j2 == Long.MAX_VALUE) {
                        C6090z0 a3 = C5994a1.m24562a();
                        long b = a3 != null ? a3.mo17183b() : System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f17041k + b;
                        }
                        j = j2 - b;
                        if (j <= 0) {
                            _thread = null;
                            m24823J();
                            C6090z0 a4 = C5994a1.m24562a();
                            if (a4 != null) {
                                a4.mo17186e();
                            }
                            if (!mo17111C()) {
                                mo17040u();
                                return;
                            }
                            return;
                        }
                    } else {
                        j = f17041k;
                    }
                    D = C5974f.m24545d(D, j);
                }
                if (D > 0) {
                    if (!m24825L()) {
                        C6090z0 a5 = C5994a1.m24562a();
                        if (a5 != null) {
                            a5.mo17182a(this, D);
                        } else {
                            LockSupport.parkNanos(this, D);
                        }
                    } else if (C) {
                        return;
                    } else {
                        return;
                    }
                }
            } finally {
                _thread = null;
                m24823J();
                C6090z0 a6 = C5994a1.m24562a();
                if (a6 != null) {
                    a6.mo17186e();
                }
                if (!mo17111C()) {
                    mo17040u();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Thread mo17040u() {
        Thread thread = _thread;
        return thread != null ? thread : m24824K();
    }
}
