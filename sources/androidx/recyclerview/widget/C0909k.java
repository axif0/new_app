package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
public class C0909k extends C0920r {

    /* renamed from: d */
    private C0913n f3668d;

    /* renamed from: e */
    private C0913n f3669e;

    /* renamed from: m */
    private float m5053m(RecyclerView.C0843o oVar, C0913n nVar) {
        int max;
        int J = oVar.mo4437J();
        if (J == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < J; i3++) {
            View I = oVar.mo4436I(i3);
            int h0 = oVar.mo4477h0(I);
            if (h0 != -1) {
                if (h0 < i) {
                    view = I;
                    i = h0;
                }
                if (h0 > i2) {
                    view2 = I;
                    i2 = h0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(nVar.mo4807d(view), nVar.mo4807d(view2)) - Math.min(nVar.mo4810g(view), nVar.mo4810g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: n */
    private int m5054n(RecyclerView.C0843o oVar, View view, C0913n nVar) {
        return (nVar.mo4810g(view) + (nVar.mo4808e(view) / 2)) - (nVar.mo4816m() + (nVar.mo4817n() / 2));
    }

    /* renamed from: o */
    private int m5055o(RecyclerView.C0843o oVar, C0913n nVar, int i, int i2) {
        int[] d = mo4847d(i, i2);
        float m = m5053m(oVar, nVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1])) / m);
    }

    /* renamed from: p */
    private View m5056p(RecyclerView.C0843o oVar, C0913n nVar) {
        int J = oVar.mo4437J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = nVar.mo4816m() + (nVar.mo4817n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < J; i2++) {
            View I = oVar.mo4436I(i2);
            int abs = Math.abs((nVar.mo4810g(I) + (nVar.mo4808e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: q */
    private C0913n m5057q(RecyclerView.C0843o oVar) {
        C0913n nVar = this.f3669e;
        if (nVar == null || nVar.f3671a != oVar) {
            this.f3669e = C0913n.m5074a(oVar);
        }
        return this.f3669e;
    }

    /* renamed from: r */
    private C0913n m5058r(RecyclerView.C0843o oVar) {
        C0913n nVar = this.f3668d;
        if (nVar == null || nVar.f3671a != oVar) {
            this.f3668d = C0913n.m5076c(oVar);
        }
        return this.f3668d;
    }

    /* renamed from: c */
    public int[] mo4801c(RecyclerView.C0843o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo4073k()) {
            iArr[0] = m5054n(oVar, view, m5057q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo4074l()) {
            iArr[1] = m5054n(oVar, view, m5058r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo4802h(RecyclerView.C0843o oVar) {
        C0913n q;
        if (oVar.mo4074l()) {
            q = m5058r(oVar);
        } else if (!oVar.mo4073k()) {
            return null;
        } else {
            q = m5057q(oVar);
        }
        return m5056p(oVar, q);
    }

    /* renamed from: i */
    public int mo4803i(RecyclerView.C0843o oVar, int i, int i2) {
        int Y;
        View h;
        int h0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.C0860z.C0862b) || (Y = oVar.mo4457Y()) == 0 || (h = mo4802h(oVar)) == null || (h0 = oVar.mo4477h0(h)) == -1 || (a = ((RecyclerView.C0860z.C0862b) oVar).mo4066a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.mo4073k()) {
            i4 = m5055o(oVar, m5057q(oVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo4074l()) {
            i5 = m5055o(oVar, m5058r(oVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.mo4074l()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = h0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= Y ? Y - 1 : i6;
    }
}
