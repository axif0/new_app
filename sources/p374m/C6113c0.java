package p374m;

import java.io.Closeable;
import p374m.C6255s;

/* renamed from: m.c0 */
public final class C6113c0 implements Closeable {

    /* renamed from: f */
    final C6099a0 f17122f;

    /* renamed from: g */
    final C6268y f17123g;

    /* renamed from: h */
    final int f17124h;

    /* renamed from: i */
    final String f17125i;

    /* renamed from: j */
    final C6254r f17126j;

    /* renamed from: k */
    final C6255s f17127k;

    /* renamed from: l */
    final C6117d0 f17128l;

    /* renamed from: m */
    final C6113c0 f17129m;

    /* renamed from: n */
    final C6113c0 f17130n;

    /* renamed from: o */
    final C6113c0 f17131o;

    /* renamed from: p */
    final long f17132p;

    /* renamed from: q */
    final long f17133q;

    /* renamed from: r */
    private volatile C6115d f17134r;

    /* renamed from: m.c0$a */
    public static class C6114a {

        /* renamed from: a */
        C6099a0 f17135a;

        /* renamed from: b */
        C6268y f17136b;

        /* renamed from: c */
        int f17137c;

        /* renamed from: d */
        String f17138d;

        /* renamed from: e */
        C6254r f17139e;

        /* renamed from: f */
        C6255s.C6256a f17140f;

        /* renamed from: g */
        C6117d0 f17141g;

        /* renamed from: h */
        C6113c0 f17142h;

        /* renamed from: i */
        C6113c0 f17143i;

        /* renamed from: j */
        C6113c0 f17144j;

        /* renamed from: k */
        long f17145k;

        /* renamed from: l */
        long f17146l;

        public C6114a() {
            this.f17137c = -1;
            this.f17140f = new C6255s.C6256a();
        }

        C6114a(C6113c0 c0Var) {
            this.f17137c = -1;
            this.f17135a = c0Var.f17122f;
            this.f17136b = c0Var.f17123g;
            this.f17137c = c0Var.f17124h;
            this.f17138d = c0Var.f17125i;
            this.f17139e = c0Var.f17126j;
            this.f17140f = c0Var.f17127k.mo17684f();
            this.f17141g = c0Var.f17128l;
            this.f17142h = c0Var.f17129m;
            this.f17143i = c0Var.f17130n;
            this.f17144j = c0Var.f17131o;
            this.f17145k = c0Var.f17132p;
            this.f17146l = c0Var.f17133q;
        }

