package p086f.p102e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: f.e.f */
abstract class C3197f<K, V> {

    /* renamed from: a */
    C3197f<K, V>.C0958b f10153a;

    /* renamed from: b */
    C3197f<K, V>.C0960c f10154b;

    /* renamed from: c */
    C3197f<K, V>.e f10155c;

    /* renamed from: f.e.f$a */
    final class C3198a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f10156f;

        /* renamed from: g */
        int f10157g;

        /* renamed from: h */
        int f10158h;

        /* renamed from: i */
        boolean f10159i = false;

        C3198a(int i) {
            this.f10156f = i;
            this.f10157g = C3197f.this.mo11020d();
        }

        public boolean hasNext() {
            return this.f10158h < this.f10157g;
        }

        public T next() {
            if (hasNext()) {
                T b = C3197f.this.mo11018b(this.f10158h, this.f10156f);
                this.f10158h++;
                this.f10159i = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f10159i) {
                int i = this.f10158h - 1;
                this.f10158h = i;
                this.f10157g--;
                this.f10159i = false;
                C3197f.this.mo11024h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: f.e.f$b */
    final class C3199b implements Set<Map.Entry<K, V>> {
        C3199b() {
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo11077c((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C3197f.this.mo11020d();
            for (Map.Entry entry : collection) {
                C3197f.this.mo11023g(entry.getKey(), entry.getValue());
            }
            return d != C3197f.this.mo11020d();
        }

        /* renamed from: c */
        public boolean mo11077c(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3197f.this.mo11017a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C3197f.this.mo11021e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C3194c.m13629c(C3197f.this.mo11018b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C3197f.m13654k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C3197f.this.mo11020d() - 1; d >= 0; d--) {
                Object b = C3197f.this.mo11018b(d, 0);
                Object b2 = C3197f.this.mo11018b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C3197f.this.mo11020d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3201d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C3197f.this.mo11020d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f.e.f$c */
    final class C3200c implements Set<K> {
        C3200c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3197f.this.mo11017a();
        }

        public boolean contains(Object obj) {
            return C3197f.this.mo11021e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C3197f.m13653j(C3197f.this.mo11019c(), collection);
        }

        public boolean equals(Object obj) {
            return C3197f.m13654k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C3197f.this.mo11020d() - 1; d >= 0; d--) {
                Object b = C3197f.this.mo11018b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C3197f.this.mo11020d() == 0;
        }

        public Iterator<K> iterator() {
            return new C3198a(0);
        }

        public boolean remove(Object obj) {
            int e = C3197f.this.mo11021e(obj);
            if (e < 0) {
                return false;
            }
            C3197f.this.mo11024h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C3197f.m13655o(C3197f.this.mo11019c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C3197f.m13656p(C3197f.this.mo11019c(), collection);
        }

        public int size() {
            return C3197f.this.mo11020d();
        }

        public Object[] toArray() {
            return C3197f.this.mo11070q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3197f.this.mo11071r(tArr, 0);
        }
    }

    /* renamed from: f.e.f$d */
    final class C3201d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f10163f;

        /* renamed from: g */
        int f10164g;

        /* renamed from: h */
        boolean f10165h = false;

        C3201d() {
            this.f10163f = C3197f.this.mo11020d() - 1;
            this.f10164g = -1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> mo11106b() {
            if (hasNext()) {
                this.f10164g++;
                this.f10165h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f10165h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C3194c.m13629c(entry.getKey(), C3197f.this.mo11018b(this.f10164g, 0)) && C3194c.m13629c(entry.getValue(), C3197f.this.mo11018b(this.f10164g, 1));
            }
        }

        public K getKey() {
            if (this.f10165h) {
                return C3197f.this.mo11018b(this.f10164g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f10165h) {
                return C3197f.this.mo11018b(this.f10164g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f10164g < this.f10163f;
        }

        public int hashCode() {
            if (this.f10165h) {
                int i = 0;
                Object b = C3197f.this.mo11018b(this.f10164g, 0);
                Object b2 = C3197f.this.mo11018b(this.f10164g, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* bridge */ /* synthetic */ Object next() {
            mo11106b();
            return this;
        }

        public void remove() {
            if (this.f10165h) {
                C3197f.this.mo11024h(this.f10164g);
                this.f10164g--;
                this.f10163f--;
                this.f10165h = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f10165h) {
                return C3197f.this.mo11025i(this.f10164g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: f.e.f$e */
    final class C3202e implements Collection<V> {
        C3202e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3197f.this.mo11017a();
        }

        public boolean contains(Object obj) {
            return C3197f.this.mo11022f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C3197f.this.mo11020d() == 0;
        }

        public Iterator<V> iterator() {
            return new C3198a(1);
        }

        public boolean remove(Object obj) {
            int f = C3197f.this.mo11022f(obj);
            if (f < 0) {
                return false;
            }
            C3197f.this.mo11024h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C3197f.this.mo11020d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C3197f.this.mo11018b(i, 1))) {
                    C3197f.this.mo11024h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C3197f.this.mo11020d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C3197f.this.mo11018b(i, 1))) {
                    C3197f.this.mo11024h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C3197f.this.mo11020d();
        }

        public Object[] toArray() {
            return C3197f.this.mo11070q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3197f.this.mo11071r(tArr, 1);
        }
    }

    C3197f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m13653j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m13654k(Set<T> set, Object obj) {
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
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m13655o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m13656p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11017a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo11018b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo11019c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo11020d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo11021e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo11022f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo11023g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo11024h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo11025i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo11067l() {
        if (this.f10153a == null) {
            this.f10153a = new C3199b();
        }
        return this.f10153a;
    }

    /* renamed from: m */
    public Set<K> mo11068m() {
        if (this.f10154b == null) {
            this.f10154b = new C3200c();
        }
        return this.f10154b;
    }

    /* renamed from: n */
    public Collection<V> mo11069n() {
        if (this.f10155c == null) {
            this.f10155c = new C3202e();
        }
        return this.f10155c;
    }

    /* renamed from: q */
    public Object[] mo11070q(int i) {
        int d = mo11020d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo11018b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo11071r(T[] tArr, int i) {
        int d = mo11020d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo11018b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
