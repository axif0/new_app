package p148g.p189d.p190a.p200b.p219o0.p221n;

import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.n.a */
public final class C4177a extends C4153c {

    /* renamed from: n */
    private final C4178b f13299n;

    public C4177a(List<byte[]> list) {
        super("DvbDecoder");
        C4274m mVar = new C4274m(list.get(0));
        this.f13299n = new C4178b(mVar.mo13448D(), mVar.mo13448D());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C4187c mo13192z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f13299n.mo13246r();
        }
        return new C4187c(this.f13299n.mo13245b(bArr, i));
    }
}
