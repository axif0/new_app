package p351k.p353r;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p351k.p361v.p363d.C5953d;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.s */
public final class C5879s implements List, Serializable, RandomAccess {

    /* renamed from: f */
    public static final C5879s f16888f = new C5879s();

    private C5879s() {
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public boolean mo16886c(Void voidR) {
        C5956g.m24500e(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo16886c((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C5956g.m24500e(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public Void mo16890d(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* renamed from: f */
    public int mo16892f() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        mo16890d(i);
        throw null;
    }

    /* renamed from: h */
    public int mo16894h(Void voidR) {
        C5956g.m24500e(voidR, "element");
        return -1;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo16894h((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C5878r.f16887f;
    }

    /* renamed from: j */
    public int mo16899j(Void voidR) {
        C5956g.m24500e(voidR, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo16899j((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C5878r.f16887f;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C5878r.f16887f;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo16892f();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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
