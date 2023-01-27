package p086f.p102e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f.e.a */
public class C3190a<K, V> extends C3203g<K, V> implements Map<K, V> {

    /* renamed from: m */
    C3197f<K, V> f10124m;

    /* renamed from: f.e.a$a */
    class C3191a extends C3197f<K, V> {
        C3191a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11017a() {
            C3190a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11018b(int i, int i2) {
            return C3190a.this.f10173g[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo11019c() {
            return C3190a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo11020d() {
            return C3190a.this.f10174h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo11021e(Object obj) {
            return C3190a.this.mo11134f(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo11022f(Object obj) {
            return C3190a.this.mo11138h(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo11023g(K k, V v) {
            C3190a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo11024h(int i) {
            C3190a.this.mo5868k(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo11025i(int i, V v) {
            return C3190a.this.mo5869l(i, v);
        }
    }

    public C3190a() {
    }

    public C3190a(int i) {
        super(i);
    }

    public C3190a(C3203g gVar) {
        super(gVar);
    }

    /* renamed from: n */
    private C3197f<K, V> m13599n() {
        if (this.f10124m == null) {
            this.f10124m = new C3191a();
        }
        return this.f10124m;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m13599n().mo11067l();
    }

    public Set<K> keySet() {
        return m13599n().mo11068m();
    }

    /* renamed from: o */
    public boolean mo11014o(Collection<?> collection) {
        return C3197f.m13656p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo11129c(this.f10174h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m13599n().mo11069n();
    }
}
