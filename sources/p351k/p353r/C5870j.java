package p351k.p353r;

import java.util.Collection;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.j */
class C5870j extends C5869i {
    /* renamed from: f */
    public static <T> int m24393f(Iterable<? extends T> iterable, int i) {
        C5956g.m24500e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
