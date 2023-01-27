package com.google.android.gms.measurement.internal;

import p148g.p189d.p190a.p232c.p241f.p247f.C4628k0;

/* renamed from: com.google.android.gms.measurement.internal.qa */
final class C1920qa extends C1956ta {

    /* renamed from: g */
    private C4628k0 f6202g;

    /* renamed from: h */
    private final /* synthetic */ C1872ma f6203h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1920qa(C1872ma maVar, String str, int i, C4628k0 k0Var) {
        super(str, i);
        this.f6203h = maVar;
        this.f6202g = k0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo7317a() {
        return this.f6202g.mo14313I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo7318i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo7319j() {
        return this.f6202g.mo14317M();
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        if (r4.booleanValue() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        r7 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        r4.mo6886b(r8, r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0394 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0395  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7320k(java.lang.Long r16, java.lang.Long r17, p148g.p189d.p190a.p232c.p241f.p247f.C4888z0 r18, long r19, com.google.android.gms.measurement.internal.C1885o r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4906zb.m20838b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.ma r1 = r0.f6203h
            com.google.android.gms.measurement.internal.wa r1 = r1.mo6712l()
            java.lang.String r4 = r0.f6301a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C1957u.f6361d0
            boolean r1 = r1.mo7422z(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            g.d.a.c.f.f.k0 r4 = r0.f6202g
            boolean r4 = r4.mo14322T()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f6094e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.ma r6 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            r7 = 2
            boolean r6 = r6.mo6763B(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.ma r6 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()
            int r8 = r0.f6302b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            g.d.a.c.f.f.k0 r9 = r0.f6202g
            boolean r9 = r9.mo14312G()
            if (r9 == 0) goto L_0x005c
            g.d.a.c.f.f.k0 r9 = r0.f6202g
            int r9 = r9.mo14313I()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.ma r10 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r10 = r10.mo6705d()
            g.d.a.c.f.f.k0 r11 = r0.f6202g
            java.lang.String r11 = r11.mo14314J()
            java.lang.String r10 = r10.mo6692v(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.mo6888d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.ma r6 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.ba r8 = r8.mo7383m()
            g.d.a.c.f.f.k0 r9 = r0.f6202g
            java.lang.String r8 = r8.mo6746A(r9)
            java.lang.String r9 = "Filter definition"
            r6.mo6886b(r9, r8)
        L_0x008d:
            g.d.a.c.f.f.k0 r6 = r0.f6202g
            boolean r6 = r6.mo14312G()
            if (r6 == 0) goto L_0x03da
            g.d.a.c.f.f.k0 r6 = r0.f6202g
            int r6 = r6.mo14313I()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03da
        L_0x00a1:
            g.d.a.c.f.f.k0 r6 = r0.f6202g
            boolean r6 = r6.mo14319O()
            g.d.a.c.f.f.k0 r8 = r0.f6202g
            boolean r8 = r8.mo14320P()
            g.d.a.c.f.f.k0 r9 = r0.f6202g
            boolean r9 = r9.mo14322T()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = 0
            goto L_0x00bd
        L_0x00bc:
            r6 = 1
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.ma r1 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            int r2 = r0.f6302b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            g.d.a.c.f.f.k0 r4 = r0.f6202g
            boolean r4 = r4.mo14312G()
            if (r4 == 0) goto L_0x00e3
            g.d.a.c.f.f.k0 r4 = r0.f6202g
            int r4 = r4.mo14313I()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo6887c(r4, r2, r7)
            return r3
        L_0x00e9:
            g.d.a.c.f.f.k0 r8 = r0.f6202g
            java.lang.String r9 = r18.mo14784W()
            boolean r10 = r8.mo14317M()
            if (r10 == 0) goto L_0x010b
            g.d.a.c.f.f.m0 r10 = r8.mo14318N()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C1956ta.m8880c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x037d
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
        L_0x0107:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x037d
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.mo14315K()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            g.d.a.c.f.f.l0 r10 = (p148g.p189d.p190a.p232c.p241f.p247f.C4645l0) r10
            java.lang.String r11 = r10.mo14375L()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
        L_0x0144:
            r4.mo6886b(r8, r5)
            goto L_0x037d
        L_0x0149:
            java.lang.String r10 = r10.mo14375L()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            f.e.a r5 = new f.e.a
            r5.<init>()
            java.util.List r10 = r18.mo14782C()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01e3
            java.lang.Object r11 = r10.next()
            g.d.a.c.f.f.b1 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r11
            java.lang.String r12 = r11.mo13813N()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.mo13816Y()
            if (r12 == 0) goto L_0x018f
            java.lang.String r12 = r11.mo13813N()
            boolean r13 = r11.mo13816Y()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.mo13817Z()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x01b6
        L_0x018d:
            r11 = r7
            goto L_0x01b6
        L_0x018f:
            boolean r12 = r11.mo13820c0()
            if (r12 == 0) goto L_0x01a8
            java.lang.String r12 = r11.mo13813N()
            boolean r13 = r11.mo13820c0()
            if (r13 == 0) goto L_0x018d
            double r13 = r11.mo13821d0()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01b6
        L_0x01a8:
            boolean r12 = r11.mo13814U()
            if (r12 == 0) goto L_0x01ba
            java.lang.String r12 = r11.mo13813N()
            java.lang.String r11 = r11.mo13815V()
        L_0x01b6:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01ba:
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo6705d()
            java.lang.String r9 = r11.mo13813N()
            java.lang.String r8 = r8.mo6693y(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
        L_0x01de:
            r4.mo6887c(r9, r5, r8)
            goto L_0x037d
        L_0x01e3:
            java.util.List r4 = r8.mo14315K()
            java.util.Iterator r4 = r4.iterator()
        L_0x01eb:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x037b
            java.lang.Object r8 = r4.next()
            g.d.a.c.f.f.l0 r8 = (p148g.p189d.p190a.p232c.p241f.p247f.C4645l0) r8
            boolean r10 = r8.mo14372I()
            if (r10 == 0) goto L_0x0205
            boolean r10 = r8.mo14373J()
            if (r10 == 0) goto L_0x0205
            r10 = 1
            goto L_0x0206
        L_0x0205:
            r10 = 0
        L_0x0206:
            java.lang.String r11 = r8.mo14375L()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0228
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            java.lang.String r8 = "Event has empty param name. event"
            goto L_0x0144
        L_0x0228:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0271
            boolean r13 = r8.mo14370F()
            if (r13 != 0) goto L_0x0257
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo6705d()
            java.lang.String r8 = r8.mo6693y(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            goto L_0x01de
        L_0x0257:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            g.d.a.c.f.f.m0 r8 = r8.mo14371G()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C1956ta.m8880c(r11, r8)
            if (r8 != 0) goto L_0x0269
            goto L_0x037d
        L_0x0269:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x0271:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02b7
            boolean r13 = r8.mo14370F()
            if (r13 != 0) goto L_0x029d
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo6705d()
            java.lang.String r8 = r8.mo6693y(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            goto L_0x01de
        L_0x029d:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            g.d.a.c.f.f.m0 r8 = r8.mo14371G()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C1956ta.m8879b(r11, r8)
            if (r8 != 0) goto L_0x02af
            goto L_0x037d
        L_0x02af:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x02b7:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0338
            boolean r13 = r8.mo14368D()
            if (r13 == 0) goto L_0x02d2
            java.lang.String r12 = (java.lang.String) r12
            g.d.a.c.f.f.o0 r8 = r8.mo14369E()
            com.google.android.gms.measurement.internal.ma r11 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo6709i()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C1956ta.m8884g(r12, r8, r11)
            goto L_0x02e8
        L_0x02d2:
            boolean r13 = r8.mo14370F()
            if (r13 == 0) goto L_0x0316
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C1740ba.m8147S(r12)
            if (r13 == 0) goto L_0x02f4
            g.d.a.c.f.f.m0 r8 = r8.mo14371G()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C1956ta.m8882e(r12, r8)
        L_0x02e8:
            if (r8 != 0) goto L_0x02ec
            goto L_0x037d
        L_0x02ec:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x02f4:
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo6705d()
            java.lang.String r8 = r8.mo6693y(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            goto L_0x01de
        L_0x0316:
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo6705d()
            java.lang.String r8 = r8.mo6693y(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            goto L_0x01de
        L_0x0338:
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            if (r12 != 0) goto L_0x035f
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6772M()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r7 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo6705d()
            java.lang.String r7 = r7.mo6693y(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.mo6887c(r8, r5, r7)
            goto L_0x0107
        L_0x035f:
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo6705d()
            java.lang.String r5 = r5.mo6692v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f6203h
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo6705d()
            java.lang.String r8 = r8.mo6693y(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            goto L_0x01de
        L_0x037b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x037d:
            com.google.android.gms.measurement.internal.ma r4 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6772M()
            if (r7 != 0) goto L_0x038c
            java.lang.String r5 = "null"
            goto L_0x038d
        L_0x038c:
            r5 = r7
        L_0x038d:
            java.lang.String r8 = "Event filter result"
            r4.mo6886b(r8, r5)
            if (r7 != 0) goto L_0x0395
            return r2
        L_0x0395:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f6303c = r2
            boolean r2 = r7.booleanValue()
            if (r2 != 0) goto L_0x03a0
            return r3
        L_0x03a0:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f6304d = r2
            if (r6 == 0) goto L_0x03d9
            boolean r2 = r18.mo14785X()
            if (r2 == 0) goto L_0x03d9
            long r4 = r18.mo14786Y()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            g.d.a.c.f.f.k0 r4 = r0.f6202g
            boolean r4 = r4.mo14320P()
            if (r4 == 0) goto L_0x03cb
            if (r1 == 0) goto L_0x03c8
            g.d.a.c.f.f.k0 r1 = r0.f6202g
            boolean r1 = r1.mo14317M()
            if (r1 == 0) goto L_0x03c8
            r2 = r16
        L_0x03c8:
            r0.f6306f = r2
            goto L_0x03d9
        L_0x03cb:
            if (r1 == 0) goto L_0x03d7
            g.d.a.c.f.f.k0 r1 = r0.f6202g
            boolean r1 = r1.mo14317M()
            if (r1 == 0) goto L_0x03d7
            r2 = r17
        L_0x03d7:
            r0.f6305e = r2
        L_0x03d9:
            return r3
        L_0x03da:
            com.google.android.gms.measurement.internal.ma r1 = r0.f6203h
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6767H()
            java.lang.String r3 = r0.f6301a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r3)
            g.d.a.c.f.f.k0 r4 = r0.f6202g
            boolean r4 = r4.mo14312G()
            if (r4 == 0) goto L_0x03fc
            g.d.a.c.f.f.k0 r4 = r0.f6202g
            int r4 = r4.mo14313I()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x03fc:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r1.mo6887c(r5, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1920qa.mo7320k(java.lang.Long, java.lang.Long, g.d.a.c.f.f.z0, long, com.google.android.gms.measurement.internal.o, boolean):boolean");
    }
}
