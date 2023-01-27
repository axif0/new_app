package p340io.realm.internal;

import java.util.Date;
import p340io.realm.RealmFieldType;

/* renamed from: io.realm.internal.UncheckedRow */
public class UncheckedRow implements C5712i, C5722p {

    /* renamed from: i */
    private static final long f16478i = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final C5711h f16479f;

    /* renamed from: g */
    private final Table f16480g;

    /* renamed from: h */
    private final long f16481h;

    UncheckedRow(UncheckedRow uncheckedRow) {
        this.f16479f = uncheckedRow.f16479f;
        this.f16480g = uncheckedRow.f16480g;
        this.f16481h = uncheckedRow.f16481h;
    }

    public UncheckedRow(C5711h hVar, Table table, long j) {
        this.f16479f = hVar;
        this.f16480g = table;
        this.f16481h = j;
        hVar.mo16628a(this);
    }

    /* renamed from: a */
    static UncheckedRow m23759a(C5711h hVar, Table table, long j) {
        return new UncheckedRow(hVar, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    /* renamed from: b */
    static UncheckedRow m23760b(C5711h hVar, Table table, long j) {
        return new UncheckedRow(hVar, table, j);
    }

    private static native long nativeGetFinalizerPtr();

    /* renamed from: A */
    public boolean mo16582A() {
        long j = this.f16481h;
        return j != 0 && nativeIsAttached(j);
    }

    /* renamed from: B */
    public Date mo16583B(long j) {
        return new Date(nativeGetTimestamp(this.f16481h, j));
    }

    /* renamed from: D */
    public OsList mo16344D(long j, RealmFieldType realmFieldType) {
        return new OsList(this, j);
    }

    /* renamed from: E */
    public boolean mo16345E(long j) {
        return nativeIsNull(this.f16481h, j);
    }

    /* renamed from: F */
    public String mo16584F(long j) {
        return nativeGetColumnName(this.f16481h, j);
    }

    /* renamed from: G */
    public void mo16585G(long j, Date date) {
        this.f16480g.mo16544a();
        if (date != null) {
            nativeSetTimestamp(this.f16481h, j, date.getTime());
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    /* renamed from: H */
    public RealmFieldType mo16586H(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f16481h, j));
    }

    /* renamed from: J */
    public void mo16587J(long j) {
        this.f16480g.mo16544a();
        nativeNullifyLink(this.f16481h, j);
    }

    /* renamed from: c */
    public void mo16588c(long j, byte[] bArr) {
        this.f16480g.mo16544a();
        nativeSetByteArray(this.f16481h, j, bArr);
    }

    /* renamed from: g */
    public long mo16589g() {
        return nativeGetIndex(this.f16481h);
    }

    public long getNativeFinalizerPtr() {
        return f16478i;
    }

    public long getNativePtr() {
        return this.f16481h;
    }

    /* renamed from: h */
    public void mo16590h(long j, String str) {
        this.f16480g.mo16544a();
        if (str == null) {
            nativeSetNull(this.f16481h, j);
            return;
        }
        nativeSetString(this.f16481h, j, str);
    }

    /* renamed from: j */
    public long mo16591j() {
        return nativeGetColumnCount(this.f16481h);
    }

    /* renamed from: k */
    public Table mo16592k() {
        return this.f16480g;
    }

    /* renamed from: l */
    public boolean mo16346l(long j) {
        return nativeIsNullLink(this.f16481h, j);
    }

    /* renamed from: m */
    public void mo16347m(long j) {
        this.f16480g.mo16544a();
        nativeSetNull(this.f16481h, j);
    }

    /* renamed from: n */
    public byte[] mo16593n(long j) {
        return nativeGetByteArray(this.f16481h, j);
    }

    /* access modifiers changed from: protected */
    public native boolean nativeGetBoolean(long j, long j2);

    /* access modifiers changed from: protected */
    public native byte[] nativeGetByteArray(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetColumnCount(long j);

    /* access modifiers changed from: protected */
    public native long nativeGetColumnIndex(long j, String str);

    /* access modifiers changed from: protected */
    public native String nativeGetColumnName(long j, long j2);

    /* access modifiers changed from: protected */
    public native int nativeGetColumnType(long j, long j2);

    /* access modifiers changed from: protected */
    public native double nativeGetDouble(long j, long j2);

    /* access modifiers changed from: protected */
    public native float nativeGetFloat(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetIndex(long j);

    /* access modifiers changed from: protected */
    public native long nativeGetLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetLong(long j, long j2);

    /* access modifiers changed from: protected */
    public native String nativeGetString(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetTimestamp(long j, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeIsAttached(long j);

    /* access modifiers changed from: protected */
    public native boolean nativeIsNull(long j, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeIsNullLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native void nativeNullifyLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native void nativeSetBoolean(long j, long j2, boolean z);

    /* access modifiers changed from: protected */
    public native void nativeSetByteArray(long j, long j2, byte[] bArr);

    /* access modifiers changed from: protected */
    public native void nativeSetLink(long j, long j2, long j3);

    /* access modifiers changed from: protected */
    public native void nativeSetLong(long j, long j2, long j3);

    /* access modifiers changed from: protected */
    public native void nativeSetNull(long j, long j2);

    /* access modifiers changed from: protected */
    public native void nativeSetString(long j, long j2, String str);

    /* access modifiers changed from: protected */
    public native void nativeSetTimestamp(long j, long j2, long j3);

    /* renamed from: o */
    public void mo16598o(long j, boolean z) {
        this.f16480g.mo16544a();
        nativeSetBoolean(this.f16481h, j, z);
    }

    /* renamed from: q */
    public double mo16599q(long j) {
        return nativeGetDouble(this.f16481h, j);
    }

    /* renamed from: r */
    public boolean mo16600r(long j) {
        return nativeGetBoolean(this.f16481h, j);
    }

    /* renamed from: s */
    public long mo16601s(long j) {
        return nativeGetLink(this.f16481h, j);
    }

    /* renamed from: t */
    public float mo16602t(long j) {
        return nativeGetFloat(this.f16481h, j);
    }

    /* renamed from: u */
    public long mo16603u(long j) {
        return nativeGetLong(this.f16481h, j);
    }

    /* renamed from: v */
    public String mo16604v(long j) {
        return nativeGetString(this.f16481h, j);
    }

    /* renamed from: w */
    public void mo16605w(long j, long j2) {
        this.f16480g.mo16544a();
        nativeSetLink(this.f16481h, j, j2);
    }

    /* renamed from: x */
    public long mo16606x(String str) {
        if (str != null) {
            return nativeGetColumnIndex(this.f16481h, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    /* renamed from: y */
    public OsList mo16368y(long j) {
        return new OsList(this, j);
    }

    /* renamed from: z */
    public void mo16607z(long j, long j2) {
        this.f16480g.mo16544a();
        nativeSetLong(this.f16481h, j, j2);
    }
}
