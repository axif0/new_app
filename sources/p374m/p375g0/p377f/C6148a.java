package p374m.p375g0.p377f;

import java.io.IOException;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6259u;
import p374m.C6265x;
import p374m.p375g0.p378g.C6165g;

/* renamed from: m.g0.f.a */
public final class C6148a implements C6259u {

    /* renamed from: a */
    public final C6265x f17276a;

    public C6148a(C6265x xVar) {
        this.f17276a = xVar;
    }

    /* renamed from: a */
    public C6113c0 mo16688a(C6259u.C6260a aVar) throws IOException {
        C6165g gVar = (C6165g) aVar;
        C6099a0 request = gVar.request();
        C6155g j = gVar.mo17444j();
        return gVar.mo17443i(request, j, j.mo17418i(this.f17276a, aVar, !request.mo17218g().equals("GET")), j.mo17416d());
    }
}
