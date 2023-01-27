package p351k.p353r;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.t */
final class C5880t implements Map, Serializable {

    /* renamed from: f */
    public static final C5880t f16889f = new C5880t();

    private C5880t() {
    }

    /* renamed from: a */
    public boolean mo16913a(Void voidR) {
        C5956g.m24500e(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void mo16914b(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> mo16915c() {
        return C5881u.f16890f;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo16913a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set<Object> mo16919d() {
        return C5881u.f16890f;
    }

    /* renamed from: e */
    public int mo16920e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo16915c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection mo16923f() {
        return C5879s.f16888f;
    }

    public final /* bridge */ Object get(Object obj) {
        return mo16914b(obj);
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo16919d();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo16920e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo16923f();
    }
}
