package p086f.p103f.p107b.p108k;

import java.util.Arrays;

/* renamed from: f.f.b.k.i */
public class C3236i extends C3229e implements C3235h {

    /* renamed from: g0 */
    public C3229e[] f10418g0 = new C3229e[4];

    /* renamed from: h0 */
    public int f10419h0 = 0;

    /* renamed from: a */
    public void mo11378a(C3229e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f10419h0 + 1;
            C3229e[] eVarArr = this.f10418g0;
            if (i > eVarArr.length) {
                this.f10418g0 = (C3229e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C3229e[] eVarArr2 = this.f10418g0;
            int i2 = this.f10419h0;
            eVarArr2[i2] = eVar;
            this.f10419h0 = i2 + 1;
        }
    }

    /* renamed from: b */
    public void mo11379b(C3232f fVar) {
    }

    /* renamed from: c */
    public void mo11380c() {
        this.f10419h0 = 0;
        Arrays.fill(this.f10418g0, (Object) null);
    }
}
