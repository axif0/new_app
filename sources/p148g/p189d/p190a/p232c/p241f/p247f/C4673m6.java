package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.m6 */
public class C4673m6 {

    /* renamed from: b */
    private static volatile C4673m6 f14276b;

    /* renamed from: c */
    private static volatile C4673m6 f14277c;

    /* renamed from: d */
    private static final C4673m6 f14278d = new C4673m6(true);

    /* renamed from: a */
    private final Map<C4674a, C4895z6.C4901f<?, ?>> f14279a;

    /* renamed from: g.d.a.c.f.f.m6$a */
    static final class C4674a {

        /* renamed from: a */
        private final Object f14280a;

        /* renamed from: b */
        private final int f14281b;

        C4674a(Object obj, int i) {
            this.f14280a = obj;
            this.f14281b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4674a)) {
                return false;
            }
            C4674a aVar = (C4674a) obj;
            return this.f14280a == aVar.f14280a && this.f14281b == aVar.f14281b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f14280a) * 65535) + this.f14281b;
        }
    }

    C4673m6() {
        this.f14279a = new HashMap();
    }

    private C4673m6(boolean z) {
        this.f14279a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C4673m6 m19962a() {
        C4673m6 m6Var = f14276b;
        if (m6Var == null) {
            synchronized (C4673m6.class) {
                m6Var = f14276b;
                if (m6Var == null) {
                    m6Var = f14278d;
                    f14276b = m6Var;
                }
            }
        }
        return m6Var;
    }

    /* renamed from: c */
    public static C4673m6 m19963c() {
        Class<C4673m6> cls = C4673m6.class;
        C4673m6 m6Var = f14277c;
        if (m6Var != null) {
            return m6Var;
        }
        synchronized (cls) {
            C4673m6 m6Var2 = f14277c;
            if (m6Var2 != null) {
                return m6Var2;
            }
            C4673m6 b = C4857x6.m20581b(cls);
            f14277c = b;
            return b;
        }
    }

    /* renamed from: b */
    public final <ContainingType extends C4655l8> C4895z6.C4901f<ContainingType, ?> mo14456b(ContainingType containingtype, int i) {
        return this.f14279a.get(new C4674a(containingtype, i));
    }
}
