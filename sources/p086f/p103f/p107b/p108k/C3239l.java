package p086f.p103f.p107b.p108k;

import java.util.ArrayList;
import p086f.p103f.p107b.C3210c;

/* renamed from: f.f.b.k.l */
public class C3239l extends C3229e {

    /* renamed from: g0 */
    public ArrayList<C3229e> f10422g0 = new ArrayList<>();

    /* renamed from: H0 */
    public void mo11350H0() {
        ArrayList<C3229e> arrayList = this.f10422g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3229e eVar = this.f10422g0.get(i);
                if (eVar instanceof C3239l) {
                    ((C3239l) eVar).mo11350H0();
                }
            }
        }
    }

    /* renamed from: I0 */
    public void mo11383I0(C3229e eVar) {
        this.f10422g0.remove(eVar);
        eVar.mo11337t0((C3229e) null);
    }

    /* renamed from: J0 */
    public void mo11384J0() {
        this.f10422g0.clear();
    }

    /* renamed from: W */
    public void mo11301W() {
        this.f10422g0.clear();
        super.mo11301W();
    }

    /* renamed from: X */
    public void mo11302X(C3210c cVar) {
        super.mo11302X(cVar);
        int size = this.f10422g0.size();
        for (int i = 0; i < size; i++) {
            this.f10422g0.get(i).mo11302X(cVar);
        }
    }

    /* renamed from: a */
    public void mo11385a(C3229e eVar) {
        this.f10422g0.add(eVar);
        if (eVar.mo11281E() != null) {
            ((C3239l) eVar.mo11281E()).mo11383I0(eVar);
        }
        eVar.mo11337t0(this);
    }
}