        /* renamed from: e */
        private void m24953e(C6113c0 c0Var) {
            if (c0Var.f17128l != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m24954f(String str, C6113c0 c0Var) {
            if (c0Var.f17128l != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (c0Var.f17129m != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (c0Var.f17130n != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (c0Var.f17131o != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: a */
        public C6114a mo17279a(String str, String str2) {
            this.f17140f.mo17690a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C6114a mo17280b(C6117d0 d0Var) {
            this.f17141g = d0Var;
            return this;
        }

        /* renamed from: c */
        public C6113c0 mo17281c() {
            if (this.f17135a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f17136b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f17137c < 0) {
                throw new IllegalStateException("code < 0: " + this.f17137c);
            } else if (this.f17138d != null) {
                return new C6113c0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: d */
        public C6114a mo17282d(C6113c0 c0Var) {
            if (c0Var != null) {
                m24954f("cacheResponse", c0Var);
            }
            this.f17143i = c0Var;
            return this;
        }

        /* renamed from: g */
        public C6114a mo17283g(int i) {
            this.f17137c = i;
            return this;
        }

        /* renamed from: h */
        public C6114a mo17284h(C6254r rVar) {
            this.f17139e = rVar;
            return this;
        }

        /* renamed from: i */
        public C6114a mo17285i(String str, String str2) {
            this.f17140f.mo17696g(str, str2);
            return this;
        }

        /* renamed from: j */
        public C6114a mo17286j(C6255s sVar) {
            this.f17140f = sVar.mo17684f();
            return this;
        }

        /* renamed from: k */
        public C6114a mo17287k(String str) {
            this.f17138d = str;
            return this;
        }

        /* renamed from: l */
        public C6114a mo17288l(C6113c0 c0Var) {
            if (c0Var != null) {
                m24954f("networkResponse", c0Var);
            }
            this.f17142h = c0Var;
            return this;
        }

        /* renamed from: m */
        public C6114a mo17289m(C6113c0 c0Var) {
            if (c0Var != null) {
                m24953e(c0Var);
            }
            this.f17144j = c0Var;
            return this;
        }

        /* renamed from: n */
        public C6114a mo17290n(C6268y yVar) {
            this.f17136b = yVar;
            return this;
        }

        /* renamed from: o */
        public C6114a mo17291o(long j) {
            this.f17146l = j;
            return this;
        }

        /* renamed from: p */
        public C6114a mo17292p(C6099a0 a0Var) {
            this.f17135a = a0Var;
            return this;
        }

        /* renamed from: q */
        public C6114a mo17293q(long j) {
            this.f17145k = j;
            return this;
        }
    }

    C6113c0(C6114a aVar) {
        this.f17122f = aVar.f17135a;
        this.f17123g = aVar.f17136b;
        this.f17124h = aVar.f17137c;
        this.f17125i = aVar.f17138d;
        this.f17126j = aVar.f17139e;
        this.f17127k = aVar.f17140f.mo17693d();
        this.f17128l = aVar.f17141g;
        this.f17129m = aVar.f17142h;
        this.f17130n = aVar.f17143i;
        this.f17131o = aVar.f17144j;
        this.f17132p = aVar.f17145k;
        this.f17133q = aVar.f17146l;
    }

    /* renamed from: D */
    public C6114a mo17260D() {
        return new C6114a(this);
    }

    /* renamed from: H */
    public C6113c0 mo17261H() {
        return this.f17131o;
    }

    /* renamed from: J */
    public C6268y mo17262J() {
        return this.f17123g;
    }

    /* renamed from: Q */
    public long mo17263Q() {
        return this.f17133q;
    }

    /* renamed from: S */
    public C6099a0 mo17264S() {
        return this.f17122f;
    }

    /* renamed from: V */
    public long mo17265V() {
        return this.f17132p;
    }

    /* renamed from: a */
    public C6117d0 mo17266a() {
        return this.f17128l;
    }

    public void close() {
        C6117d0 d0Var = this.f17128l;
        if (d0Var != null) {
            d0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: h */
    public C6115d mo17268h() {
        C6115d dVar = this.f17134r;
        if (dVar != null) {
            return dVar;
        }
        C6115d k = C6115d.m24971k(this.f17127k);
        this.f17134r = k;
        return k;
    }

    /* renamed from: j */
    public C6113c0 mo17269j() {
        return this.f17130n;
    }

    /* renamed from: m */
    public int mo17270m() {
        return this.f17124h;
    }

    /* renamed from: o */
    public C6254r mo17271o() {
        return this.f17126j;
    }

    /* renamed from: q */
    public String mo17272q(String str) {
        return mo17273r(str, (String) null);
    }

    /* renamed from: r */
    public String mo17273r(String str, String str2) {
        String c = this.f17127k.mo17681c(str);
        return c != null ? c : str2;
    }

    /* renamed from: t */
    public C6255s mo17274t() {
        return this.f17127k;
    }

    public String toString() {
        return "Response{protocol=" + this.f17123g + ", code=" + this.f17124h + ", message=" + this.f17125i + ", url=" + this.f17122f.mo17221j() + '}';
    }

    /* renamed from: u */
    public boolean mo17276u() {
        int i = this.f17124h;
        return i >= 200 && i < 300;
    }

    /* renamed from: w */
    public String mo17277w() {
        return this.f17125i;
    }

    /* renamed from: x */
    public C6113c0 mo17278x() {
        return this.f17129m;
    }
}
