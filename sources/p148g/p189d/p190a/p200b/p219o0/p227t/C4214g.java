package p148g.p189d.p190a.p200b.p219o0.p227t;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p219o0.p227t.C4208e;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.t.g */
public final class C4214g extends C4153c {

    /* renamed from: n */
    private final C4211f f13478n = new C4211f();

    /* renamed from: o */
    private final C4274m f13479o = new C4274m();

    /* renamed from: p */
    private final C4208e.C4210b f13480p = new C4208e.C4210b();

    /* renamed from: q */
    private final C4204a f13481q = new C4204a();

    /* renamed from: r */
    private final List<C4207d> f13482r = new ArrayList();

    public C4214g() {
        super("WebvttDecoder");
    }

    /* renamed from: D */
    private static int m17911D(C4274m mVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = mVar.mo13458c();
            String k = mVar.mo13466k();
            i = k == null ? 0 : "STYLE".equals(k) ? 2 : "NOTE".startsWith(k) ? 1 : 3;
        }
        mVar.mo13454J(i2);
        return i;
    }

    /* renamed from: E */
    private static void m17912E(C4274m mVar) {
        do {
        } while (!TextUtils.isEmpty(mVar.mo13466k()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C4216i mo13192z(byte[] bArr, int i, boolean z) throws C4157g {
        this.f13479o.mo13452H(bArr, i);
        this.f13480p.mo13311c();
        this.f13482r.clear();
        C4215h.m17917c(this.f13479o);
        do {
        } while (!TextUtils.isEmpty(this.f13479o.mo13466k()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int D = m17911D(this.f13479o);
            if (D == 0) {
                return new C4216i(arrayList);
            }
            if (D == 1) {
                m17912E(this.f13479o);
            } else if (D == 2) {
                if (arrayList.isEmpty()) {
                    this.f13479o.mo13466k();
                    C4207d d = this.f13481q.mo13284d(this.f13479o);
                    if (d != null) {
                        this.f13482r.add(d);
                    }
                } else {
                    throw new C4157g("A style block was found after the first cue.");
                }
            } else if (D == 3 && this.f13478n.mo13322h(this.f13479o, this.f13480p, this.f13482r)) {
                arrayList.add(this.f13480p.mo13310a());
                this.f13480p.mo13311c();
            }
        }
    }
}
