package p148g.p189d.p289c;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p148g.p189d.p289c.p291y.C5258c;
import p148g.p189d.p289c.p291y.C5273d;
import p148g.p189d.p289c.p291y.C5288k;
import p148g.p189d.p289c.p291y.C5289l;
import p148g.p189d.p289c.p291y.p292n.C5297a;
import p148g.p189d.p289c.p291y.p292n.C5299b;
import p148g.p189d.p289c.p291y.p292n.C5301c;
import p148g.p189d.p289c.p291y.p292n.C5303d;
import p148g.p189d.p289c.p291y.p292n.C5308g;
import p148g.p189d.p289c.p291y.p292n.C5310h;
import p148g.p189d.p289c.p291y.p292n.C5313i;
import p148g.p189d.p289c.p291y.p292n.C5317j;
import p148g.p189d.p289c.p291y.p292n.C5319k;
import p148g.p189d.p289c.p291y.p292n.C5325n;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.f */
public final class C5221f {

    /* renamed from: k */
    private static final C5368a<?> f15272k = C5368a.m22161a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C5368a<?>, C5227f<?>>> f15273a;

    /* renamed from: b */
    private final Map<C5368a<?>, C5245v<?>> f15274b;

    /* renamed from: c */
    private final C5258c f15275c;

    /* renamed from: d */
    private final C5303d f15276d;

    /* renamed from: e */
    final List<C5247w> f15277e;

    /* renamed from: f */
    final boolean f15278f;

    /* renamed from: g */
    final boolean f15279g;

    /* renamed from: h */
    final boolean f15280h;

    /* renamed from: i */
    final boolean f15281i;

    /* renamed from: j */
    final boolean f15282j;

    /* renamed from: g.d.c.f$a */
    class C5222a extends C5245v<Number> {
        C5222a(C5221f fVar) {
        }

