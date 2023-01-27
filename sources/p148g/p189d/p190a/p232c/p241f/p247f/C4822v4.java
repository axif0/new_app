package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.v4 */
public final class C4822v4 {
    /* renamed from: a */
    static int m20493a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: b */
    static boolean m20494b(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }
}
