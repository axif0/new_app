package kotlinx.coroutines;

import p351k.C5850j;
import p351k.C5853k;
import p351k.p355t.C5895d;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.w */
public final class C6082w {
    /* renamed from: a */
    public static final String m24816a(Object obj) {
        C5956g.m24501f(obj, "$this$classSimpleName");
        String simpleName = obj.getClass().getSimpleName();
        C5956g.m24497b(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    /* renamed from: b */
    public static final String m24817b(Object obj) {
        C5956g.m24501f(obj, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        C5956g.m24497b(hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    /* renamed from: c */
    public static final String m24818c(C5895d<?> dVar) {
        String str;
        C5956g.m24501f(dVar, "$this$toDebugString");
        if (dVar instanceof C6087y) {
            return dVar.toString();
        }
        try {
            C5850j.C5851a aVar = C5850j.f16880f;
            String str2 = dVar + '@' + m24817b(dVar);
            C5850j.m24363a(str2);
            str = str2;
        } catch (Throwable th) {
            C5850j.C5851a aVar2 = C5850j.f16880f;
            Object a = C5853k.m24367a(th);
            C5850j.m24363a(a);
            str = a;
        }
        Throwable b = C5850j.m24364b(str);
        String str3 = str;
        if (b != null) {
            str3 = dVar.getClass().getName() + '@' + m24817b(dVar);
        }
        return (String) str3;
    }
}
