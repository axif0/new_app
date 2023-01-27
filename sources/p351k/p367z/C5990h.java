package p351k.p367z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.z.h */
class C5990h extends C5989g {
    /* renamed from: c */
    public static final <T, C extends Collection<? super T>> C m24553c(C5983b<? extends T> bVar, C c) {
        C5956g.m24500e(bVar, "$this$toCollection");
        C5956g.m24500e(c, "destination");
        for (Object add : bVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: d */
    public static <T> List<T> m24554d(C5983b<? extends T> bVar) {
        C5956g.m24500e(bVar, "$this$toList");
        return C5869i.m24391d(m24555e(bVar));
    }

    /* renamed from: e */
    public static final <T> List<T> m24555e(C5983b<? extends T> bVar) {
        C5956g.m24500e(bVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m24553c(bVar, arrayList);
        return arrayList;
    }
}
