package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0908j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.q */
class C2136q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    class C2137a extends C0908j {
        C2137a(C2136q qVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo4797v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C2136q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: I1 */
    public void mo4056I1(RecyclerView recyclerView, RecyclerView.C0823a0 a0Var, int i) {
        C2137a aVar = new C2137a(this, recyclerView.getContext());
        aVar.mo4599p(i);
        mo4438J1(aVar);
    }
}
