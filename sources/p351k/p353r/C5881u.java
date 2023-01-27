package p351k.p353r;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p351k.p361v.p363d.C5953d;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.u */
public final class C5881u implements Set, Serializable {

    /* renamed from: f */
    public static final C5881u f16890f = new C5881u();

    private C5881u() {
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public boolean mo16936c(Void voidR) {
        C5956g.m24500e(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo16936c((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C5956g.m24500e(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public int mo16940d() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C5878r.f16887f;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo16940d();
    }

    public Object[] toArray() {
        return C5953d.m24494a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C5953d.m24495b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
