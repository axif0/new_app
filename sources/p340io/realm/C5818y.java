package p340io.realm;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p340io.realm.internal.C5710g;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.OsResults;
import p340io.realm.internal.UncheckedRow;
import p340io.realm.internal.core.QueryDescriptor;
import p340io.realm.internal.p341s.C5730c;

/* renamed from: io.realm.y */
abstract class C5818y<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: f */
    final C5632b f16855f;

    /* renamed from: g */
    final Class<E> f16856g;

    /* renamed from: h */
    final String f16857h;

    /* renamed from: i */
    final OsResults f16858i;

    /* renamed from: io.realm.y$a */
    private class C5819a extends OsResults.C5691a<E> {
        C5819a() {
            super(C5818y.this.f16858i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public E mo16461c(UncheckedRow uncheckedRow) {
            C5818y yVar = C5818y.this;
            return yVar.f16855f.mo16233w(yVar.f16856g, yVar.f16857h, uncheckedRow);
        }
    }

    /* renamed from: io.realm.y$b */
    private class C5820b extends OsResults.C5692b<E> {
        C5820b(int i) {
            super(C5818y.this.f16858i, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public E mo16461c(UncheckedRow uncheckedRow) {
            C5818y yVar = C5818y.this;
            return yVar.f16855f.mo16233w(yVar.f16856g, yVar.f16857h, uncheckedRow);
        }
    }

    C5818y(C5632b bVar, OsResults osResults, Class<E> cls) {
        this(bVar, osResults, cls, (String) null);
    }

    private C5818y(C5632b bVar, OsResults osResults, Class<E> cls, String str) {
        this.f16855f = bVar;
        this.f16858i = osResults;
        this.f16856g = cls;
        this.f16857h = str;
    }

    C5818y(C5632b bVar, OsResults osResults, String str) {
        this(bVar, osResults, (Class) null, str);
    }

    /* renamed from: f */
    private E m24289f(boolean z, E e) {
        UncheckedRow g = this.f16858i.mo16449g();
        if (g != null) {
            return this.f16855f.mo16233w(this.f16856g, this.f16857h, g);
        }
        if (!z) {
            return e;
        }
        throw new IndexOutOfBoundsException("No results were found.");
    }

    /* renamed from: h */
    private C5789s0 m24290h() {
        return new C5789s0(this.f16855f.mo16219H());
    }

    @Deprecated
    public void add(int i, E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Deprecated
    public boolean add(E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Deprecated
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5782q0<E> mo16831c(OsResults osResults) {
        C5782q0<E> q0Var;
        String str = this.f16857h;
        if (str != null) {
            C5632b bVar = this.f16855f;
        } else {
            q0Var = new C5782q0<>(this.f16855f, osResults, this.f16856g);
        }
        q0Var.mo16765o();
        return q0Var;
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean contains(Object obj) {
        if (!mo16153l() || ((obj instanceof C5720n) && ((C5720n) obj).mo16212L().mo16259f() == C5710g.INSTANCE)) {
            return false;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            if (it.next().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public E mo16834d(E e) {
        return m24289f(false, e);
    }

    public E get(int i) {
        this.f16855f.mo16228j();
        return this.f16855f.mo16233w(this.f16856g, this.f16857h, this.f16858i.mo16452j(i));
    }

    /* renamed from: i */
    public C5782q0<E> mo16836i(String str, C5793t0 t0Var) {
        return mo16831c(this.f16858i.mo16459q(QueryDescriptor.getInstanceForSort((C5730c.C5731a) m24290h(), this.f16858i.mo16451i(), str, t0Var)));
    }

    public Iterator<E> iterator() {
        return new C5819a();
    }

    /* renamed from: k */
    public boolean mo16152k() {
        return this.f16858i.mo16454l();
    }

    public ListIterator<E> listIterator() {
        return new C5820b(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C5820b(i);
    }

    @Deprecated
    public E remove(int i) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    /* renamed from: s */
    public boolean mo16154s() {
        return true;
    }

    @Deprecated
    public E set(int i, E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public int size() {
        if (!mo16153l()) {
            return 0;
        }
        long p = this.f16858i.mo16458p();
        if (p > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) p;
    }
}
