package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Map;

/* renamed from: g.d.a.c.f.f.n7 */
final class C4692n7<K> implements Map.Entry<K, Object> {

    /* renamed from: f */
    private Map.Entry<K, C4654l7> f14315f;

    private C4692n7(Map.Entry<K, C4654l7> entry) {
        this.f14315f = entry;
    }

    /* renamed from: a */
    public final C4654l7 mo14476a() {
        return this.f14315f.getValue();
    }

    public final K getKey() {
        return this.f14315f.getKey();
    }

    public final Object getValue() {
        if (this.f14315f.getValue() == null) {
            return null;
        }
        C4654l7.m19916e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C4655l8) {
            return this.f14315f.getValue().mo14533a((C4655l8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
