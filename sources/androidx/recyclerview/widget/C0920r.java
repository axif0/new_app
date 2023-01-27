package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
public abstract class C0920r extends RecyclerView.C0850r {

    /* renamed from: a */
    RecyclerView f3679a;

    /* renamed from: b */
    private Scroller f3680b;

    /* renamed from: c */
    private final RecyclerView.C0852t f3681c = new C0921a();

    /* renamed from: androidx.recyclerview.widget.r$a */
    class C0921a extends RecyclerView.C0852t {

        /* renamed from: a */
        boolean f3682a = false;

        C0921a() {
        }

        /* renamed from: a */
        public void mo4527a(RecyclerView recyclerView, int i) {
            super.mo4527a(recyclerView, i);
            if (i == 0 && this.f3682a) {
                this.f3682a = false;
                C0920r.this.mo4850l();
            }
        }

        /* renamed from: b */
        public void mo4528b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3682a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.r$b */
    class C0922b extends C0908j {
        C0922b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo4598o(View view, RecyclerView.C0823a0 a0Var, RecyclerView.C0860z.C0861a aVar) {
            C0920r rVar = C0920r.this;
            RecyclerView recyclerView = rVar.f3679a;
            if (recyclerView != null) {
                int[] c = rVar.mo4801c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = mo4798w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.mo4605d(i, i2, w, this.f3661j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo4797v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: g */
    private void m5165g() {
        this.f3679a.mo4142Z0(this.f3681c);
        this.f3679a.setOnFlingListener((RecyclerView.C0850r) null);
    }

    /* renamed from: j */
    private void m5166j() throws IllegalStateException {
        if (this.f3679a.getOnFlingListener() == null) {
            this.f3679a.mo4199k(this.f3681c);
            this.f3679a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m5167k(RecyclerView.C0843o oVar, int i, int i2) {
        RecyclerView.C0860z e;
        int i3;
        if (!(oVar instanceof RecyclerView.C0860z.C0862b) || (e = mo4848e(oVar)) == null || (i3 = mo4803i(oVar, i, i2)) == -1) {
            return false;
        }
        e.mo4599p(i3);
        oVar.mo4438J1(e);
        return true;
    }

    /* renamed from: a */
    public boolean mo4523a(int i, int i2) {
        RecyclerView.C0843o layoutManager = this.f3679a.getLayoutManager();
        if (layoutManager == null || this.f3679a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3679a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5167k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo4846b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f3679a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5165g();
            }
            this.f3679a = recyclerView;
            if (recyclerView != null) {
                m5166j();
                this.f3680b = new Scroller(this.f3679a.getContext(), new DecelerateInterpolator());
                mo4850l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo4801c(RecyclerView.C0843o oVar, View view);

    /* renamed from: d */
    public int[] mo4847d(int i, int i2) {
        this.f3680b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f3680b.getFinalX(), this.f3680b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C0860z mo4848e(RecyclerView.C0843o oVar) {
        return mo4849f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: f */
    public C0908j mo4849f(RecyclerView.C0843o oVar) {
        if (!(oVar instanceof RecyclerView.C0860z.C0862b)) {
            return null;
        }
        return new C0922b(this.f3679a.getContext());
    }

    /* renamed from: h */
    public abstract View mo4802h(RecyclerView.C0843o oVar);

    /* renamed from: i */
    public abstract int mo4803i(RecyclerView.C0843o oVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4850l() {
        RecyclerView.C0843o layoutManager;
        View h;
        RecyclerView recyclerView = this.f3679a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo4802h(layoutManager)) != null) {
            int[] c = mo4801c(layoutManager, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f3679a.mo4205m1(c[0], c[1]);
            }
        }
    }
}
