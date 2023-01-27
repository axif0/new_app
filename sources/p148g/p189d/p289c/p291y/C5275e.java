package p148g.p189d.p289c.p291y;

/* renamed from: g.d.c.y.e */
public final class C5275e {

    /* renamed from: a */
    private static final int f15342a = m21916a();

    /* renamed from: a */
    private static int m21916a() {
        return m21919d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m21917b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m21918c() {
        return f15342a;
    }

    /* renamed from: d */
    static int m21919d(String str) {
        int f = m21921f(str);
        if (f == -1) {
            f = m21917b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m21920e() {
        return f15342a >= 9;
    }

    /* renamed from: f */
    private static int m21921f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
