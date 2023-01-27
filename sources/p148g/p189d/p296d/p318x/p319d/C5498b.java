package p148g.p189d.p296d.p318x.p319d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p148g.p189d.p296d.p318x.C5494a;

/* renamed from: g.d.d.x.d.b */
final class C5498b {

    /* renamed from: a */
    private final Map<Integer, Integer> f15905a = new HashMap();

    C5498b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo15845a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f15905a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return C5494a.m22669b(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15846b(int i) {
        Integer num = this.f15905a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f15905a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
