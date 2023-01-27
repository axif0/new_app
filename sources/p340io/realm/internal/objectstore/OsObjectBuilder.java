package p340io.realm.internal.objectstore;

import java.io.Closeable;
import java.util.Date;
import java.util.Set;
import p340io.realm.C5751j0;
import p340io.realm.C5763l0;
import p340io.realm.C5781q;
import p340io.realm.internal.C5711h;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.OsSharedRealm;
import p340io.realm.internal.Table;
import p340io.realm.internal.UncheckedRow;

/* renamed from: io.realm.internal.objectstore.OsObjectBuilder */
public class OsObjectBuilder implements Closeable {

    /* renamed from: f */
    private final Table f16530f;

    /* renamed from: g */
    private final long f16531g;

    /* renamed from: h */
    private final long f16532h;

    /* renamed from: i */
    private final long f16533i;

    /* renamed from: j */
    private final C5711h f16534j;

    /* renamed from: k */
    private final boolean f16535k;

    public OsObjectBuilder(Table table, long j, Set<C5781q> set) {
        OsSharedRealm n = table.mo16556n();
        this.f16531g = n.getNativePtr();
        this.f16530f = table;
        this.f16533i = table.getNativePtr();
        this.f16532h = nativeCreateBuilder(j + 1);
        this.f16534j = n.context;
        this.f16535k = set.contains(C5781q.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private static native void nativeAddBoolean(long j, long j2, boolean z);

    private static native void nativeAddDate(long j, long j2, long j3);

    private static native void nativeAddInteger(long j, long j2, long j3);

    private static native void nativeAddNull(long j, long j2);

    private static native void nativeAddObject(long j, long j2, long j3);

    private static native void nativeAddObjectList(long j, long j2, long[] jArr);

    private static native void nativeAddString(long j, long j2, String str);

    private static native long nativeCreateBuilder(long j);

    private static native long nativeCreateOrUpdate(long j, long j2, long j3, boolean z, boolean z2);

    private static native void nativeDestroyBuilder(long j);

    /* renamed from: a */
    public void mo16643a(long j, Boolean bool) {
        long j2 = this.f16532h;
        if (bool == null) {
            nativeAddNull(j2, j);
        } else {
            nativeAddBoolean(j2, j, bool.booleanValue());
        }
    }

    public void close() {
        nativeDestroyBuilder(this.f16532h);
    }

    /* renamed from: h */
    public void mo16645h(long j, Date date) {
        if (date == null) {
            nativeAddNull(this.f16532h, j);
            return;
        }
        nativeAddDate(this.f16532h, j, date.getTime());
    }

    /* renamed from: j */
    public void mo16646j(long j, Byte b) {
        if (b == null) {
            nativeAddNull(this.f16532h, j);
            return;
        }
        nativeAddInteger(this.f16532h, j, (long) b.byteValue());
    }

    /* renamed from: m */
    public void mo16647m(long j, Integer num) {
        if (num == null) {
            nativeAddNull(this.f16532h, j);
            return;
        }
        nativeAddInteger(this.f16532h, j, (long) num.intValue());
    }

    /* renamed from: o */
    public void mo16648o(long j, Long l) {
        if (l == null) {
            nativeAddNull(this.f16532h, j);
            return;
        }
        nativeAddInteger(this.f16532h, j, l.longValue());
    }

    /* renamed from: q */
    public void mo16649q(long j) {
        nativeAddNull(this.f16532h, j);
    }

    /* renamed from: r */
    public void mo16650r(long j, C5763l0 l0Var) {
        if (l0Var == null) {
            nativeAddNull(this.f16532h, j);
            return;
        }
        nativeAddObject(this.f16532h, j, ((UncheckedRow) ((C5720n) l0Var).mo16212L().mo16259f()).getNativePtr());
    }

    /* renamed from: t */
    public <T extends C5763l0> void mo16651t(long j, C5751j0<T> j0Var) {
        int i = 0;
        if (j0Var != null) {
            long[] jArr = new long[j0Var.size()];
            while (i < j0Var.size()) {
                C5720n nVar = (C5720n) j0Var.get(i);
                if (nVar != null) {
                    jArr[i] = ((UncheckedRow) nVar.mo16212L().mo16259f()).getNativePtr();
                    i++;
                } else {
                    throw new IllegalArgumentException("Null values are not allowed in RealmLists containing Realm models");
                }
            }
            nativeAddObjectList(this.f16532h, j, jArr);
            return;
        }
        nativeAddObjectList(this.f16532h, j, new long[0]);
    }

    /* renamed from: u */
    public void mo16652u(long j, String str) {
        long j2 = this.f16532h;
        if (str == null) {
            nativeAddNull(j2, j);
        } else {
            nativeAddString(j2, j, str);
        }
    }

    /* renamed from: w */
    public UncheckedRow mo16653w() {
        try {
            return new UncheckedRow(this.f16534j, this.f16530f, nativeCreateOrUpdate(this.f16531g, this.f16533i, this.f16532h, false, false));
        } finally {
            close();
        }
    }

    /* renamed from: x */
    public void mo16654x() {
        try {
            nativeCreateOrUpdate(this.f16531g, this.f16533i, this.f16532h, true, this.f16535k);
        } finally {
            close();
        }
    }
}
