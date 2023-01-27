package com.bumptech.glide.load.p014q.p020i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.i.f */
public class C1315f {

    /* renamed from: a */
    private final List<C1316a<?, ?>> f4567a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.q.i.f$a */
    private static final class C1316a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f4568a;

        /* renamed from: b */
        private final Class<R> f4569b;

        /* renamed from: c */
        final C1314e<Z, R> f4570c;

        C1316a(Class<Z> cls, Class<R> cls2, C1314e<Z, R> eVar) {
            this.f4568a = cls;
            this.f4569b = cls2;
            this.f4570c = eVar;
        }

        /* renamed from: a */
        public boolean mo5675a(Class<?> cls, Class<?> cls2) {
            return this.f4568a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4569b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> C1314e<Z, R> mo5672a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1317g.m6559b();
        }
        for (C1316a next : this.f4567a) {
            if (next.mo5675a(cls, cls2)) {
                return next.f4570c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo5673b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1316a<?, ?> a : this.f4567a) {
            if (a.mo5675a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo5674c(Class<Z> cls, Class<R> cls2, C1314e<Z, R> eVar) {
        this.f4567a.add(new C1316a(cls, cls2, eVar));
    }
}
