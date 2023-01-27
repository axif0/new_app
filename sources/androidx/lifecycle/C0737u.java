package androidx.lifecycle;

/* renamed from: androidx.lifecycle.u */
public class C0737u {

    /* renamed from: a */
    private final C0738a f2990a;

    /* renamed from: b */
    private final C0741v f2991b;

    /* renamed from: androidx.lifecycle.u$a */
    public interface C0738a {
        /* renamed from: a */
        <T extends C0736t> T mo3508a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.u$b */
    static abstract class C0739b extends C0740c implements C0738a {
        C0739b() {
        }

        /* renamed from: a */
        public <T extends C0736t> T mo3508a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends C0736t> T mo3716c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.u$c */
    static class C0740c {
        C0740c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3717b(C0736t tVar) {
        }
    }

    public C0737u(C0741v vVar, C0738a aVar) {
        this.f2990a = aVar;
        this.f2991b = vVar;
    }

    /* renamed from: a */
    public <T extends C0736t> T mo3714a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo3715b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C0736t> T mo3715b(String str, Class<T> cls) {
        T b = this.f2991b.mo3719b(str);
        if (cls.isInstance(b)) {
            C0738a aVar = this.f2990a;
            if (aVar instanceof C0740c) {
                ((C0740c) aVar).mo3717b(b);
            }
            return b;
        }
        C0738a aVar2 = this.f2990a;
        T c = aVar2 instanceof C0739b ? ((C0739b) aVar2).mo3716c(str, cls) : aVar2.mo3508a(cls);
        this.f2991b.mo3721d(str, c);
        return c;
    }
}
