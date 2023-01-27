package p374m.p375g0.p378g;

import java.io.IOException;
import java.util.List;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6120e;
import p374m.C6237i;
import p374m.C6248p;
import p374m.C6259u;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6155g;

/* renamed from: m.g0.g.g */
public final class C6165g implements C6259u.C6260a {

    /* renamed from: a */
    private final List<C6259u> f17329a;

    /* renamed from: b */
    private final C6155g f17330b;

    /* renamed from: c */
    private final C6160c f17331c;

    /* renamed from: d */
    private final C6150c f17332d;

    /* renamed from: e */
    private final int f17333e;

    /* renamed from: f */
    private final C6099a0 f17334f;

    /* renamed from: g */
    private final C6120e f17335g;

    /* renamed from: h */
    private final C6248p f17336h;

    /* renamed from: i */
    private final int f17337i;

    /* renamed from: j */
    private final int f17338j;

    /* renamed from: k */
    private final int f17339k;

    /* renamed from: l */
    private int f17340l;

    public C6165g(List<C6259u> list, C6155g gVar, C6160c cVar, C6150c cVar2, int i, C6099a0 a0Var, C6120e eVar, C6248p pVar, int i2, int i3, int i4) {
        this.f17329a = list;
        this.f17332d = cVar2;
        this.f17330b = gVar;
        this.f17331c = cVar;
        this.f17333e = i;
        this.f17334f = a0Var;
        this.f17335g = eVar;
        this.f17336h = pVar;
        this.f17337i = i2;
        this.f17338j = i3;
        this.f17339k = i4;
    }

    /* renamed from: a */
    public int mo17435a() {
        return this.f17337i;
    }

    /* renamed from: b */
    public int mo17436b() {
        return this.f17338j;
    }

    /* renamed from: c */
    public int mo17437c() {
        return this.f17339k;
    }

    /* renamed from: d */
    public C6113c0 mo17438d(C6099a0 a0Var) throws IOException {
        return mo17443i(a0Var, this.f17330b, this.f17331c, this.f17332d);
    }

    /* renamed from: e */
    public C6120e mo17439e() {
        return this.f17335g;
    }

    /* renamed from: f */
    public C6237i mo17440f() {
        return this.f17332d;
    }

    /* renamed from: g */
    public C6248p mo17441g() {
        return this.f17336h;
    }

    /* renamed from: h */
    public C6160c mo17442h() {
        return this.f17331c;
    }

    /* renamed from: i */
    public C6113c0 mo17443i(C6099a0 a0Var, C6155g gVar, C6160c cVar, C6150c cVar2) throws IOException {
        if (this.f17333e < this.f17329a.size()) {
            this.f17340l++;
            if (this.f17331c != null && !this.f17332d.mo17399s(a0Var.mo17221j())) {
                throw new IllegalStateException("network interceptor " + this.f17329a.get(this.f17333e - 1) + " must retain the same host and port");
            } else if (this.f17331c == null || this.f17340l <= 1) {
                C6165g gVar2 = new C6165g(this.f17329a, gVar, cVar, cVar2, this.f17333e + 1, a0Var, this.f17335g, this.f17336h, this.f17337i, this.f17338j, this.f17339k);
                C6259u uVar = this.f17329a.get(this.f17333e);
                C6113c0 a = uVar.mo16688a(gVar2);
                if (cVar != null && this.f17333e + 1 < this.f17329a.size() && gVar2.f17340l != 1) {
                    throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
                } else if (a == null) {
                    throw new NullPointerException("interceptor " + uVar + " returned null");
                } else if (a.mo17266a() != null) {
                    return a;
                } else {
                    throw new IllegalStateException("interceptor " + uVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f17329a.get(this.f17333e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: j */
    public C6155g mo17444j() {
        return this.f17330b;
    }

    public C6099a0 request() {
        return this.f17334f;
    }
}
