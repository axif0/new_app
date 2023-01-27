package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.m9 */
class C4677m9 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: f */
    private final /* synthetic */ C4545f9 f14295f;

    private C4677m9(C4545f9 f9Var) {
        this.f14295f = f9Var;
    }

    /* synthetic */ C4677m9(C4545f9 f9Var, C4508d9 d9Var) {
        this(f9Var);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f14295f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f14295f.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f14295f.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C4694n9(this.f14295f, (C4508d9) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f14295f.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f14295f.size();
    }
}
