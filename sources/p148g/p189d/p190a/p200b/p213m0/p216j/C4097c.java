package p148g.p189d.p190a.p200b.p213m0.p216j;

import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.C4062b;
import p148g.p189d.p190a.p200b.p213m0.C4063c;
import p148g.p189d.p190a.p200b.p213m0.C4066e;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.m0.j.c */
public final class C4097c implements C4062b {

    /* renamed from: a */
    private final C4274m f12903a = new C4274m();

    /* renamed from: b */
    private final C4273l f12904b = new C4273l();

    /* renamed from: c */
    private C4282u f12905c;

    /* renamed from: a */
    public C4059a mo12951a(C4066e eVar) throws C4063c {
        C4282u uVar = this.f12905c;
        if (uVar == null || eVar.f12846k != uVar.mo13501e()) {
            C4282u uVar2 = new C4282u(eVar.f11823i);
            this.f12905c = uVar2;
            uVar2.mo13497a(eVar.f11823i - eVar.f12846k);
        }
        ByteBuffer byteBuffer = eVar.f11822h;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f12903a.mo13452H(array, limit);
        this.f12904b.mo13440l(array, limit);
        this.f12904b.mo13443o(39);
        long h = (((long) this.f12904b.mo13436h(1)) << 32) | ((long) this.f12904b.mo13436h(32));
        this.f12904b.mo13443o(20);
        int h2 = this.f12904b.mo13436h(12);
        int h3 = this.f12904b.mo13436h(8);
        C4059a.C4061b bVar = null;
        this.f12903a.mo13455K(14);
        if (h3 == 0) {
            bVar = new C4101e();
        } else if (h3 == 255) {
            bVar = C4094a.m17305a(this.f12903a, h2, h);
        } else if (h3 == 4) {
            bVar = C4103f.m17316a(this.f12903a);
        } else if (h3 == 5) {
            bVar = C4098d.m17309a(this.f12903a, h, this.f12905c);
        } else if (h3 == 6) {
            bVar = C4107g.m17329a(this.f12903a, h, this.f12905c);
        }
        if (bVar == null) {
            return new C4059a(new C4059a.C4061b[0]);
        }
        return new C4059a(bVar);
    }
}
