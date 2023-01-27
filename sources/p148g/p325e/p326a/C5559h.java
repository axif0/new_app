package p148g.p325e.p326a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p148g.p325e.p326a.C5557g;

/* renamed from: g.e.a.h */
class C5559h {

    /* renamed from: a */
    int f16067a;

    /* renamed from: b */
    C5557g f16068b;

    /* renamed from: c */
    Interpolator f16069c;

    /* renamed from: d */
    ArrayList<C5557g> f16070d;

    /* renamed from: e */
    C5579l f16071e;

    public C5559h(C5557g... gVarArr) {
        this.f16067a = gVarArr.length;
        ArrayList<C5557g> arrayList = new ArrayList<>();
        this.f16070d = arrayList;
        arrayList.addAll(Arrays.asList(gVarArr));
        C5557g gVar = this.f16070d.get(0);
        C5557g gVar2 = this.f16070d.get(this.f16067a - 1);
        this.f16068b = gVar2;
        this.f16069c = gVar2.mo15986d();
    }

    /* renamed from: c */
    public static C5559h m22972c(float... fArr) {
        int length = fArr.length;
        C5557g.C5558a[] aVarArr = new C5557g.C5558a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (C5557g.C5558a) C5557g.m22958g(0.0f);
            aVarArr[1] = (C5557g.C5558a) C5557g.m22959i(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (C5557g.C5558a) C5557g.m22959i(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (C5557g.C5558a) C5557g.m22959i(((float) i) / ((float) (length - 1)), fArr[i]);
            }
        }
        return new C5555e(aVarArr);
    }

    /* renamed from: a */
    public C5559h mo15977a() {
        throw null;
    }

    /* renamed from: b */
    public Object mo15978b(float f) {
        throw null;
    }

    /* renamed from: d */
    public void mo15993d(C5579l lVar) {
        this.f16071e = lVar;
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f16067a; i++) {
            str = str + this.f16070d.get(i).mo15987e() + "  ";
        }
        return str;
    }
}
