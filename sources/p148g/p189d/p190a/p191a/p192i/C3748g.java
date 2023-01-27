package p148g.p189d.p190a.p191a.p192i;

import java.util.Arrays;
import p148g.p189d.p190a.p191a.C3727b;

/* renamed from: g.d.a.a.i.g */
public final class C3748g {

    /* renamed from: a */
    private final C3727b f11411a;

    /* renamed from: b */
    private final byte[] f11412b;

    public C3748g(C3727b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f11411a = bVar;
            this.f11412b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo12333a() {
        return this.f11412b;
    }

    /* renamed from: b */
    public C3727b mo12334b() {
        return this.f11411a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3748g)) {
            return false;
        }
        C3748g gVar = (C3748g) obj;
        if (!this.f11411a.equals(gVar.f11411a)) {
            return false;
        }
        return Arrays.equals(this.f11412b, gVar.f11412b);
    }

    public int hashCode() {
        return ((this.f11411a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11412b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f11411a + ", bytes=[...]}";
    }
}
