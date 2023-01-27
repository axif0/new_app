package p351k.p353r;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.e */
class C5865e extends C5864d {
    /* renamed from: e */
    public static char m24379e(char[] cArr) {
        C5956g.m24500e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: f */
    public static <T> T m24380f(T[] tArr) {
        C5956g.m24500e(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: g */
    public static final <T> T[] m24381g(T[] tArr, Comparator<? super T> comparator) {
        C5956g.m24500e(tArr, "$this$sortedArrayWith");
        C5956g.m24500e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C5956g.m24499d(copyOf, "java.util.Arrays.copyOf(this, size)");
        C5864d.m24378d(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: h */
    public static <T> List<T> m24382h(T[] tArr, Comparator<? super T> comparator) {
        C5956g.m24500e(tArr, "$this$sortedWith");
        C5956g.m24500e(comparator, "comparator");
        return C5864d.m24375a(m24381g(tArr, comparator));
    }
}
