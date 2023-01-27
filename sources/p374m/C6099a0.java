package p374m;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p374m.C6255s;
import p374m.p375g0.C6130c;
import p374m.p375g0.p378g.C6164f;

/* renamed from: m.a0 */
public final class C6099a0 {

    /* renamed from: a */
    final C6257t f17070a;

    /* renamed from: b */
    final String f17071b;

    /* renamed from: c */
    final C6255s f17072c;

    /* renamed from: d */
    final C6103b0 f17073d;

    /* renamed from: e */
    final Map<Class<?>, Object> f17074e;

    /* renamed from: f */
    private volatile C6115d f17075f;

    /* renamed from: m.a0$a */
    public static class C6100a {

        /* renamed from: a */
        C6257t f17076a;

        /* renamed from: b */
        String f17077b;

        /* renamed from: c */
        C6255s.C6256a f17078c;

        /* renamed from: d */
        C6103b0 f17079d;

        /* renamed from: e */
        Map<Class<?>, Object> f17080e;

        public C6100a() {
            this.f17080e = Collections.emptyMap();
            this.f17077b = "GET";
            this.f17078c = new C6255s.C6256a();
        }

        C6100a(C6099a0 a0Var) {
            this.f17080e = Collections.emptyMap();
            this.f17076a = a0Var.f17070a;
            this.f17077b = a0Var.f17071b;
            this.f17079d = a0Var.f17073d;
            this.f17080e = a0Var.f17074e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(a0Var.f17074e);
            this.f17078c = a0Var.f17072c.mo17684f();
        }

        /* renamed from: a */
        public C6099a0 mo17223a() {
            if (this.f17076a != null) {
                return new C6099a0(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public C6100a mo17224b(C6115d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                mo17228f("Cache-Control");
                return this;
            }
            mo17225c("Cache-Control", dVar2);
            return this;
        }

        /* renamed from: c */
        public C6100a mo17225c(String str, String str2) {
            this.f17078c.mo17696g(str, str2);
            return this;
        }

        /* renamed from: d */
        public C6100a mo17226d(C6255s sVar) {
            this.f17078c = sVar.mo17684f();
            return this;
        }

        /* renamed from: e */
        public C6100a mo17227e(String str, C6103b0 b0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (b0Var != null && !C6164f.m25207b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (b0Var != null || !C6164f.m25210e(str)) {
                this.f17077b = str;
                this.f17079d = b0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: f */
        public C6100a mo17228f(String str) {
            this.f17078c.mo17695f(str);
            return this;
        }

        /* renamed from: g */
        public <T> C6100a mo17229g(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.f17080e.remove(cls);
                } else {
                    if (this.f17080e.isEmpty()) {
                        this.f17080e = new LinkedHashMap();
                    }
                    this.f17080e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        /* renamed from: h */
        public C6100a mo17230h(String str) {
            StringBuilder sb;
            int i;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    sb = new StringBuilder();
                    sb.append("http:");
                    i = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        sb = new StringBuilder();
                        sb.append("https:");
                        i = 4;
                    }
                    mo17231i(C6257t.m25651l(str));
                    return this;
                }
                sb.append(str.substring(i));
                str = sb.toString();
                mo17231i(C6257t.m25651l(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: i */
        public C6100a mo17231i(C6257t tVar) {
            if (tVar != null) {
                this.f17076a = tVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }

    C6099a0(C6100a aVar) {
        this.f17070a = aVar.f17076a;
        this.f17071b = aVar.f17077b;
        this.f17072c = aVar.f17078c.mo17693d();
        this.f17073d = aVar.f17079d;
        this.f17074e = C6130c.m25059v(aVar.f17080e);
    }

    /* renamed from: a */
    public C6103b0 mo17212a() {
        return this.f17073d;
    }

    /* renamed from: b */
    public C6115d mo17213b() {
        C6115d dVar = this.f17075f;
        if (dVar != null) {
            return dVar;
        }
        C6115d k = C6115d.m24971k(this.f17072c);
        this.f17075f = k;
        return k;
    }

    /* renamed from: c */
    public String mo17214c(String str) {
        return this.f17072c.mo17681c(str);
    }

    /* renamed from: d */
    public List<String> mo17215d(String str) {
        return this.f17072c.mo17688j(str);
    }

    /* renamed from: e */
    public C6255s mo17216e() {
        return this.f17072c;
    }

    /* renamed from: f */
    public boolean mo17217f() {
        return this.f17070a.mo17710n();
    }

    /* renamed from: g */
    public String mo17218g() {
        return this.f17071b;
    }

    /* renamed from: h */
    public C6100a mo17219h() {
        return new C6100a(this);
    }

    /* renamed from: i */
    public <T> T mo17220i(Class<? extends T> cls) {
        return cls.cast(this.f17074e.get(cls));
    }

    /* renamed from: j */
    public C6257t mo17221j() {
        return this.f17070a;
    }

    public String toString() {
        return "Request{method=" + this.f17071b + ", url=" + this.f17070a + ", tags=" + this.f17074e + '}';
    }
}
