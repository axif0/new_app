package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5231j;
import p148g.p189d.p289c.C5232k;
import p148g.p189d.p289c.C5233l;
import p148g.p189d.p289c.C5239r;
import p148g.p189d.p289c.C5240s;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p291y.C5289l;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.l */
public final class C5321l<T> extends C5245v<T> {

    /* renamed from: a */
    private final C5240s<T> f15423a;

    /* renamed from: b */
    private final C5232k<T> f15424b;

    /* renamed from: c */
    final C5221f f15425c;

    /* renamed from: d */
    private final C5368a<T> f15426d;

    /* renamed from: e */
    private final C5247w f15427e;

    /* renamed from: f */
    private final C5321l<T>.C0958b f15428f = new C5323b();

    /* renamed from: g */
    private C5245v<T> f15429g;

    /* renamed from: g.d.c.y.n.l$b */
    private final class C5323b implements C5239r, C5231j {
        private C5323b(C5321l lVar) {
        }
    }

    public C5321l(C5240s<T> sVar, C5232k<T> kVar, C5221f fVar, C5368a<T> aVar, C5247w wVar) {
        this.f15423a = sVar;
        this.f15424b = kVar;
        this.f15425c = fVar;
        this.f15426d = aVar;
        this.f15427e = wVar;
    }

    /* renamed from: e */
    private C5245v<T> m22012e() {
        C5245v<T> vVar = this.f15429g;
        if (vVar != null) {
            return vVar;
        }
        C5245v<T> m = this.f15425c.mo15345m(this.f15427e, this.f15426d);
        this.f15429g = m;
        return m;
    }

    /* renamed from: b */
    public T mo15331b(JsonReader jsonReader) throws IOException {
        if (this.f15424b == null) {
            return m22012e().mo15331b(jsonReader);
        }
        C5233l a = C5289l.m21944a(jsonReader);
        if (a.mo15379i()) {
            return null;
        }
        return this.f15424b.mo15374a(a, this.f15426d.mo15579e(), this.f15428f);
    }

    /* renamed from: d */
    public void mo15332d(JsonWriter jsonWriter, T t) throws IOException {
        C5240s<T> sVar = this.f15423a;
        if (sVar == null) {
            m22012e().mo15332d(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            C5289l.m21945b(sVar.mo15402a(t, this.f15426d.mo15579e(), this.f15428f), jsonWriter);
        }
    }
}
