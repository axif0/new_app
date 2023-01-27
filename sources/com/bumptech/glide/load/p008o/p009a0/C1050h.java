package com.bumptech.glide.load.p008o.p009a0;

import com.bumptech.glide.load.p008o.p009a0.C1060m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.a0.h */
class C1050h<K extends C1060m, V> {

    /* renamed from: a */
    private final C1051a<K, V> f4023a = new C1051a<>();

    /* renamed from: b */
    private final Map<K, C1051a<K, V>> f4024b = new HashMap();

    /* renamed from: com.bumptech.glide.load.o.a0.h$a */
    private static class C1051a<K, V> {

        /* renamed from: a */
        final K f4025a;

        /* renamed from: b */
        private List<V> f4026b;

        /* renamed from: c */
        C1051a<K, V> f4027c;

        /* renamed from: d */
        C1051a<K, V> f4028d;

        C1051a() {
            this((Object) null);
        }

        C1051a(K k) {
            this.f4028d = this;
            this.f4027c = this;
            this.f4025a = k;
        }

        /* renamed from: a */
        public void mo5257a(V v) {
            if (this.f4026b == null) {
                this.f4026b = new ArrayList();
            }
            this.f4026b.add(v);
        }

        /* renamed from: b */
        public V mo5258b() {
            int c = mo5259c();
            if (c > 0) {
                return this.f4026b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo5259c() {
            List<V> list = this.f4026b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    C1050h() {
    }

    /* renamed from: b */
    private void m5702b(C1051a<K, V> aVar) {
        m5704e(aVar);
        C1051a<K, V> aVar2 = this.f4023a;
        aVar.f4028d = aVar2;
        aVar.f4027c = aVar2.f4027c;
        m5705g(aVar);
    }

    /* renamed from: c */
    private void m5703c(C1051a<K, V> aVar) {
        m5704e(aVar);
        C1051a<K, V> aVar2 = this.f4023a;
        aVar.f4028d = aVar2.f4028d;
        aVar.f4027c = aVar2;
        m5705g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m5704e(C1051a<K, V> aVar) {
        C1051a<K, V> aVar2 = aVar.f4028d;
        aVar2.f4027c = aVar.f4027c;
        aVar.f4027c.f4028d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m5705g(C1051a<K, V> aVar) {
        aVar.f4027c.f4028d = aVar;
        aVar.f4028d.f4027c = aVar;
    }

    /* renamed from: a */
    public V mo5253a(K k) {
        C1051a aVar = this.f4024b.get(k);
        if (aVar == null) {
            aVar = new C1051a(k);
            this.f4024b.put(k, aVar);
        } else {
            k.mo5236a();
        }
        m5702b(aVar);
        return aVar.mo5258b();
    }

    /* renamed from: d */
    public void mo5254d(K k, V v) {
        C1051a aVar = this.f4024b.get(k);
        if (aVar == null) {
            aVar = new C1051a(k);
            m5703c(aVar);
            this.f4024b.put(k, aVar);
        } else {
            k.mo5236a();
        }
        aVar.mo5257a(v);
    }

    /* renamed from: f */
    public V mo5255f() {
        C1051a<K, V> aVar = this.f4023a;
        while (true) {
            aVar = aVar.f4028d;
            if (aVar.equals(this.f4023a)) {
                return null;
            }
            V b = aVar.mo5258b();
            if (b != null) {
                return b;
            }
            m5704e(aVar);
            this.f4024b.remove(aVar.f4025a);
            ((C1060m) aVar.f4025a).mo5236a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1051a<K, V> aVar = this.f4023a.f4027c; !aVar.equals(this.f4023a); aVar = aVar.f4027c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f4025a);
            sb.append(':');
            sb.append(aVar.mo5259c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
