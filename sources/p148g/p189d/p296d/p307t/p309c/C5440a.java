package p148g.p189d.p296d.p307t.p309c;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5417g;
import p148g.p189d.p296d.p304s.C5419i;
import p148g.p189d.p296d.p304s.p305m.C5424b;

/* renamed from: g.d.d.t.c.a */
public final class C5440a {

    /* renamed from: a */
    private final C5412b f15760a;

    /* renamed from: b */
    private final C5424b f15761b;

    public C5440a(C5412b bVar) throws C5377i {
        this.f15760a = bVar;
        this.f15761b = new C5424b(bVar);
    }

    /* renamed from: a */
    private C5383o m22428a(C5383o[] oVarArr) {
        C5383o oVar = oVarArr[0];
        C5383o oVar2 = oVarArr[1];
        C5383o oVar3 = oVarArr[2];
        C5383o oVar4 = oVarArr[3];
        int j = m22436j(oVar, oVar4);
        C5383o h = m22434h(oVar, oVar2, (m22436j(oVar2, oVar4) + 1) << 2);
        C5383o h2 = m22434h(oVar3, oVar2, (j + 1) << 2);
        int j2 = m22436j(h, oVar4);
        int j3 = m22436j(h2, oVar4);
        float f = (float) (j2 + 1);
        C5383o oVar5 = new C5383o(oVar4.mo15618c() + ((oVar3.mo15618c() - oVar2.mo15618c()) / f), oVar4.mo15619d() + ((oVar3.mo15619d() - oVar2.mo15619d()) / f));
        float f2 = (float) (j3 + 1);
        C5383o oVar6 = new C5383o(oVar4.mo15618c() + ((oVar.mo15618c() - oVar2.mo15618c()) / f2), oVar4.mo15619d() + ((oVar.mo15619d() - oVar2.mo15619d()) / f2));
        if (m22431e(oVar5)) {
            return (m22431e(oVar6) && m22436j(h, oVar5) + m22436j(h2, oVar5) <= m22436j(h, oVar6) + m22436j(h2, oVar6)) ? oVar6 : oVar5;
        }
        if (m22431e(oVar6)) {
            return oVar6;
        }
        return null;
    }

    /* renamed from: c */
    private C5383o[] m22429c(C5383o[] oVarArr) {
        C5383o oVar = oVarArr[0];
        C5383o oVar2 = oVarArr[1];
        C5383o oVar3 = oVarArr[3];
        C5383o oVar4 = oVarArr[2];
        int j = m22436j(oVar, oVar2);
        int j2 = m22436j(oVar2, oVar3);
        int j3 = m22436j(oVar3, oVar4);
        int j4 = m22436j(oVar4, oVar);
        C5383o[] oVarArr2 = {oVar4, oVar, oVar2, oVar3};
        if (j > j2) {
            oVarArr2[0] = oVar;
            oVarArr2[1] = oVar2;
            oVarArr2[2] = oVar3;
            oVarArr2[3] = oVar4;
            j = j2;
        }
        if (j > j3) {
            oVarArr2[0] = oVar2;
            oVarArr2[1] = oVar3;
            oVarArr2[2] = oVar4;
            oVarArr2[3] = oVar;
        } else {
            j3 = j;
        }
        if (j3 > j4) {
            oVarArr2[0] = oVar3;
            oVarArr2[1] = oVar4;
            oVarArr2[2] = oVar;
            oVarArr2[3] = oVar2;
        }
        return oVarArr2;
    }

    /* renamed from: d */
    private C5383o[] m22430d(C5383o[] oVarArr) {
        C5383o oVar = oVarArr[0];
        C5383o oVar2 = oVarArr[1];
        C5383o oVar3 = oVarArr[2];
        C5383o oVar4 = oVarArr[3];
        int j = (m22436j(oVar, oVar4) + 1) << 2;
        if (m22436j(m22434h(oVar2, oVar3, j), oVar) < m22436j(m22434h(oVar3, oVar2, j), oVar4)) {
            oVarArr[0] = oVar;
            oVarArr[1] = oVar2;
            oVarArr[2] = oVar3;
            oVarArr[3] = oVar4;
        } else {
            oVarArr[0] = oVar2;
            oVarArr[1] = oVar3;
            oVarArr[2] = oVar4;
            oVarArr[3] = oVar;
        }
        return oVarArr;
    }

    /* renamed from: e */
    private boolean m22431e(C5383o oVar) {
        return oVar.mo15618c() >= 0.0f && oVar.mo15618c() < ((float) this.f15760a.mo15673n()) && oVar.mo15619d() > 0.0f && oVar.mo15619d() < ((float) this.f15760a.mo15670i());
    }

