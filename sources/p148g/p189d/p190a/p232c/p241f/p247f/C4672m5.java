package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.m5 */
abstract class C4672m5<E> extends AbstractList<E> implements C4581h7<E> {

    /* renamed from: f */
    private boolean f14275f = true;

    C4672m5() {
    }

    /* renamed from: a */
    public boolean mo14223a() {
        return this.f14275f;
    }

    public boolean add(E e) {
        mo14452c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo14452c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo14452c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo14452c() {
        if (!this.f14275f) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo14452c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo14452c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo14452c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo14452c();
        return super.retainAll(collection);
    }

    /* renamed from: y */
    public final void mo14224y() {
        this.f14275f = false;
    }
}
