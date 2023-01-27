package p340io.realm.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p340io.realm.C5669h0;
import p340io.realm.C5816x;
import p340io.realm.internal.ObservableCollection;
import p340io.realm.internal.core.DescriptorOrdering;
import p340io.realm.internal.core.QueryDescriptor;
import p340io.realm.internal.sync.OsSubscription;

/* renamed from: io.realm.internal.OsResults */
public class OsResults implements C5712i, ObservableCollection {

    /* renamed from: m */
    private static final long f16444m = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final long f16445f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final OsSharedRealm f16446g;

    /* renamed from: h */
    private final C5711h f16447h;

    /* renamed from: i */
    private final Table f16448i;

    /* renamed from: j */
    protected boolean f16449j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f16450k = false;

    /* renamed from: l */
    protected final C5714k<ObservableCollection.C5679b> f16451l = new C5714k<>();

    /* renamed from: io.realm.internal.OsResults$a */
    public static abstract class C5691a<T> implements Iterator<T> {

        /* renamed from: f */
        OsResults f16452f;

        /* renamed from: g */
        protected int f16453g = -1;

        public C5691a(OsResults osResults) {
            if (!osResults.f16446g.isClosed()) {
                this.f16452f = osResults;
                if (!osResults.f16450k) {
                    if (osResults.f16446g.isInTransaction()) {
                        mo16462d();
                    } else {
                        this.f16452f.f16446g.addIterator(this);
                    }
                }
            } else {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16460b() {
            if (this.f16452f == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract T mo16461c(UncheckedRow uncheckedRow);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16462d() {
            this.f16452f = this.f16452f.mo16448f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public T mo16463e(int i) {
            return mo16461c(this.f16452f.mo16452j(i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo16464f() {
            this.f16452f = null;
        }

        public boolean hasNext() {
            mo16460b();
            return ((long) (this.f16453g + 1)) < this.f16452f.mo16458p();
        }

        public T next() {
            mo16460b();
            int i = this.f16453g + 1;
            this.f16453g = i;
            if (((long) i) < this.f16452f.mo16458p()) {
                return mo16463e(this.f16453g);
            }
            throw new NoSuchElementException("Cannot access index " + this.f16453g + " when size is " + this.f16452f.mo16458p() + ". Remember to check hasNext() before using next().");
        }

        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* renamed from: io.realm.internal.OsResults$b */
    public static abstract class C5692b<T> extends C5691a<T> implements ListIterator<T> {
        public C5692b(OsResults osResults, int i) {
            super(osResults);
            if (i < 0 || ((long) i) > this.f16452f.mo16458p()) {
                throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.f16452f.mo16458p() - 1) + "]. Yours was " + i);
            }
            this.f16453g = i - 1;
        }

        @Deprecated
        public void add(T t) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        public boolean hasPrevious() {
            mo16460b();
            return this.f16453g >= 0;
        }

        public int nextIndex() {
            mo16460b();
            return this.f16453g + 1;
        }

        public T previous() {
            mo16460b();
            try {
                this.f16453g--;
                return mo16463e(this.f16453g);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.f16453g + ". Remember to check hasPrevious() before using previous().");
            }
        }

        public int previousIndex() {
            mo16460b();
            return this.f16453g;
        }

        @Deprecated
        public void set(T t) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    /* renamed from: io.realm.internal.OsResults$c */
    public enum C5693c {
        EMPTY,
        TABLE,
        QUERY,
        LINKVIEW,
        TABLEVIEW;

        /* renamed from: e */
        static C5693c m23705e(byte b) {
            if (b == 0) {
                return EMPTY;
            }
            if (b == 1) {
                return TABLE;
            }
            if (b == 2) {
                return QUERY;
            }
            if (b == 3) {
                return LINKVIEW;
            }
            if (b == 4) {
                return TABLEVIEW;
            }
            throw new IllegalArgumentException("Invalid value: " + b);
        }
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        boolean z = false;
        this.f16446g = osSharedRealm;
        C5711h hVar = osSharedRealm.context;
        this.f16447h = hVar;
        this.f16448i = table;
        this.f16445f = j;
        hVar.mo16628a(this);
        this.f16449j = mo16450h() != C5693c.QUERY ? true : z;
    }

    /* renamed from: e */
    public static OsResults m23685e(OsSharedRealm osSharedRealm, TableQuery tableQuery, DescriptorOrdering descriptorOrdering) {
        tableQuery.mo16581m();
        return new OsResults(osSharedRealm, tableQuery.mo16573e(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr(), descriptorOrdering.getNativePtr()));
    }

    protected static native long nativeCreateResults(long j, long j2, long j3);

    private static native long nativeCreateSnapshot(long j);

    private static native void nativeEvaluateQueryIfNeeded(long j, boolean z);

    private static native long nativeFirstRow(long j);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    private static native long nativeGetRow(long j, int i);

    private static native boolean nativeIsValid(long j);

    private static native long nativeSize(long j);

    private static native long nativeSort(long j, QueryDescriptor queryDescriptor);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    /* renamed from: c */
    public <T> void mo16446c(T t, C5816x<T> xVar) {
        if (this.f16451l.mo16632d()) {
            nativeStartListening(this.f16445f);
        }
        this.f16451l.mo16629a(new ObservableCollection.C5679b(t, xVar));
    }

    /* renamed from: d */
    public <T> void mo16447d(T t, C5669h0<T> h0Var) {
        mo16446c(t, new ObservableCollection.C5680c(h0Var));
    }

    /* renamed from: f */
    public OsResults mo16448f() {
        if (this.f16450k) {
            return this;
        }
        OsResults osResults = new OsResults(this.f16446g, this.f16448i, nativeCreateSnapshot(this.f16445f));
        osResults.f16450k = true;
        return osResults;
    }

    /* renamed from: g */
    public UncheckedRow mo16449g() {
        long nativeFirstRow = nativeFirstRow(this.f16445f);
        if (nativeFirstRow != 0) {
            return this.f16448i.mo16559q(nativeFirstRow);
        }
        return null;
    }

    public long getNativeFinalizerPtr() {
        return f16444m;
    }

    public long getNativePtr() {
        return this.f16445f;
    }

    /* renamed from: h */
    public C5693c mo16450h() {
        return C5693c.m23705e(nativeGetMode(this.f16445f));
    }

    /* renamed from: i */
    public Table mo16451i() {
        return this.f16448i;
    }

    /* renamed from: j */
    public UncheckedRow mo16452j(int i) {
        return this.f16448i.mo16559q(nativeGetRow(this.f16445f, i));
    }

    /* renamed from: k */
    public boolean mo16453k() {
        return this.f16449j;
    }

    /* renamed from: l */
    public boolean mo16454l() {
        return nativeIsValid(this.f16445f);
    }

    /* renamed from: m */
    public void mo16455m() {
        if (!this.f16449j) {
            nativeEvaluateQueryIfNeeded(this.f16445f, false);
            notifyChangeListeners(0);
        }
    }

    /* renamed from: n */
    public <T> void mo16456n(T t, C5816x<T> xVar) {
        this.f16451l.mo16633e(t, xVar);
        if (this.f16451l.mo16632d()) {
            nativeStopListening(this.f16445f);
        }
    }

    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j == 0) {
            osCollectionChangeSet = new C5707d((OsSubscription) null, this.f16446g.isPartial());
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j, !mo16453k(), (OsSubscription) null, this.f16446g.isPartial());
        }
        if (!osCollectionChangeSet.mo16382e() || !mo16453k()) {
            this.f16449j = true;
            this.f16451l.mo16631c(new ObservableCollection.C5678a(osCollectionChangeSet));
        }
    }

    /* renamed from: o */
    public <T> void mo16457o(T t, C5669h0<T> h0Var) {
        mo16456n(t, new ObservableCollection.C5680c(h0Var));
    }

    /* renamed from: p */
    public long mo16458p() {
        return nativeSize(this.f16445f);
    }

    /* renamed from: q */
    public OsResults mo16459q(QueryDescriptor queryDescriptor) {
        return new OsResults(this.f16446g, this.f16448i, nativeSort(this.f16445f, queryDescriptor));
    }
}
