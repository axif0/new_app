package p148g.p189d.p190a.p200b.p204k0.p205o;

import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p205o.C3932d;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p231s0.C4288a;

/* renamed from: g.d.a.b.k0.o.e */
final class C3934e extends C3932d {

    /* renamed from: b */
    private final C4274m f11943b = new C4274m(C4270k.f13622a);

    /* renamed from: c */
    private final C4274m f11944c = new C4274m(4);

    /* renamed from: d */
    private int f11945d;

    /* renamed from: e */
    private boolean f11946e;

    /* renamed from: f */
    private int f11947f;

    public C3934e(C3927n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12758b(C4274m mVar) throws C3932d.C3933a {
        int x = mVar.mo13479x();
        int i = (x >> 4) & 15;
        int i2 = x & 15;
        if (i2 == 7) {
            this.f11947f = i;
            return i != 5;
        }
        throw new C3932d.C3933a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12759c(C4274m mVar, long j) throws C4313u {
        int x = mVar.mo13479x();
        long j2 = j + (((long) mVar.mo13465j()) * 1000);
        if (x == 0 && !this.f11946e) {
            C4274m mVar2 = new C4274m(new byte[mVar.mo13456a()]);
            mVar.mo13462g(mVar2.f13643a, 0, mVar.mo13456a());
            C4288a b = C4288a.m18269b(mVar2);
            this.f11945d = b.f13674b;
            this.f11942a.mo12737d(C4109n.m17346p((String) null, "video/avc", (String) null, -1, -1, b.f13675c, b.f13676d, -1.0f, b.f13673a, -1, b.f13677e, (C3900a) null));
            this.f11946e = true;
        } else if (x == 1 && this.f11946e) {
            byte[] bArr = this.f11944c.f13643a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f11945d;
            int i2 = 0;
            while (mVar.mo13456a() > 0) {
                mVar.mo13462g(this.f11944c.f13643a, i, this.f11945d);
                this.f11944c.mo13454J(0);
                int B = this.f11944c.mo13446B();
                this.f11943b.mo13454J(0);
                this.f11942a.mo12734a(this.f11943b, 4);
                this.f11942a.mo12734a(mVar, B);
                i2 = i2 + 4 + B;
            }
            this.f11942a.mo12736c(j2, this.f11947f == 1 ? 1 : 0, i2, 0, (C3927n.C3928a) null);
        }
    }
}
