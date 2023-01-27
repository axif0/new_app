package p148g.p325e.p326a;

import android.view.animation.Interpolator;

/* renamed from: g.e.a.g */
public abstract class C5557g implements Cloneable {

    /* renamed from: f */
    float f16063f;

    /* renamed from: g */
    private Interpolator f16064g = null;

    /* renamed from: h */
    boolean f16065h = false;

    /* renamed from: g.e.a.g$a */
    static class C5558a extends C5557g {

        /* renamed from: i */
        float f16066i;

        C5558a(float f) {
            this.f16063f = f;
            Class cls = Float.TYPE;
        }

        C5558a(float f, float f2) {
            this.f16063f = f;
            this.f16066i = f2;
            Class cls = Float.TYPE;
            this.f16065h = true;
        }

        /* renamed from: e */
        public Object mo15987e() {
            return Float.valueOf(this.f16066i);
        }

        /* renamed from: l */
        public void mo15990l(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.f16066i = ((Float) obj).floatValue();
                this.f16065h = true;
            }
        }

        /* renamed from: n */
        public C5558a clone() {
            C5558a aVar = new C5558a(mo15984c(), this.f16066i);
            aVar.mo15989k(mo15986d());
            return aVar;
        }

        /* renamed from: p */
        public float mo15992p() {
            return this.f16066i;
        }
    }

    /* renamed from: g */
    public static C5557g m22958g(float f) {
        return new C5558a(f);
    }

    /* renamed from: i */
    public static C5557g m22959i(float f, float f2) {
        return new C5558a(f, f2);
    }

    /* renamed from: b */
    public abstract C5557g clone();

    /* renamed from: c */
    public float mo15984c() {
        return this.f16063f;
    }

    /* renamed from: d */
    public Interpolator mo15986d() {
        return this.f16064g;
    }

    /* renamed from: e */
    public abstract Object mo15987e();

    /* renamed from: f */
    public boolean mo15988f() {
        return this.f16065h;
    }

    /* renamed from: k */
    public void mo15989k(Interpolator interpolator) {
        this.f16064g = interpolator;
    }

    /* renamed from: l */
    public abstract void mo15990l(Object obj);
}
