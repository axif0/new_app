package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.k3 */
abstract class C4632k3<K, V> implements C4707o4<K, V> {
    C4632k3() {
    }

    /* renamed from: a */
    public abstract Map<K, Collection<V>> mo14241a();

    /* renamed from: b */
    public boolean mo14242b(@NullableDecl Object obj) {
        for (Collection contains : mo14241a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4707o4) {
            return mo14241a().equals(((C4707o4) obj).mo14241a());
        }
        return false;
    }

    public int hashCode() {
        return mo14241a().hashCode();
    }

    public String toString() {
        return mo14241a().toString();
    }
}
