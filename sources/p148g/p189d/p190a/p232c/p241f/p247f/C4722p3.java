package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.p3 */
final class C4722p3<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Object f14366o = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: f */
    public transient Object f14367f;
    @NullableDecl

    /* renamed from: g */
    transient int[] f14368g;
    @NullableDecl

    /* renamed from: h */
    transient Object[] f14369h;
    @NullableDecl

    /* renamed from: i */
    transient Object[] f14370i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public transient int f14371j = C4893z4.m20784a(3, 1, 1073741823);

    /* renamed from: k */
    private transient int f14372k;
    @NullableDecl

    /* renamed from: l */
    private transient Set<K> f14373l;
    @NullableDecl

    /* renamed from: m */
    private transient Set<Map.Entry<K, V>> f14374m;
    @NullableDecl

    /* renamed from: n */
    private transient Collection<V> f14375n;

    C4722p3() {
        C4447a3.m18705f(true, "Expected size must be >= 0");
    }

    /* renamed from: b */
    private final int m20082b(int i, int i2, int i3, int i4) {
        Object d = C4837w3.m20525d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C4837w3.m20526e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f14367f;
        int[] iArr = this.f14368g;
        for (int i6 = 0; i6 <= i; i6++) {
            int b = C4837w3.m20523b(obj, i6);
            while (b != 0) {
                int i7 = b - 1;
                int i8 = iArr[i7];
                int i9 = ((i ^ -1) & i8) | i6;
                int i10 = i9 & i5;
                int b2 = C4837w3.m20523b(d, i10);
                C4837w3.m20526e(d, i10, b);
                iArr[i7] = C4837w3.m20522a(i9, b2, i5);
                b = i8 & i;
            }
        }
        this.f14367f = d;
        m20090n(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m20084d(@NullableDecl Object obj) {
        if (mo14518g()) {
            return -1;
        }
        int b = C4871y3.m20622b(obj);
        int w = m20094w();
        int b2 = C4837w3.m20523b(this.f14367f, b & w);
        if (b2 == 0) {
            return -1;
        }
        int i = w ^ -1;
        int i2 = b & i;
        do {
            int i3 = b2 - 1;
            int i4 = this.f14368g[i3];
            if ((i4 & i) == i2 && C4870y2.m20620a(obj, this.f14369h[i3])) {
                return i3;
            }
            b2 = i4 & w;
        } while (b2 != 0);
        return -1;
    }

    /* renamed from: h */
    static int m20086h(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    /* renamed from: l */
    public final Object m20089l(@NullableDecl Object obj) {
        if (mo14518g()) {
            return f14366o;
        }
        int w = m20094w();
        int c = C4837w3.m20524c(obj, (Object) null, w, this.f14367f, this.f14368g, this.f14369h, (Object[]) null);
        if (c == -1) {
            return f14366o;
        }
        Object obj2 = this.f14370i[c];
        mo14517f(c, w);
        this.f14372k--;
        mo14523p();
        return obj2;
    }

    /* renamed from: n */
    private final void m20090n(int i) {
        this.f14371j = C4837w3.m20522a(this.f14371j, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: r */
    static /* synthetic */ int m20092r(C4722p3 p3Var) {
        int i = p3Var.f14372k;
        p3Var.f14372k = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final int m20094w() {
        return (1 << (this.f14371j & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14512a(int i) {
        int i2 = i + 1;
        if (i2 < this.f14372k) {
            return i2;
        }
        return -1;
    }

    public final void clear() {
        if (!mo14518g()) {
            mo14523p();
            Map m = mo14522m();
            if (m != null) {
                this.f14371j = C4893z4.m20784a(size(), 3, 1073741823);
                m.clear();
                this.f14367f = null;
            } else {
                Arrays.fill(this.f14369h, 0, this.f14372k, (Object) null);
                Arrays.fill(this.f14370i, 0, this.f14372k, (Object) null);
                Object obj = this.f14367f;
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(this.f14368g, 0, this.f14372k, 0);
            }
            this.f14372k = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map m = mo14522m();
        return m != null ? m.containsKey(obj) : m20084d(obj) != -1;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map m = mo14522m();
        if (m != null) {
            return m.containsValue(obj);
        }
        for (int i = 0; i < this.f14372k; i++) {
            if (C4870y2.m20620a(obj, this.f14370i[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f14374m;
        if (set != null) {
            return set;
        }
        C4788t3 t3Var = new C4788t3(this);
        this.f14374m = t3Var;
        return t3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14517f(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f14369h;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f14370i;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f14368g;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int b = C4871y3.m20622b(obj) & i2;
            int b2 = C4837w3.m20523b(this.f14367f, b);
            int i3 = size + 1;
            if (b2 == i3) {
                C4837w3.m20526e(this.f14367f, b, i + 1);
                return;
            }
            while (true) {
                int i4 = b2 - 1;
                int[] iArr2 = this.f14368g;
                int i5 = iArr2[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    iArr2[i4] = C4837w3.m20522a(i5, i + 1, i2);
                    return;
                }
                b2 = i6;
            }
        } else {
            this.f14369h[i] = null;
            this.f14370i[i] = null;
            this.f14368g[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo14518g() {
        return this.f14367f == null;
    }

    public final V get(@NullableDecl Object obj) {
        Map m = mo14522m();
        if (m != null) {
            return m.get(obj);
        }
        int d = m20084d(obj);
        if (d == -1) {
            return null;
        }
        return this.f14370i[d];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f14373l;
        if (set != null) {
            return set;
        }
        C4821v3 v3Var = new C4821v3(this);
        this.f14373l = v3Var;
        return v3Var;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: m */
    public final Map<K, V> mo14522m() {
        Object obj = this.f14367f;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo14523p() {
        this.f14371j += 32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        r7 = r7 << 1;
     */
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r19, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r18.mo14518g()
            r4 = 1
            if (r3 == 0) goto L_0x0051
            boolean r3 = r18.mo14518g()
            java.lang.String r5 = "Arrays already allocated"
            p148g.p189d.p190a.p232c.p241f.p247f.C4447a3.m18707h(r3, r5)
            int r3 = r0.f14371j
            r5 = 4
            int r6 = r3 + 1
            r7 = 2
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = java.lang.Integer.highestOneBit(r6)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = (double) r7
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r8
            int r8 = (int) r10
            if (r6 <= r8) goto L_0x0036
            int r7 = r7 << 1
            if (r7 > 0) goto L_0x0036
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0037
        L_0x0036:
            r6 = r7
        L_0x0037:
            int r5 = java.lang.Math.max(r5, r6)
            java.lang.Object r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4837w3.m20525d(r5)
            r0.f14367f = r6
            int r5 = r5 - r4
            r0.m20090n(r5)
            int[] r5 = new int[r3]
            r0.f14368g = r5
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r0.f14369h = r5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.f14370i = r3
        L_0x0051:
            java.util.Map r3 = r18.mo14522m()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r1 = r3.put(r1, r2)
            return r1
        L_0x005c:
            int[] r3 = r0.f14368g
            java.lang.Object[] r5 = r0.f14369h
            java.lang.Object[] r6 = r0.f14370i
            int r7 = r0.f14372k
            int r8 = r7 + 1
            int r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4871y3.m20622b(r19)
            int r10 = r18.m20094w()
            r11 = r9 & r10
            java.lang.Object r12 = r0.f14367f
            int r12 = p148g.p189d.p190a.p232c.p241f.p247f.C4837w3.m20523b(r12, r11)
            if (r12 != 0) goto L_0x0089
            if (r8 <= r10) goto L_0x0083
        L_0x007a:
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4837w3.m20527f(r10)
            int r10 = r0.m20082b(r10, r3, r9, r7)
            goto L_0x00eb
        L_0x0083:
            java.lang.Object r3 = r0.f14367f
            p148g.p189d.p190a.p232c.p241f.p247f.C4837w3.m20526e(r3, r11, r8)
            goto L_0x00eb
        L_0x0089:
            r11 = r10 ^ -1
            r15 = r9 & r11
            r16 = 0
        L_0x008f:
            int r12 = r12 - r4
            r13 = r3[r12]
            r14 = r13 & r11
            if (r14 != r15) goto L_0x00a3
            r14 = r5[r12]
            boolean r14 = p148g.p189d.p190a.p232c.p241f.p247f.C4870y2.m20620a(r1, r14)
            if (r14 == 0) goto L_0x00a3
            r1 = r6[r12]
            r6[r12] = r2
            return r1
        L_0x00a3:
            r14 = r13 & r10
            r17 = r5
            int r5 = r16 + 1
            if (r14 != 0) goto L_0x0131
            r6 = 9
            if (r5 < r6) goto L_0x00e2
            int r3 = r18.m20094w()
            int r3 = r3 + r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)
            int r3 = r18.mo14525q()
        L_0x00bf:
            if (r3 < 0) goto L_0x00d1
            java.lang.Object[] r5 = r0.f14369h
            r5 = r5[r3]
            java.lang.Object[] r6 = r0.f14370i
            r6 = r6[r3]
            r4.put(r5, r6)
            int r3 = r0.mo14512a(r3)
            goto L_0x00bf
        L_0x00d1:
            r0.f14367f = r4
            r3 = 0
            r0.f14368g = r3
            r0.f14369h = r3
            r0.f14370i = r3
            r18.mo14523p()
            java.lang.Object r1 = r4.put(r1, r2)
            return r1
        L_0x00e2:
            if (r8 <= r10) goto L_0x00e5
            goto L_0x007a
        L_0x00e5:
            int r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4837w3.m20522a(r13, r8, r10)
            r3[r12] = r5
        L_0x00eb:
            int[] r3 = r0.f14368g
            int r3 = r3.length
            if (r8 <= r3) goto L_0x0119
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r6 = r3 >>> 1
            int r6 = java.lang.Math.max(r4, r6)
            int r6 = r6 + r3
            r4 = r4 | r6
            int r4 = java.lang.Math.min(r5, r4)
            if (r4 == r3) goto L_0x0119
            int[] r3 = r0.f14368g
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f14368g = r3
            java.lang.Object[] r3 = r0.f14369h
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f14369h = r3
            java.lang.Object[] r3 = r0.f14370i
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f14370i = r3
        L_0x0119:
            int[] r3 = r0.f14368g
            r12 = 0
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4837w3.m20522a(r9, r12, r10)
            r3[r7] = r4
            java.lang.Object[] r3 = r0.f14369h
            r3[r7] = r1
            java.lang.Object[] r1 = r0.f14370i
            r1[r7] = r2
            r0.f14372k = r8
            r18.mo14523p()
            r13 = 0
            return r13
        L_0x0131:
            r16 = r5
            r12 = r14
            r5 = r17
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4722p3.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo14525q() {
        return isEmpty() ? -1 : 0;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map m = mo14522m();
        if (m != null) {
            return m.remove(obj);
        }
        V l = m20089l(obj);
        if (l == f14366o) {
            return null;
        }
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Iterator<K> mo14527s() {
        Map m = mo14522m();
        return m != null ? m.keySet().iterator() : new C4706o3(this);
    }

    public final int size() {
        Map m = mo14522m();
        return m != null ? m.size() : this.f14372k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Iterator<Map.Entry<K, V>> mo14529t() {
        Map m = mo14522m();
        return m != null ? m.entrySet().iterator() : new C4754r3(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final Iterator<V> mo14530u() {
        Map m = mo14522m();
        return m != null ? m.values().iterator() : new C4738q3(this);
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f14375n;
        if (collection != null) {
            return collection;
        }
        C4854x3 x3Var = new C4854x3(this);
        this.f14375n = x3Var;
        return x3Var;
    }
}
