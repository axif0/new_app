package p148g.p189d.p190a.p200b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p148g.p189d.p190a.p200b.C3838f;
import p148g.p189d.p190a.p200b.C3844g0;
import p148g.p189d.p190a.p200b.C4322z;
import p148g.p189d.p190a.p200b.p217n0.C4124e;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p217n0.C4141j;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p228p0.C4232g;
import p148g.p189d.p190a.p200b.p228p0.C4234h;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4261b;
import p148g.p189d.p190a.p200b.p230r0.C4266g;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.l */
final class C4040l implements Handler.Callback, C4124e.C4125a, C4232g.C4233a, C4126f.C4127a, C3838f.C3839a, C4322z.C4323a {

    /* renamed from: A */
    private C3829a0[] f12737A;

    /* renamed from: B */
    private boolean f12738B;

    /* renamed from: C */
    private boolean f12739C;

    /* renamed from: D */
    private boolean f12740D;

    /* renamed from: E */
    private int f12741E;

    /* renamed from: F */
    private boolean f12742F;

    /* renamed from: G */
    private int f12743G;

    /* renamed from: H */
    private C4045e f12744H;

    /* renamed from: I */
    private long f12745I;

    /* renamed from: J */
    private int f12746J;

    /* renamed from: f */
    private final C3829a0[] f12747f;

    /* renamed from: g */
    private final C3831b0[] f12748g;

    /* renamed from: h */
    private final C4232g f12749h;

    /* renamed from: i */
    private final C4234h f12750i;

    /* renamed from: j */
    private final C4235q f12751j;

    /* renamed from: k */
    private final C4266g f12752k;

    /* renamed from: l */
    private final HandlerThread f12753l;

    /* renamed from: m */
    private final Handler f12754m;

    /* renamed from: n */
    private final C3888i f12755n;

    /* renamed from: o */
    private final C3844g0.C3847c f12756o;

    /* renamed from: p */
    private final C3844g0.C3846b f12757p;

    /* renamed from: q */
    private final long f12758q;

    /* renamed from: r */
    private final boolean f12759r;

    /* renamed from: s */
    private final C3838f f12760s;

    /* renamed from: t */
    private final C4044d f12761t;

    /* renamed from: u */
    private final ArrayList<C4043c> f12762u;

    /* renamed from: v */
    private final C4261b f12763v;

    /* renamed from: w */
    private final C4312t f12764w = new C4312t();

    /* renamed from: x */
    private C3837e0 f12765x;

    /* renamed from: y */
    private C4314v f12766y;

    /* renamed from: z */
    private C4126f f12767z;

    /* renamed from: g.d.a.b.l$a */
    class C4041a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4322z f12768f;

        C4041a(C4322z zVar) {
            this.f12768f = zVar;
        }

