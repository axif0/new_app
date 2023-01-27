package p086f.p102e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f.e.b */
public final class C3192b<E> implements Collection<E>, Set<E> {

    /* renamed from: j */
    private static final int[] f10126j = new int[0];

    /* renamed from: k */
    private static final Object[] f10127k = new Object[0];

    /* renamed from: l */
    private static Object[] f10128l;

    /* renamed from: m */
    private static int f10129m;

    /* renamed from: n */
    private static Object[] f10130n;

    /* renamed from: o */
    private static int f10131o;

    /* renamed from: f */
    private int[] f10132f;

    /* renamed from: g */
    Object[] f10133g;

    /* renamed from: h */
    int f10134h;

    /* renamed from: i */
    private C3197f<E, E> f10135i;

    /* renamed from: f.e.b$a */
    class C3193a extends C3197f<E, E> {
        C3193a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11017a() {
            C3192b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11018b(int i, int i2) {
            return C3192b.this.f10133g[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo11019c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo11020d() {
            return C3192b.this.f10134h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo11021e(Object obj) {
            return C3192b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo11022f(Object obj) {
            return C3192b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo11023g(E e, E e2) {
            C3192b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo11024h(int i) {
            C3192b.this.mo11037m(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo11025i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C3192b() {
        this(0);
    }

    public C3192b(int i) {
        if (i == 0) {
            this.f10132f = f10126j;
            this.f10133g = f10127k;
        } else {
            m13610c(i);
        }
        this.f10134h = 0;
    }

    /* renamed from: c */
    private void m13610c(int i) {
        if (i == 8) {
            synchronized (C3192b.class) {
                if (f10130n != null) {
                    Object[] objArr = f10130n;
                    this.f10133g = objArr;
                    f10130n = (Object[]) objArr[0];
                    this.f10132f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10131o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3192b.class) {
                if (f10128l != null) {
                    Object[] objArr2 = f10128l;
                    this.f10133g = objArr2;
                    f10128l = (Object[]) objArr2[0];
                    this.f10132f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10129m--;
                    return;
                }
            }
        }
        this.f10132f = new int[i];
        this.f10133g = new Object[i];
    }

    /* renamed from: f */
    private static void m13611f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3192b.class) {
                if (f10131o < 10) {
                    objArr[0] = f10130n;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f10130n = objArr;
                    f10131o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3192b.class) {
                if (f10129m < 10) {
                    objArr[0] = f10128l;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f10128l = objArr;
                    f10129m++;
                }
            }
        }
    }

    /* renamed from: h */
    private C3197f<E, E> m13612h() {
        if (this.f10135i == null) {
            this.f10135i = new C3193a();
        }
        return this.f10135i;
    }

    /* renamed from: i */
    private int m13613i(Object obj, int i) {
        int i2 = this.f10134h;
        if (i2 == 0) {
            return -1;
        }
        int a = C3194c.m13627a(this.f10132f, i2, i);
        if (a < 0 || obj.equals(this.f10133g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f10132f[i3] == i) {
            if (obj.equals(this.f10133g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f10132f[i4] == i) {
            if (obj.equals(this.f10133g[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: j */
    private int m13614j() {
        int i = this.f10134h;
        if (i == 0) {
            return -1;
        }
        int a = C3194c.m13627a(this.f10132f, i, 0);
        if (a < 0 || this.f10133g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f10132f[i2] == 0) {
            if (this.f10133g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f10132f[i3] == 0) {
            if (this.f10133g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m13614j();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m13613i(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f10134h;
        if (i4 >= this.f10132f.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f10132f;
            Object[] objArr = this.f10133g;
            m13610c(i5);
            int[] iArr2 = this.f10132f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f10133g, 0, objArr.length);
            }
            m13611f(iArr, objArr, this.f10134h);
        }
        int i6 = this.f10134h;
        if (i3 < i6) {
            int[] iArr3 = this.f10132f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f10133g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f10134h - i3);
        }
        this.f10132f[i3] = i;
        this.f10133g[i3] = e;
        this.f10134h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo11031d(this.f10134h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f10134h;
        if (i != 0) {
            m13611f(this.f10132f, this.f10133g, i);
            this.f10132f = f10126j;
            this.f10133g = f10127k;
            this.f10134h = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo11031d(int i) {
        int[] iArr = this.f10132f;
        if (iArr.length < i) {
            Object[] objArr = this.f10133g;
            m13610c(i);
            int i2 = this.f10134h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f10132f, 0, i2);
                System.arraycopy(objArr, 0, this.f10133g, 0, this.f10134h);
            }
            m13611f(iArr, objArr, this.f10134h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f10134h) {
                try {
                    if (!set.contains(mo11038o(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f10132f;
        int i = this.f10134h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m13614j() : m13613i(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f10134h <= 0;
    }

    public Iterator<E> iterator() {
        return m13612h().mo11068m().iterator();
    }

    /* renamed from: m */
    public E mo11037m(int i) {
        E[] eArr = this.f10133g;
        E e = eArr[i];
        int i2 = this.f10134h;
        if (i2 <= 1) {
            m13611f(this.f10132f, eArr, i2);
            this.f10132f = f10126j;
            this.f10133g = f10127k;
            this.f10134h = 0;
        } else {
            int[] iArr = this.f10132f;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.f10134h - 1;
                this.f10134h = i4;
                if (i < i4) {
                    int[] iArr2 = this.f10132f;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f10133g;
                    System.arraycopy(objArr, i5, objArr, i, this.f10134h - i);
                }
                this.f10133g[this.f10134h] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f10132f;
                Object[] objArr2 = this.f10133g;
                m13610c(i3);
                this.f10134h--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f10132f, 0, i);
                    System.arraycopy(objArr2, 0, this.f10133g, 0, i);
                }
                int i6 = this.f10134h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f10132f, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f10133g, i, this.f10134h - i);
                }
            }
        }
        return e;
    }

    /* renamed from: o */
    public E mo11038o(int i) {
        return this.f10133g[i];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo11037m(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f10134h - 1; i >= 0; i--) {
            if (!collection.contains(this.f10133g[i])) {
                mo11037m(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f10134h;
    }

    public Object[] toArray() {
        int i = this.f10134h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f10133g, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f10134h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f10134h);
        }
        System.arraycopy(this.f10133g, 0, tArr, 0, this.f10134h);
        int length = tArr.length;
        int i = this.f10134h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10134h * 14);
        sb.append('{');
        for (int i = 0; i < this.f10134h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object o = mo11038o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
