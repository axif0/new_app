package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.x7 */
final class C4858x7 implements C4490c9 {

    /* renamed from: b */
    private static final C4599i8 f14630b = new C4452a8();

    /* renamed from: a */
    private final C4599i8 f14631a;

    public C4858x7() {
        this(new C4902z7(C4451a7.m18715c(), m20583b()));
    }

    private C4858x7(C4599i8 i8Var) {
        C4470b7.m18818f(i8Var, "messageInfoFactory");
        this.f14631a = i8Var;
    }

    /* renamed from: b */
    private static C4599i8 m20583b() {
        try {
            return (C4599i8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f14630b;
        }
    }

    /* renamed from: c */
    private static boolean m20584c(C4619j8 j8Var) {
        return j8Var.mo14306a() == C4895z6.C4900e.f14688i;
    }

    /* renamed from: a */
    public final <T> C4453a9<T> mo13894a(Class<T> cls) {
        Class<C4895z6> cls2 = C4895z6.class;
        C4472b9.m18868p(cls);
        C4619j8 b = this.f14631a.mo13794b(cls);
        if (b.mo14307b()) {
            return cls2.isAssignableFrom(cls) ? C4759r8.m20280j(C4472b9.m18824B(), C4725p6.m20112a(), b.mo14308c()) : C4759r8.m20280j(C4472b9.m18858f(), C4725p6.m20113b(), b.mo14308c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean c = m20584c(b);
            C4793t8 b2 = C4826v8.m20500b();
            C4809u7 c2 = C4809u7.m20463c();
            C4777s9<?, ?> B = C4472b9.m18824B();
            if (c) {
                return C4727p8.m20146q(cls, b, b2, c2, B, C4725p6.m20112a(), C4564g8.m19529b());
            }
            return C4727p8.m20146q(cls, b, b2, c2, B, (C4709o6<?>) null, C4564g8.m19529b());
        }
        boolean c3 = m20584c(b);
        C4793t8 a = C4826v8.m20499a();
        C4809u7 a2 = C4809u7.m20462a();
        if (c3) {
            return C4727p8.m20146q(cls, b, a, a2, C4472b9.m18858f(), C4725p6.m20113b(), C4564g8.m19528a());
        }
        return C4727p8.m20146q(cls, b, a, a2, C4472b9.m18874v(), (C4709o6<?>) null, C4564g8.m19528a());
    }
}
