package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
class C0512b implements C0516e {
    C0512b() {
    }

    /* renamed from: p */
    private C0517f m2347p(C0515d dVar) {
        return (C0517f) dVar.mo2518g();
    }

    /* renamed from: a */
    public float mo2521a(C0515d dVar) {
        return m2347p(dVar).mo2536c();
    }

    /* renamed from: b */
    public ColorStateList mo2522b(C0515d dVar) {
        return m2347p(dVar).mo2535b();
    }

    /* renamed from: c */
    public void mo2523c(C0515d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2515d(new C0517f(colorStateList, f));
        View b = dVar.mo2513b();
        b.setClipToOutline(true);
        b.setElevation(f2);
        mo2534o(dVar, f3);
    }

    /* renamed from: d */
    public void mo2524d(C0515d dVar, float f) {
        m2347p(dVar).mo2543h(f);
    }

    /* renamed from: e */
    public float mo2525e(C0515d dVar) {
        return dVar.mo2513b().getElevation();
    }

    /* renamed from: f */
    public void mo2526f(C0515d dVar) {
        if (!dVar.mo2517f()) {
            dVar.mo2512a(0, 0, 0, 0);
            return;
        }
        float a = mo2521a(dVar);
        float h = mo2527h(dVar);
        int ceil = (int) Math.ceil((double) C0518g.m2414c(a, h, dVar.mo2516e()));
        int ceil2 = (int) Math.ceil((double) C0518g.m2415d(a, h, dVar.mo2516e()));
        dVar.mo2512a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public void mo2519g() {
    }

    /* renamed from: h */
    public float mo2527h(C0515d dVar) {
        return m2347p(dVar).mo2537d();
    }

    /* renamed from: i */
    public float mo2528i(C0515d dVar) {
        return mo2527h(dVar) * 2.0f;
    }

    /* renamed from: j */
    public float mo2529j(C0515d dVar) {
        return mo2527h(dVar) * 2.0f;
    }

    /* renamed from: k */
    public void mo2530k(C0515d dVar) {
        mo2534o(dVar, mo2521a(dVar));
    }

    /* renamed from: l */
    public void mo2531l(C0515d dVar, float f) {
        dVar.mo2513b().setElevation(f);
    }

    /* renamed from: m */
    public void mo2532m(C0515d dVar) {
        mo2534o(dVar, mo2521a(dVar));
    }

    /* renamed from: n */
    public void mo2533n(C0515d dVar, ColorStateList colorStateList) {
        m2347p(dVar).mo2539f(colorStateList);
    }

    /* renamed from: o */
    public void mo2534o(C0515d dVar, float f) {
        m2347p(dVar).mo2540g(f, dVar.mo2517f(), dVar.mo2516e());
        mo2526f(dVar);
    }
}
