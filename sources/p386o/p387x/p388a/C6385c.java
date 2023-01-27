package p386o.p387x.p388a;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5234m;
import p148g.p189d.p289c.C5245v;
import p374m.C6117d0;
import p386o.C6322f;

/* renamed from: o.x.a.c */
final class C6385c<T> implements C6322f<C6117d0, T> {

    /* renamed from: a */
    private final C5221f f18007a;

    /* renamed from: b */
    private final C5245v<T> f18008b;

    C6385c(C5221f fVar, C5245v<T> vVar) {
        this.f18007a = fVar;
        this.f18008b = vVar;
    }

    /* renamed from: b */
    public T mo17933a(C6117d0 d0Var) throws IOException {
        JsonReader o = this.f18007a.mo15346o(d0Var.mo17309a());
        try {
            T b = this.f18008b.mo15331b(o);
            if (o.peek() == JsonToken.END_DOCUMENT) {
                return b;
            }
            throw new C5234m("JSON document was not fully consumed.");
        } finally {
            d0Var.close();
        }
    }
}
