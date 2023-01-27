package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p256m.C5008b;
import p148g.p189d.p190a.p252d.p256m.C5009c;
import p148g.p189d.p190a.p252d.p256m.C5010d;
import p148g.p189d.p190a.p252d.p256m.C5011e;
import p148g.p189d.p190a.p252d.p256m.C5014h;
import p148g.p189d.p190a.p252d.p256m.C5015i;
import p148g.p189d.p190a.p252d.p256m.C5016j;
import p148g.p189d.p190a.p252d.p260q.C5024a;
import p148g.p189d.p190a.p252d.p260q.C5027c;
import p148g.p189d.p190a.p252d.p260q.C5028d;
import p148g.p189d.p190a.p252d.p267w.C5041a;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f7684c = new Rect();

    /* renamed from: d */
    private final RectF f7685d = new RectF();

    /* renamed from: e */
    private final RectF f7686e = new RectF();

    /* renamed from: f */
    private final int[] f7687f = new int[2];

    /* renamed from: g */
    private float f7688g;

    /* renamed from: h */
    private float f7689h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C2309a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7690a;

        /* renamed from: b */
        final /* synthetic */ View f7691b;

        /* renamed from: c */
        final /* synthetic */ View f7692c;

        C2309a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f7690a = z;
            this.f7691b = view;
            this.f7692c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7690a) {
                this.f7691b.setVisibility(4);
                this.f7692c.setAlpha(1.0f);
                this.f7692c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f7690a) {
                this.f7691b.setVisibility(0);
                this.f7692c.setAlpha(0.0f);
                this.f7692c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C2310b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f7693a;

        C2310b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f7693a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7693a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C2311c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5028d f7694a;

        /* renamed from: b */
        final /* synthetic */ Drawable f7695b;

        C2311c(FabTransformationBehavior fabTransformationBehavior, C5028d dVar, Drawable drawable) {
            this.f7694a = dVar;
            this.f7695b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f7694a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f7694a.setCircularRevealOverlayDrawable(this.f7695b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C2312d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5028d f7696a;

        C2312d(FabTransformationBehavior fabTransformationBehavior, C5028d dVar) {
            this.f7696a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C5028d.C5033e revealInfo = this.f7696a.getRevealInfo();
            revealInfo.f15013c = Float.MAX_VALUE;
            this.f7696a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C2313e {

        /* renamed from: a */
        public C5014h f7697a;

        /* renamed from: b */
        public C5016j f7698b;

        protected C2313e() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: K */
    private ViewGroup m10759K(View view) {
        View findViewById = view.findViewById(C5000f.mtrl_child_content_container);
        return findViewById != null ? m10779f0(findViewById) : ((view instanceof C2316b) || (view instanceof C2315a)) ? m10779f0(((ViewGroup) view).getChildAt(0)) : m10779f0(view);
    }

    /* renamed from: L */
    private void m10760L(View view, C2313e eVar, C5015i iVar, C5015i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m10767S(eVar, iVar, f, f3);
        float S2 = m10767S(eVar, iVar2, f2, f4);
        Rect rect = this.f7684c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f7685d;
        rectF2.set(rect);
        RectF rectF3 = this.f7686e;
        m10768T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m10761M(View view, RectF rectF) {
        m10768T(view, rectF);
        rectF.offset(this.f7688g, this.f7689h);
    }

    /* renamed from: N */
    private Pair<C5015i, C5015i> m10762N(float f, float f2, boolean z, C2313e eVar) {
        String str;
        C5014h hVar;
        C5015i iVar;
        if (f == 0.0f || f2 == 0.0f) {
            iVar = eVar.f7697a.mo15031e("translationXLinear");
            hVar = eVar.f7697a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar = eVar.f7697a.mo15031e("translationXCurveDownwards");
            hVar = eVar.f7697a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f7697a.mo15031e("translationXCurveUpwards");
            hVar = eVar.f7697a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.mo15031e(str));
    }

    /* renamed from: O */
    private float m10763O(View view, View view2, C5016j jVar) {
        RectF rectF = this.f7685d;
        RectF rectF2 = this.f7686e;
        m10761M(view, rectF);
        m10768T(view2, rectF2);
        rectF2.offset(-m10765Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m10764P(View view, View view2, C5016j jVar) {
        RectF rectF = this.f7685d;
        RectF rectF2 = this.f7686e;
        m10761M(view, rectF);
        m10768T(view2, rectF2);
        rectF2.offset(0.0f, -m10766R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m10765Q(View view, View view2, C5016j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f7685d;
        RectF rectF2 = this.f7686e;
        m10761M(view, rectF);
        m10768T(view2, rectF2);
        int i = jVar.f14967a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f14968b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f14968b;
    }

    /* renamed from: R */
    private float m10766R(View view, View view2, C5016j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f7685d;
        RectF rectF2 = this.f7686e;
        m10761M(view, rectF);
        m10768T(view2, rectF2);
        int i = jVar.f14967a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f14969c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f14969c;
    }

    /* renamed from: S */
    private float m10767S(C2313e eVar, C5015i iVar, float f, float f2) {
        long c = iVar.mo15040c();
        long d = iVar.mo15041d();
        C5015i e = eVar.f7697a.mo15031e("expansion");
        return C5007a.m21200a(f, f2, iVar.mo15042e().getInterpolation(((float) (((e.mo15040c() + e.mo15041d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m10768T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f7687f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m10769U(View view, View view2, boolean z, boolean z2, C2313e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C5028d) || C5027c.f15006a != 0) && (K = m10759K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C5010d.f14953a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C5010d.f14953a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C5010d.f14953a, new float[]{0.0f});
                }
                eVar.f7697a.mo15031e("contentFade").mo15039a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m10770V(View view, View view2, boolean z, boolean z2, C2313e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C5028d) {
            C5028d dVar = (C5028d) view2;
            int d0 = m10778d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C5028d.C5032d.f15010a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C5028d.C5032d.f15010a, new int[]{d0});
            }
            objectAnimator.setEvaluator(C5009c.m21203b());
            eVar.f7697a.mo15031e("color").mo15039a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m10771W(View view, View view2, boolean z, C2313e eVar, List<Animator> list) {
        float Q = m10765Q(view, view2, eVar.f7698b);
        float R = m10766R(view, view2, eVar.f7698b);
        Pair<C5015i, C5015i> N = m10762N(Q, R, z, eVar);
        C5015i iVar = (C5015i) N.first;
        C5015i iVar2 = (C5015i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f7688g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f7689h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo15039a(ofFloat);
        iVar2.mo15039a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m10772X(View view, View view2, boolean z, boolean z2, C2313e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float t = C3403t.m14664t(view2) - C3403t.m14664t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-t);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-t});
        }
        eVar.f7697a.mo15031e("elevation").mo15039a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m10773Y(View view, View view2, boolean z, boolean z2, C2313e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C2313e eVar2 = eVar;
        if (view4 instanceof C5028d) {
            C5028d dVar = (C5028d) view4;
            float O = m10763O(view3, view4, eVar2.f7698b);
            float P = m10764P(view3, view4, eVar2.f7698b);
            ((FloatingActionButton) view3).mo8328i(this.f7684c);
            float width = ((float) this.f7684c.width()) / 2.0f;
            C5015i e = eVar2.f7697a.mo15031e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C5028d.C5033e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f15013c;
                }
                animator = C5024a.m21279a(dVar, O, P, C5041a.m21323b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C2312d(this, dVar));
                m10776b0(view2, e.mo15040c(), (int) O, (int) P, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f15013c;
                Animator a = C5024a.m21279a(dVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                m10776b0(view5, e.mo15040c(), i, i2, f3, list);
                long c = e.mo15040c();
                long d = e.mo15041d();
                long f4 = eVar2.f7697a.mo15033f();
                m10775a0(view5, c, d, f4, i, i2, width, list);
                animator = a;
            }
            e.mo15039a(animator);
            list.add(animator);
            list2.add(C5024a.m21280b(dVar));
        }
    }

    /* renamed from: Z */
    private void m10774Z(View view, View view2, boolean z, boolean z2, C2313e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C5028d) && (view instanceof ImageView)) {
            C5028d dVar = (C5028d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C5011e.f14954b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C5011e.f14954b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C2310b(this, view2));
                eVar.f7697a.mo15031e("iconFade").mo15039a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C2311c(this, dVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m10775a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m10776b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m10777c0(View view, View view2, boolean z, boolean z2, C2313e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C2313e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = m10765Q(view3, view4, eVar2.f7698b);
        float R = m10766R(view3, view4, eVar2.f7698b);
        Pair<C5015i, C5015i> N = m10762N(Q, R, z3, eVar2);
        C5015i iVar = (C5015i) N.first;
        C5015i iVar2 = (C5015i) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m10760L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.mo15039a(objectAnimator2);
        iVar2.mo15039a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m10778d0(View view) {
        ColorStateList p = C3403t.m14656p(view);
        if (p != null) {
            return p.getColorForState(view.getDrawableState(), p.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m10779f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo9081J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C2313e e0 = mo9083e0(view2.getContext(), z3);
        if (z3) {
            this.f7688g = view.getTranslationX();
            this.f7689h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m10772X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f7685d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m10777c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m10771W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        C2313e eVar = e0;
        m10774Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m10773Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m10770V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m10769U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C5008b.m21202a(animatorSet, arrayList);
        animatorSet.addListener(new C2309a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2740e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C2313e mo9083e0(Context context, boolean z);

    /* renamed from: g */
    public void mo2742g(CoordinatorLayout.C0551f fVar) {
        if (fVar.f2305h == 0) {
            fVar.f2305h = 80;
        }
    }
}
