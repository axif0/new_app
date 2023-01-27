package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.k4 */
public abstract class C4633k4<E> extends C4466b4<E> implements Set<E> {
    @NullableDecl

    /* renamed from: g */
    private transient C4448a4<E> f14211g;

    C4633k4() {
    }

    /* renamed from: o */
    static int m19814o(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C4447a3.m18705f(z, "collection too large");
            return 1073741824;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14331a() {
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4633k4) || !mo14331a() || !((C4633k4) obj).mo14331a() || hashCode() == obj.hashCode()) {
            return C4822v4.m20494b(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C4822v4.m20493a(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* renamed from: p */
    public C4448a4<E> mo14334p() {
        C4448a4<E> a4Var = this.f14211g;
        if (a4Var != null) {
            return a4Var;
        }
        C4448a4<E> q = mo14335q();
        this.f14211g = q;
        return q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C4448a4<E> mo14335q() {
        return C4448a4.m18709q(toArray());
    }
}
