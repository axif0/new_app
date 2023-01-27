package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
public abstract class C0913n {

    /* renamed from: a */
    protected final RecyclerView.C0843o f3671a;

    /* renamed from: b */
    private int f3672b;

    /* renamed from: c */
    final Rect f3673c;

    /* renamed from: androidx.recyclerview.widget.n$a */
    static class C0914a extends C0913n {
        C0914a(RecyclerView.C0843o oVar) {
            super(oVar, (C0914a) null);
        }

        /* renamed from: d */
        public int mo4807d(View view) {
            return this.f3671a.mo4451T(view) + ((RecyclerView.C0848p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo4808e(View view) {
            RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
            return this.f3671a.mo4450S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo4809f(View view) {
            RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
            return this.f3671a.mo4449R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo4810g(View view) {
            return this.f3671a.mo4447Q(view) - ((RecyclerView.C0848p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo4811h() {
            return this.f3671a.mo4491o0();
        }

        /* renamed from: i */
        public int mo4812i() {
            return this.f3671a.mo4491o0() - this.f3671a.mo4472f0();
        }

        /* renamed from: j */
        public int mo4813j() {
            return this.f3671a.mo4472f0();
        }

        /* renamed from: k */
        public int mo4814k() {
            return this.f3671a.mo4493p0();
        }

        /* renamed from: l */
        public int mo4815l() {
            return this.f3671a.mo4456X();
        }

        /* renamed from: m */
        public int mo4816m() {
            return this.f3671a.mo4470e0();
        }

        /* renamed from: n */
        public int mo4817n() {
            return (this.f3671a.mo4491o0() - this.f3671a.mo4470e0()) - this.f3671a.mo4472f0();
        }

        /* renamed from: p */
        public int mo4819p(View view) {
            this.f3671a.mo4489n0(view, true, this.f3673c);
            return this.f3673c.right;
        }

        /* renamed from: q */
        public int mo4820q(View view) {
            this.f3671a.mo4489n0(view, true, this.f3673c);
            return this.f3673c.left;
        }

        /* renamed from: r */
        public void mo4821r(int i) {
            this.f3671a.mo4424C0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    static class C0915b extends C0913n {
        C0915b(RecyclerView.C0843o oVar) {
            super(oVar, (C0914a) null);
        }

        /* renamed from: d */
        public int mo4807d(View view) {
            return this.f3671a.mo4444O(view) + ((RecyclerView.C0848p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo4808e(View view) {
            RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
            return this.f3671a.mo4449R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo4809f(View view) {
            RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
            return this.f3671a.mo4450S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: g */
        public int mo4810g(View view) {
            return this.f3671a.mo4452U(view) - ((RecyclerView.C0848p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo4811h() {
            return this.f3671a.mo4455W();
        }

        /* renamed from: i */
        public int mo4812i() {
            return this.f3671a.mo4455W() - this.f3671a.mo4468d0();
        }

        /* renamed from: j */
        public int mo4813j() {
            return this.f3671a.mo4468d0();
        }

        /* renamed from: k */
        public int mo4814k() {
            return this.f3671a.mo4456X();
        }

        /* renamed from: l */
        public int mo4815l() {
            return this.f3671a.mo4493p0();
        }

        /* renamed from: m */
        public int mo4816m() {
            return this.f3671a.mo4474g0();
        }

        /* renamed from: n */
        public int mo4817n() {
            return (this.f3671a.mo4455W() - this.f3671a.mo4474g0()) - this.f3671a.mo4468d0();
        }

        /* renamed from: p */
        public int mo4819p(View view) {
            this.f3671a.mo4489n0(view, true, this.f3673c);
            return this.f3673c.bottom;
        }

        /* renamed from: q */
        public int mo4820q(View view) {
            this.f3671a.mo4489n0(view, true, this.f3673c);
            return this.f3673c.top;
        }

        /* renamed from: r */
        public void mo4821r(int i) {
            this.f3671a.mo4425D0(i);
        }
    }

    private C0913n(RecyclerView.C0843o oVar) {
        this.f3672b = Integer.MIN_VALUE;
        this.f3673c = new Rect();
        this.f3671a = oVar;
    }

    /* synthetic */ C0913n(RecyclerView.C0843o oVar, C0914a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C0913n m5074a(RecyclerView.C0843o oVar) {
        return new C0914a(oVar);
    }

    /* renamed from: b */
    public static C0913n m5075b(RecyclerView.C0843o oVar, int i) {
        if (i == 0) {
            return m5074a(oVar);
        }
        if (i == 1) {
            return m5076c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C0913n m5076c(RecyclerView.C0843o oVar) {
        return new C0915b(oVar);
    }

    /* renamed from: d */
    public abstract int mo4807d(View view);

    /* renamed from: e */
    public abstract int mo4808e(View view);

    /* renamed from: f */
    public abstract int mo4809f(View view);

    /* renamed from: g */
    public abstract int mo4810g(View view);

    /* renamed from: h */
    public abstract int mo4811h();

    /* renamed from: i */
    public abstract int mo4812i();

    /* renamed from: j */
    public abstract int mo4813j();

    /* renamed from: k */
    public abstract int mo4814k();

    /* renamed from: l */
    public abstract int mo4815l();

    /* renamed from: m */
    public abstract int mo4816m();

    /* renamed from: n */
    public abstract int mo4817n();

    /* renamed from: o */
    public int mo4818o() {
        if (Integer.MIN_VALUE == this.f3672b) {
            return 0;
        }
        return mo4817n() - this.f3672b;
    }

    /* renamed from: p */
    public abstract int mo4819p(View view);

    /* renamed from: q */
    public abstract int mo4820q(View view);

    /* renamed from: r */
    public abstract void mo4821r(int i);

    /* renamed from: s */
    public void mo4822s() {
        this.f3672b = mo4817n();
    }
}
