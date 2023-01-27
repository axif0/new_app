package p148g.p189d.p190a.p200b.p213m0.p214h;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.C4062b;
import p148g.p189d.p190a.p200b.p213m0.C4066e;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.h.b */
public final class C4071b implements C4062b {
    /* renamed from: a */
    public C4059a mo12951a(C4066e eVar) {
        ByteBuffer byteBuffer = eVar.f11822h;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C4274m mVar = new C4274m(array, limit);
        String r = mVar.mo13473r();
        String r2 = mVar.mo13473r();
        long z = mVar.mo13481z();
        long B = C4284w.m18229B(mVar.mo13481z(), 1000000, z);
        return new C4059a(new C4069a(r, r2, C4284w.m18229B(mVar.mo13481z(), 1000, z), mVar.mo13481z(), Arrays.copyOfRange(array, mVar.mo13458c(), limit), B));
    }
}
