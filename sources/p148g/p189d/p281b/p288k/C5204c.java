package p148g.p189d.p281b.p288k;

import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2511e;
import com.google.firebase.components.C2526n;
import java.util.Iterator;
import java.util.Set;

/* renamed from: g.d.b.k.c */
public class C5204c implements C5209h {

    /* renamed from: a */
    private final String f15259a;

    /* renamed from: b */
    private final C5205d f15260b;

    C5204c(Set<C5207f> set, C5205d dVar) {
        this.f15259a = m21750d(set);
        this.f15260b = dVar;
    }

    /* renamed from: b */
    public static C2508d<C5209h> m21748b() {
        C2508d.C2510b<C5209h> a = C2508d.m11268a(C5209h.class);
        a.mo9372b(C2526n.m11327g(C5207f.class));
        a.mo9376f(C5203b.m21746b());
        return a.mo9374d();
    }

    /* renamed from: c */
    static /* synthetic */ C5209h m21749c(C2511e eVar) {
        return new C5204c(eVar.mo9363b(C5207f.class), C5205d.m21752a());
    }

    /* renamed from: d */
    private static String m21750d(Set<C5207f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C5207f> it = set.iterator();
        while (it.hasNext()) {
            C5207f next = it.next();
            sb.append(next.mo15324b());
            sb.append('/');
            sb.append(next.mo15325c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo15329a() {
        if (this.f15260b.mo15330b().isEmpty()) {
            return this.f15259a;
        }
        return this.f15259a + ' ' + m21750d(this.f15260b.mo15330b());
    }
}
