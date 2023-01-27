package p086f.p103f.p107b.p108k.p109m;

import java.util.ArrayList;
import java.util.Iterator;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3232f;

/* renamed from: f.f.b.k.m.c */
public class C3244c extends C3257m {

    /* renamed from: k */
    ArrayList<C3257m> f10436k = new ArrayList<>();

    /* renamed from: l */
    private int f10437l;

    public C3244c(C3229e eVar, int i) {
        super(eVar);
        this.f10482f = i;
        m13997q();
    }

    /* renamed from: q */
    private void m13997q() {
        C3229e eVar;
        C3229e eVar2 = this.f10478b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.mo11283F(this.f10482f);
        } while (eVar2 != null);
        this.f10478b = eVar;
        this.f10436k.add(eVar.mo11287H(this.f10482f));
        C3229e D = eVar.mo11279D(this.f10482f);
        while (D != null) {
            this.f10436k.add(D.mo11287H(this.f10482f));
            D = D.mo11279D(this.f10482f);
        }
        Iterator<C3257m> it = this.f10436k.iterator();
        while (it.hasNext()) {
            C3257m next = it.next();
            int i = this.f10482f;
            if (i == 0) {
                next.f10478b.f10361b = this;
            } else if (i == 1) {
                next.f10478b.f10363c = this;
            }
        }
        if ((this.f10482f == 0 && ((C3232f) this.f10478b.mo11281E()).mo11361W0()) && this.f10436k.size() > 1) {
            ArrayList<C3257m> arrayList = this.f10436k;
            this.f10478b = arrayList.get(arrayList.size() - 1).f10478b;
        }
        this.f10437l = this.f10482f == 0 ? this.f10478b.mo11340v() : this.f10478b.mo11289J();
    }

    /* renamed from: r */
    private C3229e m13998r() {
        for (int i = 0; i < this.f10436k.size(); i++) {
            C3257m mVar = this.f10436k.get(i);
            if (mVar.f10478b.mo11292M() != 8) {
                return mVar.f10478b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C3229e m13999s() {
        for (int size = this.f10436k.size() - 1; size >= 0; size--) {
            C3257m mVar = this.f10436k.get(size);
            if (mVar.f10478b.mo11292M() != 8) {
                return mVar.f10478b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0198, code lost:
        if (r7 != r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c0, code lost:
        if (r7 != r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.f10481e.f10455j != false) goto L_0x00d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11388a(p086f.p103f.p107b.p108k.p109m.C3245d r23) {
        /*
            r22 = this;
            r0 = r22
            f.f.b.k.m.f r1 = r0.f10484h
            boolean r1 = r1.f10455j
            if (r1 == 0) goto L_0x03f4
            f.f.b.k.m.f r1 = r0.f10485i
            boolean r1 = r1.f10455j
            if (r1 != 0) goto L_0x0010
            goto L_0x03f4
        L_0x0010:
            f.f.b.k.e r1 = r0.f10478b
            f.f.b.k.e r1 = r1.mo11281E()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p086f.p103f.p107b.p108k.C3232f
            if (r3 == 0) goto L_0x0023
            f.f.b.k.f r1 = (p086f.p103f.p107b.p108k.C3232f) r1
            boolean r1 = r1.mo11361W0()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            f.f.b.k.m.f r3 = r0.f10485i
            int r3 = r3.f10452g
            f.f.b.k.m.f r4 = r0.f10484h
            int r4 = r4.f10452g
            int r3 = r3 - r4
            java.util.ArrayList<f.f.b.k.m.m> r4 = r0.f10436k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<f.f.b.k.m.m> r8 = r0.f10436k
            java.lang.Object r8 = r8.get(r5)
            f.f.b.k.m.m r8 = (p086f.p103f.p107b.p108k.p109m.C3257m) r8
            f.f.b.k.e r8 = r8.f10478b
            int r8 = r8.mo11292M()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<f.f.b.k.m.m> r10 = r0.f10436k
            java.lang.Object r10 = r10.get(r9)
            f.f.b.k.m.m r10 = (p086f.p103f.p107b.p108k.p109m.C3257m) r10
            f.f.b.k.e r10 = r10.f10478b
            int r10 = r10.mo11292M()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x0106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0072:
            if (r13 >= r4) goto L_0x00f8
            java.util.ArrayList<f.f.b.k.m.m> r2 = r0.f10436k
            java.lang.Object r2 = r2.get(r13)
            f.f.b.k.m.m r2 = (p086f.p103f.p107b.p108k.p109m.C3257m) r2
            f.f.b.k.e r11 = r2.f10478b
            int r11 = r11.mo11292M()
            if (r11 != r7) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0091
            if (r13 < r5) goto L_0x0091
            f.f.b.k.m.f r11 = r2.f10484h
            int r11 = r11.f10451f
            int r14 = r14 + r11
        L_0x0091:
            f.f.b.k.m.g r11 = r2.f10481e
            int r11 = r11.f10452g
            f.f.b.k.e$b r7 = r2.f10480d
            f.f.b.k.e$b r10 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00be
            int r10 = r0.f10482f
            if (r10 != 0) goto L_0x00af
            f.f.b.k.e r10 = r2.f10478b
            f.f.b.k.m.j r10 = r10.f10365d
            f.f.b.k.m.g r10 = r10.f10481e
            boolean r10 = r10.f10455j
            if (r10 != 0) goto L_0x00af
            return
        L_0x00af:
            int r10 = r0.f10482f
            if (r10 != r12) goto L_0x00d2
            f.f.b.k.e r10 = r2.f10478b
            f.f.b.k.m.l r10 = r10.f10367e
            f.f.b.k.m.g r10 = r10.f10481e
            boolean r10 = r10.f10455j
            if (r10 != 0) goto L_0x00d2
            return
        L_0x00be:
            int r10 = r2.f10477a
            if (r10 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            f.f.b.k.m.g r7 = r2.f10481e
            int r11 = r7.f10467m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            f.f.b.k.m.g r10 = r2.f10481e
            boolean r10 = r10.f10455j
            if (r10 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            if (r7 != 0) goto L_0x00e6
            int r15 = r15 + 1
            f.f.b.k.e r7 = r2.f10478b
            float[] r7 = r7.f10364c0
            int r10 = r0.f10482f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00e7
            float r17 = r17 + r7
            goto L_0x00e7
        L_0x00e6:
            int r14 = r14 + r11
        L_0x00e7:
            if (r13 >= r8) goto L_0x00f1
            if (r13 >= r6) goto L_0x00f1
            f.f.b.k.m.f r2 = r2.f10485i
            int r2 = r2.f10451f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0072
        L_0x00f8:
            if (r14 < r3) goto L_0x0103
            if (r15 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0103:
            r2 = r16
            goto L_0x010b
        L_0x0106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010b:
            f.f.b.k.m.f r7 = r0.f10484h
            int r7 = r7.f10452g
            if (r1 == 0) goto L_0x0115
            f.f.b.k.m.f r7 = r0.f10485i
            int r7 = r7.f10452g
        L_0x0115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0126
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0125
            int r7 = r7 + r10
            goto L_0x0126
        L_0x0125:
            int r7 = r7 - r10
        L_0x0126:
            if (r15 <= 0) goto L_0x022b
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0133:
            if (r13 >= r4) goto L_0x01e0
            java.util.ArrayList<f.f.b.k.m.m> r12 = r0.f10436k
            java.lang.Object r12 = r12.get(r13)
            f.f.b.k.m.m r12 = (p086f.p103f.p107b.p108k.p109m.C3257m) r12
            f.f.b.k.e r9 = r12.f10478b
            int r9 = r9.mo11292M()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L_0x014b
            goto L_0x01cb
        L_0x014b:
            f.f.b.k.e$b r9 = r12.f10480d
            f.f.b.k.e$b r11 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01cb
            f.f.b.k.m.g r9 = r12.f10481e
            boolean r9 = r9.f10455j
            if (r9 != 0) goto L_0x01cb
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x016d
            f.f.b.k.e r11 = r12.f10478b
            float[] r11 = r11.f10364c0
            int r9 = r0.f10482f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L_0x016f
        L_0x016d:
            r9 = r18
        L_0x016f:
            int r11 = r0.f10482f
            if (r11 != 0) goto L_0x019b
            f.f.b.k.e r11 = r12.f10478b
            r19 = r10
            int r10 = r11.f10377n
            int r11 = r11.f10376m
            r20 = r14
            int r14 = r12.f10477a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x018d
            f.f.b.k.m.g r7 = r12.f10481e
            int r7 = r7.f10467m
            int r7 = java.lang.Math.min(r9, r7)
            goto L_0x018e
        L_0x018d:
            r7 = r9
        L_0x018e:
            int r7 = java.lang.Math.max(r11, r7)
            if (r10 <= 0) goto L_0x0198
            int r7 = java.lang.Math.min(r10, r7)
        L_0x0198:
            if (r7 == r9) goto L_0x01c5
            goto L_0x01c2
        L_0x019b:
            r21 = r7
            r19 = r10
            r20 = r14
            f.f.b.k.e r7 = r12.f10478b
            int r10 = r7.f10380q
            int r7 = r7.f10379p
            int r11 = r12.f10477a
            r14 = 1
            if (r11 != r14) goto L_0x01b5
            f.f.b.k.m.g r11 = r12.f10481e
            int r11 = r11.f10467m
            int r11 = java.lang.Math.min(r9, r11)
            goto L_0x01b6
        L_0x01b5:
            r11 = r9
        L_0x01b6:
            int r7 = java.lang.Math.max(r7, r11)
            if (r10 <= 0) goto L_0x01c0
            int r7 = java.lang.Math.min(r10, r7)
        L_0x01c0:
            if (r7 == r9) goto L_0x01c5
        L_0x01c2:
            int r16 = r16 + 1
            r9 = r7
        L_0x01c5:
            f.f.b.k.m.g r7 = r12.f10481e
            r7.mo11406d(r9)
            goto L_0x01d1
        L_0x01cb:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d1:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0133
        L_0x01e0:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x021c
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01ea:
            if (r7 >= r4) goto L_0x021a
            java.util.ArrayList<f.f.b.k.m.m> r10 = r0.f10436k
            java.lang.Object r10 = r10.get(r7)
            f.f.b.k.m.m r10 = (p086f.p103f.p107b.p108k.p109m.C3257m) r10
            f.f.b.k.e r11 = r10.f10478b
            int r11 = r11.mo11292M()
            r12 = 8
            if (r11 != r12) goto L_0x01ff
            goto L_0x0217
        L_0x01ff:
            if (r7 <= 0) goto L_0x0208
            if (r7 < r5) goto L_0x0208
            f.f.b.k.m.f r11 = r10.f10484h
            int r11 = r11.f10451f
            int r9 = r9 + r11
        L_0x0208:
            f.f.b.k.m.g r11 = r10.f10481e
            int r11 = r11.f10452g
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x0217
            if (r7 >= r6) goto L_0x0217
            f.f.b.k.m.f r10 = r10.f10485i
            int r10 = r10.f10451f
            int r10 = -r10
            int r9 = r9 + r10
        L_0x0217:
            int r7 = r7 + 1
            goto L_0x01ea
        L_0x021a:
            r14 = r9
            goto L_0x021e
        L_0x021c:
            r14 = r20
        L_0x021e:
            int r7 = r0.f10437l
            r9 = 2
            if (r7 != r9) goto L_0x0229
            if (r16 != 0) goto L_0x0229
            r7 = 0
            r0.f10437l = r7
            goto L_0x0231
        L_0x0229:
            r7 = 0
            goto L_0x0231
        L_0x022b:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x0231:
            if (r14 <= r3) goto L_0x0235
            r0.f10437l = r9
        L_0x0235:
            if (r2 <= 0) goto L_0x023d
            if (r15 != 0) goto L_0x023d
            if (r5 != r6) goto L_0x023d
            r0.f10437l = r9
        L_0x023d:
            int r9 = r0.f10437l
            r10 = 1
            if (r9 != r10) goto L_0x02ce
            if (r2 <= r10) goto L_0x0248
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r3 = r3 / r2
            goto L_0x024f
        L_0x0248:
            if (r2 != r10) goto L_0x024e
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x024f
        L_0x024e:
            r3 = 0
        L_0x024f:
            if (r15 <= 0) goto L_0x0252
            r3 = 0
        L_0x0252:
            r7 = r21
            r2 = 0
        L_0x0255:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x025e
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x025f
        L_0x025e:
            r9 = r2
        L_0x025f:
            java.util.ArrayList<f.f.b.k.m.m> r10 = r0.f10436k
            java.lang.Object r9 = r10.get(r9)
            f.f.b.k.m.m r9 = (p086f.p103f.p107b.p108k.p109m.C3257m) r9
            f.f.b.k.e r10 = r9.f10478b
            int r10 = r10.mo11292M()
            r11 = 8
            if (r10 != r11) goto L_0x027c
            f.f.b.k.m.f r10 = r9.f10484h
            r10.mo11406d(r7)
            f.f.b.k.m.f r9 = r9.f10485i
            r9.mo11406d(r7)
            goto L_0x02cb
        L_0x027c:
            if (r2 <= 0) goto L_0x0283
            if (r1 == 0) goto L_0x0282
            int r7 = r7 - r3
            goto L_0x0283
        L_0x0282:
            int r7 = r7 + r3
        L_0x0283:
            if (r2 <= 0) goto L_0x0290
            if (r2 < r5) goto L_0x0290
            f.f.b.k.m.f r10 = r9.f10484h
            int r10 = r10.f10451f
            if (r1 == 0) goto L_0x028f
            int r7 = r7 - r10
            goto L_0x0290
        L_0x028f:
            int r7 = r7 + r10
        L_0x0290:
            if (r1 == 0) goto L_0x0295
            f.f.b.k.m.f r10 = r9.f10485i
            goto L_0x0297
        L_0x0295:
            f.f.b.k.m.f r10 = r9.f10484h
        L_0x0297:
            r10.mo11406d(r7)
            f.f.b.k.m.g r10 = r9.f10481e
            int r11 = r10.f10452g
            f.f.b.k.e$b r12 = r9.f10480d
            f.f.b.k.e$b r13 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x02ab
            int r12 = r9.f10477a
            r13 = 1
            if (r12 != r13) goto L_0x02ab
            int r11 = r10.f10467m
        L_0x02ab:
            if (r1 == 0) goto L_0x02af
            int r7 = r7 - r11
            goto L_0x02b0
        L_0x02af:
            int r7 = r7 + r11
        L_0x02b0:
            if (r1 == 0) goto L_0x02b5
            f.f.b.k.m.f r10 = r9.f10484h
            goto L_0x02b7
        L_0x02b5:
            f.f.b.k.m.f r10 = r9.f10485i
        L_0x02b7:
            r10.mo11406d(r7)
            r10 = 1
            r9.f10483g = r10
            if (r2 >= r8) goto L_0x02cb
            if (r2 >= r6) goto L_0x02cb
            f.f.b.k.m.f r9 = r9.f10485i
            int r9 = r9.f10451f
            int r9 = -r9
            if (r1 == 0) goto L_0x02ca
            int r7 = r7 - r9
            goto L_0x02cb
        L_0x02ca:
            int r7 = r7 + r9
        L_0x02cb:
            int r2 = r2 + 1
            goto L_0x0255
        L_0x02ce:
            if (r9 != 0) goto L_0x0352
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r3 = r3 / r2
            if (r15 <= 0) goto L_0x02d7
            r3 = 0
        L_0x02d7:
            r7 = r21
            r2 = 0
        L_0x02da:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x02e3
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x02e4
        L_0x02e3:
            r9 = r2
        L_0x02e4:
            java.util.ArrayList<f.f.b.k.m.m> r10 = r0.f10436k
            java.lang.Object r9 = r10.get(r9)
            f.f.b.k.m.m r9 = (p086f.p103f.p107b.p108k.p109m.C3257m) r9
            f.f.b.k.e r10 = r9.f10478b
            int r10 = r10.mo11292M()
            r11 = 8
            if (r10 != r11) goto L_0x0301
            f.f.b.k.m.f r10 = r9.f10484h
            r10.mo11406d(r7)
            f.f.b.k.m.f r9 = r9.f10485i
            r9.mo11406d(r7)
            goto L_0x034f
        L_0x0301:
            if (r1 == 0) goto L_0x0305
            int r7 = r7 - r3
            goto L_0x0306
        L_0x0305:
            int r7 = r7 + r3
        L_0x0306:
            if (r2 <= 0) goto L_0x0313
            if (r2 < r5) goto L_0x0313
            f.f.b.k.m.f r10 = r9.f10484h
            int r10 = r10.f10451f
            if (r1 == 0) goto L_0x0312
            int r7 = r7 - r10
            goto L_0x0313
        L_0x0312:
            int r7 = r7 + r10
        L_0x0313:
            if (r1 == 0) goto L_0x0318
            f.f.b.k.m.f r10 = r9.f10485i
            goto L_0x031a
        L_0x0318:
            f.f.b.k.m.f r10 = r9.f10484h
        L_0x031a:
            r10.mo11406d(r7)
            f.f.b.k.m.g r10 = r9.f10481e
            int r11 = r10.f10452g
            f.f.b.k.e$b r12 = r9.f10480d
            f.f.b.k.e$b r13 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x0332
            int r12 = r9.f10477a
            r13 = 1
            if (r12 != r13) goto L_0x0332
            int r10 = r10.f10467m
            int r11 = java.lang.Math.min(r11, r10)
        L_0x0332:
            if (r1 == 0) goto L_0x0336
            int r7 = r7 - r11
            goto L_0x0337
        L_0x0336:
            int r7 = r7 + r11
        L_0x0337:
            if (r1 == 0) goto L_0x033c
            f.f.b.k.m.f r10 = r9.f10484h
            goto L_0x033e
        L_0x033c:
            f.f.b.k.m.f r10 = r9.f10485i
        L_0x033e:
            r10.mo11406d(r7)
            if (r2 >= r8) goto L_0x034f
            if (r2 >= r6) goto L_0x034f
            f.f.b.k.m.f r9 = r9.f10485i
            int r9 = r9.f10451f
            int r9 = -r9
            if (r1 == 0) goto L_0x034e
            int r7 = r7 - r9
            goto L_0x034f
        L_0x034e:
            int r7 = r7 + r9
        L_0x034f:
            int r2 = r2 + 1
            goto L_0x02da
        L_0x0352:
            r2 = 2
            if (r9 != r2) goto L_0x03f4
            int r2 = r0.f10482f
            if (r2 != 0) goto L_0x0360
            f.f.b.k.e r2 = r0.f10478b
            float r2 = r2.mo11338u()
            goto L_0x0366
        L_0x0360:
            f.f.b.k.e r2 = r0.f10478b
            float r2 = r2.mo11288I()
        L_0x0366:
            if (r1 == 0) goto L_0x036c
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x036c:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0378
            if (r15 <= 0) goto L_0x0379
        L_0x0378:
            r2 = 0
        L_0x0379:
            if (r1 == 0) goto L_0x037e
            int r2 = r21 - r2
            goto L_0x0380
        L_0x037e:
            int r2 = r21 + r2
        L_0x0380:
            r3 = r2
            r2 = 0
        L_0x0382:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x038b
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L_0x038c
        L_0x038b:
            r7 = r2
        L_0x038c:
            java.util.ArrayList<f.f.b.k.m.m> r9 = r0.f10436k
            java.lang.Object r7 = r9.get(r7)
            f.f.b.k.m.m r7 = (p086f.p103f.p107b.p108k.p109m.C3257m) r7
            f.f.b.k.e r9 = r7.f10478b
            int r9 = r9.mo11292M()
            r10 = 8
            if (r9 != r10) goto L_0x03aa
            f.f.b.k.m.f r9 = r7.f10484h
            r9.mo11406d(r3)
            f.f.b.k.m.f r7 = r7.f10485i
            r7.mo11406d(r3)
            r13 = 1
            goto L_0x03f1
        L_0x03aa:
            if (r2 <= 0) goto L_0x03b7
            if (r2 < r5) goto L_0x03b7
            f.f.b.k.m.f r9 = r7.f10484h
            int r9 = r9.f10451f
            if (r1 == 0) goto L_0x03b6
            int r3 = r3 - r9
            goto L_0x03b7
        L_0x03b6:
            int r3 = r3 + r9
        L_0x03b7:
            if (r1 == 0) goto L_0x03bc
            f.f.b.k.m.f r9 = r7.f10485i
            goto L_0x03be
        L_0x03bc:
            f.f.b.k.m.f r9 = r7.f10484h
        L_0x03be:
            r9.mo11406d(r3)
            f.f.b.k.m.g r9 = r7.f10481e
            int r11 = r9.f10452g
            f.f.b.k.e$b r12 = r7.f10480d
            f.f.b.k.e$b r13 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x03d3
            int r12 = r7.f10477a
            r13 = 1
            if (r12 != r13) goto L_0x03d4
            int r11 = r9.f10467m
            goto L_0x03d4
        L_0x03d3:
            r13 = 1
        L_0x03d4:
            if (r1 == 0) goto L_0x03d8
            int r3 = r3 - r11
            goto L_0x03d9
        L_0x03d8:
            int r3 = r3 + r11
        L_0x03d9:
            if (r1 == 0) goto L_0x03de
            f.f.b.k.m.f r9 = r7.f10484h
            goto L_0x03e0
        L_0x03de:
            f.f.b.k.m.f r9 = r7.f10485i
        L_0x03e0:
            r9.mo11406d(r3)
            if (r2 >= r8) goto L_0x03f1
            if (r2 >= r6) goto L_0x03f1
            f.f.b.k.m.f r7 = r7.f10485i
            int r7 = r7.f10451f
            int r7 = -r7
            if (r1 == 0) goto L_0x03f0
            int r3 = r3 - r7
            goto L_0x03f1
        L_0x03f0:
            int r3 = r3 + r7
        L_0x03f1:
            int r2 = r2 + 1
            goto L_0x0382
        L_0x03f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3244c.mo11388a(f.f.b.k.m.d):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11389d() {
        /*
            r5 = this;
            java.util.ArrayList<f.f.b.k.m.m> r0 = r5.f10436k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            f.f.b.k.m.m r1 = (p086f.p103f.p107b.p108k.p109m.C3257m) r1
            r1.mo11389d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<f.f.b.k.m.m> r0 = r5.f10436k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<f.f.b.k.m.m> r2 = r5.f10436k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            f.f.b.k.m.m r2 = (p086f.p103f.p107b.p108k.p109m.C3257m) r2
            f.f.b.k.e r2 = r2.f10478b
            java.util.ArrayList<f.f.b.k.m.m> r4 = r5.f10436k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            f.f.b.k.m.m r0 = (p086f.p103f.p107b.p108k.p109m.C3257m) r0
            f.f.b.k.e r0 = r0.f10478b
            int r4 = r5.f10482f
            if (r4 != 0) goto L_0x0070
            f.f.b.k.d r1 = r2.f10388y
            f.f.b.k.d r0 = r0.f10333A
            f.f.b.k.m.f r2 = r5.mo11418i(r1, r3)
            int r1 = r1.mo11261b()
            f.f.b.k.e r4 = r5.m13998r()
            if (r4 == 0) goto L_0x0052
            f.f.b.k.d r1 = r4.f10388y
            int r1 = r1.mo11261b()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            f.f.b.k.m.f r4 = r5.f10484h
            r5.mo11414b(r4, r2, r1)
        L_0x0059:
            f.f.b.k.m.f r1 = r5.mo11418i(r0, r3)
            int r0 = r0.mo11261b()
            f.f.b.k.e r2 = r5.m13999s()
            if (r2 == 0) goto L_0x006d
            f.f.b.k.d r0 = r2.f10333A
            int r0 = r0.mo11261b()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            f.f.b.k.d r2 = r2.f10389z
            f.f.b.k.d r0 = r0.f10334B
            f.f.b.k.m.f r3 = r5.mo11418i(r2, r1)
            int r2 = r2.mo11261b()
            f.f.b.k.e r4 = r5.m13998r()
            if (r4 == 0) goto L_0x0088
            f.f.b.k.d r2 = r4.f10389z
            int r2 = r2.mo11261b()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            f.f.b.k.m.f r4 = r5.f10484h
            r5.mo11414b(r4, r3, r2)
        L_0x008f:
            f.f.b.k.m.f r1 = r5.mo11418i(r0, r1)
            int r0 = r0.mo11261b()
            f.f.b.k.e r2 = r5.m13999s()
            if (r2 == 0) goto L_0x00a3
            f.f.b.k.d r0 = r2.f10334B
            int r0 = r0.mo11261b()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            f.f.b.k.m.f r2 = r5.f10485i
            int r0 = -r0
            r5.mo11414b(r2, r1, r0)
        L_0x00ab:
            f.f.b.k.m.f r0 = r5.f10484h
            r0.f10446a = r5
            f.f.b.k.m.f r0 = r5.f10485i
            r0.f10446a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3244c.mo11389d():void");
    }

    /* renamed from: e */
    public void mo11390e() {
        for (int i = 0; i < this.f10436k.size(); i++) {
            this.f10436k.get(i).mo11390e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11391f() {
        this.f10479c = null;
        Iterator<C3257m> it = this.f10436k.iterator();
        while (it.hasNext()) {
            it.next().mo11391f();
        }
    }

    /* renamed from: j */
    public long mo11392j() {
        int size = this.f10436k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C3257m mVar = this.f10436k.get(i);
            j = j + ((long) mVar.f10484h.f10451f) + mVar.mo11392j() + ((long) mVar.f10485i.f10451f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11393m() {
        int size = this.f10436k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f10436k.get(i).mo11393m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f10482f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<C3257m> it = this.f10436k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
