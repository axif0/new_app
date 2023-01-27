package p386o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p351k.p355t.C5895d;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6120e;
import p386o.C6379w;

/* renamed from: o.i */
abstract class C6331i<ResponseT, ReturnT> extends C6376t<ReturnT> {

    /* renamed from: a */
    private final C6370q f17851a;

    /* renamed from: b */
    private final C6120e.C6121a f17852b;

    /* renamed from: c */
    private final C6322f<C6117d0, ResponseT> f17853c;

    /* renamed from: o.i$a */
    static final class C6332a<ResponseT, ReturnT> extends C6331i<ResponseT, ReturnT> {

        /* renamed from: d */
        private final C6312c<ResponseT, ReturnT> f17854d;

        C6332a(C6370q qVar, C6120e.C6121a aVar, C6322f<C6117d0, ResponseT> fVar, C6312c<ResponseT, ReturnT> cVar) {
            super(qVar, aVar, fVar);
            this.f17854d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [o.b, o.b<ResponseT>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo17958c(p386o.C6311b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                o.c<ResponseT, ReturnT> r2 = r0.f17854d
                java.lang.Object r1 = r2.mo17946b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p386o.C6331i.C6332a.mo17958c(o.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: o.i$b */
    static final class C6333b<ResponseT> extends C6331i<ResponseT, Object> {

        /* renamed from: d */
        private final C6312c<ResponseT, C6311b<ResponseT>> f17855d;

        /* renamed from: e */
        private final boolean f17856e;

        C6333b(C6370q qVar, C6120e.C6121a aVar, C6322f<C6117d0, ResponseT> fVar, C6312c<ResponseT, C6311b<ResponseT>> cVar, boolean z) {
            super(qVar, aVar, fVar);
            this.f17855d = cVar;
            this.f17856e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo17958c(C6311b<ResponseT> bVar, Object[] objArr) {
            C6311b bVar2 = (C6311b) this.f17855d.mo17946b(bVar);
            C5895d dVar = objArr[objArr.length - 1];
            try {
                return this.f17856e ? C6336k.m26085b(bVar2, dVar) : C6336k.m26084a(bVar2, dVar);
            } catch (Exception e) {
                return C6336k.m26087d(e, dVar);
            }
        }
    }

    /* renamed from: o.i$c */
    static final class C6334c<ResponseT> extends C6331i<ResponseT, Object> {

        /* renamed from: d */
        private final C6312c<ResponseT, C6311b<ResponseT>> f17857d;

        C6334c(C6370q qVar, C6120e.C6121a aVar, C6322f<C6117d0, ResponseT> fVar, C6312c<ResponseT, C6311b<ResponseT>> cVar) {
            super(qVar, aVar, fVar);
            this.f17857d = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo17958c(C6311b<ResponseT> bVar, Object[] objArr) {
            C6311b bVar2 = (C6311b) this.f17857d.mo17946b(bVar);
            C5895d dVar = objArr[objArr.length - 1];
            try {
                return C6336k.m26086c(bVar2, dVar);
            } catch (Exception e) {
                return C6336k.m26087d(e, dVar);
            }
        }
    }

    C6331i(C6370q qVar, C6120e.C6121a aVar, C6322f<C6117d0, ResponseT> fVar) {
        this.f17851a = qVar;
        this.f17852b = aVar;
        this.f17853c = fVar;
    }

    /* renamed from: d */
    private static <ResponseT, ReturnT> C6312c<ResponseT, ReturnT> m26075d(C6373s sVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return sVar.mo17998a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C6379w.m26222o(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    private static <ResponseT> C6322f<C6117d0, ResponseT> m26076e(C6373s sVar, Method method, Type type) {
        try {
            return sVar.mo18005i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C6379w.m26222o(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    static <ResponseT, ReturnT> C6331i<ResponseT, ReturnT> m26077f(C6373s sVar, Method method, C6370q qVar) {
        Type type;
        boolean z;
        Class<C6372r> cls = C6372r.class;
        boolean z2 = qVar.f17948k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type g = C6379w.m26214g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C6379w.m26216i(g) != cls || !(g instanceof ParameterizedType)) {
                z = false;
            } else {
                g = C6379w.m26215h(0, (ParameterizedType) g);
                z = true;
            }
            type = new C6379w.C6381b((Type) null, C6311b.class, g);
            annotations = C6378v.m26207a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C6312c d = m26075d(sVar, method, type, annotations);
        Type a = d.mo17945a();
        if (a == C6113c0.class) {
            throw C6379w.m26221n(method, "'" + C6379w.m26216i(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a == cls) {
            throw C6379w.m26221n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!qVar.f17940c.equals("HEAD") || Void.class.equals(a)) {
            C6322f e = m26076e(sVar, method, a);
            C6120e.C6121a aVar = sVar.f17978b;
            return !z2 ? new C6332a(qVar, aVar, e, d) : z ? new C6334c(qVar, aVar, e, d) : new C6333b(qVar, aVar, e, d, false);
        } else {
            throw C6379w.m26221n(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ReturnT mo17957a(Object[] objArr) {
        return mo17958c(new C6344l(this.f17851a, objArr, this.f17852b, this.f17853c), objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ReturnT mo17958c(C6311b<ResponseT> bVar, Object[] objArr);
}
