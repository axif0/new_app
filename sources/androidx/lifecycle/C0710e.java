package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.e */
public abstract class C0710e {

    /* renamed from: androidx.lifecycle.e$a */
    public enum C0711a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.e$b */
    public enum C0712b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: e */
        public boolean mo3670e(C0712b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C0710e() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo3667a(C0716h hVar);

    /* renamed from: b */
    public abstract C0712b mo3668b();

    /* renamed from: c */
    public abstract void mo3669c(C0716h hVar);
}
