package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.w4 */
final class C4838w4<E> extends C4633k4<E> {

    /* renamed from: m */
    static final C4838w4<Object> f14603m = new C4838w4(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: h */
    private final transient Object[] f14604h;

    /* renamed from: i */
    private final transient Object[] f14605i;

    /* renamed from: j */
    private final transient int f14606j;

    /* renamed from: k */
    private final transient int f14607k;

    /* renamed from: l */
    private final transient int f14608l;

    C4838w4(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f14604h = objArr;
        this.f14605i = objArr2;
        this.f14606j = i2;
        this.f14607k = i;
        this.f14608l = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14331a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13776c(Object[] objArr, int i) {
        System.arraycopy(this.f14604h, 0, objArr, i, this.f14608l);
        return i + this.f14608l;
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f14605i;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = C4871y3.m20622b(obj);
        while (true) {
            int i = b & this.f14606j;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* renamed from: d */
    public final C4855x4<E> iterator() {
        return (C4855x4) mo14334p().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object[] mo13841f() {
        return this.f14604h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo13842h() {
        return 0;
    }

    public final int hashCode() {
        return this.f14607k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo13843j() {
        return this.f14608l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13844m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C4448a4<E> mo14335q() {
        return C4448a4.m18710r(this.f14604h, this.f14608l);
    }

    public final int size() {
        return this.f14608l;
    }
}
