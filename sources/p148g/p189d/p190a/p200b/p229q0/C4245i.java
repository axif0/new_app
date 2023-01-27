package p148g.p189d.p190a.p200b.p229q0;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p200b.p229q0.C4238c;

/* renamed from: g.d.a.b.q0.i */
public interface C4245i extends C4238c {

    /* renamed from: g.d.a.b.q0.i$a */
    public static abstract class C4246a implements C4238c.C4239a {

        /* renamed from: a */
        private final C4250e f13577a = new C4250e();

        /* renamed from: b */
        public final C4245i mo13373a() {
            return mo13380c(this.f13577a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract C4245i mo13380c(C4250e eVar);
    }

    /* renamed from: g.d.a.b.q0.i$b */
    public static class C4247b extends IOException {
        public C4247b(IOException iOException, C4241e eVar, int i) {
            super(iOException);
        }

        public C4247b(String str, C4241e eVar, int i) {
            super(str);
        }

        public C4247b(String str, IOException iOException, C4241e eVar, int i) {
            super(str, iOException);
        }
    }

    /* renamed from: g.d.a.b.q0.i$c */
    public static final class C4248c extends C4247b {
        public C4248c(String str, C4241e eVar) {
            super("Invalid content type: " + str, eVar, 1);
        }
    }

    /* renamed from: g.d.a.b.q0.i$d */
    public static final class C4249d extends C4247b {
        public C4249d(int i, Map<String, List<String>> map, C4241e eVar) {
            super("Response code: " + i, eVar, 1);
        }
    }

    /* renamed from: g.d.a.b.q0.i$e */
    public static final class C4250e {

        /* renamed from: a */
        private final Map<String, String> f13578a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f13579b;

        /* renamed from: a */
        public synchronized Map<String, String> mo13383a() {
            if (this.f13579b == null) {
                this.f13579b = Collections.unmodifiableMap(new HashMap(this.f13578a));
            }
            return this.f13579b;
        }
    }
}
