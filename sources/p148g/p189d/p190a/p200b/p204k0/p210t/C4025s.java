package p148g.p189d.p190a.p200b.p204k0.p210t;

import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.k0.t.s */
public final class C4025s implements C4031w {

    /* renamed from: a */
    private final C4024r f12678a;

    /* renamed from: b */
    private final C4274m f12679b = new C4274m(32);

    /* renamed from: c */
    private int f12680c;

    /* renamed from: d */
    private int f12681d;

    /* renamed from: e */
    private boolean f12682e;

    /* renamed from: f */
    private boolean f12683f;

    public C4025s(C4024r rVar) {
        this.f12678a = rVar;
    }

    /* renamed from: a */
    public void mo12877a() {
        this.f12683f = true;
    }

    /* renamed from: b */
    public void mo12878b(C4282u uVar, C3917g gVar, C4031w.C4035d dVar) {
        this.f12678a.mo12882b(uVar, gVar, dVar);
        this.f12683f = true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef A[SYNTHETIC] */
    /* renamed from: c */
    public void mo12879c(p148g.p189d.p190a.p200b.p230r0.C4274m r8, boolean r9) {
        /*
            r7 = this;
            r0 = -1
            if (r9 == 0) goto L_0x000d
            int r1 = r8.mo13479x()
            int r2 = r8.mo13458c()
            int r2 = r2 + r1
            goto L_0x000e
        L_0x000d:
            r2 = -1
        L_0x000e:
            boolean r1 = r7.f12683f
            r3 = 0
            if (r1 == 0) goto L_0x001d
            if (r9 != 0) goto L_0x0016
            return
        L_0x0016:
            r7.f12683f = r3
            r8.mo13454J(r2)
        L_0x001b:
            r7.f12681d = r3
        L_0x001d:
            int r9 = r8.mo13456a()
            if (r9 <= 0) goto L_0x00ef
            int r9 = r7.f12681d
            r1 = 1
            r2 = 3
            if (r9 >= r2) goto L_0x00a7
            if (r9 != 0) goto L_0x003e
            int r9 = r8.mo13479x()
            int r4 = r8.mo13458c()
            int r4 = r4 - r1
            r8.mo13454J(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r9 != r4) goto L_0x003e
            r7.f12683f = r1
            return
        L_0x003e:
            int r9 = r8.mo13456a()
            int r4 = r7.f12681d
            int r4 = 3 - r4
            int r9 = java.lang.Math.min(r9, r4)
            g.d.a.b.r0.m r4 = r7.f12679b
            byte[] r4 = r4.f13643a
            int r5 = r7.f12681d
            r8.mo13462g(r4, r5, r9)
            int r4 = r7.f12681d
            int r4 = r4 + r9
            r7.f12681d = r4
            if (r4 != r2) goto L_0x001d
            g.d.a.b.r0.m r9 = r7.f12679b
            r9.mo13451G(r2)
            g.d.a.b.r0.m r9 = r7.f12679b
            r9.mo13455K(r1)
            g.d.a.b.r0.m r9 = r7.f12679b
            int r9 = r9.mo13479x()
            g.d.a.b.r0.m r4 = r7.f12679b
            int r4 = r4.mo13479x()
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            r7.f12682e = r1
            r9 = r9 & 15
            int r9 = r9 << 8
            r9 = r9 | r4
            int r9 = r9 + r2
            r7.f12680c = r9
            g.d.a.b.r0.m r9 = r7.f12679b
            int r9 = r9.mo13457b()
            int r1 = r7.f12680c
            if (r9 >= r1) goto L_0x001d
            g.d.a.b.r0.m r9 = r7.f12679b
            byte[] r4 = r9.f13643a
            r5 = 4098(0x1002, float:5.743E-42)
            int r6 = r4.length
            int r6 = r6 * 2
            int r1 = java.lang.Math.max(r1, r6)
            int r1 = java.lang.Math.min(r5, r1)
            r9.mo13451G(r1)
            g.d.a.b.r0.m r9 = r7.f12679b
            byte[] r9 = r9.f13643a
            java.lang.System.arraycopy(r4, r3, r9, r3, r2)
            goto L_0x001d
        L_0x00a7:
            int r9 = r8.mo13456a()
            int r2 = r7.f12680c
            int r4 = r7.f12681d
            int r2 = r2 - r4
            int r9 = java.lang.Math.min(r9, r2)
            g.d.a.b.r0.m r2 = r7.f12679b
            byte[] r2 = r2.f13643a
            int r4 = r7.f12681d
            r8.mo13462g(r2, r4, r9)
            int r2 = r7.f12681d
            int r2 = r2 + r9
            r7.f12681d = r2
            int r9 = r7.f12680c
            if (r2 != r9) goto L_0x001d
            boolean r2 = r7.f12682e
            if (r2 == 0) goto L_0x00e1
            g.d.a.b.r0.m r2 = r7.f12679b
            byte[] r2 = r2.f13643a
            int r9 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18245k(r2, r3, r9, r0)
            if (r9 == 0) goto L_0x00d7
            r7.f12683f = r1
            return
        L_0x00d7:
            g.d.a.b.r0.m r9 = r7.f12679b
            int r1 = r7.f12680c
            int r1 = r1 + -4
            r9.mo13451G(r1)
            goto L_0x00e6
        L_0x00e1:
            g.d.a.b.r0.m r1 = r7.f12679b
            r1.mo13451G(r9)
        L_0x00e6:
            g.d.a.b.k0.t.r r9 = r7.f12678a
            g.d.a.b.r0.m r1 = r7.f12679b
            r9.mo12883c(r1)
            goto L_0x001b
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4025s.mo12879c(g.d.a.b.r0.m, boolean):void");
    }
}
