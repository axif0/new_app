package p148g.p189d.p190a.p200b.p204k0;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.k0.l */
public interface C3923l {

    /* renamed from: g.d.a.b.k0.l$a */
    public static final class C3924a {

        /* renamed from: a */
        public final C3926m f11910a;

        /* renamed from: b */
        public final C3926m f11911b;

        public C3924a(C3926m mVar) {
            this(mVar, mVar);
        }

        public C3924a(C3926m mVar, C3926m mVar2) {
            C4260a.m18073e(mVar);
            this.f11910a = mVar;
            C4260a.m18073e(mVar2);
            this.f11911b = mVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3924a.class != obj.getClass()) {
                return false;
            }
            C3924a aVar = (C3924a) obj;
            return this.f11910a.equals(aVar.f11910a) && this.f11911b.equals(aVar.f11911b);
        }

        public int hashCode() {
            return (this.f11910a.hashCode() * 31) + this.f11911b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f11910a);
            if (this.f11910a.equals(this.f11911b)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", " + this.f11911b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: g.d.a.b.k0.l$b */
    public static final class C3925b implements C3923l {

        /* renamed from: a */
        private final long f11912a;

        /* renamed from: b */
        private final C3924a f11913b;

        public C3925b(long j) {
            this(j, 0);
        }

        public C3925b(long j, long j2) {
            this.f11912a = j;
            this.f11913b = new C3924a(j2 == 0 ? C3926m.f11914c : new C3926m(0, j2));
        }

        /* renamed from: e */
        public boolean mo12716e() {
            return false;
        }

        /* renamed from: g */
        public C3924a mo12717g(long j) {
            return this.f11913b;
        }

        /* renamed from: i */
        public long mo12718i() {
            return this.f11912a;
        }
    }

    /* renamed from: e */
    boolean mo12716e();

    /* renamed from: g */
    C3924a mo12717g(long j);

    /* renamed from: i */
    long mo12718i();
}
