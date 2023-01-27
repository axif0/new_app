package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p291y.C5278h;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.h */
public final class C5310h extends C5245v<Object> {

    /* renamed from: b */
    public static final C5247w f15400b = new C5311a();

    /* renamed from: a */
    private final C5221f f15401a;

    /* renamed from: g.d.c.y.n.h$a */
    static class C5311a implements C5247w {
        C5311a() {
        }

        /* renamed from: b */
        public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
            if (aVar.mo15578c() == Object.class) {
                return new C5310h(fVar);
            }
            return null;
        }
    }

    /* renamed from: g.d.c.y.n.h$b */
    static /* synthetic */ class C5312b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15402a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15402a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15402a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15402a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15402a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15402a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15402a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p289c.p291y.p292n.C5310h.C5312b.<clinit>():void");
        }
    }

    C5310h(C5221f fVar) {
        this.f15401a = fVar;
    }

    /* renamed from: b */
    public Object mo15331b(JsonReader jsonReader) throws IOException {
        switch (C5312b.f15402a[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(mo15331b(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                C5278h hVar = new C5278h();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hVar.put(jsonReader.nextName(), mo15331b(jsonReader));
                }
                jsonReader.endObject();
                return hVar;
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public void mo15332d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        C5245v<?> l = this.f15401a.mo15344l(obj.getClass());
        if (l instanceof C5310h) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        l.mo15332d(jsonWriter, obj);
    }
}
