package p086f.p095b.p096a.p097a;

/* renamed from: f.b.a.a.a */
public class C3168a extends C3171c {

    /* renamed from: c */
    private static volatile C3168a f10089c;

    /* renamed from: a */
    private C3171c f10090a;

    /* renamed from: b */
    private C3171c f10091b;

    private C3168a() {
        C3169b bVar = new C3169b();
        this.f10091b = bVar;
        this.f10090a = bVar;
    }

    /* renamed from: b */
    public static C3168a m13562b() {
        if (f10089c != null) {
            return f10089c;
        }
        synchronized (C3168a.class) {
            if (f10089c == null) {
                f10089c = new C3168a();
            }
        }
        return f10089c;
    }

    /* renamed from: a */
    public boolean mo10972a() {
        return this.f10090a.mo10972a();
    }
}
