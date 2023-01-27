package p148g.p189d.p190a.p200b.p217n0;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import p148g.p189d.p190a.p200b.C3888i;
import p148g.p189d.p190a.p200b.p204k0.C3913c;
import p148g.p189d.p190a.p200b.p204k0.C3918h;
import p148g.p189d.p190a.p200b.p217n0.C4114c;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p217n0.C4129g;
import p148g.p189d.p190a.p200b.p229q0.C4237b;
import p148g.p189d.p190a.p200b.p229q0.C4238c;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.n0.d */
public final class C4121d implements C4126f, C4114c.C4119e {

    /* renamed from: a */
    private final Uri f13030a;

    /* renamed from: b */
    private final C4238c.C4239a f13031b;

    /* renamed from: c */
    private final C3918h f13032c;

    /* renamed from: d */
    private final int f13033d;

    /* renamed from: e */
    private final C4129g.C4130a f13034e;

    /* renamed from: f */
    private final String f13035f;

    /* renamed from: g */
    private final int f13036g;

    /* renamed from: h */
    private C4126f.C4127a f13037h;

    /* renamed from: i */
    private long f13038i;

    /* renamed from: j */
    private boolean f13039j;

    /* renamed from: g.d.a.b.n0.d$b */
    public static final class C4123b {

        /* renamed from: a */
        private final C4238c.C4239a f13040a;

        /* renamed from: b */
        private C3918h f13041b;

        /* renamed from: c */
        private String f13042c;

        /* renamed from: d */
        private int f13043d = -1;

        /* renamed from: e */
        private int f13044e = 1048576;

        public C4123b(C4238c.C4239a aVar) {
            this.f13040a = aVar;
        }

        /* renamed from: a */
        public C4121d mo13118a(Uri uri) {
            return mo13119b(uri, (Handler) null, (C4129g) null);
        }

        /* renamed from: b */
        public C4121d mo13119b(Uri uri, Handler handler, C4129g gVar) {
            if (this.f13041b == null) {
                this.f13041b = new C3913c();
            }
            return new C4121d(uri, this.f13040a, this.f13041b, this.f13043d, handler, gVar, this.f13042c, this.f13044e);
        }
    }

    private C4121d(Uri uri, C4238c.C4239a aVar, C3918h hVar, int i, Handler handler, C4129g gVar, String str, int i2) {
        this.f13030a = uri;
        this.f13031b = aVar;
        this.f13032c = hVar;
        this.f13033d = i;
        this.f13034e = new C4129g.C4130a(handler, gVar);
        this.f13035f = str;
        this.f13036g = i2;
    }

    /* renamed from: g */
    private void m17450g(long j, boolean z) {
        this.f13038i = j;
        this.f13039j = z;
        this.f13037h.mo12903c(this, new C4144l(this.f13038i, this.f13039j, false), (Object) null);
    }

    /* renamed from: a */
    public C4124e mo13113a(C4126f.C4128b bVar, C4237b bVar2) {
        C4260a.m18069a(bVar.f13045a == 0);
        return new C4114c(this.f13030a, this.f13031b.mo13373a(), this.f13032c.mo12733a(), this.f13033d, this.f13034e, this, bVar2, this.f13035f, this.f13036g);
    }

    /* renamed from: b */
    public void mo13114b() throws IOException {
    }

    /* renamed from: c */
    public void mo13115c(C4124e eVar) {
        ((C4114c) eVar).mo13097Q();
    }

    /* renamed from: d */
    public void mo13116d() {
        this.f13037h = null;
    }

    /* renamed from: e */
    public void mo13112e(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f13038i;
        }
        if (this.f13038i != j || this.f13039j != z) {
            m17450g(j, z);
        }
    }

    /* renamed from: f */
    public void mo13117f(C3888i iVar, boolean z, C4126f.C4127a aVar) {
        this.f13037h = aVar;
        m17450g(-9223372036854775807L, false);
    }
}
