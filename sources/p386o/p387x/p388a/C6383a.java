package p386o.p387x.p388a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.p295z.C5368a;
import p374m.C6103b0;
import p374m.C6117d0;
import p386o.C6322f;
import p386o.C6373s;

/* renamed from: o.x.a.a */
public final class C6383a extends C6322f.C6323a {

    /* renamed from: a */
    private final C5221f f18002a;

    private C6383a(C5221f fVar) {
        this.f18002a = fVar;
    }

    /* renamed from: f */
    public static C6383a m26229f(C5221f fVar) {
        if (fVar != null) {
            return new C6383a(fVar);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: c */
    public C6322f<?, C6103b0> mo17931c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6373s sVar) {
        return new C6384b(this.f18002a, this.f18002a.mo15343k(C5368a.m22162b(type)));
    }

    /* renamed from: d */
    public C6322f<C6117d0, ?> mo17932d(Type type, Annotation[] annotationArr, C6373s sVar) {
        return new C6385c(this.f18002a, this.f18002a.mo15343k(C5368a.m22162b(type)));
    }
}
