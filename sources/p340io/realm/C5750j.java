package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.j */
final class C5750j extends C5788s<Double> {
    C5750j(C5632b bVar, OsList osList, Class<Double> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16400d(((Number) obj).doubleValue());
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
        this.f16785b.mo16413q((long) i, ((Number) obj).doubleValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16390C((long) i, ((Number) obj).doubleValue());
    }

    /* renamed from: q */
    public Double mo16250e(int i) {
        return (Double) this.f16785b.mo16409m((long) i);
    }
}
