package p148g.p189d.p190a.p252d.p265u;

import android.content.Context;
import android.graphics.Color;
import p086f.p111h.p114f.C3287a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p269y.C5045b;

/* renamed from: g.d.a.d.u.a */
public class C5038a {

    /* renamed from: a */
    private final boolean f15019a;

    /* renamed from: b */
    private final int f15020b;

    /* renamed from: c */
    private final int f15021c;

    /* renamed from: d */
    private final float f15022d;

    public C5038a(Context context) {
        this.f15019a = C5045b.m21332b(context, C4965b.elevationOverlayEnabled, false);
        this.f15020b = C5035a.m21303a(context, C4965b.elevationOverlayColor, 0);
        this.f15021c = C5035a.m21303a(context, C4965b.colorSurface, 0);
        this.f15022d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m21311e(int i) {
        return C3287a.m14162d(i, 255) == this.f15021c;
    }

    /* renamed from: a */
    public float mo15115a(float f) {
        float f2 = this.f15022d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo15116b(int i, float f) {
        float a = mo15115a(f);
        return C3287a.m14162d(C5035a.m21308f(C3287a.m14162d(i, 255), this.f15020b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo15117c(int i, float f) {
        return (!this.f15019a || !m21311e(i)) ? i : mo15116b(i, f);
    }

    /* renamed from: d */
    public boolean mo15118d() {
        return this.f15019a;
    }
}
