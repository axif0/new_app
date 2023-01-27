package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.OsList;
import p340io.realm.internal.OsObjectStore;

/* renamed from: io.realm.m0 */
final class C5767m0<T> extends C5788s<T> {

    /* renamed from: d */
    private final String f16746d;

    C5767m0(C5632b bVar, OsList osList, Class<T> cls, String str) {
        super(bVar, osList, cls);
        this.f16746d = str;
    }

    /* renamed from: q */
    private void m24094q(int i) {
        int p = mo16787p();
        if (i < 0 || p < i) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f16785b.mo16396I());
        }
    }

    /* renamed from: r */
    private <E extends C5763l0> E m24095r(E e) {
        if (e instanceof C5720n) {
            C5720n nVar = (C5720n) e;
            if (nVar instanceof C5761l) {
                String str = this.f16746d;
                C5632b e2 = nVar.mo16212L().mo16258e();
                C5632b bVar = this.f16784a;
                if (e2 == bVar) {
                    String V = ((C5761l) e).mo16728V();
                    if (str.equals(V)) {
                        return e;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from list's. Type of the list is '%s', type of object is '%s'.", new Object[]{str, V}));
                } else if (bVar.f16246f == nVar.mo16212L().mo16258e().f16246f) {
                    throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                } else {
                    throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
                }
            } else if (nVar.mo16212L().mo16259f() != null && nVar.mo16212L().mo16258e().mo16218D().equals(this.f16784a.mo16218D())) {
                if (this.f16784a == nVar.mo16212L().mo16258e()) {
                    return e;
                }
                throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
            }
        }
        C5648d0 d0Var = (C5648d0) this.f16784a;
        C5781q[] qVarArr = new C5781q[0];
        return OsObjectStore.m23670b(d0Var.mo16220J(), d0Var.mo16234x().mo16318n().mo16640g(e.getClass())) != null ? d0Var.mo16273h0(e, qVarArr) : d0Var.mo16272g0(e, qVarArr);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16406j(((C5720n) m24095r((C5763l0) obj)).mo16212L().mo16259f().mo16589g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("RealmList does not accept null values.");
        } else if (!(obj instanceof C5763l0)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.String", obj.getClass().getName()}));
        }
    }

    /* renamed from: e */
    public T mo16250e(int i) {
        return this.f16784a.mo16233w(this.f16786c, this.f16746d, this.f16785b.mo16408l((long) i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16737h(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        m24094q(i);
        this.f16785b.mo16417u((long) i, ((C5720n) m24095r((C5763l0) obj)).mo16212L().mo16259f().mo16589g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo16738n(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16394G((long) i, ((C5720n) m24095r((C5763l0) obj)).mo16212L().mo16259f().mo16589g());
    }
}
