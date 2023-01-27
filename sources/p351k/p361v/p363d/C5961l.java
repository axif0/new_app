package p351k.p361v.p363d;

/* renamed from: k.v.d.l */
public final class C5961l implements C5951b {

    /* renamed from: a */
    private final Class<?> f16928a;

    public C5961l(Class<?> cls, String str) {
        C5956g.m24500e(cls, "jClass");
        C5956g.m24500e(str, "moduleName");
        this.f16928a = cls;
    }

    /* renamed from: a */
    public Class<?> mo16999a() {
        return this.f16928a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5961l) && C5956g.m24496a(mo16999a(), ((C5961l) obj).mo16999a());
    }

    public int hashCode() {
        return mo16999a().hashCode();
    }

    public String toString() {
        return mo16999a().toString() + " (Kotlin reflection is not available)";
    }
}
