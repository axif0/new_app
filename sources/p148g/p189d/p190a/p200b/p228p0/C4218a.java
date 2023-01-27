package p148g.p189d.p190a.p200b.p228p0;

import java.util.Arrays;
import java.util.Comparator;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p217n0.C4145m;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.p0.a */
public abstract class C4218a implements C4229e {

    /* renamed from: a */
    protected final C4145m f13488a;

    /* renamed from: b */
    protected final int f13489b;

    /* renamed from: c */
    protected final int[] f13490c;

    /* renamed from: d */
    private final C4109n[] f13491d;

    /* renamed from: e */
    private int f13492e;

    /* renamed from: g.d.a.b.p0.a$b */
    private static final class C4220b implements Comparator<C4109n> {
        private C4220b() {
        }

        /* renamed from: a */
        public int compare(C4109n nVar, C4109n nVar2) {
            return nVar2.f12945g - nVar.f12945g;
        }
    }

    public C4218a(C4145m mVar, int... iArr) {
        int i = 0;
        C4260a.m18074f(iArr.length > 0);
        C4260a.m18073e(mVar);
        this.f13488a = mVar;
        int length = iArr.length;
        this.f13489b = length;
        this.f13491d = new C4109n[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f13491d[i2] = mVar.mo13173a(iArr[i2]);
        }
        Arrays.sort(this.f13491d, new C4220b());
        this.f13490c = new int[this.f13489b];
        while (true) {
            int i3 = this.f13489b;
            if (i < i3) {
                this.f13490c[i] = mVar.mo13174b(this.f13491d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final C4109n mo13326a(int i) {
        return this.f13491d[i];
    }

    /* renamed from: b */
    public void mo13327b() {
    }

    /* renamed from: c */
    public final int mo13328c(int i) {
        return this.f13490c[i];
    }

    /* renamed from: d */
    public final C4145m mo13329d() {
        return this.f13488a;
    }

    /* renamed from: e */
    public final C4109n mo13330e() {
        return this.f13491d[mo13351g()];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4218a aVar = (C4218a) obj;
        return this.f13488a == aVar.f13488a && Arrays.equals(this.f13490c, aVar.f13490c);
    }

    /* renamed from: f */
    public void mo13332f() {
    }

    /* renamed from: h */
    public void mo13333h(float f) {
    }

    public int hashCode() {
        if (this.f13492e == 0) {
            this.f13492e = (System.identityHashCode(this.f13488a) * 31) + Arrays.hashCode(this.f13490c);
        }
        return this.f13492e;
    }

    public final int length() {
        return this.f13490c.length;
    }
}
