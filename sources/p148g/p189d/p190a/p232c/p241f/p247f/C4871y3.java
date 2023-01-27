package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.y3 */
final class C4871y3 {
    /* renamed from: a */
    static int m20621a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m20622b(@NullableDecl Object obj) {
        return m20621a(obj == null ? 0 : obj.hashCode());
    }
}
