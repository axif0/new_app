package p148g.p189d.p190a.p252d.p254b0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p252d.p253a0.C4963a;

/* renamed from: g.d.a.d.b0.m */
public class C4986m {
    @Deprecated

    /* renamed from: a */
    public float f14900a;
    @Deprecated

    /* renamed from: b */
    public float f14901b;
    @Deprecated

    /* renamed from: c */
    public float f14902c;
    @Deprecated

    /* renamed from: d */
    public float f14903d;
    @Deprecated

    /* renamed from: e */
    public float f14904e;
    @Deprecated

    /* renamed from: f */
    public float f14905f;

    /* renamed from: g */
    private final List<C4992f> f14906g = new ArrayList();

    /* renamed from: h */
    private final List<C4993g> f14907h = new ArrayList();

    /* renamed from: i */
    private boolean f14908i;

    /* renamed from: g.d.a.d.b0.m$a */
    class C4987a extends C4993g {

        /* renamed from: b */
        final /* synthetic */ List f14909b;

        /* renamed from: c */
        final /* synthetic */ Matrix f14910c;

        C4987a(C4986m mVar, List list, Matrix matrix) {
            this.f14909b = list;
            this.f14910c = matrix;
        }

        /* renamed from: a */
        public void mo15006a(Matrix matrix, C4963a aVar, int i, Canvas canvas) {
            for (C4993g a : this.f14909b) {
                a.mo15006a(this.f14910c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: g.d.a.d.b0.m$b */
    static class C4988b extends C4993g {

        /* renamed from: b */
        private final C4990d f14911b;

        public C4988b(C4990d dVar) {
            this.f14911b = dVar;
        }

        /* renamed from: a */
        public void mo15006a(Matrix matrix, C4963a aVar, int i, Canvas canvas) {
            float h = this.f14911b.m21179m();
            float i2 = this.f14911b.m21180n();
            aVar.mo14899a(canvas, matrix, new RectF(this.f14911b.m21177k(), this.f14911b.m21181o(), this.f14911b.m21178l(), this.f14911b.m21176j()), i, h, i2);
        }
    }

    /* renamed from: g.d.a.d.b0.m$c */
    static class C4989c extends C4993g {

        /* renamed from: b */
        private final C4991e f14912b;

        /* renamed from: c */
        private final float f14913c;

        /* renamed from: d */
        private final float f14914d;

        public C4989c(C4991e eVar, float f, float f2) {
            this.f14912b = eVar;
            this.f14913c = f;
            this.f14914d = f2;
        }

        /* renamed from: a */
        public void mo15006a(Matrix matrix, C4963a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f14912b.f14923c - this.f14914d), (double) (this.f14912b.f14922b - this.f14913c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f14913c, this.f14914d);
            matrix2.preRotate(mo15007c());
            aVar.mo14900b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo15007c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f14912b.f14923c - this.f14914d) / (this.f14912b.f14922b - this.f14913c))));
        }
    }

    /* renamed from: g.d.a.d.b0.m$d */
    public static class C4990d extends C4992f {

        /* renamed from: h */
        private static final RectF f14915h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f14916b;
        @Deprecated

        /* renamed from: c */
        public float f14917c;
        @Deprecated

        /* renamed from: d */
        public float f14918d;
        @Deprecated

        /* renamed from: e */
        public float f14919e;
        @Deprecated

        /* renamed from: f */
        public float f14920f;
        @Deprecated

        /* renamed from: g */
        public float f14921g;

        public C4990d(float f, float f2, float f3, float f4) {
            m21183q(f);
            m21187u(f2);
            m21184r(f3);
            m21182p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m21176j() {
            return this.f14919e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m21177k() {
            return this.f14916b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m21178l() {
            return this.f14918d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m21179m() {
            return this.f14920f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m21180n() {
            return this.f14921g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m21181o() {
            return this.f14917c;
        }

        /* renamed from: p */
        private void m21182p(float f) {
            this.f14919e = f;
        }

        /* renamed from: q */
        private void m21183q(float f) {
            this.f14916b = f;
        }

        /* renamed from: r */
        private void m21184r(float f) {
            this.f14918d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m21185s(float f) {
            this.f14920f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m21186t(float f) {
            this.f14921g = f;
        }

        /* renamed from: u */
        private void m21187u(float f) {
            this.f14917c = f;
        }

        /* renamed from: a */
        public void mo15008a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14924a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f14915h.set(m21177k(), m21181o(), m21178l(), m21176j());
            path.arcTo(f14915h, m21179m(), m21180n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: g.d.a.d.b0.m$e */
    public static class C4991e extends C4992f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f14922b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f14923c;

        /* renamed from: a */
        public void mo15008a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14924a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f14922b, this.f14923c);
            path.transform(matrix);
        }
    }

    /* renamed from: g.d.a.d.b0.m$f */
    public static abstract class C4992f {

        /* renamed from: a */
        protected final Matrix f14924a = new Matrix();

        /* renamed from: a */
        public abstract void mo15008a(Matrix matrix, Path path);
    }

    /* renamed from: g.d.a.d.b0.m$g */
    static abstract class C4993g {

        /* renamed from: a */
        static final Matrix f14925a = new Matrix();

        C4993g() {
        }

        /* renamed from: a */
        public abstract void mo15006a(Matrix matrix, C4963a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo15009b(C4963a aVar, int i, Canvas canvas) {
            mo15006a(f14925a, aVar, i, canvas);
        }
    }

    public C4986m() {
        mo15004n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m21143b(float f) {
        if (m21145g() != f) {
            float g = ((f - m21145g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C4990d dVar = new C4990d(mo14999i(), mo15000j(), mo14999i(), mo15000j());
                dVar.m21185s(m21145g());
                dVar.m21186t(g);
                this.f14907h.add(new C4988b(dVar));
                m21147p(f);
            }
        }
    }

    /* renamed from: c */
    private void m21144c(C4993g gVar, float f, float f2) {
        m21143b(f);
        this.f14907h.add(gVar);
        m21147p(f2);
    }

    /* renamed from: g */
    private float m21145g() {
        return this.f14904e;
    }

    /* renamed from: h */
    private float m21146h() {
        return this.f14905f;
    }

    /* renamed from: p */
    private void m21147p(float f) {
        this.f14904e = f;
    }

    /* renamed from: q */
    private void m21148q(float f) {
        this.f14905f = f;
    }

    /* renamed from: r */
    private void m21149r(float f) {
        this.f14902c = f;
    }

    /* renamed from: s */
    private void m21150s(float f) {
        this.f14903d = f;
    }

    /* renamed from: t */
    private void m21151t(float f) {
        this.f14900a = f;
    }

    /* renamed from: u */
    private void m21152u(float f) {
        this.f14901b = f;
    }

    /* renamed from: a */
    public void mo14995a(float f, float f2, float f3, float f4, float f5, float f6) {
        C4990d dVar = new C4990d(f, f2, f3, f4);
        dVar.m21185s(f5);
        dVar.m21186t(f6);
        this.f14906g.add(dVar);
        C4988b bVar = new C4988b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m21144c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m21149r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m21150s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo14996d(Matrix matrix, Path path) {
        int size = this.f14906g.size();
        for (int i = 0; i < size; i++) {
            this.f14906g.get(i).mo15008a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo14997e() {
        return this.f14908i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4993g mo14998f(Matrix matrix) {
        m21143b(m21146h());
        return new C4987a(this, new ArrayList(this.f14907h), matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo14999i() {
        return this.f14902c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo15000j() {
        return this.f14903d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo15001k() {
        return this.f14900a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo15002l() {
        return this.f14901b;
    }

    /* renamed from: m */
    public void mo15003m(float f, float f2) {
        C4991e eVar = new C4991e();
        float unused = eVar.f14922b = f;
        float unused2 = eVar.f14923c = f2;
        this.f14906g.add(eVar);
        C4989c cVar = new C4989c(eVar, mo14999i(), mo15000j());
        m21144c(cVar, cVar.mo15007c() + 270.0f, cVar.mo15007c() + 270.0f);
        m21149r(f);
        m21150s(f2);
    }

    /* renamed from: n */
    public void mo15004n(float f, float f2) {
        mo15005o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo15005o(float f, float f2, float f3, float f4) {
        m21151t(f);
        m21152u(f2);
        m21149r(f);
        m21150s(f2);
        m21147p(f3);
        m21148q((f3 + f4) % 360.0f);
        this.f14906g.clear();
        this.f14907h.clear();
        this.f14908i = false;
    }
}
