package p148g.p189d.p289c;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p148g.p189d.p289c.p291y.C5275e;
import p148g.p189d.p289c.p291y.C5287j;
import p148g.p189d.p289c.p291y.p292n.p293o.C5364a;

/* renamed from: g.d.c.a */
final class C5210a extends C5245v<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f15263a;

    /* renamed from: b */
    private final List<DateFormat> f15264b = new ArrayList();

    public C5210a(Class<? extends Date> cls, int i, int i2) {
        m21761g(cls);
        this.f15263a = cls;
        this.f15264b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f15264b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C5275e.m21920e()) {
            this.f15264b.add(C5287j.m21940c(i, i2));
        }
    }

    C5210a(Class<? extends Date> cls, String str) {
        m21761g(cls);
        this.f15263a = cls;
        this.f15264b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f15264b.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: e */
    private Date m21760e(String str) {
        synchronized (this.f15264b) {
            for (DateFormat parse : this.f15264b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c = C5364a.m22152c(str, new ParsePosition(0));
                return c;
            } catch (ParseException e) {
                throw new C5241t(str, e);
            }
        }
    }

    /* renamed from: g */
    private static Class<? extends Date> m21761g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: f */
    public Date mo15331b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date e = m21760e(jsonReader.nextString());
        Class<? extends Date> cls = this.f15263a;
        if (cls == Date.class) {
            return e;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(e.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(e.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    public void mo15332d(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f15264b) {
            jsonWriter.value(this.f15264b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f15264b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
