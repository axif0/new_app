package p351k.p355t;

import com.karumi.dexter.BuildConfig;
import java.io.Serializable;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5957h;

/* renamed from: k.t.c */
public final class C5893c implements C5899f, Serializable {

    /* renamed from: f */
    private final C5899f f16893f;

    /* renamed from: g */
    private final C5899f.C5902b f16894g;

    /* renamed from: k.t.c$a */
    static final class C5894a extends C5957h implements C5941p<String, C5899f.C5902b, String> {

        /* renamed from: f */
        public static final C5894a f16895f = new C5894a();

        C5894a() {
            super(2);
        }

        /* renamed from: d */
        public final String mo16966a(String str, C5899f.C5902b bVar) {
            C5956g.m24500e(str, "acc");
            C5956g.m24500e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C5893c(C5899f fVar, C5899f.C5902b bVar) {
        C5956g.m24500e(fVar, "left");
        C5956g.m24500e(bVar, "element");
        this.f16893f = fVar;
        this.f16894g = bVar;
    }

    /* renamed from: h */
    private final boolean m24425h(C5899f.C5902b bVar) {
        return C5956g.m24496a(get(bVar.getKey()), bVar);
    }

    /* renamed from: j */
    private final boolean m24426j(C5893c cVar) {
        while (m24425h(cVar.f16894g)) {
            C5899f fVar = cVar.f16893f;
            if (fVar instanceof C5893c) {
                cVar = (C5893c) fVar;
            } else if (fVar != null) {
                return m24425h((C5899f.C5902b) fVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    /* renamed from: k */
    private final int m24427k() {
        int i = 2;
        C5893c cVar = this;
        while (true) {
            C5899f fVar = cVar.f16893f;
            if (!(fVar instanceof C5893c)) {
                fVar = null;
            }
            cVar = (C5893c) fVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5893c) {
                C5893c cVar = (C5893c) obj;
                if (cVar.m24427k() != m24427k() || !cVar.m24426j(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
        C5956g.m24500e(pVar, "operation");
        return pVar.mo16966a(this.f16893f.fold(r, pVar), this.f16894g);
    }

    public <E extends C5899f.C5902b> E get(C5899f.C5904c<E> cVar) {
        C5956g.m24500e(cVar, "key");
        C5893c cVar2 = this;
        while (true) {
            E e = cVar2.f16894g.get(cVar);
            if (e != null) {
                return e;
            }
            C5899f fVar = cVar2.f16893f;
            if (!(fVar instanceof C5893c)) {
                return fVar.get(cVar);
            }
            cVar2 = (C5893c) fVar;
        }
    }

    public int hashCode() {
        return this.f16893f.hashCode() + this.f16894g.hashCode();
    }

    public C5899f minusKey(C5899f.C5904c<?> cVar) {
        C5956g.m24500e(cVar, "key");
        if (this.f16894g.get(cVar) != null) {
            return this.f16893f;
        }
        C5899f minusKey = this.f16893f.minusKey(cVar);
        return minusKey == this.f16893f ? this : minusKey == C5905g.f16899f ? this.f16894g : new C5893c(minusKey, this.f16894g);
    }

    public String toString() {
        return "[" + ((String) fold(BuildConfig.FLAVOR, C5894a.f16895f)) + "]";
    }
}
