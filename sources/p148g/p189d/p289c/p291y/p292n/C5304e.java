package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import p148g.p189d.p289c.C5230i;
import p148g.p189d.p289c.C5235n;
import p148g.p189d.p289c.C5236o;
import p148g.p189d.p289c.C5238q;

/* renamed from: g.d.c.y.n.e */
public final class C5304e extends JsonReader {

    /* renamed from: j */
    private static final Object f15384j = new Object();

    /* renamed from: f */
    private Object[] f15385f;

    /* renamed from: g */
    private int f15386g;

    /* renamed from: h */
    private String[] f15387h;

    /* renamed from: i */
    private int[] f15388i;

    /* renamed from: g.d.c.y.n.e$a */
    static class C5305a extends Reader {
        C5305a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C5305a();
    }

    /* renamed from: a */
    private void m21970a(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    /* renamed from: h */
    private Object m21971h() {
        return this.f15385f[this.f15386g - 1];
    }

    /* renamed from: j */
    private Object m21972j() {
        Object[] objArr = this.f15385f;
        int i = this.f15386g - 1;
        this.f15386g = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private String locationString() {
        return " at path " + getPath();
    }

    /* renamed from: o */
    private void m21973o(Object obj) {
        int i = this.f15386g;
        Object[] objArr = this.f15385f;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f15388i, 0, iArr, 0, this.f15386g);
            System.arraycopy(this.f15387h, 0, strArr, 0, this.f15386g);
            this.f15385f = objArr2;
            this.f15388i = iArr;
            this.f15387h = strArr;
        }
        Object[] objArr3 = this.f15385f;
        int i2 = this.f15386g;
        this.f15386g = i2 + 1;
        objArr3[i2] = obj;
    }

    public void beginArray() throws IOException {
        m21970a(JsonToken.BEGIN_ARRAY);
        m21973o(((C5230i) m21971h()).iterator());
        this.f15388i[this.f15386g - 1] = 0;
    }

    public void beginObject() throws IOException {
        m21970a(JsonToken.BEGIN_OBJECT);
        m21973o(((C5236o) m21971h()).mo15388p().iterator());
    }

    public void close() throws IOException {
        this.f15385f = new Object[]{f15384j};
        this.f15386g = 1;
    }

    public void endArray() throws IOException {
        m21970a(JsonToken.END_ARRAY);
        m21972j();
        m21972j();
        int i = this.f15386g;
        if (i > 0) {
            int[] iArr = this.f15388i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public void endObject() throws IOException {
        m21970a(JsonToken.END_OBJECT);
        m21972j();
        m21972j();
        int i = this.f15386g;
        if (i > 0) {
            int[] iArr = this.f15388i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f15386g) {
            Object[] objArr = this.f15385f;
            if (objArr[i] instanceof C5230i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f15388i[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C5236o) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f15387h;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    /* renamed from: m */
    public void mo15495m() throws IOException {
        m21970a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m21971h()).next();
        m21973o(entry.getValue());
        m21973o(new C5238q((String) entry.getKey()));
    }

    public boolean nextBoolean() throws IOException {
        m21970a(JsonToken.BOOLEAN);
        boolean o = ((C5238q) m21972j()).mo15394o();
        int i = this.f15386g;
        if (i > 0) {
            int[] iArr = this.f15388i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return o;
    }

    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            double q = ((C5238q) m21971h()).mo15396q();
            if (isLenient() || (!Double.isNaN(q) && !Double.isInfinite(q))) {
                m21972j();
                int i = this.f15386g;
                if (i > 0) {
                    int[] iArr = this.f15388i;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return q;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + q);
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + locationString());
    }

    public int nextInt() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            int r = ((C5238q) m21971h()).mo15397r();
            m21972j();
            int i = this.f15386g;
            if (i > 0) {
                int[] iArr = this.f15388i;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return r;
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + locationString());
    }

    public long nextLong() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            long t = ((C5238q) m21971h()).mo15398t();
            m21972j();
            int i = this.f15386g;
            if (i > 0) {
                int[] iArr = this.f15388i;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return t;
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + locationString());
    }

    public String nextName() throws IOException {
        m21970a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m21971h()).next();
        String str = (String) entry.getKey();
        this.f15387h[this.f15386g - 1] = str;
        m21973o(entry.getValue());
        return str;
    }

    public void nextNull() throws IOException {
        m21970a(JsonToken.NULL);
        m21972j();
        int i = this.f15386g;
        if (i > 0) {
            int[] iArr = this.f15388i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String nextString() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.STRING || peek == JsonToken.NUMBER) {
            String w = ((C5238q) m21972j()).mo15400w();
            int i = this.f15386g;
            if (i > 0) {
                int[] iArr = this.f15388i;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return w;
        }
        throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + peek + locationString());
    }

    public JsonToken peek() throws IOException {
        if (this.f15386g == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object h = m21971h();
        if (h instanceof Iterator) {
            boolean z = this.f15385f[this.f15386g - 2] instanceof C5236o;
            Iterator it = (Iterator) h;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            m21973o(it.next());
            return peek();
        } else if (h instanceof C5236o) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (h instanceof C5230i) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (h instanceof C5238q) {
                C5238q qVar = (C5238q) h;
                if (qVar.mo15390D()) {
                    return JsonToken.STRING;
                }
                if (qVar.mo15401x()) {
                    return JsonToken.BOOLEAN;
                }
                if (qVar.mo15389B()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (h instanceof C5235n) {
                return JsonToken.NULL;
            } else {
                if (h == f15384j) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f15387h[this.f15386g - 2] = "null";
        } else {
            m21972j();
            int i = this.f15386g;
            if (i > 0) {
                this.f15387h[i - 1] = "null";
            }
        }
        int i2 = this.f15386g;
        if (i2 > 0) {
            int[] iArr = this.f15388i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String toString() {
        return C5304e.class.getSimpleName();
    }
}
