package p086f.p103f.p107b.p108k.p109m;

import java.util.ArrayList;
import p086f.p103f.p107b.p108k.C3232f;

/* renamed from: f.f.b.k.m.k */
class C3254k {

    /* renamed from: d */
    public static int f10470d;

    /* renamed from: a */
    public boolean f10471a;

    /* renamed from: b */
    C3257m f10472b = null;

    /* renamed from: c */
    ArrayList<C3257m> f10473c = new ArrayList<>();

    public C3254k(C3257m mVar, int i) {
        f10470d++;
        this.f10472b = mVar;
    }

    /* renamed from: c */
    private long m14045c(C3247f fVar, long j) {
        C3257m mVar = fVar.f10449d;
        if (mVar instanceof C3251i) {
            return j;
        }
        int size = fVar.f10456k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3245d dVar = fVar.f10456k.get(i);
            if (dVar instanceof C3247f) {
                C3247f fVar2 = (C3247f) dVar;
                if (fVar2.f10449d != mVar) {
                    j2 = Math.min(j2, m14045c(fVar2, ((long) fVar2.f10451f) + j));
                }
            }
        }
        if (fVar != mVar.f10485i) {
            return j2;
        }
        long j3 = j - mVar.mo11392j();
        return Math.min(Math.min(j2, m14045c(mVar.f10484h, j3)), j3 - ((long) mVar.f10484h.f10451f));
    }

    /* renamed from: d */
    private long m14046d(C3247f fVar, long j) {
        C3257m mVar = fVar.f10449d;
        if (mVar instanceof C3251i) {
            return j;
        }
        int size = fVar.f10456k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3245d dVar = fVar.f10456k.get(i);
            if (dVar instanceof C3247f) {
                C3247f fVar2 = (C3247f) dVar;
                if (fVar2.f10449d != mVar) {
                    j2 = Math.max(j2, m14046d(fVar2, ((long) fVar2.f10451f) + j));
                }
            }
        }
        if (fVar != mVar.f10484h) {
            return j2;
        }
        long j3 = j + mVar.mo11392j();
        return Math.max(Math.max(j2, m14046d(mVar.f10485i, j3)), j3 - ((long) mVar.f10485i.f10451f));
    }

    /* renamed from: a */
    public void mo11410a(C3257m mVar) {
        this.f10473c.add(mVar);
    }

    /* renamed from: b */
    public long mo11411b(C3232f fVar, int i) {
        C3257m mVar;
        long j;
        long j2;
        long j3;
        C3257m mVar2 = this.f10472b;
        long j4 = 0;
        if (mVar2 instanceof C3244c) {
            if (((C3244c) mVar2).f10482f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar2 instanceof C3252j)) {
                return 0;
            }
        } else if (!(mVar2 instanceof C3255l)) {
            return 0;
        }
        C3247f fVar2 = (i == 0 ? fVar.f10365d : fVar.f10367e).f10484h;
        C3247f fVar3 = (i == 0 ? fVar.f10365d : fVar.f10367e).f10485i;
        boolean contains = this.f10472b.f10484h.f10457l.contains(fVar2);
        boolean contains2 = this.f10472b.f10485i.f10457l.contains(fVar3);
        long j5 = this.f10472b.mo11392j();
        if (!contains || !contains2) {
            if (contains) {
                C3247f fVar4 = this.f10472b.f10484h;
                j3 = m14046d(fVar4, (long) fVar4.f10451f);
                j2 = ((long) this.f10472b.f10484h.f10451f) + j5;
            } else if (contains2) {
                C3247f fVar5 = this.f10472b.f10485i;
                long c = m14045c(fVar5, (long) fVar5.f10451f);
                j2 = ((long) (-this.f10472b.f10485i.f10451f)) + j5;
                j3 = -c;
            } else {
                C3257m mVar3 = this.f10472b;
                j = ((long) mVar3.f10484h.f10451f) + mVar3.mo11392j();
                mVar = this.f10472b;
            }
            return Math.max(j3, j2);
        }
        long d = m14046d(this.f10472b.f10484h, 0);
        long c2 = m14045c(this.f10472b.f10485i, 0);
        long j6 = d - j5;
        int i2 = this.f10472b.f10485i.f10451f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = this.f10472b.f10484h.f10451f;
        long j7 = ((-c2) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float m = this.f10472b.f10478b.mo11322m(i);
        if (m > 0.0f) {
            j4 = (long) ((((float) j7) / m) + (((float) j6) / (1.0f - m)));
        }
        float f = (float) j4;
        long j8 = ((long) ((f * m) + 0.5f)) + j5 + ((long) ((f * (1.0f - m)) + 0.5f));
        mVar = this.f10472b;
        j = ((long) mVar.f10484h.f10451f) + j8;
        return j - ((long) mVar.f10485i.f10451f);
    }
}
