package p148g.p189d.p190a.p200b.p217n0;

import java.io.IOException;
import p148g.p189d.p190a.p200b.C3844g0;
import p148g.p189d.p190a.p200b.C3888i;
import p148g.p189d.p190a.p200b.p229q0.C4237b;

/* renamed from: g.d.a.b.n0.f */
public interface C4126f {

    /* renamed from: g.d.a.b.n0.f$a */
    public interface C4127a {
        /* renamed from: c */
        void mo12903c(C4126f fVar, C3844g0 g0Var, Object obj);
    }

    /* renamed from: g.d.a.b.n0.f$b */
    public static final class C4128b {

        /* renamed from: a */
        public final int f13045a;

        /* renamed from: b */
        public final int f13046b;

        /* renamed from: c */
        public final int f13047c;

        /* renamed from: d */
        public final long f13048d;

        public C4128b(int i) {
            this(i, -1);
        }

        public C4128b(int i, int i2, int i3, long j) {
            this.f13045a = i;
            this.f13046b = i2;
            this.f13047c = i3;
            this.f13048d = j;
        }

        public C4128b(int i, long j) {
            this(i, -1, -1, j);
        }

        /* renamed from: a */
        public C4128b mo13120a(int i) {
            if (this.f13045a == i) {
                return this;
            }
            return new C4128b(i, this.f13046b, this.f13047c, this.f13048d);
        }

        /* renamed from: b */
        public boolean mo13121b() {
            return this.f13046b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4128b.class != obj.getClass()) {
                return false;
            }
            C4128b bVar = (C4128b) obj;
            return this.f13045a == bVar.f13045a && this.f13046b == bVar.f13046b && this.f13047c == bVar.f13047c && this.f13048d == bVar.f13048d;
        }

        public int hashCode() {
            return ((((((527 + this.f13045a) * 31) + this.f13046b) * 31) + this.f13047c) * 31) + ((int) this.f13048d);
        }
    }

    /* renamed from: a */
    C4124e mo13113a(C4128b bVar, C4237b bVar2);

    /* renamed from: b */
    void mo13114b() throws IOException;

    /* renamed from: c */
    void mo13115c(C4124e eVar);

    /* renamed from: d */
    void mo13116d();

    /* renamed from: f */
    void mo13117f(C3888i iVar, boolean z, C4127a aVar);
}
