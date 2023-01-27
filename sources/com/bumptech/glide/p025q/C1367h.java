package com.bumptech.glide.p025q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C0967d;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.p008o.C1116k;
import com.bumptech.glide.load.p008o.C1134q;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p014q.p017f.C1286a;
import com.bumptech.glide.p025q.p026j.C1376g;
import com.bumptech.glide.p025q.p026j.C1377h;
import com.bumptech.glide.p025q.p027k.C1385c;
import com.bumptech.glide.p029s.C1397f;
import com.bumptech.glide.p029s.C1402k;
import com.bumptech.glide.p029s.p030l.C1413c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.q.h */
public final class C1367h<R> implements C1361c, C1376g, C1366g {

    /* renamed from: D */
    private static final boolean f4711D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f4712A;

    /* renamed from: B */
    private boolean f4713B;

    /* renamed from: C */
    private RuntimeException f4714C;

    /* renamed from: a */
    private final String f4715a;

    /* renamed from: b */
    private final C1413c f4716b;

    /* renamed from: c */
    private final Object f4717c;

    /* renamed from: d */
    private final C1364e<R> f4718d;

    /* renamed from: e */
    private final C1362d f4719e;

    /* renamed from: f */
    private final Context f4720f;

    /* renamed from: g */
    private final C0967d f4721g;

    /* renamed from: h */
    private final Object f4722h;

    /* renamed from: i */
    private final Class<R> f4723i;

    /* renamed from: j */
    private final C1359a<?> f4724j;

    /* renamed from: k */
    private final int f4725k;

    /* renamed from: l */
    private final int f4726l;

    /* renamed from: m */
    private final C0969f f4727m;

    /* renamed from: n */
    private final C1377h<R> f4728n;

    /* renamed from: o */
    private final List<C1364e<R>> f4729o;

    /* renamed from: p */
    private final C1385c<? super R> f4730p;

    /* renamed from: q */
    private final Executor f4731q;

    /* renamed from: r */
    private C1141v<R> f4732r;

    /* renamed from: s */
    private C1116k.C1122d f4733s;

    /* renamed from: t */
    private long f4734t;

    /* renamed from: u */
    private volatile C1116k f4735u;

    /* renamed from: v */
    private C1368a f4736v;

    /* renamed from: w */
    private Drawable f4737w;

    /* renamed from: x */
    private Drawable f4738x;

    /* renamed from: y */
    private Drawable f4739y;

    /* renamed from: z */
    private int f4740z;

