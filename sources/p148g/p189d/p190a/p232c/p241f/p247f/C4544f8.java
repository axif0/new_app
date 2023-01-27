package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: g.d.a.c.f.f.f8 */
public final class C4544f8<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g */
    private static final C4544f8 f14095g;

    /* renamed from: f */
    private boolean f14096f = true;

    static {
        C4544f8 f8Var = new C4544f8();
        f14095g = f8Var;
        f8Var.f14096f = false;
    }

    private C4544f8() {
    }

    private C4544f8(Map<K, V> map) {
        super(map);
    }

    /* renamed from: b */
    private static int m19406b(Object obj) {
        if (obj instanceof byte[]) {
            return C4470b7.m18822j((byte[]) obj);
        }
        if (!(obj instanceof C4525e7)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public static <K, V> C4544f8<K, V> m19407c() {
        return f14095g;
    }

    /* renamed from: k */
    private final void m19408k() {
        if (!this.f14096f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        m19408k();
        super.clear();
    }

    /* renamed from: d */
    public final void mo14110d(C4544f8<K, V> f8Var) {
        m19408k();
        if (!f8Var.isEmpty()) {
            putAll(f8Var);
        }
    }

    /* renamed from: e */
    public final C4544f8<K, V> mo14111e() {
        return isEmpty() ? new C4544f8<>() : new C4544f8<>(this);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4544f8.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void mo14114f() {
        this.f14096f = false;
    }

    /* renamed from: g */
    public final boolean mo14115g() {
        return this.f14096f;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m19406b(entry.getValue()) ^ m19406b(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m19408k();
        C4470b7.m18816d(k);
        C4470b7.m18816d(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m19408k();
        for (Object next : map.keySet()) {
            C4470b7.m18816d(next);
            C4470b7.m18816d(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m19408k();
        return super.remove(obj);
    }
}
