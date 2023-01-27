package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4897b;

/* renamed from: g.d.a.c.f.f.z6 */
public abstract class C4895z6<MessageType extends C4895z6<MessageType, BuilderType>, BuilderType extends C4897b<MessageType, BuilderType>> extends C4614j5<MessageType, BuilderType> {
    private static Map<Object, C4895z6<?, ?>> zzd = new ConcurrentHashMap();
    protected C4827v9 zzb = C4827v9.m20502a();
    private int zzc = -1;

    /* renamed from: g.d.a.c.f.f.z6$a */
    public static class C4896a<T extends C4895z6<T, ?>> extends C4690n5<T> {
        public C4896a(T t) {
        }
    }

    /* renamed from: g.d.a.c.f.f.z6$b */
    public static abstract class C4897b<MessageType extends C4895z6<MessageType, BuilderType>, BuilderType extends C4897b<MessageType, BuilderType>> extends C4652l5<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f14677f;

        /* renamed from: g */
        protected MessageType f14678g;

        /* renamed from: h */
        protected boolean f14679h = false;

        protected C4897b(MessageType messagetype) {
            this.f14677f = messagetype;
            this.f14678g = (C4895z6) messagetype.mo13771r(C4900e.f14683d, (Object) null, (Object) null);
        }

        /* renamed from: q */
        private static void m20808q(MessageType messagetype, MessageType messagetype2) {
            C4842w8.m20540a().mo14700c(messagetype).mo13803i(messagetype, messagetype2);
        }

