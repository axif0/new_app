package p340io.realm.internal;

import java.util.Arrays;
import p340io.realm.C5812w;
import p340io.realm.internal.sync.OsSubscription;

/* renamed from: io.realm.internal.OsCollectionChangeSet */
public class OsCollectionChangeSet implements C5812w, C5712i {

    /* renamed from: j */
    private static long f16397j = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final long f16398f;

    /* renamed from: g */
    private final boolean f16399g;

    /* renamed from: h */
    protected final OsSubscription f16400h;

    /* renamed from: i */
    protected final boolean f16401i;

    public OsCollectionChangeSet(long j, boolean z) {
        this(j, z, (OsSubscription) null, false);
    }

    public OsCollectionChangeSet(long j, boolean z, OsSubscription osSubscription, boolean z2) {
        this.f16398f = j;
        this.f16399g = z;
        this.f16400h = osSubscription;
        this.f16401i = z2;
        C5711h.f16512c.mo16628a(this);
    }

    /* renamed from: h */
    private C5812w.C5813a[] m23613h(int[] iArr) {
        if (iArr == null) {
            return new C5812w.C5813a[0];
        }
        int length = iArr.length / 2;
        C5812w.C5813a[] aVarArr = new C5812w.C5813a[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            aVarArr[i] = new C5812w.C5813a(iArr[i2], iArr[i2 + 1]);
        }
        return aVarArr;
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetRanges(long j, int i);

    /* renamed from: a */
    public C5812w.C5813a[] mo16378a() {
        return m23613h(nativeGetRanges(this.f16398f, 2));
    }

    /* renamed from: b */
    public C5812w.C5813a[] mo16379b() {
        return m23613h(nativeGetRanges(this.f16398f, 0));
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
        return m23613h(nativeGetRanges(this.f16398f, 1));
    }

    /* renamed from: e */
    public boolean mo16382e() {
        return this.f16398f == 0;
    }

    /* renamed from: f */
    public boolean mo16383f() {
        return this.f16399g;
    }

    /* renamed from: g */
    public boolean mo16384g() {
        if (!this.f16401i) {
            return true;
        }
        OsSubscription osSubscription = this.f16400h;
        return osSubscription != null && osSubscription.mo16670c() == OsSubscription.C5735d.COMPLETE;
    }

    public long getNativeFinalizerPtr() {
        return f16397j;
    }

    public long getNativePtr() {
        return this.f16398f;
    }

    public String toString() {
        if (this.f16398f == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(mo16379b()) + "\nInsertion Ranges: " + Arrays.toString(mo16381d()) + "\nChange Ranges: " + Arrays.toString(mo16378a());
    }
}