    /* renamed from: com.bumptech.glide.q.h$a */
    private enum C1368a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C1367h(Context context, C0967d dVar, Object obj, Object obj2, Class<R> cls, C1359a<?> aVar, int i, int i2, C0969f fVar, C1377h<R> hVar, C1364e<R> eVar, List<C1364e<R>> list, C1362d dVar2, C1116k kVar, C1385c<? super R> cVar, Executor executor) {
        this.f4715a = f4711D ? String.valueOf(super.hashCode()) : null;
        this.f4716b = C1413c.m7013a();
        this.f4717c = obj;
        this.f4720f = context;
        this.f4721g = dVar;
        this.f4722h = obj2;
        this.f4723i = cls;
        this.f4724j = aVar;
        this.f4725k = i;
        this.f4726l = i2;
        this.f4727m = fVar;
        this.f4728n = hVar;
        this.f4718d = eVar;
        this.f4729o = list;
        this.f4719e = dVar2;
        this.f4735u = kVar;
        this.f4730p = cVar;
        this.f4731q = executor;
        this.f4736v = C1368a.PENDING;
        if (this.f4714C == null && dVar.mo5063i()) {
            this.f4714C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: A */
    private void m6826A() {
        if (m6829l()) {
            Drawable drawable = null;
            if (this.f4722h == null) {
                drawable = m6833p();
            }
            if (drawable == null) {
                drawable = m6832o();
            }
            if (drawable == null) {
                drawable = m6834q();
            }
            this.f4728n.mo5837d(drawable);
        }
    }

    /* renamed from: i */
    private void m6827i() {
        if (this.f4713B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m6828k() {
        C1362d dVar = this.f4719e;
        return dVar == null || dVar.mo5829k(this);
    }

    /* renamed from: l */
    private boolean m6829l() {
        C1362d dVar = this.f4719e;
        return dVar == null || dVar.mo5819c(this);
    }

    /* renamed from: m */
    private boolean m6830m() {
        C1362d dVar = this.f4719e;
        return dVar == null || dVar.mo5821d(this);
    }

    /* renamed from: n */
    private void m6831n() {
        m6827i();
        this.f4716b.mo5911c();
        this.f4728n.mo5841b(this);
        C1116k.C1122d dVar = this.f4733s;
        if (dVar != null) {
            dVar.mo5391a();
            this.f4733s = null;
        }
    }

    /* renamed from: o */
    private Drawable m6832o() {
        if (this.f4737w == null) {
            Drawable n = this.f4724j.mo5804n();
            this.f4737w = n;
            if (n == null && this.f4724j.mo5801l() > 0) {
                this.f4737w = m6836s(this.f4724j.mo5801l());
            }
        }
        return this.f4737w;
    }

    /* renamed from: p */
    private Drawable m6833p() {
        if (this.f4739y == null) {
            Drawable p = this.f4724j.mo5807p();
            this.f4739y = p;
            if (p == null && this.f4724j.mo5808q() > 0) {
                this.f4739y = m6836s(this.f4724j.mo5808q());
            }
        }
        return this.f4739y;
    }

    /* renamed from: q */
    private Drawable m6834q() {
        if (this.f4738x == null) {
            Drawable v = this.f4724j.mo5813v();
            this.f4738x = v;
            if (v == null && this.f4724j.mo5814x() > 0) {
                this.f4738x = m6836s(this.f4724j.mo5814x());
            }
        }
        return this.f4738x;
    }

    /* renamed from: r */
    private boolean m6835r() {
        C1362d dVar = this.f4719e;
        return dVar == null || !dVar.mo5818b();
    }

    /* renamed from: s */
    private Drawable m6836s(int i) {
        return C1286a.m6449a(this.f4721g, i, this.f4724j.mo5769C() != null ? this.f4724j.mo5769C() : this.f4720f.getTheme());
    }

    /* renamed from: t */
    private void m6837t(String str) {
        Log.v("Request", str + " this: " + this.f4715a);
    }

    /* renamed from: u */
    private static int m6838u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: v */
    private void m6839v() {
        C1362d dVar = this.f4719e;
        if (dVar != null) {
            dVar.mo5817a(this);
        }
    }

    /* renamed from: w */
    private void m6840w() {
        C1362d dVar = this.f4719e;
        if (dVar != null) {
            dVar.mo5826i(this);
        }
    }

    /* renamed from: x */
    public static <R> C1367h<R> m6841x(Context context, C0967d dVar, Object obj, Object obj2, Class<R> cls, C1359a<?> aVar, int i, int i2, C0969f fVar, C1377h<R> hVar, C1364e<R> eVar, List<C1364e<R>> list, C1362d dVar2, C1116k kVar, C1385c<? super R> cVar, Executor executor) {
        return new C1367h(context, dVar, obj, obj2, cls, aVar, i, i2, fVar, hVar, eVar, list, dVar2, kVar, cVar, executor);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y */
    private void m6842y(C1134q qVar, int i) {
        boolean z;
        this.f4716b.mo5911c();
        synchronized (this.f4717c) {
            qVar.mo5435l(this.f4714C);
            int g = this.f4721g.mo5061g();
            if (g <= i) {
                Log.w("Glide", "Load failed for " + this.f4722h + " with size [" + this.f4740z + "x" + this.f4712A + "]", qVar);
                if (g <= 4) {
                    qVar.mo5431g("Glide");
                }
            }
            this.f4733s = null;
            this.f4736v = C1368a.FAILED;
            boolean z2 = true;
            this.f4713B = true;
            try {
                if (this.f4729o != null) {
                    z = false;
                    for (C1364e<R> b : this.f4729o) {
                        z |= b.mo514b(qVar, this.f4722h, this.f4728n, m6835r());
                    }
                } else {
                    z = false;
                }
                if (this.f4718d == null || !this.f4718d.mo514b(qVar, this.f4722h, this.f4728n, m6835r())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m6826A();
                }
                this.f4713B = false;
                m6839v();
            } catch (Throwable th) {
                this.f4713B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab A[Catch:{ all -> 0x00bc }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6843z(com.bumptech.glide.load.p008o.C1141v<R> r11, R r12, com.bumptech.glide.load.C0992a r13) {
        /*
            r10 = this;
            boolean r6 = r10.m6835r()
            com.bumptech.glide.q.h$a r0 = com.bumptech.glide.p025q.C1367h.C1368a.COMPLETE
            r10.f4736v = r0
            r10.f4732r = r11
            com.bumptech.glide.d r11 = r10.f4721g
            int r11 = r11.mo5061g()
            r0 = 3
            if (r11 > r0) goto L_0x006a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f4722h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f4740z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f4712A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f4734t
            double r0 = com.bumptech.glide.p029s.C1397f.m6955a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x006a:
            r11 = 1
            r10.f4713B = r11
            r7 = 0
            java.util.List<com.bumptech.glide.q.e<R>> r0 = r10.f4729o     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0092
            java.util.List<com.bumptech.glide.q.e<R>> r0 = r10.f4729o     // Catch:{ all -> 0x00bc }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00bc }
            r9 = 0
        L_0x0079:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.q.e r0 = (com.bumptech.glide.p025q.C1364e) r0     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.f4722h     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.q.j.h<R> r3 = r10.f4728n     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo513a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            r9 = r9 | r0
            goto L_0x0079
        L_0x0092:
            r9 = 0
        L_0x0093:
            com.bumptech.glide.q.e<R> r0 = r10.f4718d     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            com.bumptech.glide.q.e<R> r0 = r10.f4718d     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.f4722h     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.q.j.h<R> r3 = r10.f4728n     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo513a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b6
            com.bumptech.glide.q.k.c<? super R> r11 = r10.f4730p     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.q.k.b r11 = r11.mo5855a(r13, r6)     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.q.j.h<R> r13 = r10.f4728n     // Catch:{ all -> 0x00bc }
            r13.mo5661c(r12, r11)     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            r10.f4713B = r7
            r10.m6840w()
            return
        L_0x00bc:
            r11 = move-exception
            r10.f4713B = r7
            goto L_0x00c1
        L_0x00c0:
            throw r11
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1367h.m6843z(com.bumptech.glide.load.o.v, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    /* renamed from: a */
    public void mo5832a(C1134q qVar) {
        m6842y(qVar, 5);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.bumptech.glide.load.o.k$d, com.bumptech.glide.load.o.v<R>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.bumptech.glide.load.o.v] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.f4735u.mo5386k(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5833b(com.bumptech.glide.load.p008o.C1141v<?> r6, com.bumptech.glide.load.C0992a r7) {
        /*
            r5 = this;
            com.bumptech.glide.s.l.c r0 = r5.f4716b
            r0.mo5911c()
            r0 = 0
            java.lang.Object r1 = r5.f4717c     // Catch:{ all -> 0x00b9 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b9 }
            r5.f4733s = r0     // Catch:{ all -> 0x00b6 }
            if (r6 != 0) goto L_0x002f
            com.bumptech.glide.load.o.q r6 = new com.bumptech.glide.load.o.q     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.Class<R> r2 = r5.f4723i     // Catch:{ all -> 0x00b6 }
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b6 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b6 }
            r5.mo5832a(r6)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x002f:
            java.lang.Object r2 = r6.get()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x005c
            java.lang.Class<R> r3 = r5.f4723i     // Catch:{ all -> 0x00b6 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b6 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0042
            goto L_0x005c
        L_0x0042:
            boolean r3 = r5.m6830m()     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0057
            r5.f4732r = r0     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.q.h$a r7 = com.bumptech.glide.p025q.C1367h.C1368a.COMPLETE     // Catch:{ all -> 0x00b2 }
            r5.f4736v = r7     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0056
            com.bumptech.glide.load.o.k r7 = r5.f4735u
            r7.mo5386k(r6)
        L_0x0056:
            return
        L_0x0057:
            r5.m6843z(r6, r2, r7)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x005c:
            r5.f4732r = r0     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.load.o.q r7 = new com.bumptech.glide.load.o.q     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r0.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "Expected to receive an object of "
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Class<R> r3 = r5.f4723i     // Catch:{ all -> 0x00b2 }
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x007b
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r3 = ""
        L_0x007d:
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            r0.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = ""
            goto L_0x009c
        L_0x009a:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x009c:
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b2 }
            r7.<init>(r0)     // Catch:{ all -> 0x00b2 }
            r5.mo5832a(r7)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x00b1
            com.bumptech.glide.load.o.k r7 = r5.f4735u
            r7.mo5386k(r6)
        L_0x00b1:
            return
        L_0x00b2:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x00b7
        L_0x00b6:
            r6 = move-exception
        L_0x00b7:
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            throw r6     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r6 = move-exception
            if (r0 == 0) goto L_0x00c1
            com.bumptech.glide.load.o.k r7 = r5.f4735u
            r7.mo5386k(r0)
        L_0x00c1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1367h.mo5833b(com.bumptech.glide.load.o.v, com.bumptech.glide.load.a):void");
    }

    /* renamed from: c */
    public Object mo5834c() {
        this.f4716b.mo5911c();
        return this.f4717c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4.f4735u.mo5386k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4717c
            monitor-enter(r0)
            r4.m6827i()     // Catch:{ all -> 0x003c }
            com.bumptech.glide.s.l.c r1 = r4.f4716b     // Catch:{ all -> 0x003c }
            r1.mo5911c()     // Catch:{ all -> 0x003c }
            com.bumptech.glide.q.h$a r1 = r4.f4736v     // Catch:{ all -> 0x003c }
            com.bumptech.glide.q.h$a r2 = com.bumptech.glide.p025q.C1367h.C1368a.CLEARED     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0013:
            r4.m6831n()     // Catch:{ all -> 0x003c }
            com.bumptech.glide.load.o.v<R> r1 = r4.f4732r     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            com.bumptech.glide.load.o.v<R> r1 = r4.f4732r     // Catch:{ all -> 0x003c }
            r4.f4732r = r2     // Catch:{ all -> 0x003c }
            r2 = r1
        L_0x0020:
            boolean r1 = r4.m6828k()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            com.bumptech.glide.q.j.h<R> r1 = r4.f4728n     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r3 = r4.m6834q()     // Catch:{ all -> 0x003c }
            r1.mo5662h(r3)     // Catch:{ all -> 0x003c }
        L_0x002f:
            com.bumptech.glide.q.h$a r1 = com.bumptech.glide.p025q.C1367h.C1368a.CLEARED     // Catch:{ all -> 0x003c }
            r4.f4736v = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003b
            com.bumptech.glide.load.o.k r0 = r4.f4735u
            r0.mo5386k(r2)
        L_0x003b:
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1367h.clear():void");
    }

    /* renamed from: d */
    public void mo5835d(int i, int i2) {
        Object obj;
        this.f4716b.mo5911c();
        Object obj2 = this.f4717c;
        synchronized (obj2) {
            try {
                if (f4711D) {
                    m6837t("Got onSizeReady in " + C1397f.m6955a(this.f4734t));
                }
                if (this.f4736v == C1368a.WAITING_FOR_SIZE) {
                    this.f4736v = C1368a.RUNNING;
                    float B = this.f4724j.mo5768B();
                    this.f4740z = m6838u(i, B);
                    this.f4712A = m6838u(i2, B);
                    if (f4711D) {
                        m6837t("finished setup for calling load in " + C1397f.m6955a(this.f4734t));
                    }
                    obj = obj2;
                    try {
                        this.f4733s = this.f4735u.mo5385f(this.f4721g, this.f4722h, this.f4724j.mo5767A(), this.f4740z, this.f4712A, this.f4724j.mo5816z(), this.f4723i, this.f4727m, this.f4724j.mo5799k(), this.f4724j.mo5770D(), this.f4724j.mo5777N(), this.f4724j.mo5775J(), this.f4724j.mo5810s(), this.f4724j.mo5773G(), this.f4724j.mo5772F(), this.f4724j.mo5771E(), this.f4724j.mo5809r(), this, this.f4731q);
                        if (this.f4736v != C1368a.RUNNING) {
                            this.f4733s = null;
                        }
                        if (f4711D) {
                            m6837t("finished onSizeReady in " + C1397f.m6955a(this.f4734t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void mo5822e() {
        synchronized (this.f4717c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: f */
    public boolean mo5823f(C1361c cVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C1359a<?> aVar;
        C0969f fVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C1359a<?> aVar2;
        C0969f fVar2;
        int size2;
        C1361c cVar2 = cVar;
        if (!(cVar2 instanceof C1367h)) {
            return false;
        }
        synchronized (this.f4717c) {
            i = this.f4725k;
            i2 = this.f4726l;
            obj = this.f4722h;
            cls = this.f4723i;
            aVar = this.f4724j;
            fVar = this.f4727m;
            size = this.f4729o != null ? this.f4729o.size() : 0;
        }
        C1367h hVar = (C1367h) cVar2;
        synchronized (hVar.f4717c) {
            i3 = hVar.f4725k;
            i4 = hVar.f4726l;
            obj2 = hVar.f4722h;
            cls2 = hVar.f4723i;
            aVar2 = hVar.f4724j;
            fVar2 = hVar.f4727m;
            size2 = hVar.f4729o != null ? hVar.f4729o.size() : 0;
        }
        return i == i3 && i2 == i4 && C1402k.m6975b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2;
    }

    /* renamed from: g */
    public boolean mo5824g() {
        boolean z;
        synchronized (this.f4717c) {
            z = this.f4736v == C1368a.CLEARED;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5825h() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4717c
            monitor-enter(r0)
            r4.m6827i()     // Catch:{ all -> 0x00af }
            com.bumptech.glide.s.l.c r1 = r4.f4716b     // Catch:{ all -> 0x00af }
            r1.mo5911c()     // Catch:{ all -> 0x00af }
            long r1 = com.bumptech.glide.p029s.C1397f.m6956b()     // Catch:{ all -> 0x00af }
            r4.f4734t = r1     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r4.f4722h     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x003c
            int r1 = r4.f4725k     // Catch:{ all -> 0x00af }
            int r2 = r4.f4726l     // Catch:{ all -> 0x00af }
            boolean r1 = com.bumptech.glide.p029s.C1402k.m6991r(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0027
            int r1 = r4.f4725k     // Catch:{ all -> 0x00af }
            r4.f4740z = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.f4726l     // Catch:{ all -> 0x00af }
            r4.f4712A = r1     // Catch:{ all -> 0x00af }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r4.m6833p()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.o.q r2 = new com.bumptech.glide.load.o.q     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            r4.m6842y(r2, r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x003c:
            com.bumptech.glide.q.h$a r1 = r4.f4736v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.q.h$a r2 = com.bumptech.glide.p025q.C1367h.C1368a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x00a7
            com.bumptech.glide.q.h$a r1 = r4.f4736v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.q.h$a r2 = com.bumptech.glide.p025q.C1367h.C1368a.COMPLETE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0051
            com.bumptech.glide.load.o.v<R> r1 = r4.f4732r     // Catch:{ all -> 0x00af }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.C0992a.MEMORY_CACHE     // Catch:{ all -> 0x00af }
            r4.mo5833b(r1, r2)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0051:
            com.bumptech.glide.q.h$a r1 = com.bumptech.glide.p025q.C1367h.C1368a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            r4.f4736v = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.f4725k     // Catch:{ all -> 0x00af }
            int r2 = r4.f4726l     // Catch:{ all -> 0x00af }
            boolean r1 = com.bumptech.glide.p029s.C1402k.m6991r(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0067
            int r1 = r4.f4725k     // Catch:{ all -> 0x00af }
            int r2 = r4.f4726l     // Catch:{ all -> 0x00af }
            r4.mo5835d(r1, r2)     // Catch:{ all -> 0x00af }
            goto L_0x006c
        L_0x0067:
            com.bumptech.glide.q.j.h<R> r1 = r4.f4728n     // Catch:{ all -> 0x00af }
            r1.mo5843i(r4)     // Catch:{ all -> 0x00af }
        L_0x006c:
            com.bumptech.glide.q.h$a r1 = r4.f4736v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.q.h$a r2 = com.bumptech.glide.p025q.C1367h.C1368a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x0078
            com.bumptech.glide.q.h$a r1 = r4.f4736v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.q.h$a r2 = com.bumptech.glide.p025q.C1367h.C1368a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0087
        L_0x0078:
            boolean r1 = r4.m6829l()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0087
            com.bumptech.glide.q.j.h<R> r1 = r4.f4728n     // Catch:{ all -> 0x00af }
            android.graphics.drawable.Drawable r2 = r4.m6834q()     // Catch:{ all -> 0x00af }
            r1.mo5838f(r2)     // Catch:{ all -> 0x00af }
        L_0x0087:
            boolean r1 = f4711D     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            long r2 = r4.f4734t     // Catch:{ all -> 0x00af }
            double r2 = com.bumptech.glide.p029s.C1397f.m6955a(r2)     // Catch:{ all -> 0x00af }
            r1.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00af }
            r4.m6837t(r1)     // Catch:{ all -> 0x00af }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1367h.mo5825h():void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f4717c) {
            if (this.f4736v != C1368a.RUNNING) {
                if (this.f4736v != C1368a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo5828j() {
        boolean z;
        synchronized (this.f4717c) {
            z = this.f4736v == C1368a.COMPLETE;
        }
        return z;
    }
}
