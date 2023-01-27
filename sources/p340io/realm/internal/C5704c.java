package p340io.realm.internal;

import java.util.HashMap;
import java.util.Map;
import p340io.realm.RealmFieldType;

/* renamed from: io.realm.internal.c */
public abstract class C5704c {

    /* renamed from: a */
    private final Map<String, C5706b> f16497a;

    /* renamed from: b */
    private final Map<String, C5706b> f16498b;

    /* renamed from: c */
    private final Map<String, String> f16499c;

    /* renamed from: d */
    private final boolean f16500d;

    /* renamed from: io.realm.internal.c$b */
    public static final class C5706b {

        /* renamed from: a */
        public final long f16501a;

        /* renamed from: b */
        public final RealmFieldType f16502b;

        /* renamed from: c */
        public final String f16503c;

        private C5706b(long j, RealmFieldType realmFieldType, String str) {
            this.f16501a = j;
            this.f16502b = realmFieldType;
            this.f16503c = str;
        }

        C5706b(Property property) {
            this(property.mo16515c(), property.mo16517e(), property.mo16516d());
        }

        public String toString() {
            return "ColumnDetails[" + this.f16501a + ", " + this.f16502b + ", " + this.f16503c + "]";
        }
    }

    protected C5704c(int i) {
        this(i, true);
    }

    private C5704c(int i, boolean z) {
        this.f16497a = new HashMap(i);
        this.f16498b = new HashMap(i);
        this.f16499c = new HashMap(i);
        this.f16500d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16617a(OsSchemaInfo osSchemaInfo, String str, String str2, String str3) {
        this.f16497a.put(str, new C5706b(osSchemaInfo.mo16474b(str2).mo16431e(str3).mo16515c(), RealmFieldType.LINKING_OBJECTS, str2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16618b(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property e = osObjectSchemaInfo.mo16431e(str2);
        C5706b bVar = new C5706b(e);
        this.f16497a.put(str, bVar);
        this.f16498b.put(str2, bVar);
        this.f16499c.put(str, str2);
        return e.mo16515c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo16217c(C5704c cVar, C5704c cVar2);

    /* renamed from: d */
    public void mo16619d(C5704c cVar) {
        if (!this.f16500d) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        } else if (cVar != null) {
            this.f16497a.clear();
            this.f16497a.putAll(cVar.f16497a);
            this.f16498b.clear();
            this.f16498b.putAll(cVar.f16498b);
            this.f16499c.clear();
            this.f16499c.putAll(cVar.f16499c);
            mo16217c(cVar, this);
        } else {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
    }

    /* renamed from: e */
    public C5706b mo16620e(String str) {
        return this.f16497a.get(str);
    }

    /* renamed from: f */
    public long mo16621f(String str) {
        C5706b bVar = this.f16497a.get(str);
        if (bVar == null) {
            return -1;
        }
        return bVar.f16501a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.f16500d);
        sb.append(",");
        boolean z = false;
        if (this.f16497a != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry next : this.f16497a.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append((String) next.getKey());
                sb.append("->");
                sb.append(next.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.f16498b != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry next2 : this.f16498b.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append((String) next2.getKey());
                sb.append("->");
                sb.append(next2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }
}
