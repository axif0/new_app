package p340io.realm.internal;

import p340io.realm.C5812w;

/* renamed from: io.realm.internal.q */
public class C5723q implements C5812w {

    /* renamed from: f */
    private final Throwable f16536f;

    public C5723q(OsCollectionChangeSet osCollectionChangeSet) {
        boolean f = osCollectionChangeSet.mo16383f();
        osCollectionChangeSet.mo16384g();
        Throwable c = osCollectionChangeSet.mo16380c();
        this.f16536f = c;
        if (c != null) {
            C5812w.C5814b bVar = C5812w.C5814b.ERROR;
        } else if (f) {
            C5812w.C5814b bVar2 = C5812w.C5814b.INITIAL;
        } else {
            C5812w.C5814b bVar3 = C5812w.C5814b.UPDATE;
        }
    }
}
