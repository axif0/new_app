package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0588a;
import com.google.android.material.internal.C2197l;
import java.util.ArrayList;
import java.util.Iterator;
import p086f.p111h.p121l.C3349h;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4962a;
import p148g.p189d.p190a.p252d.p253a0.C4964b;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p256m.C5008b;
import p148g.p189d.p190a.p252d.p256m.C5012f;
import p148g.p189d.p190a.p252d.p256m.C5013g;
import p148g.p189d.p190a.p252d.p256m.C5014h;
import p148g.p189d.p190a.p252d.p270z.C5055b;

/* renamed from: com.google.android.material.floatingactionbutton.b */
class C2152b {

    /* renamed from: F */
    static final TimeInterpolator f7106F = C5007a.f14949c;

    /* renamed from: G */
    static final int[] f7107G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f7108H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f7109I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f7110J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f7111K = {16842910};

    /* renamed from: L */
    static final int[] f7112L = new int[0];

    /* renamed from: A */
    private final Rect f7113A = new Rect();

    /* renamed from: B */
    private final RectF f7114B = new RectF();

    /* renamed from: C */
    private final RectF f7115C = new RectF();

    /* renamed from: D */
    private final Matrix f7116D = new Matrix();

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f7117E;

    /* renamed from: a */
    C4979k f7118a;

    /* renamed from: b */
    C4972g f7119b;

    /* renamed from: c */
    Drawable f7120c;

    /* renamed from: d */
    C2151a f7121d;

    /* renamed from: e */
    Drawable f7122e;

    /* renamed from: f */
    boolean f7123f;

    /* renamed from: g */
    boolean f7124g = true;

    /* renamed from: h */
    float f7125h;

    /* renamed from: i */
    float f7126i;

    /* renamed from: j */
    float f7127j;

    /* renamed from: k */
    int f7128k;

    /* renamed from: l */
    private final C2197l f7129l;

    /* renamed from: m */
    private C5014h f7130m;

    /* renamed from: n */
    private C5014h f7131n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Animator f7132o;

    /* renamed from: p */
    private C5014h f7133p;

    /* renamed from: q */
    private C5014h f7134q;

    /* renamed from: r */
    private float f7135r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f7136s = 1.0f;

    /* renamed from: t */
    private int f7137t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f7138u = 0;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f7139v;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f7140w;

    /* renamed from: x */
    private ArrayList<C2161i> f7141x;

    /* renamed from: y */
    final FloatingActionButton f7142y;

    /* renamed from: z */
    final C4964b f7143z;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    class C2153a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7144a;

        /* renamed from: b */
        final /* synthetic */ boolean f7145b;

        /* renamed from: c */
        final /* synthetic */ C2162j f7146c;

