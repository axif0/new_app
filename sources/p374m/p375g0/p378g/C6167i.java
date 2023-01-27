package p374m.p375g0.p378g;

import java.net.Proxy;
import p374m.C6099a0;
import p374m.C6257t;

/* renamed from: m.g0.g.i */
public final class C6167i {
    /* renamed from: a */
    public static String m25224a(C6099a0 a0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(a0Var.mo17218g());
        sb.append(' ');
        boolean b = m25225b(a0Var, type);
        C6257t j = a0Var.mo17221j();
        if (b) {
            sb.append(j);
        } else {
            sb.append(m25226c(j));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m25225b(C6099a0 a0Var, Proxy.Type type) {
        return !a0Var.mo17217f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m25226c(C6257t tVar) {
        String h = tVar.mo17704h();
        String j = tVar.mo17707j();
        if (j == null) {
            return h;
        }
        return h + '?' + j;
    }
}
