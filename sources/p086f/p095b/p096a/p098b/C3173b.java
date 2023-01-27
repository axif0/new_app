package p086f.p095b.p096a.p098b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: f.b.a.b.b */
public class C3173b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    C3176c<K, V> f10096f;

    /* renamed from: g */
    private C3176c<K, V> f10097g;

    /* renamed from: h */
    private WeakHashMap<C3179f<K, V>, Boolean> f10098h = new WeakHashMap<>();

    /* renamed from: i */
    private int f10099i = 0;

    /* renamed from: f.b.a.b.b$a */
    static class C3174a<K, V> extends C3178e<K, V> {
        C3174a(C3176c<K, V> cVar, C3176c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3176c<K, V> mo10989c(C3176c<K, V> cVar) {
            return cVar.f10103i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3176c<K, V> mo10990d(C3176c<K, V> cVar) {
            return cVar.f10102h;
        }
    }

    /* renamed from: f.b.a.b.b$b */
    private static class C3175b<K, V> extends C3178e<K, V> {
        C3175b(C3176c<K, V> cVar, C3176c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3176c<K, V> mo10989c(C3176c<K, V> cVar) {
            return cVar.f10102h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3176c<K, V> mo10990d(C3176c<K, V> cVar) {
            return cVar.f10103i;
        }
    }

    /* renamed from: f.b.a.b.b$c */
    static class C3176c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f10100f;

        /* renamed from: g */
        final V f10101g;

        /* renamed from: h */
        C3176c<K, V> f10102h;

        /* renamed from: i */
        C3176c<K, V> f10103i;

        C3176c(K k, V v) {
            this.f10100f = k;
            this.f10101g = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3176c)) {
                return false;
            }
            C3176c cVar = (C3176c) obj;
            return this.f10100f.equals(cVar.f10100f) && this.f10101g.equals(cVar.f10101g);
        }

        public K getKey() {
            return this.f10100f;
        }

        public V getValue() {
            return this.f10101g;
        }

        public int hashCode() {
            return this.f10100f.hashCode() ^ this.f10101g.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10100f + "=" + this.f10101g;
        }
    }

    /* renamed from: f.b.a.b.b$d */
    private class C3177d implements Iterator<Map.Entry<K, V>>, C3179f<K, V> {

        /* renamed from: f */
        private C3176c<K, V> f10104f;

        /* renamed from: g */
        private boolean f10105g = true;

        C3177d() {
        }

        /* renamed from: b */
        public void mo10997b(C3176c<K, V> cVar) {
            C3176c<K, V> cVar2 = this.f10104f;
            if (cVar == cVar2) {
                C3176c<K, V> cVar3 = cVar2.f10103i;
                this.f10104f = cVar3;
                this.f10105g = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            C3176c<K, V> cVar;
            if (this.f10105g) {
                this.f10105g = false;
                cVar = C3173b.this.f10096f;
            } else {
                C3176c<K, V> cVar2 = this.f10104f;
                cVar = cVar2 != null ? cVar2.f10102h : null;
            }
            this.f10104f = cVar;
            return this.f10104f;
        }

        public boolean hasNext() {
            if (this.f10105g) {
                return C3173b.this.f10096f != null;
            }
            C3176c<K, V> cVar = this.f10104f;
            return (cVar == null || cVar.f10102h == null) ? false : true;
        }
    }

    /* renamed from: f.b.a.b.b$e */
    private static abstract class C3178e<K, V> implements Iterator<Map.Entry<K, V>>, C3179f<K, V> {

        /* renamed from: f */
        C3176c<K, V> f10107f;

        /* renamed from: g */
        C3176c<K, V> f10108g;

        C3178e(C3176c<K, V> cVar, C3176c<K, V> cVar2) {
            this.f10107f = cVar2;
            this.f10108g = cVar;
        }

        /* renamed from: f */
        private C3176c<K, V> m13584f() {
            C3176c<K, V> cVar = this.f10108g;
            C3176c<K, V> cVar2 = this.f10107f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo10990d(cVar);
        }

        /* renamed from: b */
        public void mo10997b(C3176c<K, V> cVar) {
            if (this.f10107f == cVar && cVar == this.f10108g) {
                this.f10108g = null;
                this.f10107f = null;
            }
            C3176c<K, V> cVar2 = this.f10107f;
            if (cVar2 == cVar) {
                this.f10107f = mo10989c(cVar2);
            }
            if (this.f10108g == cVar) {
                this.f10108g = m13584f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C3176c<K, V> mo10989c(C3176c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C3176c<K, V> mo10990d(C3176c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C3176c<K, V> cVar = this.f10108g;
            this.f10108g = m13584f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f10108g != null;
        }
    }

    /* renamed from: f.b.a.b.b$f */
    interface C3179f<K, V> {
        /* renamed from: b */
        void mo10997b(C3176c<K, V> cVar);
    }

    /* renamed from: c */
    public Iterator<Map.Entry<K, V>> mo10979c() {
        C3175b bVar = new C3175b(this.f10097g, this.f10096f);
        this.f10098h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo10980d() {
        return this.f10096f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3173b)) {
            return false;
        }
        C3173b bVar = (C3173b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C3176c<K, V> mo10975f(K k) {
        C3176c<K, V> cVar = this.f10096f;
        while (cVar != null && !cVar.f10100f.equals(k)) {
            cVar = cVar.f10102h;
        }
        return cVar;
    }

    /* renamed from: h */
    public C3173b<K, V>.d mo10982h() {
        C3173b<K, V>.d dVar = new C3177d();
        this.f10098h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Map.Entry<K, V> mo10984i() {
        return this.f10097g;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C3174a aVar = new C3174a(this.f10096f, this.f10097g);
        this.f10098h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C3176c<K, V> mo10986j(K k, V v) {
        C3176c<K, V> cVar = new C3176c<>(k, v);
        this.f10099i++;
        C3176c<K, V> cVar2 = this.f10097g;
        if (cVar2 == null) {
            this.f10096f = cVar;
        } else {
            cVar2.f10102h = cVar;
            cVar.f10103i = cVar2;
        }
        this.f10097g = cVar;
        return cVar;
    }

    /* renamed from: m */
    public V mo10976m(K k, V v) {
        C3176c f = mo10975f(k);
        if (f != null) {
            return f.f10101g;
        }
        mo10986j(k, v);
        return null;
    }

    /* renamed from: o */
    public V mo10977o(K k) {
        C3176c f = mo10975f(k);
        if (f == null) {
            return null;
        }
        this.f10099i--;
        if (!this.f10098h.isEmpty()) {
            for (C3179f<K, V> b : this.f10098h.keySet()) {
                b.mo10997b(f);
            }
        }
        C3176c<K, V> cVar = f.f10103i;
        if (cVar != null) {
            cVar.f10102h = f.f10102h;
        } else {
            this.f10096f = f.f10102h;
        }
        C3176c<K, V> cVar2 = f.f10102h;
        if (cVar2 != null) {
            cVar2.f10103i = f.f10103i;
        } else {
            this.f10097g = f.f10103i;
        }
        f.f10102h = null;
        f.f10103i = null;
        return f.f10101g;
    }

    public int size() {
        return this.f10099i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
