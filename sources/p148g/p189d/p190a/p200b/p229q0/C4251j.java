package p148g.p189d.p190a.p200b.p229q0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4283v;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.q0.j */
public final class C4251j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f13580a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4253b<? extends C4254c> f13581b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f13582c;

    /* renamed from: g.d.a.b.q0.j$a */
    public interface C4252a<T extends C4254c> {
        /* renamed from: d */
        int mo13099d(T t, long j, long j2, IOException iOException);

        /* renamed from: g */
        void mo13101g(T t, long j, long j2, boolean z);

        /* renamed from: n */
        void mo13103n(T t, long j, long j2);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: g.d.a.b.q0.j$b */
    private final class C4253b<T extends C4254c> extends Handler implements Runnable {

        /* renamed from: f */
        private final T f13583f;

        /* renamed from: g */
        private final C4252a<T> f13584g;

        /* renamed from: h */
        public final int f13585h;

        /* renamed from: i */
        private final long f13586i;

        /* renamed from: j */
        private IOException f13587j;

        /* renamed from: k */
        private int f13588k;

        /* renamed from: l */
        private volatile Thread f13589l;

        /* renamed from: m */
        private volatile boolean f13590m;

        public C4253b(Looper looper, T t, C4252a<T> aVar, int i, long j) {
            super(looper);
            this.f13583f = t;
            this.f13584g = aVar;
            this.f13585h = i;
            this.f13586i = j;
        }

        /* renamed from: b */
        private void m18038b() {
            this.f13587j = null;
            C4251j.this.f13580a.execute(C4251j.this.f13581b);
        }

        /* renamed from: c */
        private void m18039c() {
            C4253b unused = C4251j.this.f13581b = null;
        }

        /* renamed from: d */
        private long m18040d() {
            return (long) Math.min((this.f13588k - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void mo13389a(boolean z) {
            this.f13590m = z;
            this.f13587j = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f13583f.mo13108c();
                if (this.f13589l != null) {
                    this.f13589l.interrupt();
                }
            }
            if (z) {
                m18039c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f13584g.mo13101g(this.f13583f, elapsedRealtime, elapsedRealtime - this.f13586i, true);
            }
        }

        /* renamed from: e */
        public void mo13390e(int i) throws IOException {
            IOException iOException = this.f13587j;
            if (iOException != null && this.f13588k > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void mo13391f(long j) {
            C4260a.m18074f(C4251j.this.f13581b == null);
            C4253b unused = C4251j.this.f13581b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m18038b();
            }
        }

        public void handleMessage(Message message) {
            if (!this.f13590m) {
                int i = message.what;
                if (i == 0) {
                    m18038b();
                } else if (i != 4) {
                    m18039c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f13586i;
                    if (this.f13583f.mo13107b()) {
                        this.f13584g.mo13101g(this.f13583f, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message.what;
                    int i3 = 1;
                    if (i2 == 1) {
                        this.f13584g.mo13101g(this.f13583f, elapsedRealtime, j, false);
                    } else if (i2 == 2) {
                        try {
                            this.f13584g.mo13103n(this.f13583f, elapsedRealtime, j);
                        } catch (RuntimeException e) {
                            Log.e("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused = C4251j.this.f13582c = new C4257f(e);
                        }
                    } else if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f13587j = iOException;
                        int d = this.f13584g.mo13099d(this.f13583f, elapsedRealtime, j, iOException);
                        if (d == 3) {
                            IOException unused2 = C4251j.this.f13582c = this.f13587j;
                        } else if (d != 2) {
                            if (d != 1) {
                                i3 = 1 + this.f13588k;
                            }
                            this.f13588k = i3;
                            mo13391f(m18040d());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f13589l = Thread.currentThread();
                if (!this.f13583f.mo13107b()) {
                    C4283v.m18224a("load:" + this.f13583f.getClass().getSimpleName());
                    this.f13583f.mo13106a();
                    C4283v.m18226c();
                }
                if (!this.f13590m) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                e = e;
                if (this.f13590m) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (InterruptedException unused) {
                C4260a.m18074f(this.f13583f.mo13107b());
                if (!this.f13590m) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f13590m) {
                    e = new C4257f(e2);
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f13590m) {
                    e = new C4257f(e3);
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (Error e4) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f13590m) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C4283v.m18226c();
                throw th;
            }
        }
    }

    /* renamed from: g.d.a.b.q0.j$c */
    public interface C4254c {
        /* renamed from: a */
        void mo13106a() throws IOException, InterruptedException;

        /* renamed from: b */
        boolean mo13107b();

        /* renamed from: c */
        void mo13108c();
    }

    /* renamed from: g.d.a.b.q0.j$d */
    public interface C4255d {
        /* renamed from: e */
        void mo13100e();
    }

    /* renamed from: g.d.a.b.q0.j$e */
    private static final class C4256e implements Runnable {

        /* renamed from: f */
        private final C4255d f13592f;

        public C4256e(C4255d dVar) {
            this.f13592f = dVar;
        }

        public void run() {
            this.f13592f.mo13100e();
        }
    }

    /* renamed from: g.d.a.b.q0.j$f */
    public static final class C4257f extends IOException {
        public C4257f(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C4251j(String str) {
        this.f13580a = C4284w.m18259y(str);
    }

    /* renamed from: e */
    public void mo13384e() {
        this.f13581b.mo13389a(false);
    }

    /* renamed from: f */
    public boolean mo13385f() {
        return this.f13581b != null;
    }

    /* renamed from: g */
    public void mo13386g(int i) throws IOException {
        IOException iOException = this.f13582c;
        if (iOException == null) {
            C4253b<? extends C4254c> bVar = this.f13581b;
            if (bVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bVar.f13585h;
                }
                bVar.mo13390e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public void mo13387h(C4255d dVar) {
        C4253b<? extends C4254c> bVar = this.f13581b;
        if (bVar != null) {
            bVar.mo13389a(true);
        }
        if (dVar != null) {
            this.f13580a.execute(new C4256e(dVar));
        }
        this.f13580a.shutdown();
    }

    /* renamed from: i */
    public <T extends C4254c> long mo13388i(T t, C4252a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C4260a.m18074f(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C4253b(myLooper, t, aVar, i, elapsedRealtime).mo13391f(0);
        return elapsedRealtime;
    }
}
