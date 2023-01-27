package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.k */
public final class C5319k extends C5245v<Time> {

    /* renamed from: b */
    public static final C5247w f15421b = new C5320a();

    /* renamed from: a */
    private final DateFormat f15422a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: g.d.c.y.n.k$a */
    static class C5320a implements C5247w {
        C5320a() {
        }

        /* renamed from: b */
        public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
            if (aVar.mo15578c() == Time.class) {
                return new C5319k();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Time mo15331b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f15422a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new C5241t((Throwable) e);
        }
    }

    /* renamed from: f */
    public synchronized void mo15332d(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.f15422a.format(time));
    }
}
