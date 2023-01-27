package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.Log;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.l */
public final class C4017l implements C4008h {

    /* renamed from: a */
    private final C4274m f12608a = new C4274m(10);

    /* renamed from: b */
    private C3927n f12609b;

    /* renamed from: c */
    private boolean f12610c;

    /* renamed from: d */
    private long f12611d;

    /* renamed from: e */
    private int f12612e;

    /* renamed from: f */
    private int f12613f;

    /* renamed from: a */
    public void mo12847a() {
        this.f12610c = false;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        if (this.f12610c) {
            int a = mVar.mo13456a();
            int i = this.f12613f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(mVar.f13643a, mVar.mo13458c(), this.f12608a.f13643a, this.f12613f, min);
                if (this.f12613f + min == 10) {
                    this.f12608a.mo13454J(0);
                    if (73 == this.f12608a.mo13479x() && 68 == this.f12608a.mo13479x() && 51 == this.f12608a.mo13479x()) {
                        this.f12608a.mo13455K(3);
                        this.f12612e = this.f12608a.mo13478w() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12610c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f12612e - this.f12613f);
            this.f12609b.mo12734a(mVar, min2);
            this.f12613f += min2;
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        if (z) {
            this.f12610c = true;
            this.f12611d = j;
            this.f12612e = 0;
            this.f12613f = 0;
        }
    }

    /* renamed from: e */
    public void mo12850e() {
        int i;
        if (this.f12610c && (i = this.f12612e) != 0 && this.f12613f == i) {
            this.f12609b.mo12736c(this.f12611d, 1, i, 0, (C3927n.C3928a) null);
            this.f12610c = false;
        }
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        C3927n m = gVar.mo12745m(dVar.mo12888c(), 4);
        this.f12609b = m;
        m.mo12737d(C4109n.m17341k(dVar.mo12887b(), "application/id3", (String) null, -1, (C3900a) null));
    }
}
