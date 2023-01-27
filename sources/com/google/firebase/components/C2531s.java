package com.google.firebase.components;

import p148g.p189d.p281b.p286i.C5200a;

/* renamed from: com.google.firebase.components.s */
public class C2531s<T> implements C5200a<T> {

    /* renamed from: c */
    private static final Object f8216c = new Object();

    /* renamed from: a */
    private volatile Object f8217a = f8216c;

    /* renamed from: b */
    private volatile C5200a<T> f8218b;

    public C2531s(C5200a<T> aVar) {
        this.f8218b = aVar;
    }

    public T get() {
        T t = this.f8217a;
        if (t == f8216c) {
            synchronized (this) {
                t = this.f8217a;
                if (t == f8216c) {
                    t = this.f8218b.get();
                    this.f8217a = t;
                    this.f8218b = null;
                }
            }
        }
        return t;
    }
}
