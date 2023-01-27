package p148g.p189d.p190a.p200b.p217n0;

import java.util.Arrays;

/* renamed from: g.d.a.b.n0.n */
public final class C4146n {

    /* renamed from: d */
    public static final C4146n f13159d = new C4146n(new C4145m[0]);

    /* renamed from: a */
    public final int f13160a;

    /* renamed from: b */
    private final C4145m[] f13161b;

    /* renamed from: c */
    private int f13162c;

    public C4146n(C4145m... mVarArr) {
        this.f13161b = mVarArr;
        this.f13160a = mVarArr.length;
    }

    /* renamed from: a */
    public C4145m mo13177a(int i) {
        return this.f13161b[i];
    }

    /* renamed from: b */
    public int mo13178b(C4145m mVar) {
        for (int i = 0; i < this.f13160a; i++) {
            if (this.f13161b[i] == mVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4146n.class != obj.getClass()) {
            return false;
        }
        C4146n nVar = (C4146n) obj;
        return this.f13160a == nVar.f13160a && Arrays.equals(this.f13161b, nVar.f13161b);
    }

    public int hashCode() {
        if (this.f13162c == 0) {
            this.f13162c = Arrays.hashCode(this.f13161b);
        }
        return this.f13162c;
    }
}
