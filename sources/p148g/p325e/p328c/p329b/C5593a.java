package p148g.p325e.p328c.p329b;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: g.e.c.b.a */
public final class C5593a extends Animation {

    /* renamed from: v */
    public static final boolean f16136v = (Integer.valueOf(Build.VERSION.SDK).intValue() < 11);

    /* renamed from: w */
    private static final WeakHashMap<View, C5593a> f16137w = new WeakHashMap<>();

    /* renamed from: f */
    private final WeakReference<View> f16138f;

    /* renamed from: g */
    private final Camera f16139g = new Camera();

    /* renamed from: h */
    private boolean f16140h;

    /* renamed from: i */
    private float f16141i = 1.0f;

    /* renamed from: j */
    private float f16142j;

    /* renamed from: k */
    private float f16143k;

    /* renamed from: l */
    private float f16144l;

    /* renamed from: m */
    private float f16145m;

    /* renamed from: n */
    private float f16146n;

    /* renamed from: o */
    private float f16147o = 1.0f;

    /* renamed from: p */
    private float f16148p = 1.0f;

    /* renamed from: q */
    private float f16149q;

    /* renamed from: r */
    private float f16150r;

    /* renamed from: s */
    private final RectF f16151s = new RectF();

    /* renamed from: t */
    private final RectF f16152t = new RectF();

    /* renamed from: u */
    private final Matrix f16153u = new Matrix();

    private C5593a(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f16138f = new WeakReference<>(view);
    }

    /* renamed from: K */
    private void m23131K(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        boolean z = this.f16140h;
        float f = z ? this.f16142j : width / 2.0f;
        float f2 = z ? this.f16143k : height / 2.0f;
        float f3 = this.f16144l;
        float f4 = this.f16145m;
        float f5 = this.f16146n;
        if (!(f3 == 0.0f && f4 == 0.0f && f5 == 0.0f)) {
            Camera camera = this.f16139g;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f16147o;
        float f7 = this.f16148p;
        if (!(f6 == 1.0f && f7 == 1.0f)) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.f16149q, this.f16150r);
    }

    /* renamed from: L */
    public static C5593a m23132L(View view) {
        C5593a aVar = f16137w.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        C5593a aVar2 = new C5593a(view);
        f16137w.put(view, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    private void m23133b(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.f16153u;
        matrix.reset();
        m23131K(matrix, view);
        this.f16153u.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* renamed from: u */
    private void m23134u() {
        View view = (View) this.f16138f.get();
        if (view != null && view.getParent() != null) {
            RectF rectF = this.f16152t;
            m23133b(rectF, view);
            rectF.union(this.f16151s);
            ((View) view.getParent()).invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
    }

    /* renamed from: v */
    private void m23135v() {
        View view = (View) this.f16138f.get();
        if (view != null) {
            m23133b(this.f16151s, view);
        }
    }

    /* renamed from: A */
    public void mo16069A(float f) {
        if (this.f16146n != f) {
            m23135v();
            this.f16146n = f;
            m23134u();
        }
    }

    /* renamed from: B */
    public void mo16070B(float f) {
        if (this.f16144l != f) {
            m23135v();
            this.f16144l = f;
            m23134u();
        }
    }

    /* renamed from: C */
    public void mo16071C(float f) {
        if (this.f16145m != f) {
            m23135v();
            this.f16145m = f;
            m23134u();
        }
    }

    /* renamed from: D */
    public void mo16072D(float f) {
        if (this.f16147o != f) {
            m23135v();
            this.f16147o = f;
            m23134u();
        }
    }

    /* renamed from: E */
    public void mo16073E(float f) {
        if (this.f16148p != f) {
            m23135v();
            this.f16148p = f;
            m23134u();
        }
    }

    /* renamed from: F */
    public void mo16074F(float f) {
        if (this.f16149q != f) {
            m23135v();
            this.f16149q = f;
            m23134u();
        }
    }

    /* renamed from: G */
    public void mo16075G(float f) {
        if (this.f16150r != f) {
            m23135v();
            this.f16150r = f;
            m23134u();
        }
    }

    /* renamed from: I */
    public void mo16076I(float f) {
        View view = (View) this.f16138f.get();
        if (view != null) {
            mo16074F(f - ((float) view.getLeft()));
        }
    }

    /* renamed from: J */
    public void mo16077J(float f) {
        View view = (View) this.f16138f.get();
        if (view != null) {
            mo16075G(f - ((float) view.getTop()));
        }
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f16138f.get();
        if (view != null) {
            transformation.setAlpha(this.f16141i);
            m23131K(transformation.getMatrix(), view);
        }
    }

    /* renamed from: c */
    public float mo16079c() {
        return this.f16141i;
    }

    /* renamed from: d */
    public float mo16080d() {
        return this.f16142j;
    }

    /* renamed from: e */
    public float mo16081e() {
        return this.f16143k;
    }

    /* renamed from: f */
    public float mo16082f() {
        return this.f16146n;
    }

    /* renamed from: g */
    public float mo16083g() {
        return this.f16144l;
    }

    /* renamed from: i */
    public float mo16084i() {
        return this.f16145m;
    }

    /* renamed from: k */
    public float mo16085k() {
        return this.f16147o;
    }

    /* renamed from: l */
    public float mo16086l() {
        return this.f16148p;
    }

    /* renamed from: n */
    public int mo16087n() {
        View view = (View) this.f16138f.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: p */
    public int mo16088p() {
        View view = (View) this.f16138f.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: q */
    public float mo16089q() {
        return this.f16149q;
    }

    /* renamed from: r */
    public float mo16090r() {
        return this.f16150r;
    }

    /* renamed from: s */
    public float mo16091s() {
        View view = (View) this.f16138f.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getLeft()) + this.f16149q;
    }

    /* renamed from: t */
    public float mo16092t() {
        View view = (View) this.f16138f.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getTop()) + this.f16150r;
    }

    /* renamed from: x */
    public void mo16093x(float f) {
        if (this.f16141i != f) {
            this.f16141i = f;
            View view = (View) this.f16138f.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: y */
    public void mo16094y(float f) {
        if (!this.f16140h || this.f16142j != f) {
            m23135v();
            this.f16140h = true;
            this.f16142j = f;
            m23134u();
        }
    }

    /* renamed from: z */
    public void mo16095z(float f) {
        if (!this.f16140h || this.f16143k != f) {
            m23135v();
            this.f16140h = true;
            this.f16143k = f;
            m23134u();
        }
    }
}
