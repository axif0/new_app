package p374m.p375g0.p378g;

/* renamed from: m.g0.g.f */
public final class C6164f {
    /* renamed from: a */
    public static boolean m25206a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m25207b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m25208c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m25209d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m25210e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
