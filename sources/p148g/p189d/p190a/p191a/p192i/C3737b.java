package p148g.p189d.p190a.p191a.p192i;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.C3728c;
import p148g.p189d.p190a.p191a.C3730e;
import p148g.p189d.p190a.p191a.p192i.C3753k;

/* renamed from: g.d.a.a.i.b */
final class C3737b extends C3753k {

    /* renamed from: a */
    private final C3755l f11382a;

    /* renamed from: b */
    private final String f11383b;

    /* renamed from: c */
    private final C3728c<?> f11384c;

    /* renamed from: d */
    private final C3730e<?, byte[]> f11385d;

    /* renamed from: e */
    private final C3727b f11386e;

    /* renamed from: g.d.a.a.i.b$b */
    static final class C3739b extends C3753k.C3754a {

        /* renamed from: a */
        private C3755l f11387a;

        /* renamed from: b */
        private String f11388b;

        /* renamed from: c */
        private C3728c<?> f11389c;

        /* renamed from: d */
        private C3730e<?, byte[]> f11390d;

        /* renamed from: e */
        private C3727b f11391e;

        C3739b() {
        }

        /* renamed from: a */
        public C3753k mo12313a() {
            C3755l lVar = this.f11387a;
            String str = BuildConfig.FLAVOR;
            if (lVar == null) {
                str = str + " transportContext";
            }
            if (this.f11388b == null) {
                str = str + " transportName";
            }
            if (this.f11389c == null) {
                str = str + " event";
            }
            if (this.f11390d == null) {
                str = str + " transformer";
            }
            if (this.f11391e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C3737b(this.f11387a, this.f11388b, this.f11389c, this.f11390d, this.f11391e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3753k.C3754a mo12314b(C3727b bVar) {
            if (bVar != null) {
                this.f11391e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3753k.C3754a mo12315c(C3728c<?> cVar) {
            if (cVar != null) {
                this.f11389c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3753k.C3754a mo12316d(C3730e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f11390d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: e */
        public C3753k.C3754a mo12317e(C3755l lVar) {
            if (lVar != null) {
                this.f11387a = lVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: f */
        public C3753k.C3754a mo12318f(String str) {
            if (str != null) {
                this.f11388b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    private C3737b(C3755l lVar, String str, C3728c<?> cVar, C3730e<?, byte[]> eVar, C3727b bVar) {
        this.f11382a = lVar;
        this.f11383b = str;
        this.f11384c = cVar;
        this.f11385d = eVar;
        this.f11386e = bVar;
    }

    /* renamed from: b */
    public C3727b mo12305b() {
        return this.f11386e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3728c<?> mo12306c() {
        return this.f11384c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3730e<?, byte[]> mo12307e() {
        return this.f11385d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3753k)) {
            return false;
        }
        C3753k kVar = (C3753k) obj;
        return this.f11382a.equals(kVar.mo12309f()) && this.f11383b.equals(kVar.mo12310g()) && this.f11384c.equals(kVar.mo12306c()) && this.f11385d.equals(kVar.mo12307e()) && this.f11386e.equals(kVar.mo12305b());
    }

    /* renamed from: f */
    public C3755l mo12309f() {
        return this.f11382a;
    }

    /* renamed from: g */
    public String mo12310g() {
        return this.f11383b;
    }

    public int hashCode() {
        return ((((((((this.f11382a.hashCode() ^ 1000003) * 1000003) ^ this.f11383b.hashCode()) * 1000003) ^ this.f11384c.hashCode()) * 1000003) ^ this.f11385d.hashCode()) * 1000003) ^ this.f11386e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f11382a + ", transportName=" + this.f11383b + ", event=" + this.f11384c + ", transformer=" + this.f11385d + ", encoding=" + this.f11386e + "}";
    }
}
