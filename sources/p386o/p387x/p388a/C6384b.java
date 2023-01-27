package p386o.p387x.p388a;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p374m.C6103b0;
import p374m.C6261v;
import p385n.C6277c;
import p386o.C6322f;

/* renamed from: o.x.a.b */
final class C6384b<T> implements C6322f<T, C6103b0> {

    /* renamed from: c */
    private static final C6261v f18003c = C6261v.m25703b("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f18004d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C5221f f18005a;

    /* renamed from: b */
    private final C5245v<T> f18006b;

    C6384b(C5221f fVar, C5245v<T> vVar) {
        this.f18005a = fVar;
        this.f18006b = vVar;
    }

    /* renamed from: b */
    public C6103b0 mo17933a(T t) throws IOException {
        C6277c cVar = new C6277c();
        JsonWriter p = this.f18005a.mo15347p(new OutputStreamWriter(cVar.mo17808V(), f18004d));
        this.f18006b.mo15332d(p, t);
        p.close();
        return C6103b0.m24899c(f18003c, cVar.mo17822f0());
    }
}
