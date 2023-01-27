package p340io.realm.internal;

import java.util.Date;
import p340io.realm.RealmFieldType;

/* renamed from: io.realm.internal.Table */
public class Table implements C5712i {

    /* renamed from: i */
    private static final String f16469i;

    /* renamed from: j */
    private static final long f16470j = nativeGetFinalizerPtr();

    /* renamed from: f */
    private final long f16471f;

    /* renamed from: g */
    private final C5711h f16472g;

    /* renamed from: h */
    private final OsSharedRealm f16473h;

    static {
        String d = Util.m23791d();
        f16469i = d;
        d.length();
    }

    Table(OsSharedRealm osSharedRealm, long j) {
        C5711h hVar = osSharedRealm.context;
        this.f16472g = hVar;
        this.f16473h = osSharedRealm;
        this.f16471f = j;
        hVar.mo16628a(this);
    }

    /* renamed from: A */
    private static void m23718A() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    /* renamed from: g */
    public static String m23719g(String str) {
        if (str == null) {
            return null;
        }
        return !str.startsWith(f16469i) ? str : str.substring(f16469i.length());
    }

    private native void nativeClear(long j, boolean z);

    public static native long nativeFindFirstInt(long j, long j2, long j3);

    public static native long nativeFindFirstString(long j, long j2, String str);

    private native long nativeGetColumnCount(long j);

    private native long nativeGetColumnIndex(long j, String str);

    private native String nativeGetColumnName(long j, long j2);

    private native int nativeGetColumnType(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private native long nativeGetLinkTarget(long j, long j2);

    private native String nativeGetName(long j);

    private static native void nativeMigratePrimaryKeyTableIfNeeded(long j);

    public static native void nativeSetBoolean(long j, long j2, long j3, boolean z, boolean z2);

    public static native void nativeSetLink(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetLong(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetNull(long j, long j2, long j3, boolean z);

    public static native void nativeSetString(long j, long j2, long j3, String str, boolean z);

    public static native void nativeSetTimestamp(long j, long j2, long j3, long j4, boolean z);

    private native long nativeSize(long j);

    private native long nativeWhere(long j);

    /* renamed from: o */
    public static String m23720o(String str) {
        if (str == null) {
            return null;
        }
        return f16469i + str;
    }

    /* renamed from: s */
    public static void m23721s(OsSharedRealm osSharedRealm) {
        nativeMigratePrimaryKeyTableIfNeeded(osSharedRealm.getNativePtr());
    }

    /* renamed from: B */
    public TableQuery mo16543B() {
        return new TableQuery(this.f16472g, this, nativeWhere(this.f16471f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16544a() {
        if (mo16560r()) {
            m23718A();
            throw null;
        }
    }

    /* renamed from: b */
    public void mo16545b(boolean z) {
        mo16544a();
        nativeClear(this.f16471f, z);
    }

    /* renamed from: c */
    public long mo16546c(long j, long j2) {
        return nativeFindFirstInt(this.f16471f, j, j2);
    }

    /* renamed from: d */
    public long mo16547d(long j, String str) {
        if (str != null) {
            return nativeFindFirstString(this.f16471f, j, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    /* renamed from: e */
    public CheckedRow mo16548e(long j) {
        return CheckedRow.m23595d(this.f16472g, this, j);
    }

    /* renamed from: f */
    public String mo16549f() {
        return m23719g(mo16555m());
    }

    public long getNativeFinalizerPtr() {
        return f16470j;
    }

    public long getNativePtr() {
        return this.f16471f;
    }

    /* renamed from: h */
    public long mo16550h() {
        return nativeGetColumnCount(this.f16471f);
    }

    /* renamed from: i */
    public long mo16551i(String str) {
        if (str != null) {
            return nativeGetColumnIndex(this.f16471f, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    /* renamed from: j */
    public String mo16552j(long j) {
        return nativeGetColumnName(this.f16471f, j);
    }

    /* renamed from: k */
    public RealmFieldType mo16553k(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f16471f, j));
    }

    /* renamed from: l */
    public Table mo16554l(long j) {
        return new Table(this.f16473h, nativeGetLinkTarget(this.f16471f, j));
    }

    /* renamed from: m */
    public String mo16555m() {
        return nativeGetName(this.f16471f);
    }

    /* renamed from: n */
    public OsSharedRealm mo16556n() {
        return this.f16473h;
    }

    /* access modifiers changed from: package-private */
    public native long nativeGetRowPtr(long j, long j2);

    /* renamed from: p */
    public UncheckedRow mo16558p(long j) {
        return UncheckedRow.m23759a(this.f16472g, this, j);
    }

    /* renamed from: q */
    public UncheckedRow mo16559q(long j) {
        return UncheckedRow.m23760b(this.f16472g, this, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo16560r() {
        OsSharedRealm osSharedRealm = this.f16473h;
        return osSharedRealm != null && !osSharedRealm.isInTransaction();
    }

    /* renamed from: t */
    public void mo16561t(long j, long j2, boolean z, boolean z2) {
        mo16544a();
        nativeSetBoolean(this.f16471f, j, j2, z, z2);
    }

    public String toString() {
        long h = mo16550h();
        String m = mo16555m();
        StringBuilder sb = new StringBuilder("The Table ");
        if (m != null && !m.isEmpty()) {
            sb.append(mo16555m());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(h);
        sb.append(" columns: ");
        int i = 0;
        while (true) {
            long j = (long) i;
            if (j < h) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(mo16552j(j));
                i++;
            } else {
                sb.append(".");
                sb.append(" And ");
                sb.append(mo16568z());
                sb.append(" rows.");
                return sb.toString();
            }
        }
    }

    /* renamed from: u */
    public void mo16563u(long j, long j2, Date date, boolean z) {
        if (date != null) {
            mo16544a();
            nativeSetTimestamp(this.f16471f, j, j2, date.getTime(), z);
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    /* renamed from: v */
    public void mo16564v(long j, long j2, long j3, boolean z) {
        mo16544a();
        nativeSetLink(this.f16471f, j, j2, j3, z);
    }

    /* renamed from: w */
    public void mo16565w(long j, long j2, long j3, boolean z) {
        mo16544a();
        nativeSetLong(this.f16471f, j, j2, j3, z);
    }

    /* renamed from: x */
    public void mo16566x(long j, long j2, boolean z) {
        mo16544a();
        nativeSetNull(this.f16471f, j, j2, z);
    }

    /* renamed from: y */
    public void mo16567y(long j, long j2, String str, boolean z) {
        mo16544a();
        long j3 = this.f16471f;
        long j4 = j;
        long j5 = j2;
        if (str == null) {
            nativeSetNull(j3, j4, j5, z);
        } else {
            nativeSetString(j3, j4, j5, str, z);
        }
    }

    /* renamed from: z */
    public long mo16568z() {
        return nativeSize(this.f16471f);
    }
}
