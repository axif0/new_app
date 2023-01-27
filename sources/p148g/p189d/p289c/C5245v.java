package p148g.p189d.p289c;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p148g.p189d.p289c.p291y.p292n.C5306f;

/* renamed from: g.d.c.v */
public abstract class C5245v<T> {

    /* renamed from: g.d.c.v$a */
    class C5246a extends C5245v<T> {
        C5246a() {
        }

        /* renamed from: b */
        public T mo15331b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return C5245v.this.mo15331b(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: d */
        public void mo15332d(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                C5245v.this.mo15332d(jsonWriter, t);
            }
        }
    }

    /* renamed from: a */
    public final C5245v<T> mo15403a() {
        return new C5246a();
    }

    /* renamed from: b */
    public abstract T mo15331b(JsonReader jsonReader) throws IOException;

    /* renamed from: c */
    public final C5233l mo15404c(T t) {
        try {
            C5306f fVar = new C5306f();
            mo15332d(fVar, t);
            return fVar.mo15498a();
        } catch (IOException e) {
            throw new C5234m((Throwable) e);
        }
    }

    /* renamed from: d */
    public abstract void mo15332d(JsonWriter jsonWriter, T t) throws IOException;
}
