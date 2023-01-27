package p148g.p189d.p296d.p322y.p324c;

import java.util.Map;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.C5384p;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5417g;
import p148g.p189d.p296d.p304s.C5419i;
import p148g.p189d.p296d.p304s.C5421k;
import p148g.p189d.p296d.p304s.p305m.C5423a;
import p148g.p189d.p296d.p322y.p323b.C5533j;

/* renamed from: g.d.d.y.c.c */
public class C5538c {

    /* renamed from: a */
    private final C5412b f16017a;

    /* renamed from: b */
    private C5384p f16018b;

    public C5538c(C5412b bVar) {
        this.f16017a = bVar;
    }

    /* renamed from: b */
    private float m22881b(C5383o oVar, C5383o oVar2) {
        float j = m22886j((int) oVar.mo15618c(), (int) oVar.mo15619d(), (int) oVar2.mo15618c(), (int) oVar2.mo15619d());
        float j2 = m22886j((int) oVar2.mo15618c(), (int) oVar2.mo15619d(), (int) oVar.mo15618c(), (int) oVar.mo15619d());
        return Float.isNaN(j) ? j2 / 7.0f : Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m22882c(C5383o oVar, C5383o oVar2, C5383o oVar3, float f) throws C5377i {
        int c = ((C5423a.m22358c(C5383o.m22209b(oVar, oVar2) / f) + C5423a.m22358c(C5383o.m22209b(oVar, oVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: d */
    private static C5421k m22883d(C5383o oVar, C5383o oVar2, C5383o oVar3, C5383o oVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (oVar4 != null) {
            f2 = oVar4.mo15618c();
            f = oVar4.mo15619d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (oVar2.mo15618c() - oVar.mo15618c()) + oVar3.mo15618c();
            f = (oVar2.mo15619d() - oVar.mo15619d()) + oVar3.mo15619d();
            f3 = f4;
        }
        return C5421k.m22349b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, oVar.mo15618c(), oVar.mo15619d(), oVar2.mo15618c(), oVar2.mo15619d(), f2, f, oVar3.mo15618c(), oVar3.mo15619d());
    }

    /* renamed from: h */
    private static C5412b m22884h(C5412b bVar, C5421k kVar, int i) throws C5377i {
        return C5419i.m22341b().mo15698d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m22885i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C5538c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f16017a.mo15665e(i18, i19)) {
                if (i17 == 2) {
                    return C5423a.m22357b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C5423a.m22357b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m22886j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m22885i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f16017a.mo15673n()) {
            f = ((float) ((this.f16017a.mo15673n() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f16017a.mo15673n() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f16017a.mo15670i()) {
            f2 = ((float) ((this.f16017a.mo15670i() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f16017a.mo15670i() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m22885i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo15942a(C5383o oVar, C5383o oVar2, C5383o oVar3) {
        return (m22881b(oVar, oVar2) + m22881b(oVar, oVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C5417g mo15943e(Map<C5373e, ?> map) throws C5377i, C5374f {
        this.f16018b = map == null ? null : (C5384p) map.get(C5373e.NEED_RESULT_POINT_CALLBACK);
        return mo15945g(new C5540e(this.f16017a, this.f16018b).mo15951f(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C5536a mo15944f(float f, int i, int i2, float f2) throws C5377i {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f16017a.mo15673n() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f16017a.mo15670i() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C5537b(this.f16017a, max, max2, min, min2, f, this.f16018b).mo15941c();
            }
            throw C5377i.m22193a();
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C5417g mo15945g(C5543f fVar) throws C5377i, C5374f {
        C5383o[] oVarArr;
        C5539d b = fVar.mo15957b();
        C5539d c = fVar.mo15958c();
        C5539d a = fVar.mo15956a();
        float a2 = mo15942a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m22882c(b, c, a, a2);
            C5533j g = C5533j.m22862g(c2);
            int e = g.mo15930e() - 7;
            C5536a aVar = null;
            if (g.mo15929d().length > 0) {
                float c3 = (c.mo15618c() - b.mo15618c()) + a.mo15618c();
                float d = (c.mo15619d() - b.mo15619d()) + a.mo15619d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo15618c() + ((c3 - b.mo15618c()) * f));
                int d2 = (int) (b.mo15619d() + (f * (d - b.mo15619d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo15944f(a2, c4, d2, (float) i);
                        break;
                    } catch (C5377i unused) {
                        i <<= 1;
                    }
                }
            }
            C5412b h = m22884h(this.f16017a, m22883d(b, c, a, aVar, c2), c2);
            if (aVar == null) {
                oVarArr = new C5383o[]{a, b, c};
            } else {
                oVarArr = new C5383o[]{a, b, c, aVar};
            }
            return new C5417g(h, oVarArr);
        }
        throw C5377i.m22193a();
    }
}
