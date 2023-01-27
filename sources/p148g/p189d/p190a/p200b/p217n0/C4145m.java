package p148g.p189d.p190a.p200b.p217n0;

import java.util.Arrays;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.n0.m */
public final class C4145m {

    /* renamed from: a */
    public final int f13156a;

    /* renamed from: b */
    private final C4109n[] f13157b;

    /* renamed from: c */
    private int f13158c;

    public C4145m(C4109n... nVarArr) {
        C4260a.m18074f(nVarArr.length > 0);
        this.f13157b = nVarArr;
        this.f13156a = nVarArr.length;
    }

    /* renamed from: a */
    public C4109n mo13173a(int i) {
        return this.f13157b[i];
    }

    /* renamed from: b */
    public int mo13174b(C4109n nVar) {
        int i = 0;
        while (true) {
            C4109n[] nVarArr = this.f13157b;
            if (i >= nVarArr.length) {
                return -1;
            }
            if (nVar == nVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4145m.class != obj.getClass()) {
            return false;
        }
        C4145m mVar = (C4145m) obj;
        return this.f13156a == mVar.f13156a && Arrays.equals(this.f13157b, mVar.f13157b);
    }

    public int hashCode() {
        if (this.f13158c == 0) {
            this.f13158c = 527 + Arrays.hashCode(this.f13157b);
        }
        return this.f13158c;
    }
}
