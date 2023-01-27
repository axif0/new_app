package p148g.p189d.p190a.p200b.p228p0;

import p148g.p189d.p190a.p200b.C3833c0;
import p148g.p189d.p190a.p200b.p217n0.C4146n;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.p0.h */
public final class C4234h {

    /* renamed from: a */
    public final C4146n f13532a;

    /* renamed from: b */
    public final boolean[] f13533b;

    /* renamed from: c */
    public final C4231f f13534c;

    /* renamed from: d */
    public final Object f13535d;

    /* renamed from: e */
    public final C3833c0[] f13536e;

    public C4234h(C4146n nVar, boolean[] zArr, C4231f fVar, Object obj, C3833c0[] c0VarArr) {
        this.f13532a = nVar;
        this.f13533b = zArr;
        this.f13534c = fVar;
        this.f13535d = obj;
        this.f13536e = c0VarArr;
    }

    /* renamed from: a */
    public boolean mo13362a(C4234h hVar) {
        if (hVar == null || hVar.f13534c.f13529a != this.f13534c.f13529a) {
            return false;
        }
        for (int i = 0; i < this.f13534c.f13529a; i++) {
            if (!mo13363b(hVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo13363b(C4234h hVar, int i) {
        return hVar != null && this.f13533b[i] == hVar.f13533b[i] && C4284w.m18236b(this.f13534c.mo13357a(i), hVar.f13534c.mo13357a(i)) && C4284w.m18236b(this.f13536e[i], hVar.f13536e[i]);
    }
}
