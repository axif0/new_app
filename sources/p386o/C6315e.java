package p386o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p386o.C6312c;

@IgnoreJRERequirement
/* renamed from: o.e */
final class C6315e extends C6312c.C6313a {

    /* renamed from: a */
    static final C6312c.C6313a f17833a = new C6315e();

    @IgnoreJRERequirement
    /* renamed from: o.e$a */
    private static final class C6316a<R> implements C6312c<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f17834a;

        /* renamed from: o.e$a$a */
        class C6317a extends CompletableFuture<R> {

            /* renamed from: f */
            final /* synthetic */ C6311b f17835f;

            C6317a(C6316a aVar, C6311b bVar) {
                this.f17835f = bVar;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.f17835f.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: o.e$a$b */
        class C6318b implements C6314d<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f17836a;

            C6318b(C6316a aVar, CompletableFuture completableFuture) {
                this.f17836a = completableFuture;
            }

            /* renamed from: a */
            public void mo415a(C6311b<R> bVar, C6372r<R> rVar) {
                if (rVar.mo17995d()) {
                    this.f17836a.complete(rVar.mo17993a());
                } else {
                    this.f17836a.completeExceptionally(new C6330h(rVar));
                }
            }

            /* renamed from: b */
            public void mo416b(C6311b<R> bVar, Throwable th) {
                this.f17836a.completeExceptionally(th);
            }
        }

        C6316a(Type type) {
            this.f17834a = type;
        }

        /* renamed from: a */
        public Type mo17945a() {
            return this.f17834a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo17946b(C6311b<R> bVar) {
            C6317a aVar = new C6317a(this, bVar);
            bVar.mo17940X(new C6318b(this, aVar));
            return aVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: o.e$b */
    private static final class C6319b<R> implements C6312c<R, CompletableFuture<C6372r<R>>> {

        /* renamed from: a */
        private final Type f17837a;

        /* renamed from: o.e$b$a */
        class C6320a extends CompletableFuture<C6372r<R>> {

            /* renamed from: f */
            final /* synthetic */ C6311b f17838f;

            C6320a(C6319b bVar, C6311b bVar2) {
                this.f17838f = bVar2;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.f17838f.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: o.e$b$b */
        class C6321b implements C6314d<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f17839a;

            C6321b(C6319b bVar, CompletableFuture completableFuture) {
                this.f17839a = completableFuture;
            }

            /* renamed from: a */
            public void mo415a(C6311b<R> bVar, C6372r<R> rVar) {
                this.f17839a.complete(rVar);
            }

            /* renamed from: b */
            public void mo416b(C6311b<R> bVar, Throwable th) {
                this.f17839a.completeExceptionally(th);
            }
        }

        C6319b(Type type) {
            this.f17837a = type;
        }

        /* renamed from: a */
        public Type mo17945a() {
            return this.f17837a;
        }

        /* renamed from: c */
        public CompletableFuture<C6372r<R>> mo17946b(C6311b<R> bVar) {
            C6320a aVar = new C6320a(this, bVar);
            bVar.mo17940X(new C6321b(this, aVar));
            return aVar;
        }
    }

    C6315e() {
    }

    /* renamed from: a */
    public C6312c<?, ?> mo17947a(Type type, Annotation[] annotationArr, C6373s sVar) {
        if (C6312c.C6313a.m26044c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C6312c.C6313a.m26043b(0, (ParameterizedType) type);
            if (C6312c.C6313a.m26044c(b) != C6372r.class) {
                return new C6316a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C6319b(C6312c.C6313a.m26043b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
