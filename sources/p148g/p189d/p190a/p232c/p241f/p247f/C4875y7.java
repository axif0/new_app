package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.y7 */
final class C4875y7 extends C4672m5<Long> implements C4598i7, C4859x8, RandomAccess {

    /* renamed from: i */
    private static final C4875y7 f14647i;

    /* renamed from: g */
    private long[] f14648g;

    /* renamed from: h */
    private int f14649h;

    static {
        C4875y7 y7Var = new C4875y7(new long[0], 0);
        f14647i = y7Var;
        y7Var.mo14224y();
    }

    C4875y7() {
        this(new long[10], 0);
    }

    private C4875y7(long[] jArr, int i) {
        this.f14648g = jArr;
        this.f14649h = i;
    }

    /* renamed from: f */
    public static C4875y7 m20636f() {
        return f14647i;
    }

    /* renamed from: h */
    private final void m20637h(int i) {
        if (i < 0 || i >= this.f14649h) {
            throw new IndexOutOfBoundsException(m20638i(i));
        }
    }

    /* renamed from: i */
    private final String m20638i(int i) {
        int i2 = this.f14649h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo14452c();
        if (i < 0 || i > (i2 = this.f14649h)) {
            throw new IndexOutOfBoundsException(m20638i(i));
        }
        long[] jArr = this.f14648g;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f14648g, i, jArr2, i + 1, this.f14649h - i);
            this.f14648g = jArr2;
        }
        this.f14648g[i] = longValue;
        this.f14649h++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo14760d(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo14452c();
        C4470b7.m18816d(collection);
        if (!(collection instanceof C4875y7)) {
            return super.addAll(collection);
        }
        C4875y7 y7Var = (C4875y7) collection;
        int i = y7Var.f14649h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14649h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f14648g;
            if (i3 > jArr.length) {
                this.f14648g = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(y7Var.f14648g, 0, this.f14648g, this.f14649h, y7Var.f14649h);
            this.f14649h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo14760d(long j) {
        mo14452c();
        int i = this.f14649h;
        long[] jArr = this.f14648g;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f14648g = jArr2;
        }
        long[] jArr3 = this.f14648g;
        int i2 = this.f14649h;
        this.f14649h = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4875y7)) {
            return super.equals(obj);
        }
        C4875y7 y7Var = (C4875y7) obj;
        if (this.f14649h != y7Var.f14649h) {
            return false;
        }
        long[] jArr = y7Var.f14648g;
        for (int i = 0; i < this.f14649h; i++) {
            if (this.f14648g[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final long mo14243g(int i) {
        m20637h(i);
        return this.f14648g[i];
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo14243g(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14649h; i2++) {
            i = (i * 31) + C4470b7.m18814b(this.f14648g[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f14648g[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14452c();
        m20637h(i);
        long[] jArr = this.f14648g;
        long j = jArr[i];
        int i2 = this.f14649h;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f14649h--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo14452c();
        for (int i = 0; i < this.f14649h; i++) {
            if (obj.equals(Long.valueOf(this.f14648g[i]))) {
                long[] jArr = this.f14648g;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f14649h - i) - 1);
                this.f14649h--;
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
            long[] jArr = this.f14648g;
            System.arraycopy(jArr, i2, jArr, i, this.f14649h - i2);
            this.f14649h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo14452c();
        m20637h(i);
        long[] jArr = this.f14648g;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f14649h;
    }

    /* renamed from: z */
    public final C4598i7 mo13882e(int i) {
        if (i >= this.f14649h) {
            return new C4875y7(Arrays.copyOf(this.f14648g, i), this.f14649h);
        }
        throw new IllegalArgumentException();
    }
}
