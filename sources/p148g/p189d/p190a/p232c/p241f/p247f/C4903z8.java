package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.z8 */
final class C4903z8<E> extends C4672m5<E> implements RandomAccess {

    /* renamed from: i */
    private static final C4903z8<Object> f14693i;

    /* renamed from: g */
    private E[] f14694g;

    /* renamed from: h */
    private int f14695h;

    static {
        C4903z8<Object> z8Var = new C4903z8<>(new Object[0], 0);
        f14693i = z8Var;
        z8Var.mo14224y();
    }

    private C4903z8(E[] eArr, int i) {
        this.f14694g = eArr;
        this.f14695h = i;
    }

    /* renamed from: d */
    private final void m20832d(int i) {
        if (i < 0 || i >= this.f14695h) {
            throw new IndexOutOfBoundsException(m20833f(i));
        }
    }

    /* renamed from: f */
    private final String m20833f(int i) {
        int i2 = this.f14695h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    public static <E> C4903z8<E> m20834h() {
        return f14693i;
    }

    public final void add(int i, E e) {
        int i2;
        mo14452c();
        if (i < 0 || i > (i2 = this.f14695h)) {
            throw new IndexOutOfBoundsException(m20833f(i));
        }
        E[] eArr = this.f14694g;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f14694g, i, eArr2, i + 1, this.f14695h - i);
            this.f14694g = eArr2;
        }
        this.f14694g[i] = e;
        this.f14695h++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo14452c();
        int i = this.f14695h;
        E[] eArr = this.f14694g;
        if (i == eArr.length) {
            this.f14694g = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f14694g;
        int i2 = this.f14695h;
        this.f14695h = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: e */
    public final /* synthetic */ C4581h7 mo13882e(int i) {
        if (i >= this.f14695h) {
            return new C4903z8(Arrays.copyOf(this.f14694g, i), this.f14695h);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        m20832d(i);
        return this.f14694g[i];
    }

    public final E remove(int i) {
        mo14452c();
        m20832d(i);
        E[] eArr = this.f14694g;
        E e = eArr[i];
        int i2 = this.f14695h;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f14695h--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo14452c();
        m20832d(i);
        E[] eArr = this.f14694g;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f14695h;
    }
}