    /* renamed from: f */
    private static C5383o m22432f(C5383o oVar, float f, float f2) {
        float c = oVar.mo15618c();
        float d = oVar.mo15619d();
        return new C5383o(c < f ? c - 1.0f : c + 1.0f, d < f2 ? d - 1.0f : d + 1.0f);
    }

    /* renamed from: g */
    private static C5412b m22433g(C5412b bVar, C5383o oVar, C5383o oVar2, C5383o oVar3, C5383o oVar4, int i, int i2) throws C5377i {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C5419i.m22341b().mo15697c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, oVar.mo15618c(), oVar.mo15619d(), oVar4.mo15618c(), oVar4.mo15619d(), oVar3.mo15618c(), oVar3.mo15619d(), oVar2.mo15618c(), oVar2.mo15619d());
    }

    /* renamed from: h */
    private static C5383o m22434h(C5383o oVar, C5383o oVar2, int i) {
        float f = (float) (i + 1);
        return new C5383o(oVar.mo15618c() + ((oVar2.mo15618c() - oVar.mo15618c()) / f), oVar.mo15619d() + ((oVar2.mo15619d() - oVar.mo15619d()) / f));
    }

    /* renamed from: i */
    private C5383o[] m22435i(C5383o[] oVarArr) {
        C5383o oVar = oVarArr[0];
        C5383o oVar2 = oVarArr[1];
        C5383o oVar3 = oVarArr[2];
        C5383o oVar4 = oVarArr[3];
        C5383o h = m22434h(oVar, oVar2, (m22436j(oVar3, oVar4) + 1) << 2);
        C5383o h2 = m22434h(oVar3, oVar2, (m22436j(oVar, oVar4) + 1) << 2);
        int j = m22436j(h, oVar4) + 1;
        int j2 = m22436j(h2, oVar4) + 1;
        if ((j & 1) == 1) {
            j++;
        }
        if ((j2 & 1) == 1) {
            j2++;
        }
        float c = (((oVar.mo15618c() + oVar2.mo15618c()) + oVar3.mo15618c()) + oVar4.mo15618c()) / 4.0f;
        float d = (((oVar.mo15619d() + oVar2.mo15619d()) + oVar3.mo15619d()) + oVar4.mo15619d()) / 4.0f;
        C5383o f = m22432f(oVar, c, d);
        C5383o f2 = m22432f(oVar2, c, d);
        C5383o f3 = m22432f(oVar3, c, d);
        C5383o f4 = m22432f(oVar4, c, d);
        int i = j2 << 2;
        int i2 = j << 2;
        return new C5383o[]{m22434h(m22434h(f, f2, i), f4, i2), m22434h(m22434h(f2, f, i), f3, i2), m22434h(m22434h(f3, f4, i), f2, i2), m22434h(m22434h(f4, f3, i), f, i2)};
    }

    /* renamed from: j */
    private int m22436j(C5383o oVar, C5383o oVar2) {
        int c = (int) oVar.mo15618c();
        int d = (int) oVar.mo15619d();
        int c2 = (int) oVar2.mo15618c();
        int d2 = (int) oVar2.mo15619d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            int i3 = d;
            d = c;
            c = i3;
            int i4 = d2;
            d2 = c2;
            c2 = i4;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i5 = (-abs) / 2;
        int i6 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean e = this.f15760a.mo15665e(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean e2 = this.f15760a.mo15665e(z ? d : c, z ? c : d);
            if (e2 != e) {
                i++;
                e = e2;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d == d2) {
                    break;
                }
                d += i6;
                i5 -= abs;
            }
            c += i2;
        }
        return i;
    }

    /* renamed from: b */
    public C5417g mo15742b() throws C5377i {
        int i;
        int i2;
        C5383o[] c = m22429c(this.f15761b.mo15704c());
        m22430d(c);
        c[3] = m22428a(c);
        if (c[3] != null) {
            C5383o[] i3 = m22435i(c);
            C5383o oVar = i3[0];
            C5383o oVar2 = i3[1];
            C5383o oVar3 = i3[2];
            C5383o oVar4 = i3[3];
            int j = m22436j(oVar, oVar4) + 1;
            int j2 = m22436j(oVar3, oVar4) + 1;
            if ((j & 1) == 1) {
                j++;
            }
            if ((j2 & 1) == 1) {
                j2++;
            }
            if (j * 4 >= j2 * 7 || j2 * 4 >= j * 7) {
                i2 = j;
                i = j2;
            } else {
                i2 = Math.max(j, j2);
                i = i2;
            }
            return new C5417g(m22433g(this.f15760a, oVar, oVar2, oVar3, oVar4, i2, i), new C5383o[]{oVar, oVar2, oVar3, oVar4});
        }
        throw C5377i.m22193a();
    }
}
