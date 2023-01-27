package p351k.p367z;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.z.a */
public final class C5982a<T> implements C5983b<T> {

    /* renamed from: a */
    private final AtomicReference<C5983b<T>> f16939a;

    public C5982a(C5983b<? extends T> bVar) {
        C5956g.m24500e(bVar, "sequence");
        this.f16939a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        C5983b andSet = this.f16939a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
