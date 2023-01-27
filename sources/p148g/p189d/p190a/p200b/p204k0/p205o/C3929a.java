package p148g.p189d.p190a.p200b.p204k0.p205o;

import android.util.Pair;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p205o.C3932d;
import p148g.p189d.p190a.p200b.p230r0.C4262c;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.o.a */
final class C3929a extends C3932d {

    /* renamed from: e */
    private static final int[] f11921e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f11922b;

    /* renamed from: c */
    private boolean f11923c;

    /* renamed from: d */
    private int f11924d;

    public C3929a(C3927n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12758b(C4274m mVar) throws C3932d.C3933a {
        C4109n g;
        if (!this.f11922b) {
            int x = mVar.mo13479x();
            int i = (x >> 4) & 15;
            this.f11924d = i;
            if (i == 2) {
                g = C4109n.m17338h((String) null, "audio/mpeg", (String) null, -1, -1, 1, f11921e[(x >> 2) & 3], (List<byte[]>) null, (C3900a) null, 0, (String) null);
            } else if (i == 7 || i == 8) {
                g = C4109n.m17337g((String) null, this.f11924d == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (x & 1) == 1 ? 2 : 3, (List<byte[]>) null, (C3900a) null, 0, (String) null);
            } else {
                if (i != 10) {
                    throw new C3932d.C3933a("Audio format not supported: " + this.f11924d);
                }
                this.f11922b = true;
            }
            this.f11942a.mo12737d(g);
            this.f11923c = true;
            this.f11922b = true;
        } else {
            mVar.mo13455K(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12759c(C4274m mVar, long j) throws C4313u {
        C4274m mVar2 = mVar;
        if (this.f11924d == 2) {
            int a = mVar.mo13456a();
            this.f11942a.mo12734a(mVar2, a);
            this.f11942a.mo12736c(j, 1, a, 0, (C3927n.C3928a) null);
            return;
        }
        int x = mVar.mo13479x();
        if (x == 0 && !this.f11923c) {
            int a2 = mVar.mo13456a();
            byte[] bArr = new byte[a2];
            mVar2.mo13462g(bArr, 0, a2);
            Pair<Integer, Integer> f = C4262c.m18084f(bArr);
            this.f11942a.mo12737d(C4109n.m17338h((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) f.second).intValue(), ((Integer) f.first).intValue(), Collections.singletonList(bArr), (C3900a) null, 0, (String) null));
            this.f11923c = true;
        } else if (this.f11924d != 10 || x == 1) {
            int a3 = mVar.mo13456a();
            this.f11942a.mo12734a(mVar2, a3);
            this.f11942a.mo12736c(j, 1, a3, 0, (C3927n.C3928a) null);
        }
    }
}
