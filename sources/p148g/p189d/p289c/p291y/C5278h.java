package p148g.p189d.p289c.p291y;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: g.d.c.y.h */
public final class C5278h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: m */
    private static final Comparator<Comparable> f15344m = new C5279a();

    /* renamed from: f */
    Comparator<? super K> f15345f;

    /* renamed from: g */
    C5285e<K, V> f15346g;

    /* renamed from: h */
    int f15347h;

    /* renamed from: i */
    int f15348i;

    /* renamed from: j */
    final C5285e<K, V> f15349j;

    /* renamed from: k */
    private C5278h<K, V>.C0958b f15350k;

    /* renamed from: l */
    private C5278h<K, V>.C0960c f15351l;

    /* renamed from: g.d.c.y.h$a */
    static class C5279a implements Comparator<Comparable> {
        C5279a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: g.d.c.y.h$b */
    class C5280b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: g.d.c.y.h$b$a */
        class C5281a extends C5278h<K, V>.d<Map.Entry<K, V>> {
            C5281a(C5280b bVar) {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return mo15471b();
            }
        }

        C5280b() {
        }

        public void clear() {
            C5278h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C5278h.this.mo15444c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5281a(this);
        }

        public boolean remove(Object obj) {
            C5285e c;
            if (!(obj instanceof Map.Entry) || (c = C5278h.this.mo15444c((Map.Entry) obj)) == null) {
                return false;
            }
            C5278h.this.mo15449f(c, true);
            return true;
        }

        public int size() {
            return C5278h.this.f15347h;
        }
    }

    /* renamed from: g.d.c.y.h$c */
    final class C5282c extends AbstractSet<K> {

        /* renamed from: g.d.c.y.h$c$a */
        class C5283a extends C5278h<K, V>.d<K> {
            C5283a(C5282c cVar) {
                super();
            }

            public K next() {
                return mo15471b().f15363k;
            }
        }

        C5282c() {
        }

        public void clear() {
            C5278h.this.clear();
        }

        public boolean contains(Object obj) {
            return C5278h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C5283a(this);
        }

        public boolean remove(Object obj) {
            return C5278h.this.mo15450g(obj) != null;
        }

        public int size() {
            return C5278h.this.f15347h;
        }
    }

    /* renamed from: g.d.c.y.h$d */
    private abstract class C5284d<T> implements Iterator<T> {

        /* renamed from: f */
        C5285e<K, V> f15354f;

        /* renamed from: g */
        C5285e<K, V> f15355g = null;

        /* renamed from: h */
        int f15356h;

        C5284d() {
            C5278h hVar = C5278h.this;
            this.f15354f = hVar.f15349j.f15361i;
            this.f15356h = hVar.f15348i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C5285e<K, V> mo15471b() {
            C5285e<K, V> eVar = this.f15354f;
            C5278h hVar = C5278h.this;
            if (eVar == hVar.f15349j) {
                throw new NoSuchElementException();
            } else if (hVar.f15348i == this.f15356h) {
                this.f15354f = eVar.f15361i;
                this.f15355g = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f15354f != C5278h.this.f15349j;
        }

        public final void remove() {
            C5285e<K, V> eVar = this.f15355g;
            if (eVar != null) {
                C5278h.this.mo15449f(eVar, true);
                this.f15355g = null;
                this.f15356h = C5278h.this.f15348i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g.d.c.y.h$e */
    static final class C5285e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        C5285e<K, V> f15358f;

        /* renamed from: g */
        C5285e<K, V> f15359g;

        /* renamed from: h */
        C5285e<K, V> f15360h;

        /* renamed from: i */
        C5285e<K, V> f15361i;

        /* renamed from: j */
        C5285e<K, V> f15362j;

        /* renamed from: k */
        final K f15363k;

        /* renamed from: l */
        V f15364l;

        /* renamed from: m */
        int f15365m;

        C5285e() {
            this.f15363k = null;
            this.f15362j = this;
            this.f15361i = this;
        }

        C5285e(C5285e<K, V> eVar, K k, C5285e<K, V> eVar2, C5285e<K, V> eVar3) {
            this.f15358f = eVar;
            this.f15363k = k;
            this.f15365m = 1;
            this.f15361i = eVar2;
            this.f15362j = eVar3;
            eVar3.f15361i = this;
            eVar2.f15362j = this;
        }

        /* renamed from: a */
        public C5285e<K, V> mo15474a() {
            C5285e<K, V> eVar = this;
            for (C5285e<K, V> eVar2 = this.f15359g; eVar2 != null; eVar2 = eVar2.f15359g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C5285e<K, V> mo15475b() {
            C5285e<K, V> eVar = this;
            for (C5285e<K, V> eVar2 = this.f15360h; eVar2 != null; eVar2 = eVar2.f15360h) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f15363k
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f15364l
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p289c.p291y.C5278h.C5285e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f15363k;
        }

        public V getValue() {
            return this.f15364l;
        }

        public int hashCode() {
            K k = this.f15363k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f15364l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f15364l;
            this.f15364l = v;
            return v2;
        }

        public String toString() {
            return this.f15363k + "=" + this.f15364l;
        }
    }

    static {
        Class<C5278h> cls = C5278h.class;
    }

    public C5278h() {
        this(f15344m);
    }

    public C5278h(Comparator<? super K> comparator) {
        this.f15347h = 0;
        this.f15348i = 0;
        this.f15349j = new C5285e<>();
        this.f15345f = comparator == null ? f15344m : comparator;
    }

    /* renamed from: a */
    private boolean m21922a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m21923e(C5285e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C5285e<K, V> eVar2 = eVar.f15359g;
            C5285e<K, V> eVar3 = eVar.f15360h;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f15365m : 0;
            int i3 = eVar3 != null ? eVar3.f15365m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C5285e<K, V> eVar4 = eVar3.f15359g;
                C5285e<K, V> eVar5 = eVar3.f15360h;
                int i5 = eVar5 != null ? eVar5.f15365m : 0;
                if (eVar4 != null) {
                    i = eVar4.f15365m;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m21926k(eVar3);
                }
                m21925j(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C5285e<K, V> eVar6 = eVar2.f15359g;
                C5285e<K, V> eVar7 = eVar2.f15360h;
                int i7 = eVar7 != null ? eVar7.f15365m : 0;
                if (eVar6 != null) {
                    i = eVar6.f15365m;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m21925j(eVar2);
                }
                m21926k(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f15365m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f15365m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f15358f;
        }
    }

    /* renamed from: h */
    private void m21924h(C5285e<K, V> eVar, C5285e<K, V> eVar2) {
        C5285e<K, V> eVar3 = eVar.f15358f;
        eVar.f15358f = null;
        if (eVar2 != null) {
            eVar2.f15358f = eVar3;
        }
        if (eVar3 == null) {
            this.f15346g = eVar2;
        } else if (eVar3.f15359g == eVar) {
            eVar3.f15359g = eVar2;
        } else {
            eVar3.f15360h = eVar2;
        }
    }

    /* renamed from: j */
    private void m21925j(C5285e<K, V> eVar) {
        C5285e<K, V> eVar2 = eVar.f15359g;
        C5285e<K, V> eVar3 = eVar.f15360h;
        C5285e<K, V> eVar4 = eVar3.f15359g;
        C5285e<K, V> eVar5 = eVar3.f15360h;
        eVar.f15360h = eVar4;
        if (eVar4 != null) {
            eVar4.f15358f = eVar;
        }
        m21924h(eVar, eVar3);
        eVar3.f15359g = eVar;
        eVar.f15358f = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f15365m : 0, eVar4 != null ? eVar4.f15365m : 0) + 1;
        eVar.f15365m = max;
        if (eVar5 != null) {
            i = eVar5.f15365m;
        }
        eVar3.f15365m = Math.max(max, i) + 1;
    }

    /* renamed from: k */
    private void m21926k(C5285e<K, V> eVar) {
        C5285e<K, V> eVar2 = eVar.f15359g;
        C5285e<K, V> eVar3 = eVar.f15360h;
        C5285e<K, V> eVar4 = eVar2.f15359g;
        C5285e<K, V> eVar5 = eVar2.f15360h;
        eVar.f15359g = eVar5;
        if (eVar5 != null) {
            eVar5.f15358f = eVar;
        }
        m21924h(eVar, eVar2);
        eVar2.f15360h = eVar;
        eVar.f15358f = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f15365m : 0, eVar5 != null ? eVar5.f15365m : 0) + 1;
        eVar.f15365m = max;
        if (eVar4 != null) {
            i = eVar4.f15365m;
        }
        eVar2.f15365m = Math.max(max, i) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5285e<K, V> mo15443b(K k, boolean z) {
        int i;
        C5285e<K, V> eVar;
        Comparator<? super K> comparator = this.f15345f;
        C5285e<K, V> eVar2 = this.f15346g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f15344m ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f15363k;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C5285e<K, V> eVar3 = i < 0 ? eVar2.f15359g : eVar2.f15360h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5285e<K, V> eVar4 = this.f15349j;
        if (eVar2 != null) {
            eVar = new C5285e<>(eVar2, k, eVar4, eVar4.f15362j);
            if (i < 0) {
                eVar2.f15359g = eVar;
            } else {
                eVar2.f15360h = eVar;
            }
            m21923e(eVar2, true);
        } else if (comparator != f15344m || (k instanceof Comparable)) {
            eVar = new C5285e<>(eVar2, k, eVar4, eVar4.f15362j);
            this.f15346g = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f15347h++;
        this.f15348i++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5285e<K, V> mo15444c(Map.Entry<?, ?> entry) {
        C5285e<K, V> d = mo15447d(entry.getKey());
        if (d != null && m21922a(d.f15364l, entry.getValue())) {
            return d;
        }
        return null;
    }

    public void clear() {
        this.f15346g = null;
        this.f15347h = 0;
        this.f15348i++;
        C5285e<K, V> eVar = this.f15349j;
        eVar.f15362j = eVar;
        eVar.f15361i = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo15447d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5285e<K, V> mo15447d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo15443b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C5278h<K, V>.C0958b bVar = this.f15350k;
        if (bVar != null) {
            return bVar;
        }
        C5278h<K, V>.C0958b bVar2 = new C5280b();
        this.f15350k = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15449f(C5285e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C5285e<K, V> eVar2 = eVar.f15362j;
            eVar2.f15361i = eVar.f15361i;
            eVar.f15361i.f15362j = eVar2;
        }
        C5285e<K, V> eVar3 = eVar.f15359g;
        C5285e<K, V> eVar4 = eVar.f15360h;
        C5285e<K, V> eVar5 = eVar.f15358f;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m21924h(eVar, eVar3);
                eVar.f15359g = null;
            } else if (eVar4 != null) {
                m21924h(eVar, eVar4);
                eVar.f15360h = null;
            } else {
                m21924h(eVar, (C5285e<K, V>) null);
            }
            m21923e(eVar5, false);
            this.f15347h--;
            this.f15348i++;
            return;
        }
        C5285e<K, V> b = eVar3.f15365m > eVar4.f15365m ? eVar3.mo15475b() : eVar4.mo15474a();
        mo15449f(b, false);
        C5285e<K, V> eVar6 = eVar.f15359g;
        if (eVar6 != null) {
            i = eVar6.f15365m;
            b.f15359g = eVar6;
            eVar6.f15358f = b;
            eVar.f15359g = null;
        } else {
            i = 0;
        }
        C5285e<K, V> eVar7 = eVar.f15360h;
        if (eVar7 != null) {
            i2 = eVar7.f15365m;
            b.f15360h = eVar7;
            eVar7.f15358f = b;
            eVar.f15360h = null;
        }
        b.f15365m = Math.max(i, i2) + 1;
        m21924h(eVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5285e<K, V> mo15450g(Object obj) {
        C5285e<K, V> d = mo15447d(obj);
        if (d != null) {
            mo15449f(d, true);
        }
        return d;
    }

    public V get(Object obj) {
        C5285e d = mo15447d(obj);
        if (d != null) {
            return d.f15364l;
        }
        return null;
    }

    public Set<K> keySet() {
        C5278h<K, V>.C0960c cVar = this.f15351l;
        if (cVar != null) {
            return cVar;
        }
        C5278h<K, V>.C0960c cVar2 = new C5282c();
        this.f15351l = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C5285e b = mo15443b(k, true);
            V v2 = b.f15364l;
            b.f15364l = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C5285e g = mo15450g(obj);
        if (g != null) {
            return g.f15364l;
        }
        return null;
    }

    public int size() {
        return this.f15347h;
    }
}
