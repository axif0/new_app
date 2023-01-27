package p148g.p189d.p296d.p318x.p319d;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.x.d.c */
final class C5499c {

    /* renamed from: a */
    private final C5412b f15906a;

    /* renamed from: b */
    private final C5383o f15907b;

    /* renamed from: c */
    private final C5383o f15908c;

    /* renamed from: d */
    private final C5383o f15909d;

    /* renamed from: e */
    private final C5383o f15910e;

    /* renamed from: f */
    private final int f15911f;

    /* renamed from: g */
    private final int f15912g;

    /* renamed from: h */
    private final int f15913h;

    /* renamed from: i */
    private final int f15914i;

    C5499c(C5412b bVar, C5383o oVar, C5383o oVar2, C5383o oVar3, C5383o oVar4) throws C5377i {
        boolean z = false;
        boolean z2 = oVar == null || oVar2 == null;
        z = (oVar3 == null || oVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                oVar = new C5383o(0.0f, oVar3.mo15619d());
                oVar2 = new C5383o(0.0f, oVar4.mo15619d());
            } else if (z) {
                oVar3 = new C5383o((float) (bVar.mo15673n() - 1), oVar.mo15619d());
                oVar4 = new C5383o((float) (bVar.mo15673n() - 1), oVar2.mo15619d());
            }
            this.f15906a = bVar;
            this.f15907b = oVar;
            this.f15908c = oVar2;
            this.f15909d = oVar3;
            this.f15910e = oVar4;
            this.f15911f = (int) Math.min(oVar.mo15618c(), oVar2.mo15618c());
            this.f15912g = (int) Math.max(oVar3.mo15618c(), oVar4.mo15618c());
            this.f15913h = (int) Math.min(oVar.mo15619d(), oVar3.mo15619d());
            this.f15914i = (int) Math.max(oVar2.mo15619d(), oVar4.mo15619d());
            return;
        }
        throw C5377i.m22193a();
    }

    C5499c(C5499c cVar) {
        this.f15906a = cVar.f15906a;
        this.f15907b = cVar.mo15854h();
        this.f15908c = cVar.mo15848b();
        this.f15909d = cVar.mo15855i();
        this.f15910e = cVar.mo15849c();
        this.f15911f = cVar.mo15852f();
        this.f15912g = cVar.mo15850d();
        this.f15913h = cVar.mo15853g();
        this.f15914i = cVar.mo15851e();
    }

    /* renamed from: j */
    static C5499c m22697j(C5499c cVar, C5499c cVar2) throws C5377i {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C5499c(cVar.f15906a, cVar.f15907b, cVar.f15908c, cVar2.f15909d, cVar2.f15910e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p148g.p189d.p296d.p318x.p319d.C5499c mo15847a(int r13, int r14, boolean r15) throws p148g.p189d.p296d.C5377i {
        /*
            r12 = this;
            g.d.d.o r0 = r12.f15907b
            g.d.d.o r1 = r12.f15908c
            g.d.d.o r2 = r12.f15909d
            g.d.d.o r3 = r12.f15910e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo15619d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            g.d.d.o r13 = new g.d.d.o
            float r4 = r4.mo15618c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            g.d.d.o r13 = r12.f15908c
            goto L_0x0034
        L_0x0032:
            g.d.d.o r13 = r12.f15910e
        L_0x0034:
            float r0 = r13.mo15619d()
            int r0 = (int) r0
            int r0 = r0 + r14
            g.d.d.s.b r14 = r12.f15906a
            int r14 = r14.mo15670i()
            if (r0 < r14) goto L_0x004a
            g.d.d.s.b r14 = r12.f15906a
            int r14 = r14.mo15670i()
            int r0 = r14 + -1
        L_0x004a:
            g.d.d.o r14 = new g.d.d.o
            float r13 = r13.mo15618c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            g.d.d.x.d.c r13 = new g.d.d.x.d.c
            g.d.d.s.b r7 = r12.f15906a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p318x.p319d.C5499c.mo15847a(int, int, boolean):g.d.d.x.d.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5383o mo15848b() {
        return this.f15908c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5383o mo15849c() {
        return this.f15910e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15850d() {
        return this.f15912g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15851e() {
        return this.f15914i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15852f() {
        return this.f15911f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo15853g() {
        return this.f15913h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5383o mo15854h() {
        return this.f15907b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C5383o mo15855i() {
        return this.f15909d;
    }
}
