package p351k.p354s;

/* renamed from: k.s.b */
class C5888b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m24422a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
