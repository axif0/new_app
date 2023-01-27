package p148g.p189d.p190a.p200b.p204k0;

import java.io.IOException;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.n */
public interface C3927n {

    /* renamed from: g.d.a.b.k0.n$a */
    public static final class C3928a {

        /* renamed from: a */
        public final int f11917a;

        /* renamed from: b */
        public final byte[] f11918b;

        /* renamed from: c */
        public final int f11919c;

        /* renamed from: d */
        public final int f11920d;

        public C3928a(int i, byte[] bArr, int i2, int i3) {
            this.f11917a = i;
            this.f11918b = bArr;
            this.f11919c = i2;
            this.f11920d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3928a.class != obj.getClass()) {
                return false;
            }
            C3928a aVar = (C3928a) obj;
            return this.f11917a == aVar.f11917a && this.f11919c == aVar.f11919c && this.f11920d == aVar.f11920d && Arrays.equals(this.f11918b, aVar.f11918b);
        }

        public int hashCode() {
            return (((((this.f11917a * 31) + Arrays.hashCode(this.f11918b)) * 31) + this.f11919c) * 31) + this.f11920d;
        }
    }

    /* renamed from: a */
    void mo12734a(C4274m mVar, int i);

    /* renamed from: b */
    int mo12735b(C3916f fVar, int i, boolean z) throws IOException, InterruptedException;

    /* renamed from: c */
    void mo12736c(long j, int i, int i2, int i3, C3928a aVar);

    /* renamed from: d */
    void mo12737d(C4109n nVar);
}
