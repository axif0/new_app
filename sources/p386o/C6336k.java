package p386o;

import java.lang.reflect.Method;
import kotlinx.coroutines.C6039e;
import kotlinx.coroutines.C6043f;
import p351k.C5843c;
import p351k.C5850j;
import p351k.C5853k;
import p351k.C5859q;
import p351k.p355t.C5895d;
import p351k.p355t.p357i.p358a.C5912c;
import p351k.p355t.p357i.p358a.C5914e;
import p351k.p355t.p357i.p358a.C5916g;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5957h;

/* renamed from: o.k */
public final class C6336k {

    /* renamed from: o.k$a */
    static final class C6337a extends C5957h implements C5937l<Throwable, C5859q> {

        /* renamed from: f */
        final /* synthetic */ C6311b f17860f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6337a(C6311b bVar) {
            super(1);
            this.f17860f = bVar;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
            mo17961d((Throwable) obj);
            return C5859q.f16886a;
        }

        /* renamed from: d */
        public final void mo17961d(Throwable th) {
            this.f17860f.cancel();
        }
    }

    /* renamed from: o.k$b */
    static final class C6338b extends C5957h implements C5937l<Throwable, C5859q> {

        /* renamed from: f */
        final /* synthetic */ C6311b f17861f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6338b(C6311b bVar) {
            super(1);
            this.f17861f = bVar;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
            mo17962d((Throwable) obj);
            return C5859q.f16886a;
        }

        /* renamed from: d */
        public final void mo17962d(Throwable th) {
            this.f17861f.cancel();
        }
    }

    /* renamed from: o.k$c */
    public static final class C6339c implements C6314d<T> {

        /* renamed from: a */
        final /* synthetic */ C6039e f17862a;

        C6339c(C6039e eVar) {
            this.f17862a = eVar;
        }

