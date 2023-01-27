package com.bumptech.glide.p024p;

import com.bumptech.glide.load.C1004k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.p.e */
public class C1355e {

    /* renamed from: a */
    private final List<String> f4664a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C1356a<?, ?>>> f4665b = new HashMap();

    /* renamed from: com.bumptech.glide.p.e$a */
    private static class C1356a<T, R> {

        /* renamed from: a */
        private final Class<T> f4666a;

        /* renamed from: b */
        final Class<R> f4667b;

        /* renamed from: c */
        final C1004k<T, R> f4668c;

        public C1356a(Class<T> cls, Class<R> cls2, C1004k<T, R> kVar) {
            this.f4666a = cls;
            this.f4667b = cls2;
            this.f4668c = kVar;
        }

        /* renamed from: a */
        public boolean mo5763a(Class<?> cls, Class<?> cls2) {
            return this.f4666a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4667b);
        }
    }

    /* renamed from: c */
    private synchronized List<C1356a<?, ?>> m6723c(String str) {
        List<C1356a<?, ?>> list;
        if (!this.f4664a.contains(str)) {
            this.f4664a.add(str);
        }
        list = this.f4665b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f4665b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo5759a(String str, C1004k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        m6723c(str).add(new C1356a(cls, cls2, kVar));
    }

    /* renamed from: b */
    public synchronized <T, R> List<C1004k<T, R>> mo5760b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f4664a) {
            List<C1356a> list = this.f4665b.get(str);
            if (list != null) {
                for (C1356a aVar : list) {
                    if (aVar.mo5763a(cls, cls2)) {
                        arrayList.add(aVar.f4668c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo5761d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f4664a) {
            List<C1356a> list = this.f4665b.get(str);
            if (list != null) {
                for (C1356a aVar : list) {
                    if (aVar.mo5763a(cls, cls2) && !arrayList.contains(aVar.f4667b)) {
                        arrayList.add(aVar.f4667b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo5762e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f4664a);
        this.f4664a.clear();
        this.f4664a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f4664a.add(str);
            }
        }
    }
}
