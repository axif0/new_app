package p374m;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.HttpConnection;
import p374m.p375g0.C6130c;
import p385n.C6277c;
import p385n.C6280d;

/* renamed from: m.q */
public final class C6252q extends C6103b0 {

    /* renamed from: c */
    private static final C6261v f17639c = C6261v.m25703b(HttpConnection.FORM_URL_ENCODED);

    /* renamed from: a */
    private final List<String> f17640a;

    /* renamed from: b */
    private final List<String> f17641b;

    /* renamed from: m.q$a */
    public static final class C6253a {

        /* renamed from: a */
        private final List<String> f17642a;

        /* renamed from: b */
        private final List<String> f17643b;

        /* renamed from: c */
        private final Charset f17644c;

        public C6253a() {
            this((Charset) null);
        }

        public C6253a(Charset charset) {
            this.f17642a = new ArrayList();
            this.f17643b = new ArrayList();
            this.f17644c = charset;
        }

        /* renamed from: a */
        public C6253a mo17672a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f17642a.add(C6257t.m25648c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f17644c));
                this.f17643b.add(C6257t.m25648c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f17644c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public C6253a mo17673b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f17642a.add(C6257t.m25648c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f17644c));
                this.f17643b.add(C6257t.m25648c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f17644c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: c */
        public C6252q mo17674c() {
            return new C6252q(this.f17642a, this.f17643b);
        }
    }

    C6252q(List<String> list, List<String> list2) {
        this.f17640a = C6130c.m25057t(list);
        this.f17641b = C6130c.m25057t(list2);
    }

    /* renamed from: g */
    private long m25615g(C6280d dVar, boolean z) {
        C6277c cVar = z ? new C6277c() : dVar.mo17813b();
        int size = this.f17640a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.mo17852t0(38);
            }
            cVar.mo17864z0(this.f17640a.get(i));
            cVar.mo17852t0(61);
            cVar.mo17864z0(this.f17641b.get(i));
        }
        if (!z) {
            return 0;
        }
        long l0 = cVar.mo17834l0();
        cVar.mo17840q();
        return l0;
    }

    /* renamed from: a */
    public long mo17233a() {
        return m25615g((C6280d) null, true);
    }

    /* renamed from: b */
    public C6261v mo17234b() {
        return f17639c;
    }

    /* renamed from: f */
    public void mo17235f(C6280d dVar) throws IOException {
        m25615g(dVar, false);
    }
}
