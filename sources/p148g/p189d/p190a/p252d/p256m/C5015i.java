package p148g.p189d.p190a.p252d.p256m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g.d.a.d.m.i */
public class C5015i {

    /* renamed from: a */
    private long f14962a = 0;

    /* renamed from: b */
    private long f14963b = 300;

    /* renamed from: c */
    private TimeInterpolator f14964c = null;

    /* renamed from: d */
    private int f14965d = 0;

    /* renamed from: e */
    private int f14966e = 1;

    public C5015i(long j, long j2) {
        this.f14962a = j;
        this.f14963b = j2;
    }

    public C5015i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f14962a = j;
        this.f14963b = j2;
        this.f14964c = timeInterpolator;
    }

    /* renamed from: b */
    static C5015i m21221b(ValueAnimator valueAnimator) {
        C5015i iVar = new C5015i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m21222f(valueAnimator));
        iVar.f14965d = valueAnimator.getRepeatCount();
        iVar.f14966e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m21222f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C5007a.f14948b : interpolator instanceof AccelerateInterpolator ? C5007a.f14949c : interpolator instanceof DecelerateInterpolator ? C5007a.f14950d : interpolator;
    }

    /* renamed from: a */
    public void mo15039a(Animator animator) {
        animator.setStartDelay(mo15040c());
        animator.setDuration(mo15041d());
        animator.setInterpolator(mo15042e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo15044g());
            valueAnimator.setRepeatMode(mo15045h());
        }
    }

    /* renamed from: c */
    public long mo15040c() {
        return this.f14962a;
    }

    /* renamed from: d */
    public long mo15041d() {
        return this.f14963b;
    }

    /* renamed from: e */
    public TimeInterpolator mo15042e() {
        TimeInterpolator timeInterpolator = this.f14964c;
        return timeInterpolator != null ? timeInterpolator : C5007a.f14948b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5015i)) {
            return false;
        }
        C5015i iVar = (C5015i) obj;
        if (mo15040c() == iVar.mo15040c() && mo15041d() == iVar.mo15041d() && mo15044g() == iVar.mo15044g() && mo15045h() == iVar.mo15045h()) {
            return mo15042e().getClass().equals(iVar.mo15042e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo15044g() {
        return this.f14965d;
    }

    /* renamed from: h */
    public int mo15045h() {
        return this.f14966e;
    }

    public int hashCode() {
        return (((((((((int) (mo15040c() ^ (mo15040c() >>> 32))) * 31) + ((int) (mo15041d() ^ (mo15041d() >>> 32)))) * 31) + mo15042e().getClass().hashCode()) * 31) + mo15044g()) * 31) + mo15045h();
    }

    public String toString() {
        return 10 + C5015i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo15040c() + " duration: " + mo15041d() + " interpolator: " + mo15042e().getClass() + " repeatCount: " + mo15044g() + " repeatMode: " + mo15045h() + "}\n";
    }
}
