package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.b4 */
public abstract class C4466b4<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f13990f = new Object[0];

    C4466b4() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo13776c(Object[] objArr, int i) {
        C4855x4 x4Var = (C4855x4) iterator();
        while (x4Var.hasNext()) {
            objArr[i] = x4Var.next();
            i++;
        }
        return i;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: d */
    public abstract C4855x4<E> iterator();

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: f */
    public Object[] mo13841f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo13842h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo13843j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo13844m();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f13990f);
    }

    public final <T> T[] toArray(T[] tArr) {
        C4447a3.m18701b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f = mo13841f();
            if (f != null) {
                return Arrays.copyOfRange(f, mo13842h(), mo13843j(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo13776c(tArr, 0);
        return tArr;
    }
}
