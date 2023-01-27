package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p291y.C5254b;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.a */
public final class C5297a<E> extends C5245v<Object> {

    /* renamed from: c */
    public static final C5247w f15375c = new C5298a();

    /* renamed from: a */
    private final Class<E> f15376a;

    /* renamed from: b */
    private final C5245v<E> f15377b;

    /* renamed from: g.d.c.y.n.a$a */
    static class C5298a implements C5247w {
        C5298a() {
        }

        /* renamed from: b */
        public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
            Type e = aVar.mo15579e();
            if (!(e instanceof GenericArrayType) && (!(e instanceof Class) || !((Class) e).isArray())) {
                return null;
            }
            Type g = C5254b.m21868g(e);
            return new C5297a(fVar, fVar.mo15343k(C5368a.m22162b(g)), C5254b.m21872k(g));
        }
    }

    public C5297a(C5221f fVar, C5245v<E> vVar, Class<E> cls) {
        this.f15377b = new C5324m(fVar, vVar, cls);
        this.f15376a = cls;
    }

    /* renamed from: b */
    public Object mo15331b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f15377b.mo15331b(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f15376a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: d */
    public void mo15332d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f15377b.mo15332d(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
