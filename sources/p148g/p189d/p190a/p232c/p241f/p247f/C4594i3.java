package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.NoSuchElementException;

/* renamed from: g.d.a.c.f.f.i3 */
abstract class C4594i3<E> extends C4449a5<E> {

    /* renamed from: f */
    private final int f14180f;

    /* renamed from: g */
    private int f14181g;

    protected C4594i3(int i, int i2) {
        C4447a3.m18706g(i2, i);
        this.f14180f = i;
        this.f14181g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo14036b(int i);

    public final boolean hasNext() {
        return this.f14181g < this.f14180f;
    }

    public final boolean hasPrevious() {
        return this.f14181g > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f14181g;
            this.f14181g = i + 1;
            return mo14036b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f14181g;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f14181g - 1;
            this.f14181g = i;
            return mo14036b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f14181g - 1;
    }
}
