package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p291y.C5275e;
import p148g.p189d.p289c.p291y.C5287j;
import p148g.p189d.p289c.p291y.p292n.p293o.C5364a;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.c */
public final class C5301c extends C5245v<Date> {

    /* renamed from: b */
    public static final C5247w f15381b = new C5302a();

    /* renamed from: a */
    private final List<DateFormat> f15382a;

    /* renamed from: g.d.c.y.n.c$a */
    static class C5302a implements C5247w {
        C5302a() {
        }

        /* renamed from: b */
        public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
            if (aVar.mo15578c() == Date.class) {
                return new C5301c();
            }
            return null;
        }
    }

    public C5301c() {
        ArrayList arrayList = new ArrayList();
        this.f15382a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f15382a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C5275e.m21920e()) {
            this.f15382a.add(C5287j.m21940c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m21962e(String str) {
        for (DateFormat parse : this.f15382a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C5364a.m22152c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C5241t(str, e);
        }
    }

    /* renamed from: f */
    public Date mo15331b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return m21962e(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: g */
    public synchronized void mo15332d(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f15382a.get(0).format(date));
        }
    }
}
