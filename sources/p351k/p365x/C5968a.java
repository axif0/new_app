package p351k.p365x;

import p351k.p353r.C5882v;
import p351k.p359u.C5922c;

/* renamed from: k.x.a */
public class C5968a implements Iterable<Integer> {

    /* renamed from: i */
    public static final C5969a f16931i = new C5969a((C5954e) null);

    /* renamed from: f */
    private final int f16932f;

    /* renamed from: g */
    private final int f16933g;

    /* renamed from: h */
    private final int f16934h;

    /* renamed from: k.x.a$a */
    public static final class C5969a {
        private C5969a() {
        }

        public /* synthetic */ C5969a(C5954e eVar) {
            this();
        }

        /* renamed from: a */
        public final C5968a mo17028a(int i, int i2, int i3) {
            return new C5968a(i, i2, i3);
        }
    }

    public C5968a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f16932f = i;
            this.f16933g = C5922c.m24476b(i, i2, i3);
            this.f16934h = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: c */
    public final int mo17019c() {
        return this.f16932f;
    }

    /* renamed from: d */
    public final int mo17020d() {
        return this.f16933g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5968a) {
            if (!isEmpty() || !((C5968a) obj).isEmpty()) {
                C5968a aVar = (C5968a) obj;
                if (!(this.f16932f == aVar.f16932f && this.f16933g == aVar.f16933g && this.f16934h == aVar.f16934h)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo17022f() {
        return this.f16934h;
    }

    /* renamed from: h */
    public C5882v iterator() {
        return new C5970b(this.f16932f, this.f16933g, this.f16934h);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f16932f * 31) + this.f16933g) * 31) + this.f16934h;
    }

    public boolean isEmpty() {
        if (this.f16934h > 0) {
            if (this.f16932f > this.f16933g) {
                return true;
            }
        } else if (this.f16932f < this.f16933g) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f16934h > 0) {
            sb = new StringBuilder();
            sb.append(this.f16932f);
            sb.append("..");
            sb.append(this.f16933g);
            sb.append(" step ");
            i = this.f16934h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f16932f);
            sb.append(" downTo ");
            sb.append(this.f16933g);
            sb.append(" step ");
            i = -this.f16934h;
        }
        sb.append(i);
        return sb.toString();
    }
}
