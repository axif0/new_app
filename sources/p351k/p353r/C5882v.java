package p351k.p353r;

import java.util.Iterator;

/* renamed from: k.r.v */
public abstract class C5882v implements Iterator<Integer> {
    /* renamed from: b */
    public final Integer next() {
        return Integer.valueOf(mo16953c());
    }

    /* renamed from: c */
    public abstract int mo16953c();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
