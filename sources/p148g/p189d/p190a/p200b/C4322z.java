package p148g.p189d.p190a.p200b;

import android.os.Handler;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.z */
public final class C4322z {

    /* renamed from: a */
    private final C4324b f13804a;

    /* renamed from: b */
    private final C4323a f13805b;

    /* renamed from: c */
    private final C3844g0 f13806c;

    /* renamed from: d */
    private int f13807d;

    /* renamed from: e */
    private Object f13808e;

    /* renamed from: f */
    private Handler f13809f;

    /* renamed from: g */
    private int f13810g;

    /* renamed from: h */
    private long f13811h = -9223372036854775807L;

    /* renamed from: i */
    private boolean f13812i = true;

    /* renamed from: j */
    private boolean f13813j;

    /* renamed from: k */
    private boolean f13814k;

    /* renamed from: l */
    private boolean f13815l;

    /* renamed from: g.d.a.b.z$a */
    public interface C4323a {
        /* renamed from: a */
        void mo12902a(C4322z zVar);
    }

    /* renamed from: g.d.a.b.z$b */
    public interface C4324b {
        /* renamed from: m */
        void mo12419m(int i, Object obj) throws C3848h;
    }

    public C4322z(C4323a aVar, C4324b bVar, C3844g0 g0Var, int i, Handler handler) {
        this.f13805b = aVar;
        this.f13804a = bVar;
        this.f13806c = g0Var;
        this.f13809f = handler;
        this.f13810g = i;
    }

    /* renamed from: a */
    public synchronized boolean mo13596a() throws InterruptedException {
        C4260a.m18074f(this.f13813j);
        C4260a.m18074f(this.f13809f.getLooper().getThread() != Thread.currentThread());
        while (!this.f13815l) {
            wait();
        }
        return this.f13814k;
    }

    /* renamed from: b */
    public boolean mo13597b() {
        return this.f13812i;
    }

    /* renamed from: c */
    public Handler mo13598c() {
        return this.f13809f;
    }

    /* renamed from: d */
    public Object mo13599d() {
        return this.f13808e;
    }

    /* renamed from: e */
    public long mo13600e() {
        return this.f13811h;
    }

    /* renamed from: f */
    public C4324b mo13601f() {
        return this.f13804a;
    }

    /* renamed from: g */
    public C3844g0 mo13602g() {
        return this.f13806c;
    }

    /* renamed from: h */
    public int mo13603h() {
        return this.f13807d;
    }

    /* renamed from: i */
    public int mo13604i() {
        return this.f13810g;
    }

    /* renamed from: j */
    public synchronized void mo13605j(boolean z) {
        this.f13814k = z | this.f13814k;
        this.f13815l = true;
        notifyAll();
    }

    /* renamed from: k */
    public C4322z mo13606k() {
        C4260a.m18074f(!this.f13813j);
        if (this.f13811h == -9223372036854775807L) {
            C4260a.m18069a(this.f13812i);
        }
        this.f13813j = true;
        this.f13805b.mo12902a(this);
        return this;
    }

    /* renamed from: l */
    public C4322z mo13607l(Object obj) {
        C4260a.m18074f(!this.f13813j);
        this.f13808e = obj;
        return this;
    }

    /* renamed from: m */
    public C4322z mo13608m(int i) {
        C4260a.m18074f(!this.f13813j);
        this.f13807d = i;
        return this;
    }
}
