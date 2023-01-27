package p386o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: o.c */
public interface C6312c<R, T> {

    /* renamed from: o.c$a */
    public static abstract class C6313a {
        /* renamed from: b */
        protected static Type m26043b(int i, ParameterizedType parameterizedType) {
            return C6379w.m26215h(i, parameterizedType);
        }

        /* renamed from: c */
        protected static Class<?> m26044c(Type type) {
            return C6379w.m26216i(type);
        }

        /* renamed from: a */
        public abstract C6312c<?, ?> mo17947a(Type type, Annotation[] annotationArr, C6373s sVar);
    }

    /* renamed from: a */
    Type mo17945a();

    /* renamed from: b */
    T mo17946b(C6311b<R> bVar);
}
