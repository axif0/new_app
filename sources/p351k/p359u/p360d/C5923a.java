package p351k.p359u.p360d;

import p351k.p359u.C5919a;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.u.d.a */
public class C5923a extends C5919a {
    /* renamed from: a */
    public void mo16988a(Throwable th, Throwable th2) {
        C5956g.m24500e(th, "cause");
        C5956g.m24500e(th2, "exception");
        th.addSuppressed(th2);
    }
}
