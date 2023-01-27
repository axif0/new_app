package p086f.p103f.p107b.p108k.p109m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3232f;
import p086f.p103f.p107b.p108k.C3233g;
import p086f.p103f.p107b.p108k.C3236i;
import p086f.p103f.p107b.p108k.p109m.C3241b;

/* renamed from: f.f.b.k.m.e */
public class C3246e {

    /* renamed from: a */
    private C3232f f10438a;

    /* renamed from: b */
    private boolean f10439b = true;

    /* renamed from: c */
    private boolean f10440c = true;

    /* renamed from: d */
    private C3232f f10441d;

    /* renamed from: e */
    private ArrayList<C3257m> f10442e = new ArrayList<>();

    /* renamed from: f */
    private C3241b.C3243b f10443f;

    /* renamed from: g */
    private C3241b.C3242a f10444g;

    /* renamed from: h */
    ArrayList<C3254k> f10445h;

    public C3246e(C3232f fVar) {
        new ArrayList();
        this.f10443f = null;
        this.f10444g = new C3241b.C3242a();
        this.f10445h = new ArrayList<>();
        this.f10438a = fVar;
        this.f10441d = fVar;
    }

    /* renamed from: a */
    private void m14007a(C3247f fVar, int i, int i2, C3247f fVar2, ArrayList<C3254k> arrayList, C3254k kVar) {
        C3257m mVar = fVar.f10449d;
        if (mVar.f10479c == null) {
            C3232f fVar3 = this.f10438a;
            if (mVar != fVar3.f10365d && mVar != fVar3.f10367e) {
                if (kVar == null) {
                    kVar = new C3254k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f10479c = kVar;
                kVar.mo11410a(mVar);
                for (C3245d next : mVar.f10484h.f10456k) {
                    if (next instanceof C3247f) {
                        m14007a((C3247f) next, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (C3245d next2 : mVar.f10485i.f10456k) {
                    if (next2 instanceof C3247f) {
                        m14007a((C3247f) next2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C3255l)) {
                    for (C3245d next3 : ((C3255l) mVar).f10474k.f10456k) {
                        if (next3 instanceof C3247f) {
                            m14007a((C3247f) next3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C3247f next4 : mVar.f10484h.f10457l) {
                    if (next4 == fVar2) {
                        kVar.f10471a = true;
                    }
                    m14007a(next4, i, 0, fVar2, arrayList, kVar);
                }
                for (C3247f next5 : mVar.f10485i.f10457l) {
                    if (next5 == fVar2) {
                        kVar.f10471a = true;
                    }
                    m14007a(next5, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C3255l)) {
                    for (C3247f a : ((C3255l) mVar).f10474k.f10457l) {
                        m14007a(a, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01be, code lost:
        if (r3[3].f10317d != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e0, code lost:
        r2 = r14.f10342J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r1.f10374k == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0148, code lost:
        if (r3[1].f10317d != null) goto L_0x0150;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m14008b(p086f.p103f.p107b.p108k.C3232f r14) {
        /*
            r13 = this;
            java.util.ArrayList<f.f.b.k.e> r0 = r14.f10422g0
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0273
            java.lang.Object r1 = r0.next()
            f.f.b.k.e r1 = (p086f.p103f.p107b.p108k.C3229e) r1
            f.f.b.k.e$b[] r3 = r1.f10342J
            r4 = r3[r2]
            r9 = 1
            r3 = r3[r9]
            int r5 = r1.mo11292M()
            r6 = 8
            if (r5 != r6) goto L_0x0025
        L_0x0022:
            r1.f10359a = r9
            goto L_0x0006
        L_0x0025:
            float r5 = r1.f10378o
            r10 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0034
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0034
            r1.f10373j = r6
        L_0x0034:
            float r5 = r1.f10381r
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0040
            r1.f10374k = r6
        L_0x0040:
            float r5 = r1.mo11332r()
            r7 = 0
            r8 = 3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0079
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0059
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r3 == r5) goto L_0x0056
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r3 != r5) goto L_0x0059
        L_0x0056:
            r1.f10373j = r8
            goto L_0x0079
        L_0x0059:
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0068
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r4 == r5) goto L_0x0065
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r4 != r5) goto L_0x0068
        L_0x0065:
            r1.f10374k = r8
            goto L_0x0079
        L_0x0068:
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0079
            if (r3 != r5) goto L_0x0079
            int r5 = r1.f10373j
            if (r5 != 0) goto L_0x0074
            r1.f10373j = r8
        L_0x0074:
            int r5 = r1.f10374k
            if (r5 != 0) goto L_0x0079
            goto L_0x0065
        L_0x0079:
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x008f
            int r5 = r1.f10373j
            if (r5 != r9) goto L_0x008f
            f.f.b.k.d r5 = r1.f10388y
            f.f.b.k.d r5 = r5.f10317d
            if (r5 == 0) goto L_0x008d
            f.f.b.k.d r5 = r1.f10333A
            f.f.b.k.d r5 = r5.f10317d
            if (r5 != 0) goto L_0x008f
        L_0x008d:
            f.f.b.k.e$b r4 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
        L_0x008f:
            r5 = r4
            f.f.b.k.e$b r4 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00a6
            int r4 = r1.f10374k
            if (r4 != r9) goto L_0x00a6
            f.f.b.k.d r4 = r1.f10389z
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x00a4
            f.f.b.k.d r4 = r1.f10334B
            f.f.b.k.d r4 = r4.f10317d
            if (r4 != 0) goto L_0x00a6
        L_0x00a4:
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
        L_0x00a6:
            r7 = r3
            f.f.b.k.m.j r3 = r1.f10365d
            r3.f10480d = r5
            int r4 = r1.f10373j
            r3.f10477a = r4
            f.f.b.k.m.l r3 = r1.f10367e
            r3.f10480d = r7
            int r4 = r1.f10374k
            r3.f10477a = r4
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r5 == r3) goto L_0x00c3
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r5 == r3) goto L_0x00c3
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r5 != r3) goto L_0x00d1
        L_0x00c3:
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r7 == r3) goto L_0x021e
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r7 == r3) goto L_0x021e
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r7 != r3) goto L_0x00d1
            goto L_0x021e
        L_0x00d1:
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r3) goto L_0x0150
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r7 == r3) goto L_0x00df
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r7 != r3) goto L_0x0150
        L_0x00df:
            int r3 = r1.f10373j
            if (r3 != r8) goto L_0x0102
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r7 != r2) goto L_0x00f0
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r2
            r7 = r2
            r3.m14011l(r4, r5, r6, r7, r8)
        L_0x00f0:
            int r8 = r1.mo11336t()
            float r2 = (float) r8
            float r3 = r1.f10346N
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
        L_0x00fb:
            f.f.b.k.e$b r7 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r3 = r13
            r4 = r1
            r5 = r7
            goto L_0x0258
        L_0x0102:
            if (r3 != r9) goto L_0x0119
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m14011l(r4, r5, r6, r7, r8)
            f.f.b.k.m.j r2 = r1.f10365d
            f.f.b.k.m.g r2 = r2.f10481e
            int r1 = r1.mo11293N()
        L_0x0115:
            r2.f10467m = r1
            goto L_0x0006
        L_0x0119:
            if (r3 != r6) goto L_0x013c
            f.f.b.k.e$b[] r3 = r14.f10342J
            r4 = r3[r2]
            f.f.b.k.e$b r12 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r4 == r12) goto L_0x0129
            r3 = r3[r2]
            f.f.b.k.e$b r4 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r3 != r4) goto L_0x0150
        L_0x0129:
            float r2 = r1.f10378o
            int r3 = r14.mo11293N()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            int r8 = r1.mo11336t()
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            goto L_0x0256
        L_0x013c:
            f.f.b.k.d[] r3 = r1.f10339G
            r4 = r3[r2]
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x014a
            r3 = r3[r9]
            f.f.b.k.d r3 = r3.f10317d
            if (r3 != 0) goto L_0x0150
        L_0x014a:
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            goto L_0x0256
        L_0x0150:
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r7 != r3) goto L_0x01c1
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r5 == r3) goto L_0x015c
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r5 != r3) goto L_0x01c1
        L_0x015c:
            int r3 = r1.f10374k
            if (r3 != r8) goto L_0x0182
            f.f.b.k.e$b r7 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r5 != r7) goto L_0x016c
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m14011l(r4, r5, r6, r7, r8)
        L_0x016c:
            int r6 = r1.mo11293N()
            float r2 = r1.f10346N
            int r3 = r1.mo11334s()
            r4 = -1
            if (r3 != r4) goto L_0x017b
            float r2 = r10 / r2
        L_0x017b:
            float r3 = (float) r6
        L_0x017c:
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            goto L_0x00fb
        L_0x0182:
            if (r3 != r9) goto L_0x018f
            r6 = 0
            f.f.b.k.e$b r7 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m14011l(r4, r5, r6, r7, r8)
            goto L_0x0214
        L_0x018f:
            if (r3 != r6) goto L_0x01b2
            f.f.b.k.e$b[] r3 = r14.f10342J
            r4 = r3[r9]
            f.f.b.k.e$b r8 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r4 == r8) goto L_0x019f
            r3 = r3[r9]
            f.f.b.k.e$b r4 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r3 != r4) goto L_0x01c1
        L_0x019f:
            float r2 = r1.f10381r
            int r6 = r1.mo11293N()
            int r3 = r14.mo11336t()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r8 = (int) r2
            f.f.b.k.e$b r7 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            goto L_0x0256
        L_0x01b2:
            f.f.b.k.d[] r3 = r1.f10339G
            r4 = r3[r6]
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x014a
            r3 = r3[r8]
            f.f.b.k.d r3 = r3.f10317d
            if (r3 != 0) goto L_0x01c1
            goto L_0x014a
        L_0x01c1:
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r5 != r3) goto L_0x0006
            if (r7 != r3) goto L_0x0006
            int r3 = r1.f10373j
            if (r3 == r9) goto L_0x0200
            int r4 = r1.f10374k
            if (r4 != r9) goto L_0x01d0
            goto L_0x0200
        L_0x01d0:
            if (r4 != r6) goto L_0x0006
            if (r3 != r6) goto L_0x0006
            f.f.b.k.e$b[] r3 = r14.f10342J
            r4 = r3[r2]
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r4 == r5) goto L_0x01e0
            r2 = r3[r2]
            if (r2 != r5) goto L_0x0006
        L_0x01e0:
            f.f.b.k.e$b[] r2 = r14.f10342J
            r3 = r2[r9]
            f.f.b.k.e$b r4 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r3 == r4) goto L_0x01ec
            r2 = r2[r9]
            if (r2 != r4) goto L_0x0006
        L_0x01ec:
            float r2 = r1.f10378o
            float r3 = r1.f10381r
            int r4 = r14.mo11293N()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r14.mo11336t()
            float r2 = (float) r2
            goto L_0x017c
        L_0x0200:
            f.f.b.k.e$b r7 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m14011l(r4, r5, r6, r7, r8)
            f.f.b.k.m.j r2 = r1.f10365d
            f.f.b.k.m.g r2 = r2.f10481e
            int r3 = r1.mo11293N()
            r2.f10467m = r3
        L_0x0214:
            f.f.b.k.m.l r2 = r1.f10367e
            f.f.b.k.m.g r2 = r2.f10481e
            int r1 = r1.mo11336t()
            goto L_0x0115
        L_0x021e:
            int r2 = r1.mo11293N()
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r5 != r3) goto L_0x0239
            int r2 = r14.mo11293N()
            f.f.b.k.d r3 = r1.f10388y
            int r3 = r3.f10318e
            int r2 = r2 - r3
            f.f.b.k.d r3 = r1.f10333A
            int r3 = r3.f10318e
            int r2 = r2 - r3
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r6 = r2
            r5 = r3
            goto L_0x023a
        L_0x0239:
            r6 = r2
        L_0x023a:
            int r2 = r1.mo11336t()
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r7 != r3) goto L_0x0255
            int r2 = r14.mo11336t()
            f.f.b.k.d r3 = r1.f10389z
            int r3 = r3.f10318e
            int r2 = r2 - r3
            f.f.b.k.d r3 = r1.f10334B
            int r3 = r3.f10318e
            int r2 = r2 - r3
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r8 = r2
            r7 = r3
            goto L_0x0256
        L_0x0255:
            r8 = r2
        L_0x0256:
            r3 = r13
            r4 = r1
        L_0x0258:
            r3.m14011l(r4, r5, r6, r7, r8)
            f.f.b.k.m.j r2 = r1.f10365d
            f.f.b.k.m.g r2 = r2.f10481e
            int r3 = r1.mo11293N()
            r2.mo11406d(r3)
            f.f.b.k.m.l r2 = r1.f10367e
            f.f.b.k.m.g r2 = r2.f10481e
            int r3 = r1.mo11336t()
            r2.mo11406d(r3)
            goto L_0x0022
        L_0x0273:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3246e.m14008b(f.f.b.k.f):boolean");
    }

    /* renamed from: e */
    private int m14009e(C3232f fVar, int i) {
        int size = this.f10445h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f10445h.get(i2).mo11411b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m14010i(C3257m mVar, int i, ArrayList<C3254k> arrayList) {
        for (C3245d next : mVar.f10484h.f10456k) {
            if (next instanceof C3247f) {
                m14007a((C3247f) next, i, 0, mVar.f10485i, arrayList, (C3254k) null);
            } else if (next instanceof C3257m) {
                m14007a(((C3257m) next).f10484h, i, 0, mVar.f10485i, arrayList, (C3254k) null);
            }
        }
        for (C3245d next2 : mVar.f10485i.f10456k) {
            if (next2 instanceof C3247f) {
                m14007a((C3247f) next2, i, 1, mVar.f10484h, arrayList, (C3254k) null);
            } else if (next2 instanceof C3257m) {
                m14007a(((C3257m) next2).f10485i, i, 1, mVar.f10484h, arrayList, (C3254k) null);
            }
        }
        if (i == 1) {
            for (C3245d next3 : ((C3255l) mVar).f10474k.f10456k) {
                if (next3 instanceof C3247f) {
                    m14007a((C3247f) next3, i, 2, (C3247f) null, arrayList, (C3254k) null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m14011l(C3229e eVar, C3229e.C3231b bVar, int i, C3229e.C3231b bVar2, int i2) {
        C3241b.C3242a aVar = this.f10444g;
        aVar.f10426a = bVar;
        aVar.f10427b = bVar2;
        aVar.f10428c = i;
        aVar.f10429d = i2;
        this.f10443f.mo2612a(eVar, aVar);
        eVar.mo11276B0(this.f10444g.f10430e);
        eVar.mo11310e0(this.f10444g.f10431f);
        eVar.mo11308d0(this.f10444g.f10433h);
        eVar.mo11303Y(this.f10444g.f10432g);
    }

    /* renamed from: c */
    public void mo11395c() {
        mo11396d(this.f10442e);
        this.f10445h.clear();
        C3254k.f10470d = 0;
        m14010i(this.f10438a.f10365d, 0, this.f10445h);
        m14010i(this.f10438a.f10367e, 1, this.f10445h);
        this.f10439b = false;
    }

    /* renamed from: d */
    public void mo11396d(ArrayList<C3257m> arrayList) {
        Object iVar;
        arrayList.clear();
        this.f10441d.f10365d.mo11391f();
        this.f10441d.f10367e.mo11391f();
        arrayList.add(this.f10441d.f10365d);
        arrayList.add(this.f10441d.f10367e);
        Iterator<C3229e> it = this.f10441d.f10422g0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3229e next = it.next();
            if (next instanceof C3233g) {
                iVar = new C3250h(next);
            } else {
                if (next.mo11298T()) {
                    if (next.f10361b == null) {
                        next.f10361b = new C3244c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10361b);
                } else {
                    arrayList.add(next.f10365d);
                }
                if (next.mo11300V()) {
                    if (next.f10363c == null) {
                        next.f10363c = new C3244c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10363c);
                } else {
                    arrayList.add(next.f10367e);
                }
                if (next instanceof C3236i) {
                    iVar = new C3251i(next);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C3257m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo11391f();
        }
        Iterator<C3257m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C3257m next2 = it3.next();
            if (next2.f10478b != this.f10441d) {
                next2.mo11389d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo11397f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f10439b || this.f10440c) {
            Iterator<C3229e> it = this.f10438a.f10422g0.iterator();
            while (it.hasNext()) {
                C3229e next = it.next();
                next.f10359a = false;
                next.f10365d.mo11408r();
                next.f10367e.mo11412q();
            }
            C3232f fVar = this.f10438a;
            fVar.f10359a = false;
            fVar.f10365d.mo11408r();
            this.f10438a.f10367e.mo11412q();
            this.f10440c = false;
        }
        if (m14008b(this.f10441d)) {
            return false;
        }
        this.f10438a.mo11278C0(0);
        this.f10438a.mo11280D0(0);
        C3229e.C3231b q = this.f10438a.mo11330q(0);
        C3229e.C3231b q2 = this.f10438a.mo11330q(1);
        if (this.f10439b) {
            mo11395c();
        }
        int O = this.f10438a.mo11294O();
        int P = this.f10438a.mo11295P();
        this.f10438a.f10365d.f10484h.mo11406d(O);
        this.f10438a.f10367e.f10484h.mo11406d(P);
        mo11402m();
        C3229e.C3231b bVar = C3229e.C3231b.WRAP_CONTENT;
        if (q == bVar || q2 == bVar) {
            if (z4) {
                Iterator<C3257m> it2 = this.f10442e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo11393m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && q == C3229e.C3231b.WRAP_CONTENT) {
                this.f10438a.mo11315i0(C3229e.C3231b.FIXED);
                C3232f fVar2 = this.f10438a;
                fVar2.mo11276B0(m14009e(fVar2, 0));
                C3232f fVar3 = this.f10438a;
                fVar3.f10365d.f10481e.mo11406d(fVar3.mo11293N());
            }
            if (z4 && q2 == C3229e.C3231b.WRAP_CONTENT) {
                this.f10438a.mo11345x0(C3229e.C3231b.FIXED);
                C3232f fVar4 = this.f10438a;
                fVar4.mo11310e0(m14009e(fVar4, 1));
                C3232f fVar5 = this.f10438a;
                fVar5.f10367e.f10481e.mo11406d(fVar5.mo11336t());
            }
        }
        C3229e.C3231b[] bVarArr = this.f10438a.f10342J;
        if (bVarArr[0] == C3229e.C3231b.FIXED || bVarArr[0] == C3229e.C3231b.MATCH_PARENT) {
            int N = this.f10438a.mo11293N() + O;
            this.f10438a.f10365d.f10485i.mo11406d(N);
            this.f10438a.f10365d.f10481e.mo11406d(N - O);
            mo11402m();
            C3229e.C3231b[] bVarArr2 = this.f10438a.f10342J;
            if (bVarArr2[1] == C3229e.C3231b.FIXED || bVarArr2[1] == C3229e.C3231b.MATCH_PARENT) {
                int t = this.f10438a.mo11336t() + P;
                this.f10438a.f10367e.f10485i.mo11406d(t);
                this.f10438a.f10367e.f10481e.mo11406d(t - P);
            }
            mo11402m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<C3257m> it3 = this.f10442e.iterator();
        while (it3.hasNext()) {
            C3257m next2 = it3.next();
            if (next2.f10478b != this.f10438a || next2.f10483g) {
                next2.mo11390e();
            }
        }
        Iterator<C3257m> it4 = this.f10442e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C3257m next3 = it4.next();
            if ((z2 || next3.f10478b != this.f10438a) && (!next3.f10484h.f10455j || ((!next3.f10485i.f10455j && !(next3 instanceof C3250h)) || (!next3.f10481e.f10455j && !(next3 instanceof C3244c) && !(next3 instanceof C3250h))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f10438a.mo11315i0(q);
        this.f10438a.mo11345x0(q2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo11398g(boolean z) {
        if (this.f10439b) {
            Iterator<C3229e> it = this.f10438a.f10422g0.iterator();
            while (it.hasNext()) {
                C3229e next = it.next();
                next.f10359a = false;
                C3252j jVar = next.f10365d;
                jVar.f10481e.f10455j = false;
                jVar.f10483g = false;
                jVar.mo11408r();
                C3255l lVar = next.f10367e;
                lVar.f10481e.f10455j = false;
                lVar.f10483g = false;
                lVar.mo11412q();
            }
            C3232f fVar = this.f10438a;
            fVar.f10359a = false;
            C3252j jVar2 = fVar.f10365d;
            jVar2.f10481e.f10455j = false;
            jVar2.f10483g = false;
            jVar2.mo11408r();
            C3255l lVar2 = this.f10438a.f10367e;
            lVar2.f10481e.f10455j = false;
            lVar2.f10483g = false;
            lVar2.mo11412q();
            mo11395c();
        }
        if (m14008b(this.f10441d)) {
            return false;
        }
        this.f10438a.mo11278C0(0);
        this.f10438a.mo11280D0(0);
        this.f10438a.f10365d.f10484h.mo11406d(0);
        this.f10438a.f10367e.f10484h.mo11406d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0140 A[EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11399h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            f.f.b.k.f r1 = r9.f10438a
            r2 = 0
            f.f.b.k.e$b r1 = r1.mo11330q(r2)
            f.f.b.k.f r3 = r9.f10438a
            f.f.b.k.e$b r3 = r3.mo11330q(r0)
            f.f.b.k.f r4 = r9.f10438a
            int r4 = r4.mo11294O()
            f.f.b.k.f r5 = r9.f10438a
            int r5 = r5.mo11295P()
            if (r10 == 0) goto L_0x0086
            f.f.b.k.e$b r6 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<f.f.b.k.m.m> r6 = r9.f10442e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            f.f.b.k.m.m r7 = (p086f.p103f.p107b.p108k.p109m.C3257m) r7
            int r8 = r7.f10482f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo11393m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            f.f.b.k.e$b r10 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            f.f.b.k.f r10 = r9.f10438a
            f.f.b.k.e$b r6 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r10.mo11315i0(r6)
            f.f.b.k.f r10 = r9.f10438a
            int r6 = r9.m14009e(r10, r2)
            r10.mo11276B0(r6)
            f.f.b.k.f r10 = r9.f10438a
            f.f.b.k.m.j r6 = r10.f10365d
            f.f.b.k.m.g r6 = r6.f10481e
            int r10 = r10.mo11293N()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            f.f.b.k.e$b r10 = p086f.p103f.p107b.p108k.C3229e.C3231b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            f.f.b.k.f r10 = r9.f10438a
            f.f.b.k.e$b r6 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            r10.mo11345x0(r6)
            f.f.b.k.f r10 = r9.f10438a
            int r6 = r9.m14009e(r10, r0)
            r10.mo11310e0(r6)
            f.f.b.k.f r10 = r9.f10438a
            f.f.b.k.m.l r6 = r10.f10367e
            f.f.b.k.m.g r6 = r6.f10481e
            int r10 = r10.mo11336t()
        L_0x0083:
            r6.mo11406d(r10)
        L_0x0086:
            f.f.b.k.f r10 = r9.f10438a
            f.f.b.k.e$b[] r10 = r10.f10342J
            if (r11 != 0) goto L_0x00b3
            r5 = r10[r2]
            f.f.b.k.e$b r6 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r5 == r6) goto L_0x0098
            r10 = r10[r2]
            f.f.b.k.e$b r5 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r10 != r5) goto L_0x00c0
        L_0x0098:
            f.f.b.k.f r10 = r9.f10438a
            int r10 = r10.mo11293N()
            int r10 = r10 + r4
            f.f.b.k.f r5 = r9.f10438a
            f.f.b.k.m.j r5 = r5.f10365d
            f.f.b.k.m.f r5 = r5.f10485i
            r5.mo11406d(r10)
            f.f.b.k.f r5 = r9.f10438a
            f.f.b.k.m.j r5 = r5.f10365d
            f.f.b.k.m.g r5 = r5.f10481e
            int r10 = r10 - r4
            r5.mo11406d(r10)
            goto L_0x00dc
        L_0x00b3:
            r4 = r10[r0]
            f.f.b.k.e$b r6 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r4 == r6) goto L_0x00c2
            r10 = r10[r0]
            f.f.b.k.e$b r4 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r10 != r4) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = 0
            goto L_0x00dd
        L_0x00c2:
            f.f.b.k.f r10 = r9.f10438a
            int r10 = r10.mo11336t()
            int r10 = r10 + r5
            f.f.b.k.f r4 = r9.f10438a
            f.f.b.k.m.l r4 = r4.f10367e
            f.f.b.k.m.f r4 = r4.f10485i
            r4.mo11406d(r10)
            f.f.b.k.f r4 = r9.f10438a
            f.f.b.k.m.l r4 = r4.f10367e
            f.f.b.k.m.g r4 = r4.f10481e
            int r10 = r10 - r5
            r4.mo11406d(r10)
        L_0x00dc:
            r10 = 1
        L_0x00dd:
            r9.mo11402m()
            java.util.ArrayList<f.f.b.k.m.m> r4 = r9.f10442e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0106
            java.lang.Object r5 = r4.next()
            f.f.b.k.m.m r5 = (p086f.p103f.p107b.p108k.p109m.C3257m) r5
            int r6 = r5.f10482f
            if (r6 == r11) goto L_0x00f7
            goto L_0x00e6
        L_0x00f7:
            f.f.b.k.e r6 = r5.f10478b
            f.f.b.k.f r7 = r9.f10438a
            if (r6 != r7) goto L_0x0102
            boolean r6 = r5.f10483g
            if (r6 != 0) goto L_0x0102
            goto L_0x00e6
        L_0x0102:
            r5.mo11390e()
            goto L_0x00e6
        L_0x0106:
            java.util.ArrayList<f.f.b.k.m.m> r4 = r9.f10442e
            java.util.Iterator r4 = r4.iterator()
        L_0x010c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r4.next()
            f.f.b.k.m.m r5 = (p086f.p103f.p107b.p108k.p109m.C3257m) r5
            int r6 = r5.f10482f
            if (r6 == r11) goto L_0x011d
            goto L_0x010c
        L_0x011d:
            if (r10 != 0) goto L_0x0126
            f.f.b.k.e r6 = r5.f10478b
            f.f.b.k.f r7 = r9.f10438a
            if (r6 != r7) goto L_0x0126
            goto L_0x010c
        L_0x0126:
            f.f.b.k.m.f r6 = r5.f10484h
            boolean r6 = r6.f10455j
            if (r6 != 0) goto L_0x012e
        L_0x012c:
            r0 = 0
            goto L_0x0140
        L_0x012e:
            f.f.b.k.m.f r6 = r5.f10485i
            boolean r6 = r6.f10455j
            if (r6 != 0) goto L_0x0135
            goto L_0x012c
        L_0x0135:
            boolean r6 = r5 instanceof p086f.p103f.p107b.p108k.p109m.C3244c
            if (r6 != 0) goto L_0x010c
            f.f.b.k.m.g r5 = r5.f10481e
            boolean r5 = r5.f10455j
            if (r5 != 0) goto L_0x010c
            goto L_0x012c
        L_0x0140:
            f.f.b.k.f r10 = r9.f10438a
            r10.mo11315i0(r1)
            f.f.b.k.f r10 = r9.f10438a
            r10.mo11345x0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3246e.mo11399h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo11400j() {
        this.f10439b = true;
    }

    /* renamed from: k */
    public void mo11401k() {
        this.f10440c = true;
    }

    /* renamed from: m */
    public void mo11402m() {
        C3249g gVar;
        C3249g gVar2;
        int N;
        C3249g gVar3;
        int N2;
        Iterator<C3229e> it = this.f10438a.f10422g0.iterator();
        while (it.hasNext()) {
            C3229e next = it.next();
            if (!next.f10359a) {
                C3229e.C3231b[] bVarArr = next.f10342J;
                boolean z = false;
                C3229e.C3231b bVar = bVarArr[0];
                C3229e.C3231b bVar2 = bVarArr[1];
                int i = next.f10373j;
                int i2 = next.f10374k;
                boolean z2 = bVar == C3229e.C3231b.WRAP_CONTENT || (bVar == C3229e.C3231b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == C3229e.C3231b.WRAP_CONTENT || (bVar2 == C3229e.C3231b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C3249g gVar4 = next.f10365d.f10481e;
                boolean z3 = gVar4.f10455j;
                C3249g gVar5 = next.f10367e.f10481e;
                boolean z4 = gVar5.f10455j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            m14011l(next, C3229e.C3231b.WRAP_CONTENT, next.f10365d.f10481e.f10452g, C3229e.C3231b.FIXED, next.f10367e.f10481e.f10452g);
                            if (bVar == C3229e.C3231b.MATCH_CONSTRAINT) {
                                gVar3 = next.f10365d.f10481e;
                                N2 = next.mo11293N();
                            } else {
                                gVar2 = next.f10365d.f10481e;
                                N = next.mo11293N();
                                gVar2.mo11406d(N);
                            }
                        }
                        if (next.f10359a && (gVar = next.f10367e.f10475l) != null) {
                            gVar.mo11406d(next.mo11320l());
                        }
                    } else {
                        m14011l(next, C3229e.C3231b.FIXED, next.f10365d.f10481e.f10452g, C3229e.C3231b.WRAP_CONTENT, next.f10367e.f10481e.f10452g);
                        if (bVar2 == C3229e.C3231b.MATCH_CONSTRAINT) {
                            gVar3 = next.f10367e.f10481e;
                            N2 = next.mo11336t();
                        } else {
                            gVar2 = next.f10367e.f10481e;
                            N = next.mo11336t();
                            gVar2.mo11406d(N);
                        }
                    }
                    gVar3.f10467m = N2;
                    gVar.mo11406d(next.mo11320l());
                } else {
                    C3229e.C3231b bVar3 = C3229e.C3231b.FIXED;
                    m14011l(next, bVar3, gVar4.f10452g, bVar3, gVar5.f10452g);
                }
                next.f10359a = true;
                gVar.mo11406d(next.mo11320l());
            }
        }
    }

    /* renamed from: n */
    public void mo11403n(C3241b.C3243b bVar) {
        this.f10443f = bVar;
    }
}
