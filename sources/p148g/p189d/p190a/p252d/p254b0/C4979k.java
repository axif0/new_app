package p148g.p189d.p190a.p252d.p254b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: g.d.a.d.b0.k */
public class C4979k {

    /* renamed from: a */
    C4969d f14861a;

    /* renamed from: b */
    C4969d f14862b;

    /* renamed from: c */
    C4969d f14863c;

    /* renamed from: d */
    C4969d f14864d;

    /* renamed from: e */
    C4968c f14865e;

    /* renamed from: f */
    C4968c f14866f;

    /* renamed from: g */
    C4968c f14867g;

    /* renamed from: h */
    C4968c f14868h;

    /* renamed from: i */
    C4971f f14869i;

    /* renamed from: j */
    C4971f f14870j;

    /* renamed from: k */
    C4971f f14871k;

    /* renamed from: l */
    C4971f f14872l;

    /* renamed from: g.d.a.d.b0.k$b */
    public static final class C4981b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4969d f14873a = C4976h.m21065b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4969d f14874b = C4976h.m21065b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C4969d f14875c = C4976h.m21065b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C4969d f14876d = C4976h.m21065b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C4968c f14877e = new C4966a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C4968c f14878f = new C4966a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C4968c f14879g = new C4966a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C4968c f14880h = new C4966a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C4971f f14881i = C4976h.m21066c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C4971f f14882j = C4976h.m21066c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C4971f f14883k = C4976h.m21066c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C4971f f14884l = C4976h.m21066c();

        public C4981b() {
        }

        public C4981b(C4979k kVar) {
            this.f14873a = kVar.f14861a;
            this.f14874b = kVar.f14862b;
            this.f14875c = kVar.f14863c;
            this.f14876d = kVar.f14864d;
            this.f14877e = kVar.f14865e;
            this.f14878f = kVar.f14866f;
            this.f14879g = kVar.f14867g;
            this.f14880h = kVar.f14868h;
            this.f14881i = kVar.f14869i;
            this.f14882j = kVar.f14870j;
            this.f14883k = kVar.f14871k;
            this.f14884l = kVar.f14872l;
        }

