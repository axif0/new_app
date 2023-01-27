package p148g.p189d.p190a.p191a.p192i;

import java.util.Set;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.C3730e;
import p148g.p189d.p190a.p191a.C3731f;
import p148g.p189d.p190a.p191a.C3732g;

/* renamed from: g.d.a.a.i.m */
final class C3757m implements C3732g {

    /* renamed from: a */
    private final Set<C3727b> f11414a;

    /* renamed from: b */
    private final C3755l f11415b;

    /* renamed from: c */
    private final C3760p f11416c;

    C3757m(Set<C3727b> set, C3755l lVar, C3760p pVar) {
        this.f11414a = set;
        this.f11415b = lVar;
        this.f11416c = pVar;
    }

    /* renamed from: a */
    public <T> C3731f<T> mo9569a(String str, Class<T> cls, C3727b bVar, C3730e<T, byte[]> eVar) {
        if (this.f11414a.contains(bVar)) {
            return new C3759o(this.f11415b, str, bVar, eVar, this.f11416c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f11414a}));
    }
}
