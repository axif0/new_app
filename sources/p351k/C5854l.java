package p351k;

import java.io.Serializable;
import p351k.p361v.p362c.C5926a;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.l */
final class C5854l<T> implements C5845e<T>, Serializable {

    /* renamed from: f */
    private C5926a<? extends T> f16882f;

    /* renamed from: g */
    private volatile Object f16883g;

    /* renamed from: h */
    private final Object f16884h;

    public C5854l(C5926a<? extends T> aVar, Object obj) {
        C5956g.m24500e(aVar, "initializer");
        this.f16882f = aVar;
        this.f16883g = C5857o.f16885a;
        this.f16884h = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5854l(C5926a aVar, Object obj, int i, C5954e eVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean mo16868a() {
        return this.f16883g != C5857o.f16885a;
    }

    public T getValue() {
        T t;
        T t2 = this.f16883g;
        if (t2 != C5857o.f16885a) {
            return t2;
        }
        synchronized (this.f16884h) {
            t = this.f16883g;
            if (t == C5857o.f16885a) {
                C5926a aVar = this.f16882f;
                C5956g.m24498c(aVar);
                t = aVar.invoke();
                this.f16883g = t;
                this.f16882f = null;
            }
        }
        return t;
    }

    public String toString() {
        return mo16868a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
