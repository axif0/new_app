package p048d.p049a.p050a.p051a.p073p;

import java.util.concurrent.TimeUnit;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5228g;
import p374m.C6265x;
import p386o.C6373s;
import p386o.p387x.p388a.C6383a;

/* renamed from: d.a.a.a.p.b */
public class C3052b {

    /* renamed from: a */
    private static C6373s f9745a;

    /* renamed from: a */
    public static C6373s m13111a(String str) {
        if (f9745a == null) {
            C6265x.C6267b y = new C6265x().mo17766y();
            y.mo17770d(600, TimeUnit.SECONDS);
            y.mo17773g(60, TimeUnit.SECONDS);
            y.mo17774h(60, TimeUnit.SECONDS);
            C6265x b = y.mo17768b();
            C5228g gVar = new C5228g();
            gVar.mo15368c();
            C5221f b2 = gVar.mo15367b();
            C6373s.C6375b bVar = new C6373s.C6375b();
            bVar.mo18009b(str);
            bVar.mo18008a(C6383a.m26229f(b2));
            bVar.mo18013f(b);
            f9745a = bVar.mo18011d();
        }
        return f9745a;
    }
}
