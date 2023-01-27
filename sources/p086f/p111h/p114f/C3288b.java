package p086f.p111h.p114f;

import android.graphics.Insets;

/* renamed from: f.h.f.b */
public final class C3288b {

    /* renamed from: e */
    public static final C3288b f10517e = new C3288b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f10518a;

    /* renamed from: b */
    public final int f10519b;

    /* renamed from: c */
    public final int f10520c;

    /* renamed from: d */
    public final int f10521d;

    private C3288b(int i, int i2, int i3, int i4) {
        this.f10518a = i;
        this.f10519b = i2;
        this.f10520c = i3;
        this.f10521d = i4;
    }

    /* renamed from: a */
    public static C3288b m14163a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f10517e : new C3288b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C3288b m14164b(Insets insets) {
        return m14163a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets mo11444c() {
        return Insets.of(this.f10518a, this.f10519b, this.f10520c, this.f10521d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3288b.class != obj.getClass()) {
            return false;
        }
        C3288b bVar = (C3288b) obj;
        return this.f10521d == bVar.f10521d && this.f10518a == bVar.f10518a && this.f10520c == bVar.f10520c && this.f10519b == bVar.f10519b;
    }

    public int hashCode() {
        return (((((this.f10518a * 31) + this.f10519b) * 31) + this.f10520c) * 31) + this.f10521d;
    }

    public String toString() {
        return "Insets{left=" + this.f10518a + ", top=" + this.f10519b + ", right=" + this.f10520c + ", bottom=" + this.f10521d + '}';
    }
}