        public void run() {
            try {
                C4040l.this.m17084g(this.f12768f);
            } catch (C3848h e) {
                Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: g.d.a.b.l$b */
    private static final class C4042b {

        /* renamed from: a */
        public final C4126f f12770a;

        /* renamed from: b */
        public final C3844g0 f12771b;

        /* renamed from: c */
        public final Object f12772c;

        public C4042b(C4126f fVar, C3844g0 g0Var, Object obj) {
            this.f12770a = fVar;
            this.f12771b = g0Var;
            this.f12772c = obj;
        }
    }

    /* renamed from: g.d.a.b.l$c */
    private static final class C4043c implements Comparable<C4043c> {

        /* renamed from: f */
        public final C4322z f12773f;

        /* renamed from: g */
        public int f12774g;

        /* renamed from: h */
        public long f12775h;

        /* renamed from: i */
        public Object f12776i;

        public C4043c(C4322z zVar) {
            this.f12773f = zVar;
        }

        /* renamed from: e */
        public int compareTo(C4043c cVar) {
            if ((this.f12776i == null) != (cVar.f12776i == null)) {
                return this.f12776i != null ? -1 : 1;
            }
            if (this.f12776i == null) {
                return 0;
            }
            int i = this.f12774g - cVar.f12774g;
            return i != 0 ? i : C4284w.m18241g(this.f12775h, cVar.f12775h);
        }

        /* renamed from: g */
        public void mo12912g(int i, long j, Object obj) {
            this.f12774g = i;
            this.f12775h = j;
            this.f12776i = obj;
        }
    }

    /* renamed from: g.d.a.b.l$d */
    private static final class C4044d {

        /* renamed from: a */
        private C4314v f12777a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f12778b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f12779c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f12780d;

        private C4044d() {
        }

        /* synthetic */ C4044d(C4041a aVar) {
            this();
        }

        /* renamed from: d */
        public boolean mo12913d(C4314v vVar) {
            return vVar != this.f12777a || this.f12778b > 0 || this.f12779c;
        }

        /* renamed from: e */
        public void mo12914e(int i) {
            this.f12778b += i;
        }

        /* renamed from: f */
        public void mo12915f(C4314v vVar) {
            this.f12777a = vVar;
            this.f12778b = 0;
            this.f12779c = false;
        }

        /* renamed from: g */
        public void mo12916g(int i) {
            boolean z = true;
            if (!this.f12779c || this.f12780d == 4) {
                this.f12779c = true;
                this.f12780d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C4260a.m18069a(z);
        }
    }

    /* renamed from: g.d.a.b.l$e */
    private static final class C4045e {

        /* renamed from: a */
        public final C3844g0 f12781a;

        /* renamed from: b */
        public final int f12782b;

        /* renamed from: c */
        public final long f12783c;

        public C4045e(C3844g0 g0Var, int i, long j) {
            this.f12781a = g0Var;
            this.f12782b = i;
            this.f12783c = j;
        }
    }

    public C4040l(C3829a0[] a0VarArr, C4232g gVar, C4234h hVar, C4235q qVar, boolean z, int i, boolean z2, Handler handler, C3888i iVar, C4261b bVar) {
        this.f12747f = a0VarArr;
        this.f12749h = gVar;
        this.f12750i = hVar;
        this.f12751j = qVar;
        this.f12739C = z;
        this.f12741E = i;
        this.f12742F = z2;
        this.f12754m = handler;
        this.f12755n = iVar;
        this.f12763v = bVar;
        this.f12758q = qVar.mo12452h();
        this.f12759r = qVar.mo12446b();
        this.f12765x = C3837e0.f11543d;
        this.f12766y = new C4314v(C3844g0.f11572a, -9223372036854775807L, hVar);
        this.f12761t = new C4044d((C4041a) null);
        this.f12748g = new C3831b0[a0VarArr.length];
        for (int i2 = 0; i2 < a0VarArr.length; i2++) {
            a0VarArr[i2].mo12413e(i2);
            this.f12748g[i2] = a0VarArr[i2].mo12428t();
        }
        this.f12760s = new C3838f(this, bVar);
        this.f12762u = new ArrayList<>();
        this.f12737A = new C3829a0[0];
        this.f12756o = new C3844g0.C3847c();
        this.f12757p = new C3844g0.C3846b();
        gVar.mo13361a(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f12753l = handlerThread;
        handlerThread.start();
        this.f12752k = bVar.mo13413c(this.f12753l.getLooper(), this);
    }

    /* renamed from: C */
    private void m17057C(C4126f fVar, boolean z, boolean z2) {
        this.f12743G++;
        m17061G(true, z, z2);
        this.f12751j.mo12453i();
        this.f12767z = fVar;
        m17081e0(2);
        fVar.mo13117f(this.f12755n, true, this);
        this.f12752k.mo13420b(2);
    }

    /* renamed from: D */
    private void m17058D() {
        m17061G(true, true, true);
        this.f12751j.mo12449e();
        m17081e0(1);
        this.f12753l.quit();
        synchronized (this) {
            this.f12738B = true;
            notifyAll();
        }
    }

    /* renamed from: E */
    private boolean m17059E(C3829a0 a0Var) {
        C4259r rVar = this.f12764w.mo13573o().f13601i;
        return rVar != null && rVar.f13598f && a0Var.mo12417j();
    }

    /* renamed from: F */
    private void m17060F() throws C3848h {
        if (this.f12764w.mo13576s()) {
            float f = this.f12760s.mo12458d().f13801a;
            C4259r n = this.f12764w.mo13572n();
            C4259r o = this.f12764w.mo13573o();
            boolean z = true;
            while (n != null && n.f13598f) {
                if (n.mo13408o(f)) {
                    if (z) {
                        C4259r n2 = this.f12764w.mo13572n();
                        boolean x = this.f12764w.mo13579x(n2);
                        boolean[] zArr = new boolean[this.f12747f.length];
                        long b = n2.mo13399b(this.f12766y.f13798i, x, zArr);
                        m17093k0(n2.f13602j);
                        C4314v vVar = this.f12766y;
                        if (!(vVar.f13795f == 4 || b == vVar.f13798i)) {
                            C4314v vVar2 = this.f12766y;
                            this.f12766y = vVar2.mo13586g(vVar2.f13792c, b, vVar2.f13794e);
                            this.f12761t.mo12916g(4);
                            m17062H(b);
                        }
                        boolean[] zArr2 = new boolean[this.f12747f.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C3829a0[] a0VarArr = this.f12747f;
                            if (i >= a0VarArr.length) {
                                break;
                            }
                            C3829a0 a0Var = a0VarArr[i];
                            zArr2[i] = a0Var.getState() != 0;
                            C4141j jVar = n2.f13595c[i];
                            if (jVar != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (jVar != a0Var.mo12420n()) {
                                    m17086h(a0Var);
                                } else if (zArr[i]) {
                                    a0Var.mo12423q(this.f12745I);
                                }
                            }
                            i++;
                        }
                        this.f12766y = this.f12766y.mo13585f(n2.f13602j);
                        m17092k(zArr2, i2);
                    } else {
                        this.f12764w.mo13579x(n);
                        if (n.f13598f) {
                            n.mo13398a(Math.max(n.f13600h.f13667b, n.mo13409p(this.f12745I)), false);
                            m17093k0(n.f13602j);
                        }
                    }
                    if (this.f12766y.f13795f != 4) {
                        m17107v();
                        m17097m0();
                        this.f12752k.mo13420b(2);
                        return;
                    }
                    return;
                }
                if (n == o) {
                    z = false;
                }
                n = n.f13601i;
            }
        }
    }

    /* renamed from: G */
    private void m17061G(boolean z, boolean z2, boolean z3) {
        C4126f fVar;
        this.f12752k.mo13423e(2);
        this.f12740D = false;
        this.f12760s.mo12463i();
        this.f12745I = 60000000;
        for (C3829a0 h : this.f12737A) {
            try {
                m17086h(h);
            } catch (C3848h | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f12737A = new C3829a0[0];
        this.f12764w.mo13567d();
        m17075V(false);
        if (z2) {
            this.f12744H = null;
        }
        if (z3) {
            this.f12764w.mo13560B(C3844g0.f11572a);
            Iterator<C4043c> it = this.f12762u.iterator();
            while (it.hasNext()) {
                it.next().f12773f.mo13605j(false);
            }
            this.f12762u.clear();
            this.f12746J = 0;
        }
        C3844g0 g0Var = z3 ? C3844g0.f11572a : this.f12766y.f13790a;
        Object obj = z3 ? null : this.f12766y.f13791b;
        C4126f.C4128b bVar = z2 ? new C4126f.C4128b(m17096m()) : this.f12766y.f13792c;
        long j = -9223372036854775807L;
        long j2 = z2 ? -9223372036854775807L : this.f12766y.f13798i;
        if (!z2) {
            j = this.f12766y.f13794e;
        }
        long j3 = j;
        C4314v vVar = this.f12766y;
        this.f12766y = new C4314v(g0Var, obj, bVar, j2, j3, vVar.f13795f, false, z3 ? this.f12750i : vVar.f13797h);
        if (z && (fVar = this.f12767z) != null) {
            fVar.mo13116d();
            this.f12767z = null;
        }
    }

    /* renamed from: H */
    private void m17062H(long j) throws C3848h {
        long q = !this.f12764w.mo13576s() ? j + 60000000 : this.f12764w.mo13572n().mo13410q(j);
        this.f12745I = q;
        this.f12760s.mo12460f(q);
        for (C3829a0 q2 : this.f12737A) {
            q2.mo12423q(this.f12745I);
        }
    }

    /* renamed from: I */
    private boolean m17063I(C4043c cVar) {
        Object obj = cVar.f12776i;
        if (obj == null) {
            Pair<Integer, Long> K = m17065K(new C4045e(cVar.f12773f.mo13602g(), cVar.f12773f.mo13604i(), C3830b.m15922a(cVar.f12773f.mo13600e())), false);
            if (K == null) {
                return false;
            }
            cVar.mo12912g(((Integer) K.first).intValue(), ((Long) K.second).longValue(), this.f12766y.f13790a.mo12537g(((Integer) K.first).intValue(), this.f12757p, true).f11574b);
        } else {
            int b = this.f12766y.f13790a.mo12532b(obj);
            if (b == -1) {
                return false;
            }
            cVar.f12774g = b;
        }
        return true;
    }

    /* renamed from: J */
    private void m17064J() {
        for (int size = this.f12762u.size() - 1; size >= 0; size--) {
            if (!m17063I(this.f12762u.get(size))) {
                this.f12762u.get(size).f12773f.mo13605j(false);
                this.f12762u.remove(size);
            }
        }
        Collections.sort(this.f12762u);
    }

    /* renamed from: K */
    private Pair<Integer, Long> m17065K(C4045e eVar, boolean z) {
        int L;
        C3844g0 g0Var = this.f12766y.f13790a;
        C3844g0 g0Var2 = eVar.f12781a;
        if (g0Var.mo12546p()) {
            return null;
        }
        if (g0Var2.mo12546p()) {
            g0Var2 = g0Var;
        }
        try {
            Pair<Integer, Long> i = g0Var2.mo12539i(this.f12756o, this.f12757p, eVar.f12782b, eVar.f12783c);
            if (g0Var == g0Var2) {
                return i;
            }
            int b = g0Var.mo12532b(g0Var2.mo12537g(((Integer) i.first).intValue(), this.f12757p, true).f11574b);
            if (b != -1) {
                return Pair.create(Integer.valueOf(b), i.second);
            }
            if (!z || (L = m17066L(((Integer) i.first).intValue(), g0Var2, g0Var)) == -1) {
                return null;
            }
            return m17100o(g0Var, g0Var.mo12536f(L, this.f12757p).f11575c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C4217p(g0Var, eVar.f12782b, eVar.f12783c);
        }
    }

    /* renamed from: L */
    private int m17066L(int i, C3844g0 g0Var, C3844g0 g0Var2) {
        int h = g0Var.mo12538h();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < h && i3 == -1; i4++) {
            i2 = g0Var.mo12534d(i2, this.f12757p, this.f12756o, this.f12741E, this.f12742F);
            if (i2 == -1) {
                break;
            }
            i3 = g0Var2.mo12532b(g0Var.mo12537g(i2, this.f12757p, true).f11574b);
        }
        return i3;
    }

    /* renamed from: M */
    private void m17067M(long j, long j2) {
        this.f12752k.mo13423e(2);
        this.f12752k.mo13422d(2, j + j2);
    }

    /* renamed from: O */
    private void m17068O(boolean z) throws C3848h {
        C4126f.C4128b bVar = this.f12764w.mo13572n().f13600h.f13666a;
        long R = m17071R(bVar, this.f12766y.f13798i, true);
        if (R != this.f12766y.f13798i) {
            C4314v vVar = this.f12766y;
            this.f12766y = vVar.mo13586g(bVar, R, vVar.f13794e);
            if (z) {
                this.f12761t.mo12916g(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061 A[Catch:{ all -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17069P(p148g.p189d.p190a.p200b.C4040l.C4045e r21) throws p148g.p189d.p190a.p200b.C3848h {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            g.d.a.b.l$d r2 = r1.f12761t
            r3 = 1
            r2.mo12914e(r3)
            android.util.Pair r2 = r1.m17065K(r0, r3)
            r4 = 0
            r6 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0027
            g.d.a.b.n0.f$b r2 = new g.d.a.b.n0.f$b
            int r9 = r20.m17096m()
            r2.<init>(r9)
            r15 = r2
            r12 = r7
            r18 = r12
        L_0x0025:
            r2 = 1
            goto L_0x005c
        L_0x0027:
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r2.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            g.d.a.b.t r12 = r1.f12764w
            g.d.a.b.n0.f$b r9 = r12.mo13580y(r9, r10)
            boolean r12 = r9.mo13121b()
            if (r12 == 0) goto L_0x0048
            r12 = r4
            r15 = r9
            r18 = r10
            goto L_0x0025
        L_0x0048:
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r14 = r0.f12783c
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r15 = r9
            r18 = r10
        L_0x005c:
            r9 = 2
            g.d.a.b.n0.f r10 = r1.f12767z     // Catch:{ all -> 0x00db }
            if (r10 == 0) goto L_0x00c7
            int r10 = r1.f12743G     // Catch:{ all -> 0x00db }
            if (r10 <= 0) goto L_0x0066
            goto L_0x00c7
        L_0x0066:
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            r0 = 4
            r1.m17081e0(r0)     // Catch:{ all -> 0x00db }
            r1.m17061G(r6, r3, r6)     // Catch:{ all -> 0x00db }
            goto L_0x00c9
        L_0x0072:
            g.d.a.b.v r0 = r1.f12766y     // Catch:{ all -> 0x00db }
            g.d.a.b.n0.f$b r0 = r0.f13792c     // Catch:{ all -> 0x00db }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00b8
            g.d.a.b.t r0 = r1.f12764w     // Catch:{ all -> 0x00db }
            g.d.a.b.r r0 = r0.mo13572n()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x0091
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0091
            g.d.a.b.n0.e r0 = r0.f13593a     // Catch:{ all -> 0x00db }
            g.d.a.b.e0 r4 = r1.f12765x     // Catch:{ all -> 0x00db }
            long r4 = r0.mo13071a(r12, r4)     // Catch:{ all -> 0x00db }
            goto L_0x0092
        L_0x0091:
            r4 = r12
        L_0x0092:
            long r7 = p148g.p189d.p190a.p200b.C3830b.m15923b(r4)     // Catch:{ all -> 0x00db }
            g.d.a.b.v r0 = r1.f12766y     // Catch:{ all -> 0x00db }
            long r10 = r0.f13798i     // Catch:{ all -> 0x00db }
            long r10 = p148g.p189d.p190a.p200b.C3830b.m15923b(r10)     // Catch:{ all -> 0x00db }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            g.d.a.b.v r0 = r1.f12766y     // Catch:{ all -> 0x00db }
            long r3 = r0.f13798i     // Catch:{ all -> 0x00db }
            g.d.a.b.v r14 = r1.f12766y
            r16 = r3
            g.d.a.b.v r0 = r14.mo13586g(r15, r16, r18)
            r1.f12766y = r0
            if (r2 == 0) goto L_0x00b7
            g.d.a.b.l$d r0 = r1.f12761t
            r0.mo12916g(r9)
        L_0x00b7:
            return
        L_0x00b8:
            r4 = r12
        L_0x00b9:
            long r4 = r1.m17070Q(r15, r4)     // Catch:{ all -> 0x00db }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            r2 = r2 | r3
            r16 = r4
            goto L_0x00cb
        L_0x00c7:
            r1.f12744H = r0     // Catch:{ all -> 0x00db }
        L_0x00c9:
            r16 = r12
        L_0x00cb:
            g.d.a.b.v r14 = r1.f12766y
            g.d.a.b.v r0 = r14.mo13586g(r15, r16, r18)
            r1.f12766y = r0
            if (r2 == 0) goto L_0x00da
            g.d.a.b.l$d r0 = r1.f12761t
            r0.mo12916g(r9)
        L_0x00da:
            return
        L_0x00db:
            r0 = move-exception
            g.d.a.b.v r14 = r1.f12766y
            r16 = r12
            g.d.a.b.v r3 = r14.mo13586g(r15, r16, r18)
            r1.f12766y = r3
            if (r2 == 0) goto L_0x00ed
            g.d.a.b.l$d r2 = r1.f12761t
            r2.mo12916g(r9)
        L_0x00ed:
            goto L_0x00ef
        L_0x00ee:
            throw r0
        L_0x00ef:
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.C4040l.m17069P(g.d.a.b.l$e):void");
    }

    /* renamed from: Q */
    private long m17070Q(C4126f.C4128b bVar, long j) throws C3848h {
        return m17071R(bVar, j, this.f12764w.mo13572n() != this.f12764w.mo13573o());
    }

    /* renamed from: R */
    private long m17071R(C4126f.C4128b bVar, long j, boolean z) throws C3848h {
        m17091j0();
        this.f12740D = false;
        m17081e0(2);
        C4259r n = this.f12764w.mo13572n();
        C4259r rVar = n;
        while (true) {
            if (rVar == null) {
                break;
            } else if (m17083f0(bVar, j, rVar)) {
                this.f12764w.mo13579x(rVar);
                break;
            } else {
                rVar = this.f12764w.mo13565a();
            }
        }
        if (n != rVar || z) {
            for (C3829a0 h : this.f12737A) {
                m17086h(h);
            }
            this.f12737A = new C3829a0[0];
            n = null;
        }
        if (rVar != null) {
            m17099n0(n);
            if (rVar.f13599g) {
                long r = rVar.f13593a.mo13083r(j);
                rVar.f13593a.mo13082q(r - this.f12758q, this.f12759r);
                j = r;
            }
            m17062H(j);
            m17107v();
        } else {
            this.f12764w.mo13567d();
            m17062H(j);
        }
        this.f12752k.mo13420b(2);
        return j;
    }

    /* renamed from: S */
    private void m17072S(C4322z zVar) throws C3848h {
        if (zVar.mo13600e() == -9223372036854775807L) {
            m17073T(zVar);
        } else if (this.f12767z == null || this.f12743G > 0) {
            this.f12762u.add(new C4043c(zVar));
        } else {
            C4043c cVar = new C4043c(zVar);
            if (m17063I(cVar)) {
                this.f12762u.add(cVar);
                Collections.sort(this.f12762u);
                return;
            }
            zVar.mo13605j(false);
        }
    }

    /* renamed from: T */
    private void m17073T(C4322z zVar) throws C3848h {
        if (zVar.mo13598c().getLooper() == this.f12752k.mo13425g()) {
            m17084g(zVar);
            int i = this.f12766y.f13795f;
            if (i == 3 || i == 2) {
                this.f12752k.mo13420b(2);
                return;
            }
            return;
        }
        this.f12752k.mo13424f(15, zVar).sendToTarget();
    }

    /* renamed from: U */
    private void m17074U(C4322z zVar) {
        zVar.mo13598c().post(new C4041a(zVar));
    }

    /* renamed from: V */
    private void m17075V(boolean z) {
        C4314v vVar = this.f12766y;
        if (vVar.f13796g != z) {
            this.f12766y = vVar.mo13581b(z);
        }
    }

    /* renamed from: X */
    private void m17076X(boolean z) throws C3848h {
        this.f12740D = false;
        this.f12739C = z;
        if (!z) {
            m17091j0();
            m17097m0();
            return;
        }
        int i = this.f12766y.f13795f;
        if (i == 3) {
            m17087h0();
        } else if (i != 2) {
            return;
        }
        this.f12752k.mo13420b(2);
    }

    /* renamed from: Y */
    private void m17077Y(C4315w wVar) {
        this.f12760s.mo12462h(wVar);
    }

    /* renamed from: a0 */
    private void m17078a0(int i) throws C3848h {
        this.f12741E = i;
        if (!this.f12764w.mo13563F(i)) {
            m17068O(true);
        }
    }

    /* renamed from: b0 */
    private void m17079b0(C3837e0 e0Var) {
        this.f12765x = e0Var;
    }

    /* renamed from: d0 */
    private void m17080d0(boolean z) throws C3848h {
        this.f12742F = z;
        if (!this.f12764w.mo13564G(z)) {
            m17068O(true);
        }
    }

    /* renamed from: e0 */
    private void m17081e0(int i) {
        C4314v vVar = this.f12766y;
        if (vVar.f13795f != i) {
            this.f12766y = vVar.mo13583d(i);
        }
    }

    /* renamed from: f0 */
    private boolean m17083f0(C4126f.C4128b bVar, long j, C4259r rVar) {
        if (!bVar.equals(rVar.f13600h.f13666a) || !rVar.f13598f) {
            return false;
        }
        this.f12766y.f13790a.mo12536f(rVar.f13600h.f13666a.f13045a, this.f12757p);
        int d = this.f12757p.mo12551d(j);
        return d == -1 || this.f12757p.mo12553f(d) == rVar.f13600h.f13668c;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17084g(C4322z zVar) throws C3848h {
        try {
            zVar.mo13601f().mo12419m(zVar.mo13603h(), zVar.mo13599d());
        } finally {
            zVar.mo13605j(true);
        }
    }

    /* renamed from: g0 */
    private boolean m17085g0(boolean z) {
        if (this.f12737A.length == 0) {
            return m17106u();
        }
        if (!z) {
            return false;
        }
        if (!this.f12766y.f13796g) {
            return true;
        }
        C4259r i = this.f12764w.mo13570i();
        long h = i.mo13401h(!i.f13600h.f13672g);
        return h == Long.MIN_VALUE || this.f12751j.mo12445a(h - i.mo13409p(this.f12745I), this.f12760s.mo12458d().f13801a, this.f12740D);
    }

    /* renamed from: h */
    private void m17086h(C3829a0 a0Var) throws C3848h {
        this.f12760s.mo12457c(a0Var);
        m17094l(a0Var);
        a0Var.mo12414f();
    }

    /* renamed from: h0 */
    private void m17087h0() throws C3848h {
        this.f12740D = false;
        this.f12760s.mo12461g();
        for (C3829a0 start : this.f12737A) {
            start.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17088i() throws p148g.p189d.p190a.p200b.C3848h, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            g.d.a.b.r0.b r1 = r0.f12763v
            long r1 = r1.mo13412b()
            r17.m17095l0()
            g.d.a.b.t r3 = r0.f12764w
            boolean r3 = r3.mo13576s()
            r4 = 10
            if (r3 != 0) goto L_0x001c
            r17.m17109x()
            r0.m17067M(r1, r4)
            return
        L_0x001c:
            g.d.a.b.t r3 = r0.f12764w
            g.d.a.b.r r3 = r3.mo13572n()
            java.lang.String r6 = "doSomeWork"
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18224a(r6)
            r17.m17097m0()
            long r6 = android.os.SystemClock.elapsedRealtime()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            g.d.a.b.n0.e r10 = r3.f13593a
            g.d.a.b.v r11 = r0.f12766y
            long r11 = r11.f13798i
            long r13 = r0.f12758q
            long r11 = r11 - r13
            boolean r13 = r0.f12759r
            r10.mo13082q(r11, r13)
            g.d.a.b.a0[] r10 = r0.f12737A
            int r11 = r10.length
            r13 = 1
            r14 = 0
            r15 = 1
            r16 = 1
        L_0x0048:
            if (r14 >= r11) goto L_0x0085
            r12 = r10[r14]
            long r8 = r0.f12745I
            r12.mo12436l(r8, r6)
            if (r16 == 0) goto L_0x005c
            boolean r8 = r12.mo12434c()
            if (r8 == 0) goto L_0x005c
            r16 = 1
            goto L_0x005e
        L_0x005c:
            r16 = 0
        L_0x005e:
            boolean r8 = r12.mo12435g()
            if (r8 != 0) goto L_0x0073
            boolean r8 = r12.mo12434c()
            if (r8 != 0) goto L_0x0073
            boolean r8 = r0.m17059E(r12)
            if (r8 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r8 = 0
            goto L_0x0074
        L_0x0073:
            r8 = 1
        L_0x0074:
            if (r8 != 0) goto L_0x0079
            r12.mo12422p()
        L_0x0079:
            if (r15 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r15 = 1
            goto L_0x0080
        L_0x007f:
            r15 = 0
        L_0x0080:
            int r14 = r14 + 1
            r8 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0048
        L_0x0085:
            if (r15 != 0) goto L_0x008a
            r17.m17109x()
        L_0x008a:
            g.d.a.b.s r6 = r3.f13600h
            long r6 = r6.f13670e
            r8 = 4
            r9 = 3
            r10 = 2
            if (r16 == 0) goto L_0x00b1
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00a4
            g.d.a.b.v r11 = r0.f12766y
            long r11 = r11.f13798i
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00b1
        L_0x00a4:
            g.d.a.b.s r3 = r3.f13600h
            boolean r3 = r3.f13672g
            if (r3 == 0) goto L_0x00b1
            r0.m17081e0(r8)
        L_0x00ad:
            r17.m17091j0()
            goto L_0x00e4
        L_0x00b1:
            g.d.a.b.v r3 = r0.f12766y
            int r3 = r3.f13795f
            if (r3 != r10) goto L_0x00c8
            boolean r3 = r0.m17085g0(r15)
            if (r3 == 0) goto L_0x00c8
            r0.m17081e0(r9)
            boolean r3 = r0.f12739C
            if (r3 == 0) goto L_0x00e4
            r17.m17087h0()
            goto L_0x00e4
        L_0x00c8:
            g.d.a.b.v r3 = r0.f12766y
            int r3 = r3.f13795f
            if (r3 != r9) goto L_0x00e4
            g.d.a.b.a0[] r3 = r0.f12737A
            int r3 = r3.length
            if (r3 != 0) goto L_0x00da
            boolean r3 = r17.m17106u()
            if (r3 == 0) goto L_0x00dc
            goto L_0x00e4
        L_0x00da:
            if (r15 != 0) goto L_0x00e4
        L_0x00dc:
            boolean r3 = r0.f12739C
            r0.f12740D = r3
            r0.m17081e0(r10)
            goto L_0x00ad
        L_0x00e4:
            g.d.a.b.v r3 = r0.f12766y
            int r3 = r3.f13795f
            if (r3 != r10) goto L_0x00f8
            g.d.a.b.a0[] r3 = r0.f12737A
            int r6 = r3.length
            r12 = 0
        L_0x00ee:
            if (r12 >= r6) goto L_0x00f8
            r7 = r3[r12]
            r7.mo12422p()
            int r12 = r12 + 1
            goto L_0x00ee
        L_0x00f8:
            boolean r3 = r0.f12739C
            if (r3 == 0) goto L_0x0102
            g.d.a.b.v r3 = r0.f12766y
            int r3 = r3.f13795f
            if (r3 == r9) goto L_0x0108
        L_0x0102:
            g.d.a.b.v r3 = r0.f12766y
            int r3 = r3.f13795f
            if (r3 != r10) goto L_0x010c
        L_0x0108:
            r0.m17067M(r1, r4)
            goto L_0x011e
        L_0x010c:
            g.d.a.b.a0[] r4 = r0.f12737A
            int r4 = r4.length
            if (r4 == 0) goto L_0x0119
            if (r3 == r8) goto L_0x0119
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.m17067M(r1, r3)
            goto L_0x011e
        L_0x0119:
            g.d.a.b.r0.g r1 = r0.f12752k
            r1.mo13423e(r10)
        L_0x011e:
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18226c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.C4040l.m17088i():void");
    }

    /* renamed from: i0 */
    private void m17089i0(boolean z, boolean z2) {
        m17061G(true, z, z);
        this.f12761t.mo12914e(this.f12743G + (z2 ? 1 : 0));
        this.f12743G = 0;
        this.f12751j.mo12451g();
        m17081e0(1);
    }

    /* renamed from: j */
    private void m17090j(int i, boolean z, int i2) throws C3848h {
        C4259r n = this.f12764w.mo13572n();
        C3829a0 a0Var = this.f12747f[i];
        this.f12737A[i2] = a0Var;
        if (a0Var.getState() == 0) {
            C4234h hVar = n.f13602j;
            C3833c0 c0Var = hVar.f13536e[i];
            C4109n[] n2 = m17098n(hVar.f13534c.mo13357a(i));
            boolean z2 = this.f12739C && this.f12766y.f13795f == 3;
            a0Var.mo12418k(c0Var, n2, n.f13595c[i], this.f12745I, !z && z2, n.mo13403j());
            this.f12760s.mo12459e(a0Var);
            if (z2) {
                a0Var.start();
            }
        }
    }

    /* renamed from: j0 */
    private void m17091j0() throws C3848h {
        this.f12760s.mo12463i();
        for (C3829a0 l : this.f12737A) {
            m17094l(l);
        }
    }

    /* renamed from: k */
    private void m17092k(boolean[] zArr, int i) throws C3848h {
        this.f12737A = new C3829a0[i];
        C4259r n = this.f12764w.mo13572n();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f12747f.length; i3++) {
            if (n.f13602j.f13533b[i3]) {
                m17090j(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    /* renamed from: k0 */
    private void m17093k0(C4234h hVar) {
        this.f12751j.mo12448d(this.f12747f, hVar.f13532a, hVar.f13534c);
    }

    /* renamed from: l */
    private void m17094l(C3829a0 a0Var) throws C3848h {
        if (a0Var.getState() == 2) {
            a0Var.stop();
        }
    }

    /* renamed from: l0 */
    private void m17095l0() throws C3848h, IOException {
        C4126f fVar = this.f12767z;
        if (fVar != null) {
            if (this.f12743G > 0) {
                fVar.mo13114b();
                return;
            }
            m17111z();
            C4259r i = this.f12764w.mo13570i();
            int i2 = 0;
            if (i == null || i.mo13405l()) {
                m17075V(false);
            } else if (!this.f12766y.f13796g) {
                m17107v();
            }
            if (this.f12764w.mo13576s()) {
                C4259r n = this.f12764w.mo13572n();
                C4259r o = this.f12764w.mo13573o();
                boolean z = false;
                while (this.f12739C && n != o && this.f12745I >= n.f13601i.f13597e) {
                    if (z) {
                        m17108w();
                    }
                    int i3 = n.f13600h.f13671f ? 0 : 3;
                    C4259r a = this.f12764w.mo13565a();
                    m17099n0(n);
                    C4314v vVar = this.f12766y;
                    C4287s sVar = a.f13600h;
                    this.f12766y = vVar.mo13586g(sVar.f13666a, sVar.f13667b, sVar.f13669d);
                    this.f12761t.mo12916g(i3);
                    m17097m0();
                    n = a;
                    z = true;
                }
                if (o.f13600h.f13672g) {
                    while (true) {
                        C3829a0[] a0VarArr = this.f12747f;
                        if (i2 < a0VarArr.length) {
                            C3829a0 a0Var = a0VarArr[i2];
                            C4141j jVar = o.f13595c[i2];
                            if (jVar != null && a0Var.mo12420n() == jVar && a0Var.mo12417j()) {
                                a0Var.mo12421o();
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else {
                    C4259r rVar = o.f13601i;
                    if (rVar != null && rVar.f13598f) {
                        int i4 = 0;
                        while (true) {
                            C3829a0[] a0VarArr2 = this.f12747f;
                            if (i4 < a0VarArr2.length) {
                                C3829a0 a0Var2 = a0VarArr2[i4];
                                C4141j jVar2 = o.f13595c[i4];
                                if (a0Var2.mo12420n() != jVar2) {
                                    return;
                                }
                                if (jVar2 == null || a0Var2.mo12417j()) {
                                    i4++;
                                } else {
                                    return;
                                }
                            } else {
                                C4234h hVar = o.f13602j;
                                C4259r b = this.f12764w.mo13566b();
                                C4234h hVar2 = b.f13602j;
                                boolean z2 = b.f13593a.mo13076i() != -9223372036854775807L;
                                int i5 = 0;
                                while (true) {
                                    C3829a0[] a0VarArr3 = this.f12747f;
                                    if (i5 < a0VarArr3.length) {
                                        C3829a0 a0Var3 = a0VarArr3[i5];
                                        if (hVar.f13533b[i5]) {
                                            if (!z2) {
                                                if (!a0Var3.mo12424r()) {
                                                    C4229e a2 = hVar2.f13534c.mo13357a(i5);
                                                    boolean z3 = hVar2.f13533b[i5];
                                                    boolean z4 = this.f12748g[i5].mo12416i() == 5;
                                                    C3833c0 c0Var = hVar.f13536e[i5];
                                                    C3833c0 c0Var2 = hVar2.f13536e[i5];
                                                    if (z3 && c0Var2.equals(c0Var) && !z4) {
                                                        a0Var3.mo12429v(m17098n(a2), b.f13595c[i5], b.mo13403j());
                                                    }
                                                }
                                            }
                                            a0Var3.mo12421o();
                                        }
                                        i5++;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private int m17096m() {
        C3844g0 g0Var = this.f12766y.f13790a;
        if (g0Var.mo12546p()) {
            return 0;
        }
        return g0Var.mo12542l(g0Var.mo12531a(this.f12742F), this.f12756o).f11582d;
    }

    /* renamed from: m0 */
    private void m17097m0() throws C3848h {
        if (this.f12764w.mo13576s()) {
            C4259r n = this.f12764w.mo13572n();
            long i = n.f13593a.mo13076i();
            if (i != -9223372036854775807L) {
                m17062H(i);
                if (i != this.f12766y.f13798i) {
                    C4314v vVar = this.f12766y;
                    this.f12766y = vVar.mo13586g(vVar.f13792c, i, vVar.f13794e);
                    this.f12761t.mo12916g(4);
                }
            } else {
                long j = this.f12760s.mo12464j();
                this.f12745I = j;
                long p = n.mo13409p(j);
                m17110y(this.f12766y.f13798i, p);
                this.f12766y.f13798i = p;
            }
            this.f12766y.f13799j = this.f12737A.length == 0 ? n.f13600h.f13670e : n.mo13401h(true);
        }
    }

    /* renamed from: n */
    private static C4109n[] m17098n(C4229e eVar) {
        int length = eVar != null ? eVar.length() : 0;
        C4109n[] nVarArr = new C4109n[length];
        for (int i = 0; i < length; i++) {
            nVarArr[i] = eVar.mo13326a(i);
        }
        return nVarArr;
    }

    /* renamed from: n0 */
    private void m17099n0(C4259r rVar) throws C3848h {
        C4259r n = this.f12764w.mo13572n();
        if (n != null && rVar != n) {
            boolean[] zArr = new boolean[this.f12747f.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C3829a0[] a0VarArr = this.f12747f;
                if (i < a0VarArr.length) {
                    C3829a0 a0Var = a0VarArr[i];
                    zArr[i] = a0Var.getState() != 0;
                    if (n.f13602j.f13533b[i]) {
                        i2++;
                    }
                    if (zArr[i] && (!n.f13602j.f13533b[i] || (a0Var.mo12424r() && a0Var.mo12420n() == rVar.f13595c[i]))) {
                        m17086h(a0Var);
                    }
                    i++;
                } else {
                    this.f12766y = this.f12766y.mo13585f(n.f13602j);
                    m17092k(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    private Pair<Integer, Long> m17100o(C3844g0 g0Var, int i, long j) {
        return g0Var.mo12539i(this.f12756o, this.f12757p, i, j);
    }

    /* renamed from: o0 */
    private void m17101o0(float f) {
        for (C4259r h = this.f12764w.mo13569h(); h != null; h = h.f13601i) {
            C4234h hVar = h.f13602j;
            if (hVar != null) {
                for (C4229e eVar : hVar.f13534c.mo13358b()) {
                    if (eVar != null) {
                        eVar.mo13333h(f);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private void m17102q(C4124e eVar) {
        if (this.f12764w.mo13577v(eVar)) {
            this.f12764w.mo13578w(this.f12745I);
            m17107v();
        }
    }

    /* renamed from: r */
    private void m17103r(C4124e eVar) throws C3848h {
        if (this.f12764w.mo13577v(eVar)) {
            m17093k0(this.f12764w.mo13575r(this.f12760s.mo12458d().f13801a));
            if (!this.f12764w.mo13576s()) {
                m17062H(this.f12764w.mo13565a().f13600h.f13667b);
                m17099n0((C4259r) null);
            }
            m17107v();
        }
    }

    /* renamed from: s */
    private void m17104s() {
        m17081e0(4);
        m17061G(false, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        if (r11.mo13121b() != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        if (r11.mo13121b() != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a0, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        r0.f12766y = r10.mo13586g(r11, r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17105t(p148g.p189d.p190a.p200b.C4040l.C4042b r20) throws p148g.p189d.p190a.p200b.C3848h {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            g.d.a.b.n0.f r2 = r1.f12770a
            g.d.a.b.n0.f r3 = r0.f12767z
            if (r2 == r3) goto L_0x000b
            return
        L_0x000b:
            g.d.a.b.v r2 = r0.f12766y
            g.d.a.b.g0 r2 = r2.f13790a
            g.d.a.b.g0 r3 = r1.f12771b
            java.lang.Object r1 = r1.f12772c
            g.d.a.b.t r4 = r0.f12764w
            r4.mo13560B(r3)
            g.d.a.b.v r4 = r0.f12766y
            g.d.a.b.v r1 = r4.mo13584e(r3, r1)
            r0.f12766y = r1
            r19.m17064J()
            int r1 = r0.f12743G
            r4 = 0
            r5 = 1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            if (r1 <= 0) goto L_0x00a8
            g.d.a.b.l$d r2 = r0.f12761t
            r2.mo12914e(r1)
            r0.f12743G = r4
            g.d.a.b.l$e r1 = r0.f12744H
            if (r1 == 0) goto L_0x0064
            android.util.Pair r1 = r0.m17065K(r1, r5)
            r2 = 0
            r0.f12744H = r2
            if (r1 != 0) goto L_0x0045
            goto L_0x0072
        L_0x0045:
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r14 = r1.longValue()
            g.d.a.b.t r1 = r0.f12764w
            g.d.a.b.n0.f$b r11 = r1.mo13580y(r2, r14)
            g.d.a.b.v r10 = r0.f12766y
            boolean r1 = r11.mo13121b()
            if (r1 == 0) goto L_0x00a0
            goto L_0x009e
        L_0x0064:
            g.d.a.b.v r1 = r0.f12766y
            long r1 = r1.f13793d
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00a7
            boolean r1 = r3.mo12546p()
            if (r1 == 0) goto L_0x0076
        L_0x0072:
            r19.m17104s()
            goto L_0x00a7
        L_0x0076:
            boolean r1 = r0.f12742F
            int r1 = r3.mo12531a(r1)
            android.util.Pair r1 = r0.m17100o(r3, r1, r6)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r14 = r1.longValue()
            g.d.a.b.t r1 = r0.f12764w
            g.d.a.b.n0.f$b r11 = r1.mo13580y(r2, r14)
            g.d.a.b.v r10 = r0.f12766y
            boolean r1 = r11.mo13121b()
            if (r1 == 0) goto L_0x00a0
        L_0x009e:
            r12 = r8
            goto L_0x00a1
        L_0x00a0:
            r12 = r14
        L_0x00a1:
            g.d.a.b.v r1 = r10.mo13586g(r11, r12, r14)
            r0.f12766y = r1
        L_0x00a7:
            return
        L_0x00a8:
            g.d.a.b.v r1 = r0.f12766y
            g.d.a.b.n0.f$b r10 = r1.f13792c
            int r10 = r10.f13045a
            long r13 = r1.f13794e
            boolean r1 = r2.mo12546p()
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r3.mo12546p()
            if (r1 != 0) goto L_0x00d5
            g.d.a.b.t r1 = r0.f12764w
            g.d.a.b.n0.f$b r12 = r1.mo13580y(r10, r13)
            g.d.a.b.v r11 = r0.f12766y
            boolean r1 = r12.mo13121b()
            if (r1 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r8 = r13
        L_0x00cc:
            r1 = r13
            r13 = r8
            r15 = r1
            g.d.a.b.v r1 = r11.mo13586g(r12, r13, r15)
            r0.f12766y = r1
        L_0x00d5:
            return
        L_0x00d6:
            g.d.a.b.t r1 = r0.f12764w
            g.d.a.b.r r1 = r1.mo13569h()
            if (r1 != 0) goto L_0x00e7
            g.d.a.b.g0$b r11 = r0.f12757p
            g.d.a.b.g0$b r11 = r2.mo12537g(r10, r11, r5)
            java.lang.Object r11 = r11.f11574b
            goto L_0x00e9
        L_0x00e7:
            java.lang.Object r11 = r1.f13594b
        L_0x00e9:
            int r11 = r3.mo12532b(r11)
            r12 = -1
            if (r11 != r12) goto L_0x015b
            int r2 = r0.m17066L(r10, r2, r3)
            if (r2 != r12) goto L_0x00fa
            r19.m17104s()
            return
        L_0x00fa:
            g.d.a.b.g0$b r4 = r0.f12757p
            g.d.a.b.g0$b r2 = r3.mo12536f(r2, r4)
            int r2 = r2.f11575c
            android.util.Pair r2 = r0.m17100o(r3, r2, r6)
            java.lang.Object r4 = r2.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            g.d.a.b.t r2 = r0.f12764w
            g.d.a.b.n0.f$b r14 = r2.mo13580y(r4, r6)
            g.d.a.b.g0$b r2 = r0.f12757p
            r3.mo12537g(r4, r2, r5)
            if (r1 == 0) goto L_0x0144
            g.d.a.b.g0$b r2 = r0.f12757p
            java.lang.Object r2 = r2.f11574b
        L_0x0127:
            g.d.a.b.s r3 = r1.f13600h
            g.d.a.b.s r3 = r3.mo13505a(r12)
        L_0x012d:
            r1.f13600h = r3
            g.d.a.b.r r1 = r1.f13601i
            if (r1 == 0) goto L_0x0144
            java.lang.Object r3 = r1.f13594b
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0127
            g.d.a.b.t r3 = r0.f12764w
            g.d.a.b.s r5 = r1.f13600h
            g.d.a.b.s r3 = r3.mo13574p(r5, r4)
            goto L_0x012d
        L_0x0144:
            boolean r1 = r14.mo13121b()
            if (r1 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r8 = r6
        L_0x014c:
            long r15 = r0.m17070Q(r14, r8)
            g.d.a.b.v r13 = r0.f12766y
            r17 = r6
            g.d.a.b.v r1 = r13.mo13586g(r14, r15, r17)
        L_0x0158:
            r0.f12766y = r1
            return
        L_0x015b:
            if (r11 == r10) goto L_0x0165
            g.d.a.b.v r1 = r0.f12766y
            g.d.a.b.v r1 = r1.mo13582c(r11)
            r0.f12766y = r1
        L_0x0165:
            g.d.a.b.v r1 = r0.f12766y
            g.d.a.b.n0.f$b r1 = r1.f13792c
            boolean r2 = r1.mo13121b()
            if (r2 == 0) goto L_0x0191
            g.d.a.b.t r2 = r0.f12764w
            g.d.a.b.n0.f$b r12 = r2.mo13580y(r11, r13)
            boolean r2 = r12.equals(r1)
            if (r2 != 0) goto L_0x0191
            boolean r1 = r12.mo13121b()
            if (r1 == 0) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r8 = r13
        L_0x0183:
            long r1 = r0.m17070Q(r12, r8)
            g.d.a.b.v r11 = r0.f12766y
            r3 = r13
            r13 = r1
            r15 = r3
            g.d.a.b.v r1 = r11.mo13586g(r12, r13, r15)
            goto L_0x0158
        L_0x0191:
            g.d.a.b.t r2 = r0.f12764w
            long r5 = r0.f12745I
            boolean r1 = r2.mo13562E(r1, r5)
            if (r1 != 0) goto L_0x019e
            r0.m17068O(r4)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.C4040l.m17105t(g.d.a.b.l$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r0 = r0.f13601i;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17106u() {
        /*
            r6 = this;
            g.d.a.b.t r0 = r6.f12764w
            g.d.a.b.r r0 = r0.mo13572n()
            g.d.a.b.s r1 = r0.f13600h
            long r1 = r1.f13670e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0030
            g.d.a.b.v r3 = r6.f12766y
            long r3 = r3.f13798i
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0030
            g.d.a.b.r r0 = r0.f13601i
            if (r0 == 0) goto L_0x002e
            boolean r1 = r0.f13598f
            if (r1 != 0) goto L_0x0030
            g.d.a.b.s r0 = r0.f13600h
            g.d.a.b.n0.f$b r0 = r0.f13666a
            boolean r0 = r0.mo13121b()
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.C4040l.m17106u():boolean");
    }

    /* renamed from: v */
    private void m17107v() {
        C4259r i = this.f12764w.mo13570i();
        long i2 = i.mo13402i();
        if (i2 == Long.MIN_VALUE) {
            m17075V(false);
            return;
        }
        boolean c = this.f12751j.mo12447c(i2 - i.mo13409p(this.f12745I), this.f12760s.mo12458d().f13801a);
        m17075V(c);
        if (c) {
            i.mo13400d(this.f12745I);
        }
    }

    /* renamed from: w */
    private void m17108w() {
        if (this.f12761t.mo12913d(this.f12766y)) {
            this.f12754m.obtainMessage(0, this.f12761t.f12778b, this.f12761t.f12779c ? this.f12761t.f12780d : -1, this.f12766y).sendToTarget();
            this.f12761t.mo12915f(this.f12766y);
        }
    }

    /* renamed from: x */
    private void m17109x() throws IOException {
        C4259r i = this.f12764w.mo13570i();
        C4259r o = this.f12764w.mo13573o();
        if (i != null && !i.f13598f) {
            if (o == null || o.f13601i == i) {
                C3829a0[] a0VarArr = this.f12737A;
                int length = a0VarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (a0VarArr[i2].mo12417j()) {
                        i2++;
                    } else {
                        return;
                    }
                }
                i.f13593a.mo13081p();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r6.f12746J < r6.f12762u.size()) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1 = r6.f12762u.get(r6.f12746J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r1 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r1.f12776i == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        r3 = r1.f12774g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r3 < r0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r3 != r0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r1.f12775h > r7) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r1 = r6.f12746J + 1;
        r6.f12746J = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r1 >= r6.f12762u.size()) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r1 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r1.f12776i == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        if (r1.f12774g != r0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        r3 = r1.f12775h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        if (r3 <= r7) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        if (r3 > r9) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        m17073T(r1.f12773f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r1.f12773f.mo13597b() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r6.f12762u.remove(r6.f12746J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00af, code lost:
        r6.f12746J++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        if (r6.f12746J >= r6.f12762u.size()) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        r1 = r6.f12762u.get(r6.f12746J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17110y(long r7, long r9) throws p148g.p189d.p190a.p200b.C3848h {
        /*
            r6 = this;
            java.util.ArrayList<g.d.a.b.l$c> r0 = r6.f12762u
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00cc
            g.d.a.b.v r0 = r6.f12766y
            g.d.a.b.n0.f$b r0 = r0.f13792c
            boolean r0 = r0.mo13121b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00cc
        L_0x0014:
            g.d.a.b.v r0 = r6.f12766y
            long r0 = r0.f13793d
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x001f
            r0 = 1
            long r7 = r7 - r0
        L_0x001f:
            g.d.a.b.v r0 = r6.f12766y
            g.d.a.b.n0.f$b r0 = r0.f13792c
            int r0 = r0.f13045a
            int r1 = r6.f12746J
            r2 = 0
            if (r1 <= 0) goto L_0x0035
            java.util.ArrayList<g.d.a.b.l$c> r3 = r6.f12762u
        L_0x002c:
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            g.d.a.b.l$c r1 = (p148g.p189d.p190a.p200b.C4040l.C4043c) r1
            goto L_0x0036
        L_0x0035:
            r1 = r2
        L_0x0036:
            if (r1 == 0) goto L_0x004f
            int r3 = r1.f12774g
            if (r3 > r0) goto L_0x0044
            if (r3 != r0) goto L_0x004f
            long r3 = r1.f12775h
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x004f
        L_0x0044:
            int r1 = r6.f12746J
            int r1 = r1 + -1
            r6.f12746J = r1
            if (r1 <= 0) goto L_0x0035
            java.util.ArrayList<g.d.a.b.l$c> r3 = r6.f12762u
            goto L_0x002c
        L_0x004f:
            int r1 = r6.f12746J
            java.util.ArrayList<g.d.a.b.l$c> r3 = r6.f12762u
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0064
        L_0x0059:
            java.util.ArrayList<g.d.a.b.l$c> r1 = r6.f12762u
            int r3 = r6.f12746J
            java.lang.Object r1 = r1.get(r3)
            g.d.a.b.l$c r1 = (p148g.p189d.p190a.p200b.C4040l.C4043c) r1
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            if (r1 == 0) goto L_0x0086
            java.lang.Object r3 = r1.f12776i
            if (r3 == 0) goto L_0x0086
            int r3 = r1.f12774g
            if (r3 < r0) goto L_0x0077
            if (r3 != r0) goto L_0x0086
            long r3 = r1.f12775h
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0086
        L_0x0077:
            int r1 = r6.f12746J
            int r1 = r1 + 1
            r6.f12746J = r1
            java.util.ArrayList<g.d.a.b.l$c> r3 = r6.f12762u
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0064
            goto L_0x0059
        L_0x0086:
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r3 = r1.f12776i
            if (r3 == 0) goto L_0x00cc
            int r3 = r1.f12774g
            if (r3 != r0) goto L_0x00cc
            long r3 = r1.f12775h
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cc
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x00cc
            g.d.a.b.z r3 = r1.f12773f
            r6.m17073T(r3)
            g.d.a.b.z r1 = r1.f12773f
            boolean r1 = r1.mo13597b()
            if (r1 == 0) goto L_0x00af
            java.util.ArrayList<g.d.a.b.l$c> r1 = r6.f12762u
            int r3 = r6.f12746J
            r1.remove(r3)
            goto L_0x00b5
        L_0x00af:
            int r1 = r6.f12746J
            int r1 = r1 + 1
            r6.f12746J = r1
        L_0x00b5:
            int r1 = r6.f12746J
            java.util.ArrayList<g.d.a.b.l$c> r3 = r6.f12762u
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00ca
            java.util.ArrayList<g.d.a.b.l$c> r1 = r6.f12762u
            int r3 = r6.f12746J
            java.lang.Object r1 = r1.get(r3)
            g.d.a.b.l$c r1 = (p148g.p189d.p190a.p200b.C4040l.C4043c) r1
            goto L_0x0086
        L_0x00ca:
            r1 = r2
            goto L_0x0086
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.C4040l.m17110y(long, long):void");
    }

    /* renamed from: z */
    private void m17111z() throws IOException {
        this.f12764w.mo13578w(this.f12745I);
        if (this.f12764w.mo13561C()) {
            C4287s m = this.f12764w.mo13571m(this.f12745I, this.f12766y);
            if (m == null) {
                this.f12767z.mo13114b();
                return;
            }
            this.f12764w.mo13568e(this.f12748g, 60000000, this.f12749h, this.f12751j.mo12450f(), this.f12767z, this.f12766y.f13790a.mo12537g(m.f13666a.f13045a, this.f12757p, true).f11574b, m).mo13077j(this, m.f13667b);
            m17075V(true);
        }
    }

    /* renamed from: A */
    public void mo12906e(C4124e eVar) {
        this.f12752k.mo13424f(10, eVar).sendToTarget();
    }

    /* renamed from: B */
    public void mo12898B(C4126f fVar, boolean z, boolean z2) {
        this.f12752k.mo13421c(0, z ? 1 : 0, z2 ? 1 : 0, fVar).sendToTarget();
    }

    /* renamed from: N */
    public void mo12899N(C3844g0 g0Var, int i, long j) {
        this.f12752k.mo13424f(3, new C4045e(g0Var, i, j)).sendToTarget();
    }

    /* renamed from: W */
    public void mo12900W(boolean z) {
        this.f12752k.mo13419a(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: Z */
    public void mo12901Z(int i) {
        this.f12752k.mo13419a(12, i, 0).sendToTarget();
    }

    /* renamed from: a */
    public synchronized void mo12902a(C4322z zVar) {
        if (this.f12738B) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zVar.mo13605j(false);
            return;
        }
        this.f12752k.mo13424f(14, zVar).sendToTarget();
    }

    /* renamed from: b */
    public void mo12466b(C4315w wVar) {
        this.f12754m.obtainMessage(1, wVar).sendToTarget();
        m17101o0(wVar.f13801a);
    }

    /* renamed from: c */
    public void mo12903c(C4126f fVar, C3844g0 g0Var, Object obj) {
        this.f12752k.mo13424f(8, new C4042b(fVar, g0Var, obj)).sendToTarget();
    }

    /* renamed from: c0 */
    public void mo12904c0(boolean z) {
        this.f12752k.mo13419a(13, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: d */
    public void mo12905d(C4124e eVar) {
        this.f12752k.mo13424f(9, eVar).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        Handler handler;
        try {
            switch (message.what) {
                case 0:
                    m17057C((C4126f) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    m17076X(message.arg1 != 0);
                    break;
                case 2:
                    m17088i();
                    break;
                case 3:
                    m17069P((C4045e) message.obj);
                    break;
                case 4:
                    m17077Y((C4315w) message.obj);
                    break;
                case 5:
                    m17079b0((C3837e0) message.obj);
                    break;
                case 6:
                    m17089i0(message.arg1 != 0, true);
                    break;
                case 7:
                    m17058D();
                    return true;
                case 8:
                    m17105t((C4042b) message.obj);
                    break;
                case 9:
                    m17103r((C4124e) message.obj);
                    break;
                case 10:
                    m17102q((C4124e) message.obj);
                    break;
                case 11:
                    m17060F();
                    break;
                case 12:
                    m17078a0(message.arg1);
                    break;
                case 13:
                    m17080d0(message.arg1 != 0);
                    break;
                case 14:
                    m17072S((C4322z) message.obj);
                    break;
                case 15:
                    m17074U((C4322z) message.obj);
                    break;
                default:
                    return false;
            }
            m17108w();
        } catch (C3848h e) {
            e = e;
            Log.e("ExoPlayerImplInternal", "Playback error.", e);
            m17089i0(false, false);
            handler = this.f12754m;
            handler.obtainMessage(2, e).sendToTarget();
            m17108w();
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            m17089i0(false, false);
            handler = this.f12754m;
            e = C3848h.m16075b(e2);
            handler.obtainMessage(2, e).sendToTarget();
            m17108w();
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            m17089i0(false, false);
            handler = this.f12754m;
            e = C3848h.m16076c(e3);
            handler.obtainMessage(2, e).sendToTarget();
            m17108w();
            return true;
        }
        return true;
    }

    /* renamed from: p */
    public Looper mo12908p() {
        return this.f12753l.getLooper();
    }
}
