package p148g.p189d.p190a.p200b.p204k0.p205o;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.o.c */
final class C3931c extends C3932d {

    /* renamed from: b */
    private long f11941b = -9223372036854775807L;

    public C3931c() {
        super((C3927n) null);
    }

    /* renamed from: e */
    private static Boolean m16495e(C4274m mVar) {
        boolean z = true;
        if (mVar.mo13479x() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    private static Object m16496f(C4274m mVar, int i) {
        if (i == 0) {
            return m16498h(mVar);
        }
        if (i == 1) {
            return m16495e(mVar);
        }
        if (i == 2) {
            return m16502l(mVar);
        }
        if (i == 3) {
            return m16500j(mVar);
        }
        if (i == 8) {
            return m16499i(mVar);
        }
        if (i == 10) {
            return m16501k(mVar);
        }
        if (i != 11) {
            return null;
        }
        return m16497g(mVar);
    }

    /* renamed from: g */
    private static Date m16497g(C4274m mVar) {
        Date date = new Date((long) m16498h(mVar).doubleValue());
        mVar.mo13455K(2);
        return date;
    }

    /* renamed from: h */
    private static Double m16498h(C4274m mVar) {
        return Double.valueOf(Double.longBitsToDouble(mVar.mo13472q()));
    }

    /* renamed from: i */
    private static HashMap<String, Object> m16499i(C4274m mVar) {
        int B = mVar.mo13446B();
        HashMap<String, Object> hashMap = new HashMap<>(B);
        for (int i = 0; i < B; i++) {
            hashMap.put(m16502l(mVar), m16496f(mVar, m16503m(mVar)));
        }
        return hashMap;
    }

    /* renamed from: j */
    private static HashMap<String, Object> m16500j(C4274m mVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String l = m16502l(mVar);
            int m = m16503m(mVar);
            if (m == 9) {
                return hashMap;
            }
            hashMap.put(l, m16496f(mVar, m));
        }
    }

    /* renamed from: k */
    private static ArrayList<Object> m16501k(C4274m mVar) {
        int B = mVar.mo13446B();
        ArrayList<Object> arrayList = new ArrayList<>(B);
        for (int i = 0; i < B; i++) {
            arrayList.add(m16496f(mVar, m16503m(mVar)));
        }
        return arrayList;
    }

    /* renamed from: l */
    private static String m16502l(C4274m mVar) {
        int D = mVar.mo13448D();
        int c = mVar.mo13458c();
        mVar.mo13455K(D);
        return new String(mVar.f13643a, c, D);
    }

    /* renamed from: m */
    private static int m16503m(C4274m mVar) {
        return mVar.mo13479x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12758b(C4274m mVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12759c(C4274m mVar, long j) throws C4313u {
        if (m16503m(mVar) != 2) {
            throw new C4313u();
        } else if ("onMetaData".equals(m16502l(mVar)) && m16503m(mVar) == 8) {
            HashMap<String, Object> i = m16499i(mVar);
            if (i.containsKey("duration")) {
                double doubleValue = ((Double) i.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f11941b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    /* renamed from: d */
    public long mo12760d() {
        return this.f11941b;
    }
}
