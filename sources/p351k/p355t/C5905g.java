package p351k.p355t;

import java.io.Serializable;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.g */
public final class C5905g implements C5899f, Serializable {

    /* renamed from: f */
    public static final C5905g f16899f = new C5905g();

    private C5905g() {
    }

    public <R> R fold(R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
        C5956g.m24500e(pVar, "operation");
        return r;
    }

    public <E extends C5899f.C5902b> E get(C5899f.C5904c<E> cVar) {
        C5956g.m24500e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C5899f minusKey(C5899f.C5904c<?> cVar) {
        C5956g.m24500e(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
