package p374m;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p374m.p375g0.C6129b;
import p374m.p375g0.p376e.C6134a;
import p374m.p375g0.p377f.C6148a;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6155g;
import p374m.p375g0.p378g.C6157a;
import p374m.p375g0.p378g.C6158b;
import p374m.p375g0.p378g.C6160c;
import p374m.p375g0.p378g.C6165g;
import p374m.p375g0.p378g.C6168j;
import p374m.p375g0.p382k.C6228f;
import p385n.C6272a;

/* renamed from: m.z */
final class C6269z implements C6120e {

    /* renamed from: f */
    final C6265x f17754f;

    /* renamed from: g */
    final C6168j f17755g;

    /* renamed from: h */
    final C6272a f17756h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6248p f17757i;

    /* renamed from: j */
    final C6099a0 f17758j;

    /* renamed from: k */
    final boolean f17759k;

    /* renamed from: l */
    private boolean f17760l;

    /* renamed from: m.z$a */
    class C6270a extends C6272a {
        C6270a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo17531t() {
            C6269z.this.cancel();
        }
    }

    /* renamed from: m.z$b */
    final class C6271b extends C6129b {

        /* renamed from: g */
        private final C6123f f17762g;

        static {
            Class<C6269z> cls = C6269z.class;
        }

        C6271b(C6123f fVar) {
            super("OkHttp %s", C6269z.this.mo17779g());
            this.f17762g = fVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x003d }] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17350k() {
            /*
                r5 = this;
                m.z r0 = p374m.C6269z.this
                n.a r0 = r0.f17756h
                r0.mo17785k()
                r0 = 1
                r1 = 0
                m.z r2 = p374m.C6269z.this     // Catch:{ IOException -> 0x003f }
                m.c0 r2 = r2.mo17778e()     // Catch:{ IOException -> 0x003f }
                m.z r3 = p374m.C6269z.this     // Catch:{ IOException -> 0x003f }
                m.g0.g.j r3 = r3.f17755g     // Catch:{ IOException -> 0x003f }
                boolean r1 = r3.mo17447e()     // Catch:{ IOException -> 0x003f }
                if (r1 == 0) goto L_0x0028
                m.f r1 = r5.f17762g     // Catch:{ IOException -> 0x003b }
                m.z r2 = p374m.C6269z.this     // Catch:{ IOException -> 0x003b }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x003b }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x003b }
                r1.mo17327b(r2, r3)     // Catch:{ IOException -> 0x003b }
                goto L_0x002f
            L_0x0028:
                m.f r1 = r5.f17762g     // Catch:{ IOException -> 0x003b }
                m.z r3 = p374m.C6269z.this     // Catch:{ IOException -> 0x003b }
                r1.mo17326a(r3, r2)     // Catch:{ IOException -> 0x003b }
            L_0x002f:
                m.z r0 = p374m.C6269z.this
                m.x r0 = r0.f17754f
                m.n r0 = r0.mo17757n()
                r0.mo17647e(r5)
                goto L_0x007d
            L_0x003b:
                r1 = move-exception
                goto L_0x0042
            L_0x003d:
                r0 = move-exception
                goto L_0x007e
            L_0x003f:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0042:
                m.z r2 = p374m.C6269z.this     // Catch:{ all -> 0x003d }
                java.io.IOException r1 = r2.mo17780i(r1)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x006a
                m.g0.k.f r0 = p374m.p375g0.p382k.C6228f.m25514j()     // Catch:{ all -> 0x003d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
                r3.<init>()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x003d }
                m.z r4 = p374m.C6269z.this     // Catch:{ all -> 0x003d }
                java.lang.String r4 = r4.mo17781k()     // Catch:{ all -> 0x003d }
                r3.append(r4)     // Catch:{ all -> 0x003d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
                r0.mo17582q(r2, r3, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x006a:
                m.z r0 = p374m.C6269z.this     // Catch:{ all -> 0x003d }
                m.p r0 = r0.f17757i     // Catch:{ all -> 0x003d }
                m.z r2 = p374m.C6269z.this     // Catch:{ all -> 0x003d }
                r0.mo17652b(r2, r1)     // Catch:{ all -> 0x003d }
                m.f r0 = r5.f17762g     // Catch:{ all -> 0x003d }
                m.z r2 = p374m.C6269z.this     // Catch:{ all -> 0x003d }
                r0.mo17327b(r2, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x007d:
                return
            L_0x007e:
                m.z r1 = p374m.C6269z.this
                m.x r1 = r1.f17754f
                m.n r1 = r1.mo17757n()
                r1.mo17647e(r5)
                goto L_0x008b
            L_0x008a:
                throw r0
            L_0x008b:
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.C6269z.C6271b.mo17350k():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo17782l(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C6269z.this.f17757i.mo17652b(C6269z.this, interruptedIOException);
                this.f17762g.mo17327b(C6269z.this, interruptedIOException);
                C6269z.this.f17754f.mo17757n().mo17647e(this);
            } catch (Throwable th) {
                C6269z.this.f17754f.mo17757n().mo17647e(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C6269z mo17783m() {
            return C6269z.this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public String mo17784n() {
            return C6269z.this.f17758j.mo17221j().mo17709m();
        }
    }

    private C6269z(C6265x xVar, C6099a0 a0Var, boolean z) {
        this.f17754f = xVar;
        this.f17758j = a0Var;
        this.f17759k = z;
        this.f17755g = new C6168j(xVar, z);
        C6270a aVar = new C6270a();
        this.f17756h = aVar;
        aVar.mo17904g((long) xVar.mo17751e(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    private void m25767c() {
        this.f17755g.mo17448j(C6228f.m25514j().mo17580n("response.body().close()"));
    }

    /* renamed from: f */
    static C6269z m25768f(C6265x xVar, C6099a0 a0Var, boolean z) {
        C6269z zVar = new C6269z(xVar, a0Var, z);
        zVar.f17757i = xVar.mo17759q().mo17671a(zVar);
        return zVar;
    }

    public void cancel() {
        this.f17755g.mo17446b();
    }

    /* renamed from: d */
    public C6269z clone() {
        return m25768f(this.f17754f, this.f17758j, this.f17759k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6113c0 mo17778e() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f17754f.mo17763u());
        arrayList.add(this.f17755g);
        arrayList.add(new C6157a(this.f17754f.mo17756l()));
        arrayList.add(new C6134a(this.f17754f.mo17764v()));
        arrayList.add(new C6148a(this.f17754f));
        if (!this.f17759k) {
            arrayList.addAll(this.f17754f.mo17765x());
        }
        arrayList.add(new C6158b(this.f17759k));
        return new C6165g(arrayList, (C6155g) null, (C6160c) null, (C6150c) null, 0, this.f17758j, this, this.f17757i, this.f17754f.mo17753g(), this.f17754f.mo17744F(), this.f17754f.mo17748K()).mo17438d(this.f17758j);
    }

    public C6113c0 execute() throws IOException {
        synchronized (this) {
            if (!this.f17760l) {
                this.f17760l = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m25767c();
        this.f17756h.mo17785k();
        this.f17757i.mo17653c(this);
        try {
            this.f17754f.mo17757n().mo17645b(this);
            C6113c0 e = mo17778e();
            if (e != null) {
                this.f17754f.mo17757n().mo17648f(this);
                return e;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            IOException i = mo17780i(e2);
            this.f17757i.mo17652b(this, i);
            throw i;
        } catch (Throwable th) {
            this.f17754f.mo17757n().mo17648f(this);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo17779g() {
        return this.f17758j.mo17221j().mo17697B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public IOException mo17780i(IOException iOException) {
        if (!this.f17756h.mo17788n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: j */
    public boolean mo17315j() {
        return this.f17755g.mo17447e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo17781k() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo17315j() ? "canceled " : BuildConfig.FLAVOR);
        sb.append(this.f17759k ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo17779g());
        return sb.toString();
    }

    public C6099a0 request() {
        return this.f17758j;
    }

    /* renamed from: w */
    public void mo17317w(C6123f fVar) {
        synchronized (this) {
            if (!this.f17760l) {
                this.f17760l = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m25767c();
        this.f17757i.mo17653c(this);
        this.f17754f.mo17757n().mo17644a(new C6271b(fVar));
    }
}
