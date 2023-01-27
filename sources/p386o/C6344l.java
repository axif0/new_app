package p386o;

import java.io.IOException;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6120e;
import p374m.C6123f;
import p374m.C6261v;
import p385n.C6277c;
import p385n.C6281e;
import p385n.C6284h;
import p385n.C6288l;
import p385n.C6300s;

/* renamed from: o.l */
final class C6344l<T> implements C6311b<T> {

    /* renamed from: f */
    private final C6370q f17869f;

    /* renamed from: g */
    private final Object[] f17870g;

    /* renamed from: h */
    private final C6120e.C6121a f17871h;

    /* renamed from: i */
    private final C6322f<C6117d0, T> f17872i;

    /* renamed from: j */
    private volatile boolean f17873j;

    /* renamed from: k */
    private C6120e f17874k;

    /* renamed from: l */
    private Throwable f17875l;

    /* renamed from: m */
    private boolean f17876m;

    /* renamed from: o.l$a */
    class C6345a implements C6123f {

        /* renamed from: a */
        final /* synthetic */ C6314d f17877a;

        C6345a(C6314d dVar) {
            this.f17877a = dVar;
        }

        /* renamed from: c */
        private void m26107c(Throwable th) {
            try {
                this.f17877a.mo416b(C6344l.this, th);
            } catch (Throwable th2) {
                C6379w.m26226s(th2);
                th2.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo17326a(C6120e eVar, C6113c0 c0Var) {
            try {
                try {
                    this.f17877a.mo415a(C6344l.this, C6344l.this.mo17966d(c0Var));
                } catch (Throwable th) {
                    C6379w.m26226s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C6379w.m26226s(th2);
                m26107c(th2);
            }
        }

        /* renamed from: b */
        public void mo17327b(C6120e eVar, IOException iOException) {
            m26107c(iOException);
        }
    }

    /* renamed from: o.l$b */
    static final class C6346b extends C6117d0 {

        /* renamed from: g */
        private final C6117d0 f17879g;

        /* renamed from: h */
        private final C6281e f17880h;

        /* renamed from: i */
        IOException f17881i;

        /* renamed from: o.l$b$a */
        class C6347a extends C6284h {
            C6347a(C6300s sVar) {
                super(sVar);
            }

            /* renamed from: O */
            public long mo17355O(C6277c cVar, long j) throws IOException {
                try {
                    return super.mo17355O(cVar, j);
                } catch (IOException e) {
                    C6346b.this.f17881i = e;
                    throw e;
                }
            }
        }

        C6346b(C6117d0 d0Var) {
            this.f17879g = d0Var;
            this.f17880h = C6288l.m25933d(new C6347a(d0Var.mo17255r()));
        }

        public void close() {
            this.f17879g.close();
        }

        /* renamed from: j */
        public long mo17253j() {
            return this.f17879g.mo17253j();
        }

        /* renamed from: m */
        public C6261v mo17254m() {
            return this.f17879g.mo17254m();
        }

        /* renamed from: r */
        public C6281e mo17255r() {
            return this.f17880h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo17967t() throws IOException {
            IOException iOException = this.f17881i;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: o.l$c */
    static final class C6348c extends C6117d0 {

        /* renamed from: g */
        private final C6261v f17883g;

        /* renamed from: h */
        private final long f17884h;

        C6348c(C6261v vVar, long j) {
            this.f17883g = vVar;
            this.f17884h = j;
        }

        /* renamed from: j */
        public long mo17253j() {
            return this.f17884h;
        }

        /* renamed from: m */
        public C6261v mo17254m() {
            return this.f17883g;
        }

        /* renamed from: r */
        public C6281e mo17255r() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C6344l(C6370q qVar, Object[] objArr, C6120e.C6121a aVar, C6322f<C6117d0, T> fVar) {
        this.f17869f = qVar;
        this.f17870g = objArr;
        this.f17871h = aVar;
        this.f17872i = fVar;
    }

    /* renamed from: c */
    private C6120e m26101c() throws IOException {
        C6120e b = this.f17871h.mo17318b(this.f17869f.mo17991a(this.f17870g));
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: X */
    public void mo17940X(C6314d<T> dVar) {
        C6120e eVar;
        Throwable th;
        C6379w.m26209b(dVar, "callback == null");
        synchronized (this) {
            if (!this.f17876m) {
                this.f17876m = true;
                eVar = this.f17874k;
                th = this.f17875l;
                if (eVar == null && th == null) {
                    try {
                        C6120e c = m26101c();
                        this.f17874k = c;
                        eVar = c;
                    } catch (Throwable th2) {
                        th = th2;
                        C6379w.m26226s(th);
                        this.f17875l = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo416b(this, th);
            return;
        }
        if (this.f17873j) {
            eVar.cancel();
        }
        eVar.mo17317w(new C6345a(dVar));
    }

    /* renamed from: b */
    public C6344l<T> mo17943o() {
        return new C6344l<>(this.f17869f, this.f17870g, this.f17871h, this.f17872i);
    }

    public void cancel() {
        C6120e eVar;
        this.f17873j = true;
        synchronized (this) {
            eVar = this.f17874k;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6372r<T> mo17966d(C6113c0 c0Var) throws IOException {
        C6117d0 a = c0Var.mo17266a();
        C6113c0.C6114a D = c0Var.mo17260D();
        D.mo17280b(new C6348c(a.mo17254m(), a.mo17253j()));
        C6113c0 c = D.mo17281c();
        int m = c.mo17270m();
        if (m < 200 || m >= 300) {
            try {
                return C6372r.m26183c(C6379w.m26208a(a), c);
            } finally {
                a.close();
            }
        } else if (m == 204 || m == 205) {
            a.close();
            return C6372r.m26184f(null, c);
        } else {
            C6346b bVar = new C6346b(a);
            try {
                return C6372r.m26184f(this.f17872i.mo17933a(bVar), c);
            } catch (RuntimeException e) {
                bVar.mo17967t();
                throw e;
            }
        }
    }

    /* renamed from: j */
    public boolean mo17942j() {
        boolean z = true;
        if (this.f17873j) {
            return true;
        }
        synchronized (this) {
            if (this.f17874k == null || !this.f17874k.mo17315j()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized C6099a0 request() {
        C6120e eVar = this.f17874k;
        if (eVar != null) {
            return eVar.request();
        } else if (this.f17875l == null) {
            try {
                C6120e c = m26101c();
                this.f17874k = c;
                return c.request();
            } catch (RuntimeException e) {
                e = e;
                C6379w.m26226s(e);
                this.f17875l = e;
                throw e;
            } catch (Error e2) {
                e = e2;
                C6379w.m26226s(e);
                this.f17875l = e;
                throw e;
            } catch (IOException e3) {
                this.f17875l = e3;
                throw new RuntimeException("Unable to create request.", e3);
            }
        } else if (this.f17875l instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.f17875l);
        } else if (this.f17875l instanceof RuntimeException) {
            throw ((RuntimeException) this.f17875l);
        } else {
            throw ((Error) this.f17875l);
        }
    }
}
