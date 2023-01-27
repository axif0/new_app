package p386o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p374m.C6099a0;
import p386o.C6312c;

/* renamed from: o.g */
final class C6324g extends C6312c.C6313a {

    /* renamed from: a */
    private final Executor f17840a;

    /* renamed from: o.g$a */
    class C6325a implements C6312c<Object, C6311b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f17841a;

        /* renamed from: b */
        final /* synthetic */ Executor f17842b;

        C6325a(C6324g gVar, Type type, Executor executor) {
            this.f17841a = type;
            this.f17842b = executor;
        }

        /* renamed from: a */
        public Type mo17945a() {
            return this.f17841a;
        }

        /* renamed from: c */
        public C6311b<Object> mo17946b(C6311b<Object> bVar) {
            Executor executor = this.f17842b;
            return executor == null ? bVar : new C6326b(executor, bVar);
        }
    }

    /* renamed from: o.g$b */
    static final class C6326b<T> implements C6311b<T> {

        /* renamed from: f */
        final Executor f17843f;

        /* renamed from: g */
        final C6311b<T> f17844g;

        /* renamed from: o.g$b$a */
        class C6327a implements C6314d<T> {

            /* renamed from: a */
            final /* synthetic */ C6314d f17845a;

            /* renamed from: o.g$b$a$a */
            class C6328a implements Runnable {

                /* renamed from: f */
                final /* synthetic */ C6372r f17847f;

                C6328a(C6372r rVar) {
                    this.f17847f = rVar;
                }

                public void run() {
                    if (C6326b.this.f17844g.mo17942j()) {
                        C6327a aVar = C6327a.this;
                        aVar.f17845a.mo416b(C6326b.this, new IOException("Canceled"));
                        return;
                    }
                    C6327a aVar2 = C6327a.this;
                    aVar2.f17845a.mo415a(C6326b.this, this.f17847f);
                }
            }

            /* renamed from: o.g$b$a$b */
            class C6329b implements Runnable {

                /* renamed from: f */
                final /* synthetic */ Throwable f17849f;

                C6329b(Throwable th) {
                    this.f17849f = th;
                }

                public void run() {
                    C6327a aVar = C6327a.this;
                    aVar.f17845a.mo416b(C6326b.this, this.f17849f);
                }
            }

            C6327a(C6314d dVar) {
                this.f17845a = dVar;
            }

            /* renamed from: a */
            public void mo415a(C6311b<T> bVar, C6372r<T> rVar) {
                C6326b.this.f17843f.execute(new C6328a(rVar));
            }

            /* renamed from: b */
            public void mo416b(C6311b<T> bVar, Throwable th) {
                C6326b.this.f17843f.execute(new C6329b(th));
            }
        }

        C6326b(Executor executor, C6311b<T> bVar) {
            this.f17843f = executor;
            this.f17844g = bVar;
        }

        /* renamed from: X */
        public void mo17940X(C6314d<T> dVar) {
            C6379w.m26209b(dVar, "callback == null");
            this.f17844g.mo17940X(new C6327a(dVar));
        }

        public void cancel() {
            this.f17844g.cancel();
        }

        /* renamed from: j */
        public boolean mo17942j() {
            return this.f17844g.mo17942j();
        }

        /* renamed from: o */
        public C6311b<T> clone() {
            return new C6326b(this.f17843f, this.f17844g.mo17943o());
        }

        public C6099a0 request() {
            return this.f17844g.request();
        }
    }

    C6324g(Executor executor) {
        this.f17840a = executor;
    }

    /* renamed from: a */
    public C6312c<?, ?> mo17947a(Type type, Annotation[] annotationArr, C6373s sVar) {
        Executor executor = null;
        if (C6312c.C6313a.m26044c(type) != C6311b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type h = C6379w.m26215h(0, (ParameterizedType) type);
            if (!C6379w.m26220m(annotationArr, C6377u.class)) {
                executor = this.f17840a;
            }
            return new C6325a(this, h, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
