package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
public abstract class C0919q extends RecyclerView.C0837l {

    /* renamed from: g */
    boolean f3678g = true;

    /* renamed from: A */
    public final void mo4830A(RecyclerView.C0829d0 d0Var) {
        mo4838I(d0Var);
        mo4395h(d0Var);
    }

    /* renamed from: B */
    public final void mo4831B(RecyclerView.C0829d0 d0Var) {
        mo4839J(d0Var);
    }

    /* renamed from: C */
    public final void mo4832C(RecyclerView.C0829d0 d0Var, boolean z) {
        mo4840K(d0Var, z);
        mo4395h(d0Var);
    }

    /* renamed from: D */
    public final void mo4833D(RecyclerView.C0829d0 d0Var, boolean z) {
        mo4841L(d0Var, z);
    }

    /* renamed from: E */
    public final void mo4834E(RecyclerView.C0829d0 d0Var) {
        mo4842M(d0Var);
        mo4395h(d0Var);
    }

    /* renamed from: F */
    public final void mo4835F(RecyclerView.C0829d0 d0Var) {
        mo4843N(d0Var);
    }

    /* renamed from: G */
    public final void mo4836G(RecyclerView.C0829d0 d0Var) {
        mo4844O(d0Var);
        mo4395h(d0Var);
    }

    /* renamed from: H */
    public final void mo4837H(RecyclerView.C0829d0 d0Var) {
        mo4845P(d0Var);
    }

    /* renamed from: I */
    public void mo4838I(RecyclerView.C0829d0 d0Var) {
    }

    /* renamed from: J */
    public void mo4839J(RecyclerView.C0829d0 d0Var) {
    }

    /* renamed from: K */
    public void mo4840K(RecyclerView.C0829d0 d0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo4841L(RecyclerView.C0829d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo4842M(RecyclerView.C0829d0 d0Var) {
    }

    /* renamed from: N */
    public void mo4843N(RecyclerView.C0829d0 d0Var) {
    }

    /* renamed from: O */
    public void mo4844O(RecyclerView.C0829d0 d0Var) {
    }

    /* renamed from: P */
    public void mo4845P(RecyclerView.C0829d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo4389a(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2) {
        if (cVar == null || (cVar.f3387a == cVar2.f3387a && cVar.f3388b == cVar2.f3388b)) {
            return mo4740w(d0Var);
        }
        return mo4742y(d0Var, cVar.f3387a, cVar.f3388b, cVar2.f3387a, cVar2.f3388b);
    }

    /* renamed from: b */
    public boolean mo4390b(RecyclerView.C0829d0 d0Var, RecyclerView.C0829d0 d0Var2, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3387a;
        int i4 = cVar.f3388b;
        if (d0Var2.mo4306J()) {
            int i5 = cVar.f3387a;
            i = cVar.f3388b;
            i2 = i5;
        } else {
            i2 = cVar2.f3387a;
            i = cVar2.f3388b;
        }
        return mo4741x(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo4391c(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2) {
        int i = cVar.f3387a;
        int i2 = cVar.f3388b;
        View view = d0Var.f3359a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3387a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3388b;
        if (d0Var.mo4330v() || (i == left && i2 == top)) {
            return mo4743z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4742y(d0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo4392d(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2) {
        if (cVar.f3387a == cVar2.f3387a && cVar.f3388b == cVar2.f3388b) {
            mo4834E(d0Var);
            return false;
        }
        return mo4742y(d0Var, cVar.f3387a, cVar.f3388b, cVar2.f3387a, cVar2.f3388b);
    }

    /* renamed from: f */
    public boolean mo4393f(RecyclerView.C0829d0 d0Var) {
        return !this.f3678g || d0Var.mo4327t();
    }

    /* renamed from: w */
    public abstract boolean mo4740w(RecyclerView.C0829d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo4741x(RecyclerView.C0829d0 d0Var, RecyclerView.C0829d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo4742y(RecyclerView.C0829d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo4743z(RecyclerView.C0829d0 d0Var);
}
