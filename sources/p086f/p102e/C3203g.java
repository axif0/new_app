package p086f.p102e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: f.e.g */
public class C3203g<K, V> {

    /* renamed from: i */
    static Object[] f10168i;

    /* renamed from: j */
    static int f10169j;

    /* renamed from: k */
    static Object[] f10170k;

    /* renamed from: l */
    static int f10171l;

    /* renamed from: f */
    int[] f10172f;

    /* renamed from: g */
    Object[] f10173g;

    /* renamed from: h */
    int f10174h;

    public C3203g() {
        this.f10172f = C3194c.f10137a;
        this.f10173g = C3194c.f10139c;
        this.f10174h = 0;
    }

    public C3203g(int i) {
        if (i == 0) {
            this.f10172f = C3194c.f10137a;
            this.f10173g = C3194c.f10139c;
        } else {
            m13673a(i);
        }
        this.f10174h = 0;
    }

    public C3203g(C3203g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo5867j(gVar);
        }
    }

    /* renamed from: a */
    private void m13673a(int i) {
        Class<C3203g> cls = C3203g.class;
        if (i == 8) {
            synchronized (cls) {
                if (f10170k != null) {
                    Object[] objArr = f10170k;
                    this.f10173g = objArr;
                    f10170k = (Object[]) objArr[0];
                    this.f10172f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10171l--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f10168i != null) {
                    Object[] objArr2 = f10168i;
                    this.f10173g = objArr2;
                    f10168i = (Object[]) objArr2[0];
                    this.f10172f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10169j--;
                    return;
                }
            }
        }
        this.f10172f = new int[i];
        this.f10173g = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m13674b(int[] iArr, int i, int i2) {
        try {
            return C3194c.m13627a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m13675d(int[] iArr, Object[] objArr, int i) {
        Class<C3203g> cls = C3203g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f10171l < 10) {
                    objArr[0] = f10170k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f10170k = objArr;
                    f10171l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f10169j < 10) {
                    objArr[0] = f10168i;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f10168i = objArr;
                    f10169j++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo11129c(int i) {
        int i2 = this.f10174h;
        int[] iArr = this.f10172f;
        if (iArr.length < i) {
            Object[] objArr = this.f10173g;
            m13673a(i);
            if (this.f10174h > 0) {
                System.arraycopy(iArr, 0, this.f10172f, 0, i2);
                System.arraycopy(objArr, 0, this.f10173g, 0, i2 << 1);
            }
            m13675d(iArr, objArr, i2);
        }
        if (this.f10174h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f10174h;
        if (i > 0) {
            int[] iArr = this.f10172f;
            Object[] objArr = this.f10173g;
            this.f10172f = C3194c.f10137a;
            this.f10173g = C3194c.f10139c;
            this.f10174h = 0;
            m13675d(iArr, objArr, i);
        }
        if (this.f10174h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo11134f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo11138h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo11132e(Object obj, int i) {
        int i2 = this.f10174h;
        if (i2 == 0) {
            return -1;
        }
        int b = m13674b(this.f10172f, i2, i);
        if (b < 0 || obj.equals(this.f10173g[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f10172f[i3] == i) {
            if (obj.equals(this.f10173g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f10172f[i4] == i) {
            if (obj.equals(this.f10173g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3203g) {
            C3203g gVar = (C3203g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f10174h) {
                try {
                    Object i2 = mo11139i(i);
                    Object m = mo11141m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f10174h) {
                try {
                    Object i4 = mo11139i(i3);
                    Object m2 = mo11141m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo11134f(Object obj) {
        return obj == null ? mo11135g() : mo11132e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo11135g() {
        int i = this.f10174h;
        if (i == 0) {
            return -1;
        }
        int b = m13674b(this.f10172f, i, 0);
        if (b < 0 || this.f10173g[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f10172f[i2] == 0) {
            if (this.f10173g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f10172f[i3] == 0) {
            if (this.f10173g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo11134f(obj);
        return f >= 0 ? this.f10173g[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo11138h(Object obj) {
        int i = this.f10174h * 2;
        Object[] objArr = this.f10173g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f10172f;
        Object[] objArr = this.f10173g;
        int i = this.f10174h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo11139i(int i) {
        return this.f10173g[i << 1];
    }

    public boolean isEmpty() {
        return this.f10174h <= 0;
    }

    /* renamed from: j */
    public void mo5867j(C3203g<? extends K, ? extends V> gVar) {
        int i = gVar.f10174h;
        mo11129c(this.f10174h + i);
        if (this.f10174h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo11139i(i2), gVar.mo11141m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f10172f, 0, this.f10172f, 0, i);
            System.arraycopy(gVar.f10173g, 0, this.f10173g, 0, i << 1);
            this.f10174h = i;
        }
    }

    /* renamed from: k */
    public V mo5868k(int i) {
        V[] vArr = this.f10173g;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f10174h;
        int i4 = 0;
        if (i3 <= 1) {
            m13675d(this.f10172f, vArr, i3);
            this.f10172f = C3194c.f10137a;
            this.f10173g = C3194c.f10139c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f10172f;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f10172f;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.f10173g;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f10173g;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f10172f;
                Object[] objArr3 = this.f10173g;
                m13673a(i6);
                if (i3 == this.f10174h) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f10172f, 0, i);
                        System.arraycopy(objArr3, 0, this.f10173g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.f10172f, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.f10173g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f10174h) {
            this.f10174h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo5869l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f10173g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo11141m(int i) {
        return this.f10173g[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f10174h;
        if (k == null) {
            i2 = mo11135g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo11132e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f10173g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f10172f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f10172f;
            Object[] objArr = this.f10173g;
            m13673a(i6);
            if (i3 == this.f10174h) {
                int[] iArr2 = this.f10172f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f10173g, 0, objArr.length);
                }
                m13675d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f10172f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f10173g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f10174h - i5) << 1);
        }
        int i8 = this.f10174h;
        if (i3 == i8) {
            int[] iArr4 = this.f10172f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f10173g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f10174h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo11134f(obj);
        if (f >= 0) {
            return mo5868k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo11134f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo11141m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo5868k(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo11134f(k);
        if (f >= 0) {
            return mo5869l(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo11134f(k);
        if (f < 0) {
            return false;
        }
        V m = mo11141m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo5869l(f, v2);
        return true;
    }

    public int size() {
        return this.f10174h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10174h * 28);
        sb.append('{');
        for (int i = 0; i < this.f10174h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo11139i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo11141m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
