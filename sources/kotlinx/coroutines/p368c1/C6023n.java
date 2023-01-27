package kotlinx.coroutines.p368c1;

import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.c1.n */
final /* synthetic */ class C6023n {
    static {
        Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: a */
    public static final String m24645a(String str) {
        C5956g.m24501f(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
