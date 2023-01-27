package p148g.p189d.p190a.p200b.p204k0.p208r;

import android.util.Log;
import java.util.UUID;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.r.h */
public final class C3972h {

    /* renamed from: g.d.a.b.k0.r.h$a */
    private static class C3973a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final UUID f12337a;

        public C3973a(UUID uuid, int i, byte[] bArr) {
            this.f12337a = uuid;
        }
    }

    /* renamed from: a */
    private static C3973a m16731a(byte[] bArr) {
        C4274m mVar = new C4274m(bArr);
        if (mVar.mo13459d() < 32) {
            return null;
        }
        mVar.mo13454J(0);
        if (mVar.mo13464i() != mVar.mo13456a() + 4 || mVar.mo13464i() != C3952a.f12135V) {
            return null;
        }
        int c = C3952a.m16618c(mVar.mo13464i());
        if (c > 1) {
            Log.w("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(mVar.mo13472q(), mVar.mo13472q());
        if (c == 1) {
            mVar.mo13455K(mVar.mo13446B() * 16);
        }
        int B = mVar.mo13446B();
        if (B != mVar.mo13456a()) {
            return null;
        }
        byte[] bArr2 = new byte[B];
        mVar.mo13462g(bArr2, 0, B);
        return new C3973a(uuid, c, bArr2);
    }

    /* renamed from: b */
    public static UUID m16732b(byte[] bArr) {
        C3973a a = m16731a(bArr);
        if (a == null) {
            return null;
        }
        return a.f12337a;
    }
}
