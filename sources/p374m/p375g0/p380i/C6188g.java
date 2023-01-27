package p374m.p375g0.p380i;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p374m.p375g0.C6129b;
import p374m.p375g0.C6130c;
import p374m.p375g0.p380i.C6203h;
import p374m.p375g0.p382k.C6228f;
import p385n.C6277c;
import p385n.C6280d;
import p385n.C6281e;
import p385n.C6282f;

/* renamed from: m.g0.i.g */
public final class C6188g implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final ExecutorService f17429z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C6130c.m25034G("OkHttp Http2Connection", true));

    /* renamed from: f */
    final boolean f17430f;

    /* renamed from: g */
    final C6196h f17431g;

    /* renamed from: h */
    final Map<Integer, C6206i> f17432h = new LinkedHashMap();

    /* renamed from: i */
    final String f17433i;

    /* renamed from: j */
    int f17434j;

    /* renamed from: k */
    int f17435k;

    /* renamed from: l */
    boolean f17436l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ScheduledExecutorService f17437m;

    /* renamed from: n */
    private final ExecutorService f17438n;

    /* renamed from: o */
    final C6213l f17439o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f17440p;

    /* renamed from: q */
    long f17441q = 0;

    /* renamed from: r */
    long f17442r;

    /* renamed from: s */
    C6215m f17443s = new C6215m();

    /* renamed from: t */
    final C6215m f17444t = new C6215m();

    /* renamed from: u */
    boolean f17445u = false;

    /* renamed from: v */
    final Socket f17446v;

    /* renamed from: w */
    final C6210j f17447w;

    /* renamed from: x */
    final C6199j f17448x;

    /* renamed from: y */
    final Set<Integer> f17449y = new LinkedHashSet();

    /* renamed from: m.g0.i.g$a */
    class C6189a extends C6129b {

        /* renamed from: g */
        final /* synthetic */ int f17450g;

        /* renamed from: h */
        final /* synthetic */ C6179b f17451h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6189a(String str, Object[] objArr, int i, C6179b bVar) {
            super(str, objArr);
            this.f17450g = i;
            this.f17451h = bVar;
        }

        /* renamed from: k */
        public void mo17350k() {
            try {
                C6188g.this.mo17486j0(this.f17450g, this.f17451h);
            } catch (IOException unused) {
                C6188g.this.m25309q();
            }
        }
    }

    /* renamed from: m.g0.i.g$b */
    class C6190b extends C6129b {

        /* renamed from: g */
        final /* synthetic */ int f17453g;

        /* renamed from: h */
        final /* synthetic */ long f17454h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6190b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f17453g = i;
            this.f17454h = j;
        }

        /* renamed from: k */
        public void mo17350k() {
            try {
                C6188g.this.f17447w.mo17535J(this.f17453g, this.f17454h);
            } catch (IOException unused) {
                C6188g.this.m25309q();
            }
        }
    }

    /* renamed from: m.g0.i.g$c */
    class C6191c extends C6129b {

        /* renamed from: g */
        final /* synthetic */ int f17456g;

        /* renamed from: h */
        final /* synthetic */ List f17457h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6191c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f17456g = i;
            this.f17457h = list;
        }

        /* renamed from: k */
        public void mo17350k() {
            if (C6188g.this.f17439o.mo17552a(this.f17456g, this.f17457h)) {
                try {
                    C6188g.this.f17447w.mo17548x(this.f17456g, C6179b.CANCEL);
                    synchronized (C6188g.this) {
                        C6188g.this.f17449y.remove(Integer.valueOf(this.f17456g));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: m.g0.i.g$d */
    class C6192d extends C6129b {

        /* renamed from: g */
        final /* synthetic */ int f17459g;

        /* renamed from: h */
        final /* synthetic */ List f17460h;

        /* renamed from: i */
        final /* synthetic */ boolean f17461i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6192d(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f17459g = i;
            this.f17460h = list;
            this.f17461i = z;
        }

        /* renamed from: k */
        public void mo17350k() {
            boolean b = C6188g.this.f17439o.mo17553b(this.f17459g, this.f17460h, this.f17461i);
            if (b) {
                try {
                    C6188g.this.f17447w.mo17548x(this.f17459g, C6179b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f17461i) {
                synchronized (C6188g.this) {
                    C6188g.this.f17449y.remove(Integer.valueOf(this.f17459g));
                }
            }
        }
    }

    /* renamed from: m.g0.i.g$e */
    class C6193e extends C6129b {

        /* renamed from: g */
        final /* synthetic */ int f17463g;

        /* renamed from: h */
        final /* synthetic */ C6277c f17464h;

        /* renamed from: i */
        final /* synthetic */ int f17465i;

        /* renamed from: j */
        final /* synthetic */ boolean f17466j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6193e(String str, Object[] objArr, int i, C6277c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f17463g = i;
            this.f17464h = cVar;
            this.f17465i = i2;
            this.f17466j = z;
        }

        /* renamed from: k */
        public void mo17350k() {
            try {
                boolean d = C6188g.this.f17439o.mo17555d(this.f17463g, this.f17464h, this.f17465i, this.f17466j);
                if (d) {
                    C6188g.this.f17447w.mo17548x(this.f17463g, C6179b.CANCEL);
                }
                if (d || this.f17466j) {
                    synchronized (C6188g.this) {
                        C6188g.this.f17449y.remove(Integer.valueOf(this.f17463g));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: m.g0.i.g$f */
    class C6194f extends C6129b {

        /* renamed from: g */
        final /* synthetic */ int f17468g;

        /* renamed from: h */
        final /* synthetic */ C6179b f17469h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6194f(String str, Object[] objArr, int i, C6179b bVar) {
            super(str, objArr);
            this.f17468g = i;
            this.f17469h = bVar;
        }

        /* renamed from: k */
        public void mo17350k() {
            C6188g.this.f17439o.mo17554c(this.f17468g, this.f17469h);
            synchronized (C6188g.this) {
                C6188g.this.f17449y.remove(Integer.valueOf(this.f17468g));
            }
        }
    }

    /* renamed from: m.g0.i.g$g */
    public static class C6195g {

        /* renamed from: a */
        Socket f17471a;

        /* renamed from: b */
        String f17472b;

        /* renamed from: c */
        C6281e f17473c;

        /* renamed from: d */
        C6280d f17474d;

        /* renamed from: e */
        C6196h f17475e = C6196h.f17479a;

        /* renamed from: f */
        C6213l f17476f = C6213l.f17539a;

        /* renamed from: g */
        boolean f17477g;

        /* renamed from: h */
        int f17478h;

        public C6195g(boolean z) {
            this.f17477g = z;
        }

        /* renamed from: a */
        public C6188g mo17494a() {
            return new C6188g(this);
        }

        /* renamed from: b */
        public C6195g mo17495b(C6196h hVar) {
            this.f17475e = hVar;
            return this;
        }

        /* renamed from: c */
        public C6195g mo17496c(int i) {
            this.f17478h = i;
            return this;
        }

        /* renamed from: d */
        public C6195g mo17497d(Socket socket, String str, C6281e eVar, C6280d dVar) {
            this.f17471a = socket;
            this.f17472b = str;
            this.f17473c = eVar;
            this.f17474d = dVar;
            return this;
        }
    }

    /* renamed from: m.g0.i.g$h */
    public static abstract class C6196h {

        /* renamed from: a */
        public static final C6196h f17479a = new C6197a();

        /* renamed from: m.g0.i.g$h$a */
        class C6197a extends C6196h {
            C6197a() {
            }

            /* renamed from: b */
            public void mo17389b(C6206i iVar) throws IOException {
                iVar.mo17514f(C6179b.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo17388a(C6188g gVar) {
        }

        /* renamed from: b */
        public abstract void mo17389b(C6206i iVar) throws IOException;
    }

    /* renamed from: m.g0.i.g$i */
    final class C6198i extends C6129b {

        /* renamed from: g */
        final boolean f17480g;

        /* renamed from: h */
        final int f17481h;

        /* renamed from: i */
        final int f17482i;

        C6198i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C6188g.this.f17433i, Integer.valueOf(i), Integer.valueOf(i2));
            this.f17480g = z;
            this.f17481h = i;
            this.f17482i = i2;
        }

        /* renamed from: k */
        public void mo17350k() {
            C6188g.this.mo17485i0(this.f17480g, this.f17481h, this.f17482i);
        }
    }

    /* renamed from: m.g0.i.g$j */
    class C6199j extends C6129b implements C6203h.C6205b {

        /* renamed from: g */
        final C6203h f17484g;

        /* renamed from: m.g0.i.g$j$a */
        class C6200a extends C6129b {

            /* renamed from: g */
            final /* synthetic */ C6206i f17486g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6200a(String str, Object[] objArr, C6206i iVar) {
                super(str, objArr);
                this.f17486g = iVar;
            }

            /* renamed from: k */
            public void mo17350k() {
                try {
                    C6188g.this.f17431g.mo17389b(this.f17486g);
                } catch (IOException e) {
                    C6228f j = C6228f.m25514j();
                    j.mo17582q(4, "Http2Connection.Listener failure for " + C6188g.this.f17433i, e);
                    try {
                        this.f17486g.mo17514f(C6179b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: m.g0.i.g$j$b */
        class C6201b extends C6129b {
            C6201b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: k */
            public void mo17350k() {
                C6188g gVar = C6188g.this;
                gVar.f17431g.mo17388a(gVar);
            }
        }

        /* renamed from: m.g0.i.g$j$c */
        class C6202c extends C6129b {

            /* renamed from: g */
            final /* synthetic */ C6215m f17489g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6202c(String str, Object[] objArr, C6215m mVar) {
                super(str, objArr);
                this.f17489g = mVar;
            }

            /* renamed from: k */
            public void mo17350k() {
                try {
                    C6188g.this.f17447w.mo17536a(this.f17489g);
                } catch (IOException unused) {
                    C6188g.this.m25309q();
                }
            }
        }

        C6199j(C6203h hVar) {
            super("OkHttp %s", C6188g.this.f17433i);
            this.f17484g = hVar;
        }

        /* renamed from: l */
        private void m25345l(C6215m mVar) {
            try {
                C6188g.this.f17437m.execute(new C6202c("OkHttp %s ACK Settings", new Object[]{C6188g.this.f17433i}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo17498a() {
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17499b(boolean r11, p374m.p375g0.p380i.C6215m r12) {
            /*
                r10 = this;
                m.g0.i.g r0 = p374m.p375g0.p380i.C6188g.this
                monitor-enter(r0)
                m.g0.i.g r1 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                m.g0.i.m r1 = r1.f17444t     // Catch:{ all -> 0x008f }
                int r1 = r1.mo17559d()     // Catch:{ all -> 0x008f }
                if (r11 == 0) goto L_0x0014
                m.g0.i.g r11 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                m.g0.i.m r11 = r11.f17444t     // Catch:{ all -> 0x008f }
                r11.mo17556a()     // Catch:{ all -> 0x008f }
            L_0x0014:
                m.g0.i.g r11 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                m.g0.i.m r11 = r11.f17444t     // Catch:{ all -> 0x008f }
                r11.mo17563h(r12)     // Catch:{ all -> 0x008f }
                r10.m25345l(r12)     // Catch:{ all -> 0x008f }
                m.g0.i.g r11 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                m.g0.i.m r11 = r11.f17444t     // Catch:{ all -> 0x008f }
                int r11 = r11.mo17559d()     // Catch:{ all -> 0x008f }
                r12 = -1
                r2 = 0
                r4 = 1
                r5 = 0
                if (r11 == r12) goto L_0x005f
                if (r11 == r1) goto L_0x005f
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x008f }
                m.g0.i.g r1 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                boolean r1 = r1.f17445u     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x003b
                m.g0.i.g r1 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                r1.f17445u = r4     // Catch:{ all -> 0x008f }
            L_0x003b:
                m.g0.i.g r1 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, m.g0.i.i> r1 = r1.f17432h     // Catch:{ all -> 0x008f }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x0060
                m.g0.i.g r1 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, m.g0.i.i> r1 = r1.f17432h     // Catch:{ all -> 0x008f }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x008f }
                m.g0.i.g r5 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, m.g0.i.i> r5 = r5.f17432h     // Catch:{ all -> 0x008f }
                int r5 = r5.size()     // Catch:{ all -> 0x008f }
                m.g0.i.i[] r5 = new p374m.p375g0.p380i.C6206i[r5]     // Catch:{ all -> 0x008f }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x008f }
                r5 = r1
                m.g0.i.i[] r5 = (p374m.p375g0.p380i.C6206i[]) r5     // Catch:{ all -> 0x008f }
                goto L_0x0060
            L_0x005f:
                r11 = r2
            L_0x0060:
                java.util.concurrent.ExecutorService r1 = p374m.p375g0.p380i.C6188g.f17429z     // Catch:{ all -> 0x008f }
                m.g0.i.g$j$b r6 = new m.g0.i.g$j$b     // Catch:{ all -> 0x008f }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008f }
                m.g0.i.g r8 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x008f }
                java.lang.String r8 = r8.f17433i     // Catch:{ all -> 0x008f }
                r9 = 0
                r4[r9] = r8     // Catch:{ all -> 0x008f }
                r6.<init>(r7, r4)     // Catch:{ all -> 0x008f }
                r1.execute(r6)     // Catch:{ all -> 0x008f }
                monitor-exit(r0)     // Catch:{ all -> 0x008f }
                if (r5 == 0) goto L_0x008e
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x008e
                int r0 = r5.length
            L_0x007f:
                if (r9 >= r0) goto L_0x008e
                r1 = r5[r9]
                monitor-enter(r1)
                r1.mo17511c(r11)     // Catch:{ all -> 0x008b }
                monitor-exit(r1)     // Catch:{ all -> 0x008b }
                int r9 = r9 + 1
                goto L_0x007f
            L_0x008b:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008b }
                throw r11
            L_0x008e:
                return
            L_0x008f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008f }
                goto L_0x0093
            L_0x0092:
                throw r11
            L_0x0093:
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6188g.C6199j.mo17499b(boolean, m.g0.i.m):void");
        }

        /* renamed from: c */
        public void mo17500c(boolean z, int i, C6281e eVar, int i2) throws IOException {
            if (C6188g.this.mo17476V(i)) {
                C6188g.this.mo17472D(i, eVar, i2, z);
                return;
            }
            C6206i r = C6188g.this.mo17490r(i);
            if (r == null) {
                C6188g.this.mo17487k0(i, C6179b.PROTOCOL_ERROR);
                long j = (long) i2;
                C6188g.this.mo17483g0(j);
                eVar.mo17815c(j);
                return;
            }
            r.mo17522o(eVar, i2);
            if (z) {
                r.mo17523p();
            }
        }

        /* renamed from: d */
        public void mo17501d(boolean z, int i, int i2) {
            if (z) {
                synchronized (C6188g.this) {
                    boolean unused = C6188g.this.f17440p = false;
                    C6188g.this.notifyAll();
                }
                return;
            }
            try {
                C6188g.this.f17437m.execute(new C6198i(true, i, i2));
            } catch (RejectedExecutionException unused2) {
            }
        }

        /* renamed from: e */
        public void mo17502e(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: f */
        public void mo17503f(int i, C6179b bVar) {
            if (C6188g.this.mo17476V(i)) {
                C6188g.this.mo17475S(i, bVar);
                return;
            }
            C6206i X = C6188g.this.mo17477X(i);
            if (X != null) {
                X.mo17525r(bVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r0.mo17524q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            r0.mo17523p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17504g(boolean r10, int r11, int r12, java.util.List<p374m.p375g0.p380i.C6180c> r13) {
            /*
                r9 = this;
                m.g0.i.g r12 = p374m.p375g0.p380i.C6188g.this
                boolean r12 = r12.mo17476V(r11)
                if (r12 == 0) goto L_0x000e
                m.g0.i.g r12 = p374m.p375g0.p380i.C6188g.this
                r12.mo17473J(r11, r13, r10)
                return
            L_0x000e:
                m.g0.i.g r12 = p374m.p375g0.p380i.C6188g.this
                monitor-enter(r12)
                m.g0.i.g r0 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                m.g0.i.i r0 = r0.mo17490r(r11)     // Catch:{ all -> 0x007d }
                if (r0 != 0) goto L_0x0073
                m.g0.i.g r0 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                boolean r0 = r0.f17436l     // Catch:{ all -> 0x007d }
                if (r0 == 0) goto L_0x0021
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0021:
                m.g0.i.g r0 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                int r0 = r0.f17434j     // Catch:{ all -> 0x007d }
                if (r11 > r0) goto L_0x0029
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0029:
                int r0 = r11 % 2
                m.g0.i.g r1 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                int r1 = r1.f17435k     // Catch:{ all -> 0x007d }
                r2 = 2
                int r1 = r1 % r2
                if (r0 != r1) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0035:
                m.s r8 = p374m.p375g0.C6130c.m25035H(r13)     // Catch:{ all -> 0x007d }
                m.g0.i.i r13 = new m.g0.i.i     // Catch:{ all -> 0x007d }
                m.g0.i.g r5 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007d }
                m.g0.i.g r10 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                r10.f17434j = r11     // Catch:{ all -> 0x007d }
                m.g0.i.g r10 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                java.util.Map<java.lang.Integer, m.g0.i.i> r10 = r10.f17432h     // Catch:{ all -> 0x007d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r10.put(r0, r13)     // Catch:{ all -> 0x007d }
                java.util.concurrent.ExecutorService r10 = p374m.p375g0.p380i.C6188g.f17429z     // Catch:{ all -> 0x007d }
                m.g0.i.g$j$a r0 = new m.g0.i.g$j$a     // Catch:{ all -> 0x007d }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
                r3 = 0
                m.g0.i.g r4 = p374m.p375g0.p380i.C6188g.this     // Catch:{ all -> 0x007d }
                java.lang.String r4 = r4.f17433i     // Catch:{ all -> 0x007d }
                r2[r3] = r4     // Catch:{ all -> 0x007d }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r2[r3] = r11     // Catch:{ all -> 0x007d }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007d }
                r10.execute(r0)     // Catch:{ all -> 0x007d }
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0073:
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                r0.mo17524q(r13)
                if (r10 == 0) goto L_0x007c
                r0.mo17523p()
            L_0x007c:
                return
            L_0x007d:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6188g.C6199j.mo17504g(boolean, int, int, java.util.List):void");
        }

        /* renamed from: h */
        public void mo17505h(int i, long j) {
            C6188g gVar = C6188g.this;
            if (i == 0) {
                synchronized (gVar) {
                    C6188g.this.f17442r += j;
                    C6188g.this.notifyAll();
                }
                return;
            }
            C6206i r = gVar.mo17490r(i);
            if (r != null) {
                synchronized (r) {
                    r.mo17511c(j);
                }
            }
        }

        /* renamed from: i */
        public void mo17506i(int i, int i2, List<C6180c> list) {
            C6188g.this.mo17474Q(i2, list);
        }

        /* renamed from: j */
        public void mo17507j(int i, C6179b bVar, C6282f fVar) {
            C6206i[] iVarArr;
            fVar.mo17892x();
            synchronized (C6188g.this) {
                iVarArr = (C6206i[]) C6188g.this.f17432h.values().toArray(new C6206i[C6188g.this.f17432h.size()]);
                C6188g.this.f17436l = true;
            }
            for (C6206i iVar : iVarArr) {
                if (iVar.mo17516i() > i && iVar.mo17519l()) {
                    iVar.mo17525r(C6179b.REFUSED_STREAM);
                    C6188g.this.mo17477X(iVar.mo17516i());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = p374m.p375g0.p380i.C6179b.PROTOCOL_ERROR;
            r0 = p374m.p375g0.p380i.C6179b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r2 = r4.f17485h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17350k() {
            /*
                r4 = this;
                m.g0.i.b r0 = p374m.p375g0.p380i.C6179b.INTERNAL_ERROR
                m.g0.i.h r1 = r4.f17484g     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.mo17510j(r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                m.g0.i.h r1 = r4.f17484g     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.mo17509h(r2, r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                m.g0.i.b r1 = p374m.p375g0.p380i.C6179b.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                m.g0.i.b r0 = p374m.p375g0.p380i.C6179b.CANCEL     // Catch:{ IOException -> 0x001c }
                m.g0.i.g r2 = p374m.p375g0.p380i.C6188g.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                m.g0.i.b r1 = p374m.p375g0.p380i.C6179b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                m.g0.i.b r0 = p374m.p375g0.p380i.C6179b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                m.g0.i.g r2 = p374m.p375g0.p380i.C6188g.this     // Catch:{ IOException -> 0x0025 }
            L_0x0022:
                r2.mo17489o(r1, r0)     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                m.g0.i.h r0 = r4.f17484g
                p374m.p375g0.C6130c.m25044g(r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                m.g0.i.g r3 = p374m.p375g0.p380i.C6188g.this     // Catch:{ IOException -> 0x0031 }
                r3.mo17489o(r1, r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                m.g0.i.h r0 = r4.f17484g
                p374m.p375g0.C6130c.m25044g(r0)
                goto L_0x0038
            L_0x0037:
                throw r2
            L_0x0038:
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6188g.C6199j.mo17350k():void");
        }
    }

    static {
        Class<C6188g> cls = C6188g.class;
    }

    C6188g(C6195g gVar) {
        C6195g gVar2 = gVar;
        this.f17439o = gVar2.f17476f;
        boolean z = gVar2.f17477g;
        this.f17430f = z;
        this.f17431g = gVar2.f17475e;
        int i = z ? 1 : 2;
        this.f17435k = i;
        if (gVar2.f17477g) {
            this.f17435k = i + 2;
        }
        if (gVar2.f17477g) {
            this.f17443s.mo17564i(7, 16777216);
        }
        this.f17433i = gVar2.f17472b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C6130c.m25034G(C6130c.m25055r("OkHttp %s Writer", this.f17433i), false));
        this.f17437m = scheduledThreadPoolExecutor;
        if (gVar2.f17478h != 0) {
            C6198i iVar = new C6198i(false, 0, 0);
            int i2 = gVar2.f17478h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f17438n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C6130c.m25034G(C6130c.m25055r("OkHttp %s Push Observer", this.f17433i), true));
        this.f17444t.mo17564i(7, 65535);
        this.f17444t.mo17564i(5, 16384);
        this.f17442r = (long) this.f17444t.mo17559d();
        this.f17446v = gVar2.f17471a;
        this.f17447w = new C6210j(gVar2.f17474d, this.f17430f);
        this.f17448x = new C6199j(new C6203h(gVar2.f17473c, this.f17430f));
    }

    /* renamed from: H */
    private synchronized void m25304H(C6129b bVar) {
        if (!mo17491t()) {
            this.f17438n.execute(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m25309q() {
        try {
            mo17489o(C6179b.PROTOCOL_ERROR, C6179b.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p374m.p375g0.p380i.C6206i m25310w(int r11, java.util.List<p374m.p375g0.p380i.C6180c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            m.g0.i.j r7 = r10.f17447w
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.f17435k     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            m.g0.i.b r0 = p374m.p375g0.p380i.C6179b.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.mo17478a0(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.f17436l     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.f17435k     // Catch:{ all -> 0x0075 }
            int r0 = r10.f17435k     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.f17435k = r0     // Catch:{ all -> 0x0075 }
            m.g0.i.i r9 = new m.g0.i.i     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.f17442r     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f17503b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.mo17520m()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, m.g0.i.i> r0 = r10.f17432h     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            m.g0.i.j r0 = r10.f17447w     // Catch:{ all -> 0x0078 }
            r0.mo17534H(r6, r8, r11, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.f17430f     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            m.g0.i.j r0 = r10.f17447w     // Catch:{ all -> 0x0078 }
            r0.mo17547w(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            m.g0.i.j r11 = r10.f17447w
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            m.g0.i.a r11 = new m.g0.i.a     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6188g.m25310w(int, java.util.List, boolean):m.g0.i.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo17472D(int i, C6281e eVar, int i2, boolean z) throws IOException {
        C6277c cVar = new C6277c();
        long j = (long) i2;
        eVar.mo17809W(j);
        eVar.mo17355O(cVar, j);
        if (cVar.mo17834l0() == j) {
            m25304H(new C6193e("OkHttp %s Push Data[%s]", new Object[]{this.f17433i, Integer.valueOf(i)}, i, cVar, i2, z));
            return;
        }
        throw new IOException(cVar.mo17834l0() + " != " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo17473J(int i, List<C6180c> list, boolean z) {
        try {
            m25304H(new C6192d("OkHttp %s Push Headers[%s]", new Object[]{this.f17433i, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo17474Q(int i, List<C6180c> list) {
        synchronized (this) {
            if (this.f17449y.contains(Integer.valueOf(i))) {
                mo17487k0(i, C6179b.PROTOCOL_ERROR);
                return;
            }
            this.f17449y.add(Integer.valueOf(i));
            try {
                m25304H(new C6191c("OkHttp %s Push Request[%s]", new Object[]{this.f17433i, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo17475S(int i, C6179b bVar) {
        m25304H(new C6194f("OkHttp %s Push Reset[%s]", new Object[]{this.f17433i, Integer.valueOf(i)}, i, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo17476V(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public synchronized C6206i mo17477X(int i) {
        C6206i remove;
        remove = this.f17432h.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: a0 */
    public void mo17478a0(C6179b bVar) throws IOException {
        synchronized (this.f17447w) {
            synchronized (this) {
                if (!this.f17436l) {
                    this.f17436l = true;
                    int i = this.f17434j;
                    this.f17447w.mo17543q(i, bVar, C6130c.f17197a);
                }
            }
        }
    }

    public void close() throws IOException {
        mo17489o(C6179b.NO_ERROR, C6179b.CANCEL);
    }

    /* renamed from: e0 */
    public void mo17480e0() throws IOException {
        mo17481f0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo17481f0(boolean z) throws IOException {
        if (z) {
            this.f17447w.mo17539h();
            this.f17447w.mo17533D(this.f17443s);
            int d = this.f17443s.mo17559d();
            if (d != 65535) {
                this.f17447w.mo17535J(0, (long) (d - 65535));
            }
        }
        new Thread(this.f17448x).start();
    }

    public void flush() throws IOException {
        this.f17447w.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public synchronized void mo17483g0(long j) {
        long j2 = this.f17441q + j;
        this.f17441q = j2;
        if (j2 >= ((long) (this.f17443s.mo17559d() / 2))) {
            mo17488l0(0, this.f17441q);
            this.f17441q = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f17442r), r8.f17447w.mo17545t());
        r6 = (long) r3;
        r8.f17442r -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17484h0(int r9, boolean r10, p385n.C6277c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            m.g0.i.j r12 = r8.f17447w
            r12.mo17540j(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f17442r     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, m.g0.i.i> r3 = r8.f17432h     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.f17442r     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            m.g0.i.j r3 = r8.f17447w     // Catch:{ all -> 0x0058 }
            int r3 = r3.mo17545t()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.f17442r     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.f17442r = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            m.g0.i.j r4 = r8.f17447w
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.mo17540j(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6188g.mo17484h0(int, boolean, n.c, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo17485i0(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f17440p;
                this.f17440p = true;
            }
            if (z2) {
                m25309q();
                return;
            }
        }
        try {
            this.f17447w.mo17546u(z, i, i2);
        } catch (IOException unused) {
            m25309q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo17486j0(int i, C6179b bVar) throws IOException {
        this.f17447w.mo17548x(i, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo17487k0(int i, C6179b bVar) {
        try {
            this.f17437m.execute(new C6189a("OkHttp %s stream %d", new Object[]{this.f17433i, Integer.valueOf(i)}, i, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo17488l0(int i, long j) {
        try {
            this.f17437m.execute(new C6190b("OkHttp Window Update %s stream %d", new Object[]{this.f17433i, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo17489o(C6179b bVar, C6179b bVar2) throws IOException {
        C6206i[] iVarArr = null;
        try {
            mo17478a0(bVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f17432h.isEmpty()) {
                iVarArr = (C6206i[]) this.f17432h.values().toArray(new C6206i[this.f17432h.size()]);
                this.f17432h.clear();
            }
        }
        if (iVarArr != null) {
            for (C6206i f : iVarArr) {
                try {
                    f.mo17514f(bVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f17447w.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f17446v.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f17437m.shutdown();
        this.f17438n.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized C6206i mo17490r(int i) {
        return this.f17432h.get(Integer.valueOf(i));
    }

    /* renamed from: t */
    public synchronized boolean mo17491t() {
        return this.f17436l;
    }

    /* renamed from: u */
    public synchronized int mo17492u() {
        return this.f17444t.mo17560e(Integer.MAX_VALUE);
    }

    /* renamed from: x */
    public C6206i mo17493x(List<C6180c> list, boolean z) throws IOException {
        return m25310w(0, list, z);
    }
}
