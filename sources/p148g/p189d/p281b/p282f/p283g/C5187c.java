package p148g.p189d.p281b.p282f.p283g;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p148g.p189d.p281b.p282f.C5179a;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5183e;
import p148g.p189d.p281b.p282f.C5184f;

/* renamed from: g.d.b.f.g.c */
public final class C5187c {

    /* renamed from: c */
    private static final C5183e<String> f15229c = C5185a.m21695b();

    /* renamed from: d */
    private static final C5183e<Boolean> f15230d = C5186b.m21697b();

    /* renamed from: e */
    private static final C5189b f15231e = new C5189b((C5188a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C5181c<?>> f15232a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C5183e<?>> f15233b = new HashMap();

    /* renamed from: g.d.b.f.g.c$a */
    class C5188a implements C5179a {
        C5188a() {
        }

        /* renamed from: a */
        public String mo15294a(Object obj) throws C5180b {
            StringWriter stringWriter = new StringWriter();
            try {
                mo15295b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        /* renamed from: b */
        public void mo15295b(Object obj, Writer writer) throws IOException, C5180b {
            C5190d dVar = new C5190d(writer, C5187c.this.f15232a, C5187c.this.f15233b);
            dVar.mo15308h(obj);
            dVar.mo15315o();
        }
    }

    /* renamed from: g.d.b.f.g.c$b */
    private static final class C5189b implements C5183e<Date> {

        /* renamed from: a */
        private static final DateFormat f15235a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f15235a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C5189b() {
        }

        /* synthetic */ C5189b(C5188a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo15299a(Date date, C5184f fVar) throws C5180b, IOException {
            fVar.mo15300c(f15235a.format(date));
        }
    }

    public C5187c() {
        mo15304g(String.class, f15229c);
        mo15304g(Boolean.class, f15230d);
        mo15304g(Date.class, f15231e);
    }

    /* renamed from: c */
    public C5179a mo15302c() {
        return new C5188a();
    }

    /* renamed from: f */
    public <T> C5187c mo15303f(Class<T> cls, C5181c<? super T> cVar) {
        if (!this.f15232a.containsKey(cls)) {
            this.f15232a.put(cls, cVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    /* renamed from: g */
    public <T> C5187c mo15304g(Class<T> cls, C5183e<? super T> eVar) {
        if (!this.f15233b.containsKey(cls)) {
            this.f15233b.put(cls, eVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
