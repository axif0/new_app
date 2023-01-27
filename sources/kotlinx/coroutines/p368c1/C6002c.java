package kotlinx.coroutines.p368c1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6080v;

/* renamed from: kotlinx.coroutines.c1.c */
public abstract class C6002c<T> extends C6018i {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16952a = AtomicReferenceFieldUpdater.newUpdater(C6002c.class, Object.class, "_consensus");
    private volatile Object _consensus = C6001b.f16951a;

    /* renamed from: c */
    private final Object m24574c(Object obj) {
        return mo17051e(obj) ? obj : this._consensus;
    }

    /* renamed from: a */
    public final Object mo17048a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C6001b.f16951a) {
            obj2 = m24574c(mo17050d(obj));
        }
        mo17049b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo17049b(T t, Object obj);

    /* renamed from: d */
    public abstract Object mo17050d(T t);

    /* renamed from: e */
    public final boolean mo17051e(Object obj) {
        if (C6080v.m24813a()) {
            if (!(obj != C6001b.f16951a)) {
                throw new AssertionError();
            }
        }
        return f16952a.compareAndSet(this, C6001b.f16951a, obj);
    }
}
