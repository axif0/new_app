package p374m;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p374m.C6269z;
import p374m.p375g0.C6130c;

/* renamed from: m.n */
public final class C6245n {

    /* renamed from: a */
    private int f17629a = 64;

    /* renamed from: b */
    private int f17630b = 5;

    /* renamed from: c */
    private Runnable f17631c;

    /* renamed from: d */
    private ExecutorService f17632d;

    /* renamed from: e */
    private final Deque<C6269z.C6271b> f17633e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C6269z.C6271b> f17634f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C6269z> f17635g = new ArrayDeque();

    /* renamed from: d */
    private <T> void m25581d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f17631c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m25582g() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    private boolean m25582g() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C6269z.C6271b> it = this.f17633e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6269z.C6271b next = it.next();
                if (this.f17634f.size() >= this.f17629a) {
                    break;
                } else if (m25583i(next) < this.f17630b) {
                    it.remove();
                    arrayList.add(next);
                    this.f17634f.add(next);
                }
            }
            z = mo17649h() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C6269z.C6271b) arrayList.get(i)).mo17782l(mo17646c());
        }
        return z;
    }

    /* renamed from: i */
    private int m25583i(C6269z.C6271b bVar) {
        int i = 0;
        for (C6269z.C6271b next : this.f17634f) {
            if (!next.mo17783m().f17759k && next.mo17784n().equals(bVar.mo17784n())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17644a(C6269z.C6271b bVar) {
        synchronized (this) {
            this.f17633e.add(bVar);
        }
        m25582g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo17645b(C6269z zVar) {
        this.f17635g.add(zVar);
    }

    /* renamed from: c */
    public synchronized ExecutorService mo17646c() {
        if (this.f17632d == null) {
            this.f17632d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C6130c.m25034G("OkHttp Dispatcher", false));
        }
        return this.f17632d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17647e(C6269z.C6271b bVar) {
        m25581d(this.f17634f, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17648f(C6269z zVar) {
        m25581d(this.f17635g, zVar);
    }

    /* renamed from: h */
    public synchronized int mo17649h() {
        return this.f17634f.size() + this.f17635g.size();
    }
}
