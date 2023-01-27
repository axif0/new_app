package kotlinx.coroutines;

import p351k.C5850j;
import p351k.C5853k;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.j */
public final class C6051j {
    /* renamed from: a */
    public static final <T> Object m24752a(Object obj) {
        if (C5850j.m24366d(obj)) {
            C5853k.m24368b(obj);
            return obj;
        }
        Throwable b = C5850j.m24364b(obj);
        if (b != null) {
            return new C6049i(b, false, 2, (C5954e) null);
        }
        C5956g.m24506k();
        throw null;
    }
}
