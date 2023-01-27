package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.y6 */
final class C4874y6 extends C4672m5<Float> implements C4581h7<Float>, C4859x8, RandomAccess {

    /* renamed from: g */
    private float[] f14645g;

    /* renamed from: h */
    private int f14646h;

    static {
        new C4874y6(new float[0], 0).mo14224y();
    }

    C4874y6() {
        this(new float[10], 0);
    }

    private C4874y6(float[] fArr, int i) {
        this.f14645g = fArr;
        this.f14646h = i;
    }

    /* renamed from: f */
    private final void m20632f(int i) {
        if (i < 0 || i >= this.f14646h) {
            throw new IndexOutOfBoundsException(m20633h(i));
        }
    }

    /* renamed from: h */
    private final String m20633h(int i) {
        int i2 = this.f14646h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo14452c();
        if (i < 0 || i > (i2 = this.f14646h)) {
            throw new IndexOutOfBoundsException(m20633h(i));
        }
        float[] fArr = this.f14645g;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f14645g, i, fArr2, i + 1, this.f14646h - i);
            this.f14645g = fArr2;
        }
        this.f14645g[i] = floatValue;
        this.f14646h++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo14751d(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo14452c();
        C4470b7.m18816d(collection);
        if (!(collection instanceof C4874y6)) {
            return super.addAll(collection);
        }
        C4874y6 y6Var = (C4874y6) collection;
        int i = y6Var.f14646h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14646h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f14645g;
            if (i3 > fArr.length) {
                this.f14645g = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(y6Var.f14645g, 0, this.f14645g, this.f14646h, y6Var.f14646h);
            this.f14646h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo14751d(float f) {
        mo14452c();
        int i = this.f14646h;
        float[] fArr = this.f14645g;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f14645g = fArr2;
        }
        float[] fArr3 = this.f14645g;
        int i2 = this.f14646h;
        this.f14646h = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: e */
    public final /* synthetic */ C4581h7 mo13882e(int i) {
        if (i >= this.f14646h) {
            return new C4874y6(Arrays.copyOf(this.f14645g, i), this.f14646h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4874y6)) {
            return super.equals(obj);
        }
        C4874y6 y6Var = (C4874y6) obj;
        if (this.f14646h != y6Var.f14646h) {
            return false;
        }
        float[] fArr = y6Var.f14645g;
        for (int i = 0; i < this.f14646h; i++) {
            if (Float.floatToIntBits(this.f14645g[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m20632f(i);
        return Float.valueOf(this.f14645g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14646h; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f14645g[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f14645g[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14452c();
        m20632f(i);
        float[] fArr = this.f14645g;
        float f = fArr[i];
        int i2 = this.f14646h;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f14646h--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo14452c();
        for (int i = 0; i < this.f14646h; i++) {
            if (obj.equals(Float.valueOf(this.f14645g[i]))) {
                float[] fArr = this.f14645g;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f14646h - i) - 1);
                this.f14646h--;
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
            float[] fArr = this.f14645g;
            System.arraycopy(fArr, i2, fArr, i, this.f14646h - i2);
            this.f14646h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo14452c();
        m20632f(i);
        float[] fArr = this.f14645g;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f14646h;
    }
}
