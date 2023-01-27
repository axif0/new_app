package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.p */
abstract class C2135p<S> extends Fragment {

    /* renamed from: b0 */
    protected final LinkedHashSet<C2134o<S>> f7059b0 = new LinkedHashSet<>();

    C2135p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public boolean mo8268J1(C2134o<S> oVar) {
        return this.f7059b0.add(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public void mo8269K1() {
        this.f7059b0.clear();
    }
}
