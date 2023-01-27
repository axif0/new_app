package com.google.android.gms.measurement.internal;

import p148g.p189d.p190a.p232c.p241f.p247f.C4684n0;

/* renamed from: com.google.android.gms.measurement.internal.sa */
final class C1944sa extends C1956ta {

    /* renamed from: g */
    private C4684n0 f6262g;

    /* renamed from: h */
    private final /* synthetic */ C1872ma f6263h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1944sa(C1872ma maVar, String str, int i, C4684n0 n0Var) {
        super(str, i);
        this.f6263h = maVar;
        this.f6262g = n0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo7317a() {
        return this.f6262g.mo14468E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo7318i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo7319j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7341k(java.lang.Long r11, java.lang.Long r12, p148g.p189d.p190a.p232c.p241f.p247f.C4574h1 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4906zb.m20838b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.ma r0 = r10.f6263h
            com.google.android.gms.measurement.internal.wa r0 = r0.mo6712l()
            java.lang.String r3 = r10.f6301a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6357b0
            boolean r0 = r0.mo7422z(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            g.d.a.c.f.f.n0 r3 = r10.f6262g
            boolean r3 = r3.mo14471I()
            g.d.a.c.f.f.n0 r4 = r10.f6262g
            boolean r4 = r4.mo14472J()
            g.d.a.c.f.f.n0 r5 = r10.f6262g
            boolean r5 = r5.mo14474L()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.ma r11 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r11 = r11.mo6772M()
            int r12 = r10.f6302b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            g.d.a.c.f.f.n0 r13 = r10.f6262g
            boolean r13 = r13.mo14467D()
            if (r13 == 0) goto L_0x005e
            g.d.a.c.f.f.n0 r13 = r10.f6262g
            int r13 = r13.mo14468E()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo6887c(r13, r12, r4)
            return r2
        L_0x0064:
            g.d.a.c.f.f.n0 r6 = r10.f6262g
            g.d.a.c.f.f.l0 r6 = r6.mo14470G()
            boolean r7 = r6.mo14373J()
            boolean r8 = r13.mo14208W()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo14370F()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.ma r6 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6767H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f6263h
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo6705d()
            java.lang.String r8 = r13.mo14205R()
            java.lang.String r7 = r7.mo6694z(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.mo6886b(r8, r7)
            goto L_0x0175
        L_0x0099:
            long r8 = r13.mo14209X()
            g.d.a.c.f.f.m0 r4 = r6.mo14371G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C1956ta.m8880c(r8, r4)
        L_0x00a5:
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C1956ta.m8881d(r4, r7)
            goto L_0x0175
        L_0x00ab:
            boolean r8 = r13.mo14210Y()
            if (r8 == 0) goto L_0x00df
            boolean r8 = r6.mo14370F()
            if (r8 != 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ma r6 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6767H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f6263h
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo6705d()
            java.lang.String r8 = r13.mo14205R()
            java.lang.String r7 = r7.mo6694z(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d2:
            double r8 = r13.mo14211Z()
            g.d.a.c.f.f.m0 r4 = r6.mo14371G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C1956ta.m8879b(r8, r4)
            goto L_0x00a5
        L_0x00df:
            boolean r8 = r13.mo14206U()
            if (r8 == 0) goto L_0x0159
            boolean r8 = r6.mo14368D()
            if (r8 != 0) goto L_0x0145
            boolean r8 = r6.mo14370F()
            if (r8 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.ma r6 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6767H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f6263h
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo6705d()
            java.lang.String r8 = r13.mo14205R()
            java.lang.String r7 = r7.mo6694z(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x010c:
            java.lang.String r8 = r13.mo14207V()
            boolean r8 = com.google.android.gms.measurement.internal.C1740ba.m8147S(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = r13.mo14207V()
            g.d.a.c.f.f.m0 r6 = r6.mo14371G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C1956ta.m8882e(r4, r6)
            goto L_0x00a5
        L_0x0123:
            com.google.android.gms.measurement.internal.ma r6 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6767H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f6263h
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo6705d()
            java.lang.String r8 = r13.mo14205R()
            java.lang.String r7 = r7.mo6694z(r8)
            java.lang.String r8 = r13.mo14207V()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo6887c(r9, r7, r8)
            goto L_0x0175
        L_0x0145:
            java.lang.String r4 = r13.mo14207V()
            g.d.a.c.f.f.o0 r6 = r6.mo14369E()
            com.google.android.gms.measurement.internal.ma r8 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo6709i()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C1956ta.m8884g(r4, r6, r8)
            goto L_0x00a5
        L_0x0159:
            com.google.android.gms.measurement.internal.ma r6 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6767H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f6263h
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo6705d()
            java.lang.String r8 = r13.mo14205R()
            java.lang.String r7 = r7.mo6694z(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0175:
            com.google.android.gms.measurement.internal.ma r6 = r10.f6263h
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()
            if (r4 != 0) goto L_0x0184
            java.lang.String r7 = "null"
            goto L_0x0185
        L_0x0184:
            r7 = r4
        L_0x0185:
            java.lang.String r8 = "Property filter result"
            r6.mo6886b(r8, r7)
            if (r4 != 0) goto L_0x018d
            return r1
        L_0x018d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f6303c = r1
            if (r5 == 0) goto L_0x019a
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x019a
            return r2
        L_0x019a:
            if (r14 == 0) goto L_0x01a4
            g.d.a.c.f.f.n0 r14 = r10.f6262g
            boolean r14 = r14.mo14471I()
            if (r14 == 0) goto L_0x01a6
        L_0x01a4:
            r10.f6304d = r4
        L_0x01a6:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01eb
            if (r3 == 0) goto L_0x01eb
            boolean r14 = r13.mo14203J()
            if (r14 == 0) goto L_0x01eb
            long r13 = r13.mo14204K()
            if (r11 == 0) goto L_0x01be
            long r13 = r11.longValue()
        L_0x01be:
            if (r0 == 0) goto L_0x01d6
            g.d.a.c.f.f.n0 r11 = r10.f6262g
            boolean r11 = r11.mo14471I()
            if (r11 == 0) goto L_0x01d6
            g.d.a.c.f.f.n0 r11 = r10.f6262g
            boolean r11 = r11.mo14472J()
            if (r11 != 0) goto L_0x01d6
            if (r12 == 0) goto L_0x01d6
            long r13 = r12.longValue()
        L_0x01d6:
            g.d.a.c.f.f.n0 r11 = r10.f6262g
            boolean r11 = r11.mo14472J()
            if (r11 == 0) goto L_0x01e5
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f6306f = r11
            goto L_0x01eb
        L_0x01e5:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f6305e = r11
        L_0x01eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1944sa.mo7341k(java.lang.Long, java.lang.Long, g.d.a.c.f.f.h1, boolean):boolean");
    }
}
