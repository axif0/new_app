package p340io.realm.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p340io.realm.C5763l0;
import p340io.realm.exceptions.RealmException;

/* renamed from: io.realm.internal.b */
public final class C5703b {

    /* renamed from: a */
    private final Map<Class<? extends C5763l0>, C5704c> f16493a = new HashMap();

    /* renamed from: b */
    private final Map<String, C5704c> f16494b = new HashMap();

    /* renamed from: c */
    private final C5721o f16495c;

    /* renamed from: d */
    private final OsSchemaInfo f16496d;

    public C5703b(C5721o oVar, OsSchemaInfo osSchemaInfo) {
        this.f16495c = oVar;
        this.f16496d = osSchemaInfo;
    }

    /* renamed from: a */
    public C5704c mo16613a(Class<? extends C5763l0> cls) {
        C5704c cVar = this.f16493a.get(cls);
        if (cVar != null) {
            return cVar;
        }
        C5704c c = this.f16495c.mo16145c(cls, this.f16496d);
        this.f16493a.put(cls, c);
        return c;
    }

    /* renamed from: b */
    public C5704c mo16614b(String str) {
        C5704c cVar = this.f16494b.get(str);
        if (cVar == null) {
            Iterator<Class<? extends C5763l0>> it = this.f16495c.mo16147f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class next = it.next();
                if (this.f16495c.mo16640g(next).equals(str)) {
                    cVar = mo16613a(next);
                    this.f16494b.put(str, cVar);
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", new Object[]{str}));
    }

    /* renamed from: c */
    public void mo16615c() {
        for (Map.Entry next : this.f16493a.entrySet()) {
            ((C5704c) next.getValue()).mo16619d(this.f16495c.mo16145c((Class) next.getKey(), this.f16496d));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnIndices[");
        boolean z = false;
        for (Map.Entry next : this.f16493a.entrySet()) {
            if (z) {
                sb.append(",");
            }
            sb.append(((Class) next.getKey()).getSimpleName());
            sb.append("->");
            sb.append(next.getValue());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }
}
