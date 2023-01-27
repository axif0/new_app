package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.x9 */
public final class C4860x9 extends AbstractList<String> implements C4758r7, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4758r7 f14632f;

    public C4860x9(C4758r7 r7Var) {
        this.f14632f = r7Var;
    }

    /* renamed from: b */
    public final List<?> mo14575b() {
        return this.f14632f.mo14575b();
    }

    /* renamed from: g */
    public final Object mo14576g(int i) {
        return this.f14632f.mo14576g(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f14632f.get(i);
    }

    public final Iterator<String> iterator() {
        return new C4904z9(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C4843w9(this, i);
    }

    /* renamed from: n */
    public final void mo14577n(C4773s5 s5Var) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f14632f.size();
    }

    /* renamed from: v */
    public final C4758r7 mo14578v() {
        return this;
    }
}
