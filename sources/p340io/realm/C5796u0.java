package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.u0 */
final class C5796u0 extends C5788s<String> {
    C5796u0(C5632b bVar, OsList osList, Class<String> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16407k((String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.String", obj.getClass().getName()}));
        }
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        this.f16785b.mo16418v((long) i, (String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16395H((long) i, (String) obj);
    }

    /* renamed from: q */
    public String mo16250e(int i) {
        return (String) this.f16785b.mo16409m((long) i);
    }
}
