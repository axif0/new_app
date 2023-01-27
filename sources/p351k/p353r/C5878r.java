package p351k.p353r;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: k.r.r */
public final class C5878r implements ListIterator {

    /* renamed from: f */
    public static final C5878r f16887f = new C5878r();

    private C5878r() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void mo16872b() {
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public Void mo16873c() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        mo16872b();
        throw null;
    }

    public int nextIndex() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object previous() {
        mo16873c();
        throw null;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
