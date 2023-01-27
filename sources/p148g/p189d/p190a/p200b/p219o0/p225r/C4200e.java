package p148g.p189d.p190a.p200b.p219o0.p225r;

import android.text.Layout;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.o0.r.e */
final class C4200e {

    /* renamed from: a */
    private String f13401a;

    /* renamed from: b */
    private int f13402b;

    /* renamed from: c */
    private boolean f13403c;

    /* renamed from: d */
    private int f13404d;

    /* renamed from: e */
    private boolean f13405e;

    /* renamed from: f */
    private int f13406f = -1;

    /* renamed from: g */
    private int f13407g = -1;

    /* renamed from: h */
    private int f13408h = -1;

    /* renamed from: i */
    private int f13409i = -1;

    /* renamed from: j */
    private int f13410j = -1;

    /* renamed from: k */
    private float f13411k;

    /* renamed from: l */
    private String f13412l;

    /* renamed from: m */
    private C4200e f13413m;

    /* renamed from: n */
    private Layout.Alignment f13414n;

    /* renamed from: l */
    private C4200e m17794l(C4200e eVar, boolean z) {
        if (eVar != null) {
            if (!this.f13403c && eVar.f13403c) {
                mo13275q(eVar.f13402b);
            }
            if (this.f13408h == -1) {
                this.f13408h = eVar.f13408h;
            }
            if (this.f13409i == -1) {
                this.f13409i = eVar.f13409i;
            }
            if (this.f13401a == null) {
                this.f13401a = eVar.f13401a;
            }
            if (this.f13406f == -1) {
                this.f13406f = eVar.f13406f;
            }
            if (this.f13407g == -1) {
                this.f13407g = eVar.f13407g;
            }
            if (this.f13414n == null) {
                this.f13414n = eVar.f13414n;
            }
            if (this.f13410j == -1) {
                this.f13410j = eVar.f13410j;
                this.f13411k = eVar.f13411k;
            }
            if (z && !this.f13405e && eVar.f13405e) {
                mo13273o(eVar.f13404d);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C4200e mo13260a(C4200e eVar) {
        m17794l(eVar, true);
        return this;
    }

    /* renamed from: b */
    public int mo13261b() {
        if (this.f13405e) {
            return this.f13404d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int mo13262c() {
        if (this.f13403c) {
            return this.f13402b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String mo13263d() {
        return this.f13401a;
    }

    /* renamed from: e */
    public float mo13264e() {
        return this.f13411k;
    }

    /* renamed from: f */
    public int mo13265f() {
        return this.f13410j;
    }

    /* renamed from: g */
    public String mo13266g() {
        return this.f13412l;
    }

    /* renamed from: h */
    public int mo13267h() {
        if (this.f13408h == -1 && this.f13409i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f13408h == 1 ? 1 : 0;
        if (this.f13409i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: i */
    public Layout.Alignment mo13268i() {
        return this.f13414n;
    }

    /* renamed from: j */
    public boolean mo13269j() {
        return this.f13405e;
    }

    /* renamed from: k */
    public boolean mo13270k() {
        return this.f13403c;
    }

    /* renamed from: m */
    public boolean mo13271m() {
        return this.f13406f == 1;
    }

    /* renamed from: n */
    public boolean mo13272n() {
        return this.f13407g == 1;
    }

    /* renamed from: o */
    public C4200e mo13273o(int i) {
        this.f13404d = i;
        this.f13405e = true;
        return this;
    }

    /* renamed from: p */
    public C4200e mo13274p(boolean z) {
        C4260a.m18074f(this.f13413m == null);
        this.f13408h = z ? 1 : 0;
        return this;
    }

    /* renamed from: q */
    public C4200e mo13275q(int i) {
        C4260a.m18074f(this.f13413m == null);
        this.f13402b = i;
        this.f13403c = true;
        return this;
    }

    /* renamed from: r */
    public C4200e mo13276r(String str) {
        C4260a.m18074f(this.f13413m == null);
        this.f13401a = str;
        return this;
    }

    /* renamed from: s */
    public C4200e mo13277s(float f) {
        this.f13411k = f;
        return this;
    }

    /* renamed from: t */
    public C4200e mo13278t(int i) {
        this.f13410j = i;
        return this;
    }

    /* renamed from: u */
    public C4200e mo13279u(String str) {
        this.f13412l = str;
        return this;
    }

    /* renamed from: v */
    public C4200e mo13280v(boolean z) {
        C4260a.m18074f(this.f13413m == null);
        this.f13409i = z ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C4200e mo13281w(boolean z) {
        C4260a.m18074f(this.f13413m == null);
        this.f13406f = z ? 1 : 0;
        return this;
    }

    /* renamed from: x */
    public C4200e mo13282x(Layout.Alignment alignment) {
        this.f13414n = alignment;
        return this;
    }

    /* renamed from: y */
    public C4200e mo13283y(boolean z) {
        C4260a.m18074f(this.f13413m == null);
        this.f13407g = z ? 1 : 0;
        return this;
    }
}
