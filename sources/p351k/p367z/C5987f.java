package p351k.p367z;

import java.util.Iterator;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.z.f */
class C5987f extends C5986e {

    /* renamed from: k.z.f$a */
    public static final class C5988a implements C5983b<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f16940a;

        public C5988a(Iterator it) {
            this.f16940a = it;
        }

        public Iterator<T> iterator() {
            return this.f16940a;
        }
    }

    /* renamed from: a */
    public static <T> C5983b<T> m24551a(Iterator<? extends T> it) {
        C5956g.m24500e(it, "$this$asSequence");
        return m24552b(new C5988a(it));
    }

    /* renamed from: b */
    public static final <T> C5983b<T> m24552b(C5983b<? extends T> bVar) {
        C5956g.m24500e(bVar, "$this$constrainOnce");
        return bVar instanceof C5982a ? (C5982a) bVar : new C5982a(bVar);
    }
}
