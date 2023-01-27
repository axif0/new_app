package p086f.p144s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.s.d */
public class C3505d extends C3524j0 {

    /* renamed from: f.s.d$a */
    class C3506a extends C3540n {

        /* renamed from: a */
        final /* synthetic */ View f10932a;

        C3506a(C3505d dVar, View view) {
            this.f10932a = view;
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            C3502c0.m15042g(this.f10932a, 1.0f);
            C3502c0.m15036a(this.f10932a);
            mVar.mo11961Y(this);
        }
    }

    /* renamed from: f.s.d$b */
    private static class C3507b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f10933a;

        /* renamed from: b */
        private boolean f10934b = false;

        C3507b(View view) {
            this.f10933a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C3502c0.m15042g(this.f10933a, 1.0f);
            if (this.f10934b) {
                this.f10933a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C3403t.m14610K(this.f10933a) && this.f10933a.getLayerType() == 0) {
                this.f10934b = true;
                this.f10933a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C3505d(int i) {
        mo11938r0(i);
    }

    /* renamed from: s0 */
    private Animator m15050s0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C3502c0.m15042g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C3502c0.f10931b, new float[]{f2});
        ofFloat.addListener(new C3507b(view));
        mo11964b(new C3506a(this, view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f11042a.get("android:fade:transitionAlpha");
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m15051t0(p086f.p144s.C3549s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f11042a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p144s.C3505d.m15051t0(f.s.s, float):float");
    }

    /* renamed from: l */
    public void mo11874l(C3549s sVar) {
        super.mo11874l(sVar);
        sVar.f11042a.put("android:fade:transitionAlpha", Float.valueOf(C3502c0.m15038c(sVar.f11043b)));
    }

    /* renamed from: n0 */
    public Animator mo11917n0(ViewGroup viewGroup, View view, C3549s sVar, C3549s sVar2) {
        float f = 0.0f;
        float t0 = m15051t0(sVar, 0.0f);
        if (t0 != 1.0f) {
            f = t0;
        }
        return m15050s0(view, f, 1.0f);
    }

    /* renamed from: p0 */
    public Animator mo11918p0(ViewGroup viewGroup, View view, C3549s sVar, C3549s sVar2) {
        C3502c0.m15040e(view);
        return m15050s0(view, m15051t0(sVar, 1.0f), 0.0f);
    }
}
