package p086f.p095b.p096a.p098b;

import java.util.HashMap;
import java.util.Map;
import p086f.p095b.p096a.p098b.C3173b;

/* renamed from: f.b.a.b.a */
public class C3172a<K, V> extends C3173b<K, V> {

    /* renamed from: j */
    private HashMap<K, C3173b.C3176c<K, V>> f10095j = new HashMap<>();

    public boolean contains(K k) {
        return this.f10095j.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C3173b.C3176c<K, V> mo10975f(K k) {
        return this.f10095j.get(k);
    }

    /* renamed from: m */
    public V mo10976m(K k, V v) {
        C3173b.C3176c f = mo10975f(k);
        if (f != null) {
            return f.f10101g;
        }
        this.f10095j.put(k, mo10986j(k, v));
        return null;
    }

    /* renamed from: o */
    public V mo10977o(K k) {
        V o = super.mo10977o(k);
        this.f10095j.remove(k);
        return o;
    }

    /* renamed from: p */
    public Map.Entry<K, V> mo10978p(K k) {
        if (contains(k)) {
            return this.f10095j.get(k).f10103i;
        }
        return null;
    }
}
