package p148g.p189d.p281b.p288k;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g.d.b.k.d */
public class C5205d {

    /* renamed from: b */
    private static volatile C5205d f15261b;

    /* renamed from: a */
    private final Set<C5207f> f15262a = new HashSet();

    C5205d() {
    }

    /* renamed from: a */
    public static C5205d m21752a() {
        C5205d dVar = f15261b;
        if (dVar == null) {
            synchronized (C5205d.class) {
                dVar = f15261b;
                if (dVar == null) {
                    dVar = new C5205d();
                    f15261b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C5207f> mo15330b() {
        Set<C5207f> unmodifiableSet;
        synchronized (this.f15262a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f15262a);
        }
        return unmodifiableSet;
    }
}
