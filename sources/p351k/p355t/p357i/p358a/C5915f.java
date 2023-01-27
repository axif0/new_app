package p351k.p355t.p357i.p358a;

import java.lang.reflect.Field;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.i.a.f */
public final class C5915f {
    /* renamed from: a */
    private static final void m24465a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C5914e m24466b(C5910a aVar) {
        return (C5914e) aVar.getClass().getAnnotation(C5914e.class);
    }

    /* renamed from: c */
    private static final int m24467c(C5910a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C5956g.m24499d(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m24468d(C5910a aVar) {
        String str;
        C5956g.m24500e(aVar, "$this$getStackTraceElementImpl");
        C5914e b = m24466b(aVar);
        if (b == null) {
            return null;
        }
        m24465a(1, b.mo16986v());
        int c = m24467c(aVar);
        int i = c < 0 ? -1 : b.mo16984l()[c];
        String b2 = C5917h.f16908c.mo16987b(aVar);
        if (b2 == null) {
            str = b.mo16982c();
        } else {
            str = b2 + '/' + b.mo16982c();
        }
        return new StackTraceElement(str, b.mo16985m(), b.mo16983f(), i);
    }
}
