package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
class C0907i {

    /* renamed from: a */
    boolean f3651a = true;

    /* renamed from: b */
    int f3652b;

    /* renamed from: c */
    int f3653c;

    /* renamed from: d */
    int f3654d;

    /* renamed from: e */
    int f3655e;

    /* renamed from: f */
    int f3656f = 0;

    /* renamed from: g */
    int f3657g = 0;

    /* renamed from: h */
    boolean f3658h;

    /* renamed from: i */
    boolean f3659i;

    C0907i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4789a(RecyclerView.C0823a0 a0Var) {
        int i = this.f3653c;
        return i >= 0 && i < a0Var.mo4278b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4790b(RecyclerView.C0855v vVar) {
        View o = vVar.mo4565o(this.f3653c);
        this.f3653c += this.f3654d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3652b + ", mCurrentPosition=" + this.f3653c + ", mItemDirection=" + this.f3654d + ", mLayoutDirection=" + this.f3655e + ", mStartLine=" + this.f3656f + ", mEndLine=" + this.f3657g + '}';
    }
}
