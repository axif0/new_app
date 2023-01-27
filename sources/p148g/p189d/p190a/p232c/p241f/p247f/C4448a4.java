package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.a4 */
public abstract class C4448a4<E> extends C4466b4<E> implements List<E>, RandomAccess {

    /* renamed from: g */
    private static final C4449a5<Object> f13974g = new C4503d4(C4739q4.f14412j, 0);

    C4448a4() {
    }

    /* renamed from: p */
    public static <E> C4448a4<E> m18708p(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            C4689n4.m20000a(objArr[0], 0);
        }
        return m18710r(objArr, 1);
    }

    /* renamed from: q */
    static <E> C4448a4<E> m18709q(Object[] objArr) {
        return m18710r(objArr, objArr.length);
    }

    /* renamed from: r */
    static <E> C4448a4<E> m18710r(Object[] objArr, int i) {
        return i == 0 ? C4739q4.f14412j : new C4739q4(objArr, i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo13776c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: d */
    public final C4855x4<E> iterator() {
        return (C4449a5) listIterator();
    }

    public boolean equals(@NullableDecl Object obj) {
        C4447a3.m18701b(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C4870y2.m20620a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i2);
                        i2++;
                        if (!C4870y2.m20620a(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (C4449a5) listIterator(0);
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        C4447a3.m18706g(i, size());
        return isEmpty() ? f13974g : new C4503d4(this, i);
    }

    /* renamed from: o */
    public C4448a4<E> subList(int i, int i2) {
        C4447a3.m18704e(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C4739q4.f14412j : new C4485c4(this, i, i3);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
