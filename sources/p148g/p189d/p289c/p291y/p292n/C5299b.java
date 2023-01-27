package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p291y.C5254b;
import p148g.p189d.p289c.p291y.C5258c;
import p148g.p189d.p289c.p291y.C5286i;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.b */
public final class C5299b implements C5247w {

    /* renamed from: f */
    private final C5258c f15378f;

    /* renamed from: g.d.c.y.n.b$a */
    private static final class C5300a<E> extends C5245v<Collection<E>> {

        /* renamed from: a */
        private final C5245v<E> f15379a;

        /* renamed from: b */
        private final C5286i<? extends Collection<E>> f15380b;

        public C5300a(C5221f fVar, Type type, C5245v<E> vVar, C5286i<? extends Collection<E>> iVar) {
            this.f15379a = new C5324m(fVar, vVar, type);
            this.f15380b = iVar;
        }

        /* renamed from: e */
        public Collection<E> mo15331b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.f15380b.mo15431a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f15379a.mo15331b(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: f */
        public void mo15332d(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E d : collection) {
                this.f15379a.mo15332d(jsonWriter, d);
            }
            jsonWriter.endArray();
        }
    }

    public C5299b(C5258c cVar) {
        this.f15378f = cVar;
    }

    /* renamed from: b */
    public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
        Type e = aVar.mo15579e();
        Class<? super T> c = aVar.mo15578c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = C5254b.m21869h(e, c);
        return new C5300a(fVar, h, fVar.mo15343k(C5368a.m22162b(h)), this.f15378f.mo15429a(aVar));
    }
}
