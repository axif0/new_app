package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.k6 */
final class C4635k6 extends C4672m5<Double> implements C4581h7<Double>, C4859x8, RandomAccess {

    /* renamed from: g */
    private double[] f14212g;

    /* renamed from: h */
    private int f14213h;

    static {
        new C4635k6(new double[0], 0).mo14224y();
    }

    C4635k6() {
        this(new double[10], 0);
    }

    private C4635k6(double[] dArr, int i) {
        this.f14212g = dArr;
        this.f14213h = i;
    }

    /* renamed from: f */
    private final void m19819f(int i) {
        if (i < 0 || i >= this.f14213h) {
            throw new IndexOutOfBoundsException(m19820h(i));
        }
    }

    /* renamed from: h */
    private final String m19820h(int i) {
        int i2 = this.f14213h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo14452c();
        if (i < 0 || i > (i2 = this.f14213h)) {
            throw new IndexOutOfBoundsException(m19820h(i));
        }
        double[] dArr = this.f14212g;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f14212g, i, dArr2, i + 1, this.f14213h - i);
            this.f14212g = dArr2;
        }
        this.f14212g[i] = doubleValue;
        this.f14213h++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo14340d(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo14452c();
        C4470b7.m18816d(collection);
        if (!(collection instanceof C4635k6)) {
            return super.addAll(collection);
        }
        C4635k6 k6Var = (C4635k6) collection;
        int i = k6Var.f14213h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14213h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f14212g;
            if (i3 > dArr.length) {
                this.f14212g = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(k6Var.f14212g, 0, this.f14212g, this.f14213h, k6Var.f14213h);
            this.f14213h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo14340d(double d) {
        mo14452c();
        int i = this.f14213h;
        double[] dArr = this.f14212g;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f14212g = dArr2;
        }
        double[] dArr3 = this.f14212g;
        int i2 = this.f14213h;
        this.f14213h = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: e */
    public final /* synthetic */ C4581h7 mo13882e(int i) {
        if (i >= this.f14213h) {
            return new C4635k6(Arrays.copyOf(this.f14212g, i), this.f14213h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4635k6)) {
            return super.equals(obj);
        }
        C4635k6 k6Var = (C4635k6) obj;
        if (this.f14213h != k6Var.f14213h) {
            return false;
        }
        double[] dArr = k6Var.f14212g;
        for (int i = 0; i < this.f14213h; i++) {
            if (Double.doubleToLongBits(this.f14212g[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m19819f(i);
        return Double.valueOf(this.f14212g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14213h; i2++) {
            i = (i * 31) + C4470b7.m18814b(Double.doubleToLongBits(this.f14212g[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f14212g[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14452c();
        m19819f(i);
        double[] dArr = this.f14212g;
        double d = dArr[i];
        int i2 = this.f14213h;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f14213h--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo14452c();
        for (int i = 0; i < this.f14213h; i++) {
            if (obj.equals(Double.valueOf(this.f14212g[i]))) {
                double[] dArr = this.f14212g;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f14213h - i) - 1);
                this.f14213h--;
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
            double[] dArr = this.f14212g;
            System.arraycopy(dArr, i2, dArr, i, this.f14213h - i2);
            this.f14213h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo14452c();
        m19819f(i);
        double[] dArr = this.f14212g;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f14213h;
    }
}
