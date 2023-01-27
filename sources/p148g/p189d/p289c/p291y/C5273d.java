package p148g.p189d.p289c.p291y;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p289c.C5211b;
import p148g.p189d.p289c.C5212c;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p290x.C5248a;
import p148g.p189d.p289c.p290x.C5251d;
import p148g.p189d.p289c.p290x.C5252e;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.d */
public final class C5273d implements C5247w, Cloneable {

    /* renamed from: l */
    public static final C5273d f15329l = new C5273d();

    /* renamed from: f */
    private double f15330f = -1.0d;

    /* renamed from: g */
    private int f15331g = 136;

    /* renamed from: h */
    private boolean f15332h = true;

    /* renamed from: i */
    private boolean f15333i;

    /* renamed from: j */
    private List<C5211b> f15334j = Collections.emptyList();

    /* renamed from: k */
    private List<C5211b> f15335k = Collections.emptyList();

    /* renamed from: g.d.c.y.d$a */
    class C5274a extends C5245v<T> {

        /* renamed from: a */
        private C5245v<T> f15336a;

        /* renamed from: b */
        final /* synthetic */ boolean f15337b;

        /* renamed from: c */
        final /* synthetic */ boolean f15338c;

        /* renamed from: d */
        final /* synthetic */ C5221f f15339d;

        /* renamed from: e */
        final /* synthetic */ C5368a f15340e;

        C5274a(boolean z, boolean z2, C5221f fVar, C5368a aVar) {
            this.f15337b = z;
            this.f15338c = z2;
            this.f15339d = fVar;
            this.f15340e = aVar;
        }

        /* renamed from: e */
        private C5245v<T> m21913e() {
            C5245v<T> vVar = this.f15336a;
            if (vVar != null) {
                return vVar;
            }
            C5245v<T> m = this.f15339d.mo15345m(C5273d.this, this.f15340e);
            this.f15336a = m;
            return m;
        }

        /* renamed from: b */
        public T mo15331b(JsonReader jsonReader) throws IOException {
            if (!this.f15337b) {
                return m21913e().mo15331b(jsonReader);
            }
            jsonReader.skipValue();
            return null;
        }

        /* renamed from: d */
        public void mo15332d(JsonWriter jsonWriter, T t) throws IOException {
            if (this.f15338c) {
                jsonWriter.nullValue();
            } else {
                m21913e().mo15332d(jsonWriter, t);
            }
        }
    }

    /* renamed from: e */
    private boolean m21901e(Class<?> cls) {
        if (this.f15330f == -1.0d || m21908q((C5251d) cls.getAnnotation(C5251d.class), (C5252e) cls.getAnnotation(C5252e.class))) {
            return (!this.f15332h && m21904k(cls)) || m21903i(cls);
        }
        return true;
    }

    /* renamed from: f */
    private boolean m21902f(Class<?> cls, boolean z) {
        for (C5211b a : z ? this.f15334j : this.f15335k) {
            if (a.mo15336a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m21903i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: k */
    private boolean m21904k(Class<?> cls) {
        return cls.isMemberClass() && !m21905l(cls);
    }

    /* renamed from: l */
    private boolean m21905l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: n */
    private boolean m21906n(C5251d dVar) {
        return dVar == null || dVar.value() <= this.f15330f;
    }

    /* renamed from: p */
    private boolean m21907p(C5252e eVar) {
        return eVar == null || eVar.value() > this.f15330f;
    }

    /* renamed from: q */
    private boolean m21908q(C5251d dVar, C5252e eVar) {
        return m21906n(dVar) && m21907p(eVar);
    }

    /* renamed from: b */
    public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
        Class<? super T> c = aVar.mo15578c();
        boolean e = m21901e(c);
        boolean z = e || m21902f(c, true);
        boolean z2 = e || m21902f(c, false);
        if (z || z2) {
            return new C5274a(z2, z, fVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C5273d clone() {
        try {
            return (C5273d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean mo15434d(Class<?> cls, boolean z) {
        return m21901e(cls) || m21902f(cls, z);
    }

    /* renamed from: g */
    public boolean mo15435g(Field field, boolean z) {
        C5248a aVar;
        if ((this.f15331g & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f15330f != -1.0d && !m21908q((C5251d) field.getAnnotation(C5251d.class), (C5252e) field.getAnnotation(C5252e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f15333i && ((aVar = (C5248a) field.getAnnotation(C5248a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f15332h && m21904k(field.getType())) || m21903i(field.getType())) {
            return true;
        }
        List<C5211b> list = z ? this.f15334j : this.f15335k;
        if (list.isEmpty()) {
            return false;
        }
        C5212c cVar = new C5212c(field);
        for (C5211b b : list) {
            if (b.mo15337b(cVar)) {
                return true;
            }
        }
        return false;
    }
}
