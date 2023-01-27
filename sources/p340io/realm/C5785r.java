package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.r */
final class C5785r<T> extends C5788s<T> {
    C5785r(C5632b bVar, OsList osList, Class<T> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16404h(((Number) obj).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", obj.getClass().getName()}));
        }
    }

    /* renamed from: e */
    public T mo16250e(int i) {
        Object valueOf;
        T t = (Long) this.f16785b.mo16409m((long) i);
        if (t == null) {
            return null;
        }
        Class<T> cls = this.f16786c;
        if (cls == Long.class) {
            return t;
        }
        if (cls == Integer.class) {
            valueOf = Integer.valueOf(t.intValue());
        } else if (cls == Short.class) {
            valueOf = Short.valueOf(t.shortValue());
        } else if (cls == Byte.class) {
            valueOf = Byte.valueOf(t.byteValue());
        } else {
            throw new IllegalStateException("Unexpected element type: " + this.f16786c.getName());
        }
        return cls.cast(valueOf);
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        this.f16785b.mo16415s((long) i, ((Number) obj).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16392E((long) i, ((Number) obj).longValue());
    }
}
