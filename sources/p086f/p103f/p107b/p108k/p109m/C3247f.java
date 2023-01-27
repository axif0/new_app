package p086f.p103f.p107b.p108k.p109m;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f.f.b.k.m.f */
public class C3247f implements C3245d {

    /* renamed from: a */
    public C3245d f10446a = null;

    /* renamed from: b */
    public boolean f10447b = false;

    /* renamed from: c */
    public boolean f10448c = false;

    /* renamed from: d */
    C3257m f10449d;

    /* renamed from: e */
    C3248a f10450e = C3248a.UNKNOWN;

    /* renamed from: f */
    int f10451f;

    /* renamed from: g */
    public int f10452g;

    /* renamed from: h */
    int f10453h = 1;

    /* renamed from: i */
    C3249g f10454i = null;

    /* renamed from: j */
    public boolean f10455j = false;

    /* renamed from: k */
    List<C3245d> f10456k = new ArrayList();

    /* renamed from: l */
    List<C3247f> f10457l = new ArrayList();

    /* renamed from: f.f.b.k.m.f$a */
    enum C3248a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C3247f(C3257m mVar) {
        this.f10449d = mVar;
    }

    /* renamed from: a */
    public void mo11388a(C3245d dVar) {
        for (C3247f fVar : this.f10457l) {
            if (!fVar.f10455j) {
                return;
            }
        }
        this.f10448c = true;
        C3245d dVar2 = this.f10446a;
        if (dVar2 != null) {
            dVar2.mo11388a(this);
        }
        if (this.f10447b) {
            this.f10449d.mo11388a(this);
            return;
        }
        C3247f fVar2 = null;
        int i = 0;
        for (C3247f next : this.f10457l) {
            if (!(next instanceof C3249g)) {
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f10455j) {
            C3249g gVar = this.f10454i;
            if (gVar != null) {
                if (gVar.f10455j) {
                    this.f10451f = this.f10453h * gVar.f10452g;
                } else {
                    return;
                }
            }
            mo11406d(fVar2.f10452g + this.f10451f);
        }
        C3245d dVar3 = this.f10446a;
        if (dVar3 != null) {
            dVar3.mo11388a(this);
        }
    }

    /* renamed from: b */
    public void mo11404b(C3245d dVar) {
        this.f10456k.add(dVar);
        if (this.f10455j) {
            dVar.mo11388a(dVar);
        }
    }

    /* renamed from: c */
    public void mo11405c() {
        this.f10457l.clear();
        this.f10456k.clear();
        this.f10455j = false;
        this.f10452g = 0;
        this.f10448c = false;
        this.f10447b = false;
    }

    /* renamed from: d */
    public void mo11406d(int i) {
        if (!this.f10455j) {
            this.f10455j = true;
            this.f10452g = i;
            for (C3245d next : this.f10456k) {
                next.mo11388a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10449d.f10478b.mo11328p());
        sb.append(":");
        sb.append(this.f10450e);
        sb.append("(");
        sb.append(this.f10455j ? Integer.valueOf(this.f10452g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f10457l.size());
        sb.append(":d=");
        sb.append(this.f10456k.size());
        sb.append(">");
        return sb.toString();
    }
}
