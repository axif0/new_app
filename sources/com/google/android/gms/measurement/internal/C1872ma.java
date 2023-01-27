package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.ma */
final class C1872ma extends C1967u9 {

    /* renamed from: d */
    private String f6067d;

    /* renamed from: e */
    private Set<Integer> f6068e;

    /* renamed from: f */
    private Map<Integer, C1896oa> f6069f;

    /* renamed from: g */
    private Long f6070g;

    /* renamed from: h */
    private Long f6071h;

    C1872ma(C2003x9 x9Var) {
        super(x9Var);
    }

    /* renamed from: u */
    private final C1896oa m8727u(int i) {
        if (this.f6069f.containsKey(Integer.valueOf(i))) {
            return this.f6069f.get(Integer.valueOf(i));
        }
        C1896oa oaVar = new C1896oa(this, this.f6067d, (C1908pa) null);
        this.f6069f.put(Integer.valueOf(i), oaVar);
        return oaVar;
    }

    /* renamed from: w */
    private final boolean m8728w(int i, int i2) {
        if (this.f6069f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f6069f.get(Integer.valueOf(i)).f6120d.get(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo6730t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0624, code lost:
        if (r8.mo14467D() == false) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0626, code lost:
        r8 = java.lang.Integer.valueOf(r8.mo14468E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x062f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0630, code lost:
        r7.mo6887c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x02cc A[SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p148g.p189d.p190a.p232c.p241f.p247f.C4850x0> mo7242v(java.lang.String r47, java.util.List<p148g.p189d.p190a.p232c.p241f.p247f.C4888z0> r48, java.util.List<p148g.p189d.p190a.p232c.p241f.p247f.C4574h1> r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            r46 = this;
            r10 = r46
            com.google.android.gms.common.internal.C1658o.m7841f(r47)
            com.google.android.gms.common.internal.C1658o.m7845j(r48)
            com.google.android.gms.common.internal.C1658o.m7845j(r49)
            r0 = r47
            r10.f6067d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f6068e = r0
            f.e.a r0 = new f.e.a
            r0.<init>()
            r10.f6069f = r0
            r0 = r50
            r10.f6070g = r0
            r0 = r51
            r10.f6071h = r0
            java.util.Iterator r0 = r48.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            g.d.a.c.f.f.z0 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r1
            java.lang.String r1 = r1.mo14784W()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4906zb.m20838b()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.wa r0 = r46.mo6712l()
            java.lang.String r2 = r10.f6067d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6361d0
            boolean r0 = r0.mo7422z(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4906zb.m20838b()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.wa r0 = r46.mo6712l()
            java.lang.String r2 = r10.f6067d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6359c0
            boolean r0 = r0.mo7422z(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.d r2 = r46.mo7384o()
            java.lang.String r3 = r10.f6067d
            r2.mo7366r()
            r2.mo6700b()
            com.google.android.gms.common.internal.C1658o.m7841f(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo6844v()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r7[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.mo6887c(r4, r3, r0)
        L_0x00b5:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.d r0 = r46.mo7384o()
            java.lang.String r2 = r10.f6067d
            java.util.Map r0 = r0.mo6840s0(r2)
        L_0x00c7:
            com.google.android.gms.measurement.internal.d r2 = r46.mo7384o()
            java.lang.String r3 = r10.f6067d
            java.util.Map r15 = r2.mo6847w0(r3)
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()
            if (r2 == 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.wa r2 = r46.mo6712l()
            java.lang.String r3 = r10.f6067d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6334N0
            boolean r2 = r2.mo7422z(r3, r4)
            if (r2 != 0) goto L_0x00e7
        L_0x00e5:
            if (r15 == 0) goto L_0x0367
        L_0x00e7:
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x00ef
            goto L_0x0367
        L_0x00ef:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = r10.f6067d
            com.google.android.gms.common.internal.C1658o.m7841f(r1)
            com.google.android.gms.common.internal.C1658o.m7845j(r15)
            f.e.a r3 = new f.e.a
            r3.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.d r4 = r46.mo7384o()
            java.util.Map r1 = r4.mo6843u0(r1)
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x011d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d0
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r15.get(r6)
            g.d.a.c.f.f.f1 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01c6
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x014b
            goto L_0x01c6
        L_0x014b:
            com.google.android.gms.measurement.internal.ba r8 = r46.mo7383m()
            java.util.List r9 = r6.mo14095O()
            java.util.List r8 = r8.mo6749F(r9, r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x011d
            g.d.a.c.f.f.z6$b r9 = r6.mo14813x()
            g.d.a.c.f.f.f1$a r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1.C4537a) r9
            r9.mo14108z()
            r9.mo14102B(r8)
            com.google.android.gms.measurement.internal.ba r8 = r46.mo7383m()
            java.util.List r11 = r6.mo14092C()
            java.util.List r8 = r8.mo6749F(r11, r7)
            r9.mo14105v()
            r9.mo14107y(r8)
            r8 = 0
        L_0x017c:
            int r11 = r6.mo14098Z()
            if (r8 >= r11) goto L_0x019a
            g.d.a.c.f.f.y0 r11 = r6.mo14091B(r8)
            int r11 = r11.mo14742G()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x0197
            r9.mo14106x(r8)
        L_0x0197:
            int r8 = r8 + 1
            goto L_0x017c
        L_0x019a:
            r8 = 0
        L_0x019b:
            int r11 = r6.mo14100b0()
            if (r8 >= r11) goto L_0x01b9
            g.d.a.c.f.f.g1 r11 = r6.mo14094J(r8)
            int r11 = r11.mo14168G()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x01b6
            r9.mo14101A(r8)
        L_0x01b6:
            int r8 = r8 + 1
            goto L_0x019b
        L_0x01b9:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            g.d.a.c.f.f.l8 r6 = r9.mo14350h()
            g.d.a.c.f.f.z6 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r6
            g.d.a.c.f.f.f1 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1) r6
            goto L_0x01ca
        L_0x01c6:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x01ca:
            r3.put(r5, r6)
            r11 = 0
            goto L_0x011d
        L_0x01d0:
            r11 = r3
            goto L_0x01d3
        L_0x01d2:
            r11 = r15
        L_0x01d3:
            java.util.Iterator r16 = r2.iterator()
        L_0x01d7:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0367
            java.lang.Object r1 = r16.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r17 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r11.get(r1)
            g.d.a.c.f.f.f1 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            f.e.a r7 = new f.e.a
            r7.<init>()
            if (r1 == 0) goto L_0x023f
            int r2 = r1.mo14098Z()
            if (r2 != 0) goto L_0x0209
            goto L_0x023f
        L_0x0209:
            java.util.List r2 = r1.mo14097X()
            java.util.Iterator r2 = r2.iterator()
        L_0x0211:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023f
            java.lang.Object r3 = r2.next()
            g.d.a.c.f.f.y0 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4867y0) r3
            boolean r4 = r3.mo14741F()
            if (r4 == 0) goto L_0x0211
            int r4 = r3.mo14742G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.mo14743I()
            if (r8 == 0) goto L_0x023a
            long r8 = r3.mo14744J()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x023b
        L_0x023a:
            r3 = 0
        L_0x023b:
            r7.put(r4, r3)
            goto L_0x0211
        L_0x023f:
            f.e.a r8 = new f.e.a
            r8.<init>()
            if (r1 == 0) goto L_0x0286
            int r2 = r1.mo14100b0()
            if (r2 != 0) goto L_0x024d
            goto L_0x0286
        L_0x024d:
            java.util.List r2 = r1.mo14099a0()
            java.util.Iterator r2 = r2.iterator()
        L_0x0255:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0286
            java.lang.Object r3 = r2.next()
            g.d.a.c.f.f.g1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4556g1) r3
            boolean r4 = r3.mo14167F()
            if (r4 == 0) goto L_0x0255
            int r4 = r3.mo14170K()
            if (r4 <= 0) goto L_0x0255
            int r4 = r3.mo14168G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r9 = r3.mo14170K()
            int r9 = r9 - r12
            long r18 = r3.mo14166B(r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r4, r3)
            goto L_0x0255
        L_0x0286:
            if (r1 == 0) goto L_0x02d0
            r2 = 0
        L_0x0289:
            int r3 = r1.mo14093I()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x02d0
            java.util.List r3 = r1.mo14092C()
            boolean r3 = com.google.android.gms.measurement.internal.C1740ba.m8148T(r3, r2)
            if (r3 == 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.c4 r3 = r46.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6772M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.String r12 = "Filter already evaluated. audience ID, filter ID"
            r3.mo6887c(r12, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.mo14095O()
            boolean r3 = com.google.android.gms.measurement.internal.C1740ba.m8148T(r3, r2)
            if (r3 == 0) goto L_0x02c2
            r5.set(r2)
            r3 = 1
            goto L_0x02c3
        L_0x02c2:
            r3 = 0
        L_0x02c3:
            if (r3 != 0) goto L_0x02cc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02cc:
            int r2 = r2 + 1
            r12 = 1
            goto L_0x0289
        L_0x02d0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r15.get(r1)
            r4 = r1
            g.d.a.c.f.f.f1 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1) r4
            if (r14 == 0) goto L_0x034b
            if (r13 == 0) goto L_0x034b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x034b
            java.lang.Long r2 = r10.f6071h
            if (r2 == 0) goto L_0x034b
            java.lang.Long r2 = r10.f6070g
            if (r2 != 0) goto L_0x02f4
            goto L_0x034b
        L_0x02f4:
            java.util.Iterator r1 = r1.iterator()
        L_0x02f8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034b
            java.lang.Object r2 = r1.next()
            g.d.a.c.f.f.k0 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4628k0) r2
            int r3 = r2.mo14313I()
            java.lang.Long r9 = r10.f6071h
            long r18 = r9.longValue()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r20
            boolean r2 = r2.mo14320P()
            if (r2 == 0) goto L_0x0320
            java.lang.Long r2 = r10.f6070g
            long r18 = r2.longValue()
            long r18 = r18 / r20
        L_0x0320:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0335
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
            r7.put(r2, r9)
        L_0x0335:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x02f8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r2, r3)
            goto L_0x02f8
        L_0x034b:
            com.google.android.gms.measurement.internal.oa r12 = new com.google.android.gms.measurement.internal.oa
            java.lang.String r3 = r10.f6067d
            r9 = 0
            r1 = r12
            r2 = r46
            r18 = r11
            r11 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r1 = r10.f6069f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1.put(r2, r12)
            r11 = r18
            r12 = 1
            goto L_0x01d7
        L_0x0367:
            r11 = 0
            boolean r0 = r48.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x04ec
            com.google.android.gms.measurement.internal.ra r0 = new com.google.android.gms.measurement.internal.ra
            r0.<init>(r10, r11)
            f.e.a r2 = new f.e.a
            r2.<init>()
            java.util.Iterator r3 = r48.iterator()
        L_0x037e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ec
            java.lang.Object r4 = r3.next()
            g.d.a.c.f.f.z0 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r4
            java.lang.String r5 = r10.f6067d
            g.d.a.c.f.f.z0 r5 = r0.mo7332a(r5, r4)
            if (r5 == 0) goto L_0x037e
            com.google.android.gms.measurement.internal.d r6 = r46.mo7384o()
            java.lang.String r13 = r10.f6067d
            java.lang.String r7 = r5.mo14784W()
            java.lang.String r8 = r4.mo14784W()
            com.google.android.gms.measurement.internal.o r8 = r6.mo6810D(r13, r8)
            if (r8 != 0) goto L_0x03de
            com.google.android.gms.measurement.internal.c4 r8 = r6.mo6709i()
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6767H()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo6705d()
            java.lang.String r6 = r6.mo6692v(r7)
            java.lang.String r7 = "Event aggregate wasn't created during raw event logging. appId, event"
            r8.mo6887c(r7, r9, r6)
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r12 = r6
            java.lang.String r14 = r4.mo14784W()
            r15 = 1
            r17 = 1
            r19 = 1
            long r21 = r4.mo14786Y()
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)
            goto L_0x0413
        L_0x03de:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r29 = r6
            java.lang.String r4 = r8.f6090a
            r30 = r4
            java.lang.String r4 = r8.f6091b
            r31 = r4
            long r12 = r8.f6092c
            r14 = 1
            long r32 = r12 + r14
            long r12 = r8.f6093d
            long r34 = r12 + r14
            long r12 = r8.f6094e
            long r36 = r12 + r14
            long r12 = r8.f6095f
            r38 = r12
            long r12 = r8.f6096g
            r40 = r12
            java.lang.Long r4 = r8.f6097h
            r42 = r4
            java.lang.Long r4 = r8.f6098i
            r43 = r4
            java.lang.Long r4 = r8.f6099j
            r44 = r4
            java.lang.Boolean r4 = r8.f6100k
            r45 = r4
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
        L_0x0413:
            com.google.android.gms.measurement.internal.d r4 = r46.mo7384o()
            r4.mo6822N(r6)
            long r7 = r6.f6092c
            java.lang.String r4 = r5.mo14784W()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x0450
            com.google.android.gms.measurement.internal.d r9 = r46.mo7384o()
            java.lang.String r12 = r10.f6067d
            java.util.Map r9 = r9.mo6845v0(r12, r4)
            boolean r12 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()
            if (r12 == 0) goto L_0x0446
            com.google.android.gms.measurement.internal.wa r12 = r46.mo6712l()
            java.lang.String r13 = r10.f6067d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C1957u.f6334N0
            boolean r12 = r12.mo7422z(r13, r14)
            if (r12 != 0) goto L_0x044d
        L_0x0446:
            if (r9 != 0) goto L_0x044d
            f.e.a r9 = new f.e.a
            r9.<init>()
        L_0x044d:
            r2.put(r4, r9)
        L_0x0450:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0458:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x037e
            java.lang.Object r12 = r4.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r15 = r12.intValue()
            java.util.Set<java.lang.Integer> r12 = r10.f6068e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.c4 r12 = r46.mo6709i()
            com.google.android.gms.measurement.internal.e4 r12 = r12.mo6772M()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r12.mo6886b(r1, r13)
            goto L_0x0458
        L_0x0484:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.Object r12 = r9.get(r12)
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r20 = r12.iterator()
            r12 = 1
        L_0x0493:
            boolean r13 = r20.hasNext()
            if (r13 == 0) goto L_0x04d9
            java.lang.Object r12 = r20.next()
            g.d.a.c.f.f.k0 r12 = (p148g.p189d.p190a.p232c.p241f.p247f.C4628k0) r12
            com.google.android.gms.measurement.internal.qa r14 = new com.google.android.gms.measurement.internal.qa
            java.lang.String r13 = r10.f6067d
            r14.<init>(r10, r13, r15, r12)
            java.lang.Long r13 = r10.f6070g
            java.lang.Long r11 = r10.f6071h
            int r12 = r12.mo14313I()
            boolean r19 = r10.m8728w(r15, r12)
            r12 = r14
            r21 = r0
            r0 = r14
            r14 = r11
            r11 = r15
            r15 = r5
            r16 = r7
            r18 = r6
            boolean r12 = r12.mo7320k(r13, r14, r15, r16, r18, r19)
            if (r12 == 0) goto L_0x04cf
            com.google.android.gms.measurement.internal.oa r13 = r10.m8727u(r11)
            r13.mo7271c(r0)
            r15 = r11
            r0 = r21
            r11 = 0
            goto L_0x0493
        L_0x04cf:
            java.util.Set<java.lang.Integer> r0 = r10.f6068e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r0.add(r13)
            goto L_0x04dc
        L_0x04d9:
            r21 = r0
            r11 = r15
        L_0x04dc:
            if (r12 != 0) goto L_0x04e7
            java.util.Set<java.lang.Integer> r0 = r10.f6068e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.add(r11)
        L_0x04e7:
            r0 = r21
            r11 = 0
            goto L_0x0458
        L_0x04ec:
            boolean r0 = r49.isEmpty()
            if (r0 != 0) goto L_0x0647
            f.e.a r0 = new f.e.a
            r0.<init>()
            java.util.Iterator r2 = r49.iterator()
        L_0x04fb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0647
            java.lang.Object r3 = r2.next()
            g.d.a.c.f.f.h1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4574h1) r3
            java.lang.String r4 = r3.mo14205R()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x053b
            com.google.android.gms.measurement.internal.d r5 = r46.mo7384o()
            java.lang.String r6 = r10.f6067d
            java.util.Map r5 = r5.mo6849x0(r6, r4)
            boolean r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()
            if (r6 == 0) goto L_0x0531
            com.google.android.gms.measurement.internal.wa r6 = r46.mo6712l()
            java.lang.String r7 = r10.f6067d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C1957u.f6334N0
            boolean r6 = r6.mo7422z(r7, r8)
            if (r6 != 0) goto L_0x0538
        L_0x0531:
            if (r5 != 0) goto L_0x0538
            f.e.a r5 = new f.e.a
            r5.<init>()
        L_0x0538:
            r0.put(r4, r5)
        L_0x053b:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0543:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04fb
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r10.f6068e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x056f
            com.google.android.gms.measurement.internal.c4 r3 = r46.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6772M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.mo6886b(r1, r4)
            goto L_0x04fb
        L_0x056f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x057e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x063a
            java.lang.Object r8 = r7.next()
            g.d.a.c.f.f.n0 r8 = (p148g.p189d.p190a.p232c.p241f.p247f.C4684n0) r8
            com.google.android.gms.measurement.internal.c4 r9 = r46.mo6709i()
            r11 = 2
            boolean r9 = r9.mo6763B(r11)
            if (r9 == 0) goto L_0x05d7
            com.google.android.gms.measurement.internal.c4 r9 = r46.mo6709i()
            com.google.android.gms.measurement.internal.e4 r9 = r9.mo6772M()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r12 = r8.mo14467D()
            if (r12 == 0) goto L_0x05b0
            int r12 = r8.mo14468E()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x05b1
        L_0x05b0:
            r12 = 0
        L_0x05b1:
            com.google.android.gms.measurement.internal.a4 r13 = r46.mo6705d()
            java.lang.String r14 = r8.mo14469F()
            java.lang.String r13 = r13.mo6694z(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.mo6888d(r14, r11, r12, r13)
            com.google.android.gms.measurement.internal.c4 r9 = r46.mo6709i()
            com.google.android.gms.measurement.internal.e4 r9 = r9.mo6772M()
            com.google.android.gms.measurement.internal.ba r11 = r46.mo7383m()
            java.lang.String r11 = r11.mo6747B(r8)
            java.lang.String r12 = "Filter definition"
            r9.mo6886b(r12, r11)
        L_0x05d7:
            boolean r9 = r8.mo14467D()
            if (r9 == 0) goto L_0x0612
            int r9 = r8.mo14468E()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x05e6
            goto L_0x0612
        L_0x05e6:
            com.google.android.gms.measurement.internal.sa r9 = new com.google.android.gms.measurement.internal.sa
            java.lang.String r11 = r10.f6067d
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.f6070g
            java.lang.Long r12 = r10.f6071h
            int r8 = r8.mo14468E()
            boolean r8 = r10.m8728w(r6, r8)
            boolean r8 = r9.mo7341k(r11, r12, r3, r8)
            if (r8 == 0) goto L_0x0608
            com.google.android.gms.measurement.internal.oa r11 = r10.m8727u(r6)
            r11.mo7271c(r9)
            goto L_0x057e
        L_0x0608:
            java.util.Set<java.lang.Integer> r7 = r10.f6068e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x063a
        L_0x0612:
            com.google.android.gms.measurement.internal.c4 r7 = r46.mo6709i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6767H()
            java.lang.String r9 = r10.f6067d
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r9)
            boolean r11 = r8.mo14467D()
            if (r11 == 0) goto L_0x062f
            int r8 = r8.mo14468E()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0630
        L_0x062f:
            r8 = 0
        L_0x0630:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.mo6887c(r11, r9, r8)
            r8 = 0
        L_0x063a:
            if (r8 != 0) goto L_0x0543
            java.util.Set<java.lang.Integer> r7 = r10.f6068e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            goto L_0x0543
        L_0x0647:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r0 = r10.f6069f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f6068e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x065b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06eb
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r3 = r10.f6069f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.oa r3 = (com.google.android.gms.measurement.internal.C1896oa) r3
            g.d.a.c.f.f.x0 r3 = r3.mo7270a(r0)
            r1.add(r3)
            com.google.android.gms.measurement.internal.d r4 = r46.mo7384o()
            java.lang.String r5 = r10.f6067d
            g.d.a.c.f.f.f1 r3 = r3.mo14719M()
            r4.mo7366r()
            r4.mo6700b()
            com.google.android.gms.common.internal.C1658o.m7841f(r5)
            com.google.android.gms.common.internal.C1658o.m7845j(r3)
            byte[] r3 = r3.mo14268k()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.mo6844v()     // Catch:{ SQLiteException -> 0x06d6 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x06d4 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x065b
            com.google.android.gms.measurement.internal.c4 r0 = r4.mo6709i()     // Catch:{ SQLiteException -> 0x06d4 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()     // Catch:{ SQLiteException -> 0x06d4 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r5)     // Catch:{ SQLiteException -> 0x06d4 }
            r0.mo6886b(r3, r6)     // Catch:{ SQLiteException -> 0x06d4 }
            goto L_0x065b
        L_0x06d4:
            r0 = move-exception
            goto L_0x06d8
        L_0x06d6:
            r0 = move-exception
            r8 = 0
        L_0x06d8:
            com.google.android.gms.measurement.internal.c4 r3 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r5)
            java.lang.String r5 = "Error storing filter results. appId"
            r3.mo6887c(r5, r4, r0)
            goto L_0x065b
        L_0x06eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1872ma.mo7242v(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
