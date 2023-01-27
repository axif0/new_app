package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.q5 */
final class C4740q5 extends C4672m5<Boolean> implements C4581h7<Boolean>, C4859x8, RandomAccess {

    /* renamed from: g */
    private boolean[] f14415g;

    /* renamed from: h */
    private int f14416h;

    static {
        new C4740q5(new boolean[0], 0).mo14224y();
    }

    C4740q5() {
        this(new boolean[10], 0);
    }

    private C4740q5(boolean[] zArr, int i) {
        this.f14415g = zArr;
        this.f14416h = i;
    }

    /* renamed from: f */
    private final void m20191f(int i) {
        if (i < 0 || i >= this.f14416h) {
            throw new IndexOutOfBoundsException(m20192h(i));
        }
    }

    /* renamed from: h */
    private final String m20192h(int i) {
        int i2 = this.f14416h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14452c();
        if (i < 0 || i > (i2 = this.f14416h)) {
            throw new IndexOutOfBoundsException(m20192h(i));
        }
        boolean[] zArr = this.f14415g;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f14415g, i, zArr2, i + 1, this.f14416h - i);
            this.f14415g = zArr2;
        }
        this.f14415g[i] = booleanValue;
        this.f14416h++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo14547d(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo14452c();
        C4470b7.m18816d(collection);
        if (!(collection instanceof C4740q5)) {
            return super.addAll(collection);
        }
        C4740q5 q5Var = (C4740q5) collection;
        int i = q5Var.f14416h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14416h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f14415g;
            if (i3 > zArr.length) {
                this.f14415g = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(q5Var.f14415g, 0, this.f14415g, this.f14416h, q5Var.f14416h);
            this.f14416h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo14547d(boolean z) {
        mo14452c();
        int i = this.f14416h;
        boolean[] zArr = this.f14415g;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f14415g = zArr2;
        }
        boolean[] zArr3 = this.f14415g;
        int i2 = this.f14416h;
        this.f14416h = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: e */
    public final /* synthetic */ C4581h7 mo13882e(int i) {
        if (i >= this.f14416h) {
            return new C4740q5(Arrays.copyOf(this.f14415g, i), this.f14416h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4740q5)) {
            return super.equals(obj);
        }
        C4740q5 q5Var = (C4740q5) obj;
        if (this.f14416h != q5Var.f14416h) {
            return false;
        }
        boolean[] zArr = q5Var.f14415g;
        for (int i = 0; i < this.f14416h; i++) {
            if (this.f14415g[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m20191f(i);
        return Boolean.valueOf(this.f14415g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14416h; i2++) {
            i = (i * 31) + C4470b7.m18815c(this.f14415g[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f14415g[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14452c();
        m20191f(i);
        boolean[] zArr = this.f14415g;
        boolean z = zArr[i];
        int i2 = this.f14416h;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f14416h--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo14452c();
        for (int i = 0; i < this.f14416h; i++) {
            if (obj.equals(Boolean.valueOf(this.f14415g[i]))) {
                boolean[] zArr = this.f14415g;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f14416h - i) - 1);
                this.f14416h--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14452c();
        if (i2 >= i) {
            boolean[] zArr = this.f14415g;
            System.arraycopy(zArr, i2, zArr, i, this.f14416h - i2);
            this.f14416h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14452c();
        m20191f(i);
        boolean[] zArr = this.f14415g;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f14416h;
    }
}
