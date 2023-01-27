package p086f.p111h.p121l;

/* renamed from: f.h.l.g */
public class C3348g<T> extends C3347f<T> {

    /* renamed from: c */
    private final Object f10642c = new Object();

    public C3348g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo5908a(T t) {
        boolean a;
        synchronized (this.f10642c) {
            a = super.mo5908a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo5909b() {
        T b;
        synchronized (this.f10642c) {
            b = super.mo5909b();
        }
        return b;
    }
}
