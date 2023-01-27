package p148g.p189d.p190a.p232c.p241f.p247f;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: g.d.a.c.f.f.f9 */
class C4545f9<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f14097f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C4638k9> f14098g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<K, V> f14099h;

    /* renamed from: i */
    private boolean f14100i;

    /* renamed from: j */
    private volatile C4677m9 f14101j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Map<K, V> f14102k;

    /* renamed from: l */
    private volatile C4565g9 f14103l;

    private C4545f9(int i) {
        this.f14097f = i;
        this.f14098g = Collections.emptyList();
        this.f14099h = Collections.emptyMap();
        this.f14102k = Collections.emptyMap();
    }

    /* synthetic */ C4545f9(int i, C4508d9 d9Var) {
        this(i);
    }

    /* renamed from: a */
    private final int m19413a(K k) {
        int size = this.f14098g.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f14098g.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f14098g.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    static <FieldDescriptorType extends C4808u6<FieldDescriptorType>> C4545f9<FieldDescriptorType, Object> m19414b(int i) {
        return new C4508d9(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final V m19418k(int i) {
        m19421p();
        V value = this.f14098g.remove(i).getValue();
        if (!this.f14099h.isEmpty()) {
            Iterator it = m19422q().entrySet().iterator();
            this.f14098g.add(new C4638k9(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m19421p() {
        if (this.f14100i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q */
    private final SortedMap<K, V> m19422q() {
        m19421p();
        if (this.f14099h.isEmpty() && !(this.f14099h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14099h = treeMap;
            this.f14102k = treeMap.descendingMap();
        }
        return (SortedMap) this.f14099h;
    }

    public void clear() {
        m19421p();
        if (!this.f14098g.isEmpty()) {
            this.f14098g.clear();
        }
        if (!this.f14099h.isEmpty()) {
            this.f14099h.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m19413a(comparable) >= 0 || this.f14099h.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        m19421p();
        int a = m19413a(k);
        if (a >= 0) {
            return this.f14098g.get(a).setValue(v);
        }
        m19421p();
        if (this.f14098g.isEmpty() && !(this.f14098g instanceof ArrayList)) {
            this.f14098g = new ArrayList(this.f14097f);
        }
        int i = -(a + 1);
        if (i >= this.f14097f) {
            return m19422q().put(k, v);
        }
        int size = this.f14098g.size();
        int i2 = this.f14097f;
        if (size == i2) {
            C4638k9 remove = this.f14098g.remove(i2 - 1);
            m19422q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f14098g.add(i, new C4638k9(this, k, v));
        return null;
    }

    /* renamed from: e */
    public void mo14046e() {
        if (!this.f14100i) {
            this.f14099h = this.f14099h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14099h);
            this.f14102k = this.f14102k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14102k);
            this.f14100i = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f14101j == null) {
            this.f14101j = new C4677m9(this, (C4508d9) null);
        }
        return this.f14101j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4545f9)) {
            return super.equals(obj);
        }
        C4545f9 f9Var = (C4545f9) obj;
        int size = size();
        if (size != f9Var.size()) {
            return false;
        }
        int j = mo14129j();
        if (j != f9Var.mo14129j()) {
            return entrySet().equals(f9Var.entrySet());
        }
        for (int i = 0; i < j; i++) {
            if (!mo14126h(i).equals(f9Var.mo14126h(i))) {
                return false;
            }
        }
        if (j != size) {
            return this.f14099h.equals(f9Var.f14099h);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m19413a(comparable);
        return a >= 0 ? this.f14098g.get(a).getValue() : this.f14099h.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo14126h(int i) {
        return this.f14098g.get(i);
    }

    public int hashCode() {
        int j = mo14129j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += this.f14098g.get(i2).hashCode();
        }
        return this.f14099h.size() > 0 ? i + this.f14099h.hashCode() : i;
    }

    /* renamed from: i */
    public final boolean mo14128i() {
        return this.f14100i;
    }

    /* renamed from: j */
    public final int mo14129j() {
        return this.f14098g.size();
    }

    /* renamed from: m */
    public final Iterable<Map.Entry<K, V>> mo14130m() {
        return this.f14099h.isEmpty() ? C4620j9.m19772a() : this.f14099h.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Set<Map.Entry<K, V>> mo14131o() {
        if (this.f14103l == null) {
            this.f14103l = new C4565g9(this, (C4508d9) null);
        }
        return this.f14103l;
    }

    public V remove(Object obj) {
        m19421p();
        Comparable comparable = (Comparable) obj;
        int a = m19413a(comparable);
        if (a >= 0) {
            return m19418k(a);
        }
        if (this.f14099h.isEmpty()) {
            return null;
        }
        return this.f14099h.remove(comparable);
    }

    public int size() {
        return this.f14098g.size() + this.f14099h.size();
    }
}
