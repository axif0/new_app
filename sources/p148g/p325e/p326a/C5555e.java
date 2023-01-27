package p148g.p325e.p326a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import p148g.p325e.p326a.C5557g;

/* renamed from: g.e.a.e */
class C5555e extends C5559h {

    /* renamed from: f */
    private float f16059f;

    /* renamed from: g */
    private float f16060g;

    /* renamed from: h */
    private float f16061h;

    /* renamed from: i */
    private boolean f16062i = true;

    public C5555e(C5557g.C5558a... aVarArr) {
        super(aVarArr);
    }

    /* renamed from: b */
    public Object mo15978b(float f) {
        return Float.valueOf(mo15981f(f));
    }

    /* renamed from: e */
    public C5555e clone() {
        ArrayList<C5557g> arrayList = this.f16070d;
        int size = arrayList.size();
        C5557g.C5558a[] aVarArr = new C5557g.C5558a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (C5557g.C5558a) arrayList.get(i).clone();
        }
        return new C5555e(aVarArr);
    }

    /* renamed from: f */
    public float mo15981f(float f) {
        Object e;
        int i = this.f16067a;
        if (i != 2) {
            if (f > 0.0f) {
                if (f < 1.0f) {
                    C5557g.C5558a aVar = (C5557g.C5558a) this.f16070d.get(0);
                    int i2 = 1;
                    while (true) {
                        int i3 = this.f16067a;
                        if (i2 >= i3) {
                            e = this.f16070d.get(i3 - 1).mo15987e();
                            break;
                        }
                        C5557g.C5558a aVar2 = (C5557g.C5558a) this.f16070d.get(i2);
                        if (f < aVar2.mo15984c()) {
                            Interpolator d = aVar2.mo15986d();
                            if (d != null) {
                                f = d.getInterpolation(f);
                            }
                            float c = (f - aVar.mo15984c()) / (aVar2.mo15984c() - aVar.mo15984c());
                            float p = aVar.mo15992p();
                            float p2 = aVar2.mo15992p();
                            C5579l lVar = this.f16071e;
                            return lVar == null ? p + (c * (p2 - p)) : ((Number) lVar.evaluate(c, Float.valueOf(p), Float.valueOf(p2))).floatValue();
                        }
                        i2++;
                        aVar = aVar2;
                    }
                } else {
                    C5557g.C5558a aVar3 = (C5557g.C5558a) this.f16070d.get(i - 2);
                    C5557g.C5558a aVar4 = (C5557g.C5558a) this.f16070d.get(this.f16067a - 1);
                    float p3 = aVar3.mo15992p();
                    float p4 = aVar4.mo15992p();
                    float c2 = aVar3.mo15984c();
                    float c3 = aVar4.mo15984c();
                    Interpolator d2 = aVar4.mo15986d();
                    if (d2 != null) {
                        f = d2.getInterpolation(f);
                    }
                    float f2 = (f - c2) / (c3 - c2);
                    C5579l lVar2 = this.f16071e;
                    return lVar2 == null ? p3 + (f2 * (p4 - p3)) : ((Number) lVar2.evaluate(f2, Float.valueOf(p3), Float.valueOf(p4))).floatValue();
                }
            } else {
                C5557g.C5558a aVar5 = (C5557g.C5558a) this.f16070d.get(0);
                C5557g.C5558a aVar6 = (C5557g.C5558a) this.f16070d.get(1);
                float p5 = aVar5.mo15992p();
                float p6 = aVar6.mo15992p();
                float c4 = aVar5.mo15984c();
                float c5 = aVar6.mo15984c();
                Interpolator d3 = aVar6.mo15986d();
                if (d3 != null) {
                    f = d3.getInterpolation(f);
                }
                float f3 = (f - c4) / (c5 - c4);
                C5579l lVar3 = this.f16071e;
                return lVar3 == null ? p5 + (f3 * (p6 - p5)) : ((Number) lVar3.evaluate(f3, Float.valueOf(p5), Float.valueOf(p6))).floatValue();
            }
        } else {
            if (this.f16062i) {
                this.f16062i = false;
                this.f16059f = ((C5557g.C5558a) this.f16070d.get(0)).mo15992p();
                float p7 = ((C5557g.C5558a) this.f16070d.get(1)).mo15992p();
                this.f16060g = p7;
                this.f16061h = p7 - this.f16059f;
            }
            Interpolator interpolator = this.f16069c;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            C5579l lVar4 = this.f16071e;
            if (lVar4 == null) {
                return this.f16059f + (f * this.f16061h);
            }
            e = lVar4.evaluate(f, Float.valueOf(this.f16059f), Float.valueOf(this.f16060g));
        }
        return ((Number) e).floatValue();
    }
}
