package p340io.realm.internal;

import java.util.Date;
import p340io.realm.C5669h0;
import p340io.realm.C5816x;
import p340io.realm.internal.ObservableCollection;

/* renamed from: io.realm.internal.OsList */
public class OsList implements C5712i, ObservableCollection {

    /* renamed from: j */
    private static final long f16402j = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final long f16403f;

    /* renamed from: g */
    private final C5711h f16404g;

    /* renamed from: h */
    private final Table f16405h;

    /* renamed from: i */
    private final C5714k<ObservableCollection.C5679b> f16406i = new C5714k<>();

    public OsList(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm n = uncheckedRow.mo16592k().mo16556n();
        long[] nativeCreate = nativeCreate(n.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.f16403f = nativeCreate[0];
        C5711h hVar = n.context;
        this.f16404g = hVar;
        hVar.mo16628a(this);
        if (nativeCreate[1] != 0) {
            this.f16405h = new Table(n, nativeCreate[1]);
        } else {
            this.f16405h = null;
        }
    }

    private static native void nativeAddBinary(long j, byte[] bArr);

    private static native void nativeAddBoolean(long j, boolean z);

    private static native void nativeAddDate(long j, long j2);

    private static native void nativeAddDouble(long j, double d);

    private static native void nativeAddFloat(long j, float f);

    private static native void nativeAddLong(long j, long j2);

    private static native void nativeAddNull(long j);

    private static native void nativeAddRow(long j, long j2);

    private static native void nativeAddString(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRow(long j, long j2);

    private static native Object nativeGetValue(long j, long j2);

    private static native void nativeInsertBinary(long j, long j2, byte[] bArr);

    private static native void nativeInsertBoolean(long j, long j2, boolean z);

    private static native void nativeInsertDate(long j, long j2, long j3);

    private static native void nativeInsertDouble(long j, long j2, double d);

    private static native void nativeInsertFloat(long j, long j2, float f);

    private static native void nativeInsertLong(long j, long j2, long j3);

    private static native void nativeInsertNull(long j, long j2);

    private static native void nativeInsertRow(long j, long j2, long j3);

    private static native void nativeInsertString(long j, long j2, String str);

    private static native boolean nativeIsValid(long j);

    private static native void nativeRemove(long j, long j2);

    private static native void nativeRemoveAll(long j);

    private static native void nativeSetBinary(long j, long j2, byte[] bArr);

    private static native void nativeSetBoolean(long j, long j2, boolean z);

    private static native void nativeSetDate(long j, long j2, long j3);

    private static native void nativeSetDouble(long j, long j2, double d);

    private static native void nativeSetFloat(long j, long j2, float f);

    private static native void nativeSetLong(long j, long j2, long j3);

    private static native void nativeSetNull(long j, long j2);

    private static native void nativeSetRow(long j, long j2, long j3);

    private static native void nativeSetString(long j, long j2, String str);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    /* renamed from: A */
    public void mo16388A(long j, boolean z) {
        nativeSetBoolean(this.f16403f, j, z);
    }

    /* renamed from: B */
    public void mo16389B(long j, Date date) {
        if (date == null) {
            nativeSetNull(this.f16403f, j);
            return;
        }
        nativeSetDate(this.f16403f, j, date.getTime());
    }

    /* renamed from: C */
    public void mo16390C(long j, double d) {
        nativeSetDouble(this.f16403f, j, d);
    }

    /* renamed from: D */
    public void mo16391D(long j, float f) {
        nativeSetFloat(this.f16403f, j, f);
    }

    /* renamed from: E */
    public void mo16392E(long j, long j2) {
        nativeSetLong(this.f16403f, j, j2);
    }

    /* renamed from: F */
    public void mo16393F(long j) {
        nativeSetNull(this.f16403f, j);
    }

    /* renamed from: G */
    public void mo16394G(long j, long j2) {
        nativeSetRow(this.f16403f, j, j2);
    }

    /* renamed from: H */
    public void mo16395H(long j, String str) {
        nativeSetString(this.f16403f, j, str);
    }

    /* renamed from: I */
    public long mo16396I() {
        return nativeSize(this.f16403f);
    }

    /* renamed from: a */
    public void mo16397a(byte[] bArr) {
        nativeAddBinary(this.f16403f, bArr);
    }

    /* renamed from: b */
    public void mo16398b(boolean z) {
        nativeAddBoolean(this.f16403f, z);
    }

    /* renamed from: c */
    public void mo16399c(Date date) {
        long j = this.f16403f;
        if (date == null) {
            nativeAddNull(j);
        } else {
            nativeAddDate(j, date.getTime());
        }
    }

    /* renamed from: d */
    public void mo16400d(double d) {
        nativeAddDouble(this.f16403f, d);
    }

    /* renamed from: e */
    public void mo16401e(float f) {
        nativeAddFloat(this.f16403f, f);
    }

    /* renamed from: f */
    public <T> void mo16402f(T t, C5816x<T> xVar) {
        if (this.f16406i.mo16632d()) {
            nativeStartListening(this.f16403f);
        }
        this.f16406i.mo16629a(new ObservableCollection.C5679b(t, xVar));
    }

    /* renamed from: g */
    public <T> void mo16403g(T t, C5669h0<T> h0Var) {
        mo16402f(t, new ObservableCollection.C5680c(h0Var));
    }

    public long getNativeFinalizerPtr() {
        return f16402j;
    }

    public long getNativePtr() {
        return this.f16403f;
    }

    /* renamed from: h */
    public void mo16404h(long j) {
        nativeAddLong(this.f16403f, j);
    }

    /* renamed from: i */
    public void mo16405i() {
        nativeAddNull(this.f16403f);
    }

    /* renamed from: j */
    public void mo16406j(long j) {
        nativeAddRow(this.f16403f, j);
    }

    /* renamed from: k */
    public void mo16407k(String str) {
        nativeAddString(this.f16403f, str);
    }

    /* renamed from: l */
    public UncheckedRow mo16408l(long j) {
        return this.f16405h.mo16559q(nativeGetRow(this.f16403f, j));
    }

    /* renamed from: m */
    public Object mo16409m(long j) {
        return nativeGetValue(this.f16403f, j);
    }

    /* renamed from: n */
    public void mo16410n(long j, byte[] bArr) {
        nativeInsertBinary(this.f16403f, j, bArr);
    }

    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j, false);
        if (!osCollectionChangeSet.mo16382e()) {
            this.f16406i.mo16631c(new ObservableCollection.C5678a(osCollectionChangeSet));
        }
    }

