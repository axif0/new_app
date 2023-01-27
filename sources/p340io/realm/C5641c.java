package p340io.realm;

import java.util.Locale;
import p340io.realm.internal.OsList;

/* renamed from: io.realm.c */
final class C5641c extends C5788s<byte[]> {
    C5641c(C5632b bVar, OsList osList, Class<byte[]> cls) {
        super(bVar, osList, cls);
    }

    /* renamed from: c */
    public void mo16248c(Object obj) {
        this.f16785b.mo16397a((byte[]) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16249d(Object obj) {
        if (obj != null && !(obj instanceof byte[])) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"byte[]", obj.getClass().getName()}));
        }
    }

    /* renamed from: i */
    public void mo16251i(int i, Object obj) {
        this.f16785b.mo16410n((long) i, (byte[]) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16252o(int i, Object obj) {
        this.f16785b.mo16422z((long) i, (byte[]) obj);
    }

    /* renamed from: q */
    public byte[] mo16250e(int i) {
        return (byte[]) this.f16785b.mo16409m((long) i);
    }
}
