package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.p291y.p292n.C5313i;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.m */
final class C5324m<T> extends C5245v<T> {

    /* renamed from: a */
    private final C5221f f15430a;

    /* renamed from: b */
    private final C5245v<T> f15431b;

    /* renamed from: c */
    private final Type f15432c;

    C5324m(C5221f fVar, C5245v<T> vVar, Type type) {
        this.f15430a = fVar;
        this.f15431b = vVar;
        this.f15432c = type;
    }

    /* renamed from: e */
    private Type m22015e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: b */
    public T mo15331b(JsonReader jsonReader) throws IOException {
        return this.f15431b.mo15331b(jsonReader);
    }

    /* renamed from: d */
    public void mo15332d(JsonWriter jsonWriter, T t) throws IOException {
        C5245v<T> vVar = this.f15431b;
        Type e = m22015e(this.f15432c, t);
        if (e != this.f15432c) {
            vVar = this.f15430a.mo15343k(C5368a.m22162b(e));
            if (vVar instanceof C5313i.C5315b) {
                C5245v<T> vVar2 = this.f15431b;
                if (!(vVar2 instanceof C5313i.C5315b)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.mo15332d(jsonWriter, t);
    }
}
