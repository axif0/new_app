package p351k.p361v.p363d;

import java.io.Serializable;
import p351k.p361v.C5925b;
import p351k.p366y.C5975a;
import p351k.p366y.C5977c;

/* renamed from: k.v.d.a */
public abstract class C5949a implements C5975a, Serializable {

    /* renamed from: l */
    public static final Object f16914l = C5950a.f16921f;

    /* renamed from: f */
    private transient C5975a f16915f;

    /* renamed from: g */
    protected final Object f16916g;

    /* renamed from: h */
    private final Class f16917h;

    /* renamed from: i */
    private final String f16918i;

    /* renamed from: j */
    private final String f16919j;

    /* renamed from: k */
    private final boolean f16920k;

    /* renamed from: k.v.d.a$a */
    private static class C5950a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C5950a f16921f = new C5950a();

        private C5950a() {
        }
    }

    public C5949a() {
        this(f16914l);
    }

    protected C5949a(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C5949a(Object obj, Class cls, String str, String str2, boolean z) {
        this.f16916g = obj;
        this.f16917h = cls;
        this.f16918i = str;
        this.f16919j = str2;
        this.f16920k = z;
    }

    /* renamed from: a */
    public Object mo16991a(Object... objArr) {
        return mo16997j().mo16991a(objArr);
    }

    /* renamed from: d */
    public C5975a mo16992d() {
        C5975a aVar = this.f16915f;
        if (aVar != null) {
            return aVar;
        }
        C5975a e = mo16993e();
        this.f16915f = e;
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C5975a mo16993e();

    /* renamed from: f */
    public Object mo16994f() {
        return this.f16916g;
    }

    /* renamed from: g */
    public String mo16995g() {
        return this.f16918i;
    }

    /* renamed from: h */
    public C5977c mo16996h() {
        Class cls = this.f16917h;
        if (cls == null) {
            return null;
        }
        return this.f16920k ? C5965p.m24521b(cls) : C5965p.m24520a(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C5975a mo16997j() {
        C5975a d = mo16992d();
        if (d != this) {
            return d;
        }
        throw new C5925b();
    }

    /* renamed from: k */
    public String mo16998k() {
        return this.f16919j;
    }
}
