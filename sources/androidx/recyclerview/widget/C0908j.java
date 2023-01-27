package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
public class C0908j extends RecyclerView.C0860z {

    /* renamed from: i */
    protected final LinearInterpolator f3660i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f3661j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f3662k;

    /* renamed from: l */
    private final DisplayMetrics f3663l;

    /* renamed from: m */
    private boolean f3664m = false;

    /* renamed from: n */
    private float f3665n;

    /* renamed from: o */
    protected int f3666o = 0;

    /* renamed from: p */
    protected int f3667p = 0;

    public C0908j(Context context) {
        this.f3663l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m5038A() {
        if (!this.f3664m) {
            this.f3665n = mo4797v(this.f3663l);
            this.f3664m = true;
        }
        return this.f3665n;
    }

    /* renamed from: y */
    private int m5039y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo4792B() {
        PointF pointF = this.f3662k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4793C(RecyclerView.C0860z.C0861a aVar) {
        PointF a = mo4584a(mo4589f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo4603b(mo4589f());
            mo4601r();
            return;
        }
        mo4592i(a);
        this.f3662k = a;
        this.f3666o = (int) (a.x * 10000.0f);
        this.f3667p = (int) (a.y * 10000.0f);
        aVar.mo4605d((int) (((float) this.f3666o) * 1.2f), (int) (((float) this.f3667p) * 1.2f), (int) (((float) mo4799x(10000)) * 1.2f), this.f3660i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4595l(int i, int i2, RecyclerView.C0823a0 a0Var, RecyclerView.C0860z.C0861a aVar) {
        if (mo4586c() == 0) {
            mo4601r();
            return;
        }
        this.f3666o = m5039y(this.f3666o, i);
        int y = m5039y(this.f3667p, i2);
        this.f3667p = y;
        if (this.f3666o == 0 && y == 0) {
            mo4793C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4596m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4597n() {
        this.f3667p = 0;
        this.f3666o = 0;
        this.f3662k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4598o(View view, RecyclerView.C0823a0 a0Var, RecyclerView.C0860z.C0861a aVar) {
        int t = mo4795t(view, mo4800z());
        int u = mo4796u(view, mo4792B());
        int w = mo4798w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo4605d(-t, -u, w, this.f3661j);
        }
    }

    /* renamed from: s */
    public int mo4794s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo4795t(View view, int i) {
        RecyclerView.C0843o e = mo4588e();
        if (e == null || !e.mo4073k()) {
            return 0;
        }
        RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
        return mo4794s(e.mo4447Q(view) - pVar.leftMargin, e.mo4451T(view) + pVar.rightMargin, e.mo4470e0(), e.mo4491o0() - e.mo4472f0(), i);
    }

    /* renamed from: u */
    public int mo4796u(View view, int i) {
        RecyclerView.C0843o e = mo4588e();
        if (e == null || !e.mo4074l()) {
            return 0;
        }
        RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
        return mo4794s(e.mo4452U(view) - pVar.topMargin, e.mo4444O(view) + pVar.bottomMargin, e.mo4474g0(), e.mo4455W() - e.mo4468d0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo4797v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo4798w(int i) {
        double x = (double) mo4799x(i);
        Double.isNaN(x);
        return (int) Math.ceil(x / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo4799x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m5038A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo4800z() {
        PointF pointF = this.f3662k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
