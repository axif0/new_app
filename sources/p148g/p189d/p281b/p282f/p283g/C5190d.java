package p148g.p189d.p281b.p282f.p283g;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;
import p148g.p189d.p281b.p282f.C5183e;
import p148g.p189d.p281b.p282f.C5184f;

/* renamed from: g.d.b.f.g.d */
final class C5190d implements C5182d, C5184f {

    /* renamed from: a */
    private C5190d f15236a = null;

    /* renamed from: b */
    private boolean f15237b = true;

    /* renamed from: c */
    private final JsonWriter f15238c;

    /* renamed from: d */
    private final Map<Class<?>, C5181c<?>> f15239d;

    /* renamed from: e */
    private final Map<Class<?>, C5183e<?>> f15240e;

    C5190d(Writer writer, Map<Class<?>, C5181c<?>> map, Map<Class<?>, C5183e<?>> map2) {
        this.f15238c = new JsonWriter(writer);
        this.f15239d = map;
        this.f15240e = map2;
    }

    /* renamed from: p */
    private void m21710p() throws IOException {
        if (this.f15237b) {
            C5190d dVar = this.f15236a;
            if (dVar != null) {
                dVar.m21710p();
                this.f15236a.f15237b = false;
                this.f15236a = null;
                this.f15238c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C5182d mo15296a(String str, long j) throws IOException, C5180b {
        mo15311k(str, j);
        return this;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ C5182d mo15297b(String str, int i) throws IOException, C5180b {
        mo15310j(str, i);
        return this;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C5184f mo15300c(String str) throws IOException, C5180b {
        mo15309i(str);
        return this;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C5184f mo15301d(boolean z) throws IOException, C5180b {
        mo15313m(z);
        return this;
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C5182d mo15298e(String str, Object obj) throws IOException, C5180b {
        mo15312l(str, obj);
        return this;
    }

    /* renamed from: f */
    public C5190d mo15306f(int i) throws IOException, C5180b {
        m21710p();
        this.f15238c.value((long) i);
        return this;
    }

    /* renamed from: g */
    public C5190d mo15307g(long j) throws IOException, C5180b {
        m21710p();
        this.f15238c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5190d mo15308h(Object obj) throws IOException, C5180b {
        if (obj == null) {
            this.f15238c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f15238c.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    mo15314n((byte[]) obj);
                    return this;
                }
                this.f15238c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f15238c.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        mo15307g(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f15238c.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f15238c.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        mo15308h(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        mo15308h(objArr[i]);
                        i++;
                    }
                }
                this.f15238c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f15238c.beginArray();
                for (Object h : (Collection) obj) {
                    mo15308h(h);
                }
                this.f15238c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f15238c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo15312l((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new C5180b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.f15238c.endObject();
                return this;
            } else {
                C5181c cVar = this.f15239d.get(obj.getClass());
                if (cVar != null) {
                    this.f15238c.beginObject();
                    cVar.mo6037a(obj, this);
                    this.f15238c.endObject();
                    return this;
                }
                C5183e eVar = this.f15240e.get(obj.getClass());
                if (eVar != null) {
                    eVar.mo15299a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    mo15309i(((Enum) obj).name());
                    return this;
                } else {
                    throw new C5180b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                }
            }
        }
    }

    /* renamed from: i */
    public C5190d mo15309i(String str) throws IOException, C5180b {
        m21710p();
        this.f15238c.value(str);
        return this;
    }

    /* renamed from: j */
    public C5190d mo15310j(String str, int i) throws IOException, C5180b {
        m21710p();
        this.f15238c.name(str);
        mo15306f(i);
        return this;
    }

    /* renamed from: k */
    public C5190d mo15311k(String str, long j) throws IOException, C5180b {
        m21710p();
        this.f15238c.name(str);
        mo15307g(j);
        return this;
    }

    /* renamed from: l */
    public C5190d mo15312l(String str, Object obj) throws IOException, C5180b {
        m21710p();
        this.f15238c.name(str);
        if (obj == null) {
            this.f15238c.nullValue();
            return this;
        }
        mo15308h(obj);
        return this;
    }

    /* renamed from: m */
    public C5190d mo15313m(boolean z) throws IOException, C5180b {
        m21710p();
        this.f15238c.value(z);
        return this;
    }

    /* renamed from: n */
    public C5190d mo15314n(byte[] bArr) throws IOException, C5180b {
        m21710p();
        if (bArr == null) {
            this.f15238c.nullValue();
        } else {
            this.f15238c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo15315o() throws IOException {
        m21710p();
        this.f15238c.flush();
    }
}