        /* renamed from: n */
        private static float m21108n(C4969d dVar) {
            if (dVar instanceof C4978j) {
                return ((C4978j) dVar).f14860a;
            }
            if (dVar instanceof C4970e) {
                return ((C4970e) dVar).f14810a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C4981b mo14975A(C4968c cVar) {
            this.f14877e = cVar;
            return this;
        }

        /* renamed from: B */
        public C4981b mo14976B(int i, C4968c cVar) {
            mo14977C(C4976h.m21064a(i));
            mo14979E(cVar);
            return this;
        }

        /* renamed from: C */
        public C4981b mo14977C(C4969d dVar) {
            this.f14874b = dVar;
            float n = m21108n(dVar);
            if (n != -1.0f) {
                mo14978D(n);
            }
            return this;
        }

        /* renamed from: D */
        public C4981b mo14978D(float f) {
            this.f14878f = new C4966a(f);
            return this;
        }

        /* renamed from: E */
        public C4981b mo14979E(C4968c cVar) {
            this.f14878f = cVar;
            return this;
        }

        /* renamed from: m */
        public C4979k mo14980m() {
            return new C4979k(this);
        }

        /* renamed from: o */
        public C4981b mo14981o(float f) {
            mo14992z(f);
            mo14978D(f);
            mo14988v(f);
            mo14984r(f);
            return this;
        }

        /* renamed from: p */
        public C4981b mo14982p(int i, C4968c cVar) {
            mo14983q(C4976h.m21064a(i));
            mo14985s(cVar);
            return this;
        }

        /* renamed from: q */
        public C4981b mo14983q(C4969d dVar) {
            this.f14876d = dVar;
            float n = m21108n(dVar);
            if (n != -1.0f) {
                mo14984r(n);
            }
            return this;
        }

        /* renamed from: r */
        public C4981b mo14984r(float f) {
            this.f14880h = new C4966a(f);
            return this;
        }

        /* renamed from: s */
        public C4981b mo14985s(C4968c cVar) {
            this.f14880h = cVar;
            return this;
        }

        /* renamed from: t */
        public C4981b mo14986t(int i, C4968c cVar) {
            mo14987u(C4976h.m21064a(i));
            mo14989w(cVar);
            return this;
        }

        /* renamed from: u */
        public C4981b mo14987u(C4969d dVar) {
            this.f14875c = dVar;
            float n = m21108n(dVar);
            if (n != -1.0f) {
                mo14988v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C4981b mo14988v(float f) {
            this.f14879g = new C4966a(f);
            return this;
        }

        /* renamed from: w */
        public C4981b mo14989w(C4968c cVar) {
            this.f14879g = cVar;
            return this;
        }

        /* renamed from: x */
        public C4981b mo14990x(int i, C4968c cVar) {
            mo14991y(C4976h.m21064a(i));
            mo14975A(cVar);
            return this;
        }

        /* renamed from: y */
        public C4981b mo14991y(C4969d dVar) {
            this.f14873a = dVar;
            float n = m21108n(dVar);
            if (n != -1.0f) {
                mo14992z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C4981b mo14992z(float f) {
            this.f14877e = new C4966a(f);
            return this;
        }
    }

    /* renamed from: g.d.a.d.b0.k$c */
    public interface C4982c {
        /* renamed from: a */
        C4968c mo14954a(C4968c cVar);
    }

    public C4979k() {
        this.f14861a = C4976h.m21065b();
        this.f14862b = C4976h.m21065b();
        this.f14863c = C4976h.m21065b();
        this.f14864d = C4976h.m21065b();
        this.f14865e = new C4966a(0.0f);
        this.f14866f = new C4966a(0.0f);
        this.f14867g = new C4966a(0.0f);
        this.f14868h = new C4966a(0.0f);
        this.f14869i = C4976h.m21066c();
        this.f14870j = C4976h.m21066c();
        this.f14871k = C4976h.m21066c();
        this.f14872l = C4976h.m21066c();
    }

    private C4979k(C4981b bVar) {
        this.f14861a = bVar.f14873a;
        this.f14862b = bVar.f14874b;
        this.f14863c = bVar.f14875c;
        this.f14864d = bVar.f14876d;
        this.f14865e = bVar.f14877e;
        this.f14866f = bVar.f14878f;
        this.f14867g = bVar.f14879g;
        this.f14868h = bVar.f14880h;
        this.f14869i = bVar.f14881i;
        this.f14870j = bVar.f14882j;
        this.f14871k = bVar.f14883k;
        this.f14872l = bVar.f14884l;
    }

    /* renamed from: a */
    public static C4981b m21072a() {
        return new C4981b();
    }

    /* renamed from: b */
    public static C4981b m21073b(Context context, int i, int i2) {
        return m21074c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C4981b m21074c(Context context, int i, int i2, int i3) {
        return m21075d(context, i, i2, new C4966a((float) i3));
    }

    /* renamed from: d */
    private static C4981b m21075d(Context context, int i, int i2, C4968c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5006l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C5006l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C5006l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C5006l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C5006l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C5006l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            C4968c m = m21079m(obtainStyledAttributes, C5006l.ShapeAppearance_cornerSize, cVar);
            C4968c m2 = m21079m(obtainStyledAttributes, C5006l.ShapeAppearance_cornerSizeTopLeft, m);
            C4968c m3 = m21079m(obtainStyledAttributes, C5006l.ShapeAppearance_cornerSizeTopRight, m);
            C4968c m4 = m21079m(obtainStyledAttributes, C5006l.ShapeAppearance_cornerSizeBottomRight, m);
            C4968c m5 = m21079m(obtainStyledAttributes, C5006l.ShapeAppearance_cornerSizeBottomLeft, m);
            C4981b bVar = new C4981b();
            bVar.mo14990x(i4, m2);
            bVar.mo14976B(i5, m3);
            bVar.mo14986t(i6, m4);
            bVar.mo14982p(i7, m5);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C4981b m21076e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m21077f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C4981b m21077f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m21078g(context, attributeSet, i, i2, new C4966a((float) i3));
    }

    /* renamed from: g */
    public static C4981b m21078g(Context context, AttributeSet attributeSet, int i, int i2, C4968c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C5006l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C5006l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m21075d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C4968c m21079m(TypedArray typedArray, int i, C4968c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C4966a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C4977i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C4971f mo14959h() {
        return this.f14871k;
    }

    /* renamed from: i */
    public C4969d mo14960i() {
        return this.f14864d;
    }

    /* renamed from: j */
    public C4968c mo14961j() {
        return this.f14868h;
    }

    /* renamed from: k */
    public C4969d mo14962k() {
        return this.f14863c;
    }

    /* renamed from: l */
    public C4968c mo14963l() {
        return this.f14867g;
    }

    /* renamed from: n */
    public C4971f mo14964n() {
        return this.f14872l;
    }

    /* renamed from: o */
    public C4971f mo14965o() {
        return this.f14870j;
    }

    /* renamed from: p */
    public C4971f mo14966p() {
        return this.f14869i;
    }

    /* renamed from: q */
    public C4969d mo14967q() {
        return this.f14861a;
    }

    /* renamed from: r */
    public C4968c mo14968r() {
        return this.f14865e;
    }

    /* renamed from: s */
    public C4969d mo14969s() {
        return this.f14862b;
    }

    /* renamed from: t */
    public C4968c mo14970t() {
        return this.f14866f;
    }

    /* renamed from: u */
    public boolean mo14971u(RectF rectF) {
        Class<C4971f> cls = C4971f.class;
        boolean z = this.f14872l.getClass().equals(cls) && this.f14870j.getClass().equals(cls) && this.f14869i.getClass().equals(cls) && this.f14871k.getClass().equals(cls);
        float a = this.f14865e.mo14903a(rectF);
        return z && ((this.f14866f.mo14903a(rectF) > a ? 1 : (this.f14866f.mo14903a(rectF) == a ? 0 : -1)) == 0 && (this.f14868h.mo14903a(rectF) > a ? 1 : (this.f14868h.mo14903a(rectF) == a ? 0 : -1)) == 0 && (this.f14867g.mo14903a(rectF) > a ? 1 : (this.f14867g.mo14903a(rectF) == a ? 0 : -1)) == 0) && ((this.f14862b instanceof C4978j) && (this.f14861a instanceof C4978j) && (this.f14863c instanceof C4978j) && (this.f14864d instanceof C4978j));
    }

    /* renamed from: v */
    public C4981b mo14972v() {
        return new C4981b(this);
    }

    /* renamed from: w */
    public C4979k mo14973w(float f) {
        C4981b v = mo14972v();
        v.mo14981o(f);
        return v.mo14980m();
    }

    /* renamed from: x */
    public C4979k mo14974x(C4982c cVar) {
        C4981b v = mo14972v();
        v.mo14975A(cVar.mo14954a(mo14968r()));
        v.mo14979E(cVar.mo14954a(mo14970t()));
        v.mo14985s(cVar.mo14954a(mo14961j()));
        v.mo14989w(cVar.mo14954a(mo14963l()));
        return v.mo14980m();
    }
}
