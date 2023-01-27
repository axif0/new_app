package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4536f1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4556g1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4850x0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4867y0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;
import p148g.p189d.p190a.p232c.p241f.p247f.C4906zb;

/* renamed from: com.google.android.gms.measurement.internal.oa */
final class C1896oa {

    /* renamed from: a */
    private String f6117a;

    /* renamed from: b */
    private boolean f6118b;

    /* renamed from: c */
    private C4536f1 f6119c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f6120d;

    /* renamed from: e */
    private BitSet f6121e;

    /* renamed from: f */
    private Map<Integer, Long> f6122f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f6123g;

    /* renamed from: h */
    private final /* synthetic */ C1872ma f6124h;

    private C1896oa(C1872ma maVar, String str) {
        this.f6124h = maVar;
        this.f6117a = str;
        this.f6118b = true;
        this.f6120d = new BitSet();
        this.f6121e = new BitSet();
        this.f6122f = new C3190a();
        this.f6123g = new C3190a();
    }

    /* synthetic */ C1896oa(C1872ma maVar, String str, C1908pa paVar) {
        this(maVar, str);
    }

    private C1896oa(C1872ma maVar, String str, C4536f1 f1Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f6124h = maVar;
        this.f6117a = str;
        this.f6120d = bitSet;
        this.f6121e = bitSet2;
        this.f6122f = map;
        this.f6123g = new C3190a();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f6123g.put(next, arrayList);
            }
        }
        this.f6118b = false;
        this.f6119c = f1Var;
    }

    /* synthetic */ C1896oa(C1872ma maVar, String str, C4536f1 f1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C1908pa paVar) {
        this(maVar, str, f1Var, bitSet, bitSet2, map, map2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4850x0 mo7270a(int i) {
        ArrayList arrayList;
        List list;
        C4850x0.C4851a T = C4850x0.m20563T();
        T.mo14724v(i);
        T.mo14727z(this.f6118b);
        C4536f1 f1Var = this.f6119c;
        if (f1Var != null) {
            T.mo14726y(f1Var);
        }
        C4536f1.C4537a c0 = C4536f1.m19369c0();
        c0.mo14102B(C1740ba.m8138E(this.f6120d));
        c0.mo14107y(C1740ba.m8138E(this.f6121e));
        if (this.f6122f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f6122f.size());
            for (Integer intValue : this.f6122f.keySet()) {
                int intValue2 = intValue.intValue();
                C4867y0.C4868a K = C4867y0.m20610K();
                K.mo14745v(intValue2);
                K.mo14746x(this.f6122f.get(Integer.valueOf(intValue2)).longValue());
                arrayList.add((C4867y0) ((C4895z6) K.mo14350h()));
            }
        }
        c0.mo14103C(arrayList);
        if (this.f6123g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f6123g.size());
            for (Integer next : this.f6123g.keySet()) {
                C4556g1.C4557a L = C4556g1.m19493L();
                L.mo14171v(next.intValue());
                List list2 = this.f6123g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    L.mo14172x(list2);
                }
                arrayList2.add((C4556g1) ((C4895z6) L.mo14350h()));
            }
            list = arrayList2;
        }
        c0.mo14104D(list);
        T.mo14725x(c0);
        return (C4850x0) ((C4895z6) T.mo14350h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7271c(C1956ta taVar) {
        int a = taVar.mo7317a();
        Boolean bool = taVar.f6303c;
        if (bool != null) {
            this.f6121e.set(a, bool.booleanValue());
        }
        Boolean bool2 = taVar.f6304d;
        if (bool2 != null) {
            this.f6120d.set(a, bool2.booleanValue());
        }
        if (taVar.f6305e != null) {
            Long l = this.f6122f.get(Integer.valueOf(a));
            long longValue = taVar.f6305e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f6122f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (taVar.f6306f != null) {
            List list = this.f6123g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList();
                this.f6123g.put(Integer.valueOf(a), list);
            }
            if (taVar.mo7318i()) {
                list.clear();
            }
            if (C4906zb.m20838b() && this.f6124h.mo6712l().mo7422z(this.f6117a, C1957u.f6361d0) && taVar.mo7319j()) {
                list.clear();
            }
            if (!C4906zb.m20838b() || !this.f6124h.mo6712l().mo7422z(this.f6117a, C1957u.f6361d0)) {
                list.add(Long.valueOf(taVar.f6306f.longValue() / 1000));
                return;
            }
            long longValue2 = taVar.f6306f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }
}
