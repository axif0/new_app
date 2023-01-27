package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.l3 */
abstract class C4650l3<K, V> implements Map.Entry<K, V> {
    C4650l3() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return C4870y2.m20620a(getKey(), entry.getKey()) && C4870y2.m20620a(getValue(), entry.getValue());
        }
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
