package p086f.p111h.p122m;

/* renamed from: f.h.m.c */
public final class C3366c {

    /* renamed from: a */
    private final Object f10663a;

    private C3366c(Object obj) {
        this.f10663a = obj;
    }

    /* renamed from: a */
    static C3366c m14436a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C3366c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3366c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f10663a;
        Object obj3 = ((C3366c) obj).f10663a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f10663a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f10663a + "}";
    }
}
