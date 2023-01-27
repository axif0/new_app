package p340io.realm.internal;

import com.karumi.dexter.BuildConfig;
import java.util.Date;
import p340io.realm.C5651e;

/* renamed from: io.realm.internal.TableQuery */
public class TableQuery implements C5712i {

    /* renamed from: i */
    private static final long f16474i = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final Table f16475f;

    /* renamed from: g */
    private final long f16476g;

    /* renamed from: h */
    private boolean f16477h = true;

    public TableQuery(C5711h hVar, Table table, long j) {
        this.f16475f = table;
        this.f16476g = j;
        hVar.mo16628a(this);
    }

    private native void nativeEqual(long j, long[] jArr, long[] jArr2, long j2);

    private native void nativeEqual(long j, long[] jArr, long[] jArr2, String str, boolean z);

    private native void nativeEqual(long j, long[] jArr, long[] jArr2, boolean z);

    private native long nativeFind(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private native void nativeGreaterEqual(long j, long[] jArr, long[] jArr2, long j2);

    private native void nativeGreaterTimestamp(long j, long[] jArr, long[] jArr2, long j2);

    private native void nativeIsNull(long j, long[] jArr, long[] jArr2);

    private native void nativeLessEqual(long j, long[] jArr, long[] jArr2, long j2);

    private native Double nativeMaximumDouble(long j, long j2, long j3, long j4, long j5);

    private native Float nativeMaximumFloat(long j, long j2, long j3, long j4, long j5);

    private native Long nativeMaximumInt(long j, long j2, long j3, long j4, long j5);

    private native String nativeValidateQuery(long j);

    /* renamed from: a */
    public TableQuery mo16569a(long[] jArr, long[] jArr2, long j) {
        nativeEqual(this.f16476g, jArr, jArr2, j);
        this.f16477h = false;
        return this;
    }

    /* renamed from: b */
    public TableQuery mo16570b(long[] jArr, long[] jArr2, String str, C5651e eVar) {
        nativeEqual(this.f16476g, jArr, jArr2, str, eVar.mo16278e());
        this.f16477h = false;
        return this;
    }

    /* renamed from: c */
    public TableQuery mo16571c(long[] jArr, long[] jArr2, boolean z) {
        nativeEqual(this.f16476g, jArr, jArr2, z);
        this.f16477h = false;
        return this;
    }

    /* renamed from: d */
    public long mo16572d() {
        mo16581m();
        return nativeFind(this.f16476g, 0);
    }

    /* renamed from: e */
    public Table mo16573e() {
        return this.f16475f;
    }

    /* renamed from: f */
    public TableQuery mo16574f(long[] jArr, long[] jArr2, Date date) {
        if (date != null) {
            nativeGreaterTimestamp(this.f16476g, jArr, jArr2, date.getTime());
            this.f16477h = false;
            return this;
        }
        throw new IllegalArgumentException("Date value in query criteria must not be null.");
    }

    /* renamed from: g */
    public TableQuery mo16575g(long[] jArr, long[] jArr2, long j) {
        nativeGreaterEqual(this.f16476g, jArr, jArr2, j);
        this.f16477h = false;
        return this;
    }

    public long getNativeFinalizerPtr() {
        return f16474i;
    }

    public long getNativePtr() {
        return this.f16476g;
    }

    /* renamed from: h */
    public TableQuery mo16576h(long[] jArr, long[] jArr2) {
        nativeIsNull(this.f16476g, jArr, jArr2);
        this.f16477h = false;
        return this;
    }

    /* renamed from: i */
    public TableQuery mo16577i(long[] jArr, long[] jArr2, long j) {
        nativeLessEqual(this.f16476g, jArr, jArr2, j);
        this.f16477h = false;
        return this;
    }

    /* renamed from: j */
    public Double mo16578j(long j) {
        mo16581m();
        return nativeMaximumDouble(this.f16476g, j, 0, -1, -1);
    }

    /* renamed from: k */
    public Float mo16579k(long j) {
        mo16581m();
        return nativeMaximumFloat(this.f16476g, j, 0, -1, -1);
    }

    /* renamed from: l */
    public Long mo16580l(long j) {
        mo16581m();
        return nativeMaximumInt(this.f16476g, j, 0, -1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo16581m() {
        if (!this.f16477h) {
            String nativeValidateQuery = nativeValidateQuery(this.f16476g);
            if (nativeValidateQuery.equals(BuildConfig.FLAVOR)) {
                this.f16477h = true;
                return;
            }
            throw new UnsupportedOperationException(nativeValidateQuery);
        }
    }
}
