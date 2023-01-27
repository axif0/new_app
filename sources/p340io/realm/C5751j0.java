package p340io.realm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p340io.realm.internal.C5710g;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.j0 */
public class C5751j0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: f */
    protected Class<E> f16590f;

    /* renamed from: g */
    protected String f16591g;

    /* renamed from: h */
    private final C5788s<E> f16592h;

    /* renamed from: i */
    protected final C5632b f16593i;

    /* renamed from: j */
    private List<E> f16594j;

    /* renamed from: io.realm.j0$b */
    private class C5753b implements Iterator<E> {

        /* renamed from: f */
        int f16595f;

        /* renamed from: g */
        int f16596g;

        /* renamed from: h */
        int f16597h;

        private C5753b() {
            this.f16595f = 0;
            this.f16596g = -1;
            this.f16597h = C5751j0.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo16710b() {
            if (C5751j0.this.modCount != this.f16597h) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            C5751j0.this.m24032p();
            mo16710b();
            return this.f16595f != C5751j0.this.size();
        }

        public E next() {
            C5751j0.this.m24032p();
            mo16710b();
            int i = this.f16595f;
            try {
                E e = C5751j0.this.get(i);
                this.f16596g = i;
                this.f16595f = i + 1;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                mo16710b();
                throw new NoSuchElementException("Cannot access index " + i + " when size is " + C5751j0.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        public void remove() {
            C5751j0.this.m24032p();
            if (this.f16596g >= 0) {
                mo16710b();
                try {
                    C5751j0.this.remove(this.f16596g);
                    if (this.f16596g < this.f16595f) {
                        this.f16595f--;
                    }
                    this.f16596g = -1;
                    this.f16597h = C5751j0.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
            }
        }
    }

    /* renamed from: io.realm.j0$c */
    private class C5754c extends C5751j0<E>.C0958b implements ListIterator<E> {
        C5754c(int i) {
            super();
            if (i < 0 || i > C5751j0.this.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Starting location must be a valid index: [0, ");
                sb.append(C5751j0.this.size() - 1);
                sb.append("]. Index was ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            this.f16595f = i;
        }

        public void add(E e) {
            C5751j0.this.f16593i.mo16228j();
            mo16710b();
            try {
                int i = this.f16595f;
                C5751j0.this.add(i, e);
                this.f16596g = -1;
                this.f16595f = i + 1;
                this.f16597h = C5751j0.this.modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasPrevious() {
            return this.f16595f != 0;
        }

        public int nextIndex() {
            return this.f16595f;
        }

        public E previous() {
            mo16710b();
            int i = this.f16595f - 1;
            try {
                E e = C5751j0.this.get(i);
                this.f16595f = i;
                this.f16596g = i;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                mo16710b();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i + ". Remember to check hasPrevious() before using previous().");
            }
        }

        public int previousIndex() {
            return this.f16595f - 1;
        }

        public void set(E e) {
            C5751j0.this.f16593i.mo16228j();
            if (this.f16596g >= 0) {
                mo16710b();
                try {
                    C5751j0.this.set(this.f16596g, e);
                    this.f16597h = C5751j0.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public C5751j0() {
        this.f16593i = null;
        this.f16592h = null;
        this.f16594j = new ArrayList();
    }

    C5751j0(Class<E> cls, OsList osList, C5632b bVar) {
        this.f16590f = cls;
        this.f16592h = m24033q(bVar, osList, cls, (String) null);
        this.f16593i = bVar;
    }

    /* renamed from: o */
    private void m24031o(Object obj, boolean z) {
        if (!z || obj != null) {
            this.f16593i.mo16228j();
            this.f16593i.f16249i.capabilities.mo16609b("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m24032p() {
        this.f16593i.mo16228j();
    }

    /* renamed from: q */
    private C5788s<E> m24033q(C5632b bVar, OsList osList, Class<E> cls, String str) {
        if (cls == null || m24035t(cls)) {
            return new C5767m0(bVar, osList, cls, str);
        }
        if (cls == String.class) {
            return new C5796u0(bVar, osList, cls);
        }
        if (cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class) {
            return new C5785r(bVar, osList, cls);
        }
        if (cls == Boolean.class) {
            return new C5647d(bVar, osList, cls);
        }
        if (cls == byte[].class) {
            return new C5641c(bVar, osList, cls);
        }
        if (cls == Double.class) {
            return new C5750j(bVar, osList, cls);
        }
        if (cls == Float.class) {
            return new C5770n(bVar, osList, cls);
        }
        if (cls == Date.class) {
            return new C5671i(bVar, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected value class: " + cls.getName());
    }

    /* renamed from: r */
    private boolean m24034r() {
        C5788s<E> sVar = this.f16592h;
        return sVar != null && sVar.mo16783j();
    }

    /* renamed from: t */
    private static boolean m24035t(Class<?> cls) {
        return C5763l0.class.isAssignableFrom(cls);
    }

    public void add(int i, E e) {
        if (mo16154s()) {
            m24032p();
            this.f16592h.mo16782g(i, e);
        } else {
            this.f16594j.add(i, e);
        }
        this.modCount++;
    }

    public boolean add(E e) {
        if (mo16154s()) {
            m24032p();
            this.f16592h.mo16780a(e);
        } else {
            this.f16594j.add(e);
        }
        this.modCount++;
        return true;
    }

    public void clear() {
        if (mo16154s()) {
            m24032p();
            this.f16592h.mo16785l();
        } else {
            this.f16594j.clear();
        }
        this.modCount++;
    }

    public boolean contains(Object obj) {
        if (!mo16154s()) {
            return this.f16594j.contains(obj);
        }
        this.f16593i.mo16228j();
        if (!(obj instanceof C5720n) || ((C5720n) obj).mo16212L().mo16259f() != C5710g.INSTANCE) {
            return super.contains(obj);
        }
        return false;
    }

    public E get(int i) {
        if (!mo16154s()) {
            return this.f16594j.get(i);
        }
        m24032p();
        return this.f16592h.mo16250e(i);
    }

    public Iterator<E> iterator() {
        return mo16154s() ? new C5753b() : super.iterator();
    }

    /* renamed from: k */
    public boolean mo16152k() {
        C5632b bVar = this.f16593i;
        if (bVar == null) {
            return true;
        }
        if (bVar.mo16221Q()) {
            return false;
        }
        return m24034r();
    }

    /* renamed from: l */
    public boolean mo16153l() {
        return true;
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public ListIterator<E> listIterator(int i) {
        return mo16154s() ? new C5754c(i) : super.listIterator(i);
    }

    /* renamed from: m */
    public void mo16703m(C5669h0<C5751j0<E>> h0Var) {
        m24031o(h0Var, true);
        this.f16592h.mo16781f().mo16403g(this, h0Var);
    }

    public E remove(int i) {
        E e;
        if (mo16154s()) {
            m24032p();
            e = get(i);
            this.f16592h.mo16784k(i);
        } else {
            e = this.f16594j.remove(i);
        }
        this.modCount++;
        return e;
    }

    public boolean remove(Object obj) {
        if (!mo16154s() || this.f16593i.mo16222S()) {
            return super.remove(obj);
        }
        throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
    }

    public boolean removeAll(Collection<?> collection) {
        if (!mo16154s() || this.f16593i.mo16222S()) {
            return super.removeAll(collection);
        }
        throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
    }

    /* renamed from: s */
    public boolean mo16154s() {
        return this.f16593i != null;
    }

    public E set(int i, E e) {
        if (!mo16154s()) {
            return this.f16594j.set(i, e);
        }
        m24032p();
        return this.f16592h.mo16786m(i, e);
    }

    public int size() {
        if (!mo16154s()) {
            return this.f16594j.size();
        }
        m24032p();
        return this.f16592h.mo16787p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (size() > 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        if (size() > 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fa, code lost:
        if (size() > 0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r8.mo16154s()
            java.lang.String r2 = "byte["
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r5 = "]"
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = "RealmList<?>@["
            r0.append(r1)
            int r1 = r8.size()
        L_0x001b:
            if (r4 >= r1) goto L_0x0047
            java.lang.Object r6 = r8.get(r4)
            boolean r7 = r6 instanceof p340io.realm.C5763l0
            if (r7 == 0) goto L_0x002d
            int r6 = java.lang.System.identityHashCode(r6)
            r0.append(r6)
            goto L_0x0041
        L_0x002d:
            boolean r7 = r6 instanceof byte[]
            if (r7 == 0) goto L_0x003e
            r0.append(r2)
            byte[] r6 = (byte[]) r6
            int r6 = r6.length
            r0.append(r6)
            r0.append(r5)
            goto L_0x0041
        L_0x003e:
            r0.append(r6)
        L_0x0041:
            r0.append(r3)
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0047:
            int r1 = r8.size()
            if (r1 <= 0) goto L_0x0056
        L_0x004d:
            int r1 = r0.length()
            int r1 = r1 + -1
            r0.setLength(r1)
        L_0x0056:
            r0.append(r5)
            goto L_0x00fe
        L_0x005b:
            java.lang.String r1 = "RealmList<"
            r0.append(r1)
            java.lang.String r1 = r8.f16591g
            if (r1 == 0) goto L_0x0068
        L_0x0064:
            r0.append(r1)
            goto L_0x0091
        L_0x0068:
            java.lang.Class<E> r1 = r8.f16590f
            boolean r1 = m24035t(r1)
            if (r1 == 0) goto L_0x0081
            io.realm.b r1 = r8.f16593i
            io.realm.r0 r1 = r1.mo16219H()
            java.lang.Class<E> r6 = r8.f16590f
            io.realm.p0 r1 = r1.mo16775d(r6)
            java.lang.String r1 = r1.mo16761b()
            goto L_0x0064
        L_0x0081:
            java.lang.Class<E> r1 = r8.f16590f
            java.lang.Class<byte[]> r6 = byte[].class
            if (r1 != r6) goto L_0x008c
            java.lang.String r1 = r1.getSimpleName()
            goto L_0x0064
        L_0x008c:
            java.lang.String r1 = r1.getName()
            goto L_0x0064
        L_0x0091:
            java.lang.String r1 = ">@["
            r0.append(r1)
            boolean r1 = r8.m24034r()
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "invalid"
            r0.append(r1)
            goto L_0x0056
        L_0x00a2:
            java.lang.Class<E> r1 = r8.f16590f
            boolean r1 = m24035t(r1)
            if (r1 == 0) goto L_0x00d2
        L_0x00aa:
            int r1 = r8.size()
            if (r4 >= r1) goto L_0x00cb
            java.lang.Object r1 = r8.get(r4)
            io.realm.internal.n r1 = (p340io.realm.internal.C5720n) r1
            io.realm.c0 r1 = r1.mo16212L()
            io.realm.internal.p r1 = r1.mo16259f()
            long r1 = r1.mo16589g()
            r0.append(r1)
            r0.append(r3)
            int r4 = r4 + 1
            goto L_0x00aa
        L_0x00cb:
            int r1 = r8.size()
            if (r1 <= 0) goto L_0x0056
            goto L_0x00fc
        L_0x00d2:
            int r1 = r8.size()
            if (r4 >= r1) goto L_0x00f6
            java.lang.Object r1 = r8.get(r4)
            boolean r6 = r1 instanceof byte[]
            if (r6 == 0) goto L_0x00ed
            r0.append(r2)
            byte[] r1 = (byte[]) r1
            int r1 = r1.length
            r0.append(r1)
            r0.append(r5)
            goto L_0x00f0
        L_0x00ed:
            r0.append(r1)
        L_0x00f0:
            r0.append(r3)
            int r4 = r4 + 1
            goto L_0x00d2
        L_0x00f6:
            int r1 = r8.size()
            if (r1 <= 0) goto L_0x0056
        L_0x00fc:
            goto L_0x004d
        L_0x00fe:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5751j0.toString():java.lang.String");
    }
}
