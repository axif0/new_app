package com.bumptech.glide.load.p008o.p009a0;

import android.util.Log;
import com.bumptech.glide.p029s.C1401j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.o.a0.j */
public final class C1053j implements C1042b {

    /* renamed from: a */
    private final C1050h<C1054a, Object> f4029a = new C1050h<>();

    /* renamed from: b */
    private final C1055b f4030b = new C1055b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f4031c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C1041a<?>> f4032d = new HashMap();

    /* renamed from: e */
    private final int f4033e;

    /* renamed from: f */
    private int f4034f;

    /* renamed from: com.bumptech.glide.load.o.a0.j$a */
    private static final class C1054a implements C1060m {

        /* renamed from: a */
        private final C1055b f4035a;

        /* renamed from: b */
        int f4036b;

        /* renamed from: c */
        private Class<?> f4037c;

        C1054a(C1055b bVar) {
            this.f4035a = bVar;
        }

        /* renamed from: a */
        public void mo5236a() {
            this.f4035a.mo5245c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5262b(int i, Class<?> cls) {
            this.f4036b = i;
            this.f4037c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1054a)) {
                return false;
            }
            C1054a aVar = (C1054a) obj;
            return this.f4036b == aVar.f4036b && this.f4037c == aVar.f4037c;
        }

        public int hashCode() {
            int i = this.f4036b * 31;
            Class<?> cls = this.f4037c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f4036b + "array=" + this.f4037c + '}';
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.j$b */
    private static final class C1055b extends C1046d<C1054a> {
        C1055b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1054a mo5241a() {
            return new C1054a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1054a mo5267e(int i, Class<?> cls) {
            C1054a aVar = (C1054a) mo5244b();
            aVar.mo5262b(i, cls);
            return aVar;
        }
    }

    public C1053j(int i) {
        this.f4033e = i;
    }

    /* renamed from: f */
    private void m5717f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m = m5724m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                m.remove(valueOf);
            } else {
                m.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
    }

    /* renamed from: g */
    private void m5718g() {
        m5719h(this.f4033e);
    }

    /* renamed from: h */
    private void m5719h(int i) {
        while (this.f4034f > i) {
            Object f = this.f4029a.mo5255f();
            C1401j.m6972d(f);
            C1041a i2 = m5720i(f);
            this.f4034f -= i2.mo5221b(f) * i2.mo5222c();
            m5717f(i2.mo5221b(f), f.getClass());
            if (Log.isLoggable(i2.mo5220a(), 2)) {
                Log.v(i2.mo5220a(), "evicted: " + i2.mo5221b(f));
            }
        }
    }

    /* renamed from: i */
    private <T> C1041a<T> m5720i(T t) {
        return m5721j(t.getClass());
    }

    /* renamed from: j */
    private <T> C1041a<T> m5721j(Class<T> cls) {
        C1041a<T> aVar = this.f4032d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C1052i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C1049g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f4032d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: k */
    private <T> T m5722k(C1054a aVar) {
        return this.f4029a.mo5253a(aVar);
    }

    /* renamed from: l */
    private <T> T m5723l(C1054a aVar, Class<T> cls) {
        C1041a<T> j = m5721j(cls);
        T k = m5722k(aVar);
        if (k != null) {
            this.f4034f -= j.mo5221b(k) * j.mo5222c();
            m5717f(j.mo5221b(k), cls);
        }
        if (k != null) {
            return k;
        }
        if (Log.isLoggable(j.mo5220a(), 2)) {
            Log.v(j.mo5220a(), "Allocated " + aVar.f4036b + " bytes");
        }
        return j.newArray(aVar.f4036b);
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m5724m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f4031c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4031c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m5725n() {
        int i = this.f4034f;
        return i == 0 || this.f4033e / i >= 2;
    }

    /* renamed from: o */
    private boolean m5726o(int i) {
        return i <= this.f4033e / 2;
    }

    /* renamed from: p */
    private boolean m5727p(int i, Integer num) {
        return num != null && (m5725n() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo5224a(int i) {
        if (i >= 40) {
            try {
                mo5225b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m5719h(this.f4033e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo5225b() {
        m5719h(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo5226c(int i, Class<T> cls) {
        return m5723l(this.f4030b.mo5267e(i, cls), cls);
    }

    /* renamed from: d */
    public synchronized <T> void mo5227d(T t) {
        Class<?> cls = t.getClass();
        C1041a<?> j = m5721j(cls);
        int b = j.mo5221b(t);
        int c = j.mo5222c() * b;
        if (m5726o(c)) {
            C1054a e = this.f4030b.mo5267e(b, cls);
            this.f4029a.mo5254d(e, t);
            NavigableMap<Integer, Integer> m = m5724m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e.f4036b));
            Integer valueOf = Integer.valueOf(e.f4036b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f4034f += c;
            m5718g();
        }
    }

    /* renamed from: e */
    public synchronized <T> T mo5228e(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m5724m(cls).ceilingKey(Integer.valueOf(i));
        return m5723l(m5727p(i, ceilingKey) ? this.f4030b.mo5267e(ceilingKey.intValue(), cls) : this.f4030b.mo5267e(i, cls), cls);
    }
}
