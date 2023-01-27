package p386o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p374m.C6117d0;
import p386o.C6322f;

@IgnoreJRERequirement
/* renamed from: o.m */
final class C6349m extends C6322f.C6323a {

    /* renamed from: a */
    static final C6322f.C6323a f17885a = new C6349m();

    @IgnoreJRERequirement
    /* renamed from: o.m$a */
    static final class C6350a<T> implements C6322f<C6117d0, Optional<T>> {

        /* renamed from: a */
        final C6322f<C6117d0, T> f17886a;

        C6350a(C6322f<C6117d0, T> fVar) {
            this.f17886a = fVar;
        }

        /* renamed from: b */
        public Optional<T> mo17933a(C6117d0 d0Var) throws IOException {
            return Optional.ofNullable(this.f17886a.mo17933a(d0Var));
        }
    }

    C6349m() {
    }

    /* renamed from: d */
    public C6322f<C6117d0, ?> mo17932d(Type type, Annotation[] annotationArr, C6373s sVar) {
        if (C6322f.C6323a.m26061b(type) != Optional.class) {
            return null;
        }
        return new C6350a(sVar.mo18005i(C6322f.C6323a.m26060a(0, (ParameterizedType) type), annotationArr));
    }
}
