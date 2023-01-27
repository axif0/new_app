package p148g.p189d.p190a.p200b.p217n0;

import android.net.Uri;
import android.os.Handler;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.C3837e0;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4150o;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p204k0.C3912b;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p217n0.C4124e;
import p148g.p189d.p190a.p200b.p217n0.C4129g;
import p148g.p189d.p190a.p200b.p217n0.C4138i;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p229q0.C4237b;
import p148g.p189d.p190a.p200b.p229q0.C4238c;
import p148g.p189d.p190a.p200b.p229q0.C4241e;
import p148g.p189d.p190a.p200b.p229q0.C4251j;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4264e;
import p148g.p189d.p190a.p200b.p230r0.C4269j;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.n0.c */
final class C4114c implements C4124e, C3917g, C4251j.C4252a<C4117c>, C4251j.C4255d, C4138i.C4140b {

    /* renamed from: A */
    private boolean f12974A;

    /* renamed from: B */
    private boolean f12975B;

    /* renamed from: C */
    private int f12976C;

    /* renamed from: D */
    private C4146n f12977D;

    /* renamed from: E */
    private long f12978E;

    /* renamed from: F */
    private boolean[] f12979F;

    /* renamed from: G */
    private boolean[] f12980G;

    /* renamed from: H */
    private boolean[] f12981H;

    /* renamed from: I */
    private boolean f12982I;

    /* renamed from: J */
    private long f12983J;

    /* renamed from: K */
    private long f12984K;

    /* renamed from: L */
    private long f12985L;

    /* renamed from: M */
    private boolean f12986M;

    /* renamed from: N */
    private int f12987N;

    /* renamed from: O */
    private boolean f12988O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f12989P;

    /* renamed from: f */
    private final Uri f12990f;

    /* renamed from: g */
    private final C4238c f12991g;

    /* renamed from: h */
    private final int f12992h;

    /* renamed from: i */
    private final C4129g.C4130a f12993i;

    /* renamed from: j */
    private final C4119e f12994j;

    /* renamed from: k */
    private final C4237b f12995k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final String f12996l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f12997m;

    /* renamed from: n */
    private final C4251j f12998n = new C4251j("Loader:ExtractorMediaPeriod");

    /* renamed from: o */
    private final C4118d f12999o;

    /* renamed from: p */
    private final C4264e f13000p;

    /* renamed from: q */
    private final Runnable f13001q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f13002r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f13003s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C4124e.C4125a f13004t;

    /* renamed from: u */
    private C3923l f13005u;

    /* renamed from: v */
    private C4138i[] f13006v;

    /* renamed from: w */
    private int[] f13007w;

    /* renamed from: x */
    private boolean f13008x;

    /* renamed from: y */
    private boolean f13009y;

    /* renamed from: z */
    private int f13010z;

    /* renamed from: g.d.a.b.n0.c$a */
    class C4115a implements Runnable {
        C4115a() {
        }

        public void run() {
            C4114c.this.m17394I();
        }
    }

    /* renamed from: g.d.a.b.n0.c$b */
    class C4116b implements Runnable {
        C4116b() {
        }

        public void run() {
            if (!C4114c.this.f12989P) {
                C4114c.this.f13004t.mo12906e(C4114c.this);
            }
        }
    }

    /* renamed from: g.d.a.b.n0.c$c */
    final class C4117c implements C4251j.C4254c {

        /* renamed from: a */
        private final Uri f13013a;

        /* renamed from: b */
        private final C4238c f13014b;

        /* renamed from: c */
        private final C4118d f13015c;

        /* renamed from: d */
        private final C4264e f13016d;

        /* renamed from: e */
        private final C3922k f13017e = new C3922k();

        /* renamed from: f */
        private volatile boolean f13018f;

        /* renamed from: g */
        private boolean f13019g = true;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f13020h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C4241e f13021i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f13022j = -1;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public long f13023k;

        public C4117c(Uri uri, C4238c cVar, C4118d dVar, C4264e eVar) {
            C4260a.m18073e(uri);
            this.f13013a = uri;
            C4260a.m18073e(cVar);
            this.f13014b = cVar;
            C4260a.m18073e(dVar);
            this.f13015c = dVar;
            this.f13016d = eVar;
        }

