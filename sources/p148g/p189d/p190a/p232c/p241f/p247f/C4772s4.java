package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Map;

/* renamed from: g.d.a.c.f.f.s4 */
final class C4772s4<K, V> extends C4633k4<Map.Entry<K, V>> {

    /* renamed from: h */
    private final transient C4560g4<K, V> f14470h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final transient Object[] f14471i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final transient int f14472j;

    C4772s4(C4560g4<K, V> g4Var, Object[] objArr, int i, int i2) {
        this.f14470h = g4Var;
        this.f14471i = objArr;
        this.f14472j = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13776c(Object[] objArr, int i) {
        return mo14334p().mo13776c(objArr, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f14470h.get(key));
        }
    }

    /* renamed from: d */
    public final C4855x4<Map.Entry<K, V>> iterator() {
        return (C4855x4) mo14334p().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13844m() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C4448a4<Map.Entry<K, V>> mo14335q() {
        return new C4755r4(this);
    }

    public final int size() {
        return this.f14472j;
    }
}
