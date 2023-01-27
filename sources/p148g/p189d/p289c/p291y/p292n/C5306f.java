package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p289c.C5230i;
import p148g.p189d.p289c.C5233l;
import p148g.p189d.p289c.C5235n;
import p148g.p189d.p289c.C5236o;
import p148g.p189d.p289c.C5238q;

/* renamed from: g.d.c.y.n.f */
public final class C5306f extends JsonWriter {

    /* renamed from: i */
    private static final Writer f15389i = new C5307a();

    /* renamed from: j */
    private static final C5238q f15390j = new C5238q("closed");

    /* renamed from: f */
    private final List<C5233l> f15391f = new ArrayList();

    /* renamed from: g */
    private String f15392g;

    /* renamed from: h */
    private C5233l f15393h = C5235n.f15303a;

    /* renamed from: g.d.c.y.n.f$a */
    static class C5307a extends Writer {
        C5307a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C5306f() {
        super(f15389i);
    }

    /* renamed from: h */
    private C5233l m21975h() {
        List<C5233l> list = this.f15391f;
        return list.get(list.size() - 1);
    }

    /* renamed from: j */
    private void m21976j(C5233l lVar) {
        if (this.f15392g != null) {
            if (!lVar.mo15379i() || getSerializeNulls()) {
                ((C5236o) m21975h()).mo15387o(this.f15392g, lVar);
            }
            this.f15392g = null;
        } else if (this.f15391f.isEmpty()) {
            this.f15393h = lVar;
        } else {
            C5233l h = m21975h();
            if (h instanceof C5230i) {
                ((C5230i) h).mo15373o(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C5233l mo15498a() {
        if (this.f15391f.isEmpty()) {
            return this.f15393h;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f15391f);
    }

    public JsonWriter beginArray() throws IOException {
        C5230i iVar = new C5230i();
        m21976j(iVar);
        this.f15391f.add(iVar);
        return this;
    }

    public JsonWriter beginObject() throws IOException {
        C5236o oVar = new C5236o();
        m21976j(oVar);
        this.f15391f.add(oVar);
        return this;
    }

    public void close() throws IOException {
        if (this.f15391f.isEmpty()) {
            this.f15391f.add(f15390j);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter endArray() throws IOException {
        if (this.f15391f.isEmpty() || this.f15392g != null) {
            throw new IllegalStateException();
        } else if (m21975h() instanceof C5230i) {
            List<C5233l> list = this.f15391f;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter endObject() throws IOException {
        if (this.f15391f.isEmpty() || this.f15392g != null) {
            throw new IllegalStateException();
        } else if (m21975h() instanceof C5236o) {
            List<C5233l> list = this.f15391f;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    public JsonWriter name(String str) throws IOException {
        if (this.f15391f.isEmpty() || this.f15392g != null) {
            throw new IllegalStateException();
        } else if (m21975h() instanceof C5236o) {
            this.f15392g = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter nullValue() throws IOException {
        m21976j(C5235n.f15303a);
        return this;
    }

    public JsonWriter value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m21976j(new C5238q((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public JsonWriter value(long j) throws IOException {
        m21976j(new C5238q((Number) Long.valueOf(j)));
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            nullValue();
            return this;
        }
        m21976j(new C5238q(bool));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            nullValue();
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m21976j(new C5238q(number));
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            nullValue();
            return this;
        }
        m21976j(new C5238q(str));
        return this;
    }

    public JsonWriter value(boolean z) throws IOException {
        m21976j(new C5238q(Boolean.valueOf(z)));
        return this;
    }
}
