package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
public final class C2126k<S> extends C2135p<S> {

    /* renamed from: c0 */
    private C2102d<S> f7036c0;

    /* renamed from: d0 */
    private C2096a f7037d0;

    /* renamed from: com.google.android.material.datepicker.k$a */
    class C2127a extends C2134o<S> {
        C2127a() {
        }

        /* renamed from: a */
        public void mo8229a(S s) {
            Iterator it = C2126k.this.f7059b0.iterator();
            while (it.hasNext()) {
                ((C2134o) it.next()).mo8229a(s);
            }
        }
    }

    /* renamed from: L1 */
    static <T> C2126k<T> m9901L1(C2102d<T> dVar, C2096a aVar) {
        C2126k<T> kVar = new C2126k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.mo3233u1(bundle);
        return kVar;
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7036c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7037d0);
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        if (bundle == null) {
            bundle = mo3237w();
        }
        this.f7036c0 = (C2102d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7037d0 = (C2096a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f7036c0.mo8194a0(layoutInflater, viewGroup, bundle, this.f7037d0, new C2127a());
    }
}
