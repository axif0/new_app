package p048d.p049a.p050a.p051a.p052c;

import android.app.Dialog;
import p048d.p049a.p050a.p051a.p058g.C2871k;
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;

/* renamed from: d.a.a.a.c.j */
class C2814j implements C2871k.C2872a {

    /* renamed from: a */
    final /* synthetic */ C3007d f8999a;

    /* renamed from: b */
    final /* synthetic */ C2815k f9000b;

    C2814j(C2815k kVar, C3007d dVar) {
        this.f9000b = kVar;
        this.f8999a = dVar;
    }

    /* renamed from: a */
    public void mo430a(Dialog dialog) {
        dialog.dismiss();
    }

    /* renamed from: b */
    public void mo431b(Dialog dialog) {
        if (!this.f8999a.mo10433X()) {
            C3002j.m12812k(this.f9000b.f9001i).mo10353i(this.f8999a);
            this.f9000b.f9002j.mo10237f();
            this.f9000b.mo4360j();
        }
        dialog.dismiss();
    }
}
