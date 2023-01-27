package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.z4 */
public final class C4893z4 extends C4486c5 {
    /* renamed from: a */
    public static int m20784a(int i, int i2, int i3) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(C4484c3.m18946b("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }
}