        /* renamed from: r */
        private final BuilderType m20809r(byte[] bArr, int i, int i2, C4673m6 m6Var) throws C4636k7 {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            try {
                C4842w8.m20540a().mo14700c(this.f14678g).mo13801g(this.f14678g, bArr, 0, i2, new C4756r5(m6Var));
                return this;
            } catch (C4636k7 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C4636k7.m19823a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C4897b bVar = (C4897b) this.f14677f.mo13771r(C4900e.f14684e, (Object) null, (Object) null);
            bVar.mo14815p((C4895z6) mo14351m());
            return bVar;
        }

        /* renamed from: g */
        public final boolean mo14480g() {
            return C4895z6.m20794v(this.f14678g, false);
        }

        /* renamed from: i */
        public final /* synthetic */ C4655l8 mo14481i() {
            return this.f14677f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final /* synthetic */ C4652l5 mo14384k(C4614j5 j5Var) {
            mo14815p((C4895z6) j5Var);
            return this;
        }

        /* renamed from: l */
        public final /* synthetic */ C4652l5 mo14385l(byte[] bArr, int i, int i2) throws C4636k7 {
            m20809r(bArr, 0, i2, C4673m6.m19962a());
            return this;
        }

        /* renamed from: n */
        public final /* synthetic */ C4652l5 mo14386n(byte[] bArr, int i, int i2, C4673m6 m6Var) throws C4636k7 {
            m20809r(bArr, 0, i2, m6Var);
            return this;
        }

        /* renamed from: p */
        public final BuilderType mo14815p(MessageType messagetype) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            m20808q(this.f14678g, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo14816s() {
            MessageType messagetype = (C4895z6) this.f14678g.mo13771r(C4900e.f14683d, (Object) null, (Object) null);
            m20808q(messagetype, this.f14678g);
            this.f14678g = messagetype;
        }

        /* renamed from: t */
        public MessageType mo14351m() {
            if (this.f14679h) {
                return this.f14678g;
            }
            MessageType messagetype = this.f14678g;
            C4842w8.m20540a().mo14700c(messagetype).mo13799e(messagetype);
            this.f14679h = true;
            return this.f14678g;
        }

        /* renamed from: u */
        public final MessageType mo14350h() {
            MessageType messagetype = (C4895z6) mo14351m();
            if (messagetype.mo14480g()) {
                return messagetype;
            }
            throw new C4794t9(messagetype);
        }
    }

    /* renamed from: g.d.a.c.f.f.z6$c */
    static final class C4898c implements C4808u6<C4898c> {
        /* renamed from: I */
        public final C4637k8 mo14669I(C4637k8 k8Var, C4655l8 l8Var) {
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final int mo14670a() {
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        public final C4639ka mo14671b() {
            throw new NoSuchMethodError();
        }

        /* renamed from: c */
        public final C4695na mo14672c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        /* renamed from: d */
        public final boolean mo14673d() {
            throw new NoSuchMethodError();
        }

        /* renamed from: f */
        public final boolean mo14674f() {
            throw new NoSuchMethodError();
        }

        /* renamed from: p */
        public final C4743q8 mo14675p(C4743q8 q8Var, C4743q8 q8Var2) {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: g.d.a.c.f.f.z6$d */
    public static abstract class C4899d<MessageType extends C4899d<MessageType, BuilderType>, BuilderType> extends C4895z6<MessageType, BuilderType> implements C4693n8 {
        protected C4774s6<C4898c> zzc = C4774s6.m20353c();

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public final C4774s6<C4898c> mo14820B() {
            if (this.zzc.mo14613o()) {
                this.zzc = (C4774s6) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: g.d.a.c.f.f.z6$e */
    public static final class C4900e {

        /* renamed from: a */
        public static final int f14680a = 1;

        /* renamed from: b */
        public static final int f14681b = 2;

        /* renamed from: c */
        public static final int f14682c = 3;

        /* renamed from: d */
        public static final int f14683d = 4;

        /* renamed from: e */
        public static final int f14684e = 5;

        /* renamed from: f */
        public static final int f14685f = 6;

        /* renamed from: g */
        public static final int f14686g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f14687h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f14688i = 1;

        /* renamed from: j */
        public static final int f14689j = 2;

        /* renamed from: k */
        public static final int f14690k = 1;

        /* renamed from: l */
        public static final int f14691l = 2;

        /* renamed from: a */
        public static int[] m20829a() {
            return (int[]) f14687h.clone();
        }
    }

    /* renamed from: g.d.a.c.f.f.z6$f */
    public static class C4901f<ContainingType extends C4655l8, Type> extends C4691n6<ContainingType, Type> {
    }

    /* renamed from: A */
    protected static <E> C4581h7<E> m20787A() {
        return C4903z8.m20834h();
    }

    /* renamed from: o */
    static <T extends C4895z6<?, ?>> T m20788o(Class<T> cls) {
        T t = (C4895z6) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4895z6) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C4895z6) ((C4895z6) C4877y9.m20665c(cls)).mo13771r(C4900e.f14685f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: p */
    protected static <E> C4581h7<E> m20789p(C4581h7<E> h7Var) {
        int size = h7Var.size();
        return h7Var.mo13882e(size == 0 ? 10 : size << 1);
    }

    /* renamed from: q */
    protected static C4598i7 m20790q(C4598i7 i7Var) {
        int size = i7Var.size();
        return i7Var.mo14244z(size == 0 ? 10 : size << 1);
    }

    /* renamed from: s */
    protected static Object m20791s(C4655l8 l8Var, String str, Object[] objArr) {
        return new C4876y8(l8Var, str, objArr);
    }

    /* renamed from: t */
    static Object m20792t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: u */
    protected static <T extends C4895z6<?, ?>> void m20793u(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: v */
    protected static final <T extends C4895z6<T, ?>> boolean m20794v(T t, boolean z) {
        byte byteValue = ((Byte) t.mo13771r(C4900e.f14680a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C4842w8.m20540a().mo14700c(t).mo13797c(t);
        if (z) {
            t.mo13771r(C4900e.f14681b, c ? t : null, (Object) null);
        }
        return c;
    }

    /* renamed from: y */
    protected static C4543f7 m20795y() {
        return C4488c7.m18952f();
    }

    /* renamed from: z */
    protected static C4598i7 m20796z() {
        return C4875y7.m20636f();
    }

    /* renamed from: c */
    public final int mo14431c() {
        if (this.zzc == -1) {
            this.zzc = C4842w8.m20540a().mo14700c(this).mo13800f(this);
        }
        return this.zzc;
    }

    /* renamed from: d */
    public final /* synthetic */ C4637k8 mo14432d() {
        C4897b bVar = (C4897b) mo13771r(C4900e.f14684e, (Object) null, (Object) null);
        bVar.mo14815p(this);
        return bVar;
    }

    /* renamed from: e */
    public final void mo14433e(C4615j6 j6Var) throws IOException {
        C4842w8.m20540a().mo14700c(this).mo13802h(this, C4653l6.m19874P(j6Var));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4842w8.m20540a().mo14700c(this).mo13798d(this, (C4895z6) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ C4637k8 mo14434f() {
        return (C4897b) mo13771r(C4900e.f14684e, (Object) null, (Object) null);
    }

    /* renamed from: g */
    public final boolean mo14480g() {
        return m20794v(this, true);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b = C4842w8.m20540a().mo14700c(this).mo13796b(this);
        this.zza = b;
        return b;
    }

    /* renamed from: i */
    public final /* synthetic */ C4655l8 mo14481i() {
        return (C4895z6) mo13771r(C4900e.f14685f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo14269l() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo14270n(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract Object mo13771r(int i, Object obj, Object obj2);

    public String toString() {
        return C4676m8.m19966a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final <MessageType extends C4895z6<MessageType, BuilderType>, BuilderType extends C4897b<MessageType, BuilderType>> BuilderType mo14812w() {
        return (C4897b) mo13771r(C4900e.f14684e, (Object) null, (Object) null);
    }

    /* renamed from: x */
    public final BuilderType mo14813x() {
        BuilderType buildertype = (C4897b) mo13771r(C4900e.f14684e, (Object) null, (Object) null);
        buildertype.mo14815p(this);
        return buildertype;
    }
}
