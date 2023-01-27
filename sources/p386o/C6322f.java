package p386o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p374m.C6103b0;
import p374m.C6117d0;

/* renamed from: o.f */
public interface C6322f<F, T> {

    /* renamed from: o.f$a */
    public static abstract class C6323a {
        /* renamed from: a */
        protected static Type m26060a(int i, ParameterizedType parameterizedType) {
            return C6379w.m26215h(i, parameterizedType);
        }

        /* renamed from: b */
        protected static Class<?> m26061b(Type type) {
            return C6379w.m26216i(type);
        }

        /* renamed from: c */
        public C6322f<?, C6103b0> mo17931c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6373s sVar) {
            return null;
        }

        /* renamed from: d */
        public C6322f<C6117d0, ?> mo17932d(Type type, Annotation[] annotationArr, C6373s sVar) {
            return null;
        }

        /* renamed from: e */
        public C6322f<?, String> mo17952e(Type type, Annotation[] annotationArr, C6373s sVar) {
            return null;
        }
    }

    /* renamed from: a */
    T mo17933a(F f) throws IOException;
}
