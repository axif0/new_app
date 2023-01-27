package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.j */
public final class C5317j extends C5245v<Date> {

    /* renamed from: b */
    public static final C5247w f15419b = new C5318a();

    /* renamed from: a */
    private final DateFormat f15420a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: g.d.c.y.n.j$a */
    static class C5318a implements C5247w {
        C5318a() {
        }

        /* renamed from: b */
        public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
            if (aVar.mo15578c() == Date.class) {
                return new C5317j();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Date mo15331b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f15420a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new C5241t((Throwable) e);
        }
    }

    /* renamed from: f */
    public synchronized void mo15332d(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.f15420a.format(date));
    }
}
