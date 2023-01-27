package p086f.p111h.p121l;

/* renamed from: f.h.l.f */
public class C3347f<T> implements C3346e<T> {

    /* renamed from: a */
    private final Object[] f10640a;

    /* renamed from: b */
    private int f10641b;

    public C3347f(int i) {
        if (i > 0) {
            this.f10640a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m14354c(T t) {
        for (int i = 0; i < this.f10641b; i++) {
            if (this.f10640a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5908a(T t) {
        if (!m14354c(t)) {
            int i = this.f10641b;
            Object[] objArr = this.f10640a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f10641b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo5909b() {
        int i = this.f10641b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f10640a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f10641b = i - 1;
        return t;
    }
}
