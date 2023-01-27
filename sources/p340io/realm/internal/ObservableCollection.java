package p340io.realm.internal;

import p340io.realm.C5669h0;
import p340io.realm.C5812w;
import p340io.realm.C5816x;
import p340io.realm.internal.C5714k;

@Keep
/* renamed from: io.realm.internal.ObservableCollection */
interface ObservableCollection {

    /* renamed from: io.realm.internal.ObservableCollection$a */
    public static class C5678a implements C5714k.C5715a<C5679b> {

        /* renamed from: a */
        private final OsCollectionChangeSet f16395a;

        C5678a(OsCollectionChangeSet osCollectionChangeSet) {
            this.f16395a = osCollectionChangeSet;
        }

        /* renamed from: b */
        public void mo16266a(C5679b bVar, Object obj) {
            bVar.mo16374a(obj, this.f16395a);
        }
    }

    /* renamed from: io.realm.internal.ObservableCollection$b */
    public static class C5679b<T> extends C5714k.C5716b<T, Object> {
        public C5679b(T t, Object obj) {
            super(t, obj);
        }

        /* renamed from: a */
        public void mo16374a(T t, OsCollectionChangeSet osCollectionChangeSet) {
            S s = this.f16516b;
            if (s instanceof C5816x) {
                ((C5816x) s).mo16375a(t, new C5723q(osCollectionChangeSet));
            } else if (s instanceof C5669h0) {
                ((C5669h0) s).mo16295a(t);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.f16516b);
            }
        }
    }

    /* renamed from: io.realm.internal.ObservableCollection$c */
    public static class C5680c<T> implements C5816x<T> {

        /* renamed from: a */
        private final C5669h0<T> f16396a;

        C5680c(C5669h0<T> h0Var) {
            this.f16396a = h0Var;
        }

        /* renamed from: a */
        public void mo16375a(T t, C5812w wVar) {
            this.f16396a.mo16295a(t);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5680c) && this.f16396a == ((C5680c) obj).f16396a;
        }

        public int hashCode() {
            return this.f16396a.hashCode();
        }
    }

    void notifyChangeListeners(long j);
}
