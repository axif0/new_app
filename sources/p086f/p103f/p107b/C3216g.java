package p086f.p103f.p107b;

/* renamed from: f.f.b.g */
class C3216g<T> implements C3215f<T> {

    /* renamed from: a */
    private final Object[] f10249a;

    /* renamed from: b */
    private int f10250b;

    C3216g(int i) {
        if (i > 0) {
            this.f10249a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo11228a(T t) {
        int i = this.f10250b;
        Object[] objArr = this.f10249a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f10250b = i + 1;
        return true;
    }

    /* renamed from: b */
    public T mo11229b() {
        int i = this.f10250b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f10249a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f10250b = i - 1;
        return t;
    }

    /* renamed from: c */
    public void mo11230c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f10250b;
            Object[] objArr = this.f10249a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f10250b = i3 + 1;
            }
        }
    }
}