    /* renamed from: o */
    public void mo16411o(long j, boolean z) {
        nativeInsertBoolean(this.f16403f, j, z);
    }

    /* renamed from: p */
    public void mo16412p(long j, Date date) {
        if (date == null) {
            nativeInsertNull(this.f16403f, j);
            return;
        }
        nativeInsertDate(this.f16403f, j, date.getTime());
    }

    /* renamed from: q */
    public void mo16413q(long j, double d) {
        nativeInsertDouble(this.f16403f, j, d);
    }

    /* renamed from: r */
    public void mo16414r(long j, float f) {
        nativeInsertFloat(this.f16403f, j, f);
    }

    /* renamed from: s */
    public void mo16415s(long j, long j2) {
        nativeInsertLong(this.f16403f, j, j2);
    }

    /* renamed from: t */
    public void mo16416t(long j) {
        nativeInsertNull(this.f16403f, j);
    }

    /* renamed from: u */
    public void mo16417u(long j, long j2) {
        nativeInsertRow(this.f16403f, j, j2);
    }

    /* renamed from: v */
    public void mo16418v(long j, String str) {
        nativeInsertString(this.f16403f, j, str);
    }

    /* renamed from: w */
    public boolean mo16419w() {
        return nativeIsValid(this.f16403f);
    }

    /* renamed from: x */
    public void mo16420x(long j) {
        nativeRemove(this.f16403f, j);
    }

    /* renamed from: y */
    public void mo16421y() {
        nativeRemoveAll(this.f16403f);
    }

    /* renamed from: z */
    public void mo16422z(long j, byte[] bArr) {
        nativeSetBinary(this.f16403f, j, bArr);
    }
}