        /* renamed from: a */
        public void mo13106a() throws IOException, InterruptedException {
            int i = 0;
            while (i == 0 && !this.f13018f) {
                C3912b bVar = null;
                try {
                    long j = this.f13017e.f11909a;
                    C4241e eVar = new C4241e(this.f13013a, j, -1, C4114c.this.f12996l);
                    this.f13021i = eVar;
                    long b = this.f13014b.mo13370b(eVar);
                    this.f13022j = b;
                    if (b != -1) {
                        this.f13022j = b + j;
                    }
                    C3912b bVar2 = new C3912b(this.f13014b, j, this.f13022j);
                    try {
                        C3915e b2 = this.f13015c.mo13111b(bVar2, this.f13014b.mo13371c());
                        if (this.f13019g) {
                            b2.mo12740c(j, this.f13020h);
                            this.f13019g = false;
                        }
                        while (i == 0 && !this.f13018f) {
                            this.f13016d.mo13414a();
                            i = b2.mo12742h(bVar2, this.f13017e);
                            if (bVar2.mo12729k() > C4114c.this.f12997m + j) {
                                j = bVar2.mo12729k();
                                this.f13016d.mo13415b();
                                C4114c.this.f13003s.post(C4114c.this.f13002r);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f13017e.f11909a = bVar2.mo12729k();
                            this.f13023k = this.f13017e.f11909a - this.f13021i.f13541c;
                        }
                        C4284w.m18240f(this.f13014b);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (!(i == 1 || bVar == null)) {
                            this.f13017e.f11909a = bVar.mo12729k();
                            this.f13023k = this.f13017e.f11909a - this.f13021i.f13541c;
                        }
                        C4284w.m18240f(this.f13014b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f13017e.f11909a = bVar.mo12729k();
                    this.f13023k = this.f13017e.f11909a - this.f13021i.f13541c;
                    C4284w.m18240f(this.f13014b);
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public boolean mo13107b() {
            return this.f13018f;
        }

        /* renamed from: c */
        public void mo13108c() {
            this.f13018f = true;
        }

        /* renamed from: h */
        public void mo13109h(long j, long j2) {
            this.f13017e.f11909a = j;
            this.f13020h = j2;
            this.f13019g = true;
        }
    }

    /* renamed from: g.d.a.b.n0.c$d */
    private static final class C4118d {

        /* renamed from: a */
        private final C3915e[] f13025a;

        /* renamed from: b */
        private final C3917g f13026b;

        /* renamed from: c */
        private C3915e f13027c;

        public C4118d(C3915e[] eVarArr, C3917g gVar) {
            this.f13025a = eVarArr;
            this.f13026b = gVar;
        }

        /* renamed from: a */
        public void mo13110a() {
            C3915e eVar = this.f13027c;
            if (eVar != null) {
                eVar.mo12738a();
                this.f13027c = null;
            }
        }

        /* renamed from: b */
        public C3915e mo13111b(C3916f fVar, Uri uri) throws IOException, InterruptedException {
            C3915e eVar = this.f13027c;
            if (eVar != null) {
                return eVar;
            }
            C3915e[] eVarArr = this.f13025a;
            int length = eVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C3915e eVar2 = eVarArr[i];
                try {
                    if (eVar2.mo12741d(fVar)) {
                        this.f13027c = eVar2;
                        fVar.mo12723e();
                        break;
                    }
                    fVar.mo12723e();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    fVar.mo12723e();
                    throw th;
                }
            }
            C3915e eVar3 = this.f13027c;
            if (eVar3 != null) {
                eVar3.mo12739b(this.f13026b);
                return this.f13027c;
            }
            throw new C4147o("None of the available extractors (" + C4284w.m18247m(this.f13025a) + ") could read the stream.", uri);
        }
    }

    /* renamed from: g.d.a.b.n0.c$e */
    interface C4119e {
        /* renamed from: e */
        void mo13112e(long j, boolean z);
    }

    /* renamed from: g.d.a.b.n0.c$f */
    private final class C4120f implements C4141j {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f13028a;

        public C4120f(int i) {
            this.f13028a = i;
        }

        /* renamed from: a */
        public int mo13086a(C4150o oVar, C3895e eVar, boolean z) {
            return C4114c.this.mo13096P(this.f13028a, oVar, eVar, z);
        }

        /* renamed from: b */
        public void mo13087b() throws IOException {
            C4114c.this.mo13092L();
        }

        /* renamed from: c */
        public int mo13088c(long j) {
            return C4114c.this.mo13098S(this.f13028a, j);
        }

        /* renamed from: g */
        public boolean mo13090g() {
            return C4114c.this.mo13091H(this.f13028a);
        }
    }

    public C4114c(Uri uri, C4238c cVar, C3915e[] eVarArr, int i, C4129g.C4130a aVar, C4119e eVar, C4237b bVar, String str, int i2) {
        this.f12990f = uri;
        this.f12991g = cVar;
        this.f12992h = i;
        this.f12993i = aVar;
        this.f12994j = eVar;
        this.f12995k = bVar;
        this.f12996l = str;
        this.f12997m = (long) i2;
        this.f12999o = new C4118d(eVarArr, this);
        this.f13000p = new C4264e();
        this.f13001q = new C4115a();
        this.f13002r = new C4116b();
        this.f13003s = new Handler();
        this.f13007w = new int[0];
        this.f13006v = new C4138i[0];
        this.f12985L = -9223372036854775807L;
        this.f12983J = -1;
        this.f12978E = -9223372036854775807L;
        this.f13010z = i == -1 ? 3 : i;
    }

    /* renamed from: B */
    private boolean m17388B(C4117c cVar, int i) {
        C3923l lVar;
        if (this.f12983J == -1 && ((lVar = this.f13005u) == null || lVar.mo12718i() == -9223372036854775807L)) {
            if (!this.f13009y || m17399U()) {
                this.f12975B = this.f13009y;
                this.f12984K = 0;
                this.f12987N = 0;
                for (C4138i x : this.f13006v) {
                    x.mo13167x();
                }
                cVar.mo13109h(0, 0);
                return true;
            }
            this.f12986M = true;
            return false;
        }
        this.f12987N = i;
        return true;
    }

    /* renamed from: C */
    private void m17389C(C4117c cVar) {
        if (this.f12983J == -1) {
            this.f12983J = cVar.f13022j;
        }
    }

    /* renamed from: D */
    private int m17390D() {
        int i = 0;
        for (C4138i p : this.f13006v) {
            i += p.mo13164p();
        }
        return i;
    }

    /* renamed from: E */
    private long m17391E() {
        long j = Long.MIN_VALUE;
        for (C4138i m : this.f13006v) {
            j = Math.max(j, m.mo13161m());
        }
        return j;
    }

    /* renamed from: F */
    private static boolean m17392F(IOException iOException) {
        return iOException instanceof C4147o;
    }

    /* renamed from: G */
    private boolean m17393G() {
        return this.f12985L != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v1 ?, r4v3 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: I */
    public void m17394I() {
        /*
            r8 = this;
            boolean r0 = r8.f12989P
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r8.f13009y
            if (r0 != 0) goto L_0x00b0
            g.d.a.b.k0.l r0 = r8.f13005u
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r8.f13008x
            if (r0 != 0) goto L_0x0012
            goto L_0x00b0
        L_0x0012:
            g.d.a.b.n0.i[] r0 = r8.f13006v
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0017:
            if (r3 >= r1) goto L_0x0025
            r4 = r0[r3]
            g.d.a.b.n r4 = r4.mo13163o()
            if (r4 != 0) goto L_0x0022
            return
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0025:
            g.d.a.b.r0.e r0 = r8.f13000p
            r0.mo13415b()
            g.d.a.b.n0.i[] r0 = r8.f13006v
            int r0 = r0.length
            g.d.a.b.n0.m[] r1 = new p148g.p189d.p190a.p200b.p217n0.C4145m[r0]
            boolean[] r3 = new boolean[r0]
            r8.f12980G = r3
            boolean[] r3 = new boolean[r0]
            r8.f12979F = r3
            boolean[] r3 = new boolean[r0]
            r8.f12981H = r3
            g.d.a.b.k0.l r3 = r8.f13005u
            long r3 = r3.mo12718i()
            r8.f12978E = r3
            r3 = 0
        L_0x0044:
            r4 = 1
            if (r3 >= r0) goto L_0x0076
            g.d.a.b.n0.i[] r5 = r8.f13006v
            r5 = r5[r3]
            g.d.a.b.n r5 = r5.mo13163o()
            g.d.a.b.n0.m r6 = new g.d.a.b.n0.m
            g.d.a.b.n[] r7 = new p148g.p189d.p190a.p200b.C4109n[r4]
            r7[r2] = r5
            r6.<init>(r7)
            r1[r3] = r6
            java.lang.String r5 = r5.f12949k
            boolean r6 = p148g.p189d.p190a.p200b.p230r0.C4269j.m18117h(r5)
            if (r6 != 0) goto L_0x006a
            boolean r5 = p148g.p189d.p190a.p200b.p230r0.C4269j.m18115f(r5)
            if (r5 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            boolean[] r5 = r8.f12980G
            r5[r3] = r4
            boolean r5 = r8.f12982I
            r4 = r4 | r5
            r8.f12982I = r4
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0076:
            g.d.a.b.n0.n r0 = new g.d.a.b.n0.n
            r0.<init>(r1)
            r8.f12977D = r0
            int r0 = r8.f12992h
            r1 = -1
            if (r0 != r1) goto L_0x009c
            long r0 = r8.f12983J
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x009c
            g.d.a.b.k0.l r0 = r8.f13005u
            long r0 = r0.mo12718i()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x009c
            r0 = 6
            r8.f13010z = r0
        L_0x009c:
            r8.f13009y = r4
            g.d.a.b.n0.c$e r0 = r8.f12994j
            long r1 = r8.f12978E
            g.d.a.b.k0.l r3 = r8.f13005u
            boolean r3 = r3.mo12716e()
            r0.mo13112e(r1, r3)
            g.d.a.b.n0.e$a r0 = r8.f13004t
            r0.mo12905d(r8)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4114c.m17394I():void");
    }

    /* renamed from: J */
    private void m17395J(int i) {
        if (!this.f12981H[i]) {
            C4109n a = this.f12977D.mo13177a(i).mo13173a(0);
            this.f12993i.mo13129d(C4269j.m18114e(a.f12949k), a, 0, (Object) null, this.f12984K);
            this.f12981H[i] = true;
        }
    }

    /* renamed from: K */
    private void m17396K(int i) {
        if (this.f12986M && this.f12980G[i] && !this.f13006v[i].mo13165q()) {
            this.f12985L = 0;
            this.f12986M = false;
            this.f12975B = true;
            this.f12984K = 0;
            this.f12987N = 0;
            for (C4138i x : this.f13006v) {
                x.mo13167x();
            }
            this.f13004t.mo12906e(this);
        }
    }

    /* renamed from: R */
    private boolean m17397R(long j) {
        int length = this.f13006v.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            C4138i iVar = this.f13006v[i];
            iVar.mo13169z();
            if (iVar.mo13157f(j, true, false) == -1) {
                z = false;
            }
            if (z || (!this.f12980G[i] && this.f12982I)) {
                i++;
            }
        }
        return false;
    }

    /* renamed from: T */
    private void m17398T() {
        C4117c cVar = new C4117c(this.f12990f, this.f12991g, this.f12999o, this.f13000p);
        if (this.f13009y) {
            C4260a.m18074f(m17393G());
            long j = this.f12978E;
            if (j == -9223372036854775807L || this.f12985L < j) {
                cVar.mo13109h(this.f13005u.mo12717g(this.f12985L).f11910a.f11916b, this.f12985L);
                this.f12985L = -9223372036854775807L;
            } else {
                this.f12988O = true;
                this.f12985L = -9223372036854775807L;
                return;
            }
        }
        this.f12987N = m17390D();
        this.f12993i.mo13133h(cVar.f13021i, 1, -1, (C4109n) null, 0, (Object) null, cVar.f13020h, this.f12978E, this.f12998n.mo13388i(cVar, this, this.f13010z));
    }

    /* renamed from: U */
    private boolean m17399U() {
        return this.f12975B || m17393G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo13091H(int i) {
        return !m17399U() && (this.f12988O || this.f13006v[i].mo13165q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo13092L() throws IOException {
        this.f12998n.mo13386g(this.f13010z);
    }

    /* renamed from: M */
    public void mo13101g(C4117c cVar, long j, long j2, boolean z) {
        this.f12993i.mo13130e(cVar.f13021i, 1, -1, (C4109n) null, 0, (Object) null, cVar.f13020h, this.f12978E, j, j2, cVar.f13023k);
        if (!z) {
            m17389C(cVar);
            for (C4138i x : this.f13006v) {
                x.mo13167x();
            }
            if (this.f12976C > 0) {
                this.f13004t.mo12906e(this);
            }
        }
    }

    /* renamed from: N */
    public void mo13103n(C4117c cVar, long j, long j2) {
        if (this.f12978E == -9223372036854775807L) {
            long E = m17391E();
            long j3 = E == Long.MIN_VALUE ? 0 : E + 10000;
            this.f12978E = j3;
            this.f12994j.mo13112e(j3, this.f13005u.mo12716e());
        }
        this.f12993i.mo13131f(cVar.f13021i, 1, -1, (C4109n) null, 0, (Object) null, cVar.f13020h, this.f12978E, j, j2, cVar.f13023k);
        m17389C(cVar);
        this.f12988O = true;
        this.f13004t.mo12906e(this);
    }

    /* renamed from: O */
    public int mo13099d(C4117c cVar, long j, long j2, IOException iOException) {
        boolean z;
        C4117c cVar2;
        boolean F = m17392F(iOException);
        this.f12993i.mo13132g(cVar.f13021i, 1, -1, (C4109n) null, 0, (Object) null, cVar.f13020h, this.f12978E, j, j2, cVar.f13023k, iOException, F);
        m17389C(cVar);
        if (F) {
            return 3;
        }
        int D = m17390D();
        if (D > this.f12987N) {
            cVar2 = cVar;
            z = true;
        } else {
            cVar2 = cVar;
            z = false;
        }
        if (m17388B(cVar2, D)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo13096P(int i, C4150o oVar, C3895e eVar, boolean z) {
        if (m17399U()) {
            return -3;
        }
        int t = this.f13006v[i].mo13166t(oVar, eVar, z, this.f12988O, this.f12984K);
        if (t == -4) {
            m17395J(i);
        } else if (t == -3) {
            m17396K(i);
        }
        return t;
    }

    /* renamed from: Q */
    public void mo13097Q() {
        if (this.f13009y) {
            for (C4138i k : this.f13006v) {
                k.mo13160k();
            }
        }
        this.f12998n.mo13387h(this);
        this.f13003s.removeCallbacksAndMessages((Object) null);
        this.f12989P = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public int mo13098S(int i, long j) {
        int i2 = 0;
        if (m17399U()) {
            return 0;
        }
        C4138i iVar = this.f13006v[i];
        if (!this.f12988O || j <= iVar.mo13161m()) {
            int f = iVar.mo13157f(j, true, true);
            if (f != -1) {
                i2 = f;
            }
        } else {
            i2 = iVar.mo13158g();
        }
        if (i2 > 0) {
            m17395J(i);
        } else {
            m17396K(i);
        }
        return i2;
    }

    /* renamed from: a */
    public long mo13071a(long j, C3837e0 e0Var) {
        if (!this.f13005u.mo12716e()) {
            return 0;
        }
        C3923l.C3924a g = this.f13005u.mo12717g(j);
        return C4284w.m18228A(j, e0Var, g.f11910a.f11915a, g.f11911b.f11915a);
    }

    /* renamed from: b */
    public void mo12743b(C3923l lVar) {
        this.f13005u = lVar;
        this.f13003s.post(this.f13001q);
    }

    /* renamed from: c */
    public void mo12744c() {
        this.f13008x = true;
        this.f13003s.post(this.f13001q);
    }

    /* renamed from: e */
    public void mo13100e() {
        for (C4138i x : this.f13006v) {
            x.mo13167x();
        }
        this.f12999o.mo13110a();
    }

    /* renamed from: f */
    public long mo13073f(C4229e[] eVarArr, boolean[] zArr, C4141j[] jVarArr, boolean[] zArr2, long j) {
        C4260a.m18074f(this.f13009y);
        int i = this.f12976C;
        int i2 = 0;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (jVarArr[i3] != null && (eVarArr[i3] == null || !zArr[i3])) {
                int d = jVarArr[i3].f13028a;
                C4260a.m18074f(this.f12979F[d]);
                this.f12976C--;
                this.f12979F[d] = false;
                jVarArr[i3] = null;
            }
        }
        boolean z = !this.f12974A ? j != 0 : i == 0;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            if (jVarArr[i4] == null && eVarArr[i4] != null) {
                C4229e eVar = eVarArr[i4];
                C4260a.m18074f(eVar.length() == 1);
                C4260a.m18074f(eVar.mo13328c(0) == 0);
                int b = this.f12977D.mo13178b(eVar.mo13329d());
                C4260a.m18074f(!this.f12979F[b]);
                this.f12976C++;
                this.f12979F[b] = true;
                jVarArr[i4] = new C4120f(b);
                zArr2[i4] = true;
                if (!z) {
                    C4138i iVar = this.f13006v[b];
                    iVar.mo13169z();
                    z = iVar.mo13157f(j, true, true) == -1 && iVar.mo13162n() != 0;
                }
            }
        }
        if (this.f12976C == 0) {
            this.f12986M = false;
            this.f12975B = false;
            if (this.f12998n.mo13385f()) {
                C4138i[] iVarArr = this.f13006v;
                int length = iVarArr.length;
                while (i2 < length) {
                    iVarArr[i2].mo13160k();
                    i2++;
                }
                this.f12998n.mo13384e();
            } else {
                C4138i[] iVarArr2 = this.f13006v;
                int length2 = iVarArr2.length;
                while (i2 < length2) {
                    iVarArr2[i2].mo13167x();
                    i2++;
                }
            }
        } else if (z) {
            j = mo13083r(j);
            while (i2 < jVarArr.length) {
                if (jVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f12974A = true;
        return j;
    }

    /* renamed from: h */
    public long mo13075h() {
        if (this.f12976C == 0) {
            return Long.MIN_VALUE;
        }
        return mo13080o();
    }

    /* renamed from: i */
    public long mo13076i() {
        if (!this.f12975B) {
            return -9223372036854775807L;
        }
        if (!this.f12988O && m17390D() <= this.f12987N) {
            return -9223372036854775807L;
        }
        this.f12975B = false;
        return this.f12984K;
    }

    /* renamed from: j */
    public void mo13077j(C4124e.C4125a aVar, long j) {
        this.f13004t = aVar;
        this.f13000p.mo13416c();
        m17398T();
    }

    /* renamed from: k */
    public void mo13102k(C4109n nVar) {
        this.f13003s.post(this.f13001q);
    }

    /* renamed from: l */
    public C4146n mo13079l() {
        return this.f12977D;
    }

    /* renamed from: m */
    public C3927n mo12745m(int i, int i2) {
        int length = this.f13006v.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f13007w[i3] == i) {
                return this.f13006v[i3];
            }
        }
        C4138i iVar = new C4138i(this.f12995k);
        iVar.mo13156A(this);
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f13007w, i4);
        this.f13007w = copyOf;
        copyOf[length] = i;
        C4138i[] iVarArr = (C4138i[]) Arrays.copyOf(this.f13006v, i4);
        this.f13006v = iVarArr;
        iVarArr[length] = iVar;
        return iVar;
    }

    /* renamed from: o */
    public long mo13080o() {
        long j;
        if (this.f12988O) {
            return Long.MIN_VALUE;
        }
        if (m17393G()) {
            return this.f12985L;
        }
        if (this.f12982I) {
            j = Long.MAX_VALUE;
            int length = this.f13006v.length;
            for (int i = 0; i < length; i++) {
                if (this.f12980G[i]) {
                    j = Math.min(j, this.f13006v[i].mo13161m());
                }
            }
        } else {
            j = m17391E();
        }
        return j == Long.MIN_VALUE ? this.f12984K : j;
    }

    /* renamed from: p */
    public void mo13081p() throws IOException {
        mo13092L();
    }

    /* renamed from: q */
    public void mo13082q(long j, boolean z) {
        int length = this.f13006v.length;
        for (int i = 0; i < length; i++) {
            this.f13006v[i].mo13159j(j, z, this.f12979F[i]);
        }
    }

    /* renamed from: r */
    public long mo13083r(long j) {
        if (!this.f13005u.mo12716e()) {
            j = 0;
        }
        this.f12984K = j;
        this.f12975B = false;
        if (!m17393G() && m17397R(j)) {
            return j;
        }
        this.f12986M = false;
        this.f12985L = j;
        this.f12988O = false;
        if (this.f12998n.mo13385f()) {
            this.f12998n.mo13384e();
        } else {
            for (C4138i x : this.f13006v) {
                x.mo13167x();
            }
        }
        return j;
    }

    /* renamed from: s */
    public boolean mo13084s(long j) {
        if (this.f12988O || this.f12986M) {
            return false;
        }
        if (this.f13009y && this.f12976C == 0) {
            return false;
        }
        boolean c = this.f13000p.mo13416c();
        if (this.f12998n.mo13385f()) {
            return c;
        }
        m17398T();
        return true;
    }

    /* renamed from: t */
    public void mo13085t(long j) {
    }
}
