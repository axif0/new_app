package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.n */
final class C5770n extends C5788s<Float> {
    C5770n(C5632b bVar, OsList osList, Class<Float> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16401e(((Number) obj).floatValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Number", obj.getClass().getName()}));
        }
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        this.f16785b.mo16414r((long) i, ((Number) obj).floatValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16391D((long) i, ((Number) obj).floatValue());
    }

    /* renamed from: q */
    public Float mo16250e(int i) {
        return (Float) this.f16785b.mo16409m((long) i);
    }
}
