package p340io.realm.internal.sync;

import p340io.realm.C5669h0;
import p340io.realm.internal.C5712i;
import p340io.realm.internal.C5714k;
import p340io.realm.internal.KeepMember;
import p340io.realm.internal.OsResults;

@KeepMember
/* renamed from: io.realm.internal.sync.OsSubscription */
public class OsSubscription implements C5712i {

    /* renamed from: h */
    private static final long f16560h = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final long f16561f;

    /* renamed from: g */
    protected final C5714k<C5734c> f16562g = new C5714k<>();

    /* renamed from: io.realm.internal.sync.OsSubscription$b */
    private static class C5733b implements C5714k.C5715a<C5734c> {
        private C5733b() {
        }

        /* renamed from: b */
        public void mo16266a(C5734c cVar, Object obj) {
            cVar.mo16672a((OsSubscription) obj);
        }
    }

    /* renamed from: io.realm.internal.sync.OsSubscription$c */
    private static class C5734c extends C5714k.C5716b<OsSubscription, C5669h0<OsSubscription>> {
        public C5734c(OsSubscription osSubscription, C5669h0<OsSubscription> h0Var) {
            super(osSubscription, h0Var);
        }

        /* renamed from: a */
        public void mo16672a(OsSubscription osSubscription) {
            ((C5669h0) this.f16516b).mo16295a(osSubscription);
        }
    }

    /* renamed from: io.realm.internal.sync.OsSubscription$d */
    public enum C5735d {
        ERROR(-1),
        CREATING(2),
        PENDING(0),
        COMPLETE(1),
        INVALIDATED(3);
        

        /* renamed from: f */
        private final int f16569f;

        private C5735d(int i) {
            this.f16569f = i;
        }

        /* renamed from: e */
        public static C5735d m23972e(int i) {
            for (C5735d dVar : values()) {
                if (dVar.f16569f == i) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown value: " + i);
        }
    }

    public OsSubscription(OsResults osResults, C5736a aVar) {
        this.f16561f = nativeCreateOrUpdate(osResults.getNativePtr(), aVar.mo16673a(), aVar.mo16674b(), aVar.mo16675c());
    }

    private static native long nativeCreateOrUpdate(long j, String str, long j2, boolean z);

    private static native Object nativeGetError(long j);

    private static native long nativeGetFinalizerPtr();

    private static native int nativeGetState(long j);

    private native void nativeStartListening(long j);

    @KeepMember
    private void notifyChangeListeners() {
        this.f16562g.mo16631c(new C5733b());
    }

    /* renamed from: a */
    public void mo16668a(C5669h0<OsSubscription> h0Var) {
        if (this.f16562g.mo16632d()) {
            nativeStartListening(this.f16561f);
        }
        this.f16562g.mo16629a(new C5734c(this, h0Var));
    }

    /* renamed from: b */
    public Throwable mo16669b() {
        return (Throwable) nativeGetError(this.f16561f);
    }

    /* renamed from: c */
    public C5735d mo16670c() {
        return C5735d.m23972e(nativeGetState(this.f16561f));
    }

    public long getNativeFinalizerPtr() {
        return f16560h;
    }

    public long getNativePtr() {
        return this.f16561f;
    }
}
