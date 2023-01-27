package p148g.p189d.p190a.p200b.p230r0;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: g.d.a.b.r0.v */
public final class C4283v {
    /* renamed from: a */
    public static void m18224a(String str) {
        if (C4284w.f13659a >= 18) {
            m18225b(str);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m18225b(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: c */
    public static void m18226c() {
        if (C4284w.f13659a >= 18) {
            m18227d();
        }
    }

    @TargetApi(18)
    /* renamed from: d */
    private static void m18227d() {
        Trace.endSection();
    }
}
