package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.g4 */
public abstract class C4560g4<K, V> implements Serializable, Map<K, V> {

    /* renamed from: f */
    private transient C4633k4<Map.Entry<K, V>> f14141f;

    /* renamed from: g */
    private transient C4633k4<K> f14142g;

    /* renamed from: h */
    private transient C4466b4<V> f14143h;

    C4560g4() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C4633k4<Map.Entry<K, V>> mo14177a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C4633k4<K> mo14178b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C4466b4<V> mo14179c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((C4466b4) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        C4633k4<Map.Entry<K, V>> k4Var = this.f14141f;
        if (k4Var != null) {
            return k4Var;
        }
        C4633k4<Map.Entry<K, V>> a = mo14177a();
        this.f14141f = a;
        return a;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C4822v4.m20493a((C4633k4) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        C4633k4<K> k4Var = this.f14142g;
        if (k4Var != null) {
            return k4Var;
        }
        C4633k4<K> b = mo14178b();
        this.f14142g = b;
        return b;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Collection values() {
        C4466b4<V> b4Var = this.f14143h;
        if (b4Var != null) {
            return b4Var;
        }
        C4466b4<V> c = mo14179c();
        this.f14143h = c;
        return c;
    }
}
