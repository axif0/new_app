package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.d */
final class C5647d extends C5788s<Boolean> {
    C5647d(C5632b bVar, OsList osList, Class<Boolean> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16398b(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj != null && !(obj instanceof Boolean)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Boolean", obj.getClass().getName()}));
        }
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        this.f16785b.mo16411o((long) i, ((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16388A((long) i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: q */
    public Boolean mo16250e(int i) {
        return (Boolean) this.f16785b.mo16409m((long) i);
    }
}
