package p148g.p189d.p190a.p191a.p192i.p199y;

import android.util.SparseArray;
import java.util.EnumMap;
import p148g.p189d.p190a.p191a.C3729d;

/* renamed from: g.d.a.a.i.y.a */
public final class C3827a {

    /* renamed from: a */
    private static SparseArray<C3729d> f11518a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<C3729d, Integer> f11519b;

    static {
        EnumMap<C3729d, Integer> enumMap = new EnumMap<>(C3729d.class);
        f11519b = enumMap;
        enumMap.put(C3729d.DEFAULT, 0);
        f11519b.put(C3729d.VERY_LOW, 1);
        f11519b.put(C3729d.HIGHEST, 2);
        for (C3729d next : f11519b.keySet()) {
            f11518a.append(f11519b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m15877a(C3729d dVar) {
        Integer num = f11519b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    /* renamed from: b */
    public static C3729d m15878b(int i) {
        C3729d dVar = f11518a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
