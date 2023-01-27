package p340io.realm;

import java.util.Date;
import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.i */
final class C5671i extends C5788s<Date> {
    C5671i(C5632b bVar, OsList osList, Class<Date> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16399c((Date) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj != null && !(obj instanceof Date)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.util.Date", obj.getClass().getName()}));
        }
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        this.f16785b.mo16412p((long) i, (Date) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16389B((long) i, (Date) obj);
    }

    /* renamed from: q */
    public Date mo16250e(int i) {
        return (Date) this.f16785b.mo16409m((long) i);
    }
}
