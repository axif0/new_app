package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.p */
class C0918p {
    /* renamed from: a */
    static int m5137a(RecyclerView.C0823a0 a0Var, C0913n nVar, View view, View view2, RecyclerView.C0843o oVar, boolean z) {
        if (oVar.mo4437J() == 0 || a0Var.mo4278b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo4477h0(view) - oVar.mo4477h0(view2)) + 1;
        }
        return Math.min(nVar.mo4817n(), nVar.mo4807d(view2) - nVar.mo4810g(view));
    }

    /* renamed from: b */
    static int m5138b(RecyclerView.C0823a0 a0Var, C0913n nVar, View view, View view2, RecyclerView.C0843o oVar, boolean z, boolean z2) {
        if (oVar.mo4437J() == 0 || a0Var.mo4278b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo4278b() - Math.max(oVar.mo4477h0(view), oVar.mo4477h0(view2))) - 1) : Math.max(0, Math.min(oVar.mo4477h0(view), oVar.mo4477h0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(nVar.mo4807d(view2) - nVar.mo4810g(view))) / ((float) (Math.abs(oVar.mo4477h0(view) - oVar.mo4477h0(view2)) + 1)))) + ((float) (nVar.mo4816m() - nVar.mo4810g(view))));
    }

    /* renamed from: c */
    static int m5139c(RecyclerView.C0823a0 a0Var, C0913n nVar, View view, View view2, RecyclerView.C0843o oVar, boolean z) {
        if (oVar.mo4437J() == 0 || a0Var.mo4278b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo4278b();
        }
        return (int) ((((float) (nVar.mo4807d(view2) - nVar.mo4810g(view))) / ((float) (Math.abs(oVar.mo4477h0(view) - oVar.mo4477h0(view2)) + 1))) * ((float) a0Var.mo4278b()));
    }
}
