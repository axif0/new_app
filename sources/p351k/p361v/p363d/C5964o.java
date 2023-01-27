package p351k.p361v.p363d;

import p351k.p366y.C5975a;
import p351k.p366y.C5981f;

/* renamed from: k.v.d.o */
public abstract class C5964o extends C5949a implements C5981f {
    public C5964o() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5964o(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5964o) {
            C5964o oVar = (C5964o) obj;
            return mo16996h().equals(oVar.mo16996h()) && mo16995g().equals(oVar.mo16995g()) && mo16998k().equals(oVar.mo16998k()) && C5956g.m24496a(mo16994f(), oVar.mo16994f());
        } else if (obj instanceof C5981f) {
            return obj.equals(mo16992d());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo16996h().hashCode() * 31) + mo16995g().hashCode()) * 31) + mo16998k().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C5981f mo16997j() {
        return (C5981f) super.mo16997j();
    }

    public String toString() {
        C5975a d = mo16992d();
        if (d != this) {
            return d.toString();
        }
        return "property " + mo16995g() + " (Kotlin reflection is not available)";
    }
}
