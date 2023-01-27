package p340io.realm;

import java.util.HashMap;
import java.util.Map;
import p340io.realm.internal.C5703b;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.Table;
import p340io.realm.internal.Util;

/* renamed from: io.realm.r0 */
public abstract class C5786r0 {

    /* renamed from: a */
    private final Map<String, Table> f16778a = new HashMap();

    /* renamed from: b */
    private final Map<Class<? extends C5763l0>, Table> f16779b = new HashMap();

    /* renamed from: c */
    private final Map<Class<? extends C5763l0>, C5778p0> f16780c = new HashMap();

    /* renamed from: d */
    private final Map<String, C5778p0> f16781d = new HashMap();

    /* renamed from: e */
    final C5632b f16782e;

    /* renamed from: f */
    private final C5703b f16783f;

    C5786r0(C5632b bVar, C5703b bVar2) {
        this.f16782e = bVar;
        this.f16783f = bVar2;
    }

    /* renamed from: a */
    private void m24182a() {
        if (!mo16778g()) {
            throw new IllegalStateException("Attempt to use column index before set.");
        }
    }

    /* renamed from: h */
    private boolean m24183h(Class<? extends C5763l0> cls, Class<? extends C5763l0> cls2) {
        return cls.equals(cls2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5704c mo16773b(Class<? extends C5763l0> cls) {
        m24182a();
        return this.f16783f.mo16613a(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C5704c mo16774c(String str) {
        m24182a();
        return this.f16783f.mo16614b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5778p0 mo16775d(Class<? extends C5763l0> cls) {
        C5773o oVar = this.f16780c.get(cls);
        if (oVar != null) {
            return oVar;
        }
        Class<? extends C5763l0> b = Util.m23789b(cls);
        if (m24183h(b, cls)) {
            oVar = this.f16780c.get(b);
        }
        if (oVar == null) {
            C5773o oVar2 = new C5773o(this.f16782e, this, mo16776e(cls), mo16773b(b));
            this.f16780c.put(b, oVar2);
            oVar = oVar2;
        }
        if (m24183h(b, cls)) {
            this.f16780c.put(cls, oVar);
        }
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Table mo16776e(Class<? extends C5763l0> cls) {
        Table table = this.f16779b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends C5763l0> b = Util.m23789b(cls);
        if (m24183h(b, cls)) {
            table = this.f16779b.get(b);
        }
        if (table == null) {
            table = this.f16782e.mo16220J().getTable(Table.m23720o(this.f16782e.mo16234x().mo16318n().mo16640g(b)));
            this.f16779b.put(b, table);
        }
        if (m24183h(b, cls)) {
            this.f16779b.put(cls, table);
        }
        return table;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Table mo16777f(String str) {
        String o = Table.m23720o(str);
        Table table = this.f16778a.get(o);
        if (table != null) {
            return table;
        }
        Table table2 = this.f16782e.mo16220J().getTable(o);
        this.f16778a.put(o, table2);
        return table2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo16778g() {
        return this.f16783f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo16779i() {
        C5703b bVar = this.f16783f;
        if (bVar != null) {
            bVar.mo16615c();
        }
        this.f16778a.clear();
        this.f16779b.clear();
        this.f16780c.clear();
        this.f16781d.clear();
    }
}
