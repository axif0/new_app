package p340io.realm.internal;

import java.util.Locale;
import p340io.realm.RealmFieldType;

/* renamed from: io.realm.internal.CheckedRow */
public class CheckedRow extends UncheckedRow {
    private CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
    }

    private CheckedRow(C5711h hVar, Table table, long j) {
        super(hVar, table, j);
    }

    /* renamed from: d */
    public static CheckedRow m23595d(C5711h hVar, Table table, long j) {
        return new CheckedRow(hVar, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    /* renamed from: e */
    public static CheckedRow m23596e(UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }

    /* renamed from: D */
    public OsList mo16344D(long j, RealmFieldType realmFieldType) {
        if (realmFieldType == mo16592k().mo16553k(j)) {
            return super.mo16344D(j, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", new Object[]{mo16592k().mo16552j(j), realmFieldType.name()}));
    }

    /* renamed from: E */
    public boolean mo16345E(long j) {
        return super.mo16345E(j);
    }

    /* renamed from: l */
    public boolean mo16346l(long j) {
        RealmFieldType H = mo16586H(j);
        if (H == RealmFieldType.OBJECT || H == RealmFieldType.LIST) {
            return super.mo16346l(j);
        }
        return false;
    }

    /* renamed from: m */
    public void mo16347m(long j) {
        if (mo16586H(j) == RealmFieldType.BINARY) {
            super.mo16588c(j, (byte[]) null);
        } else {
            super.mo16347m(j);
        }
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
    public native long nativeGetLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetLong(long j, long j2);

    /* access modifiers changed from: protected */
    public native String nativeGetString(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetTimestamp(long j, long j2);

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
    public native void nativeSetString(long j, long j2, String str);

    /* access modifiers changed from: protected */
    public native void nativeSetTimestamp(long j, long j2, long j3);

    /* renamed from: y */
    public OsList mo16368y(long j) {
        if (mo16592k().mo16553k(j) == RealmFieldType.LIST) {
            return super.mo16368y(j);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", new Object[]{mo16592k().mo16552j(j)}));
    }
}
