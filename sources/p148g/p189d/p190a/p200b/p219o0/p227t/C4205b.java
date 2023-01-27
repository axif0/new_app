package p148g.p189d.p190a.p200b.p219o0.p227t;

import java.util.ArrayList;
import java.util.Collections;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p219o0.p227t.C4208e;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.t.b */
public final class C4205b extends C4153c {

    /* renamed from: p */
    private static final int f13433p = C4284w.m18249o("payl");

    /* renamed from: q */
    private static final int f13434q = C4284w.m18249o("sttg");

    /* renamed from: r */
    private static final int f13435r = C4284w.m18249o("vttc");

    /* renamed from: n */
    private final C4274m f13436n = new C4274m();

    /* renamed from: o */
    private final C4208e.C4210b f13437o = new C4208e.C4210b();

    public C4205b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: D */
    private static C4152b m17848D(C4274m mVar, C4208e.C4210b bVar, int i) throws C4157g {
        bVar.mo13311c();
        while (i > 0) {
            if (i >= 8) {
                int i2 = mVar.mo13464i();
                int i3 = mVar.mo13464i();
                int i4 = i2 - 8;
                String str = new String(mVar.f13643a, mVar.mo13458c(), i4);
                mVar.mo13455K(i4);
                i = (i - 8) - i4;
                if (i3 == f13434q) {
                    C4211f.m17901j(str, bVar);
                } else if (i3 == f13433p) {
                    C4211f.m17902k((String) null, str.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new C4157g("Incomplete vtt cue box header found.");
            }
        }
        return bVar.mo13310a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C4206c mo13192z(byte[] bArr, int i, boolean z) throws C4157g {
        this.f13436n.mo13452H(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f13436n.mo13456a() > 0) {
            if (this.f13436n.mo13456a() >= 8) {
                int i2 = this.f13436n.mo13464i();
                if (this.f13436n.mo13464i() == f13435r) {
                    arrayList.add(m17848D(this.f13436n, this.f13437o, i2 - 8));
                } else {
                    this.f13436n.mo13455K(i2 - 8);
                }
            } else {
                throw new C4157g("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C4206c(arrayList);
    }
}
