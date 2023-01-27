package p086f.p144s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.s.c */
public class C3490c extends C3532m {

    /* renamed from: R */
    private static final String[] f10897R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: S */
    private static final Property<Drawable, PointF> f10898S = new C3492b(PointF.class, "boundsOrigin");

    /* renamed from: T */
    private static final Property<C3501k, PointF> f10899T = new C3493c(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<C3501k, PointF> f10900U = new C3494d(PointF.class, "bottomRight");

    /* renamed from: V */
    private static final Property<View, PointF> f10901V = new C3495e(PointF.class, "bottomRight");

    /* renamed from: W */
    private static final Property<View, PointF> f10902W = new C3496f(PointF.class, "topLeft");

    /* renamed from: X */
    private static final Property<View, PointF> f10903X = new C3497g(PointF.class, "position");

    /* renamed from: Y */
    private static C3528k f10904Y = new C3528k();

    /* renamed from: O */
    private int[] f10905O = new int[2];

    /* renamed from: P */
    private boolean f10906P = false;

    /* renamed from: Q */
    private boolean f10907Q = false;

    /* renamed from: f.s.c$a */
    class C3491a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f10908a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f10909b;

        /* renamed from: c */
        final /* synthetic */ View f10910c;

        /* renamed from: d */
        final /* synthetic */ float f10911d;

        C3491a(C3490c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f10908a = viewGroup;
            this.f10909b = bitmapDrawable;
            this.f10910c = view;
            this.f10911d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C3502c0.m15037b(this.f10908a).mo11871d(this.f10909b);
            C3502c0.m15042g(this.f10910c, this.f10911d);
        }
    }

    /* renamed from: f.s.c$b */
    static class C3492b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f10912a = new Rect();

