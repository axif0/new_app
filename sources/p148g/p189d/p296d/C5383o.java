package p148g.p189d.p296d;

import p148g.p189d.p296d.p304s.p305m.C5423a;

/* renamed from: g.d.d.o */
public class C5383o {

    /* renamed from: a */
    private final float f15575a;

    /* renamed from: b */
    private final float f15576b;

    public C5383o(float f, float f2) {
        this.f15575a = f;
        this.f15576b = f2;
    }

    /* renamed from: a */
    private static float m22208a(C5383o oVar, C5383o oVar2, C5383o oVar3) {
        float f = oVar2.f15575a;
        float f2 = oVar2.f15576b;
        return ((oVar3.f15575a - f) * (oVar.f15576b - f2)) - ((oVar3.f15576b - f2) * (oVar.f15575a - f));
    }

    /* renamed from: b */
    public static float m22209b(C5383o oVar, C5383o oVar2) {
        return C5423a.m22356a(oVar.f15575a, oVar.f15576b, oVar2.f15575a, oVar2.f15576b);
    }

    /* renamed from: e */
    public static void m22210e(C5383o[] oVarArr) {
        C5383o oVar;
        C5383o oVar2;
        C5383o oVar3;
        float b = m22209b(oVarArr[0], oVarArr[1]);
        float b2 = m22209b(oVarArr[1], oVarArr[2]);
        float b3 = m22209b(oVarArr[0], oVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            oVar3 = oVarArr[0];
            oVar2 = oVarArr[1];
            oVar = oVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            oVar3 = oVarArr[2];
            oVar2 = oVarArr[0];
            oVar = oVarArr[1];
        } else {
            oVar3 = oVarArr[1];
            oVar2 = oVarArr[0];
            oVar = oVarArr[2];
        }
        if (m22208a(oVar2, oVar3, oVar) < 0.0f) {
            C5383o oVar4 = oVar;
            oVar = oVar2;
            oVar2 = oVar4;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar3;
        oVarArr[2] = oVar;
    }

    /* renamed from: c */
    public final float mo15618c() {
        return this.f15575a;
    }

    /* renamed from: d */
    public final float mo15619d() {
        return this.f15576b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5383o) {
            C5383o oVar = (C5383o) obj;
            return this.f15575a == oVar.f15575a && this.f15576b == oVar.f15576b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f15575a) * 31) + Float.floatToIntBits(this.f15576b);
    }

    public final String toString() {
        return "(" + this.f15575a + ',' + this.f15576b + ')';
    }
}