        /* renamed from: a */
        public void mo415a(C6311b<T> bVar, C6372r<T> rVar) {
            T t;
            C6039e eVar;
            C5956g.m24501f(bVar, "call");
            C5956g.m24501f(rVar, "response");
            if (rVar.mo17995d()) {
                t = rVar.mo17993a();
                if (t == null) {
                    Object i = bVar.request().mo17220i(C6335j.class);
                    if (i != null) {
                        C5956g.m24497b(i, "call.request().tag(Invocation::class.java)!!");
                        Method a = ((C6335j) i).mo17959a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        C5956g.m24497b(a, "method");
                        Class<?> declaringClass = a.getDeclaringClass();
                        C5956g.m24497b(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(a.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        C5843c cVar = new C5843c(sb.toString());
                        eVar = this.f17862a;
                        C5850j.C5851a aVar = C5850j.f16880f;
                        t = C5853k.m24367a(cVar);
                    } else {
                        C5956g.m24506k();
                        throw null;
                    }
                } else {
                    eVar = this.f17862a;
                    C5850j.C5851a aVar2 = C5850j.f16880f;
                }
            } else {
                eVar = this.f17862a;
                C6330h hVar = new C6330h(rVar);
                C5850j.C5851a aVar3 = C5850j.f16880f;
                t = C5853k.m24367a(hVar);
            }
            C5850j.m24363a(t);
            eVar.mo16968b(t);
        }

        /* renamed from: b */
        public void mo416b(C6311b<T> bVar, Throwable th) {
            C5956g.m24501f(bVar, "call");
            C5956g.m24501f(th, "t");
            C6039e eVar = this.f17862a;
            C5850j.C5851a aVar = C5850j.f16880f;
            Object a = C5853k.m24367a(th);
            C5850j.m24363a(a);
            eVar.mo16968b(a);
        }
    }

    /* renamed from: o.k$d */
    public static final class C6340d implements C6314d<T> {

        /* renamed from: a */
        final /* synthetic */ C6039e f17863a;

        C6340d(C6039e eVar) {
            this.f17863a = eVar;
        }

        /* renamed from: a */
        public void mo415a(C6311b<T> bVar, C6372r<T> rVar) {
            T t;
            C6039e eVar;
            C5956g.m24501f(bVar, "call");
            C5956g.m24501f(rVar, "response");
            if (rVar.mo17995d()) {
                eVar = this.f17863a;
                t = rVar.mo17993a();
                C5850j.C5851a aVar = C5850j.f16880f;
            } else {
                eVar = this.f17863a;
                C6330h hVar = new C6330h(rVar);
                C5850j.C5851a aVar2 = C5850j.f16880f;
                t = C5853k.m24367a(hVar);
            }
            C5850j.m24363a(t);
            eVar.mo16968b(t);
        }

        /* renamed from: b */
        public void mo416b(C6311b<T> bVar, Throwable th) {
            C5956g.m24501f(bVar, "call");
            C5956g.m24501f(th, "t");
            C6039e eVar = this.f17863a;
            C5850j.C5851a aVar = C5850j.f16880f;
            Object a = C5853k.m24367a(th);
            C5850j.m24363a(a);
            eVar.mo16968b(a);
        }
    }

    /* renamed from: o.k$e */
    static final class C6341e extends C5957h implements C5937l<Throwable, C5859q> {

        /* renamed from: f */
        final /* synthetic */ C6311b f17864f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6341e(C6311b bVar) {
            super(1);
            this.f17864f = bVar;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
            mo17963d((Throwable) obj);
            return C5859q.f16886a;
        }

        /* renamed from: d */
        public final void mo17963d(Throwable th) {
            this.f17864f.cancel();
        }
    }

    /* renamed from: o.k$f */
    public static final class C6342f implements C6314d<T> {

        /* renamed from: a */
        final /* synthetic */ C6039e f17865a;

        C6342f(C6039e eVar) {
            this.f17865a = eVar;
        }

        /* renamed from: a */
        public void mo415a(C6311b<T> bVar, C6372r<T> rVar) {
            C5956g.m24501f(bVar, "call");
            C5956g.m24501f(rVar, "response");
            C6039e eVar = this.f17865a;
            C5850j.C5851a aVar = C5850j.f16880f;
            C5850j.m24363a(rVar);
            eVar.mo16968b(rVar);
        }

        /* renamed from: b */
        public void mo416b(C6311b<T> bVar, Throwable th) {
            C5956g.m24501f(bVar, "call");
            C5956g.m24501f(th, "t");
            C6039e eVar = this.f17865a;
            C5850j.C5851a aVar = C5850j.f16880f;
            Object a = C5853k.m24367a(th);
            C5850j.m24363a(a);
            eVar.mo16968b(a);
        }
    }

    @C5914e(mo16982c = "retrofit2/KotlinExtensions", mo16983f = "KotlinExtensions.kt", mo16984l = {100, 102}, mo16985m = "yieldAndThrow")
    /* renamed from: o.k$g */
    static final class C6343g extends C5912c {

        /* renamed from: i */
        /* synthetic */ Object f17866i;

        /* renamed from: j */
        int f17867j;

        /* renamed from: k */
        Object f17868k;

        C6343g(C5895d dVar) {
            super(dVar);
        }

        /* renamed from: f */
        public final Object mo16977f(Object obj) {
            this.f17866i = obj;
            this.f17867j |= Integer.MIN_VALUE;
            return C6336k.m26087d((Exception) null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m26084a(C6311b<T> bVar, C5895d<? super T> dVar) {
        C6043f fVar = new C6043f(C5908c.m24446a(dVar), 1);
        fVar.mo17109d(new C6337a(bVar));
        bVar.mo17940X(new C6339c(fVar));
        Object q = fVar.mo17123q();
        if (q == C5909d.m24447b()) {
            C5916g.m24470b(dVar);
        }
        return q;
    }

    /* renamed from: b */
    public static final <T> Object m26085b(C6311b<T> bVar, C5895d<? super T> dVar) {
        C6043f fVar = new C6043f(C5908c.m24446a(dVar), 1);
        fVar.mo17109d(new C6338b(bVar));
        bVar.mo17940X(new C6340d(fVar));
        Object q = fVar.mo17123q();
        if (q == C5909d.m24447b()) {
            C5916g.m24470b(dVar);
        }
        return q;
    }

    /* renamed from: c */
    public static final <T> Object m26086c(C6311b<T> bVar, C5895d<? super C6372r<T>> dVar) {
        C6043f fVar = new C6043f(C5908c.m24446a(dVar), 1);
        fVar.mo17109d(new C6341e(bVar));
        bVar.mo17940X(new C6342f(fVar));
        Object q = fVar.mo17123q();
        if (q == C5909d.m24447b()) {
            C5916g.m24470b(dVar);
        }
        return q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m26087d(java.lang.Exception r4, p351k.p355t.C5895d<?> r5) {
        /*
            boolean r0 = r5 instanceof p386o.C6336k.C6343g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            o.k$g r0 = (p386o.C6336k.C6343g) r0
            int r1 = r0.f17867j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17867j = r1
            goto L_0x0018
        L_0x0013:
            o.k$g r0 = new o.k$g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f17866i
            java.lang.Object r1 = p351k.p355t.p356h.C5909d.m24447b()
            int r2 = r0.f17867j
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f17868k
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r0 = r5 instanceof p351k.C5850j.C5852b
            if (r0 == 0) goto L_0x0049
            k.j$b r5 = (p351k.C5850j.C5852b) r5
            java.lang.Throwable r4 = r5.f16881f
            throw r4
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            boolean r2 = r5 instanceof p351k.C5850j.C5852b
            if (r2 != 0) goto L_0x004a
            r0.f17868k = r4
            r0.f17867j = r3
            java.lang.Object r5 = kotlinx.coroutines.C5997b1.m24566b(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            throw r4
        L_0x004a:
            k.j$b r5 = (p351k.C5850j.C5852b) r5
            java.lang.Throwable r4 = r5.f16881f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p386o.C6336k.m26087d(java.lang.Exception, k.t.d):java.lang.Object");
    }
}