        C3492b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f10912a);
            Rect rect = this.f10912a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f10912a);
            this.f10912a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f10912a);
        }
    }

    /* renamed from: f.s.c$c */
    static class C3493c extends Property<C3501k, PointF> {
        C3493c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3501k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C3501k kVar, PointF pointF) {
            kVar.mo11908c(pointF);
        }
    }

    /* renamed from: f.s.c$d */
    static class C3494d extends Property<C3501k, PointF> {
        C3494d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3501k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C3501k kVar, PointF pointF) {
            kVar.mo11907a(pointF);
        }
    }

    /* renamed from: f.s.c$e */
    static class C3495e extends Property<View, PointF> {
        C3495e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C3502c0.m15041f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: f.s.c$f */
    static class C3496f extends Property<View, PointF> {
        C3496f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C3502c0.m15041f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: f.s.c$g */
    static class C3497g extends Property<View, PointF> {
        C3497g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C3502c0.m15041f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: f.s.c$h */
    class C3498h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3501k f10913a;
        private C3501k mViewBounds = this.f10913a;

        C3498h(C3490c cVar, C3501k kVar) {
            this.f10913a = kVar;
        }
    }

    /* renamed from: f.s.c$i */
    class C3499i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10914a;

        /* renamed from: b */
        final /* synthetic */ View f10915b;

        /* renamed from: c */
        final /* synthetic */ Rect f10916c;

        /* renamed from: d */
        final /* synthetic */ int f10917d;

        /* renamed from: e */
        final /* synthetic */ int f10918e;

        /* renamed from: f */
        final /* synthetic */ int f10919f;

        /* renamed from: g */
        final /* synthetic */ int f10920g;

        C3499i(C3490c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f10915b = view;
            this.f10916c = rect;
            this.f10917d = i;
            this.f10918e = i2;
            this.f10919f = i3;
            this.f10920g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10914a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f10914a) {
                C3403t.m14655o0(this.f10915b, this.f10916c);
                C3502c0.m15041f(this.f10915b, this.f10917d, this.f10918e, this.f10919f, this.f10920g);
            }
        }
    }

    /* renamed from: f.s.c$j */
    class C3500j extends C3540n {

        /* renamed from: a */
        boolean f10921a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f10922b;

        C3500j(C3490c cVar, ViewGroup viewGroup) {
            this.f10922b = viewGroup;
        }

        /* renamed from: b */
        public void mo11903b(C3532m mVar) {
            C3554x.m15255c(this.f10922b, false);
            this.f10921a = true;
        }

        /* renamed from: c */
        public void mo11904c(C3532m mVar) {
            C3554x.m15255c(this.f10922b, false);
        }

        /* renamed from: d */
        public void mo11905d(C3532m mVar) {
            C3554x.m15255c(this.f10922b, true);
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            if (!this.f10921a) {
                C3554x.m15255c(this.f10922b, false);
            }
            mVar.mo11961Y(this);
        }
    }

    /* renamed from: f.s.c$k */
    private static class C3501k {

        /* renamed from: a */
        private int f10923a;

        /* renamed from: b */
        private int f10924b;

        /* renamed from: c */
        private int f10925c;

        /* renamed from: d */
        private int f10926d;

        /* renamed from: e */
        private View f10927e;

        /* renamed from: f */
        private int f10928f;

        /* renamed from: g */
        private int f10929g;

        C3501k(View view) {
            this.f10927e = view;
        }

        /* renamed from: b */
        private void m15033b() {
            C3502c0.m15041f(this.f10927e, this.f10923a, this.f10924b, this.f10925c, this.f10926d);
            this.f10928f = 0;
            this.f10929g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11907a(PointF pointF) {
            this.f10925c = Math.round(pointF.x);
            this.f10926d = Math.round(pointF.y);
            int i = this.f10929g + 1;
            this.f10929g = i;
            if (this.f10928f == i) {
                m15033b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11908c(PointF pointF) {
            this.f10923a = Math.round(pointF.x);
            this.f10924b = Math.round(pointF.y);
            int i = this.f10928f + 1;
            this.f10928f = i;
            if (i == this.f10929g) {
                m15033b();
            }
        }
    }

    /* renamed from: l0 */
    private void m15011l0(C3549s sVar) {
        View view = sVar.f11043b;
        if (C3403t.m14614O(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f11042a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f11042a.put("android:changeBounds:parent", sVar.f11043b.getParent());
            if (this.f10907Q) {
                sVar.f11043b.getLocationInWindow(this.f10905O);
                sVar.f11042a.put("android:changeBounds:windowX", Integer.valueOf(this.f10905O[0]));
                sVar.f11042a.put("android:changeBounds:windowY", Integer.valueOf(this.f10905O[1]));
            }
            if (this.f10906P) {
                sVar.f11042a.put("android:changeBounds:clip", C3403t.m14660r(view));
            }
        }
    }

    /* renamed from: m0 */
    private boolean m15012m0(View view, View view2) {
        if (!this.f10907Q) {
            return true;
        }
        C3549s y = mo11988y(view, true);
        if (y == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == y.f11043b) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public String[] mo11872J() {
        return f10897R;
    }

    /* renamed from: g */
    public void mo11873g(C3549s sVar) {
        m15011l0(sVar);
    }

    /* renamed from: l */
    public void mo11874l(C3549s sVar) {
        m15011l0(sVar);
    }

    /* renamed from: r */
    public Animator mo11875r(ViewGroup viewGroup, C3549s sVar, C3549s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C3549s sVar3 = sVar;
        C3549s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f11042a;
        Map<String, Object> map2 = sVar4.f11042a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f11043b;
        if (m15012m0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f11042a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f11042a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f11042a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f11042a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f10906P) {
                view = view3;
                C3502c0.m15041f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo11950A().mo11929a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f10903X;
                    } else {
                        C3501k kVar = new C3501k(view);
                        ObjectAnimator a = C3515f.m15086a(kVar, f10899T, mo11950A().mo11929a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C3515f.m15086a(kVar, f10900U, mo11950A().mo11929a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C3498h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo11950A().mo11929a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f10901V;
                } else {
                    path = mo11950A().mo11929a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f10902W;
                }
                animator = C3515f.m15086a(view, property, path);
            } else {
                view = view3;
                C3502c0.m15041f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C3515f.m15086a(view, f10903X, mo11950A().mo11929a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C3403t.m14655o0(view, rect);
                    C3528k kVar2 = f10904Y;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new C3499i(this, view, rect6, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C3548r.m15243c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C3554x.m15255c(viewGroup4, true);
                mo11964b(new C3500j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f11042a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f11042a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f11042a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f11042a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f10905O);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C3502c0.m15038c(view2);
        C3502c0.m15042g(view2, 0.0f);
        C3502c0.m15037b(viewGroup).mo11870b(bitmapDrawable);
        C3517g A = mo11950A();
        int[] iArr = this.f10905O;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C3521i.m15098a(f10898S, A.mo11929a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C3491a(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
