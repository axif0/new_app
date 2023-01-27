package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.c7 */
final class C4488c7 extends C4672m5<Integer> implements C4543f7, C4859x8, RandomAccess {

    /* renamed from: i */
    private static final C4488c7 f14017i;

    /* renamed from: g */
    private int[] f14018g;

    /* renamed from: h */
    private int f14019h;

    static {
        C4488c7 c7Var = new C4488c7(new int[0], 0);
        f14017i = c7Var;
        c7Var.mo14224y();
    }

    C4488c7() {
        this(new int[10], 0);
    }

    private C4488c7(int[] iArr, int i) {
        this.f14018g = iArr;
        this.f14019h = i;
    }

    /* renamed from: f */
    public static C4488c7 m18952f() {
        return f14017i;
    }

    /* renamed from: i */
    private final void m18953i(int i) {
        if (i < 0 || i >= this.f14019h) {
            throw new IndexOutOfBoundsException(m18954j(i));
        }
    }

    /* renamed from: j */
    private final String m18954j(int i) {
        int i2 = this.f14019h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo14452c();
        if (i < 0 || i > (i2 = this.f14019h)) {
            throw new IndexOutOfBoundsException(m18954j(i));
        }
        int[] iArr = this.f14018g;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f14018g, i, iArr2, i + 1, this.f14019h - i);
            this.f14018g = iArr2;
        }
        this.f14018g[i] = intValue;
        this.f14019h++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo13886h(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo14452c();
        C4470b7.m18816d(collection);
        if (!(collection instanceof C4488c7)) {
            return super.addAll(collection);
        }
        C4488c7 c7Var = (C4488c7) collection;
        int i = c7Var.f14019h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14019h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f14018g;
            if (i3 > iArr.length) {
                this.f14018g = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c7Var.f14018g, 0, this.f14018g, this.f14019h, c7Var.f14019h);
            this.f14019h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo13881d(int i) {
        m18953i(i);
        return this.f14018g[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4488c7)) {
            return super.equals(obj);
        }
        C4488c7 c7Var = (C4488c7) obj;
        if (this.f14019h != c7Var.f14019h) {
            return false;
        }
        int[] iArr = c7Var.f14018g;
        for (int i = 0; i < this.f14019h; i++) {
            if (this.f14018g[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final C4543f7 mo13882e(int i) {
        if (i >= this.f14019h) {
            return new C4488c7(Arrays.copyOf(this.f14018g, i), this.f14019h);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo13881d(i));
    }

    /* renamed from: h */
    public final void mo13886h(int i) {
        mo14452c();
        int i2 = this.f14019h;
        int[] iArr = this.f14018g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f14018g = iArr2;
        }
        int[] iArr3 = this.f14018g;
        int i3 = this.f14019h;
        this.f14019h = i3 + 1;
        iArr3[i3] = i;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14019h; i2++) {
            i = (i * 31) + this.f14018g[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f14018g[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14452c();
        m18953i(i);
        int[] iArr = this.f14018g;
        int i2 = iArr[i];
        int i3 = this.f14019h;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f14019h--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo14452c();
        for (int i = 0; i < this.f14019h; i++) {
            if (obj.equals(Integer.valueOf(this.f14018g[i]))) {
                int[] iArr = this.f14018g;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f14019h - i) - 1);
                this.f14019h--;
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
            int[] iArr = this.f14018g;
            System.arraycopy(iArr, i2, iArr, i, this.f14019h - i2);
            this.f14019h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo14452c();
        m18953i(i);
        int[] iArr = this.f14018g;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f14019h;
    }
}
