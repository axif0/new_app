package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Map;

/* renamed from: g.d.a.c.f.f.k9 */
final class C4638k9 implements Comparable<C4638k9>, Map.Entry<K, V> {

    /* renamed from: f */
    private final K f14214f;

    /* renamed from: g */
    private V f14215g;

    /* renamed from: h */
    private final /* synthetic */ C4545f9 f14216h;

    C4638k9(C4545f9 f9Var, K k, V v) {
        this.f14216h = f9Var;
        this.f14214f = k;
        this.f14215g = v;
    }

    C4638k9(C4545f9 f9Var, Map.Entry<K, V> entry) {
        this(f9Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: e */
    private static boolean m19834e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C4638k9) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m19834e(this.f14214f, entry.getKey()) && m19834e(this.f14215g, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f14214f;
    }

    public final V getValue() {
        return this.f14215g;
    }

    public final int hashCode() {
        K k = this.f14214f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f14215g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f14216h.m19421p();
        V v2 = this.f14215g;
        this.f14215g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14214f);
        String valueOf2 = String.valueOf(this.f14215g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