        /* renamed from: e */
        public Double mo15331b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: f */
        public void mo15332d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            C5221f.m21781d(number.doubleValue());
            jsonWriter.value(number);
        }
    }

    /* renamed from: g.d.c.f$b */
    class C5223b extends C5245v<Number> {
        C5223b(C5221f fVar) {
        }

        /* renamed from: e */
        public Float mo15331b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: f */
        public void mo15332d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            C5221f.m21781d((double) number.floatValue());
            jsonWriter.value(number);
        }
    }

    /* renamed from: g.d.c.f$c */
    static class C5224c extends C5245v<Number> {
        C5224c() {
        }

        /* renamed from: e */
        public Number mo15331b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: f */
        public void mo15332d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* renamed from: g.d.c.f$d */
    static class C5225d extends C5245v<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C5245v f15283a;

        C5225d(C5245v vVar) {
            this.f15283a = vVar;
        }

        /* renamed from: e */
        public AtomicLong mo15331b(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f15283a.mo15331b(jsonReader)).longValue());
        }

        /* renamed from: f */
        public void mo15332d(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f15283a.mo15332d(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: g.d.c.f$e */
    static class C5226e extends C5245v<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C5245v f15284a;

        C5226e(C5245v vVar) {
            this.f15284a = vVar;
        }

        /* renamed from: e */
        public AtomicLongArray mo15331b(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f15284a.mo15331b(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void mo15332d(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f15284a.mo15332d(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: g.d.c.f$f */
    static class C5227f<T> extends C5245v<T> {

        /* renamed from: a */
        private C5245v<T> f15285a;

        C5227f() {
        }

        /* renamed from: b */
        public T mo15331b(JsonReader jsonReader) throws IOException {
            C5245v<T> vVar = this.f15285a;
            if (vVar != null) {
                return vVar.mo15331b(jsonReader);
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public void mo15332d(JsonWriter jsonWriter, T t) throws IOException {
            C5245v<T> vVar = this.f15285a;
            if (vVar != null) {
                vVar.mo15332d(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void mo15366e(C5245v<T> vVar) {
            if (this.f15285a == null) {
                this.f15285a = vVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public C5221f() {
        this(C5273d.f15329l, C5213d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C5242u.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C5221f(C5273d dVar, C5220e eVar, Map<Type, C5229h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C5242u uVar, String str, int i, int i2, List<C5247w> list, List<C5247w> list2, List<C5247w> list3) {
        C5273d dVar2 = dVar;
        boolean z8 = z7;
        this.f15273a = new ThreadLocal<>();
        this.f15274b = new ConcurrentHashMap();
        Map<Type, C5229h<?>> map2 = map;
        this.f15275c = new C5258c(map);
        this.f15278f = z;
        this.f15279g = z3;
        this.f15280h = z4;
        this.f15281i = z5;
        this.f15282j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5325n.f15457Y);
        arrayList.add(C5310h.f15400b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C5325n.f15436D);
        arrayList.add(C5325n.f15471m);
        arrayList.add(C5325n.f15465g);
        arrayList.add(C5325n.f15467i);
        arrayList.add(C5325n.f15469k);
        C5245v<Number> n = m21784n(uVar);
        arrayList.add(C5325n.m22019b(Long.TYPE, Long.class, n));
        arrayList.add(C5325n.m22019b(Double.TYPE, Double.class, m21782e(z8)));
        arrayList.add(C5325n.m22019b(Float.TYPE, Float.class, m21783f(z8)));
        arrayList.add(C5325n.f15482x);
        arrayList.add(C5325n.f15473o);
        arrayList.add(C5325n.f15475q);
        arrayList.add(C5325n.m22018a(AtomicLong.class, m21779b(n)));
        arrayList.add(C5325n.m22018a(AtomicLongArray.class, m21780c(n)));
        arrayList.add(C5325n.f15477s);
        arrayList.add(C5325n.f15484z);
        arrayList.add(C5325n.f15438F);
        arrayList.add(C5325n.f15440H);
        arrayList.add(C5325n.m22018a(BigDecimal.class, C5325n.f15434B));
        arrayList.add(C5325n.m22018a(BigInteger.class, C5325n.f15435C));
        arrayList.add(C5325n.f15442J);
        arrayList.add(C5325n.f15444L);
        arrayList.add(C5325n.f15448P);
        arrayList.add(C5325n.f15450R);
        arrayList.add(C5325n.f15455W);
        arrayList.add(C5325n.f15446N);
        arrayList.add(C5325n.f15462d);
        arrayList.add(C5301c.f15381b);
        arrayList.add(C5325n.f15453U);
        arrayList.add(C5319k.f15421b);
        arrayList.add(C5317j.f15419b);
        arrayList.add(C5325n.f15451S);
        arrayList.add(C5297a.f15375c);
        arrayList.add(C5325n.f15460b);
        arrayList.add(new C5299b(this.f15275c));
        boolean z9 = z2;
        arrayList.add(new C5308g(this.f15275c, z2));
        C5303d dVar3 = new C5303d(this.f15275c);
        this.f15276d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(C5325n.f15458Z);
        C5220e eVar2 = eVar;
        arrayList.add(new C5313i(this.f15275c, eVar, dVar, this.f15276d));
        this.f15277e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static void m21778a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new C5234m("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new C5241t((Throwable) e);
            } catch (IOException e2) {
                throw new C5234m((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C5245v<AtomicLong> m21779b(C5245v<Number> vVar) {
        return new C5225d(vVar).mo15403a();
    }

    /* renamed from: c */
    private static C5245v<AtomicLongArray> m21780c(C5245v<Number> vVar) {
        return new C5226e(vVar).mo15403a();
    }

    /* renamed from: d */
    static void m21781d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private C5245v<Number> m21782e(boolean z) {
        return z ? C5325n.f15480v : new C5222a(this);
    }

    /* renamed from: f */
    private C5245v<Number> m21783f(boolean z) {
        return z ? C5325n.f15479u : new C5223b(this);
    }

    /* renamed from: n */
    private static C5245v<Number> m21784n(C5242u uVar) {
        return uVar == C5242u.DEFAULT ? C5325n.f15478t : new C5224c();
    }

    /* renamed from: g */
    public <T> T mo15339g(JsonReader jsonReader, Type type) throws C5234m, C5241t {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            T b = mo15343k(C5368a.m22162b(type)).mo15331b(jsonReader);
            jsonReader.setLenient(isLenient);
            return b;
        } catch (EOFException e) {
            if (1 != 0) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new C5241t((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C5241t((Throwable) e2);
        } catch (IOException e3) {
            throw new C5241t((Throwable) e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: h */
    public <T> T mo15340h(Reader reader, Type type) throws C5234m, C5241t {
        JsonReader o = mo15346o(reader);
        T g = mo15339g(o, type);
        m21778a(g, o);
        return g;
    }

    /* renamed from: i */
    public <T> T mo15341i(String str, Class<T> cls) throws C5241t {
        return C5288k.m21943c(cls).cast(mo15342j(str, cls));
    }

    /* renamed from: j */
    public <T> T mo15342j(String str, Type type) throws C5241t {
        if (str == null) {
            return null;
        }
        return mo15340h(new StringReader(str), type);
    }

    /* renamed from: k */
    public <T> C5245v<T> mo15343k(C5368a<T> aVar) {
        C5245v<T> vVar = this.f15274b.get(aVar == null ? f15272k : aVar);
        if (vVar != null) {
            return vVar;
        }
        Map map = this.f15273a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f15273a.set(map);
            z = true;
        }
        C5227f fVar = (C5227f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C5227f fVar2 = new C5227f();
            map.put(aVar, fVar2);
            for (C5247w b : this.f15277e) {
                C5245v<T> b2 = b.mo15405b(this, aVar);
                if (b2 != null) {
                    fVar2.mo15366e(b2);
                    this.f15274b.put(aVar, b2);
                    return b2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f15273a.remove();
            }
        }
    }

    /* renamed from: l */
    public <T> C5245v<T> mo15344l(Class<T> cls) {
        return mo15343k(C5368a.m22161a(cls));
    }

    /* renamed from: m */
    public <T> C5245v<T> mo15345m(C5247w wVar, C5368a<T> aVar) {
        if (!this.f15277e.contains(wVar)) {
            wVar = this.f15276d;
        }
        boolean z = false;
        for (C5247w next : this.f15277e) {
            if (z) {
                C5245v<T> b = next.mo15405b(this, aVar);
                if (b != null) {
                    return b;
                }
            } else if (next == wVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: o */
    public JsonReader mo15346o(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f15282j);
        return jsonReader;
    }

    /* renamed from: p */
    public JsonWriter mo15347p(Writer writer) throws IOException {
        if (this.f15279g) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f15281i) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f15278f);
        return jsonWriter;
    }

    /* renamed from: q */
    public String mo15348q(C5233l lVar) {
        StringWriter stringWriter = new StringWriter();
        mo15353u(lVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: r */
    public String mo15349r(Object obj) {
        return obj == null ? mo15348q(C5235n.f15303a) : mo15350s(obj, obj.getClass());
    }

    /* renamed from: s */
    public String mo15350s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo15355w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: t */
    public void mo15351t(C5233l lVar, JsonWriter jsonWriter) throws C5234m {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f15280h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f15278f);
        try {
            C5289l.m21945b(lVar, jsonWriter);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new C5234m((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f15278f + ",factories:" + this.f15277e + ",instanceCreators:" + this.f15275c + "}";
    }

    /* renamed from: u */
    public void mo15353u(C5233l lVar, Appendable appendable) throws C5234m {
        try {
            mo15351t(lVar, mo15347p(C5289l.m21946c(appendable)));
        } catch (IOException e) {
            throw new C5234m((Throwable) e);
        }
    }

    /* renamed from: v */
    public void mo15354v(Object obj, Type type, JsonWriter jsonWriter) throws C5234m {
        C5245v<?> k = mo15343k(C5368a.m22162b(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f15280h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f15278f);
        try {
            k.mo15332d(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new C5234m((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    /* renamed from: w */
    public void mo15355w(Object obj, Type type, Appendable appendable) throws C5234m {
        try {
            mo15354v(obj, type, mo15347p(C5289l.m21946c(appendable)));
        } catch (IOException e) {
            throw new C5234m((Throwable) e);
        }
    }
}
