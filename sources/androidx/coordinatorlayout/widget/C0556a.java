package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p086f.p102e.C3203g;
import p086f.p111h.p121l.C3346e;
import p086f.p111h.p121l.C3347f;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0556a<T> {

    /* renamed from: a */
    private final C3346e<ArrayList<T>> f2317a = new C3347f(10);

    /* renamed from: b */
    private final C3203g<T, ArrayList<T>> f2318b = new C3203g<>();

    /* renamed from: c */
    private final ArrayList<T> f2319c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2320d = new HashSet<>();

    /* renamed from: e */
    private void m2619e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f2318b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2619e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m2620f() {
        ArrayList<T> b = this.f2317a.mo5909b();
        return b == null ? new ArrayList<>() : b;
    }

    /* renamed from: k */
    private void m2621k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2317a.mo5908a(arrayList);
    }

    /* renamed from: a */
    public void mo2791a(T t, T t2) {
        if (!this.f2318b.containsKey(t) || !this.f2318b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f2318b.get(t);
        if (arrayList == null) {
            arrayList = m2620f();
            this.f2318b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo2792b(T t) {
        if (!this.f2318b.containsKey(t)) {
            this.f2318b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo2793c() {
        int size = this.f2318b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2318b.mo11141m(i);
            if (m != null) {
                m2621k(m);
            }
        }
        this.f2318b.clear();
    }

    /* renamed from: d */
    public boolean mo2794d(T t) {
        return this.f2318b.containsKey(t);
    }

    /* renamed from: g */
    public List mo2795g(T t) {
        return this.f2318b.get(t);
    }

    /* renamed from: h */
    public List<T> mo2796h(T t) {
        int size = this.f2318b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2318b.mo11141m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2318b.mo11139i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo2797i() {
        this.f2319c.clear();
        this.f2320d.clear();
        int size = this.f2318b.size();
        for (int i = 0; i < size; i++) {
            m2619e(this.f2318b.mo11139i(i), this.f2319c, this.f2320d);
        }
        return this.f2319c;
    }

    /* renamed from: j */
    public boolean mo2798j(T t) {
        int size = this.f2318b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2318b.mo11141m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
