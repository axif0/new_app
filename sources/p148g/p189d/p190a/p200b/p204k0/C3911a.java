package p148g.p189d.p190a.p200b.p204k0;

import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.a */
public final class C3911a implements C3923l {

    /* renamed from: a */
    public final int f11873a;

    /* renamed from: b */
    public final long[] f11874b;

    /* renamed from: c */
    public final long[] f11875c;

    /* renamed from: d */
    private final long f11876d;

    public C3911a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11874b = jArr;
        this.f11875c = jArr3;
        int length = iArr.length;
        this.f11873a = length;
        if (length > 0) {
            this.f11876d = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11876d = 0;
        }
    }

    /* renamed from: a */
    public int mo12715a(long j) {
        return C4284w.m18238d(this.f11875c, j, true, true);
    }

    /* renamed from: e */
    public boolean mo12716e() {
        return true;
    }

    /* renamed from: g */
    public C3923l.C3924a mo12717g(long j) {
        int a = mo12715a(j);
        C3926m mVar = new C3926m(this.f11875c[a], this.f11874b[a]);
        if (mVar.f11915a >= j || a == this.f11873a - 1) {
            return new C3923l.C3924a(mVar);
        }
        int i = a + 1;
        return new C3923l.C3924a(mVar, new C3926m(this.f11875c[i], this.f11874b[i]));
    }

    /* renamed from: i */
    public long mo12718i() {
        return this.f11876d;
    }
}
