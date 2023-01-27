package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.s7 */
public final class C4775s7 extends C4672m5<String> implements C4758r7, RandomAccess {

    /* renamed from: h */
    private static final C4775s7 f14480h;

    /* renamed from: g */
    private final List<Object> f14481g;

    static {
        C4775s7 s7Var = new C4775s7();
        f14480h = s7Var;
        s7Var.mo14224y();
    }

    public C4775s7() {
        this(10);
    }

    public C4775s7(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C4775s7(ArrayList<Object> arrayList) {
        this.f14481g = arrayList;
    }

    /* renamed from: d */
    private static String m20370d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C4773s5 ? ((C4773s5) obj).mo14605t() : C4470b7.m18821i((byte[]) obj);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo14452c();
        this.f14481g.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo14452c();
        if (collection instanceof C4758r7) {
            collection = ((C4758r7) collection).mo14575b();
        }
        boolean addAll = this.f14481g.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final List<?> mo14575b() {
        return Collections.unmodifiableList(this.f14481g);
    }

    public final void clear() {
        mo14452c();
        this.f14481g.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final /* synthetic */ C4581h7 mo13882e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f14481g);
            return new C4775s7((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final Object mo14576g(int i) {
        return this.f14481g.get(i);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f14481g.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4773s5) {
            C4773s5 s5Var = (C4773s5) obj;
            String t = s5Var.mo14605t();
            if (s5Var.mo13861w()) {
                this.f14481g.set(i, t);
            }
            return t;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = C4470b7.m18821i(bArr);
        if (C4470b7.m18820h(bArr)) {
            this.f14481g.set(i, i2);
        }
        return i2;
    }

    /* renamed from: n */
    public final void mo14577n(C4773s5 s5Var) {
        mo14452c();
        this.f14481g.add(s5Var);
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14452c();
        Object remove = this.f14481g.remove(i);
        this.modCount++;
        return m20370d(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo14452c();
        return m20370d(this.f14481g.set(i, (String) obj));
    }

    public final int size() {
        return this.f14481g.size();
    }

    /* renamed from: v */
    public final C4758r7 mo14578v() {
        return mo14223a() ? new C4860x9(this) : this;
    }
}
