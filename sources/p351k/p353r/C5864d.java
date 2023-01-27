package p351k.p353r;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.d */
class C5864d extends C5863c {
    /* renamed from: a */
    public static final <T> List<T> m24375a(T[] tArr) {
        C5956g.m24500e(tArr, "$this$asList");
        List<T> a = C5866f.m24383a(tArr);
        C5956g.m24499d(a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: b */
    public static final <T> T[] m24376b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C5956g.m24500e(tArr, "$this$copyInto");
        C5956g.m24500e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: c */
    public static /* synthetic */ Object[] m24377c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m24376b(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    /* renamed from: d */
    public static final <T> void m24378d(T[] tArr, Comparator<? super T> comparator) {
        C5956g.m24500e(tArr, "$this$sortWith");
        C5956g.m24500e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