        C2153a(boolean z, C2162j jVar) {
            this.f7145b = z;
            this.f7146c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7144a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C2152b.this.f7138u = 0;
            Animator unused2 = C2152b.this.f7132o = null;
            if (!this.f7144a) {
                C2152b.this.f7142y.mo8613b(this.f7145b ? 8 : 4, this.f7145b);
                C2162j jVar = this.f7146c;
                if (jVar != null) {
                    jVar.mo8379b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C2152b.this.f7142y.mo8613b(0, this.f7145b);
            int unused = C2152b.this.f7138u = 1;
            Animator unused2 = C2152b.this.f7132o = animator;
            this.f7144a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    class C2154b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7148a;

        /* renamed from: b */
        final /* synthetic */ C2162j f7149b;

        C2154b(boolean z, C2162j jVar) {
            this.f7148a = z;
            this.f7149b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C2152b.this.f7138u = 0;
            Animator unused2 = C2152b.this.f7132o = null;
            C2162j jVar = this.f7149b;
            if (jVar != null) {
                jVar.mo8378a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C2152b.this.f7142y.mo8613b(0, this.f7148a);
            int unused = C2152b.this.f7138u = 2;
            Animator unused2 = C2152b.this.f7132o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    class C2155c extends C5013g {
        C2155c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C2152b.this.f7136s = f;
            return super.mo8439a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    class C2156d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f7152a = new FloatEvaluator();

        C2156d(C2152b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f7152a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    class C2157e implements ViewTreeObserver.OnPreDrawListener {
        C2157e() {
        }

        public boolean onPreDraw() {
            C2152b.this.mo8394F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    private class C2158f extends C2164l {
        C2158f(C2152b bVar) {
            super(bVar, (C2153a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8444a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    private class C2159g extends C2164l {
        C2159g() {
            super(C2152b.this, (C2153a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8444a() {
            C2152b bVar = C2152b.this;
            return bVar.f7125h + bVar.f7126i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    private class C2160h extends C2164l {
        C2160h() {
            super(C2152b.this, (C2153a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8444a() {
            C2152b bVar = C2152b.this;
            return bVar.f7125h + bVar.f7127j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    interface C2161i {
        /* renamed from: a */
        void mo8383a();

        /* renamed from: b */
        void mo8384b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    interface C2162j {
        /* renamed from: a */
        void mo8378a();

        /* renamed from: b */
        void mo8379b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    private class C2163k extends C2164l {
        C2163k() {
            super(C2152b.this, (C2153a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8444a() {
            return C2152b.this.f7125h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    private abstract class C2164l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f7157a;

        /* renamed from: b */
        private float f7158b;

        /* renamed from: c */
        private float f7159c;

        private C2164l() {
        }

        /* synthetic */ C2164l(C2152b bVar, C2153a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo8444a();

        public void onAnimationEnd(Animator animator) {
            C2152b.this.mo8416c0((float) ((int) this.f7159c));
            this.f7157a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f7157a) {
                C4972g gVar = C2152b.this.f7119b;
                this.f7158b = gVar == null ? 0.0f : gVar.mo14948w();
                this.f7159c = mo8444a();
                this.f7157a = true;
            }
            C2152b bVar = C2152b.this;
            float f = this.f7158b;
            bVar.mo8416c0((float) ((int) (f + ((this.f7159c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    C2152b(FloatingActionButton floatingActionButton, C4964b bVar) {
        this.f7142y = floatingActionButton;
        this.f7143z = bVar;
        C2197l lVar = new C2197l();
        this.f7129l = lVar;
        lVar.mo8593a(f7107G, m10045i(new C2160h()));
        this.f7129l.mo8593a(f7108H, m10045i(new C2159g()));
        this.f7129l.mo8593a(f7109I, m10045i(new C2159g()));
        this.f7129l.mo8593a(f7110J, m10045i(new C2159g()));
        this.f7129l.mo8593a(f7111K, m10045i(new C2163k()));
        this.f7129l.mo8593a(f7112L, m10045i(new C2158f(this)));
        this.f7135r = this.f7142y.getRotation();
    }

    /* renamed from: W */
    private boolean m10038W() {
        return C3403t.m14614O(this.f7142y) && !this.f7142y.isInEditMode();
    }

    /* renamed from: d0 */
    private void m10042d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C2156d(this));
        }
    }

    /* renamed from: g */
    private void m10043g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7142y.getDrawable();
        if (drawable != null && this.f7137t != 0) {
            RectF rectF = this.f7114B;
            RectF rectF2 = this.f7115C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f7137t;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f7137t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m10044h(C5014h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7142y, View.ALPHA, new float[]{f});
        hVar.mo15031e("opacity").mo15039a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7142y, View.SCALE_X, new float[]{f2});
        hVar.mo15031e("scale").mo15039a(ofFloat2);
        m10042d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f7142y, View.SCALE_Y, new float[]{f2});
        hVar.mo15031e("scale").mo15039a(ofFloat3);
        m10042d0(ofFloat3);
        arrayList.add(ofFloat3);
        m10043g(f3, this.f7116D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f7142y, new C5012f(), new C2155c(), new Matrix[]{new Matrix(this.f7116D)});
        hVar.mo15031e("iconScale").mo15039a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C5008b.m21202a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m10045i(C2164l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f7106F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: k */
    private C5014h m10046k() {
        if (this.f7131n == null) {
            this.f7131n = C5014h.m21214c(this.f7142y.getContext(), C4962a.design_fab_hide_motion_spec);
        }
        C5014h hVar = this.f7131n;
        C3349h.m14361c(hVar);
        return hVar;
    }

    /* renamed from: l */
    private C5014h m10047l() {
        if (this.f7130m == null) {
            this.f7130m = C5014h.m21214c(this.f7142y.getContext(), C4962a.design_fab_show_motion_spec);
        }
        C5014h hVar = this.f7130m;
        C3349h.m14361c(hVar);
        return hVar;
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m10048q() {
        if (this.f7117E == null) {
            this.f7117E = new C2157e();
        }
        return this.f7117E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo8389A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo8390B() {
        ViewTreeObserver viewTreeObserver = this.f7142y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f7117E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f7117E = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8391C(int[] iArr) {
        this.f7129l.mo8595d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo8392D(float f, float f2, float f3) {
        mo8415b0();
        mo8416c0(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8393E(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f7122e
            java.lang.String r1 = "Didn't initialize content background"
            p086f.p111h.p121l.C3349h.m14362d(r0, r1)
            boolean r0 = r7.mo8410V()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f7122e
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            g.d.a.d.a0.b r8 = r7.f7143z
            goto L_0x0024
        L_0x0020:
            g.d.a.d.a0.b r8 = r7.f7143z
            android.graphics.drawable.Drawable r0 = r7.f7122e
        L_0x0024:
            r8.mo8381b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.C2152b.mo8393E(android.graphics.Rect):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo8394F() {
        float rotation = this.f7142y.getRotation();
        if (this.f7135r != rotation) {
            this.f7135r = rotation;
            mo8413Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo8395G() {
        ArrayList<C2161i> arrayList = this.f7141x;
        if (arrayList != null) {
            Iterator<C2161i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8384b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo8396H() {
        ArrayList<C2161i> arrayList = this.f7141x;
        if (arrayList != null) {
            Iterator<C2161i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8383a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo8397I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo8398J(ColorStateList colorStateList) {
        C4972g gVar = this.f7119b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        C2151a aVar = this.f7121d;
        if (aVar != null) {
            aVar.mo8387a(colorStateList);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo8399K(PorterDuff.Mode mode) {
        C4972g gVar = this.f7119b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo8400L(float f) {
        if (this.f7125h != f) {
            this.f7125h = f;
            mo8392D(f, this.f7126i, this.f7127j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo8401M(boolean z) {
        this.f7123f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo8402N(C5014h hVar) {
        this.f7134q = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo8403O(float f) {
        if (this.f7126i != f) {
            this.f7126i = f;
            mo8392D(this.f7125h, f, this.f7127j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo8404P(float f) {
        this.f7136s = f;
        Matrix matrix = this.f7116D;
        m10043g(f, matrix);
        this.f7142y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo8405Q(float f) {
        if (this.f7127j != f) {
            this.f7127j = f;
            mo8392D(this.f7125h, this.f7126i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo8406R(ColorStateList colorStateList) {
        Drawable drawable = this.f7120c;
        if (drawable != null) {
            C0588a.m2772o(drawable, C5055b.m21364d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo8407S(boolean z) {
        this.f7124g = z;
        mo8415b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo8408T(C4979k kVar) {
        this.f7118a = kVar;
        C4972g gVar = this.f7119b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f7120c;
        if (drawable instanceof C4994n) {
            ((C4994n) drawable).setShapeAppearanceModel(kVar);
        }
        C2151a aVar = this.f7121d;
        if (aVar != null) {
            aVar.mo8388b(kVar);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo8409U(C5014h hVar) {
        this.f7133p = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo8410V() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo8411X() {
        return !this.f7123f || this.f7142y.getSizeDimension() >= this.f7128k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo8412Y(C2162j jVar, boolean z) {
        if (!mo8431x()) {
            Animator animator = this.f7132o;
            if (animator != null) {
                animator.cancel();
            }
            if (m10038W()) {
                if (this.f7142y.getVisibility() != 0) {
                    this.f7142y.setAlpha(0.0f);
                    this.f7142y.setScaleY(0.0f);
                    this.f7142y.setScaleX(0.0f);
                    mo8404P(0.0f);
                }
                C5014h hVar = this.f7133p;
                if (hVar == null) {
                    hVar = m10047l();
                }
                AnimatorSet h = m10044h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C2154b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f7139v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f7142y.mo8613b(0, z);
            this.f7142y.setAlpha(1.0f);
            this.f7142y.setScaleY(1.0f);
            this.f7142y.setScaleX(1.0f);
            mo8404P(1.0f);
            if (jVar != null) {
                jVar.mo8378a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo8413Z() {
        int i;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f7135r % 90.0f != 0.0f) {
                i = 1;
                if (this.f7142y.getLayerType() != 1) {
                    floatingActionButton = this.f7142y;
                }
            } else if (this.f7142y.getLayerType() != 0) {
                floatingActionButton = this.f7142y;
                i = 0;
            }
            floatingActionButton.setLayerType(i, (Paint) null);
        }
        C4972g gVar = this.f7119b;
        if (gVar != null) {
            gVar.mo14932d0((int) this.f7135r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final void mo8414a0() {
        mo8404P(this.f7136s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void mo8415b0() {
        Rect rect = this.f7113A;
        mo8425r(rect);
        mo8393E(rect);
        this.f7143z.mo8380a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo8416c0(float f) {
        C4972g gVar = this.f7119b;
        if (gVar != null) {
            gVar.mo14925W(f);
        }
    }

    /* renamed from: d */
    public void mo8417d(Animator.AnimatorListener animatorListener) {
        if (this.f7140w == null) {
            this.f7140w = new ArrayList<>();
        }
        this.f7140w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8418e(Animator.AnimatorListener animatorListener) {
        if (this.f7139v == null) {
            this.f7139v = new ArrayList<>();
        }
        this.f7139v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8419f(C2161i iVar) {
        if (this.f7141x == null) {
            this.f7141x = new ArrayList<>();
        }
        this.f7141x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Drawable mo8420j() {
        return this.f7122e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo8421m() {
        return this.f7125h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo8422n() {
        return this.f7123f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C5014h mo8423o() {
        return this.f7134q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public float mo8424p() {
        return this.f7126i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8425r(Rect rect) {
        int sizeDimension = this.f7123f ? (this.f7128k - this.f7142y.getSizeDimension()) / 2 : 0;
        float m = this.f7124g ? mo8421m() + this.f7127j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo8426s() {
        return this.f7127j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C4979k mo8427t() {
        return this.f7118a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C5014h mo8428u() {
        return this.f7133p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo8429v(C2162j jVar, boolean z) {
        if (!mo8430w()) {
            Animator animator = this.f7132o;
            if (animator != null) {
                animator.cancel();
            }
            if (m10038W()) {
                C5014h hVar = this.f7134q;
                if (hVar == null) {
                    hVar = m10046k();
                }
                AnimatorSet h = m10044h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C2153a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f7140w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f7142y.mo8613b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo8379b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo8430w() {
        return this.f7142y.getVisibility() == 0 ? this.f7138u == 1 : this.f7138u != 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo8431x() {
        return this.f7142y.getVisibility() != 0 ? this.f7138u == 2 : this.f7138u != 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo8432y() {
        this.f7129l.mo8594c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo8433z() {
        C4972g gVar = this.f7119b;
        if (gVar != null) {
            C4976h.m21069f(this.f7142y, gVar);
        }
        if (mo8397I()) {
            this.f7142y.getViewTreeObserver().addOnPreDrawListener(m10048q());
        }
    }
}
