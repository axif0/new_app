package p340io.realm;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.Table;
import p340io.realm.internal.p341s.C5730c;

/* renamed from: io.realm.p0 */
public abstract class C5778p0 {

    /* renamed from: a */
    final C5786r0 f16765a;

    /* renamed from: b */
    final C5632b f16766b;

    /* renamed from: c */
    final Table f16767c;

    /* renamed from: d */
    private final C5704c f16768d;

    /* renamed from: io.realm.p0$a */
    static final class C5779a {
        C5779a(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z) {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(String.class, new C5779a(RealmFieldType.STRING, RealmFieldType.STRING_LIST, true));
        hashMap.put(Short.TYPE, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Short.class, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(Integer.TYPE, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Integer.class, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(Long.TYPE, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Long.class, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(Float.TYPE, new C5779a(RealmFieldType.FLOAT, RealmFieldType.FLOAT_LIST, false));
        hashMap.put(Float.class, new C5779a(RealmFieldType.FLOAT, RealmFieldType.FLOAT_LIST, true));
        hashMap.put(Double.TYPE, new C5779a(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_LIST, false));
        hashMap.put(Double.class, new C5779a(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_LIST, true));
        hashMap.put(Boolean.TYPE, new C5779a(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_LIST, false));
        hashMap.put(Boolean.class, new C5779a(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_LIST, true));
        hashMap.put(Byte.TYPE, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Byte.class, new C5779a(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(byte[].class, new C5779a(RealmFieldType.BINARY, RealmFieldType.BINARY_LIST, true));
        hashMap.put(Date.class, new C5779a(RealmFieldType.DATE, RealmFieldType.DATE_LIST, true));
        Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C5771n0.class, new C5779a(RealmFieldType.OBJECT, (RealmFieldType) null, false));
        hashMap2.put(C5751j0.class, new C5779a(RealmFieldType.LIST, (RealmFieldType) null, false));
        Collections.unmodifiableMap(hashMap2);
    }

    C5778p0(C5632b bVar, C5786r0 r0Var, Table table, C5704c cVar) {
        this.f16765a = r0Var;
        this.f16766b = bVar;
        this.f16767c = table;
        this.f16768d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo16760a(String str) {
        long f = this.f16768d.mo16621f(str);
        if (f >= 0) {
            return f;
        }
        throw new IllegalArgumentException("Field does not exist: " + str);
    }

    /* renamed from: b */
    public String mo16761b() {
        return this.f16767c.mo16549f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C5730c mo16752c(String str, RealmFieldType... realmFieldTypeArr);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C5789s0 mo16762d() {
        return new C5789s0(this.f16765a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Table mo16763e() {
        return this.f16767c;
    }
}
