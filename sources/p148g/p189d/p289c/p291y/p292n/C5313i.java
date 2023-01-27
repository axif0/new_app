package p148g.p189d.p289c.p291y.p292n;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p148g.p189d.p289c.C5220e;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p290x.C5249b;
import p148g.p189d.p289c.p290x.C5250c;
import p148g.p189d.p289c.p291y.C5254b;
import p148g.p189d.p289c.p291y.C5258c;
import p148g.p189d.p289c.p291y.C5273d;
import p148g.p189d.p289c.p291y.C5286i;
import p148g.p189d.p289c.p291y.C5288k;
import p148g.p189d.p289c.p291y.p294o.C5366b;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.i */
public final class C5313i implements C5247w {

    /* renamed from: f */
    private final C5258c f15403f;

    /* renamed from: g */
    private final C5220e f15404g;

    /* renamed from: h */
    private final C5273d f15405h;

    /* renamed from: i */
    private final C5303d f15406i;

    /* renamed from: j */
    private final C5366b f15407j = C5366b.m22155a();

    /* renamed from: g.d.c.y.n.i$a */
    class C5314a extends C5316c {

        /* renamed from: d */
        final /* synthetic */ Field f15408d;

        /* renamed from: e */
        final /* synthetic */ boolean f15409e;

        /* renamed from: f */
        final /* synthetic */ C5245v f15410f;

        /* renamed from: g */
        final /* synthetic */ C5221f f15411g;

        /* renamed from: h */
        final /* synthetic */ C5368a f15412h;

        /* renamed from: i */
        final /* synthetic */ boolean f15413i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5314a(C5313i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C5245v vVar, C5221f fVar, C5368a aVar, boolean z4) {
            super(str, z, z2);
            this.f15408d = field;
            this.f15409e = z3;
            this.f15410f = vVar;
            this.f15411g = fVar;
            this.f15412h = aVar;
            this.f15413i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15505a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object b = this.f15410f.mo15331b(jsonReader);
            if (b != null || !this.f15413i) {
                this.f15408d.set(obj, b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15506b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            (this.f15409e ? this.f15410f : new C5324m(this.f15411g, this.f15410f, this.f15412h.mo15579e())).mo15332d(jsonWriter, this.f15408d.get(obj));
        }

        /* renamed from: c */
        public boolean mo15507c(Object obj) throws IOException, IllegalAccessException {
            return this.f15417b && this.f15408d.get(obj) != obj;
        }
    }

    /* renamed from: g.d.c.y.n.i$b */
    public static final class C5315b<T> extends C5245v<T> {

        /* renamed from: a */
        private final C5286i<T> f15414a;

        /* renamed from: b */
        private final Map<String, C5316c> f15415b;

        C5315b(C5286i<T> iVar, Map<String, C5316c> map) {
            this.f15414a = iVar;
            this.f15415b = map;
        }

        /* renamed from: b */
        public T mo15331b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a = this.f15414a.mo15431a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C5316c cVar = this.f15415b.get(jsonReader.nextName());
                    if (cVar != null) {
                        if (cVar.f15418c) {
                            cVar.mo15505a(jsonReader, a);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (IllegalStateException e) {
                throw new C5241t((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: d */
        public void mo15332d(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (C5316c next : this.f15415b.values()) {
                    if (next.mo15507c(t)) {
                        jsonWriter.name(next.f15416a);
                        next.mo15506b(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: g.d.c.y.n.i$c */
    static abstract class C5316c {

        /* renamed from: a */
        final String f15416a;

        /* renamed from: b */
        final boolean f15417b;

        /* renamed from: c */
        final boolean f15418c;

        protected C5316c(String str, boolean z, boolean z2) {
            this.f15416a = str;
            this.f15417b = z;
            this.f15418c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo15505a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo15506b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo15507c(Object obj) throws IOException, IllegalAccessException;
    }

    public C5313i(C5258c cVar, C5220e eVar, C5273d dVar, C5303d dVar2) {
        this.f15403f = cVar;
        this.f15404g = eVar;
        this.f15405h = dVar;
        this.f15406i = dVar2;
    }

    /* renamed from: a */
    private C5316c m21988a(C5221f fVar, Field field, String str, C5368a<?> aVar, boolean z, boolean z2) {
        C5221f fVar2 = fVar;
        C5368a<?> aVar2 = aVar;
        boolean b = C5288k.m21942b(aVar.mo15578c());
        Field field2 = field;
        C5249b bVar = (C5249b) field.getAnnotation(C5249b.class);
        C5245v<?> a = bVar != null ? this.f15406i.mo15494a(this.f15403f, fVar, aVar2, bVar) : null;
        boolean z3 = a != null;
        if (a == null) {
            a = fVar.mo15343k(aVar2);
        }
        return new C5314a(this, str, z, z2, field, z3, a, fVar, aVar, b);
    }

    /* renamed from: d */
    static boolean m21989d(Field field, boolean z, C5273d dVar) {
        return !dVar.mo15434d(field.getType(), z) && !dVar.mo15435g(field, z);
    }

    /* renamed from: e */
    private Map<String, C5316c> m21990e(C5221f fVar, C5368a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e = aVar.mo15579e();
        C5368a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c = mo15504c(field, true);
                boolean c2 = mo15504c(field, z);
                if (c || c2) {
                    this.f15407j.mo15576b(field);
                    Type p = C5254b.m21877p(aVar2.mo15579e(), cls2, field.getGenericType());
                    List<String> f = m21991f(field);
                    int size = f.size();
                    C5316c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c;
                        String str2 = str;
                        int i3 = i2;
                        C5316c cVar2 = cVar;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C5316c) linkedHashMap.put(str2, m21988a(fVar, field, str2, C5368a.m22162b(p), z2, c2)) : cVar2;
                        i2 = i3 + 1;
                        c = z2;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    C5316c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e + " declares multiple JSON fields named " + cVar3.f15416a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C5368a.m22162b(C5254b.m21877p(aVar2.mo15579e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo15578c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m21991f(Field field) {
        C5250c cVar = (C5250c) field.getAnnotation(C5250c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f15404g.mo15338e(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
        Class<? super T> c = aVar.mo15578c();
        if (!Object.class.isAssignableFrom(c)) {
            return null;
        }
        return new C5315b(this.f15403f.mo15429a(aVar), m21990e(fVar, aVar, c));
    }

    /* renamed from: c */
    public boolean mo15504c(Field field, boolean z) {
        return m21989d(field, z, this.f15405h);
    }
}
