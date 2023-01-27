package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5233l;
import p148g.p189d.p289c.C5238q;
import p148g.p189d.p289c.C5241t;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p291y.C5254b;
import p148g.p189d.p289c.p291y.C5258c;
import p148g.p189d.p289c.p291y.C5276f;
import p148g.p189d.p289c.p291y.C5286i;
import p148g.p189d.p289c.p291y.C5289l;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.g */
public final class C5308g implements C5247w {

    /* renamed from: f */
    private final C5258c f15394f;

    /* renamed from: g */
    final boolean f15395g;

    /* renamed from: g.d.c.y.n.g$a */
    private final class C5309a<K, V> extends C5245v<Map<K, V>> {

        /* renamed from: a */
        private final C5245v<K> f15396a;

        /* renamed from: b */
        private final C5245v<V> f15397b;

        /* renamed from: c */
        private final C5286i<? extends Map<K, V>> f15398c;

        public C5309a(C5221f fVar, Type type, C5245v<K> vVar, Type type2, C5245v<V> vVar2, C5286i<? extends Map<K, V>> iVar) {
            this.f15396a = new C5324m(fVar, vVar, type);
            this.f15397b = new C5324m(fVar, vVar2, type2);
            this.f15398c = iVar;
        }

        /* renamed from: e */
        private String m21980e(C5233l lVar) {
            if (lVar.mo15381m()) {
                C5238q f = lVar.mo15377f();
                if (f.mo15389B()) {
                    return String.valueOf(f.mo15399u());
                }
                if (f.mo15401x()) {
                    return Boolean.toString(f.mo15394o());
                }
                if (f.mo15390D()) {
                    return f.mo15400w();
                }
                throw new AssertionError();
            } else if (lVar.mo15379i()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map<K, V> mo15331b(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.f15398c.mo15431a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K b = this.f15396a.mo15331b(jsonReader);
                    if (map.put(b, this.f15397b.mo15331b(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new C5241t("duplicate key: " + b);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C5276f.INSTANCE.promoteNameToValue(jsonReader);
                    K b2 = this.f15396a.mo15331b(jsonReader);
                    if (map.put(b2, this.f15397b.mo15331b(jsonReader)) != null) {
                        throw new C5241t("duplicate key: " + b2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* renamed from: g */
        public void mo15332d(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!C5308g.this.f15395g) {
                jsonWriter.beginObject();
                for (Map.Entry next : map.entrySet()) {
                    jsonWriter.name(String.valueOf(next.getKey()));
                    this.f15397b.mo15332d(jsonWriter, next.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C5233l c = this.f15396a.mo15404c(next2.getKey());
                    arrayList.add(c);
                    arrayList2.add(next2.getValue());
                    z |= c.mo15378h() || c.mo15380j();
                }
                if (z) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        C5289l.m21945b((C5233l) arrayList.get(i), jsonWriter);
                        this.f15397b.mo15332d(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    jsonWriter.name(m21980e((C5233l) arrayList.get(i)));
                    this.f15397b.mo15332d(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public C5308g(C5258c cVar, boolean z) {
        this.f15394f = cVar;
        this.f15395g = z;
    }

    /* renamed from: a */
    private C5245v<?> m21978a(C5221f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C5325n.f15464f : fVar.mo15343k(C5368a.m22162b(type));
    }

    /* renamed from: b */
    public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
        Type e = aVar.mo15579e();
        if (!Map.class.isAssignableFrom(aVar.mo15578c())) {
            return null;
        }
        Type[] j = C5254b.m21871j(e, C5254b.m21872k(e));
        return new C5309a(fVar, j[0], m21978a(fVar, j[0]), j[1], fVar.mo15343k(C5368a.m22162b(j[1])), this.f15394f.mo15429a(aVar));
    }
}
