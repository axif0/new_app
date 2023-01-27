package com.bumptech.glide.load.p012p;

import com.bumptech.glide.C0971h;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p029s.C1401j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.p.r */
public class C1196r {

    /* renamed from: e */
    private static final C1199c f4376e = new C1199c();

    /* renamed from: f */
    private static final C1188n<Object, Object> f4377f = new C1197a();

    /* renamed from: a */
    private final List<C1198b<?, ?>> f4378a;

    /* renamed from: b */
    private final C1199c f4379b;

    /* renamed from: c */
    private final Set<C1198b<?, ?>> f4380c;

    /* renamed from: d */
    private final C3346e<List<Throwable>> f4381d;

    /* renamed from: com.bumptech.glide.load.p.r$a */
    private static class C1197a implements C1188n<Object, Object> {
        C1197a() {
        }

        /* renamed from: a */
        public C1188n.C1189a<Object> mo5453a(Object obj, int i, int i2, C1002i iVar) {
            return null;
        }

        /* renamed from: b */
        public boolean mo5454b(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.r$b */
    private static class C1198b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f4382a;

        /* renamed from: b */
        final Class<Data> f4383b;

        /* renamed from: c */
        final C1190o<? extends Model, ? extends Data> f4384c;

        public C1198b(Class<Model> cls, Class<Data> cls2, C1190o<? extends Model, ? extends Data> oVar) {
            this.f4382a = cls;
            this.f4383b = cls2;
            this.f4384c = oVar;
        }

        /* renamed from: a */
        public boolean mo5515a(Class<?> cls) {
            return this.f4382a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo5516b(Class<?> cls, Class<?> cls2) {
            return mo5515a(cls) && this.f4383b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.r$c */
    static class C1199c {
        C1199c() {
        }

        /* renamed from: a */
        public <Model, Data> C1194q<Model, Data> mo5517a(List<C1188n<Model, Data>> list, C3346e<List<Throwable>> eVar) {
            return new C1194q<>(list, eVar);
        }
    }

    public C1196r(C3346e<List<Throwable>> eVar) {
        this(eVar, f4376e);
    }

    C1196r(C3346e<List<Throwable>> eVar, C1199c cVar) {
        this.f4378a = new ArrayList();
        this.f4380c = new HashSet();
        this.f4381d = eVar;
        this.f4379b = cVar;
    }

    /* renamed from: a */
    private <Model, Data> void m6169a(Class<Model> cls, Class<Data> cls2, C1190o<? extends Model, ? extends Data> oVar, boolean z) {
        C1198b bVar = new C1198b(cls, cls2, oVar);
        List<C1198b<?, ?>> list = this.f4378a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: c */
    private <Model, Data> C1188n<Model, Data> m6170c(C1198b<?, ?> bVar) {
        C1188n<? extends Model, ? extends Data> b = bVar.f4384c.mo5458b(this);
        C1401j.m6972d(b);
        return b;
    }

    /* renamed from: f */
    private static <Model, Data> C1188n<Model, Data> m6171f() {
        return f4377f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo5511b(Class<Model> cls, Class<Data> cls2, C1190o<? extends Model, ? extends Data> oVar) {
        m6169a(cls, cls2, oVar, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> C1188n<Model, Data> mo5512d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1198b next : this.f4378a) {
                if (this.f4380c.contains(next)) {
                    z = true;
                } else if (next.mo5516b(cls, cls2)) {
                    this.f4380c.add(next);
                    arrayList.add(m6170c(next));
                    this.f4380c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f4379b.mo5517a(arrayList, this.f4381d);
            } else if (arrayList.size() == 1) {
                return (C1188n) arrayList.get(0);
            } else if (z) {
                return m6171f();
            } else {
                throw new C0971h.C0974c(cls, cls2);
            }
        } catch (Throwable th) {
            this.f4380c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <Model> List<C1188n<Model, ?>> mo5513e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1198b next : this.f4378a) {
                if (!this.f4380c.contains(next)) {
                    if (next.mo5515a(cls)) {
                        this.f4380c.add(next);
                        arrayList.add(m6170c(next));
                        this.f4380c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f4380c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> mo5514g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1198b next : this.f4378a) {
            if (!arrayList.contains(next.f4383b) && next.mo5515a(cls)) {
                arrayList.add(next.f4383b);
            }
        }
        return arrayList;
    }
}
