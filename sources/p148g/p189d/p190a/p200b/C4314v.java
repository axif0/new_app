package p148g.p189d.p190a.p200b;

import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p228p0.C4234h;

/* renamed from: g.d.a.b.v */
final class C4314v {

    /* renamed from: a */
    public final C3844g0 f13790a;

    /* renamed from: b */
    public final Object f13791b;

    /* renamed from: c */
    public final C4126f.C4128b f13792c;

    /* renamed from: d */
    public final long f13793d;

    /* renamed from: e */
    public final long f13794e;

    /* renamed from: f */
    public final int f13795f;

    /* renamed from: g */
    public final boolean f13796g;

    /* renamed from: h */
    public final C4234h f13797h;

    /* renamed from: i */
    public volatile long f13798i;

    /* renamed from: j */
    public volatile long f13799j;

    public C4314v(C3844g0 g0Var, long j, C4234h hVar) {
        this(g0Var, (Object) null, new C4126f.C4128b(0), j, -9223372036854775807L, 1, false, hVar);
    }

    public C4314v(C3844g0 g0Var, Object obj, C4126f.C4128b bVar, long j, long j2, int i, boolean z, C4234h hVar) {
        this.f13790a = g0Var;
        this.f13791b = obj;
        this.f13792c = bVar;
        this.f13793d = j;
        this.f13794e = j2;
        this.f13798i = j;
        this.f13799j = j;
        this.f13795f = i;
        this.f13796g = z;
        this.f13797h = hVar;
    }

    /* renamed from: a */
    private static void m18401a(C4314v vVar, C4314v vVar2) {
        vVar2.f13798i = vVar.f13798i;
        vVar2.f13799j = vVar.f13799j;
    }

    /* renamed from: b */
    public C4314v mo13581b(boolean z) {
        C4314v vVar = new C4314v(this.f13790a, this.f13791b, this.f13792c, this.f13793d, this.f13794e, this.f13795f, z, this.f13797h);
        m18401a(this, vVar);
        return vVar;
    }

    /* renamed from: c */
    public C4314v mo13582c(int i) {
        C4314v vVar = new C4314v(this.f13790a, this.f13791b, this.f13792c.mo13120a(i), this.f13793d, this.f13794e, this.f13795f, this.f13796g, this.f13797h);
        m18401a(this, vVar);
        return vVar;
    }

    /* renamed from: d */
    public C4314v mo13583d(int i) {
        C4314v vVar = new C4314v(this.f13790a, this.f13791b, this.f13792c, this.f13793d, this.f13794e, i, this.f13796g, this.f13797h);
        m18401a(this, vVar);
        return vVar;
    }

    /* renamed from: e */
    public C4314v mo13584e(C3844g0 g0Var, Object obj) {
        C4314v vVar = new C4314v(g0Var, obj, this.f13792c, this.f13793d, this.f13794e, this.f13795f, this.f13796g, this.f13797h);
        m18401a(this, vVar);
        return vVar;
    }

    /* renamed from: f */
    public C4314v mo13585f(C4234h hVar) {
        C4314v vVar = new C4314v(this.f13790a, this.f13791b, this.f13792c, this.f13793d, this.f13794e, this.f13795f, this.f13796g, hVar);
        m18401a(this, vVar);
        return vVar;
    }

    /* renamed from: g */
    public C4314v mo13586g(C4126f.C4128b bVar, long j, long j2) {
        return new C4314v(this.f13790a, this.f13791b, bVar, j, bVar.mo13121b() ? j2 : -9223372036854775807L, this.f13795f, this.f13796g, this.f13797h);
    }
}
