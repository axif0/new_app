package p148g.p189d.p190a.p252d.p260q;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p148g.p189d.p190a.p252d.p267w.C5041a;

/* renamed from: g.d.a.d.q.d */
public interface C5028d {

    /* renamed from: g.d.a.d.q.d$b */
    public static class C5030b implements TypeEvaluator<C5033e> {

        /* renamed from: b */
        public static final TypeEvaluator<C5033e> f15007b = new C5030b();

        /* renamed from: a */
        private final C5033e f15008a = new C5033e();

        /* renamed from: a */
        public C5033e evaluate(float f, C5033e eVar, C5033e eVar2) {
            this.f15008a.mo15110a(C5041a.m21324c(eVar.f15011a, eVar2.f15011a, f), C5041a.m21324c(eVar.f15012b, eVar2.f15012b, f), C5041a.m21324c(eVar.f15013c, eVar2.f15013c, f));
            return this.f15008a;
        }
    }

    /* renamed from: g.d.a.d.q.d$c */
    public static class C5031c extends Property<C5028d, C5033e> {

        /* renamed from: a */
        public static final Property<C5028d, C5033e> f15009a = new C5031c("circularReveal");

        private C5031c(String str) {
            super(C5033e.class, str);
        }

        /* renamed from: a */
        public C5033e get(C5028d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C5028d dVar, C5033e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: g.d.a.d.q.d$d */
    public static class C5032d extends Property<C5028d, Integer> {

        /* renamed from: a */
        public static final Property<C5028d, Integer> f15010a = new C5032d("circularRevealScrimColor");

        private C5032d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C5028d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C5028d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: g.d.a.d.q.d$e */
    public static class C5033e {

        /* renamed from: a */
        public float f15011a;

        /* renamed from: b */
        public float f15012b;

        /* renamed from: c */
        public float f15013c;

        private C5033e() {
        }

        public C5033e(float f, float f2, float f3) {
            this.f15011a = f;
            this.f15012b = f2;
            this.f15013c = f3;
        }

        /* renamed from: a */
        public void mo15110a(float f, float f2, float f3) {
            this.f15011a = f;
            this.f15012b = f2;
            this.f15013c = f3;
        }
    }

    /* renamed from: a */
    void mo15080a();

    /* renamed from: b */
    void mo15081b();

    int getCircularRevealScrimColor();

    C5033e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C5033e eVar);
}
