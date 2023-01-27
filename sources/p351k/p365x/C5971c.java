package p351k.p365x;

/* renamed from: k.x.c */
public final class C5971c extends C5968a {
    static {
        new C5971c(1, 0);
    }

    public C5971c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5971c) {
            if (!isEmpty() || !((C5971c) obj).isEmpty()) {
                C5971c cVar = (C5971c) obj;
                if (!(mo17019c() == cVar.mo17019c() && mo17020d() == cVar.mo17020d())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo17019c() * 31) + mo17020d();
    }

    public boolean isEmpty() {
        return mo17019c() > mo17020d();
    }

    public String toString() {
        return mo17019c() + ".." + mo17020d();
    }
}
