package p148g.p189d.p190a.p200b.p204k0.p211u;

import java.io.IOException;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3927n;

/* renamed from: g.d.a.b.k0.u.a */
public final class C4036a implements C3915e {

    /* renamed from: a */
    private C3917g f12722a;

    /* renamed from: b */
    private C3927n f12723b;

    /* renamed from: c */
    private C4037b f12724c;

    /* renamed from: d */
    private int f12725d;

    /* renamed from: e */
    private int f12726e;

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12722a = gVar;
        this.f12723b = gVar.mo12745m(0, 1);
        this.f12724c = null;
        gVar.mo12744c();
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f12726e = 0;
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        return C4038c.m17054a(fVar) != null;
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        if (this.f12724c == null) {
            C4037b a = C4038c.m17054a(fVar);
            this.f12724c = a;
            if (a != null) {
                this.f12723b.mo12737d(C4109n.m17337g((String) null, "audio/raw", (String) null, a.mo12889a(), 32768, this.f12724c.mo12892d(), this.f12724c.mo12894h(), this.f12724c.mo12891c(), (List<byte[]>) null, (C3900a) null, 0, (String) null));
                this.f12725d = this.f12724c.mo12890b();
            } else {
                throw new C4313u("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.f12724c.mo12895j()) {
            C4038c.m17055b(fVar, this.f12724c);
            this.f12722a.mo12743b(this.f12724c);
        }
        int b = this.f12723b.mo12735b(fVar, 32768 - this.f12726e, true);
        if (b != -1) {
            this.f12726e += b;
        }
        int i = this.f12726e / this.f12725d;
        if (i > 0) {
            long f = this.f12724c.mo12893f(fVar.mo12729k() - ((long) this.f12726e));
            int i2 = i * this.f12725d;
            int i3 = this.f12726e - i2;
            this.f12726e = i3;
            this.f12723b.mo12736c(f, 1, i2, i3, (C3927n.C3928a) null);
        }
        return b == -1 ? -1 : 0;
    }
}
