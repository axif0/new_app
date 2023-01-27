package p148g.p189d.p190a.p200b;

import android.util.Pair;
import p148g.p189d.p190a.p200b.p217n0.p218p.C4148a;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.g0 */
public abstract class C3844g0 {

    /* renamed from: a */
    public static final C3844g0 f11572a = new C3845a();

    /* renamed from: g.d.a.b.g0$a */
    static class C3845a extends C3844g0 {
        C3845a() {
        }

        /* renamed from: b */
        public int mo12532b(Object obj) {
            return -1;
        }

        /* renamed from: g */
        public C3846b mo12537g(int i, C3846b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: h */
        public int mo12538h() {
            return 0;
        }

        /* renamed from: n */
        public C3847c mo12544n(int i, C3847c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: o */
        public int mo12545o() {
            return 0;
        }
    }

    /* renamed from: g.d.a.b.g0$b */
    public static final class C3846b {

        /* renamed from: a */
        public Object f11573a;

        /* renamed from: b */
        public Object f11574b;

        /* renamed from: c */
        public int f11575c;

        /* renamed from: d */
        public long f11576d;

        /* renamed from: e */
        private long f11577e;

        /* renamed from: f */
        private C4148a f11578f;

        /* renamed from: a */
        public int mo12548a(int i) {
            return this.f11578f.f13166c[i].f13168a;
        }

        /* renamed from: b */
        public long mo12549b(int i, int i2) {
            C4148a.C4149a aVar = this.f11578f.f13166c[i];
            if (aVar.f13168a != -1) {
                return aVar.f13170c[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int mo12550c() {
            return this.f11578f.f13164a;
        }

        /* renamed from: d */
        public int mo12551d(long j) {
            return this.f11578f.mo13181a(j);
        }

        /* renamed from: e */
        public int mo12552e(long j) {
            return this.f11578f.mo13182b(j);
        }

        /* renamed from: f */
        public long mo12553f(int i) {
            return this.f11578f.f13165b[i];
        }

        /* renamed from: g */
        public long mo12554g() {
            return this.f11578f.f13167d;
        }

        /* renamed from: h */
        public long mo12555h() {
            return this.f11576d;
        }

        /* renamed from: i */
        public int mo12556i(int i) {
            return this.f11578f.f13166c[i].mo13183a();
        }

        /* renamed from: j */
        public int mo12557j(int i, int i2) {
            return this.f11578f.f13166c[i].mo13184b(i2);
        }

        /* renamed from: k */
        public long mo12558k() {
            return C3830b.m15923b(this.f11577e);
        }

        /* renamed from: l */
        public long mo12559l() {
            return this.f11577e;
        }

        /* renamed from: m */
        public boolean mo12560m(int i) {
            return !this.f11578f.f13166c[i].mo13185c();
        }

        /* renamed from: n */
        public boolean mo12561n(int i, int i2) {
            C4148a.C4149a aVar = this.f11578f.f13166c[i];
            return (aVar.f13168a == -1 || aVar.f13169b[i2] == 0) ? false : true;
        }

        /* renamed from: o */
        public C3846b mo12562o(Object obj, Object obj2, int i, long j, long j2) {
            mo12563p(obj, obj2, i, j, j2, C4148a.f13163e);
            return this;
        }

        /* renamed from: p */
        public C3846b mo12563p(Object obj, Object obj2, int i, long j, long j2, C4148a aVar) {
            this.f11573a = obj;
            this.f11574b = obj2;
            this.f11575c = i;
            this.f11576d = j;
            this.f11577e = j2;
            this.f11578f = aVar;
            return this;
        }
    }

    /* renamed from: g.d.a.b.g0$c */
    public static final class C3847c {

        /* renamed from: a */
        public Object f11579a;

        /* renamed from: b */
        public boolean f11580b;

        /* renamed from: c */
        public boolean f11581c;

        /* renamed from: d */
        public int f11582d;

        /* renamed from: e */
        public int f11583e;

        /* renamed from: f */
        public long f11584f;

        /* renamed from: g */
        public long f11585g;

        /* renamed from: h */
        public long f11586h;

        /* renamed from: a */
        public long mo12564a() {
            return this.f11584f;
        }

        /* renamed from: b */
        public long mo12565b() {
            return C3830b.m15923b(this.f11585g);
        }

        /* renamed from: c */
        public long mo12566c() {
            return this.f11586h;
        }

        /* renamed from: d */
        public C3847c mo12567d(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f11579a = obj;
            this.f11580b = z;
            this.f11581c = z2;
            this.f11584f = j3;
            this.f11585g = j4;
            this.f11582d = i;
            this.f11583e = i2;
            this.f11586h = j5;
            return this;
        }
    }

    /* renamed from: a */
    public int mo12531a(boolean z) {
        return mo12546p() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo12532b(Object obj);

    /* renamed from: c */
    public int mo12533c(boolean z) {
        if (mo12546p()) {
            return -1;
        }
        return mo12545o() - 1;
    }

    /* renamed from: d */
    public final int mo12534d(int i, C3846b bVar, C3847c cVar, int i2, boolean z) {
        int i3 = mo12536f(i, bVar).f11575c;
        if (mo12542l(i3, cVar).f11583e != i) {
            return i + 1;
        }
        int e = mo12535e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return mo12542l(e, cVar).f11582d;
    }

    /* renamed from: e */
    public int mo12535e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo12533c(z) ? mo12531a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo12533c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: f */
    public final C3846b mo12536f(int i, C3846b bVar) {
        return mo12537g(i, bVar, false);
    }

    /* renamed from: g */
    public abstract C3846b mo12537g(int i, C3846b bVar, boolean z);

    /* renamed from: h */
    public abstract int mo12538h();

    /* renamed from: i */
    public final Pair<Integer, Long> mo12539i(C3847c cVar, C3846b bVar, int i, long j) {
        return mo12540j(cVar, bVar, i, j, 0);
    }

    /* renamed from: j */
    public final Pair<Integer, Long> mo12540j(C3847c cVar, C3846b bVar, int i, long j, long j2) {
        C4260a.m18071c(i, 0, mo12545o());
        mo12544n(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.mo12564a();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f11582d;
        long c = cVar.mo12566c() + j;
        while (true) {
            long h = mo12536f(i2, bVar).mo12555h();
            if (h != -9223372036854775807L && c >= h && i2 < cVar.f11583e) {
                c -= h;
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(c));
    }

    /* renamed from: k */
    public int mo12541k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo12531a(z) ? mo12533c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == mo12531a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: l */
    public final C3847c mo12542l(int i, C3847c cVar) {
        return mo12543m(i, cVar, false);
    }

    /* renamed from: m */
    public final C3847c mo12543m(int i, C3847c cVar, boolean z) {
        return mo12544n(i, cVar, z, 0);
    }

    /* renamed from: n */
    public abstract C3847c mo12544n(int i, C3847c cVar, boolean z, long j);

    /* renamed from: o */
    public abstract int mo12545o();

    /* renamed from: p */
    public final boolean mo12546p() {
        return mo12545o() == 0;
    }

    /* renamed from: q */
    public final boolean mo12547q(int i, C3846b bVar, C3847c cVar, int i2, boolean z) {
        return mo12534d(i, bVar, cVar, i2, z) == -1;
    }
}
