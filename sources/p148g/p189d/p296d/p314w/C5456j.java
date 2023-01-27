package p148g.p189d.p296d.p314w;

import java.util.Collection;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5380l;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.j */
public final class C5456j extends C5457k {

    /* renamed from: b */
    private static final C5462p[] f15809b = new C5462p[0];

    /* renamed from: a */
    private final C5462p[] f15810a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5456j(java.util.Map<p148g.p189d.p296d.C5373e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            g.d.d.e r0 = p148g.p189d.p296d.C5373e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            g.d.d.a r1 = p148g.p189d.p296d.C5369a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            g.d.d.w.e r1 = new g.d.d.w.e
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            g.d.d.a r1 = p148g.p189d.p296d.C5369a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            g.d.d.w.l r1 = new g.d.d.w.l
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            g.d.d.a r1 = p148g.p189d.p296d.C5369a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            g.d.d.w.f r1 = new g.d.d.w.f
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            g.d.d.a r1 = p148g.p189d.p296d.C5369a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            g.d.d.w.q r3 = new g.d.d.w.q
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            g.d.d.w.e r3 = new g.d.d.w.e
            r3.<init>()
            r0.add(r3)
            g.d.d.w.f r3 = new g.d.d.w.f
            r3.<init>()
            r0.add(r3)
            g.d.d.w.q r3 = new g.d.d.w.q
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            g.d.d.w.p[] r3 = f15809b
            java.lang.Object[] r3 = r0.toArray(r3)
            g.d.d.w.p[] r3 = (p148g.p189d.p296d.p314w.C5462p[]) r3
            r2.f15810a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.C5456j.<init>(java.util.Map):void");
    }

    /* renamed from: b */
    public void mo15604b() {
        for (C5462p b : this.f15810a) {
            b.mo15604b();
        }
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i {
        boolean z;
        int[] q = C5462p.m22534q(aVar);
        C5462p[] pVarArr = this.f15810a;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C5381m n = pVarArr[i2].mo15756n(i, aVar, q, map);
                boolean z2 = n.mo15610b() == C5369a.EAN_13 && n.mo15614f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(C5373e.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(C5369a.UPC_A)) {
                        z = false;
                        if (z2 || !z) {
                            return n;
                        }
                        C5381m mVar = new C5381m(n.mo15614f().substring(1), n.mo15611c(), n.mo15613e(), C5369a.UPC_A);
                        mVar.mo15615g(n.mo15612d());
                        return mVar;
                    }
                }
                z = true;
                if (z2) {
                }
                return n;
            } catch (C5380l unused) {
                i2++;
            }
        }
        throw C5377i.m22193a();
    }
}
