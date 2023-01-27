package p386o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p351k.C5859q;
import p374m.C6103b0;
import p374m.C6117d0;
import p386o.C6322f;
import p386o.p389y.C6405t;

/* renamed from: o.a */
final class C6304a extends C6322f.C6323a {

    /* renamed from: a */
    private boolean f17826a = true;

    /* renamed from: o.a$a */
    static final class C6305a implements C6322f<C6117d0, C6117d0> {

        /* renamed from: a */
        static final C6305a f17827a = new C6305a();

        C6305a() {
        }

        /* renamed from: b */
        public C6117d0 mo17933a(C6117d0 d0Var) throws IOException {
            try {
                return C6379w.m26208a(d0Var);
            } finally {
                d0Var.close();
            }
        }
    }

    /* renamed from: o.a$b */
    static final class C6306b implements C6322f<C6103b0, C6103b0> {

        /* renamed from: a */
        static final C6306b f17828a = new C6306b();

        C6306b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo17933a(Object obj) throws IOException {
            C6103b0 b0Var = (C6103b0) obj;
            mo17935b(b0Var);
            return b0Var;
        }

        /* renamed from: b */
        public C6103b0 mo17935b(C6103b0 b0Var) {
            return b0Var;
        }
    }

    /* renamed from: o.a$c */
    static final class C6307c implements C6322f<C6117d0, C6117d0> {

        /* renamed from: a */
        static final C6307c f17829a = new C6307c();

        C6307c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo17933a(Object obj) throws IOException {
            C6117d0 d0Var = (C6117d0) obj;
            mo17936b(d0Var);
            return d0Var;
        }

        /* renamed from: b */
        public C6117d0 mo17936b(C6117d0 d0Var) {
            return d0Var;
        }
    }

    /* renamed from: o.a$d */
    static final class C6308d implements C6322f<Object, String> {

        /* renamed from: a */
        static final C6308d f17830a = new C6308d();

        C6308d() {
        }

        /* renamed from: b */
        public String mo17933a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: o.a$e */
    static final class C6309e implements C6322f<C6117d0, C5859q> {

        /* renamed from: a */
        static final C6309e f17831a = new C6309e();

        C6309e() {
        }

        /* renamed from: b */
        public C5859q mo17933a(C6117d0 d0Var) {
            d0Var.close();
            return C5859q.f16886a;
        }
    }

    /* renamed from: o.a$f */
    static final class C6310f implements C6322f<C6117d0, Void> {

        /* renamed from: a */
        static final C6310f f17832a = new C6310f();

        C6310f() {
        }

        /* renamed from: b */
        public Void mo17933a(C6117d0 d0Var) {
            d0Var.close();
            return null;
        }
    }

    C6304a() {
    }

    /* renamed from: c */
    public C6322f<?, C6103b0> mo17931c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6373s sVar) {
        if (C6103b0.class.isAssignableFrom(C6379w.m26216i(type))) {
            return C6306b.f17828a;
        }
        return null;
    }

    /* renamed from: d */
    public C6322f<C6117d0, ?> mo17932d(Type type, Annotation[] annotationArr, C6373s sVar) {
        if (type == C6117d0.class) {
            return C6379w.m26220m(annotationArr, C6405t.class) ? C6307c.f17829a : C6305a.f17827a;
        }
        if (type == Void.class) {
            return C6310f.f17832a;
        }
        if (!this.f17826a || type != C5859q.class) {
            return null;
        }
        try {
            return C6309e.f17831a;
        } catch (NoClassDefFoundError unused) {
            this.f17826a = false;
            return null;
        }
    }
}
