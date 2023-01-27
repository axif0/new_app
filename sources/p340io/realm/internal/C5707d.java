package p340io.realm.internal;

import p340io.realm.C5812w;
import p340io.realm.internal.sync.OsSubscription;

/* renamed from: io.realm.internal.d */
public class C5707d extends OsCollectionChangeSet {

    /* renamed from: k */
    private static final C5812w.C5813a[] f16506k = new C5812w.C5813a[0];

    public C5707d(OsSubscription osSubscription, boolean z) {
        super(0, true, osSubscription, z);
    }

    public C5707d(OsSubscription osSubscription, boolean z, boolean z2) {
        super(0, z, osSubscription, z2);
    }

    /* renamed from: a */
    public C5812w.C5813a[] mo16378a() {
        return f16506k;
    }

    /* renamed from: b */
    public C5812w.C5813a[] mo16379b() {
        return f16506k;
    }

    /* renamed from: c */
    public Throwable mo16380c() {
        OsSubscription osSubscription = this.f16400h;
        if (osSubscription == null || osSubscription.mo16670c() != OsSubscription.C5735d.ERROR) {
            return null;
        }
        return this.f16400h.mo16669b();
    }

    /* renamed from: d */
    public C5812w.C5813a[] mo16381d() {
        return f16506k;
    }

    /* renamed from: e */
    public boolean mo16382e() {
        return this.f16400h == null;
    }

    /* renamed from: f */
    public boolean mo16383f() {
        return super.mo16383f();
    }

    /* renamed from: g */
    public boolean mo16384g() {
        return super.mo16384g();
    }

    public long getNativeFinalizerPtr() {
        return super.getNativeFinalizerPtr();
    }

    public long getNativePtr() {
        return super.getNativePtr();
    }

    public String toString() {
        return super.toString();
    }
}
