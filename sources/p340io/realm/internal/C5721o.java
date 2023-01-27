package p340io.realm.internal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5648d0;
import p340io.realm.C5763l0;
import p340io.realm.C5781q;
import p340io.realm.exceptions.RealmException;

/* renamed from: io.realm.internal.o */
public abstract class C5721o {
    /* renamed from: a */
    protected static void m23891a(Class<? extends C5763l0> cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    /* renamed from: e */
    protected static RealmException m23892e(Class<? extends C5763l0> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{cls.toString()}));
    }

    /* renamed from: b */
    public abstract <E extends C5763l0> E mo16144b(C5648d0 d0Var, E e, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set);

    /* renamed from: c */
    public abstract C5704c mo16145c(Class<? extends C5763l0> cls, OsSchemaInfo osSchemaInfo);

    /* renamed from: d */
    public abstract Map<Class<? extends C5763l0>, OsObjectSchemaInfo> mo16146d();

    public boolean equals(Object obj) {
        if (!(obj instanceof C5721o)) {
            return false;
        }
        return mo16147f().equals(((C5721o) obj).mo16147f());
    }

    /* renamed from: f */
    public abstract Set<Class<? extends C5763l0>> mo16147f();

    /* renamed from: g */
    public final String mo16640g(Class<? extends C5763l0> cls) {
        return mo16148h(Util.m23789b(cls));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo16148h(Class<? extends C5763l0> cls);

    public int hashCode() {
        return mo16147f().hashCode();
    }

    /* renamed from: i */
    public abstract <E extends C5763l0> E mo16149i(Class<E> cls, Object obj, C5722p pVar, C5704c cVar, boolean z, List<String> list);

    /* renamed from: j */
    public boolean mo16150j() {
        return false;
    }
}
