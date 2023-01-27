package p351k;

import p351k.p361v.p363d.C5956g;

/* renamed from: k.d */
public final class C5844d implements Comparable<C5844d> {

    /* renamed from: j */
    public static final C5844d f16873j = new C5844d(1, 4, 0);

    /* renamed from: f */
    private final int f16874f;

    /* renamed from: g */
    private final int f16875g;

    /* renamed from: h */
    private final int f16876h;

    /* renamed from: i */
    private final int f16877i;

    public C5844d(int i, int i2, int i3) {
        this.f16875g = i;
        this.f16876h = i2;
        this.f16877i = i3;
        this.f16874f = m24355g(i, i2, i3);
    }

    /* renamed from: g */
    private final int m24355g(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: e */
    public int compareTo(C5844d dVar) {
        C5956g.m24500e(dVar, "other");
        return this.f16874f - dVar.f16874f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5844d)) {
            obj = null;
        }
        C5844d dVar = (C5844d) obj;
        return dVar != null && this.f16874f == dVar.f16874f;
    }

    public int hashCode() {
        return this.f16874f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16875g);
        sb.append('.');
        sb.append(this.f16876h);
        sb.append('.');
        sb.append(this.f16877i);
        return sb.toString();
    }
}
